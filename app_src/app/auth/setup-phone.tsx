import React, { useState, useEffect } from 'react';
import {
  View, Text, TextInput, TouchableOpacity, StyleSheet,
  KeyboardAvoidingView, Platform, ScrollView, PermissionsAndroid,
} from 'react-native';
import { SafeAreaView } from 'react-native-safe-area-context';
import { useRouter } from 'expo-router';
import { Ionicons } from '@expo/vector-icons';
import { Colors } from '@/constants/colors';
import { setSetting } from '@/lib/database/db';
import * as SecureStore from 'expo-secure-store';
import { OvCore, SimInfo } from '@/lib/native/ovcore';

const COUNTRY_CODES = ['+33', '+1', '+44', '+49', '+34', '+39', '+32', '+41', '+351', '+55'];

function normalize(raw: string, code: string): string {
  const d = raw.replace(/\D/g, '');
  if (raw.trim().startsWith('+')) return '+' + d;
  if (d.startsWith('00')) return '+' + d.slice(2);
  if (d.startsWith('0')) return code + d.slice(1);
  return code + d;
}

export default function SetupProfileScreen() {
  const router = useRouter();
  const [firstName, setFirstName] = useState('');
  const [lastName, setLastName] = useState('');
  const [countryCode, setCountryCode] = useState('+33');
  const [phone, setPhone] = useState('');
  const [showCodes, setShowCodes] = useState(false);
  const [sims, setSims] = useState<SimInfo[]>([]);
  const [error, setError] = useState('');

  // On mount: ask for phone permission, read SIM subscriptions, pre-fill.
  useEffect(() => {
    (async () => {
      try {
        if (Platform.OS === 'android') {
          await PermissionsAndroid.requestMultiple([
            'android.permission.READ_PHONE_STATE' as any,
            'android.permission.READ_PHONE_NUMBERS' as any,
          ]);
        }
        const list = await OvCore.getSimNumbers();
        setSims(list);
        const withNumber = list.find((s) => s.number && s.number.length >= 6);
        if (withNumber) setPhone(withNumber.number);
      } catch { /* manual entry fallback */ }
    })();
  }, []);

  function pickSim(s: SimInfo) {
    if (s.number && s.number.length >= 6) setPhone(s.number);
  }

  async function handleContinue() {
    if (!firstName.trim()) { setError('Entrez votre prénom.'); return; }
    if (phone.replace(/\D/g, '').length < 6) { setError('Numéro de téléphone invalide.'); return; }
    const full = normalize(phone, countryCode);
    await setSetting('first_name', firstName.trim());
    await setSetting('last_name', lastName.trim());
    await setSetting('my_phone', full);
    await setSetting('onboarding_done', '1');
    await SecureStore.setItemAsync('my_phone', full);
    router.replace('/tabs');
  }

  return (
    <SafeAreaView style={styles.container} edges={['top', 'bottom']}>
      <KeyboardAvoidingView style={{ flex: 1 }} behavior={Platform.OS === 'ios' ? 'padding' : undefined}>
        <ScrollView contentContainerStyle={styles.body} keyboardShouldPersistTaps="handled">
          <View style={styles.logoDot}>
            <Ionicons name="shield-checkmark" size={30} color="#fff" />
          </View>
          <Text style={styles.title}>Créez votre profil</Text>
          <Text style={styles.subtitle}>
            Vos informations restent sur cet appareil. Aucun serveur, aucun compte.
          </Text>

          <View style={styles.card}>
            <TextInput
              style={styles.field}
              placeholder="Prénom"
              placeholderTextColor={Colors.textMuted}
              value={firstName}
              onChangeText={(t) => { setFirstName(t); setError(''); }}
              autoCapitalize="words"
            />
            <View style={styles.divider} />
            <TextInput
              style={styles.field}
              placeholder="Nom (facultatif)"
              placeholderTextColor={Colors.textMuted}
              value={lastName}
              onChangeText={setLastName}
              autoCapitalize="words"
            />
          </View>

          <Text style={styles.sectionLabel}>Votre numéro</Text>
          <View style={styles.phoneRow}>
            <TouchableOpacity style={styles.codeBtn} onPress={() => setShowCodes((v) => !v)}>
              <Text style={styles.codeText}>{countryCode} ▾</Text>
            </TouchableOpacity>
            <TextInput
              style={styles.phoneField}
              placeholder="Numéro de téléphone"
              placeholderTextColor={Colors.textMuted}
              value={phone}
              onChangeText={(t) => { setPhone(t); setError(''); }}
              keyboardType="phone-pad"
            />
          </View>

          {showCodes && (
            <View style={styles.dropdown}>
              {COUNTRY_CODES.map((c) => (
                <TouchableOpacity key={c} style={styles.dropdownItem} onPress={() => { setCountryCode(c); setShowCodes(false); }}>
                  <Text style={styles.dropdownText}>{c}</Text>
                </TouchableOpacity>
              ))}
            </View>
          )}

          {/* Dual-SIM picker: only when 2+ subscriptions are present. */}
          {sims.length > 1 && (
            <>
              <Text style={styles.sectionLabel}>Choisir la SIM détectée</Text>
              {sims.map((s) => (
                <TouchableOpacity key={s.slot} style={styles.simRow} onPress={() => pickSim(s)}>
                  <Ionicons name="card-outline" size={20} color={Colors.primary} />
                  <View style={{ flex: 1 }}>
                    <Text style={styles.simName}>{s.carrier || s.displayName || `SIM ${s.slot + 1}`}</Text>
                    <Text style={styles.simNum}>{s.number || 'Numéro masqué par l’opérateur'}</Text>
                  </View>
                  {phone === s.number && s.number ? (
                    <Ionicons name="checkmark-circle" size={20} color={Colors.success} />
                  ) : null}
                </TouchableOpacity>
              ))}
            </>
          )}

          {error ? <Text style={styles.error}>{error}</Text> : null}
        </ScrollView>

        <View style={styles.footer}>
          <TouchableOpacity style={styles.btn} onPress={handleContinue} activeOpacity={0.85}>
            <Text style={styles.btnText}>Continuer</Text>
          </TouchableOpacity>
        </View>
      </KeyboardAvoidingView>
    </SafeAreaView>
  );
}

