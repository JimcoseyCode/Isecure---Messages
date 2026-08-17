import React, { useState, useCallback } from 'react';
import {
  View, Text, TouchableOpacity, StyleSheet, Alert, ScrollView, Share,
} from 'react-native';
import { SafeAreaView } from 'react-native-safe-area-context';
import { useLocalSearchParams, useRouter, useFocusEffect } from 'expo-router';
import { Ionicons } from '@expo/vector-icons';
import { Colors } from '@/constants/colors';
import { S } from '@/constants/strings';
import { Avatar } from '@/components/ui/Avatar';
import { getContact, Contact, deleteContact, blockContact } from '@/lib/database/db';
import { GlassBackground, GlassView } from '@/components/ui/Glass';

export default function ContactDetailScreen() {
  const { id } = useLocalSearchParams<{ id: string }>();
  const router = useRouter();
  const [contact, setContact] = useState<Contact | null>(null);
  const contactId = parseInt(id ?? '0');

  const load = useCallback(async () => {
    setContact(await getContact(contactId));
  }, [contactId]);

  useFocusEffect(useCallback(() => { load(); }, []));

  async function handleShare() {
    if (!contact) return;
    await Share.share({ message: `Nom : ${contact.name}\nTéléphone : ${contact.phone}` });
  }

  async function handleBlock() {
    if (!contact) return;
    Alert.alert('Bloquer', `Bloquer ${contact.name} ?`, [
      { text: S.cancel, style: 'cancel' },
      { text: S.block, style: 'destructive', onPress: async () => { await blockContact(contactId); router.back(); } },
    ]);
  }

  async function handleDelete() {
    Alert.alert(S.delete, `Supprimer ${contact?.name} et toutes ses conversations ?`, [
      { text: S.cancel, style: 'cancel' },
      { text: S.delete, style: 'destructive', onPress: async () => { await deleteContact(contactId); router.back(); } },
    ]);
  }

  if (!contact) return null;
  const hasKey = !!contact.key_hex;
  const poolCount = contact.key_pool ? (() => { try { return JSON.parse(contact.key_pool).length; } catch { return 0; } })() : 0;

  const actions = [
    { icon: 'share-social-outline', label: S.shareContact, onPress: handleShare },
    { icon: 'create-outline', label: S.modify, onPress: () => router.push({ pathname: '/modals/add-contact', params: { contactId: String(contactId) } }) },
    { icon: 'shield-half-outline', label: hasKey ? 'Ré-apparier (SMS)' : 'Apparier (SMS)', onPress: () => router.push({ pathname: '/modals/pairing', params: { contactId: String(contactId) } }), accent: true },
    { icon: 'qr-code-outline', label: 'Clé par QR / coller', onPress: () => router.push({ pathname: '/modals/key-share', params: { contactId: String(contactId) } }), accent: true },
    { icon: 'lock-closed-outline', label: S.ovConversation, onPress: () => router.push(`/tabs/discussions/${contactId}`) },
    { icon: 'ban-outline', label: S.block, onPress: handleBlock, danger: true },
    { icon: 'trash-outline', label: S.delete, onPress: handleDelete, danger: true },
  ];

  return (
    <SafeAreaView style={styles.container}>
      <GlassBackground />
      <TouchableOpacity style={styles.backBtn} onPress={() => router.back()}>
        <Ionicons name="arrow-back" size={22} color={Colors.textPrimary} />
        <Text style={styles.backLabel}>{S.contacts}</Text>
      </TouchableOpacity>

      <ScrollView contentContainerStyle={{ paddingBottom: 40 }}>
        <View style={styles.glassContainer}>
          <GlassView style={styles.glassCard} intensity={70}>
            <Text style={styles.cardTitle}>{S.contactCard}</Text>
            <Avatar name={contact.name} size={72} filled={hasKey} />
            <Text style={styles.name}>{contact.name}</Text>
            <Text style={styles.phone}>{contact.phone}</Text>

            <View style={styles.quickActions}>
              <TouchableOpacity style={[styles.quickBtn, { backgroundColor: Colors.primary }]} onPress={() => router.push(`/tabs/discussions/${contact.id}`)}>
                <Ionicons name="chatbubble-ellipses" size={22} color={Colors.textWhite} />
              </TouchableOpacity>
              <TouchableOpacity style={[styles.quickBtn, { backgroundColor: Colors.phoneIconBg }]}>
                <Ionicons name="call" size={22} color={Colors.textWhite} />
              </TouchableOpacity>
            </View>

            <View style={[styles.keyStatus, { backgroundColor: hasKey ? Colors.success + '18' : Colors.error + '18' }]}>
              <Ionicons name={hasKey ? 'lock-closed' : 'lock-open-outline'} size={16} color={hasKey ? Colors.success : Colors.error} />
              <Text style={[styles.keyStatusText, { color: hasKey ? Colors.success : Colors.error }]}>
                {hasKey ? `Chiffrement actif — pool : ${poolCount} clés` : 'Aucune clé de chiffrement'}
              </Text>
            </View>

            <View style={styles.actionsContainer}>
              {actions.map((a, i) => (
                <TouchableOpacity key={a.label} style={[styles.actionRow, i === 0 && styles.firstActionRow]} onPress={a.onPress} activeOpacity={0.7}>
                  <Ionicons name={a.icon as any} size={22} color={a.danger ? Colors.error : a.accent ? Colors.encryptedBubble : Colors.primary} style={styles.actionIcon} />
                  <Text style={[styles.actionLabel, a.danger && { color: Colors.error }, a.accent && { color: Colors.encryptedBubble }]}>{a.label}</Text>
                </TouchableOpacity>
              ))}
            </View>
          </GlassView>
        </View>
      </ScrollView>
    </SafeAreaView>
  );
}

