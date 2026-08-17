import React, { useState, useRef } from 'react';
import {
  View, Text, TextInput, TouchableOpacity, StyleSheet,
  ScrollView, Alert, Share, Modal,
} from 'react-native';
import { SafeAreaView } from 'react-native-safe-area-context';
import { useRouter } from 'expo-router';
import { Ionicons } from '@expo/vector-icons';
import { LinearGradient } from 'expo-linear-gradient';
import { CameraView, useCameraPermissions } from 'expo-camera';
import * as Clipboard from 'expo-clipboard';
import * as DocumentPicker from 'expo-document-picker';
import * as FileSystem from 'expo-file-system';
import * as Sharing from 'expo-sharing';
import { Colors } from '@/constants/colors';
import { OvCore } from '@/lib/native/ovcore';
import { FadeSlideIn } from '@/components/ui/Motion';
import { BrandMark } from '@/components/ui/BrandMark';

// Fixed salt so the SAME secret phrase derives the SAME key on both phones —
// that's what makes the shared-passphrase UX work without exchanging hex keys.
// ponytail: fixed salt; move to a per-message salt shipped in the blob if the
// threat model ever needs resistance to precomputation.
const SHARED_SALT = 'a1b2c3d4e5f6a7b8c9d0e1f2a3b4c5d6';

