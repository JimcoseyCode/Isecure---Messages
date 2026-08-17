import React, { useState, useCallback } from 'react';
import {
  View, Text, FlatList, TouchableOpacity, StyleSheet, Alert,
} from 'react-native';
import { SafeAreaView } from 'react-native-safe-area-context';
import { useRouter } from 'expo-router';
import { Ionicons } from '@expo/vector-icons';
import { useFocusEffect } from 'expo-router';
import { Colors } from '@/constants/colors';
import { Avatar } from '@/components/ui/Avatar';
import { getBlockedContacts, unblockContact, Contact } from '@/lib/database/db';

export default function BlockedContactsScreen() {
  const router = useRouter();
  const [contacts, setContacts] = useState<Contact[]>([]);

  const load = useCallback(async () => {
    setContacts(await getBlockedContacts());
  }, []);

  useFocusEffect(useCallback(() => { load(); }, []));

  function handleUnblock(contact: Contact) {
    Alert.alert('Débloquer', `Débloquer ${contact.name} ?`, [
      { text: 'Annuler', style: 'cancel' },
      { text: 'Débloquer', onPress: async () => { await unblockContact(contact.id); load(); } },
    ]);
  }

  return (
    <SafeAreaView style={styles.container}>
      <View style={styles.header}>
        <TouchableOpacity onPress={() => router.back()}>
          <Ionicons name="arrow-back" size={22} color={Colors.textPrimary} />
        </TouchableOpacity>
        <Text style={styles.title}>Contacts bloqués</Text>
      </View>

      {contacts.length === 0 ? (
        <View style={styles.empty}>
          <Ionicons name="ban-outline" size={60} color={Colors.textMuted} />
          <Text style={styles.emptyText}>Aucun contact bloqué</Text>
        </View>
      ) : (
        <FlatList
          data={contacts}
          keyExtractor={(c) => String(c.id)}
          renderItem={({ item }) => (
            <View style={styles.row}>
              <Avatar name={item.name} size={44} filled={false} />
              <View style={styles.info}>
                <Text style={styles.name}>{item.name}</Text>
                <Text style={styles.phone}>{item.phone}</Text>
              </View>
              <TouchableOpacity style={styles.unblockBtn} onPress={() => handleUnblock(item)}>
                <Text style={styles.unblockText}>Débloquer</Text>
              </TouchableOpacity>
            </View>
          )}
          ItemSeparatorComponent={() => <View style={styles.separator} />}
        />
      )}
    </SafeAreaView>
  );
}

const styles = StyleSheet.create({
  container: { flex: 1, backgroundColor: Colors.background },
  header: {
    flexDirection: 'row', alignItems: 'center', gap: 14,
    paddingHorizontal: 16, paddingVertical: 14,
    borderBottomWidth: 1, borderBottomColor: Colors.separator,
  },
  title: { fontSize: 18, fontFamily: 'Roboto-Bold', color: Colors.textPrimary },
  empty: { flex: 1, alignItems: 'center', justifyContent: 'center', gap: 12 },
  emptyText: { fontSize: 16, color: Colors.textMuted, fontFamily: 'Roboto-Regular' },
  row: {
    flexDirection: 'row', alignItems: 'center',
    paddingHorizontal: 16, paddingVertical: 12, gap: 14,
  },
  info: { flex: 1 },
  name: { fontSize: 15, fontFamily: 'Roboto-Bold', color: Colors.textPrimary },
  phone: { fontSize: 13, color: Colors.textSecondary, fontFamily: 'Roboto-Regular' },
  unblockBtn: {
    borderWidth: 1.5, borderColor: Colors.primary, borderRadius: 20,
    paddingHorizontal: 14, paddingVertical: 6,
  },
  unblockText: { color: Colors.primary, fontFamily: 'Roboto-Medium', fontSize: 13 },
  separator: { height: 1, backgroundColor: Colors.separator, marginLeft: 74 },
});
