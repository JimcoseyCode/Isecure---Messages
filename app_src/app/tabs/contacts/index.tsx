import React, { useState, useCallback } from 'react';
import {
  View, Text, FlatList, TouchableOpacity, StyleSheet, Alert, ActivityIndicator,
} from 'react-native';
import { SafeAreaView } from 'react-native-safe-area-context';
import { useRouter, useFocusEffect } from 'expo-router';
import { Ionicons } from '@expo/vector-icons';
import * as Contacts from 'expo-contacts/legacy';
import { Colors } from '@/constants/colors';
import { SearchBar } from '@/components/ui/SearchBar';
import { Avatar } from '@/components/ui/Avatar';
import { GlassBackground } from '@/components/ui/Glass';
import { getContacts, getContactByPhone, insertContact, Contact } from '@/lib/database/db';

export default function ContactsScreen() {
  const router = useRouter();
  const [contacts, setContacts] = useState<Contact[]>([]);
  const [search, setSearch] = useState('');
  const [importing, setImporting] = useState(false);

  const load = useCallback(async () => {
    setContacts(await getContacts());
  }, []);

  useFocusEffect(useCallback(() => { load(); }, []));

  // Import every phone contact from the device (skips ones already present).
  const importDevice = useCallback(async () => {
    setImporting(true);
    try {
      const { status } = await Contacts.requestPermissionsAsync();
      if (status !== 'granted') { Alert.alert('Permission requise', 'Autorisez l’accès aux contacts pour les importer.'); return; }
      const { data } = await Contacts.getContactsAsync({
        fields: [Contacts.Fields.Name, Contacts.Fields.FirstName, Contacts.Fields.LastName, Contacts.Fields.PhoneNumbers],
      });
      let added = 0, skipped = 0;
      for (const c of data) {
        const phone = c.phoneNumbers?.[0]?.number?.replace(/[^\d+]/g, '');
        const name = (c.name || [c.firstName, c.lastName].filter(Boolean).join(' ') || phone || '').trim();
        if (!phone || !name) { skipped++; continue; }
        if (await getContactByPhone(phone)) { skipped++; continue; }
        await insertContact({
          name, phone, key_hex: null, key_pool: null, current_key_index: 0,
          is_blocked: 0, is_pinned: 0, ephemeral_duration: 0,
        });
        added++;
      }
      await load();
      Alert.alert('Import terminé',
        added > 0
          ? `${added} contact${added > 1 ? 's' : ''} ajouté${added > 1 ? 's' : ''}${skipped ? ` (${skipped} ignoré${skipped > 1 ? 's' : ''}).` : '.'}`
          : (data.length === 0 ? 'Aucun contact trouvé sur l’appareil.' : 'Tous vos contacts sont déjà importés.'));
    } catch (e: any) {
      Alert.alert('Erreur', e?.message ?? 'Import impossible.');
    } finally { setImporting(false); }
  }, [load]);

  const filtered = contacts.filter(c =>
    c.name.toLowerCase().includes(search.toLowerCase()) || c.phone.includes(search)
  );

  const grouped = filtered.reduce((acc, c) => {
    const letter = c.name[0]?.toUpperCase() ?? '#';
    if (!acc[letter]) acc[letter] = [];
    acc[letter].push(c);
    return acc;
  }, {} as Record<string, Contact[]>);

  const sections = Object.keys(grouped).sort().map(l => ({ letter: l, contacts: grouped[l] }));

  return (
    <SafeAreaView style={styles.container} edges={["top","left","right"]}>
      <GlassBackground />
      <View style={styles.header}>
        <Text style={styles.title}>Contacts</Text>
        <View style={styles.headerActions}>
          <TouchableOpacity style={styles.addBtn} onPress={importDevice} disabled={importing}>
            {importing
              ? <ActivityIndicator size="small" color={Colors.primary} />
              : <Ionicons name="cloud-download-outline" size={21} color={Colors.primary} />}
          </TouchableOpacity>
          <TouchableOpacity style={styles.addBtn} onPress={() => router.push('/modals/add-contact')}>
            <Ionicons name="person-add-outline" size={20} color={Colors.primary} />
          </TouchableOpacity>
        </View>
      </View>

      <SearchBar placeholder="Rechercher un contact…" value={search} onChangeText={setSearch} />

      {filtered.length === 0 ? (
        <View style={styles.empty}>
          <View style={styles.emptyIcon}>
            <Ionicons name="people-outline" size={56} color={Colors.textMuted} />
          </View>
          <Text style={styles.emptyTitle}>Aucun contact</Text>
          <Text style={styles.emptyText}>Ajoutez un contact pour commencer à échanger des messages chiffrés.</Text>
          <TouchableOpacity style={styles.emptyBtn} onPress={() => router.push('/modals/add-contact')}>
            <Text style={styles.emptyBtnText}>Ajouter un contact</Text>
          </TouchableOpacity>
        </View>
      ) : (
        <FlatList
          data={sections}
          keyExtractor={item => item.letter}
          renderItem={({ item: section }) => (
            <View>
              <Text style={styles.sectionLetter}>{section.letter}</Text>
              {section.contacts.map(c => (
                <TouchableOpacity
                  key={c.id}
                  style={styles.contactItem}
                  onPress={() => router.push(`/tabs/contacts/${c.id}`)}
                  activeOpacity={0.7}
                >
                  <Avatar name={c.name} size={48} filled />
                  <View style={styles.contactContent}>
                    <Text style={styles.contactName}>{c.name}</Text>
                    <Text style={styles.contactPhone}>{c.phone}</Text>
                  </View>
                  <View style={styles.statusWrap}>
                    {(c.key_hex || c.key_pool) ? (
                      <View style={styles.keyBadge}>
                        <Ionicons name="lock-closed" size={11} color={Colors.success} />
                        <Text style={styles.keyBadgeText}>Clé active</Text>
                      </View>
                    ) : (
                      <Ionicons name="lock-open-outline" size={18} color={Colors.textMuted} />
                    )}
                  </View>
                </TouchableOpacity>
              ))}
            </View>
          )}
          showsVerticalScrollIndicator={false}
          contentContainerStyle={{ paddingBottom: 110 }}
        />
      )}

      <TouchableOpacity
        style={styles.fab}
        onPress={() => router.push('/modals/add-contact')}
        activeOpacity={0.85}
      >
        <Ionicons name="add" size={26} color="#fff" />
      </TouchableOpacity>
    </SafeAreaView>
  );
}