export default function UniversalEncryptModal() {
  const router = useRouter();
  const [mode, setMode] = useState<'enc' | 'dec'>('enc');
  const [secret, setSecret] = useState('');
  const [showSecret, setShowSecret] = useState(false);
  const [input, setInput] = useState('');
  const [result, setResult] = useState('');
  const [busy, setBusy] = useState(false);
  const [scanOpen, setScanOpen] = useState(false);
  const [camPerm, requestCamPerm] = useCameraPermissions();
  const cameraRef = useRef<CameraView>(null);

  const isEnc = mode === 'enc';

  async function deriveKey(): Promise<string> {
    const { keyHex } = await OvCore.deriveFromPassword(secret.trim(), SHARED_SALT);
    return keyHex;
  }

  function requireSecret(): boolean {
    if (secret.trim().length < 4) {
      Alert.alert('Mot secret requis', 'Choisissez un mot secret (min. 4 caractères) — le même des deux côtés.');
      return false;
    }
    return true;
  }

  async function handleRun() {
    if (!requireSecret()) return;
    if (!input.trim()) { Alert.alert('Vide', isEnc ? 'Écrivez un message à chiffrer.' : 'Collez le message chiffré.'); return; }
    setBusy(true);
    try {
      const k = await deriveKey();
      if (isEnc) {
        setResult(await OvCore.sealMessage(k, 0, input.trim()));
      } else {
        setResult(await OvCore.openMessage(k, input.trim()));
      }
    } catch {
      Alert.alert('Échec', isEnc ? 'Chiffrement impossible.' : 'Mauvais mot secret ou message invalide.');
    } finally { setBusy(false); }
  }

  async function shareResult() {
    if (!result) return;
    try { await Share.share({ message: result }); } catch {}
  }

  // Files & scan reuse the same secret-derived key, then hand off to the OS share
  // sheet (SMS, Messenger, WhatsApp, mail, social — every installed channel).
  async function encryptAndShareUri(uri: string, name: string) {
    const k = await deriveKey();
    const bytes = await FileSystem.readAsStringAsync(uri, { encoding: FileSystem.EncodingType.Base64 });
    const buffer = Array.from(atob(bytes), (c) => c.charCodeAt(0));
    const data = await OvCore.encryptFile(k, buffer, name);
    const b64 = btoa(String.fromCharCode(...data));
    const outUri = FileSystem.cacheDirectory + `ov_${Date.now().toString(36)}.ov`;
    await FileSystem.writeAsStringAsync(outUri, b64, { encoding: FileSystem.EncodingType.Base64 });
    await Sharing.shareAsync(outUri, { mimeType: 'application/octet-stream', dialogTitle: 'Envoyer le fichier chiffré' });
  }

  async function pickAndEncryptFile() {
    if (!requireSecret()) return;
    try {
      const picked = await DocumentPicker.getDocumentAsync({ copyToCacheDirectory: true });
      if (picked.canceled || !picked.assets?.[0]) return;
      await encryptAndShareUri(picked.assets[0].uri, picked.assets[0].name);
    } catch (e: any) { Alert.alert('Échec', e?.message ?? 'Chiffrement du fichier impossible.'); }
  }

  async function pickAndDecryptFile() {
    if (!requireSecret()) return;
    try {
      const picked = await DocumentPicker.getDocumentAsync({ copyToCacheDirectory: true });
      if (picked.canceled || !picked.assets?.[0]) return;
      const k = await deriveKey();
      const b64 = await FileSystem.readAsStringAsync(picked.assets[0].uri, { encoding: FileSystem.EncodingType.Base64 });
      const buffer = Array.from(atob(b64), (c) => c.charCodeAt(0));
      const { content, originalFilename } = await OvCore.decryptFile(k, buffer);
      const contentB64 = btoa(String.fromCharCode(...content));
      const outUri = FileSystem.cacheDirectory + originalFilename;
      await FileSystem.writeAsStringAsync(outUri, contentB64, { encoding: FileSystem.EncodingType.Base64 });
      await Sharing.shareAsync(outUri);
    } catch (e: any) { Alert.alert('Échec', 'Mauvais mot secret ou fichier invalide.'); }
  }

  async function openScanner() {
    if (!requireSecret()) return;
    if (!camPerm?.granted) {
      const r = await requestCamPerm();
      if (!r.granted) { Alert.alert('Caméra', 'Autorisez la caméra pour scanner un document.'); return; }
    }
    setScanOpen(true);
  }

  return (
    <SafeAreaView style={styles.container}>
      <View style={styles.header}>
        <TouchableOpacity onPress={() => router.back()} hitSlop={{ top: 10, bottom: 10, left: 10, right: 10 }}>
          <Ionicons name="close" size={24} color={Colors.textPrimary} />
        </TouchableOpacity>
        <Text style={styles.title}>Chiffrement</Text>
        <View style={{ width: 24 }} />
      </View>

      <FadeSlideIn style={{ flex: 1 }}>
      <ScrollView contentContainerStyle={styles.body} keyboardShouldPersistTaps="handled">
        {/* Hero */}
        <View style={styles.hero}>
          <LinearGradient colors={['#4F46E5', '#3B82F6', '#22D3EE']} start={{ x: 0, y: 0 }} end={{ x: 1, y: 1 }} style={styles.heroIcon}>
            <BrandMark size={40} stroke="#fff" />
          </LinearGradient>
          <Text style={styles.heroSub}>
            Un <Text style={styles.bold}>mot secret</Text> partagé, un message, et c'est chiffré. Envoyez-le sur n'importe quelle app.
          </Text>
        </View>

        {/* Mode switch */}
        <View style={styles.segment}>
          <TouchableOpacity style={[styles.segBtn, isEnc && styles.segActive]} onPress={() => { setMode('enc'); setResult(''); }}>
            <Ionicons name="lock-closed" size={17} color={isEnc ? '#fff' : Colors.textSecondary} />
            <Text style={[styles.segText, isEnc && styles.segTextActive]}>Chiffrer</Text>
          </TouchableOpacity>
          <TouchableOpacity style={[styles.segBtn, !isEnc && styles.segActive]} onPress={() => { setMode('dec'); setResult(''); }}>
            <Ionicons name="lock-open" size={17} color={!isEnc ? '#fff' : Colors.textSecondary} />
            <Text style={[styles.segText, !isEnc && styles.segTextActive]}>Déchiffrer</Text>
          </TouchableOpacity>
        </View>

        {/* Step 1 — secret */}
        <View style={styles.step}>
          <View style={styles.stepHead}>
            <View style={styles.stepNum}><Text style={styles.stepNumText}>1</Text></View>
            <Text style={styles.stepTitle}>Mot secret partagé</Text>
            <TouchableOpacity style={styles.genChip} onPress={async () => { try { const h = await OvCore.randomKeyHex(); setSecret(h.slice(0, 10)); setShowSecret(true); } catch {} }}>
              <Ionicons name="sparkles-outline" size={13} color={Colors.primary} />
              <Text style={styles.genText}>Générer</Text>
            </TouchableOpacity>
          </View>
          <View style={styles.field}>
            <Ionicons name="key-outline" size={19} color={Colors.textMuted} />
            <TextInput
              style={styles.fieldInput}
              placeholder="ex. notre-secret-42"
              placeholderTextColor={Colors.textMuted}
              value={secret}
              onChangeText={setSecret}
              secureTextEntry={!showSecret}
              autoCapitalize="none"
            />
            <TouchableOpacity onPress={() => setShowSecret(v => !v)} hitSlop={{ top: 10, bottom: 10, left: 10, right: 10 }}>
              <Ionicons name={showSecret ? 'eye-off-outline' : 'eye-outline'} size={19} color={Colors.textMuted} />
            </TouchableOpacity>
          </View>
          <Text style={styles.stepHint}>Le destinataire doit taper exactement le même mot secret.</Text>
        </View>

        {/* Step 2 — message */}
        <View style={styles.step}>
          <View style={styles.stepHead}>
            <View style={styles.stepNum}><Text style={styles.stepNumText}>2</Text></View>
            <Text style={styles.stepTitle}>{isEnc ? 'Votre message' : 'Message chiffré reçu'}</Text>
          </View>
          <TextInput
            style={styles.textArea}
            placeholder={isEnc ? 'Écrivez ce que vous voulez protéger…' : 'Collez ici le message chiffré (OV1|…)'}
            placeholderTextColor={Colors.textMuted}
            value={input}
            onChangeText={(t) => { setInput(t); setResult(''); }}
            multiline
            textAlignVertical="top"
          />
        </View>

        {/* Primary action */}
        <TouchableOpacity onPress={handleRun} disabled={busy} activeOpacity={0.9} style={styles.primaryWrap}>
          <LinearGradient colors={['#3B82F6', '#22D3EE']} start={{ x: 0, y: 0 }} end={{ x: 1, y: 1 }} style={styles.primary}>
            <Ionicons name={isEnc ? 'lock-closed' : 'lock-open'} size={20} color="#fff" />
            <Text style={styles.primaryText}>{busy ? '…' : isEnc ? 'Chiffrer le message' : 'Déchiffrer'}</Text>
          </LinearGradient>
        </TouchableOpacity>

        {/* Result */}
        {result ? (
          <View style={styles.resultBox}>
            <Text style={styles.resultLabel}>{isEnc ? 'Message chiffré' : 'Message déchiffré'}</Text>
            <Text style={styles.resultText} selectable>{result}</Text>
            <View style={styles.resultActions}>
              <TouchableOpacity style={styles.copyBtn} onPress={() => Clipboard.setStringAsync(result)}>
                <Ionicons name="copy-outline" size={18} color={Colors.primary} />
                <Text style={styles.copyText}>Copier</Text>
              </TouchableOpacity>
              {isEnc && (
                <TouchableOpacity style={styles.sendBtn} onPress={shareResult} activeOpacity={0.85}>
                  <Ionicons name="paper-plane" size={16} color="#fff" />
                  <Text style={styles.sendBtnText}>Envoyer partout</Text>
                </TouchableOpacity>
              )}
            </View>
          </View>
        ) : null}

        {/* Secondary — files / scan, same secret */}
        <Text style={styles.orLabel}>{isEnc ? 'Ou chiffrer un fichier' : 'Ou déchiffrer un fichier'}</Text>
        <View style={styles.secondaryRow}>
          {isEnc ? (
            <>
              <TouchableOpacity style={styles.secBtn} onPress={pickAndEncryptFile} activeOpacity={0.8}>
                <Ionicons name="document-lock-outline" size={20} color={Colors.primary} />
                <Text style={styles.secText}>Fichier</Text>
              </TouchableOpacity>
              <TouchableOpacity style={styles.secBtn} onPress={openScanner} activeOpacity={0.8}>
                <Ionicons name="scan-outline" size={20} color={Colors.primary} />
                <Text style={styles.secText}>Scanner</Text>
              </TouchableOpacity>
            </>
          ) : (
            <TouchableOpacity style={[styles.secBtn, { flex: 1 }]} onPress={pickAndDecryptFile} activeOpacity={0.8}>
              <Ionicons name="folder-open-outline" size={20} color={Colors.primary} />
              <Text style={styles.secText}>Ouvrir un fichier .ov</Text>
            </TouchableOpacity>
          )}
        </View>
      </ScrollView>
      </FadeSlideIn>

      {/* Document scanner */}
      <Modal visible={scanOpen} animationType="slide" onRequestClose={() => setScanOpen(false)}>
        <View style={styles.scanScreen}>
          <CameraView ref={cameraRef} style={{ flex: 1 }} facing="back" />
          <SafeAreaView style={styles.scanOverlay} edges={["top", "bottom"]} pointerEvents="box-none">
            <View style={styles.scanTop}>
              <TouchableOpacity style={styles.scanClose} onPress={() => setScanOpen(false)}>
                <Ionicons name="close" size={26} color="#fff" />
              </TouchableOpacity>
              <Text style={styles.scanHint}>Cadrez le document puis capturez</Text>
            </View>
            <View style={styles.scanFrame} />
            <View style={styles.scanBottom}>
              <TouchableOpacity
                style={styles.shutter}
                onPress={async () => {
                  const photo = await cameraRef.current?.takePictureAsync({ quality: 0.85 });
                  setScanOpen(false);
                  if (photo?.uri) {
                    try { await encryptAndShareUri(photo.uri, `scan_${Date.now().toString(36)}.jpg`); }
                    catch { Alert.alert('Échec', 'Chiffrement du scan impossible.'); }
                  }
                }}
              >
                <View style={styles.shutterInner} />
              </TouchableOpacity>
            </View>
          </SafeAreaView>
        </View>
      </Modal>
    </SafeAreaView>
  );
}

