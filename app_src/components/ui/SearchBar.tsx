import React from 'react';
import { View, TextInput, StyleSheet } from 'react-native';
import { Ionicons } from '@expo/vector-icons';
import { Colors } from '@/constants/colors';

interface Props {
  placeholder?: string;
  value: string;
  onChangeText: (text: string) => void;
}

export function SearchBar({ placeholder = 'Rechercher…', value, onChangeText }: Props) {
  return (
    <View style={styles.container}>
      <Ionicons name="search" size={16} color={Colors.textMuted} style={styles.icon} />
      <TextInput
        style={styles.input}
        placeholder={placeholder}
        placeholderTextColor={Colors.textMuted}
        value={value}
        onChangeText={onChangeText}
        returnKeyType="search"
        autoCorrect={false}
        autoCapitalize="none"
      />
    </View>
  );
}

const styles = StyleSheet.create({
  container: {
    flexDirection: 'row',
    alignItems: 'center',
    backgroundColor: 'rgba(255,255,255,0.6)',
    borderRadius: 14,
    marginHorizontal: 16,
    marginBottom: 10,
    paddingHorizontal: 14,
    paddingVertical: 10,
    borderWidth: StyleSheet.hairlineWidth,
    borderColor: 'rgba(255,255,255,0.7)',
  },
  icon: { marginRight: 8 },
  input: {
    flex: 1,
    fontSize: 15,
    fontFamily: 'Roboto-Regular',
    color: Colors.textPrimary,
  },
});
