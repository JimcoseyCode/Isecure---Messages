import React, { useState, useCallback, useRef } from 'react';
import {
  View, Text, FlatList, TextInput, TouchableOpacity,
  StyleSheet, KeyboardAvoidingView, Platform,
  Alert, Modal, Pressable, Linking,
} from 'react-native';
import { SafeAreaView } from 'react-native-safe-area-context';
import { useLocalSearchParams, useRouter, useFocusEffect, useNavigation } from 'expo-router';
import { Ionicons } from '@expo/vector-icons';
import { BlurView } from 'expo-blur';
import { GlassView, GlassBackground } from '@/components/ui/Glass';
import { FLOATING_TAB_BAR_STYLE } from '@/constants/tabBarStyle';
import * as Clipboard from 'expo-clipboard';
import * as DocumentPicker from 'expo-document-picker';
import * as FileSystem from 'expo-file-system';
import * as Sharing from 'expo-sharing';
import { Colors } from '@/constants/colors';
import {
  getContact, getMessages, insertMessage, deleteMessage, deleteMessages,
  getSetting, setSetting, isDuplicate, addDedupEntry, getDedupCount, advanceKeyPoolIndex,
  updateContactEphemeral, Contact, Message,
} from '@/lib/database/db';
import { OvCore, Sms, onSmsReceived, isOvFile } from '@/lib/native/ovcore';

const EPHEMERAL_OPTIONS = [
  { label: 'Désactivé', value: 0 },
  { label: '5 minutes', value: 300 },
  { label: '15 minutes', value: 900 },
  { label: '30 minutes', value: 1800 },
  { label: '1 heure', value: 3600 },
  { label: '6 heures', value: 21600 },
  { label: '1 jour', value: 86400 },
  { label: '1 semaine', value: 604800 },
];

function formatTime(ts: number): string {
  return new Date(ts * 1000).toLocaleTimeString('fr-FR', { hour: '2-digit', minute: '2-digit' });
}

function formatCountdown(s: number): string {
  if (s <= 0) return 'expiré';
  if (s < 60) return `${s}s`;
  if (s < 3600) return `${Math.floor(s / 60)}m`;
  if (s < 86400) return `${Math.floor(s / 3600)}h`;
  return `${Math.floor(s / 86400)}j`;
}

// New wire format lives in the Rust core: `OV1|<keyIndex>|<b64>` messages and
// `OVc|…` multipart chunks. AES-256-GCM inside — the tag rides in the payload.
function isEncrypted(content: string): boolean {
  return content.startsWith('OV1|') || content.startsWith('OVc|') || content.startsWith('OV36:');
}

/** The contact's key material as a pool of hex keys (single-key contacts read
 * as a one-element pool). */
function getPool(contact: Contact): string[] | null {
  if (contact.key_pool) {
    try {
      const pool: string[] = JSON.parse(contact.key_pool);
      if (Array.isArray(pool) && pool.length > 0) return pool;
    } catch {}
  }
  return contact.key_hex ? [contact.key_hex] : null;
}

function getContactKeyHex(contact: Contact): string | null {
  const pool = getPool(contact);
  if (!pool) return null;
  return pool[contact.current_key_index % pool.length];
}

/** Decrypt one stored message via the native core. The key index is read from
 * the payload itself, so out-of-order pool keys still resolve. */
async function decryptOne(
  msg: Message,
  pool: string[] | null,
  contact: Contact | null
): Promise<{ text: string; ok: boolean }> {
  if (!isEncrypted(msg.content)) return { text: msg.content, ok: true };
  
  if (msg.content.startsWith('OV36:')) {
    let key = contact?.key_hex;
    if (!key && contact?.key_pool) {
      try { key = JSON.parse(contact.key_pool)[0]; } catch {}
    }
    if (!key) return { text: '⚠ Pas de clé OV36', ok: false };
    try {
      const dec = await OvCore.ov36Decode(msg.content, key);
      return { text: dec.plaintext, ok: true };
    } catch {
      return { text: '⚠ Déchiffrement OV36 impossible', ok: false };
    }
  }

  if (!pool) return { text: '⚠ Pas de clé', ok: false };
  try {
    const idx = await OvCore.peekKeyIndex(msg.content);
    const key = pool[idx % pool.length];
    const text = await OvCore.openMessage(key, msg.content);
    return { text, ok: true };
  } catch {
    return { text: '⚠ Déchiffrement impossible', ok: false };
  }
}

