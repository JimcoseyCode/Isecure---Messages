import React, { useState, useCallback } from 'react';
import {
  ScrollView, StyleSheet, Text, Alert, Modal, Pressable,
  View, TextInput, TouchableOpacity,
} from 'react-native';
import { SafeAreaView } from 'react-native-safe-area-context';
import { useRouter, useFocusEffect } from 'expo-router';
import { Ionicons } from '@expo/vector-icons';
import { Colors } from '@/constants/colors';
import { S } from '@/constants/strings';
import { SettingsRow, SettingsSectionHeader, SettingsGroup } from '@/components/ui/SettingsRow';
import { GlassBackground } from '@/components/ui/Glass';
import { SlideToConfirm } from '@/components/ui/SlideToConfirm';
import { getSetting, setSetting, deleteAllData } from '@/lib/database/db';
import { exportArchive } from '@/lib/archive';
import * as SecureStore from 'expo-secure-store';
import { OvCore, Sms } from '@/lib/native/ovcore';

type PasswordModal = 'none' | 'set_login' | 'set_panic' | 'phone_number';

export default function SettingsScreen() {
  const router = useRouter();
  const [smsService, setSmsServiceState] = useState(true);
  const [vibration, setVibration] = useState(true);
  const [notifPreview, setNotifPreview] = useState(true);
  const [loginPassword, setLoginPassword] = useState(false);
  const [panicPassword, setPanicPassword] = useState(false);
  const [panicKeys, setPanicKeys] = useState(false);
  const [autoDestruct, setAutoDestruct] = useState(false);
  const [ovnyMode, setOvnyMode] = useState(false);
  const [fortressMode, setFortressMode] = useState(false);
  const [ovCompat, setOvCompat] = useState(false);
  const [base64, setBase64] = useState(false);
  const [base36, setBase36] = useState(true);
  const [autoLock, setAutoLock] = useState(false);
  const [antiScreenshot, setAntiScreenshot] = useState(false);

  const [modal, setModal] = useState<PasswordModal>('none');
  const [pwInput, setPwInput] = useState('');
  const [pwConfirm, setPwConfirm] = useState('');
  const [showPw, setShowPw] = useState(false);
  const [phoneInput, setPhoneInput] = useState('');
  const [countryCode] = useState('+33');

  // Password gate: Settings re-locks every time it's opened when a login
  // password is set, so nobody reaches your security options without it.
  const [unlocked, setUnlocked] = useState(false);
  const [gatePw, setGatePw] = useState('');
  const [gateErr, setGateErr] = useState('');
  const [gateShowPw, setGateShowPw] = useState(false);

  useFocusEffect(useCallback(() => {
    setUnlocked(false); setGatePw(''); setGateErr('');
    loadSettings();
  }, []));

  async function unlockSettings() {
    try {
      const salt = await SecureStore.getItemAsync('key_salt');
      if (!salt) { setUnlocked(true); return; }
      const { keyHex } = await OvCore.deriveFromPassword(gatePw, salt);
      const expected = await SecureStore.getItemAsync('master_key');
      if (keyHex === expected) { setUnlocked(true); setGatePw(''); setGateErr(''); }
      else setGateErr('Mot de passe incorrect.');
    } catch { setGateErr('Erreur de vérification.'); }
  }

  async function loadSettings() {
    setSmsServiceState((await getSetting('sms_service', '1')) === '1');
    setVibration((await getSetting('vibration', '1')) === '1');
    setNotifPreview((await getSetting('notif_preview', '1')) === '1');
    setLoginPassword((await getSetting('login_password', '0')) === '1');
    setPanicPassword((await getSetting('panic_password', '0')) === '1');
    setPanicKeys((await getSetting('panic_keys', '0')) === '1');
    setAutoDestruct((await getSetting('auto_destruct', '0')) === '1');
    setOvnyMode((await getSetting('ovny_mode', '0')) === '1');
    setFortressMode((await getSetting('fortress_mode', '0')) === '1');
    setOvCompat((await getSetting('ov_compat', '0')) === '1');
    setBase64((await getSetting('base64', '0')) === '1');
    setBase36((await getSetting('base36', '1')) === '1');
    setAutoLock((await getSetting('auto_lock', '0')) === '1');
    setAntiScreenshot((await getSetting('anti_screenshot', '0')) === '1');
    setPhoneInput(await getSetting('my_phone', ''));
  }

  async function toggle(key: string, value: boolean, setter: (v: boolean) => void) {
    setter(value);
    await setSetting(key, value ? '1' : '0');
  }

  async function handleSetLoginPassword(enable: boolean) {
    if (enable) {
      setPwInput(''); setPwConfirm(''); setShowPw(false);
      setModal('set_login');
    } else {
      Alert.alert('Désactiver le mot de passe', 'Votre app ne sera plus protégée.', [
        { text: 'Annuler', style: 'cancel' },
        { text: 'Désactiver', style: 'destructive', onPress: async () => {
          await setSetting('login_password', '0');
          await SecureStore.deleteItemAsync('master_key');
          await SecureStore.deleteItemAsync('key_salt');
          setLoginPassword(false);
        }},
      ]);
    }
  }

  async function confirmSetPassword() {
    if (pwInput.length < 6) { Alert.alert('Erreur', 'Minimum 6 caractères.'); return; }
    if (pwInput !== pwConfirm) { Alert.alert('Erreur', 'Les mots de passe ne correspondent pas.'); return; }
    const { keyHex, saltHex } = await OvCore.deriveFromPassword(pwInput, null);
    await SecureStore.setItemAsync('master_key', keyHex);
    await SecureStore.setItemAsync('key_salt', saltHex);
    await setSetting('login_password', '1');
    setLoginPassword(true);
    setModal('none');
  }

  async function confirmSetPanicPassword() {
    if (pwInput.length < 6) { Alert.alert('Erreur', 'Minimum 6 caractères.'); return; }
    await SecureStore.setItemAsync('panic_key', pwInput);
    await setSetting('panic_password', '1');
    setPanicPassword(true);
    setModal('none');
  }

  async function handlePanicKeys(enable: boolean) {
    if (enable) {
      Alert.alert('Mode Panique Clés', 'Ce mode détruit uniquement vos clés de chiffrement (pas les messages). Les messages deviennent illisibles.', [
        { text: 'Annuler', style: 'cancel' },
        { text: 'Activer', onPress: () => toggle('panic_keys', true, setPanicKeys) },
      ]);
    } else {
      toggle('panic_keys', false, setPanicKeys);
    }
  }

  // Irreversible total wipe. The slide-to-confirm gesture IS the confirmation.
  async function doNukeAll() {
    await deleteAllData();
    await SecureStore.deleteItemAsync('master_key');
    await SecureStore.deleteItemAsync('key_salt');
    await SecureStore.deleteItemAsync('panic_key');
    router.replace('/auth/onboarding');
  }

  return (
    <SafeAreaView style={styles.container} edges={["top","left","right"]}>
      <GlassBackground />

      {loginPassword && !unlocked && (
        <View style={styles.gate}>
          <View style={styles.gateIcon}><Ionicons name="lock-closed" size={34} color="#fff" /></View>
          <Text style={styles.gateTitle}>Réglages verrouillés</Text>
          <Text style={styles.gateSub}>Entrez votre mot de passe pour accéder aux réglages.</Text>
          <View style={[styles.gateField, gateErr ? { borderColor: Colors.error } : null]}>
            <Ionicons name="lock-closed-outline" size={18} color={Colors.textMuted} />
            <TextInput
              style={styles.gateInput} placeholder="Mot de passe" placeholderTextColor={Colors.textMuted}
              secureTextEntry={!gateShowPw} autoFocus value={gatePw}
              onChangeText={(t) => { setGatePw(t); setGateErr(''); }}
              onSubmitEditing={unlockSettings} returnKeyType="done"
            />
            <TouchableOpacity onPress={() => setGateShowPw(v => !v)} hitSlop={{ top: 10, bottom: 10, left: 10, right: 10 }}>
              <Ionicons name={gateShowPw ? 'eye-off-outline' : 'eye-outline'} size={18} color={Colors.textMuted} />
            </TouchableOpacity>
          </View>
          {gateErr ? <Text style={styles.gateErr}>{gateErr}</Text> : null}
          <TouchableOpacity style={styles.gateBtn} onPress={unlockSettings} activeOpacity={0.85}>
            <Text style={styles.gateBtnText}>Déverrouiller</Text>
          </TouchableOpacity>
        </View>
      )}

      <Text style={styles.pageTitle}>Réglages</Text>
      <ScrollView showsVerticalScrollIndicator={false} contentContainerStyle={{ paddingBottom: 110 }}>

        {/* GÉNÉRAL */}
        <SettingsSectionHeader title="Général" />
        <SettingsGroup>
          <SettingsRow icon="globe-outline" label="Langue de l'app" type="arrow"
            onPress={() => router.push('/tabs/settings/language')} />
          <SettingsRow icon="phone-portrait-outline" label="SMS intégré" type="toggle"
            value={smsService} onToggle={v => toggle('sms_service', v, setSmsServiceState)}
            subtitle="Envoyer via l'API SMS du système" />
          <SettingsRow icon="pulse-outline" label="Retour haptique" type="toggle"
            value={vibration} onToggle={v => toggle('vibration', v, setVibration)} />
          <SettingsRow icon="notifications-outline" label="Aperçu notifications" type="toggle"
            value={notifPreview} onToggle={v => toggle('notif_preview', v, setNotifPreview)}
            subtitle="Afficher le contenu sur l'écran verrouillé" />
          <SettingsRow icon="archive-outline" label="Performance fichiers" type="arrow"
            onPress={() => router.push('/tabs/settings/file-performance')} />
        </SettingsGroup>

        {/* CONNEXION */}
        <SettingsSectionHeader title="Connexion & Authentification" />
        <SettingsGroup>
          <SettingsRow icon="lock-closed-outline" label="Mot de passe de connexion" type="toggle"
            value={loginPassword} onToggle={handleSetLoginPassword}
            subtitle="Protège l'app avec un mot de passe + DEK chiffré" />
          <SettingsRow icon="flame-outline" label="Mode Panique" type="toggle"
            value={panicPassword} disabled={!loginPassword}
            onToggle={v => v ? (setPwInput(''), setModal('set_panic')) : toggle('panic_password', false, setPanicPassword)}
            subtitle="Mot de passe alternatif → destruction totale" />
          <SettingsRow icon="key-outline" label="Panique Clés uniquement" type="toggle"
            value={panicKeys} disabled={!loginPassword}
            onToggle={handlePanicKeys}
            subtitle="Détruit les clés seulement, messages conservés illisibles" />
          <SettingsRow icon="nuclear-outline" label="Auto-destruction (3 essais)" type="toggle"
            value={autoDestruct} disabled={!loginPassword}
            onToggle={v => toggle('auto_destruct', v, setAutoDestruct)}
            subtitle="Destruction après 3 mots de passe incorrects" />
          <SettingsRow icon="call-outline" label="Mon numéro de téléphone" type="arrow"
            onPress={() => setModal('phone_number')}
            subtitle={phoneInput || 'Non configuré'} />
        </SettingsGroup>

        {/* SÉCURITÉ */}
        <SettingsSectionHeader title="Sécurité & Chiffrement" />
        <SettingsGroup>
          <SettingsRow icon="eye-off-outline" label="Chiffrement forcé" type="toggle"
            value={ovnyMode} onToggle={v => toggle('ovny_mode', v, setOvnyMode)}
            subtitle="Force le chiffrement sur toutes les transmissions" />
          <SettingsRow icon="business-outline" label="Mode Forteresse" type="toggle"
            value={fortressMode} onToggle={v => toggle('fortress_mode', v, setFortressMode)}
            subtitle="Bloque les messages non chiffrés entrants" />
          <SettingsRow icon="git-compare-outline" label="Compatibilité OV Message" type="toggle"
            value={ovCompat} onToggle={v => { toggle('ov_compat', v, setOvCompat); if (v) Alert.alert('Mode démo', 'Interopérabilité OV Message — les messages utiliseront le format OV pour communiquer avec l’app OV Message d’origine.'); }}
            subtitle="Démo — échanger avec l’app OV Message d’origine" />
          <SettingsRow icon="bar-chart-outline" label="Encodage Base36 (GSM-7)" type="toggle"
            value={base36} onToggle={v => toggle('base36', v, setBase36)}
            subtitle="Compatible SMS standard" />
          <SettingsRow icon="code-slash-outline" label="Encodage Base64" type="toggle"
            value={base64} onToggle={v => toggle('base64', v, setBase64)}
            subtitle="Compatible apps externes" />
          <SettingsRow icon="time-outline" label="Verrouillage automatique" type="toggle"
            value={autoLock} disabled={!loginPassword}
            onToggle={v => toggle('auto_lock', v, setAutoLock)}
            subtitle="Verrouille après inactivité" />
          <SettingsRow icon="camera-off-outline" label="Anti-capture d'écran" type="toggle"
            value={antiScreenshot} onToggle={async v => { await toggle('anti_screenshot', v, setAntiScreenshot); Sms.setScreenSecure(v).catch(() => {}); }}
            subtitle="Bloque screenshots et aperçu multitâche" />
        </SettingsGroup>

        {/* OUTILS */}
        <SettingsSectionHeader title="Outils" />
        <SettingsGroup>
          <SettingsRow icon="shield-outline" label="Chiffrement universel" type="arrow"
            onPress={() => router.push('/modals/universal-encrypt')}
            subtitle="Chiffrer du texte pour n'importe quelle plateforme" />
          <SettingsRow icon="document-text-outline" label="Notes chiffrées" type="arrow"
            onPress={() => router.push('/modals/notes')} />
          <SettingsRow icon="cloud-upload-outline" label="Exporter mes conversations" type="arrow"
            subtitle="Archive (contacts, clés, messages) pour le coffre web"
            onPress={async () => {
              try { await exportArchive(); }
              catch (e: any) { Alert.alert('Export', e?.message ?? 'Échec de l\'export.'); }
            }} />
        </SettingsGroup>

        {/* ASSISTANCE */}
        <SettingsSectionHeader title="Assistance" />
        <SettingsGroup>
          <SettingsRow icon="information-circle-outline" label="Réception RCS" type="arrow"
            onPress={() => router.push('/tabs/settings/rcs')} />
          <SettingsRow icon="help-circle-outline" label="Aide" type="arrow"
            onPress={() => router.push('/tabs/settings/help')} />
          <SettingsRow icon="shield-outline" label="Permissions" type="arrow"
            onPress={() => router.push('/tabs/settings/permissions')} />
          <SettingsRow icon="document-text-outline" label="Politique de confidentialité" type="arrow" onPress={() => {}} />
          <SettingsRow icon="information-circle-outline" label="À propos" type="arrow" onPress={() => {}} />
        </SettingsGroup>

        {/* DANGER */}
        <SettingsSectionHeader title="Zone de danger" />
        <View style={styles.dangerCard}>
          <View style={styles.dangerHead}>
            <View style={styles.dangerIcon}>
              <Ionicons name="skull-outline" size={20} color={Colors.error} />
            </View>
            <View style={{ flex: 1 }}>
              <Text style={styles.dangerTitle}>Tout supprimer</Text>
              <Text style={styles.dangerSub}>Données, clés, contacts, messages — irréversible.</Text>
            </View>
          </View>
          <SlideToConfirm
            label="Glisser pour tout effacer"
            confirmedLabel="Suppression…"
            icon="trash"
            color={Colors.error}
            onConfirm={doNukeAll}
          />
        </View>

        <View style={{ height: 40 }} />
      </ScrollView>

      {/* Password modal */}
      <Modal visible={modal === 'set_login' || modal === 'set_panic'} transparent animationType="fade">
        <Pressable style={styles.overlay} onPress={() => setModal('none')}>
          <Pressable style={styles.modalCard} onPress={() => {}}>
            <View style={styles.modalIcon}>
              <Ionicons name={modal === 'set_panic' ? 'flame' : 'lock-closed'} size={28}
                color={modal === 'set_panic' ? Colors.error : Colors.primary} />
            </View>
            <Text style={styles.modalTitle}>
              {modal === 'set_login' ? 'Mot de passe principal' : 'Mot de passe panique'}
            </Text>
            <Text style={styles.modalSub}>
              {modal === 'set_panic'
                ? 'Ce mot de passe déclenche la destruction de toutes les données.'
                : 'Dérivé via Argon2id — jamais stocké en clair.'}
            </Text>
            <View style={styles.pwField}>
              <Ionicons name="lock-closed-outline" size={18} color={Colors.textMuted} />
              <TextInput
                style={styles.pwInput}
                placeholder="Mot de passe"
                placeholderTextColor={Colors.textMuted}
                value={pwInput}
                onChangeText={setPwInput}
                secureTextEntry={!showPw}
                autoCapitalize="none"
              />
              <TouchableOpacity onPress={() => setShowPw(v => !v)} hitSlop={{ top: 10, bottom: 10, left: 10, right: 10 }}>
                <Ionicons name={showPw ? 'eye-off-outline' : 'eye-outline'} size={18} color={Colors.textMuted} />
              </TouchableOpacity>
            </View>
            {modal === 'set_login' && (
              <View style={styles.pwField}>
                <Ionicons name="lock-closed-outline" size={18} color={Colors.textMuted} />
                <TextInput
                  style={styles.pwInput}
                  placeholder="Confirmer le mot de passe"
                  placeholderTextColor={Colors.textMuted}
                  value={pwConfirm}
                  onChangeText={setPwConfirm}
                  secureTextEntry={!showPw}
                  autoCapitalize="none"
                />
              </View>
            )}
            <View style={styles.modalBtns}>
              <TouchableOpacity style={styles.btnCancel} onPress={() => setModal('none')}>
                <Text style={styles.btnCancelText}>Annuler</Text>
              </TouchableOpacity>
              <TouchableOpacity
                style={[styles.btnOk, modal === 'set_panic' && { backgroundColor: Colors.error }]}
                onPress={modal === 'set_login' ? confirmSetPassword : confirmSetPanicPassword}
              >
                <Text style={styles.btnOkText}>Confirmer</Text>
              </TouchableOpacity>
            </View>
          </Pressable>
        </Pressable>
      </Modal>

      {/* Phone number modal */}
      <Modal visible={modal === 'phone_number'} transparent animationType="fade">
        <Pressable style={styles.overlay} onPress={() => setModal('none')}>
          <Pressable style={styles.modalCard} onPress={() => {}}>
            <Text style={styles.modalTitle}>Numéro de téléphone</Text>
            <Text style={styles.modalSub}>Utilisé pour l'appairage des clés par SMS</Text>
            <View style={styles.phoneRow}>
              <View style={styles.codeTag}><Text style={styles.codeText}>{countryCode}</Text></View>
              <View style={[styles.pwField, { flex: 1 }]}>
                <TextInput
                  style={styles.pwInput}
                  placeholder="06 12 34 56 78"
                  placeholderTextColor={Colors.textMuted}
                  value={phoneInput}
                  onChangeText={setPhoneInput}
                  keyboardType="phone-pad"
                />
              </View>
            </View>
            <View style={styles.modalBtns}>
              <TouchableOpacity style={styles.btnCancel} onPress={() => setModal('none')}>
                <Text style={styles.btnCancelText}>Annuler</Text>
              </TouchableOpacity>
              <TouchableOpacity style={styles.btnOk} onPress={async () => {
                const full = countryCode + phoneInput.replace(/\D/g, '');
                await setSetting('my_phone', full);
                await SecureStore.setItemAsync('my_phone', full);
                setModal('none');
              }}>
                <Text style={styles.btnOkText}>Enregistrer</Text>
              </TouchableOpacity>
            </View>
          </Pressable>
        </Pressable>
      </Modal>
    </SafeAreaView>
  );
}

