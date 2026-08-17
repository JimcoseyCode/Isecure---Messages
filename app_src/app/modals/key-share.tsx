import React, { useState, useCallback, useEffect } from 'react';
import {
  View, Text, TextInput, TouchableOpacity, StyleSheet, ScrollView, Share, Alert, ActivityIndicator,
} from 'react-native';
import { SafeAreaView } from 'react-native-safe-area-context';
import { useRouter, useLocalSearchParams } from 'expo-router';
import { Ionicons } from '@expo/vector-icons';
import QRCode from 'react-native-qrcode-svg';
import * as Clipboard from 'expo-clipboard';
import { Colors } from '@/constants/colors';
import { OvCore, Sms } from '@/lib/native/ovcore';
import { getContact, updateContactKeyPool, Contact } from '@/lib/database/db';

// Auto re-pair marker: an SMS carrying a new master key, encrypted under the
// CURRENT contact key so only the paired peer can read it. The peer is warned
// their key changed (possible compromise) before accepting.
export const REKEY_PREFIX = 'ISREKEY:';

// In-person key exchange (white paper #1). A random 256-bit master is shared as a
// QR code / text; both sides derive the same 500-key pool from it and compare the
// verification code. Whoever holds the master can read the conversation — share it
// only over a trusted channel (in person, or an already-secure app).
const PREFIX = 'ISKEY1:';