const styles = StyleSheet.create({
  container: { flex: 1, backgroundColor: 'transparent' },
  header: {
    flexDirection: 'row', alignItems: 'center',
    justifyContent: 'space-between', paddingHorizontal: 20, paddingVertical: 14,
  },
  title: { fontSize: 28, fontFamily: 'Roboto-Bold', color: Colors.textPrimary },
  headerActions: { flexDirection: 'row', alignItems: 'center', gap: 2 },
  addBtn: { padding: 8 },

  sectionLetter: {
    fontSize: 12, fontFamily: 'Roboto-Bold', color: Colors.textMuted,
    letterSpacing: 1, paddingHorizontal: 16, paddingVertical: 6,
    backgroundColor: Colors.background,
  },
  contactItem: {
    flexDirection: 'row', alignItems: 'center',
    paddingHorizontal: 16, paddingVertical: 12,
    borderBottomWidth: 1, borderBottomColor: Colors.separator,
  },
  contactContent: { flex: 1, marginLeft: 14 },
  contactName: { fontSize: 16, fontFamily: 'Roboto-Bold', color: Colors.textPrimary },
  contactPhone: { fontSize: 13, color: Colors.textSecondary, fontFamily: 'Roboto-Regular', marginTop: 2 },
  statusWrap: { alignItems: 'flex-end' },
  keyBadge: {
    flexDirection: 'row', alignItems: 'center', gap: 4,
    backgroundColor: Colors.successBg, borderRadius: 10,
    paddingHorizontal: 8, paddingVertical: 4,
  },
  keyBadgeText: { fontSize: 11, color: Colors.success, fontFamily: 'Roboto-Medium' },

  empty: { flex: 1, alignItems: 'center', justifyContent: 'center', padding: 40 },
  emptyIcon: {
    width: 100, height: 100, borderRadius: 50,
    backgroundColor: Colors.surface,
    alignItems: 'center', justifyContent: 'center', marginBottom: 20,
  },
  emptyTitle: { fontSize: 20, fontFamily: 'Roboto-Bold', color: Colors.textPrimary, marginBottom: 8 },
  emptyText: { fontSize: 14, color: Colors.textSecondary, textAlign: 'center', fontFamily: 'Roboto-Regular', lineHeight: 20 },
  emptyBtn: {
    marginTop: 24, backgroundColor: Colors.primary, borderRadius: 14,
    paddingHorizontal: 28, paddingVertical: 14,
  },
  emptyBtnText: { color: '#fff', fontFamily: 'Roboto-Bold', fontSize: 15 },

  fab: {
    position: 'absolute', bottom: 104, right: 20,
    width: 56, height: 56, borderRadius: 28,
    backgroundColor: Colors.primary,
    alignItems: 'center', justifyContent: 'center',
    shadowColor: Colors.primary, shadowOffset: { width: 0, height: 4 },
    shadowOpacity: 0.45, shadowRadius: 10, elevation: 8,
  },
});
