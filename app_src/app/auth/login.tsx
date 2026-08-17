import React, { useState, useRef, useEffect } from 'react';
import {
  View, Text, TextInput, TouchableOpacity, StyleSheet,
  KeyboardAvoidingView, Platform, ActivityIndicator, Animated, Easing,
} from 'react-native';
import { SafeAreaView } from 'react-native-safe-area-context';
import { useRouter } from 'expo-router';
import { Ionicons } from '@expo/vector-icons';
import { LinearGradient } from 'expo-linear-gradient';
import { BlurView } from 'expo-blur';
import * as SecureStore from 'expo-secure-store';
import { Colors } from '@/constants/colors';
import { OvCore } from '@/lib/native/ovcore';
import { getSetting, deleteAllData } from '@/lib/database/db';
import { FadeSlideIn } from '@/components/ui/Motion';
import { BrandMark } from '@/components/ui/BrandMark';

export default function LoginScreen() {
  const router = useRouter();
  const [password, setPassword] = useState('');
  const [showPassword, setShowPassword] = useState(false);
  const [error, setError] = useState('');
  const [loading, setLoading] = useState(false);

  // Slow breathing glow around the emblem — premium "alive" feel.
  const pulse = useRef(new Animated.Value(0)).current;
  useEffect(() => {
    Animated.loop(
      Animated.timing(pulse, { toValue: 1, duration: 2600, easing: Easing.inOut(Easing.ease), useNativeDriver: true })
    ).start();
  }, [pulse]);
  const ringScale = pulse.interpolate({ inputRange: [0, 1], outputRange: [0.9, 1.7] });
  const ringOpacity = pulse.interpolate({ inputRange: [0, 0.6, 1], outputRange: [0.55, 0.15, 0] });

  async function handleUnlock() {
    if (password.length < 6) {
      setError('Mot de passe trop court (min. 6 caractères).');
      return;
    }
    setLoading(true);
    setError('');
    try {
      const panicEnabled = (await getSetting('panic_password', '0')) === '1';
      if (panicEnabled) {
        const panicKey = await SecureStore.getItemAsync('panic_key');
        if (panicKey && password === panicKey) {
          await deleteAllData();
          await SecureStore.deleteItemAsync('master_key');
          await SecureStore.deleteItemAsync('key_salt');
          await SecureStore.deleteItemAsync('panic_key');
          await SecureStore.deleteItemAsync('my_phone');
          router.replace('/auth/onboarding');
          return;
        }
      }
      const hasPassword = (await getSetting('login_password', '0')) === '1';
      if (!hasPassword) { router.replace('/tabs'); return; }
      const storedSalt = await SecureStore.getItemAsync('key_salt');
      if (storedSalt) {
        const { keyHex } = await OvCore.deriveFromPassword(password, storedSalt);
        const expectedKey = await SecureStore.getItemAsync('master_key');
        if (keyHex === expectedKey) {
          await SecureStore.deleteItemAsync('pw_fail_count'); // reset on success
          router.replace('/tabs');
        } else {
          // Auto-destruction: wipe everything after 3 wrong passwords (white paper #45,55).
          const autoDestruct = (await getSetting('auto_destruct', '0')) === '1';
          const fails = parseInt((await SecureStore.getItemAsync('pw_fail_count')) ?? '0', 10) + 1;
          if (autoDestruct && fails >= 3) {
            await deleteAllData();
            await SecureStore.deleteItemAsync('master_key');
            await SecureStore.deleteItemAsync('key_salt');
            await SecureStore.deleteItemAsync('panic_key');
            await SecureStore.deleteItemAsync('my_phone');
            await SecureStore.deleteItemAsync('pw_fail_count');
            router.replace('/auth/onboarding');
            return;
          }
          await SecureStore.setItemAsync('pw_fail_count', String(fails));
          const left = autoDestruct ? 3 - fails : 0;
          setError(left > 0 ? `Mot de passe incorrect. ${left} essai${left > 1 ? 's' : ''} restant${left > 1 ? 's' : ''}.` : 'Mot de passe incorrect.');
        }
      } else {
        router.replace('/tabs');
      }
    } catch {
      setError('Une erreur est survenue.');
    } finally {
      setLoading(false);
    }
  }

  return (
    <View style={styles.root}>
      {/* Deep gradient base */}
      <LinearGradient
        colors={['#0B1A3A', '#0A1024', '#05070F']}
        start={{ x: 0.2, y: 0 }} end={{ x: 0.8, y: 1 }}
        style={StyleSheet.absoluteFill}
      />
      {/* Ambient aurora blobs, softened by a dark blur into glows */}
      <View style={[styles.blob, { backgroundColor: '#2E7CF6', top: -80, left: -60 }]} />
      <View style={[styles.blob, { backgroundColor: '#22D3EE', top: 120, right: -90, opacity: 0.35 }]} />
      <View style={[styles.blob, { backgroundColor: '#6366F1', bottom: -60, left: -40, opacity: 0.4 }]} />
      <BlurView intensity={90} tint="dark" style={StyleSheet.absoluteFill} pointerEvents="none" />
      <LinearGradient
        colors={['transparent', 'rgba(5,7,15,0.6)']}
        style={StyleSheet.absoluteFill} pointerEvents="none"
      />

      <SafeAreaView style={styles.safe}>
        <KeyboardAvoidingView style={styles.inner} behavior={Platform.OS === 'ios' ? 'padding' : undefined}>
          <FadeSlideIn style={styles.logoSection}>
            <View style={styles.emblemWrap}>
              <Animated.View style={[styles.pulseRing, { transform: [{ scale: ringScale }], opacity: ringOpacity }]} />
              <View style={styles.emblemGlow}>
                <LinearGradient
                  colors={['#4F46E5', '#3B82F6', '#22D3EE']}
                  start={{ x: 0, y: 0 }} end={{ x: 1, y: 1 }}
                  style={styles.emblem}
                >
                  <BrandMark size={54} stroke="#fff" style={{ marginTop: 4 }} />
                  {/* top specular sheen */}
                  <LinearGradient
                    colors={['rgba(255,255,255,0.4)', 'transparent']}
                    style={styles.emblemSheen} pointerEvents="none"
                  />
                </LinearGradient>
              </View>
            </View>
            <Text style={styles.title}>iSecure</Text>
            <Text style={styles.subtitle}>Chiffrement de bout en bout · Sans serveur</Text>
          </FadeSlideIn>

          <FadeSlideIn delay={120} style={styles.form}>
            <View style={[styles.fieldGlass, error ? styles.fieldError : null]}>
              <BlurView intensity={30} tint="dark" style={StyleSheet.absoluteFill} />
              <View style={styles.fieldRow}>
                <Ionicons name="lock-closed-outline" size={20} color="rgba(255,255,255,0.55)" />
                <TextInput
                  style={styles.input}
                  placeholder="Mot de passe"
                  placeholderTextColor="rgba(255,255,255,0.4)"
                  value={password}
                  onChangeText={(t) => { setPassword(t); setError(''); }}
                  secureTextEntry={!showPassword}
                  autoCapitalize="none"
                  returnKeyType="done"
                  onSubmitEditing={handleUnlock}
                />
                <TouchableOpacity onPress={() => setShowPassword(v => !v)} hitSlop={{ top: 12, bottom: 12, left: 12, right: 12 }}>
                  <Ionicons name={showPassword ? 'eye-off-outline' : 'eye-outline'} size={20} color="rgba(255,255,255,0.55)" />
                </TouchableOpacity>
              </View>
            </View>

            {error ? (
              <View style={styles.errorRow}>
                <Ionicons name="alert-circle" size={15} color={Colors.error} />
                <Text style={styles.errorText}>{error}</Text>
              </View>
            ) : null}

            <TouchableOpacity onPress={handleUnlock} disabled={loading} activeOpacity={0.9} style={styles.btnWrap}>
              <LinearGradient
                colors={loading ? ['#2B5DBF', '#1E9AB0'] : ['#3B82F6', '#22D3EE']}
                start={{ x: 0, y: 0 }} end={{ x: 1, y: 1 }}
                style={styles.btn}
              >
                <LinearGradient
                  colors={['rgba(255,255,255,0.35)', 'transparent']}
                  style={styles.btnSheen} pointerEvents="none"
                />
                {loading
                  ? <ActivityIndicator color="#fff" size="small" />
                  : <>
                      <Ionicons name="finger-print" size={19} color="#fff" />
                      <Text style={styles.btnText}>Déverrouiller</Text>
                    </>
                }
              </LinearGradient>
            </TouchableOpacity>
          </FadeSlideIn>

          <FadeSlideIn delay={220} style={styles.footer}>
            <View style={styles.badge}>
              <Ionicons name="shield-checkmark" size={13} color="#22D3EE" />
              <Text style={styles.footerText}>Post-quantique · ML-KEM-768 + X25519</Text>
            </View>
          </FadeSlideIn>
        </KeyboardAvoidingView>
      </SafeAreaView>
    </View>
  );
}

