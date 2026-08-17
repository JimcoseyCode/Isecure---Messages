import React, { useState, useCallback } from 'react';
import {
  View, Text, FlatList, TouchableOpacity, StyleSheet,
  Modal, Pressable, Alert,
} from 'react-native';
import { SafeAreaView } from 'react-native-safe-area-context';
import { useRouter, useFocusEffect } from 'expo-router';
import { Ionicons } from '@expo/vector-icons';
import { Colors } from '@/constants/colors';
import { S } from '@/constants/strings';
import { SearchBar } from '@/components/ui/SearchBar';
import { Avatar } from '@/components/ui/Avatar';
import { GlassBackground } from '@/components/ui/Glass';
import { getContacts, getLastMessage, Contact, Message, deleteMessages, blockContact, setPinned } from '@/lib/database/db';
import { SheetHandle } from '@/components/ui/Motion';
import { BrandMark } from '@/components/ui/BrandMark';
import { LinearGradient } from 'expo-linear-gradient';

interface ConversationItem {
  contact: Contact;
  lastMessage: Message | null;
  unread: number;
}

function formatTime(ts: number): string {
  const now = new Date();
  const date = new Date(ts * 1000);
  const diffDays = Math.floor((now.getTime() - date.getTime()) / 86400000);
  if (diffDays === 0) return date.toLocaleTimeString('fr-FR', { hour: '2-digit', minute: '2-digit' });
  if (diffDays === 1) return 'Hier';
  if (diffDays < 7) return date.toLocaleDateString('fr-FR', { weekday: 'short' });
  return date.toLocaleDateString('fr-FR', { day: '2-digit', month: '2-digit' });
}

function previewContent(msg: Message): string {
  if (!msg) return '';
  if (msg.content.startsWith('OV1|')) return '🔒 Message chiffré';
  return msg.content;
}