const styles = StyleSheet.create({
  container: { flex: 1, backgroundColor: 'transparent' },
  dangerCard: {
    marginHorizontal: 16, marginTop: 4, backgroundColor: Colors.surface,
    borderRadius: 18, padding: 16, gap: 16,
    borderWidth: StyleSheet.hairlineWidth, borderColor: Colors.error + '33',
  },
  dangerHead: { flexDirection: 'row', alignItems: 'center', gap: 12 },
  dangerIcon: {
    width: 40, height: 40, borderRadius: 20, backgroundColor: Colors.error + '15',
    alignItems: 'center', justifyContent: 'center',
  },
  dangerTitle: { fontSize: 16, fontFamily: 'Roboto-Bold', color: Colors.error },
  dangerSub: { fontSize: 12, fontFamily: 'Roboto-Regular', color: Colors.textSecondary, marginTop: 2 },
  gate: {
    position: 'absolute', top: 0, left: 0, right: 0, bottom: 0, zIndex: 10,
    backgroundColor: Colors.backgroundSecondary,
    alignItems: 'center', justifyContent: 'center', padding: 32, gap: 12,
  },
  gateIcon: { width: 78, height: 78, borderRadius: 39, backgroundColor: Colors.primary, alignItems: 'center', justifyContent: 'center', marginBottom: 6 },
  gateTitle: { fontSize: 22, fontFamily: 'Roboto-Bold', color: Colors.textPrimary },
  gateSub: { fontSize: 14, fontFamily: 'Roboto-Regular', color: Colors.textSecondary, textAlign: 'center', lineHeight: 20, marginBottom: 8 },
  gateField: {
    flexDirection: 'row', alignItems: 'center', gap: 10, width: '100%',
    backgroundColor: Colors.surface, borderRadius: 14, paddingHorizontal: 16, paddingVertical: 15,
    borderWidth: StyleSheet.hairlineWidth, borderColor: Colors.border,
  },
  gateInput: { flex: 1, fontSize: 16, color: Colors.textPrimary, fontFamily: 'Roboto-Regular' },
  gateErr: { color: Colors.error, fontSize: 13, fontFamily: 'Roboto-Regular' },
  gateBtn: { width: '100%', backgroundColor: Colors.primary, borderRadius: 14, paddingVertical: 16, alignItems: 'center', marginTop: 4 },
  gateBtnText: { color: '#fff', fontFamily: 'Roboto-Bold', fontSize: 16 },
  pageTitle: {
    fontSize: 28, fontFamily: 'Roboto-Bold', color: Colors.textPrimary,
    paddingHorizontal: 20, paddingTop: 16, paddingBottom: 8,
  },
  overlay: {
    flex: 1, backgroundColor: Colors.overlayBg,
    alignItems: 'center', justifyContent: 'center', padding: 24,
  },
  modalCard: {
    backgroundColor: Colors.surfaceElevated, borderRadius: 22,
    padding: 24, width: '100%', gap: 14,
    borderWidth: 1, borderColor: Colors.border,
  },
  modalIcon: {
    width: 56, height: 56, borderRadius: 16, backgroundColor: Colors.surface,
    alignItems: 'center', justifyContent: 'center', alignSelf: 'center',
  },
  modalTitle: { fontSize: 18, fontFamily: 'Roboto-Bold', color: Colors.textPrimary, textAlign: 'center' },
  modalSub: { fontSize: 13, color: Colors.textSecondary, fontFamily: 'Roboto-Regular', textAlign: 'center', lineHeight: 18 },
  pwField: {
    flexDirection: 'row', alignItems: 'center', gap: 10,
    backgroundColor: Colors.inputBg, borderRadius: 14, paddingHorizontal: 14, paddingVertical: 2,
    borderWidth: 1, borderColor: Colors.border,
  },
  pwInput: {
    flex: 1, paddingVertical: 14,
    fontSize: 15, fontFamily: 'Roboto-Regular', color: Colors.textPrimary,
  },
  phoneRow: { flexDirection: 'row', gap: 10, alignItems: 'center' },
  codeTag: { backgroundColor: Colors.inputBg, borderRadius: 12, paddingHorizontal: 14, paddingVertical: 14, borderWidth: 1, borderColor: Colors.border },
  codeText: { fontFamily: 'Roboto-Medium', fontSize: 15, color: Colors.textPrimary },
  modalBtns: { flexDirection: 'row', gap: 10, marginTop: 4 },
  btnCancel: {
    flex: 1, borderWidth: 1.5, borderColor: Colors.border, borderRadius: 12,
    paddingVertical: 14, alignItems: 'center',
  },
  btnCancelText: { fontFamily: 'Roboto-Medium', fontSize: 15, color: Colors.textSecondary },
  btnOk: {
    flex: 1, backgroundColor: Colors.primary, borderRadius: 12,
    paddingVertical: 14, alignItems: 'center',
  },
  btnOkText: { fontFamily: 'Roboto-Bold', fontSize: 15, color: '#fff' },
});