export default function KeyShareModal() {
  const router = useRouter();
  const { contactId } = useLocalSearchParams<{ contactId: string }>();
  const cid = parseInt(contactId ?? '0');

  const [contact, setContact] = useState<Contact | null>(null);
  const [mode, setMode] = useState<'share' | 'receive'>('share');
  const [master, setMaster] = useState('');     // generated / parsed master hex
  const [code, setCode] = useState('');         // verification code (SAS of master)
  const [pasteText, setPasteText] = useState('');
  const [busy, setBusy] = useState(false);
  const [saved, setSaved] = useState(false);

  useEffect(() => { getContact(cid).then(setContact); }, [cid]);

  const genKey = useCallback(async () => {
    setBusy(true);
    try {
      const m = await OvCore.randomKeyHex();
      setMaster(m);
      setCode(await OvCore.deriveSas(m));
    } finally { setBusy(false); }
  }, []);

  useEffect(() => { if (mode === 'share' && !master) genKey(); }, [mode, master, genKey]);

  const firstName = contact?.name?.split(' ')[0] ?? 'ce contact';

  async function saveKey(m: string) {
    setBusy(true);
    try {
      const pool = await OvCore.deriveKeyPool(m, 500);
      await updateContactKeyPool(cid, m, pool, 0);
      setSaved(true);
    } catch { Alert.alert('Erreur', 'Clé invalide ou sauvegarde impossible.'); }
    finally { setBusy(false); }
  }

  // Send the freshly generated master to the peer, encrypted under the current
  // key, then activate it locally. The peer gets a "key changed" prompt.
  async function sendRekey() {
    const fresh = await getContact(cid);
    if (!fresh?.key_pool || !master) return;
    setBusy(true);
    try {
      const pool: string[] = JSON.parse(fresh.key_pool);
      const curKey = pool[(fresh.current_key_index || 0) % pool.length];
      const sealed = await OvCore.sealMessage(curKey, 0, master);
      await Sms.sendSms(fresh.phone, REKEY_PREFIX + sealed);
      await saveKey(master); // switch to the new key on our side
      Alert.alert('Clé envoyée', `${firstName} recevra une demande pour accepter la nouvelle clé.`);
    } catch { Alert.alert('Erreur', 'Envoi impossible (clé actuelle manquante ?).'); }
    finally { setBusy(false); }
  }

  function parseMaster(raw: string): string | null {
    let s = raw.trim();
    if (s.startsWith(PREFIX)) s = s.slice(PREFIX.length);
    s = s.trim();
    return /^[0-9a-fA-F]{64}$/.test(s) ? s.toLowerCase() : null;
  }

  async function handlePaste() {
    const clip = await Clipboard.getStringAsync();
    setPasteText(clip);
    const m = parseMaster(clip);
    if (m) { setMaster(m); setCode(await OvCore.deriveSas(m)); }
  }

  async function handlePasteChange(t: string) {
    setPasteText(t);
    const m = parseMaster(t);
    if (m) { setMaster(m); setCode(await OvCore.deriveSas(m)); }
    else { setMaster(''); setCode(''); }
  }

  const payload = master ? PREFIX + master : '';

  return (
    <SafeAreaView style={styles.container} edges={['top', 'bottom']}>
      <View style={styles.header}>
        <TouchableOpacity onPress={() => router.back()} style={styles.back} hitSlop={{ top: 12, bottom: 12, left: 12, right: 12 }}>
          <Ionicons name="chevron-down" size={26} color={Colors.textSecondary} />
        </TouchableOpacity>
        <Text style={styles.headerTitle}>Clé de {firstName}</Text>
        <View style={{ width: 34 }} />
      </View>

      {/* Segmented mode switch */}
      <View style={styles.segment}>
        {(['share', 'receive'] as const).map(m => (
          <TouchableOpacity key={m} style={[styles.segBtn, mode === m && styles.segBtnOn]}
            onPress={() => { setMode(m); setSaved(false); if (m === 'receive') { setMaster(''); setCode(''); } }}>
            <Ionicons name={m === 'share' ? 'qr-code-outline' : 'clipboard-outline'} size={16}
              color={mode === m ? '#fff' : Colors.textSecondary} />
            <Text style={[styles.segText, mode === m && styles.segTextOn]}>
              {m === 'share' ? 'Partager' : 'Recevoir'}
            </Text>
          </TouchableOpacity>
        ))}
      </View>

      <ScrollView contentContainerStyle={styles.body} showsVerticalScrollIndicator={false}>
        {saved ? (
          <View style={styles.doneBox}>
            <View style={styles.doneIcon}><Ionicons name="checkmark" size={40} color="#fff" /></View>
            <Text style={styles.doneTitle}>Clé enregistrée</Text>
            <Text style={styles.doneSub}>Vos messages avec {firstName} sont désormais chiffrés avec cette clé.</Text>
            <TouchableOpacity style={styles.primary} onPress={() => router.back()}>
              <Text style={styles.primaryText}>Terminer</Text>
            </TouchableOpacity>
          </View>
        ) : mode === 'share' ? (
          <>
            <View style={styles.qrCard}>
              {busy || !payload
                ? <View style={styles.qrPlaceholder}><ActivityIndicator color={Colors.primary} /></View>
                : <QRCode value={payload} size={220} backgroundColor="#fff" color="#0A0A0A" />}
            </View>
            <Text style={styles.hint}>Faites scanner ce QR par {firstName}, ou partagez la clé ci-dessous.</Text>

            {code ? (
              <View style={styles.codeBox}>
                <Text style={styles.codeLabel}>Code de vérification</Text>
                <Text style={styles.codeValue}>{code}</Text>
                <Text style={styles.codeHint}>Doit être identique des deux côtés.</Text>
              </View>
            ) : null}

            <View style={styles.btnRow}>
              <TouchableOpacity style={styles.btnGhost} onPress={async () => { await Clipboard.setStringAsync(payload); Alert.alert('Copié', 'Clé copiée dans le presse-papiers.'); }}>
                <Ionicons name="copy-outline" size={18} color={Colors.primary} />
                <Text style={styles.btnGhostText}>Copier</Text>
              </TouchableOpacity>
              <TouchableOpacity style={styles.btnGhost} onPress={() => Share.share({ message: payload })}>
                <Ionicons name="share-social-outline" size={18} color={Colors.primary} />
                <Text style={styles.btnGhostText}>Partager</Text>
              </TouchableOpacity>
              <TouchableOpacity style={styles.btnGhost} onPress={genKey}>
                <Ionicons name="refresh-outline" size={18} color={Colors.primary} />
                <Text style={styles.btnGhostText}>Nouvelle</Text>
              </TouchableOpacity>
            </View>

            <View style={styles.warn}>
              <Ionicons name="warning-outline" size={16} color={Colors.warning ?? '#B8860B'} />
              <Text style={styles.warnText}>Quiconque possède cette clé peut lire vos messages. Partagez-la en personne ou via un canal déjà sûr.</Text>
            </View>

            {contact?.key_pool ? (
              <TouchableOpacity style={[styles.primary, (!master || busy) && styles.primaryOff]} disabled={!master || busy} onPress={sendRekey}>
                {busy ? <ActivityIndicator color="#fff" /> : <Text style={styles.primaryText}>Envoyer par SMS chiffré (re-pairing)</Text>}
              </TouchableOpacity>
            ) : null}
            <TouchableOpacity style={[styles.btnGhost, { width: '100%' }, (!master || busy) && styles.primaryOff]} disabled={!master || busy} onPress={() => saveKey(master)}>
              <Text style={styles.btnGhostText}>Activer de mon côté seulement</Text>
            </TouchableOpacity>
          </>
        ) : (
          <>
            <Text style={styles.hint}>Collez la clé reçue de {firstName} (format ISKEY1:… ou 64 caractères hex).</Text>
            <TextInput
              style={styles.paste}
              placeholder="ISKEY1:…"
              placeholderTextColor={Colors.textMuted}
              value={pasteText}
              onChangeText={handlePasteChange}
              multiline autoCapitalize="none" autoCorrect={false}
            />
            <TouchableOpacity style={styles.btnGhost} onPress={handlePaste}>
              <Ionicons name="clipboard-outline" size={18} color={Colors.primary} />
              <Text style={styles.btnGhostText}>Coller depuis le presse-papiers</Text>
            </TouchableOpacity>

            {code ? (
              <View style={styles.codeBox}>
                <Text style={styles.codeLabel}>Code de vérification</Text>
                <Text style={styles.codeValue}>{code}</Text>
                <Text style={styles.codeHint}>Comparez-le avec {firstName}. S'il concorde, enregistrez.</Text>
              </View>
            ) : pasteText.length > 0 ? (
              <Text style={styles.invalid}>Clé non valide.</Text>
            ) : null}

            <TouchableOpacity style={[styles.primary, (!master || busy) && styles.primaryOff]} disabled={!master || busy} onPress={() => saveKey(master)}>
              {busy ? <ActivityIndicator color="#fff" /> : <Text style={styles.primaryText}>Enregistrer la clé</Text>}
            </TouchableOpacity>
          </>
        )}
      </ScrollView>
    </SafeAreaView>
  );
}