export default function DiscussionsScreen() {
  const router = useRouter();
  const [conversations, setConversations] = useState<ConversationItem[]>([]);
  const [search, setSearch] = useState('');
  const [menuVisible, setMenuVisible] = useState(false);
  const [sheet, setSheet] = useState<Contact | null>(null);

  const load = useCallback(async () => {
    const contacts = await getContacts();
    const items: ConversationItem[] = await Promise.all(
      contacts.map(async (contact) => ({
        contact,
        lastMessage: await getLastMessage(contact.id),
        unread: 0,
      }))
    );
    // pinned first, then by last message time
    const withMsg = items.filter(i => i.lastMessage !== null);
    withMsg.sort((a, b) => {
      if (a.contact.is_pinned !== b.contact.is_pinned)
        return b.contact.is_pinned - a.contact.is_pinned;
      const ta = a.lastMessage?.created_at ?? 0;
      const tb = b.lastMessage?.created_at ?? 0;
      return tb - ta;
    });
    setConversations(withMsg);
  }, []);

  useFocusEffect(useCallback(() => { load(); }, []));

  const filtered = conversations.filter(c =>
    c.contact.name.toLowerCase().includes(search.toLowerCase())
  );

  const menuOptions = [
    { icon: 'trash-outline', label: 'Effacer tout', onPress: () => Alert.alert('Effacer', 'Supprimer toutes les discussions ?', [
      { text: 'Annuler', style: 'cancel' },
      { text: 'Effacer', style: 'destructive', onPress: async () => {
        for (const c of conversations) await deleteMessages(c.contact.id);
        await load();
      }},
    ]), danger: true },
  ];

  const renderItem = ({ item }: { item: ConversationItem }) => {
    const isEnc = item.lastMessage?.content.startsWith('OV1|') ?? false;
    return (
      <TouchableOpacity
        style={styles.item}
        onPress={() => router.push(`/tabs/discussions/${item.contact.id}`)}
        onLongPress={() => setSheet(item.contact)}
        delayLongPress={280}
        activeOpacity={0.7}
      >
        <View style={styles.avatarWrap}>
          <Avatar name={item.contact.name} size={52} filled={!!item.contact.key_hex || !!item.contact.key_pool} />
          {item.contact.is_pinned === 1 && (
            <View style={styles.pinBadge}>
              <Ionicons name="pin" size={9} color="#fff" />
            </View>
          )}
        </View>
        <View style={styles.content}>
          <View style={styles.row}>
            <Text style={styles.name} numberOfLines={1}>{item.contact.name}</Text>
            <Text style={styles.time}>{item.lastMessage ? formatTime(item.lastMessage.created_at) : ''}</Text>
          </View>
          <View style={styles.row}>
            <View style={styles.previewRow}>
              {isEnc && <Ionicons name="lock-closed" size={11} color={Colors.purpleIconBg} style={{ marginRight: 4 }} />}
              <Text style={styles.preview} numberOfLines={1}>
                {item.lastMessage ? previewContent(item.lastMessage) : ''}
              </Text>
            </View>
            {(item.contact.key_hex || item.contact.key_pool) && (
              <Ionicons name="shield-checkmark" size={13} color={Colors.primary} />
            )}
          </View>
        </View>
      </TouchableOpacity>
    );
  };

  return (
    <SafeAreaView style={styles.container} edges={["top","left","right"]}>
      <GlassBackground />
      <View style={styles.header}>
        <View style={styles.brandRow}>
          <LinearGradient
            colors={['#4F46E5', '#3B82F6', '#22D3EE']}
            start={{ x: 0, y: 0 }} end={{ x: 1, y: 1 }}
            style={styles.brandMark}
          >
            <BrandMark size={20} stroke="#fff" />
          </LinearGradient>
          <Text style={styles.title}>iSecure</Text>
        </View>
        <View style={styles.headerActions}>
          <TouchableOpacity
            style={styles.headerBtn}
            onPress={() => router.push('/modals/new-message')}
          >
            <Ionicons name="create-outline" size={22} color={Colors.textPrimary} />
          </TouchableOpacity>
          <TouchableOpacity style={styles.headerBtn} onPress={() => setMenuVisible(true)}>
            <Ionicons name="ellipsis-vertical" size={22} color={Colors.textPrimary} />
          </TouchableOpacity>
        </View>
      </View>

      <SearchBar placeholder="Rechercher une conversation…" value={search} onChangeText={setSearch} />

      {/* Quick tools — surfaced from the overflow menu, 1 tap away */}
      <View style={styles.quickRow}>
        {[
          { icon: 'shield-checkmark' as const, label: 'Chiffrer', grad: ['#3B82F6', '#22D3EE'] as [string, string], onPress: () => router.push('/modals/universal-encrypt') },
          { icon: 'document-text' as const, label: 'Notes', grad: ['#6366F1', '#3B82F6'] as [string, string], onPress: () => router.push('/modals/notes') },
          { icon: 'ban' as const, label: 'Bloqués', grad: ['#F43F5E', '#FB7185'] as [string, string], onPress: () => router.push('/tabs/discussions/blocked-contacts') },
        ].map((t) => (
          <TouchableOpacity key={t.label} style={styles.quickTile} onPress={t.onPress} activeOpacity={0.8}>
            <LinearGradient colors={t.grad} start={{ x: 0, y: 0 }} end={{ x: 1, y: 1 }} style={styles.quickIcon}>
              <Ionicons name={t.icon} size={22} color="#fff" />
            </LinearGradient>
            <Text style={styles.quickLabel}>{t.label}</Text>
          </TouchableOpacity>
        ))}
      </View>

      {filtered.length === 0 ? (
        <View style={styles.empty}>
          <View style={styles.emptyIcon}>
            <Ionicons name="chatbubbles-outline" size={56} color={Colors.textMuted} />
          </View>
          <Text style={styles.emptyTitle}>Aucune conversation</Text>
          <Text style={styles.emptyText}>Commencez par ajouter un contact et établir un appairage de clés.</Text>
          <TouchableOpacity style={styles.emptyBtn} onPress={() => router.push('/modals/new-message')}>
            <Text style={styles.emptyBtnText}>Nouveau message</Text>
          </TouchableOpacity>
        </View>
      ) : (
        <FlatList
          data={filtered}
          keyExtractor={item => String(item.contact.id)}
          renderItem={renderItem}
          ItemSeparatorComponent={() => <View style={styles.sep} />}
          showsVerticalScrollIndicator={false}
          contentContainerStyle={{ paddingBottom: 110 }}
        />
      )}

      <TouchableOpacity
        style={styles.fab}
        onPress={() => router.push('/modals/new-message')}
        activeOpacity={0.85}
      >
        <Ionicons name="add" size={26} color="#fff" />
      </TouchableOpacity>

      <Modal visible={menuVisible} transparent animationType="fade" onRequestClose={() => setMenuVisible(false)}>
        <Pressable style={styles.overlay} onPress={() => setMenuVisible(false)}>
          <View style={styles.menu}>
            {menuOptions.map(opt => (
              <TouchableOpacity
                key={opt.label}
                style={styles.menuItem}
                onPress={() => { setMenuVisible(false); opt.onPress(); }}
              >
                <Ionicons name={opt.icon as any} size={19} color={opt.danger ? Colors.error : Colors.textPrimary} />
                <Text style={[styles.menuLabel, opt.danger && { color: Colors.error }]}>{opt.label}</Text>
              </TouchableOpacity>
            ))}
          </View>
        </Pressable>
      </Modal>

      {/* Long-press contact action sheet */}
      <Modal visible={!!sheet} transparent animationType="slide" onRequestClose={() => setSheet(null)}>
        <Pressable style={styles.sheetOverlay} onPress={() => setSheet(null)}>
          <Pressable style={styles.sheet} onPress={() => {}}>
            <SheetHandle />
            {sheet && (
              <>
                <View style={styles.sheetHead}>
                  <Avatar name={sheet.name} size={44} filled={!!sheet.key_hex || !!sheet.key_pool} />
                  <View style={{ flex: 1 }}>
                    <Text style={styles.sheetName} numberOfLines={1}>{sheet.name}</Text>
                    <Text style={styles.sheetPhone} numberOfLines={1}>{sheet.phone}</Text>
                  </View>
                </View>

                <SheetAction icon="chatbubble-outline" label="Ouvrir la discussion"
                  onPress={() => { const id = sheet.id; setSheet(null); router.push(`/tabs/discussions/${id}`); }} />
                <SheetAction icon={sheet.is_pinned ? 'pin' : 'pin-outline'}
                  label={sheet.is_pinned ? 'Désépingler' : 'Épingler'}
                  onPress={async () => { await setPinned(sheet.id, !sheet.is_pinned); setSheet(null); load(); }} />
                <SheetAction icon="ban-outline" label="Bloquer ce contact" danger
                  onPress={() => {
                    const c = sheet; setSheet(null);
                    Alert.alert('Bloquer', `Bloquer ${c.name} ? Ses messages seront masqués.`, [
                      { text: 'Annuler', style: 'cancel' },
                      { text: 'Bloquer', style: 'destructive', onPress: async () => { await blockContact(c.id); load(); } },
                    ]);
                  }} />
                <SheetAction icon="trash-outline" label="Supprimer la discussion" danger
                  onPress={() => {
                    const c = sheet; setSheet(null);
                    Alert.alert('Supprimer', `Effacer tous les messages avec ${c.name} ?`, [
                      { text: 'Annuler', style: 'cancel' },
                      { text: 'Supprimer', style: 'destructive', onPress: async () => { await deleteMessages(c.id); load(); } },
                    ]);
                  }} />
              </>
            )}
          </Pressable>
        </Pressable>
      </Modal>
    </SafeAreaView>
  );
}

