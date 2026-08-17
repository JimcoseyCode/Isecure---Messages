import React from 'react';
import { View, Text, StyleSheet } from 'react-native';
import { Colors } from '@/constants/colors';

interface Props {
  name: string;
  size?: number;
  filled?: boolean;
}

function getInitials(name: string): string {
  const parts = name.trim().split(/\s+/);
  if (parts.length === 1) return parts[0].slice(0, 2).toUpperCase();
  return (parts[0][0] + parts[parts.length - 1][0]).toUpperCase();
}

// Apple system colors for contact avatars.
const PALETTE = ['#007AFF', '#34C759', '#FF9500', '#FF2D55', '#5856D6', '#5AC8FA', '#AF52DE'];
function getColor(name: string): string {
  let hash = 0;
  for (let i = 0; i < name.length; i++) hash = name.charCodeAt(i) + ((hash << 5) - hash);
  return PALETTE[Math.abs(hash) % PALETTE.length];
}

export function Avatar({ name, size = 48, filled = true }: Props) {
  const color = getColor(name);
  const fontSize = size * 0.36;
  return (
    <View style={[
      styles.base,
      { width: size, height: size, borderRadius: size / 2 },
      filled
        ? { backgroundColor: color }
        : { backgroundColor: Colors.surfaceElevated, borderWidth: 2, borderColor: Colors.border },
    ]}>
      <Text style={[styles.initials, { fontSize, color: filled ? '#fff' : Colors.textMuted }]}>
        {getInitials(name)}
      </Text>
      {!filled && (
        <View style={[styles.dot, { width: size * 0.22, height: size * 0.22, borderRadius: size * 0.11, bottom: 0, right: 0 }]}>
          <View style={[styles.dotInner, { width: size * 0.14, height: size * 0.14, borderRadius: size * 0.07 }]} />
        </View>
      )}
    </View>
  );
}

const styles = StyleSheet.create({
  base: { alignItems: 'center', justifyContent: 'center' },
  initials: { fontFamily: 'Roboto-Bold', letterSpacing: 0.5 },
  dot: {
    position: 'absolute',
    backgroundColor: Colors.surface,
    alignItems: 'center', justifyContent: 'center',
  },
  dotInner: { backgroundColor: Colors.textMuted },
});