const styles = StyleSheet.create({
  container: { flex: 1, backgroundColor: 'transparent' },
  backBtn: { flexDirection: 'row', alignItems: 'center', paddingHorizontal: 16, paddingVertical: 12, gap: 6 },
  backLabel: { fontSize: 16, color: Colors.textPrimary, fontFamily: 'Roboto-Regular' },
  glassContainer: { padding: 16 },
  glassCard: { padding: 24, alignItems: 'center' },
  cardTitle: { fontSize: 18, fontFamily: 'Roboto-Bold', color: Colors.textPrimary, alignSelf: 'flex-start', marginBottom: 20 },
  name: { fontSize: 20, fontFamily: 'Roboto-Bold', color: Colors.textPrimary, marginTop: 12 },
  phone: { fontSize: 15, color: Colors.textSecondary, fontFamily: 'Roboto-Regular', marginTop: 4, marginBottom: 16 },
  quickActions: { flexDirection: 'row', gap: 16, marginBottom: 16 },
  quickBtn: { width: 48, height: 48, borderRadius: 24, alignItems: 'center', justifyContent: 'center', shadowColor: '#000', shadowOffset: { width: 0, height: 2 }, shadowOpacity: 0.1, shadowRadius: 4, elevation: 2 },
  keyStatus: { flexDirection: 'row', alignItems: 'center', gap: 8, borderRadius: 20, paddingHorizontal: 14, paddingVertical: 8, marginBottom: 24 },
  keyStatusText: { fontSize: 13, fontFamily: 'Roboto-Medium' },
  actionsContainer: { width: '100%', marginTop: 8 },
  actionRow: { flexDirection: 'row', alignItems: 'center', width: '100%', paddingVertical: 14, borderTopWidth: StyleSheet.hairlineWidth, borderTopColor: 'rgba(0,0,0,0.1)' },
  firstActionRow: { borderTopWidth: 0 },
  actionIcon: { marginRight: 16 },
  actionLabel: { fontSize: 16, fontFamily: 'Roboto-Regular', color: Colors.textPrimary },
});
