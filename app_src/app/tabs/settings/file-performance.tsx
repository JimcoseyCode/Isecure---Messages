import React, { useState, useCallback } from 'react';
import {
  View, Text, TouchableOpacity, StyleSheet, ScrollView,
} from 'react-native';
import { SafeAreaView } from 'react-native-safe-area-context';
import { useRouter } from 'expo-router';
import { Ionicons } from '@expo/vector-icons';
import { useFocusEffect } from 'expo-router';
import { Colors } from '@/constants/colors';
import { getSetting, setSetting } from '@/lib/database/db';

const OPTIONS = [
  {
    value: '10',
    label: '10 MB (Recommandé)',
    sublabel: 'Compatible avec tous les téléphones.',
    icon: 'document-outline' as const,
    recommended: true,
  },
  {
    value: '25',
    label: '25 MB',
    sublabel: 'Demande une mémoire correcte. Adapté à la plupart des téléphones.',
    icon: 'documents-outline' as const,
    recommended: false,
  },
  {
    value: '50',
    label: '50 MB (Maximum)',
    sublabel: 'Recommandé sur téléphones disposant de RAM importante. Peut saturer la mémoire sur appareils anciens.',
    icon: 'rocket-outline' as const,
    recommended: false,
  },
];

export default function FilePerformanceScreen() {
  const router = useRouter();
  const [selected, setSelected] = useState('10');

  useFocusEffect(useCallback(() => {
    getSetting('file_max_mb', '10').then(setSelected);
  }, []));

  async function handleSave() {
    await setSetting('file_max_mb', selected);
    router.back();
  }

  return (
    <SafeAreaView style={styles.container}>
      <View style={styles.header}>
        <TouchableOpacity onPress={() => router.back()}>
          <Ionicons name="arrow-back" size={22} color={Colors.textPrimary} />
        </TouchableOpacity>
        <Text style={styles.title}>Performances fichiers</Text>
      </View>

      <ScrollView contentContainerStyle={styles.body}>
        <View style={styles.infoBox}>
          <Text style={styles.infoText}>
            Choisissez la taille maximale des fichiers que vous pouvez chiffrer ou déchiffrer. Une valeur plus élevée demande plus de RAM.
          </Text>
          <Text style={styles.infoSubtext}>
            Choisissez une valeur adaptée à la mémoire disponible sur votre téléphone.
          </Text>
        </View>

        <View style={styles.options}>
          {OPTIONS.map((opt) => {
            const isSelected = selected === opt.value;
            return (
              <TouchableOpacity
                key={opt.value}
                style={[styles.optionRow, isSelected && styles.optionRowSelected]}
                onPress={() => setSelected(opt.value)}
                activeOpacity={0.8}
              >
                <Ionicons
                  name={opt.icon}
                  size={28}
                  color={isSelected ? Colors.textWhite : Colors.textSecondary}
                  style={styles.optionIcon}
                />
                <View style={styles.optionContent}>
                  <Text style={[styles.optionLabel, isSelected && styles.optionLabelSelected]}>
                    {opt.label}
                  </Text>
                  <Text style={[styles.optionSublabel, isSelected && styles.optionSublabelSelected]}>
                    {opt.sublabel}
                  </Text>
                </View>
                {isSelected && <Ionicons name="checkmark-circle" size={24} color={Colors.textWhite} />}
              </TouchableOpacity>
            );
          })}
        </View>

        <TouchableOpacity style={styles.saveBtn} onPress={handleSave} activeOpacity={0.85}>
          <Text style={styles.saveBtnText}>Sauvegarder</Text>
        </TouchableOpacity>
      </ScrollView>
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
  body: { padding: 16, gap: 16 },
  infoBox: {
    backgroundColor: Colors.backgroundSecondary, borderRadius: 14, padding: 16, gap: 8,
  },
  infoText: { fontSize: 14, color: Colors.textPrimary, fontFamily: 'Roboto-Regular', lineHeight: 20 },
  infoSubtext: { fontSize: 13, color: Colors.textSecondary, fontFamily: 'Roboto-Regular', fontStyle: 'italic' },
  options: { gap: 10 },
  optionRow: {
    flexDirection: 'row', alignItems: 'center',
    backgroundColor: Colors.backgroundSecondary, borderRadius: 14, padding: 16, gap: 14,
  },
  optionRowSelected: { backgroundColor: Colors.primary },
  optionIcon: { marginRight: 4 },
  optionContent: { flex: 1 },
  optionLabel: { fontSize: 16, fontFamily: 'Roboto-Bold', color: Colors.textPrimary },
  optionLabelSelected: { color: Colors.textWhite },
  optionSublabel: { fontSize: 13, color: Colors.textSecondary, fontFamily: 'Roboto-Regular', marginTop: 2, lineHeight: 18 },
  optionSublabelSelected: { color: 'rgba(255,255,255,0.8)' },
  saveBtn: {
    backgroundColor: Colors.primary, borderRadius: 14,
    paddingVertical: 16, alignItems: 'center',
  },
  saveBtnText: { color: Colors.textWhite, fontFamily: 'Roboto-Bold', fontSize: 16 },
});