const styles = StyleSheet.create({
  container: { flex: 1, backgroundColor: Colors.background },
  body: { padding: 28, paddingTop: 12, gap: 14 },
  logoDot: {
    width: 64, height: 64, borderRadius: 32, backgroundColor: Colors.primary,
    alignItems: 'center', justifyContent: 'center', alignSelf: 'center', marginBottom: 6,
  },
  title: { fontSize: 28, fontFamily: 'Roboto-Bold', color: Colors.textPrimary, textAlign: 'center' },
  subtitle: {
    fontSize: 14, fontFamily: 'Roboto-Regular', color: Colors.textSecondary,
    textAlign: 'center', lineHeight: 20, marginBottom: 10,
  },
  card: {
    backgroundColor: Colors.backgroundSecondary, borderRadius: 14,
    borderWidth: StyleSheet.hairlineWidth, borderColor: Colors.border,
  },
  field: { paddingHorizontal: 16, paddingVertical: 15, fontSize: 16, color: Colors.textPrimary, fontFamily: 'Roboto-Regular' },
  divider: { height: StyleSheet.hairlineWidth, backgroundColor: Colors.border, marginLeft: 16 },
  sectionLabel: {
    fontSize: 12, fontFamily: 'Roboto-Medium', color: Colors.textMuted,
    letterSpacing: 0.5, textTransform: 'uppercase', marginTop: 8, marginLeft: 4,
  },
  phoneRow: { flexDirection: 'row', gap: 10 },
  codeBtn: {
    backgroundColor: Colors.backgroundSecondary, borderRadius: 12,
    paddingHorizontal: 14, justifyContent: 'center',
    borderWidth: StyleSheet.hairlineWidth, borderColor: Colors.border,
  },
  codeText: { color: Colors.textPrimary, fontFamily: 'Roboto-Medium', fontSize: 15 },
  phoneField: {
    flex: 1, backgroundColor: Colors.backgroundSecondary, borderRadius: 12,
    paddingHorizontal: 16, paddingVertical: 15, fontSize: 16,
    color: Colors.textPrimary, fontFamily: 'Roboto-Regular',
    borderWidth: StyleSheet.hairlineWidth, borderColor: Colors.border,
  },
  dropdown: {
    backgroundColor: Colors.surface, borderRadius: 12, overflow: 'hidden',
    borderWidth: StyleSheet.hairlineWidth, borderColor: Colors.border,
  },
  dropdownItem: { paddingHorizontal: 16, paddingVertical: 13, borderBottomWidth: StyleSheet.hairlineWidth, borderBottomColor: Colors.separator },
  dropdownText: { fontSize: 15, fontFamily: 'Roboto-Regular', color: Colors.textPrimary },
  simRow: {
    flexDirection: 'row', alignItems: 'center', gap: 12,
    backgroundColor: Colors.backgroundSecondary, borderRadius: 12,
    paddingHorizontal: 16, paddingVertical: 14,
    borderWidth: StyleSheet.hairlineWidth, borderColor: Colors.border,
  },
  simName: { fontSize: 15, fontFamily: 'Roboto-Medium', color: Colors.textPrimary },
  simNum: { fontSize: 13, fontFamily: 'Roboto-Regular', color: Colors.textSecondary, marginTop: 1 },
  error: { color: Colors.error, fontSize: 13, fontFamily: 'Roboto-Regular', textAlign: 'center', marginTop: 4 },
  footer: { padding: 24, paddingTop: 8 },
  btn: {
    backgroundColor: Colors.primary, borderRadius: 14,
    paddingVertical: 16, alignItems: 'center',
  },
  btnText: { color: '#fff', fontFamily: 'Roboto-Bold', fontSize: 16 },
});