function b64ToUint8(b64: string): Uint8Array {
  const bin = atob(b64);
  const bytes = new Uint8Array(bin.length);
  for (let i = 0; i < bin.length; i++) bytes[i] = bin.charCodeAt(i);
  return bytes;
}
function uint8ToB64(bytes: Uint8Array): string {
  let bin = '';
  for (let i = 0; i < bytes.length; i++) bin += String.fromCharCode(bytes[i]);
  return btoa(bin);
}

type ActiveModal = 'none' | 'key_required' | 'options' | 'ephemeral';

export default function ChatScreen() {
  const { id } = useLocalSearchParams<{ id: string }>();
  const router = useRouter();
  const navigation = useNavigation();
  const contactId = parseInt(id ?? '0');

  const [contact, setContact] = useState<Contact | null>(null);
  const [messages, setMessages] = useState<Message[]>([]);
  const [inputText, setInputText] = useState('');
  const [encryptionOn, setEncryptionOn] = useState(false);
  const [fortressMode, setFortressMode] = useState(false);
  const [ovnyMode, setOvnyMode] = useState(false);
  const [useBase64, setUseBase64] = useState(false);
  const [now, setNow] = useState(() => Math.floor(Date.now() / 1000));
  const [modal, setModal] = useState<ActiveModal>('none');
  // messageId -> decrypted text (native AES-GCM runs off the render path)
  const [decrypted, setDecrypted] = useState<Record<number, { text: string; ok: boolean }>>({});

  const flatListRef = useRef<FlatList>(null);
  const intervalRef = useRef<ReturnType<typeof setInterval> | null>(null);

  const loadMessages = useCallback(async () => {
    const c = await getContact(contactId);
    const ts = Math.floor(Date.now() / 1000);
    const all = await getMessages(contactId);
    // Ephemeral: hard-delete expired messages (white paper), don't just hide them.
    for (const m of all) { if (m.expires_at && m.expires_at <= ts) await deleteMessage(m.id); }
    const visible = all.filter(m => !m.expires_at || m.expires_at > ts);
    setContact(c);
    setMessages(visible);
    setNow(ts);

    const pool = c ? getPool(c) : null;
    const dmap: Record<number, { text: string; ok: boolean }> = {};
    for (const m of visible) {
      dmap[m.id] = await decryptOne(m, pool, c);
    }
    setDecrypted(dmap);
  }, [contactId]);

  const loadSettings = useCallback(async () => {
    const fortress = (await getSetting('fortress_mode', '0')) === '1';
    const ovny = (await getSetting('ovny_mode', '0')) === '1';
    const b64 = (await getSetting('base64', '0')) === '1';
    setFortressMode(fortress);
    setOvnyMode(ovny);
    setUseBase64(b64);
    if (ovny) setEncryptionOn(true);
  }, []);

  useFocusEffect(useCallback(() => {
    // iMessage hides the tab bar inside a conversation.
    const parent = navigation.getParent();
    parent?.setOptions({ tabBarStyle: { display: 'none' } });

    loadMessages();
    loadSettings();
    intervalRef.current = setInterval(() => {
      setNow(Math.floor(Date.now() / 1000));
      loadMessages();
    }, 30_000);

    // Live inbound SMS for this conversation. ponytail: routes only the open
    // contact here — a global inbox listener (any contact) is the follow-up.
    const unsub = onSmsReceived(async (sms) => {
      const c = await getContact(contactId);
      if (!c) return;
      const norm = (s: string) => s.replace(/\D/g, '').slice(-9);
      if (norm(sms.address) !== norm(c.phone)) return;
      const enc = isEncrypted(sms.body);
      // Fortress mode (white paper #40-44): silence non-encrypted inbound from a
      // known contact — no insert, no notification. Encryption is mandatory.
      if ((await getSetting('fortress_mode', '0')) === '1' && !enc) return;
      if (await isDuplicate(contactId, sms.body)) return;
      await addDedupEntry(contactId, sms.body);
      // Replay-store saturation alert (white paper #20): warn once per threshold.
      const dedupN = await getDedupCount(contactId);
      for (const th of [1999, 1800, 1500]) {
        if (dedupN >= th && (await getSetting(`sat_alert_${contactId}`, '0')) !== String(th)) {
          await setSetting(`sat_alert_${contactId}`, String(th));
          Alert.alert('Rotation de clé recommandée', `${dedupN} messages stockés pour l'anti-rejeu (seuil ${th}). Renouvelez la clé de ce contact.`);
          break;
        }
      }
      let msgIndex: number | null = null;
      if (enc && !sms.body.startsWith('OV36:')) { try { msgIndex = await OvCore.peekKeyIndex(sms.body); } catch {} }
      await insertMessage({
        contact_id: contactId, content: sms.body, encrypted_content: enc ? sms.body : null,
        is_encrypted: enc ? 1 : 0, is_sent: 0, msg_index: msgIndex,
        hmac_tag: null, is_read: 0, is_ephemeral: 0, expires_at: null,
      });
      await loadMessages();
    });

    return () => {
      if (intervalRef.current) clearInterval(intervalRef.current);
      unsub();
      parent?.setOptions({ tabBarStyle: FLOATING_TAB_BAR_STYLE });
    };
  }, [loadMessages, loadSettings, contactId, navigation]));

  function toggleEncryption() {
    if (ovnyMode) return;
    if (!encryptionOn && !(contact?.key_hex || contact?.key_pool)) {
      setModal('key_required');
      return;
    }
    setEncryptionOn(v => !v);
  }

  async function handleSend() {
    const text = inputText.trim();
    if (!text) return;
    const fresh = await getContact(contactId);
    if (!fresh) return;

    let content = text;
    let encryptedContent: string | null = null;
    let msgIndex: number | null = null;

    if (encryptionOn) {
      if (ovCompat) {
        const key = fresh.key_pool ? JSON.parse(fresh.key_pool)[0] : fresh.key_hex;
        if (!key) { setModal('key_required'); return; }
        content = await OvCore.ov36Encode(text, key);
        encryptedContent = content;
      } else {
        const pool = getPool(fresh);
        if (!pool) { setModal('key_required'); return; }
        const idx = fresh.key_pool ? fresh.current_key_index % pool.length : 0;
        // AES-256-GCM in the Rust core; the key index rides in the payload.
        content = await OvCore.sealMessage(pool[idx], idx, text);
        encryptedContent = content;
        msgIndex = idx;
        if (fresh.key_pool) await advanceKeyPoolIndex(contactId);
      }
    }

    const dur = contact?.ephemeral_duration ?? 0;
    const expiresAt = dur > 0 ? Math.floor(Date.now() / 1000) + dur : null;

    await insertMessage({
      contact_id: contactId, content, encrypted_content: encryptedContent,
      is_encrypted: encryptionOn ? 1 : 0, is_sent: 1, msg_index: msgIndex,
      hmac_tag: null, is_read: 1, is_ephemeral: expiresAt ? 1 : 0, expires_at: expiresAt,
    });

    // Transmit over the real SMS channel (native auto-splits multipart).
    try { await Sms.sendSms(fresh.phone, content); }
    catch { Alert.alert('SMS', 'Envoi SMS échoué — message enregistré localement.'); }

    setInputText('');
    await loadMessages();
    setTimeout(() => flatListRef.current?.scrollToEnd({ animated: true }), 80);
  }

  async function handleAttachFile() {
    const fresh = await getContact(contactId);
    if (!fresh) return;
    const keyHex = getContactKeyHex(fresh);
    if (!keyHex) { setModal('key_required'); return; }

    const picked = await DocumentPicker.getDocumentAsync({ copyToCacheDirectory: true });
    if (picked.canceled || !picked.assets?.[0]) return;
    const asset = picked.assets[0];
    try {
      const b64Data = await FileSystem.readAsStringAsync(asset.uri, { encoding: FileSystem.EncodingType.Base64 });
      const fileBytes = Array.from(b64ToUint8(b64Data));
      if (isOvFile(asset.name)) {
        const { content: decBytes, originalFilename } = await OvCore.decryptFile(keyHex, fileBytes);
        const outUri = (FileSystem.cacheDirectory ?? '') + originalFilename;
        await FileSystem.writeAsStringAsync(outUri, uint8ToB64(Uint8Array.from(decBytes)), { encoding: FileSystem.EncodingType.Base64 });
        await Sharing.shareAsync(outUri, { dialogTitle: 'Fichier déchiffré : ' + originalFilename });
      } else {
        const encBytes = await OvCore.encryptFile(keyHex, fileBytes, asset.name);
        const filename = `ov_${Date.now().toString(36)}.ov`;
        const outUri = (FileSystem.cacheDirectory ?? '') + filename;
        await FileSystem.writeAsStringAsync(outUri, uint8ToB64(Uint8Array.from(encBytes)), { encoding: FileSystem.EncodingType.Base64 });
        await Sharing.shareAsync(outUri, { dialogTitle: 'Partager ' + filename });
      }
    } catch {
      Alert.alert('Erreur', 'Impossible de traiter le fichier.');
    }
  }

  function handleLongPress(msg: Message) {
    Alert.alert('Message', undefined, [
      { text: 'Copier', onPress: async () => {
        const txt = decrypted[msg.id]?.text ?? msg.content;
        await Clipboard.setStringAsync(txt);
      }},
      { text: 'Supprimer', style: 'destructive', onPress: () =>
        Alert.alert('Supprimer', 'Supprimer ce message ?', [
          { text: 'Annuler', style: 'cancel' },
          { text: 'Supprimer', style: 'destructive', onPress: async () => {
            await deleteMessage(msg.id);
            await loadMessages();
          }},
        ])
      },
      { text: 'Annuler', style: 'cancel' },
    ]);
  }

  const hasKey = contact ? !!getPool(contact) : false;
  const ephDuration = contact?.ephemeral_duration ?? 0;

  const renderMessage = ({ item }: { item: Message }) => {
    const isSent = item.is_sent === 1;
    const isEnc = isEncrypted(item.content);

    if (!isSent && !isEnc && fortressMode) {
      return (
        <View style={[styles.msgWrapper, styles.receivedWrapper]}>
          <View style={styles.blockedBubble}>
            <Ionicons name="shield" size={12} color={Colors.error} />
            <Text style={styles.blockedText}>Bloqué — Mode Forteresse actif</Text>
          </View>
        </View>
      );
    }

    const dec = decrypted[item.id];
    let displayText = isEnc ? (dec?.text ?? '…') : item.content;
    let decryptOk = isEnc ? (dec?.ok ?? false) : true;

    const remaining = item.expires_at ? item.expires_at - now : null;

    return (
      <TouchableOpacity activeOpacity={0.85} onLongPress={() => handleLongPress(item)}>
        <View style={[styles.msgWrapper, isSent ? styles.sentWrapper : styles.receivedWrapper]}>
          <View style={[
            styles.bubble,
            isSent
              ? (isEnc ? styles.sentEncBubble : styles.sentBubble)
              : (isEnc ? styles.recvEncBubble : styles.recvBubble),
          ]}>
            {isEnc && (
              <View style={styles.lockRow}>
                <Ionicons name={decryptOk ? 'lock-closed' : 'lock-open'} size={10}
                  color={decryptOk ? Colors.success : Colors.error} />
                <Text style={[styles.lockLabel, { color: decryptOk ? Colors.success : Colors.error }]}>
                  {decryptOk ? 'Chiffré OV' : 'Déchiffrement échoué'}
                </Text>
              </View>
            )}
            <Text style={[styles.bubbleText, isSent ? styles.bubbleTextLight : styles.bubbleTextDark]}>
              {displayText}
            </Text>
            <View style={styles.metaRow}>
              {remaining !== null && remaining > 0 && (
                <View style={styles.ephemeralRow}>
                  <Ionicons name="timer-outline" size={10} color="rgba(255,255,255,0.5)" />
                  <Text style={styles.ephemeralLabel}>{formatCountdown(remaining)}</Text>
                </View>
              )}
              <Text style={[styles.metaTime, !isSent && styles.metaTimeDark]}>
                {formatTime(item.created_at)}
              </Text>
              {isSent && (
                <Ionicons name={item.is_read ? 'checkmark-done' : 'checkmark'} size={12}
                  color={isSent ? 'rgba(255,255,255,0.5)' : Colors.textMuted}
                  style={{ marginLeft: 2 }} />
              )}
            </View>
          </View>
        </View>
      </TouchableOpacity>
    );
  };

  return (
    <SafeAreaView style={styles.container}>
      <GlassBackground />
      {/* Header */}
      <View style={styles.header}>
        <TouchableOpacity onPress={() => router.back()} style={styles.backBtn}>
          <Ionicons name="chevron-back" size={24} color={Colors.textPrimary} />
        </TouchableOpacity>
        <View style={[styles.keyDot, { backgroundColor: hasKey ? Colors.success : Colors.error }]} />
        <View style={styles.headerCenter}>
          <Text style={styles.headerName} numberOfLines={1}>{contact?.name ?? ''}</Text>
          <Text style={styles.headerSub}>
            {hasKey ? (contact?.key_pool ? 'Pool de clés actif' : 'Clé partagée') : 'Pas de clé — non chiffré'}
          </Text>
        </View>
        <View style={styles.headerActions}>
          <TouchableOpacity
            style={styles.headerBtn}
            onPress={() => router.push({
              pathname: '/modals/universal-encrypt',
              params: { keyHex: getContactKeyHex(contact!) ?? '' },
            })}
          >
            <Ionicons name="key-outline" size={19} color={Colors.purpleIconBg} />
          </TouchableOpacity>
          <TouchableOpacity
            style={styles.headerBtn}
            onPress={() => router.push({
              pathname: '/modals/pairing',
              params: { contactId: String(contactId) },
            })}
          >
            <Ionicons name="swap-horizontal-outline" size={19} color={Colors.primary} />
          </TouchableOpacity>
          <TouchableOpacity
            style={styles.headerBtn}
            onPress={() => contact?.phone && Linking.openURL(`tel:${contact.phone}`)}
          >
            <Ionicons name="call" size={19} color={Colors.success} />
          </TouchableOpacity>
          <TouchableOpacity style={styles.headerBtn} onPress={() => setModal('options')}>
            <Ionicons name="ellipsis-vertical" size={19} color={Colors.textSecondary} />
          </TouchableOpacity>
        </View>
      </View>

      {/* Security banners */}
      {ovnyMode && (
        <View style={[styles.banner, { backgroundColor: Colors.ovnyBg }]}>
          <Ionicons name="eye-off" size={12} color="#fff" />
          <Text style={styles.bannerText}>Chiffrement forcé — toutes les transmissions sont chiffrées</Text>
        </View>
      )}
      {fortressMode && (
        <View style={[styles.banner, { backgroundColor: Colors.fortressBg }]}>
          <Ionicons name="business" size={12} color="#fff" />
          <Text style={styles.bannerText}>Mode Forteresse — messages non chiffrés rejetés</Text>
        </View>
      )}
      {ephDuration > 0 && (
        <View style={[styles.banner, { backgroundColor: Colors.ephemeralBg }]}>
          <Ionicons name="timer-outline" size={12} color={Colors.warning} />
          <Text style={[styles.bannerText, { color: Colors.warning }]}>
            Éphémère : {EPHEMERAL_OPTIONS.find(o => o.value === ephDuration)?.label}
          </Text>
        </View>
      )}

      {/* Messages */}
      <FlatList
        ref={flatListRef}
        data={messages}
        keyExtractor={item => String(item.id)}
        renderItem={renderMessage}
        contentContainerStyle={styles.msgList}
        onContentSizeChange={() => flatListRef.current?.scrollToEnd({ animated: false })}
        showsVerticalScrollIndicator={false}
      />

      {/* Input */}
      <KeyboardAvoidingView behavior={Platform.OS === 'ios' ? 'padding' : undefined}>
        <View style={styles.inputBar}>
          <TouchableOpacity onPress={toggleEncryption} style={styles.lockBtn} hitSlop={{ top: 8, bottom: 8, left: 8, right: 8 }}>
            <Ionicons
              name={encryptionOn ? 'lock-closed' : 'lock-open-outline'}
              size={22}
              color={encryptionOn ? (hasKey ? Colors.success : Colors.error) : Colors.textMuted}
            />
          </TouchableOpacity>
          <TextInput
            style={styles.textInput}
            placeholder={encryptionOn ? 'Message chiffré…' : 'Écrire un message…'}
            placeholderTextColor={Colors.textMuted}
            value={inputText}
            onChangeText={setInputText}
            multiline
            maxLength={4096}
          />
          <TouchableOpacity onPress={handleAttachFile} style={styles.attachBtn} hitSlop={{ top: 8, bottom: 8, left: 4, right: 4 }}>
            <Ionicons name="attach-outline" size={22} color={Colors.textMuted} />
          </TouchableOpacity>
          <TouchableOpacity
            onPress={handleSend}
            style={[styles.sendBtn, !inputText.trim() && styles.sendBtnDisabled]}
            disabled={!inputText.trim()}
          >
            <Ionicons name="arrow-up" size={18} color="#fff" />
          </TouchableOpacity>
        </View>
      </KeyboardAvoidingView>

      {/* Key required */}
      <Modal visible={modal === 'key_required'} transparent animationType="fade" onRequestClose={() => setModal('none')}>
        <Pressable style={styles.overlay} onPress={() => setModal('none')}>
          <Pressable style={styles.dialog} onPress={() => {}}>
            <BlurView intensity={55} tint="light" style={StyleSheet.absoluteFill} pointerEvents="none" />
            <View style={styles.dialogIcon}>
              <Ionicons name="key" size={32} color={Colors.primary} />
            </View>
            <Text style={styles.dialogTitle}>Clé requise</Text>
            <Text style={styles.dialogBody}>
              Ce contact n'a pas de clé de chiffrement. Effectuez un appairage pour activer le chiffrement.
            </Text>
            <TouchableOpacity
              style={styles.dialogBtnPrimary}
              onPress={() => {
                setModal('none');
                router.push({ pathname: '/modals/pairing', params: { contactId: String(contactId) } });
              }}
            >
              <Text style={styles.dialogBtnPrimaryText}>Appairer maintenant</Text>
            </TouchableOpacity>
            <TouchableOpacity style={styles.dialogBtnSecondary} onPress={() => setModal('none')}>
              <Text style={styles.dialogBtnSecondaryText}>Annuler</Text>
            </TouchableOpacity>
          </Pressable>
        </Pressable>
      </Modal>

      {/* Options sheet */}
      <Modal visible={modal === 'options'} transparent animationType="slide" onRequestClose={() => setModal('none')}>
        <Pressable style={styles.overlayBottom} onPress={() => setModal('none')}>
          <Pressable style={styles.sheet} onPress={() => {}}>
            <BlurView intensity={55} tint="light" style={StyleSheet.absoluteFill} pointerEvents="none" />
            <View style={styles.sheetHandle} />
            <Text style={styles.sheetTitle}>Options</Text>

            <TouchableOpacity style={styles.sheetRow} onPress={() => { setModal('none'); router.push({ pathname: '/modals/pairing', params: { contactId: String(contactId) } }); }}>
              <View style={[styles.sheetIcon, { backgroundColor: `${Colors.primary}22` }]}>
                <Ionicons name="swap-horizontal-outline" size={18} color={Colors.primary} />
              </View>
              <View style={styles.sheetRowContent}>
                <Text style={styles.sheetRowLabel}>Appairage des clés</Text>
                <Text style={styles.sheetRowSub}>Échange post-quantique ML-KEM-768 + X25519</Text>
              </View>
              <Ionicons name="chevron-forward" size={16} color={Colors.textMuted} />
            </TouchableOpacity>

            <TouchableOpacity style={styles.sheetRow} onPress={() => setModal('ephemeral')}>
              <View style={[styles.sheetIcon, { backgroundColor: `${Colors.warning}22` }]}>
                <Ionicons name="timer-outline" size={18} color={Colors.warning} />
              </View>
              <View style={styles.sheetRowContent}>
                <Text style={styles.sheetRowLabel}>Messages éphémères</Text>
                <Text style={styles.sheetRowSub}>{EPHEMERAL_OPTIONS.find(o => o.value === ephDuration)?.label ?? 'Désactivé'}</Text>
              </View>
              <Ionicons name="chevron-forward" size={16} color={Colors.textMuted} />
            </TouchableOpacity>

            <TouchableOpacity style={styles.sheetRow} onPress={() => router.push({ pathname: '/modals/universal-encrypt', params: { keyHex: getContactKeyHex(contact!) ?? '' } })}>
              <View style={[styles.sheetIcon, { backgroundColor: `${Colors.purpleIconBg}22` }]}>
                <Ionicons name="key-outline" size={18} color={Colors.purpleIconBg} />
              </View>
              <View style={styles.sheetRowContent}>
                <Text style={styles.sheetRowLabel}>Chiffrement universel</Text>
                <Text style={styles.sheetRowSub}>Chiffrer du texte pour n'importe quelle plateforme</Text>
              </View>
              <Ionicons name="chevron-forward" size={16} color={Colors.textMuted} />
            </TouchableOpacity>

            <TouchableOpacity style={styles.sheetRow} onPress={() => { setModal('none'); Alert.alert('Effacer', 'Supprimer toute la conversation ?', [
              { text: 'Annuler', style: 'cancel' },
              { text: 'Effacer', style: 'destructive', onPress: async () => { await deleteMessages(contactId); await loadMessages(); } },
            ]); }}>
              <View style={[styles.sheetIcon, { backgroundColor: `${Colors.error}22` }]}>
                <Ionicons name="trash-outline" size={18} color={Colors.error} />
              </View>
              <Text style={[styles.sheetRowLabel, { color: Colors.error }]}>Effacer la discussion</Text>
            </TouchableOpacity>
          </Pressable>
        </Pressable>
      </Modal>

      {/* Ephemeral picker */}
      <Modal visible={modal === 'ephemeral'} transparent animationType="slide" onRequestClose={() => setModal('options')}>
        <Pressable style={styles.overlayBottom} onPress={() => setModal('options')}>
          <Pressable style={styles.sheet} onPress={() => {}}>
            <BlurView intensity={55} tint="light" style={StyleSheet.absoluteFill} pointerEvents="none" />
            <View style={styles.sheetHandle} />
            <Text style={styles.sheetTitle}>Messages éphémères</Text>
            <Text style={styles.sheetSub}>Les messages s'autodétruisent après la durée choisie.</Text>
            {EPHEMERAL_OPTIONS.map(opt => (
              <TouchableOpacity key={opt.value} style={styles.sheetRow} onPress={async () => {
                await updateContactEphemeral(contactId, opt.value);
                setContact(prev => prev ? { ...prev, ephemeral_duration: opt.value } : prev);
                setModal('none');
              }}>
                <Ionicons
                  name={ephDuration === opt.value ? 'radio-button-on' : 'radio-button-off'}
                  size={20} color={ephDuration === opt.value ? Colors.primary : Colors.textMuted}
                />
                <Text style={[styles.sheetRowLabel, ephDuration === opt.value && { color: Colors.primary }]}>
                  {opt.label}
                </Text>
              </TouchableOpacity>
            ))}
          </Pressable>
        </Pressable>
      </Modal>
    </SafeAreaView>
  );
}

