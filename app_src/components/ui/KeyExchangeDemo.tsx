import React, { useEffect, useRef, useState } from 'react';
import { View, Text, StyleSheet, Animated, Easing } from 'react-native';
import { Ionicons } from '@expo/vector-icons';
import { Colors } from '@/constants/colors';

/**
 * Simple looping demo of the hybrid key exchange, for the Help page:
 *  0 → you emit your public key
 *  1 → it travels to your contact
 *  2 → the contact answers (encapsulated response)
 *  3 → both devices derive the same secret + matching SAS
 * Uses the built-in Animated API — no extra dependency.
 */
const CAPTIONS = [
  'Vous envoyez votre clé publique',
  'Votre contact la reçoit',
  'Il renvoie sa réponse chiffrée',
  'Même clé secrète des deux côtés ✓',
];

export function KeyExchangeDemo() {
  const [step, setStep] = useState(0);
  const travel = useRef(new Animated.Value(0)).current; // 0 = left phone, 1 = right
  const done = useRef(new Animated.Value(0)).current;    // shared-key reveal

  useEffect(() => {
    let mounted = true;
    let i = 0;
    function run() {
      if (!mounted) return;
      setStep(i);
      if (i === 1) {
        Animated.timing(travel, { toValue: 1, duration: 700, easing: Easing.inOut(Easing.ease), useNativeDriver: true }).start();
      } else if (i === 2) {
        Animated.timing(travel, { toValue: 0, duration: 700, easing: Easing.inOut(Easing.ease), useNativeDriver: true }).start();
      } else if (i === 3) {
        Animated.timing(done, { toValue: 1, duration: 400, useNativeDriver: true }).start();
      } else {
        travel.setValue(0);
        done.setValue(0);
      }
      i = (i + 1) % 4;
      setTimeout(run, i === 1 ? 1400 : 1300);
    }
    const t = setTimeout(run, 400);
    return () => { mounted = false; clearTimeout(t); };
  }, []);

  const tokenX = travel.interpolate({ inputRange: [0, 1], outputRange: [0, 168] });
  const bothLocked = step === 3;

  return (
    <View style={styles.wrap}>
      <View style={styles.stage}>
        {/* You */}
        <Phone label="Vous" active={step === 0 || bothLocked} locked={bothLocked} />

        {/* Travelling token */}
        <Animated.View style={[styles.token, { transform: [{ translateX: tokenX }] }]}>
          <Ionicons name={step === 2 ? 'lock-closed' : 'key'} size={16} color="#fff" />
        </Animated.View>

        {/* Contact */}
        <Phone label="Contact" active={step === 1 || bothLocked} locked={bothLocked} />
      </View>

      {/* Shared key + SAS reveal */}
      <Animated.View style={[styles.sas, { opacity: done }]}>
        <Ionicons name="shield-checkmark" size={14} color={Colors.success} />
        <Text style={styles.sasText}>Clé commune · SAS A3F9 1C7E 4B20</Text>
      </Animated.View>

      <Text style={styles.caption}>{CAPTIONS[step]}</Text>
    </View>
  );
}

function Phone({ label, active, locked }: { label: string; active: boolean; locked: boolean }) {
  return (
    <View style={styles.phoneCol}>
      <View style={[styles.phone, active && styles.phoneActive]}>
        <Ionicons
          name={locked ? 'lock-closed' : 'phone-portrait-outline'}
          size={26}
          color={locked ? Colors.success : active ? Colors.primary : Colors.textMuted}
        />
      </View>
      <Text style={styles.phoneLabel}>{label}</Text>
    </View>
  );
}

const styles = StyleSheet.create({
  wrap: {
    backgroundColor: Colors.surface, borderRadius: 14, padding: 16, gap: 12,
    borderWidth: StyleSheet.hairlineWidth, borderColor: Colors.border, alignItems: 'center',
  },
  stage: { flexDirection: 'row', alignItems: 'center', justifyContent: 'space-between', width: 240, height: 68 },
  phoneCol: { alignItems: 'center', gap: 6, width: 60 },
  phone: {
    width: 52, height: 52, borderRadius: 14, alignItems: 'center', justifyContent: 'center',
    backgroundColor: Colors.backgroundSecondary, borderWidth: 1.5, borderColor: Colors.border,
  },
  phoneActive: { borderColor: Colors.primary, backgroundColor: `${Colors.primary}14` },
  phoneLabel: { fontSize: 11, color: Colors.textSecondary, fontFamily: 'Roboto-Medium' },
  token: {
    position: 'absolute', left: 46, width: 28, height: 28, borderRadius: 14,
    backgroundColor: Colors.primary, alignItems: 'center', justifyContent: 'center',
    shadowColor: Colors.primary, shadowOpacity: 0.5, shadowRadius: 6, shadowOffset: { width: 0, height: 2 },
    elevation: 4,
  },
  sas: {
    flexDirection: 'row', alignItems: 'center', gap: 6,
    backgroundColor: Colors.successBg, borderRadius: 10, paddingHorizontal: 12, paddingVertical: 6,
  },
  sasText: { fontSize: 12, color: Colors.success, fontFamily: 'Roboto-Medium' },
  caption: { fontSize: 13, color: Colors.textPrimary, fontFamily: 'Roboto-Medium', textAlign: 'center' },
});