const styles = StyleSheet.create({
  container: { flex: 1, backgroundColor: Colors.backgroundSecondary },
  header: { flexDirection: 'row', alignItems: 'center', justifyContent: 'space-between', paddingHorizontal: 8, paddingVertical: 8 },
  back: { padding: 4, width: 34, alignItems: 'center' },
  headerTitle: { fontSize: 16, fontFamily: 'Roboto-Bold', color: Colors.textPrimary },
  segment: { flexDirection: 'row', marginHorizontal: 18, marginTop: 4, marginBottom: 8, backgroundColor: Colors.inputBg, borderRadius: 12, padding: 4, gap: 4 },
  segBtn: { flex: 1, flexDirection: 'row', alignItems: 'center', justifyContent: 'center', gap: 6, paddingVertical: 10, borderRadius: 9 },
  segBtnOn: { backgroundColor: Colors.primary },
  segText: { fontSize: 14, fontFamily: 'Roboto-Medium', color: Colors.textSecondary },
  segTextOn: { color: '#fff' },
  body: { padding: 18, gap: 16, paddingBottom: 40, alignItems: 'center' },

  qrCard: { backgroundColor: '#fff', borderRadius: 22, padding: 22, alignItems: 'center', justifyContent: 'center', shadowColor: '#000', shadowOffset: { width: 0, height: 4 }, shadowOpacity: 0.12, shadowRadius: 16, elevation: 6 },
  qrPlaceholder: { width: 220, height: 220, alignItems: 'center', justifyContent: 'center' },
  hint: { fontSize: 14, color: Colors.textSecondary, fontFamily: 'Roboto-Regular', textAlign: 'center', lineHeight: 20 },

  codeBox: { width: '100%', backgroundColor: Colors.primary, borderRadius: 18, padding: 18, alignItems: 'center', gap: 4 },
  codeLabel: { fontSize: 12, color: 'rgba(255,255,255,0.8)', fontFamily: 'Roboto-Medium', textTransform: 'uppercase', letterSpacing: 1 },
  codeValue: { fontSize: 24, color: '#fff', fontFamily: 'Roboto-Bold', letterSpacing: 3 },
  codeHint: { fontSize: 12, color: 'rgba(255,255,255,0.85)', fontFamily: 'Roboto-Regular', textAlign: 'center' },

  btnRow: { flexDirection: 'row', gap: 10, width: '100%' },
  btnGhost: { flex: 1, flexDirection: 'row', alignItems: 'center', justifyContent: 'center', gap: 6, backgroundColor: Colors.surface, borderRadius: 12, paddingVertical: 13, borderWidth: StyleSheet.hairlineWidth, borderColor: Colors.border },
  btnGhostText: { fontSize: 13, color: Colors.primary, fontFamily: 'Roboto-Medium' },

  warn: { flexDirection: 'row', gap: 8, backgroundColor: '#B8860B18', borderRadius: 12, padding: 12, alignItems: 'flex-start' },
  warnText: { flex: 1, fontSize: 12, color: Colors.textSecondary, fontFamily: 'Roboto-Regular', lineHeight: 17 },

  paste: { width: '100%', minHeight: 90, backgroundColor: Colors.surface, borderRadius: 14, padding: 14, fontSize: 13, color: Colors.textPrimary, fontFamily: 'Roboto-Regular', textAlignVertical: 'top', borderWidth: StyleSheet.hairlineWidth, borderColor: Colors.border },
  invalid: { color: Colors.error, fontSize: 13, fontFamily: 'Roboto-Regular' },

  primary: { width: '100%', backgroundColor: Colors.primary, borderRadius: 15, paddingVertical: 16, alignItems: 'center' },
  primaryOff: { backgroundColor: Colors.borderLight },
  primaryText: { color: '#fff', fontFamily: 'Roboto-Bold', fontSize: 16 },

  doneBox: { alignItems: 'center', gap: 14, paddingTop: 30, width: '100%' },
  doneIcon: { width: 84, height: 84, borderRadius: 42, backgroundColor: Colors.success, alignItems: 'center', justifyContent: 'center' },
  doneTitle: { fontSize: 22, fontFamily: 'Roboto-Bold', color: Colors.textPrimary },
  doneSub: { fontSize: 14, color: Colors.textSecondary, fontFamily: 'Roboto-Regular', textAlign: 'center', lineHeight: 20 },
});
