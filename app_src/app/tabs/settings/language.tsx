import React, { useState } from 'react';
import {
  View, Text, FlatList, TouchableOpacity, StyleSheet, DeviceEventEmitter,
} from 'react-native';
import { SafeAreaView } from 'react-native-safe-area-context';
import { useRouter } from 'expo-router';
import { Ionicons } from '@expo/vector-icons';
import { Colors } from '@/constants/colors';
import { setSetting, getSetting } from '@/lib/database/db';
import { useFocusEffect } from 'expo-router';
import { useCallback } from 'react';

// Only languages with a full dictionary are offered (white paper honesty:
// no dead options that silently fall back to French).
const LANGUAGES = [
  { code: 'fr', label: 'Français', flag: '🇫🇷' },
  { code: 'en', label: 'English', flag: '🇬🇧' },
];

export default function LanguageScreen() {
  const router = useRouter();
  const [selected, setSelected] = useState('fr');

  useFocusEffect(useCallback(() => {
    getSetting('language', 'fr').then(setSelected);
  }, []));

  async function handleSelect(code: string) {
    setSelected(code);
    await setSetting('language', code);
    DeviceEventEmitter.emit('languageChanged', code); // live re-render of the app
    router.back();
  }

  return (
    <SafeAreaView style={styles.container}>
      <View style={styles.header}>
        <TouchableOpacity onPress={() => router.back()}>
          <Ionicons name="arrow-back" size={22} color={Colors.textPrimary} />
        </TouchableOpacity>
        <Text style={styles.title}>Choisir la langue</Text>
      </View>

      <FlatList
        data={LANGUAGES}
        keyExtractor={(item) => item.code}
        contentContainerStyle={styles.list}
        renderItem={({ item }) => {
          const isSelected = item.code === selected;
          return (
            <TouchableOpacity
              style={[styles.row, isSelected && styles.rowSelected]}
              onPress={() => handleSelect(item.code)}
              activeOpacity={0.8}
            >
              <Text style={styles.flag}>{item.flag}</Text>
              <Text style={[styles.label, isSelected && styles.labelSelected]}>{item.label}</Text>
              {isSelected && <Ionicons name="checkmark" size={22} color={Colors.textWhite} />}
            </TouchableOpacity>
          );
        }}
      />
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
  list: { padding: 16, gap: 8 },
  row: {
    flexDirection: 'row', alignItems: 'center', gap: 14,
    backgroundColor: Colors.backgroundSecondary, borderRadius: 14,
    paddingHorizontal: 16, paddingVertical: 16,
  },
  rowSelected: { backgroundColor: Colors.primary },
  flag: { fontSize: 24 },
  label: { flex: 1, fontSize: 16, fontFamily: 'Roboto-Regular', color: Colors.textPrimary },
  labelSelected: { color: Colors.textWhite, fontFamily: 'Roboto-Medium' },
});
