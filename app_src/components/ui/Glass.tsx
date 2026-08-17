import React from 'react';
import { View, StyleSheet, Platform, ViewStyle, StyleProp } from 'react-native';
import { BlurView } from 'expo-blur';
import { LinearGradient } from 'expo-linear-gradient';
import Svg, { Defs, RadialGradient, Stop, Ellipse } from 'react-native-svg';

/**
 * The "water droplet" specular — a soft radial light-catch near the top-left,
 * the way iOS Liquid Glass lenses light into a glossy bead.
 */
function DropletSheen() {
  return (
    <Svg style={StyleSheet.absoluteFill} pointerEvents="none">
      <Defs>
        <RadialGradient id="drop" cx="32%" cy="18%" r="65%">
          <Stop offset="0" stopColor="#ffffff" stopOpacity="0.85" />
          <Stop offset="0.35" stopColor="#ffffff" stopOpacity="0.28" />
          <Stop offset="1" stopColor="#ffffff" stopOpacity="0" />
        </RadialGradient>
      </Defs>
      <Ellipse cx="34%" cy="20%" rx="55%" ry="42%" fill="url(#drop)" />
    </Svg>
  );
}

/**
 * iOS 26 "Liquid Glass" surface: a real backdrop blur, a faint translucent
 * tint, and a specular highlight along the top edge so the material catches
 * light like frosted glass floating over content.
 */
export function GlassView({
  style,
  intensity = 60,
  tint = 'light',
  radius = 22,
  children,
}: {
  style?: StyleProp<ViewStyle>;
  intensity?: number;
  tint?: 'light' | 'dark' | 'default';
  radius?: number;
  children?: React.ReactNode;
}) {
  return (
    <View style={[{ borderRadius: radius, overflow: 'hidden' }, styles.floatShadow, style]}>
      <BlurView intensity={intensity} tint={tint} style={StyleSheet.absoluteFill} />
      {/* translucent white wash — gives the glass its body */}
      <View style={[StyleSheet.absoluteFill, { backgroundColor: 'rgba(255,255,255,0.55)' }]} />
      {/* specular sheen: brighter at the top, fading down */}
      <LinearGradient
        colors={['rgba(255,255,255,0.5)', 'rgba(255,255,255,0.04)']}
        start={{ x: 0, y: 0 }}
        end={{ x: 0, y: 1 }}
        style={StyleSheet.absoluteFill}
        pointerEvents="none"
      />
      {/* liquid-glass water-droplet light catch */}
      <DropletSheen />
      {/* hairline edge */}
      <View
        pointerEvents="none"
        style={[
          StyleSheet.absoluteFill,
          { borderRadius: radius, borderWidth: StyleSheet.hairlineWidth, borderColor: 'rgba(255,255,255,0.7)' },
        ]}
      />
      {children}
    </View>
  );
}

/**
 * Subtle full-screen wallpaper so the glass has something to refract. A pure
 * white page makes the blur invisible; this soft cool gradient reads as depth.
 */
export function GlassBackground({ style }: { style?: StyleProp<ViewStyle> }) {
  return (
    <LinearGradient
      colors={['#EAF1FF', '#F5F3FF', '#FDF1F6']}
      start={{ x: 0, y: 0 }}
      end={{ x: 1, y: 1 }}
      style={[StyleSheet.absoluteFill, style]}
      pointerEvents="none"
    />
  );
}

const styles = StyleSheet.create({
  floatShadow: Platform.select({
    ios: {
      shadowColor: '#1B2A4A',
      shadowOffset: { width: 0, height: 12 },
      shadowOpacity: 0.20,
      shadowRadius: 28,
    },
    default: { elevation: 18 },
  }) as ViewStyle,
});
