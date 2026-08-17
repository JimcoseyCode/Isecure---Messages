import React, { useState, useEffect } from 'react';
import {
  View, Text, FlatList, TouchableOpacity, StyleSheet, TextInput, Modal, Pressable,
} from 'react-native';
import { SafeAreaView } from 'react-native-safe-area-context';
import { useRouter } from 'expo-router';
import { Ionicons } from '@expo/vector-icons';
import { Colors } from '@/constants/colors';
import { S } from '@/constants/strings';
import { getNotes, insertNote, deleteNote, Note } from '@/lib/database/db';
import { FadeSlideIn, SheetHandle } from '@/components/ui/Motion';
import * as SecureStore from 'expo-secure-store';
import { OvCore } from '@/lib/native/ovcore';

// Notes are encrypted at rest with AES-256-GCM (Rust core) under a device key
// kept in the OS keystore. Same guarantee as OV Message's "notes chiffrées".
async function getNotesKey(): Promise<string> {
  let key = await SecureStore.getItemAsync('notes_key');
  if (!key) {
    key = await OvCore.randomKeyHex();
    await SecureStore.setItemAsync('notes_key', key);
  }
  return key;
}

export default function NotesModal() {
  const router = useRouter();
  const [notes, setNotes] = useState<Note[]>([]);
  const [plain, setPlain] = useState<Record<number, string>>({});
  const [newNoteVisible, setNewNoteVisible] = useState(false);
  const [noteText, setNoteText] = useState('');

  async function load() {
    const all = await getNotes();
    setNotes(all);
    const key = await getNotesKey();
    const map: Record<number, string> = {};
    for (const n of all) {
      if (n.is_encrypted && n.content.startsWith('OV1|')) {
        try { map[n.id] = await OvCore.openMessage(key, n.content); }
        catch { map[n.id] = '⚠ Déchiffrement impossible'; }
      } else {
        map[n.id] = n.content;
      }
    }
    setPlain(map);
  }

  useEffect(() => { load(); }, []);

  async function handleSave() {
    if (!noteText.trim()) return;
    const key = await getNotesKey();
    const cipher = await OvCore.sealMessage(key, 0, noteText.trim());
    await insertNote({ content: cipher, title: null, encrypted_content: cipher, is_encrypted: 1 });
    setNoteText('');
    setNewNoteVisible(false);
    load();
  }

  return (
    <SafeAreaView style={styles.container}>
      <View style={styles.header}>
        <TouchableOpacity onPress={() => router.back()}>
          <Ionicons name="arrow-back" size={22} color={Colors.textPrimary} />
        </TouchableOpacity>
        <Text style={styles.title}>{S.notesTitle}</Text>
        <TouchableOpacity onPress={() => setNewNoteVisible(true)}>
          <Ionicons name="add" size={26} color={Colors.primary} />
        </TouchableOpacity>
      </View>

      {notes.length === 0 ? (
        <FadeSlideIn style={styles.empty}>
          <View style={styles.emptyIcon}>
            <Ionicons name="lock-closed" size={40} color={Colors.primary} />
          </View>
          <Text style={styles.emptyTitle}>Notes chiffrées</Text>
          <Text style={styles.emptyText}>
            Vos notes sont chiffrées en AES-256 et ne quittent jamais cet appareil.
          </Text>
          <TouchableOpacity style={styles.emptyBtn} onPress={() => setNewNoteVisible(true)} activeOpacity={0.85}>
            <Ionicons name="add" size={20} color="#fff" />
            <Text style={styles.emptyBtnText}>{S.newNote}</Text>
          </TouchableOpacity>
        </FadeSlideIn>
      ) : (
        <FadeSlideIn style={{ flex: 1 }}>
        <FlatList
          data={notes}
          keyExtractor={(item) => String(item.id)}
          renderItem={({ item }) => (
            <View style={styles.noteCard}>
              <View style={styles.noteBody}>
                <View style={styles.noteMeta}>
                  <Ionicons name="lock-closed" size={12} color={Colors.success} />
                  <Text style={styles.noteMetaText}>Chiffrée · AES-256</Text>
                </View>
                <Text style={styles.noteContent} numberOfLines={4}>{plain[item.id] ?? '…'}</Text>
              </View>
              <TouchableOpacity
                style={styles.noteDelete}
                hitSlop={{ top: 8, bottom: 8, left: 8, right: 8 }}
                onPress={async () => { await deleteNote(item.id); load(); }}
              >
                <Ionicons name="trash-outline" size={19} color={Colors.error} />
              </TouchableOpacity>
            </View>
          )}
          contentContainerStyle={{ padding: 16, gap: 12, paddingBottom: 32 }}
          showsVerticalScrollIndicator={false}
        />
        </FadeSlideIn>
      )}

      <Modal visible={newNoteVisible} transparent animationType="slide">
        <Pressable style={styles.overlay} onPress={() => setNewNoteVisible(false)}>
          <View style={styles.modal}>
            <SheetHandle />
            <Text style={styles.modalTitle}>{S.newNote}</Text>
            <TextInput
              style={styles.modalInput}
              multiline
              placeholder="Écrivez votre note..."
              placeholderTextColor={Colors.textMuted}
              value={noteText}
              onChangeText={setNoteText}
              autoFocus
            />
            <TouchableOpacity style={styles.saveBtn} onPress={handleSave}>
              <Text style={styles.saveBtnText}>{S.save}</Text>
            </TouchableOpacity>
          </View>
        </Pressable>
      </Modal>
    </SafeAreaView>
  );
}

