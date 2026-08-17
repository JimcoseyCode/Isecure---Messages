import React, { useState, useEffect } from 'react';
import {
  View, Text, TextInput, TouchableOpacity, StyleSheet,
  KeyboardAvoidingView, Platform, ScrollView, Alert,
} from 'react-native';
import { SafeAreaView } from 'react-native-safe-area-context';
import { useRouter, useLocalSearchParams } from 'expo-router';
import { Ionicons } from '@expo/vector-icons';
import { Colors } from '@/constants/colors';
import { S } from '@/constants/strings';
import {
  insertContact, updateContact, updateContactKeyPool, getContact,
} from '@/lib/database/db';
import { OvCore } from '@/lib/native/ovcore';
import { FadeSlideIn } from '@/components/ui/Motion';

const COUNTRY_CODES = ['+33', '+1', '+44', '+49', '+34', '+39', '+32', '+41', '+351', '+55', '+212', '+216'];

export default function AddContactModal() {
  const router = useRouter();
  const { contactId } = useLocalSearchParams<{ contactId?: string }>();
  const isEdit = !!contactId;

  const [name, setName] = useState('');
  const [countryCode, setCountryCode] = useState('+33');
  const [phone, setPhone] = useState('');
  const [showCodes, setShowCodes] = useState(false);
  const [keyHex, setKeyHex] = useState('');
  const [keyPool, setKeyPool] = useState<string[]>([]);
  const [saving, setSaving] = useState(false);

  useEffect(() => {
    if (isEdit) {
      getContact(parseInt(contactId!)).then((c) => {
        if (!c) return;
        setName(c.name);
        const digits = c.phone.replace(/^\+\d{1,3}/, '');
        const code = c.phone.replace(digits, '');
        setCountryCode(code || '+33');
        setPhone(digits);
        setKeyHex(c.key_hex ?? '');
        if (c.key_pool) {
          try { setKeyPool(JSON.parse(c.key_pool)); } catch {}
        }
      });
    }
  }, [isEdit, contactId]);

  function handleGenerateKey() {
    Alert.alert(
      'Générer une clé',
      isEdit
        ? 'Attention : régénérer une clé rend illisibles les messages déjà échangés. Continuer ?'
        : 'Une nouvelle clé de chiffrement va être générée.',
      [
        { text: S.cancel, style: 'cancel' },
        {
          text: 'Générer',
          onPress: async () => {
            const newKey = await OvCore.randomKeyHex();
            const pool = await OvCore.deriveKeyPool(newKey, 500);
            setKeyHex(newKey);
            setKeyPool(pool);
          },
        },
      ]
    );
  }

  async function handleSave() {
    if (!name.trim() || !phone.trim()) {
      Alert.alert(S.error, 'Nom et numéro requis.');
      return;
    }
    const fullPhone = countryCode + phone.replace(/\D/g, '');
    setSaving(true);
    try {
      if (isEdit) {
        const id = parseInt(contactId!);
        await updateContact(id, name.trim(), fullPhone);
        if (keyHex) {
          await updateContactKeyPool(id, keyHex, keyPool, 0);
        }
      } else {
        await insertContact({
          name: name.trim(),
          phone: fullPhone,
          key_hex: keyHex || null,
          key_pool: keyPool.length > 0 ? JSON.stringify(keyPool) : null,
          current_key_index: 0,
          is_blocked: 0,
          is_pinned: 0,
          ephemeral_duration: 0,
        });
      }
      router.back();
    } catch (e: any) {
      Alert.alert(S.error, e?.message ?? 'Une erreur est survenue.');
    } finally {
      setSaving(false);
    }
  }

  return (
    <SafeAreaView style={styles.container}>
      <KeyboardAvoidingView style={{ flex: 1 }} behavior={Platform.OS === 'ios' ? 'padding' : undefined}>
        <View style={styles.header}>
          <TouchableOpacity onPress={() => router.back()}>
            <Ionicons name="arrow-back" size={22} color={Colors.textPrimary} />
          </TouchableOpacity>
          <Text style={styles.title}>{isEdit ? 'Modifier le contact' : S.addContact}</Text>
        </View>

        <FadeSlideIn style={{ flex: 1 }}>
        <ScrollView contentContainerStyle={styles.body}>
          <TextInput
            style={styles.input}
            placeholder="Nom"
            placeholderTextColor={Colors.textMuted}
            value={name}
            onChangeText={setName}
          />

          <View style={styles.phoneRow}>
            <TouchableOpacity style={styles.codeBtn} onPress={() => setShowCodes((v) => !v)}>
              <Text style={styles.codeText}>{countryCode} ▾</Text>
            </TouchableOpacity>
            <TextInput
              style={[styles.input, { flex: 1 }]}
              placeholder="Numéro"
              placeholderTextColor={Colors.textMuted}
              value={phone}
              onChangeText={setPhone}
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

          {/* Key section */}
          <View style={styles.keySection}>
            {keyHex ? (
              <View style={styles.keyInfo}>
                <Ionicons name="lock-closed" size={18} color={Colors.primary} />
                <Text style={styles.keyInfoText}>
                  Clé configurée — {keyPool.length > 0 ? `${keyPool.length} clés dans le pool` : 'clé unique'}
                </Text>
              </View>
            ) : (
              <View style={styles.keyInfo}>
                <Ionicons name="lock-open-outline" size={18} color={Colors.textMuted} />
                <Text style={[styles.keyInfoText, { color: Colors.textMuted }]}>Aucune clé configurée</Text>
              </View>
            )}
            <TouchableOpacity style={styles.keyBtn} onPress={handleGenerateKey} activeOpacity={0.8}>
              <Text style={styles.keyBtnText}>Générer une clé</Text>
            </TouchableOpacity>
          </View>

          <TouchableOpacity style={styles.saveBtn} onPress={handleSave} disabled={saving} activeOpacity={0.85}>
            <Text style={styles.saveBtnText}>{saving ? S.loading : S.save}</Text>
          </TouchableOpacity>
        </ScrollView>
        </FadeSlideIn>
      </KeyboardAvoidingView>
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
  body: { padding: 20, gap: 14 },
  input: {
    backgroundColor: Colors.inputBg, borderRadius: 12,
    paddingHorizontal: 16, paddingVertical: 14,
    fontSize: 15, fontFamily: 'Roboto-Regular', color: Colors.textPrimary,
  },
  phoneRow: { flexDirection: 'row', gap: 10 },
  codeBtn: {
    backgroundColor: Colors.inputBg, borderRadius: 12,
    paddingHorizontal: 14, paddingVertical: 14, justifyContent: 'center',
  },
  codeText: { fontFamily: 'Roboto-Medium', fontSize: 15, color: Colors.textPrimary },
  dropdown: {
    backgroundColor: Colors.background, borderRadius: 12,
    elevation: 6, borderWidth: 1, borderColor: Colors.border, overflow: 'hidden',
  },
  dropdownItem: { paddingHorizontal: 16, paddingVertical: 14, borderBottomWidth: 1, borderBottomColor: Colors.separator },
  dropdownText: { fontSize: 15, fontFamily: 'Roboto-Regular', color: Colors.textPrimary },
  keySection: { gap: 12, paddingTop: 8 },
  keyInfo: { flexDirection: 'row', alignItems: 'center', gap: 8 },
  keyInfoText: { fontSize: 14, fontFamily: 'Roboto-Regular', color: Colors.primary },
  keyBtn: {
    borderWidth: 1.5, borderColor: Colors.primary, borderRadius: 12,
    paddingVertical: 14, alignItems: 'center',
  },
  keyBtnText: { color: Colors.primary, fontFamily: 'Roboto-Medium', fontSize: 15 },
  saveBtn: {
    backgroundColor: Colors.primary, borderRadius: 14,
    paddingVertical: 16, alignItems: 'center', marginTop: 8,
  },
  saveBtnText: { color: Colors.textWhite, fontFamily: 'Roboto-Bold', fontSize: 16 },
});