const styles = StyleSheet.create({
  container: { flex: 1, backgroundColor: Colors.background },
  header: {
    flexDirection: 'row', alignItems: 'center', justifyContent: 'space-between',
    paddingHorizontal: 16, paddingVertical: 14,
    borderBottomWidth: StyleSheet.hairlineWidth, borderBottomColor: Colors.separator,
  },
  title: { fontSize: 18, fontFamily: 'Roboto-Bold', color: Colors.textPrimary },
  body: { padding: 20, gap: 18, paddingBottom: 40 },

  hero: { alignItems: 'center', gap: 12 },
  heroIcon: {
    width: 72, height: 72, borderRadius: 22, alignItems: 'center', justifyContent: 'center',
    shadowColor: '#22D3EE', shadowOffset: { width: 0, height: 4 }, shadowOpacity: 0.4, shadowRadius: 14, elevation: 8,
  },
  heroSub: { fontSize: 14, fontFamily: 'Roboto-Regular', color: Colors.textSecondary, textAlign: 'center', lineHeight: 20, paddingHorizontal: 8 },
  bold: { fontFamily: 'Roboto-Bold', color: Colors.textPrimary },

  segment: { flexDirection: 'row', backgroundColor: Colors.surface, borderRadius: 14, padding: 4, gap: 4 },
  segBtn: { flex: 1, flexDirection: 'row', alignItems: 'center', justifyContent: 'center', gap: 8, paddingVertical: 12, borderRadius: 11 },
  segActive: { backgroundColor: Colors.primary },
  segText: { fontSize: 15, fontFamily: 'Roboto-Bold', color: Colors.textSecondary },
  segTextActive: { color: '#fff' },

  step: { gap: 10 },
  stepHead: { flexDirection: 'row', alignItems: 'center', gap: 10 },
  stepNum: { width: 22, height: 22, borderRadius: 11, backgroundColor: Colors.primary + '18', alignItems: 'center', justifyContent: 'center' },
  stepNumText: { fontSize: 12, fontFamily: 'Roboto-Bold', color: Colors.primary },
  stepTitle: { flex: 1, fontSize: 15, fontFamily: 'Roboto-Bold', color: Colors.textPrimary },
  stepHint: { fontSize: 12, fontFamily: 'Roboto-Regular', color: Colors.textMuted, paddingLeft: 2 },
  genChip: { flexDirection: 'row', alignItems: 'center', gap: 4, backgroundColor: Colors.primary + '15', borderRadius: 8, paddingHorizontal: 10, paddingVertical: 5 },
  genText: { fontSize: 12, fontFamily: 'Roboto-Medium', color: Colors.primary },

  field: {
    flexDirection: 'row', alignItems: 'center', gap: 10,
    backgroundColor: Colors.inputBg, borderRadius: 14, paddingHorizontal: 16, paddingVertical: 15,
    borderWidth: StyleSheet.hairlineWidth, borderColor: Colors.border,
  },
  fieldInput: { flex: 1, fontSize: 16, fontFamily: 'Roboto-Regular', color: Colors.textPrimary },
  textArea: {
    backgroundColor: Colors.inputBg, borderRadius: 14, padding: 16, minHeight: 130,
    fontSize: 15, fontFamily: 'Roboto-Regular', color: Colors.textPrimary, textAlignVertical: 'top',
    borderWidth: StyleSheet.hairlineWidth, borderColor: Colors.border,
  },

  primaryWrap: {
    borderRadius: 16, shadowColor: '#22D3EE', shadowOffset: { width: 0, height: 5 }, shadowOpacity: 0.4, shadowRadius: 14, elevation: 8,
  },
  primary: { flexDirection: 'row', alignItems: 'center', justifyContent: 'center', gap: 10, borderRadius: 16, paddingVertical: 17 },
  primaryText: { color: '#fff', fontFamily: 'Roboto-Bold', fontSize: 16 },

  resultBox: { backgroundColor: Colors.surface, borderRadius: 16, padding: 16, gap: 12, borderWidth: StyleSheet.hairlineWidth, borderColor: Colors.border },
  resultLabel: { fontSize: 12, fontFamily: 'Roboto-Bold', color: Colors.textSecondary, letterSpacing: 0.3 },
  resultText: { fontSize: 14, fontFamily: 'Roboto-Regular', color: Colors.textPrimary, lineHeight: 20 },
  resultActions: { flexDirection: 'row', alignItems: 'center', justifyContent: 'space-between' },
  copyBtn: { flexDirection: 'row', alignItems: 'center', gap: 6 },
  copyText: { color: Colors.primary, fontFamily: 'Roboto-Medium', fontSize: 14 },
  sendBtn: { flexDirection: 'row', alignItems: 'center', gap: 7, backgroundColor: Colors.primary, borderRadius: 12, paddingHorizontal: 16, paddingVertical: 10 },
  sendBtnText: { color: '#fff', fontFamily: 'Roboto-Bold', fontSize: 14 },

  orLabel: { fontSize: 12, fontFamily: 'Roboto-Medium', color: Colors.textMuted, textAlign: 'center', marginTop: 2 },
  secondaryRow: { flexDirection: 'row', gap: 12 },
  secBtn: {
    flex: 1, flexDirection: 'row', alignItems: 'center', justifyContent: 'center', gap: 8,
    paddingVertical: 15, borderRadius: 14, borderWidth: 1.5, borderColor: Colors.primary, backgroundColor: Colors.primary + '0D',
  },
  secText: { color: Colors.primary, fontFamily: 'Roboto-Bold', fontSize: 15 },

  scanScreen: { flex: 1, backgroundColor: '#000' },
  scanOverlay: { position: 'absolute', top: 0, left: 0, right: 0, bottom: 0, justifyContent: 'space-between' },
  scanTop: { alignItems: 'center', gap: 10, paddingTop: 8 },
  scanClose: { alignSelf: 'flex-start', margin: 12, padding: 8, backgroundColor: '#0008', borderRadius: 20 },
  scanHint: { color: '#fff', fontFamily: 'Roboto-Medium', fontSize: 14, backgroundColor: '#0006', paddingHorizontal: 14, paddingVertical: 6, borderRadius: 14 },
  scanFrame: { alignSelf: 'center', width: '82%', aspectRatio: 0.72, borderWidth: 2, borderColor: '#ffffffcc', borderRadius: 16 },
  scanBottom: { alignItems: 'center', paddingBottom: 24 },
  shutter: { width: 74, height: 74, borderRadius: 37, borderWidth: 4, borderColor: '#fff', alignItems: 'center', justifyContent: 'center' },
  shutterInner: { width: 58, height: 58, borderRadius: 29, backgroundColor: '#fff' },
});