const styles = StyleSheet.create({
  container: { flex: 1, backgroundColor: Colors.background },
  header: {
    flexDirection: 'row', alignItems: 'center', justifyContent: 'space-between',
    paddingHorizontal: 16, paddingVertical: 14,
    borderBottomWidth: 1, borderBottomColor: Colors.separator,
  },
  title: { fontSize: 18, fontFamily: 'Roboto-Bold', color: Colors.textPrimary },
  empty: { flex: 1, alignItems: 'center', justifyContent: 'center', gap: 10, padding: 40 },
  emptyIcon: {
    width: 88, height: 88, borderRadius: 44, backgroundColor: Colors.primary + '15',
    alignItems: 'center', justifyContent: 'center', marginBottom: 8,
  },
  emptyTitle: { fontSize: 20, fontFamily: 'Roboto-Bold', color: Colors.textPrimary },
  emptyText: { fontSize: 14, color: Colors.textSecondary, fontFamily: 'Roboto-Regular', textAlign: 'center', lineHeight: 20 },
  emptyBtn: {
    flexDirection: 'row', alignItems: 'center', gap: 8, marginTop: 18,
    backgroundColor: Colors.primary, borderRadius: 14, paddingHorizontal: 24, paddingVertical: 14,
  },
  emptyBtnText: { color: '#fff', fontFamily: 'Roboto-Bold', fontSize: 15 },
  noteCard: {
    backgroundColor: Colors.backgroundSecondary, borderRadius: 14,
    padding: 16, flexDirection: 'row', alignItems: 'flex-start', gap: 12,
    borderWidth: StyleSheet.hairlineWidth, borderColor: Colors.border,
  },
  noteBody: { flex: 1, gap: 8 },
  noteMeta: { flexDirection: 'row', alignItems: 'center', gap: 5 },
  noteMetaText: { fontSize: 11, fontFamily: 'Roboto-Medium', color: Colors.success, letterSpacing: 0.2 },
  noteContent: { fontSize: 14, color: Colors.textPrimary, fontFamily: 'Roboto-Regular', lineHeight: 20 },
  noteDelete: { padding: 2 },
  overlay: { flex: 1, backgroundColor: Colors.overlayBg, justifyContent: 'flex-end' },
  modal: {
    backgroundColor: Colors.background, borderTopLeftRadius: 20, borderTopRightRadius: 20,
    padding: 24, gap: 16,
  },
  modalTitle: { fontSize: 18, fontFamily: 'Roboto-Bold', color: Colors.textPrimary },
  modalInput: {
    backgroundColor: Colors.backgroundSecondary, borderRadius: 12,
    padding: 14, fontSize: 15, color: Colors.textPrimary,
    fontFamily: 'Roboto-Regular', minHeight: 120, textAlignVertical: 'top',
  },
  saveBtn: {
    backgroundColor: Colors.primary, borderRadius: 12,
    paddingVertical: 14, alignItems: 'center',
  },
  saveBtnText: { color: Colors.textWhite, fontFamily: 'Roboto-Bold', fontSize: 16 },
});
