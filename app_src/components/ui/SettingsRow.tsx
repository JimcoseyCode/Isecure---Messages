import React from 'react';
import { View, Text, Switch, TouchableOpacity, StyleSheet } from 'react-native';
import { Ionicons } from '@expo/vector-icons';
import { Colors } from '@/constants/colors';

interface RowProps {
  icon: string;
  label: string;
  type?: 'toggle' | 'arrow' | 'none';
  value?: boolean;
  onToggle?: (v: boolean) => void;
  onPress?: () => void;
  disabled?: boolean;
  destructive?: boolean;
  subtitle?: string;
  isLast?: boolean;
}

export function SettingsRow({ icon, label, type = 'none', value, onToggle, onPress, disabled, destructive, subtitle, isLast }: RowProps) {
  const labelColor = destructive ? Colors.error : disabled ? Colors.textMuted : Colors.textPrimary;

  const content = (
    <View style={[styles.row, isLast && styles.rowLast, disabled && styles.rowDisabled]}>
      <View style={[styles.iconWrap, { backgroundColor: destructive ? Colors.errorBg : Colors.surfaceElevated }]}>
        <Ionicons name={icon as any} size={18} color={destructive ? Colors.error : Colors.primary} />
      </View>
      <View style={styles.labelWrap}>
        <Text style={[styles.label, { color: labelColor }]}>{label}</Text>
        {subtitle ? <Text style={styles.subtitle}>{subtitle}</Text> : null}
      </View>
      {type === 'toggle' && (
        <Switch
          value={value}
          onValueChange={disabled ? undefined : onToggle}
          disabled={disabled}
          trackColor={{ false: Colors.toggleInactive, true: Colors.toggleActive }}
          thumbColor="#fff"
          ios_backgroundColor={Colors.toggleInactive}
        />
      )}
      {type === 'arrow' && (
        <Ionicons name="chevron-forward" size={16} color={Colors.textMuted} />
      )}
    </View>
  );

  if (type === 'toggle' || type === 'none') return content;
  return (
    <TouchableOpacity onPress={disabled ? undefined : onPress} activeOpacity={0.7}>
      {content}
    </TouchableOpacity>
  );
}

export function SettingsSectionHeader({ title }: { title: string }) {
  return <Text style={styles.sectionHeader}>{title.toUpperCase()}</Text>;
}

export function SettingsGroup({ children, style }: { children: React.ReactNode, style?: any }) {
  return (
    <View style={[styles.group, style]}>
      {React.Children.map(children, (child, index) => {
        if (!React.isValidElement(child)) return child;
        const isLast = index === React.Children.count(children) - 1;
        return React.cloneElement(child as React.ReactElement<any>, { isLast });
      })}
    </View>
  );
}

const styles = StyleSheet.create({
  group: {
    backgroundColor: Colors.surface,
    borderRadius: 12,
    marginHorizontal: 16,
    overflow: 'hidden',
    shadowColor: '#000',
    shadowOffset: { width: 0, height: 1 },
    shadowOpacity: 0.05,
    shadowRadius: 3,
    elevation: 2,
    marginBottom: 8,
  },
  row: {
    flexDirection: 'row',
    alignItems: 'center',
    paddingHorizontal: 16,
    paddingVertical: 13,
    gap: 14,
    borderBottomWidth: StyleSheet.hairlineWidth,
    borderBottomColor: Colors.separator,
  },
  rowDisabled: { opacity: 0.45 },
  rowLast: { borderBottomWidth: 0 },
  rowDisabled: { opacity: 0.45 },
  iconWrap: {
    width: 34, height: 34, borderRadius: 9,
    alignItems: 'center', justifyContent: 'center',
  },
  labelWrap: { flex: 1 },
  label: { fontSize: 15, fontFamily: 'Roboto-Regular' },
  subtitle: { fontSize: 12, color: Colors.textMuted, fontFamily: 'Roboto-Regular', marginTop: 2 },
  sectionHeader: {
    fontSize: 11,
    fontFamily: 'Roboto-Bold',
    color: Colors.textMuted,
    letterSpacing: 1.2,
    paddingHorizontal: 16,
    paddingTop: 24,
    paddingBottom: 8,
  },
});