function SheetAction({ icon, label, onPress, danger }: { icon: any; label: string; onPress: () => void; danger?: boolean }) {
  return (
    <TouchableOpacity style={styles.sheetAction} onPress={onPress} activeOpacity={0.6}>
      <Ionicons name={icon} size={21} color={danger ? Colors.error : Colors.textPrimary} />
      <Text style={[styles.sheetActionLabel, danger && { color: Colors.error }]}>{label}</Text>
    </TouchableOpacity>
  );
}

const styles = StyleSheet.create({
  container: { flex: 1, backgroundColor: 'transparent' },
  header: {
    flexDirection: 'row', alignItems: 'center', justifyContent: 'space-between',
    paddingHorizontal: 20, paddingVertical: 14,
  },
  title: { fontSize: 26, fontFamily: 'Roboto-Bold', color: Colors.textPrimary },
  brandRow: { flexDirection: 'row', alignItems: 'center', gap: 10 },
  brandMark: {
    width: 36, height: 36, borderRadius: 11, alignItems: 'center', justifyContent: 'center',
    shadowColor: '#22D3EE', shadowOffset: { width: 0, height: 2 }, shadowOpacity: 0.5, shadowRadius: 8, elevation: 6,
  },
  headerActions: { flexDirection: 'row', gap: 4 },

  quickRow: { flexDirection: 'row', gap: 10, paddingHorizontal: 16, paddingTop: 8, paddingBottom: 6 },
  quickTile: {
    flex: 1, alignItems: 'center', gap: 8, paddingVertical: 14,
    backgroundColor: Colors.surface, borderRadius: 18,
    borderWidth: StyleSheet.hairlineWidth, borderColor: Colors.border,
  },
  quickIcon: {
    width: 46, height: 46, borderRadius: 15, alignItems: 'center', justifyContent: 'center',
    shadowColor: '#3B82F6', shadowOffset: { width: 0, height: 3 }, shadowOpacity: 0.35, shadowRadius: 7, elevation: 5,
  },
  quickLabel: { fontSize: 12.5, fontFamily: 'Roboto-Medium', color: Colors.textPrimary },
  headerBtn: { padding: 8 },

  item: { flexDirection: 'row', alignItems: 'center', paddingHorizontal: 16, paddingVertical: 12 },
  avatarWrap: { position: 'relative', marginRight: 14 },
  pinBadge: {
    position: 'absolute', bottom: 0, right: -2,
    backgroundColor: Colors.primary, borderRadius: 8,
    width: 16, height: 16, alignItems: 'center', justifyContent: 'center',
  },
  content: { flex: 1 },
  row: { flexDirection: 'row', justifyContent: 'space-between', alignItems: 'center' },
  name: { fontSize: 16, fontFamily: 'Roboto-Bold', color: Colors.textPrimary, flex: 1, marginRight: 8 },
  time: { fontSize: 12, color: Colors.textMuted, fontFamily: 'Roboto-Regular' },
  previewRow: { flexDirection: 'row', alignItems: 'center', flex: 1, marginRight: 6, marginTop: 3 },
  preview: { fontSize: 14, color: Colors.textSecondary, fontFamily: 'Roboto-Regular', flex: 1 },
  sep: { height: 1, backgroundColor: Colors.separator, marginLeft: 82 },

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

  overlay: { flex: 1, backgroundColor: Colors.overlayBg },
  menu: {
    position: 'absolute', top: 74, right: 12,
    backgroundColor: Colors.surfaceElevated,
    borderRadius: 14, minWidth: 230,
    borderWidth: 1, borderColor: Colors.border,
    shadowColor: '#000', shadowOffset: { width: 0, height: 6 }, shadowOpacity: 0.4, shadowRadius: 16,
    elevation: 12,
  },
  menuItem: { flexDirection: 'row', alignItems: 'center', paddingHorizontal: 16, paddingVertical: 14, gap: 12 },
  menuLabel: { fontSize: 15, fontFamily: 'Roboto-Regular', color: Colors.textPrimary },

  sheetOverlay: { flex: 1, backgroundColor: Colors.overlayBg, justifyContent: 'flex-end' },
  sheet: {
    backgroundColor: Colors.surfaceElevated,
    borderTopLeftRadius: 24, borderTopRightRadius: 24,
    paddingHorizontal: 12, paddingBottom: 34, paddingTop: 6,
  },
  sheetHead: {
    flexDirection: 'row', alignItems: 'center', gap: 12,
    paddingHorizontal: 12, paddingVertical: 12, marginBottom: 4,
    borderBottomWidth: StyleSheet.hairlineWidth, borderBottomColor: Colors.separator,
  },
  sheetName: { fontSize: 17, fontFamily: 'Roboto-Bold', color: Colors.textPrimary },
  sheetPhone: { fontSize: 13, fontFamily: 'Roboto-Regular', color: Colors.textSecondary, marginTop: 2 },
  sheetAction: { flexDirection: 'row', alignItems: 'center', gap: 14, paddingHorizontal: 12, paddingVertical: 15 },
  sheetActionLabel: { fontSize: 16, fontFamily: 'Roboto-Medium', color: Colors.textPrimary },
});