const styles = StyleSheet.create({
  container: { flex: 1, backgroundColor: 'transparent' },

  header: {
    flexDirection: 'row', alignItems: 'center',
    backgroundColor: 'rgba(255,255,255,0.72)',
    paddingHorizontal: 10, paddingVertical: 12, gap: 8,
    borderBottomWidth: StyleSheet.hairlineWidth, borderBottomColor: 'rgba(255,255,255,0.6)',
  },
  backBtn: { padding: 4 },
  keyDot: { width: 9, height: 9, borderRadius: 5 },
  headerCenter: { flex: 1 },
  headerName: { fontSize: 16, fontFamily: 'Roboto-Bold', color: Colors.textPrimary },
  headerSub: { fontSize: 11, color: Colors.textMuted, fontFamily: 'Roboto-Regular', marginTop: 1 },
  headerActions: { flexDirection: 'row', gap: 2 },
  headerBtn: { padding: 8 },

  banner: {
    flexDirection: 'row', alignItems: 'center', gap: 8,
    paddingHorizontal: 14, paddingVertical: 7,
  },
  bannerText: { fontSize: 11, color: 'rgba(255,255,255,0.9)', fontFamily: 'Roboto-Medium', flex: 1 },

  msgList: { padding: 12, paddingBottom: 8, gap: 4 },
  msgWrapper: { marginBottom: 4 },
  sentWrapper: { alignItems: 'flex-end' },
  receivedWrapper: { alignItems: 'flex-start' },

  bubble: { maxWidth: '78%', borderRadius: 18, paddingHorizontal: 13, paddingVertical: 8 },
  sentBubble: { backgroundColor: Colors.sentBubble, borderBottomRightRadius: 5 },
  sentEncBubble: { backgroundColor: Colors.encryptedBubble, borderBottomRightRadius: 5 },
  recvBubble: { backgroundColor: Colors.receivedBubble, borderBottomLeftRadius: 5 },
  recvEncBubble: { backgroundColor: '#E5EEFF', borderBottomLeftRadius: 5 },

  lockRow: { flexDirection: 'row', alignItems: 'center', gap: 4, marginBottom: 4 },
  lockLabel: { fontSize: 10, fontFamily: 'Roboto-Medium' },

  bubbleText: { fontSize: 16, fontFamily: 'Roboto-Regular', lineHeight: 21 },
  bubbleTextLight: { color: '#FFFFFF' },
  bubbleTextDark: { color: Colors.textPrimary },

  metaRow: { flexDirection: 'row', alignItems: 'center', justifyContent: 'flex-end', marginTop: 3, gap: 2 },
  ephemeralRow: { flexDirection: 'row', alignItems: 'center', gap: 3, marginRight: 4 },
  ephemeralLabel: { fontSize: 10, color: 'rgba(255,255,255,0.7)', fontFamily: 'Roboto-Regular' },
  metaTime: { fontSize: 11, color: 'rgba(255,255,255,0.7)', fontFamily: 'Roboto-Regular' },
  metaTimeDark: { color: Colors.textMuted },

  blockedBubble: {
    flexDirection: 'row', alignItems: 'center', gap: 8,
    backgroundColor: Colors.errorBg, borderRadius: 14,
    paddingHorizontal: 14, paddingVertical: 10, maxWidth: '82%',
    borderWidth: 1, borderColor: `${Colors.error}40`,
  },
  blockedText: { fontSize: 13, color: Colors.error, fontFamily: 'Roboto-Regular', flex: 1 },

  inputBar: {
    flexDirection: 'row', alignItems: 'flex-end',
    backgroundColor: 'rgba(255,255,255,0.72)',
    paddingHorizontal: 12, paddingVertical: 10,
    paddingBottom: Platform.OS === 'ios' ? 28 : 12,
    gap: 8, borderTopWidth: StyleSheet.hairlineWidth, borderTopColor: 'rgba(255,255,255,0.6)',
  },
  lockBtn: { paddingBottom: 4 },
  textInput: {
    flex: 1, fontSize: 15, fontFamily: 'Roboto-Regular',
    color: Colors.textPrimary, maxHeight: 120, minHeight: 36,
    backgroundColor: Colors.inputBg, borderRadius: 20,
    paddingHorizontal: 14, paddingVertical: 8,
    borderWidth: 1, borderColor: Colors.border,
  },
  attachBtn: { paddingBottom: 4 },
  sendBtn: {
    width: 38, height: 38, borderRadius: 19,
    backgroundColor: Colors.primary,
    alignItems: 'center', justifyContent: 'center',
  },
  sendBtnDisabled: { backgroundColor: Colors.border },

  overlay: {
    flex: 1, backgroundColor: Colors.overlayBg,
    justifyContent: 'center', alignItems: 'center',
  },
  overlayBottom: { flex: 1, backgroundColor: Colors.overlayBg, justifyContent: 'flex-end' },

  dialog: {
    backgroundColor: 'rgba(255,255,255,0.8)', borderRadius: 22, overflow: 'hidden',
    padding: 28, marginHorizontal: 24,
    alignItems: 'center', gap: 14,
    borderWidth: StyleSheet.hairlineWidth, borderColor: 'rgba(255,255,255,0.7)',
  },
  dialogIcon: {
    width: 64, height: 64, borderRadius: 18,
    backgroundColor: `${Colors.primary}20`,
    alignItems: 'center', justifyContent: 'center',
  },
  dialogTitle: { fontSize: 18, fontFamily: 'Roboto-Bold', color: Colors.textPrimary },
  dialogBody: { fontSize: 14, fontFamily: 'Roboto-Regular', color: Colors.textSecondary, textAlign: 'center', lineHeight: 20 },
  dialogBtnPrimary: {
    width: '100%', backgroundColor: Colors.primary, borderRadius: 14,
    paddingVertical: 15, alignItems: 'center',
  },
  dialogBtnPrimaryText: { color: '#fff', fontFamily: 'Roboto-Bold', fontSize: 15 },
  dialogBtnSecondary: {
    width: '100%', borderWidth: 1.5, borderColor: Colors.border, borderRadius: 14,
    paddingVertical: 15, alignItems: 'center',
  },
  dialogBtnSecondaryText: { color: Colors.textSecondary, fontFamily: 'Roboto-Medium', fontSize: 15 },

  sheet: {
    backgroundColor: 'rgba(255,255,255,0.78)', overflow: 'hidden',
    borderTopLeftRadius: 24, borderTopRightRadius: 24,
    padding: 20, paddingBottom: Platform.OS === 'ios' ? 40 : 24,
    borderWidth: StyleSheet.hairlineWidth, borderColor: 'rgba(255,255,255,0.7)', borderBottomWidth: 0,
  },
  sheetHandle: {
    width: 36, height: 4, borderRadius: 2,
    backgroundColor: Colors.border, alignSelf: 'center', marginBottom: 16,
  },
  sheetTitle: { fontSize: 18, fontFamily: 'Roboto-Bold', color: Colors.textPrimary, marginBottom: 4 },
  sheetSub: { fontSize: 13, color: Colors.textSecondary, fontFamily: 'Roboto-Regular', marginBottom: 8 },
  sheetRow: {
    flexDirection: 'row', alignItems: 'center', gap: 14,
    paddingVertical: 14,
    borderBottomWidth: 1, borderBottomColor: Colors.separator,
  },
  sheetIcon: { width: 36, height: 36, borderRadius: 10, alignItems: 'center', justifyContent: 'center' },
  sheetRowContent: { flex: 1 },
  sheetRowLabel: { flex: 1, fontSize: 15, fontFamily: 'Roboto-Regular', color: Colors.textPrimary },
  sheetRowSub: { fontSize: 12, color: Colors.textMuted, fontFamily: 'Roboto-Regular', marginTop: 2 },
});