const styles = StyleSheet.create({
  root: { flex: 1, backgroundColor: '#05070F' },
  safe: { flex: 1 },
  inner: { flex: 1, justifyContent: 'space-between', paddingHorizontal: 28, paddingTop: 48, paddingBottom: 36 },

  blob: { position: 'absolute', width: 260, height: 260, borderRadius: 130, opacity: 0.5 },

  logoSection: { alignItems: 'center', gap: 18, marginTop: 40 },
  emblemWrap: { width: 140, height: 140, alignItems: 'center', justifyContent: 'center' },
  pulseRing: {
    position: 'absolute', width: 104, height: 104, borderRadius: 52,
    borderWidth: 2, borderColor: '#22D3EE',
  },
  emblemGlow: {
    shadowColor: '#22D3EE', shadowOffset: { width: 0, height: 0 },
    shadowOpacity: 0.7, shadowRadius: 24, elevation: 16, borderRadius: 30,
  },
  emblem: {
    width: 100, height: 100, borderRadius: 30,
    alignItems: 'center', justifyContent: 'center', overflow: 'hidden',
  },
  emblemSheen: { position: 'absolute', top: 0, left: 0, right: 0, height: 50 },
  title: {
    fontSize: 36, fontFamily: 'Roboto-Bold', color: '#fff', letterSpacing: 0.5,
    textShadowColor: 'rgba(34,211,238,0.5)', textShadowOffset: { width: 0, height: 0 }, textShadowRadius: 18,
  },
  subtitle: { fontSize: 13, fontFamily: 'Roboto-Regular', color: 'rgba(255,255,255,0.5)', textAlign: 'center' },

  form: { gap: 14 },
  fieldGlass: {
    borderRadius: 18, overflow: 'hidden',
    borderWidth: 1, borderColor: 'rgba(255,255,255,0.14)',
    backgroundColor: 'rgba(255,255,255,0.04)',
  },
  fieldError: { borderColor: Colors.error },
  fieldRow: { flexDirection: 'row', alignItems: 'center', gap: 12, paddingHorizontal: 18, paddingVertical: 18 },
  input: { flex: 1, fontSize: 16, color: '#fff', fontFamily: 'Roboto-Regular' },

  errorRow: { flexDirection: 'row', alignItems: 'center', gap: 6, paddingLeft: 4 },
  errorText: { color: Colors.error, fontSize: 13, fontFamily: 'Roboto-Regular' },

  btnWrap: {
    borderRadius: 18, marginTop: 4,
    shadowColor: '#22D3EE', shadowOffset: { width: 0, height: 6 },
    shadowOpacity: 0.5, shadowRadius: 16, elevation: 10,
  },
  btn: {
    borderRadius: 18, paddingVertical: 18, overflow: 'hidden',
    flexDirection: 'row', alignItems: 'center', justifyContent: 'center', gap: 10,
  },
  btnSheen: { position: 'absolute', top: 0, left: 0, right: 0, height: 28 },
  btnText: { color: '#fff', fontFamily: 'Roboto-Bold', fontSize: 16, letterSpacing: 0.3 },

  footer: { alignItems: 'center' },
  badge: {
    flexDirection: 'row', alignItems: 'center', gap: 7,
    backgroundColor: 'rgba(255,255,255,0.05)', borderWidth: 1, borderColor: 'rgba(255,255,255,0.1)',
    borderRadius: 20, paddingHorizontal: 14, paddingVertical: 8,
  },
  footerText: { fontSize: 11, color: 'rgba(255,255,255,0.6)', fontFamily: 'Roboto-Medium', letterSpacing: 0.2 },
});
