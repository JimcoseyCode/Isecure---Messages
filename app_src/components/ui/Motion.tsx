import React, { useEffect, useRef } from 'react';
import { Animated, Easing, ViewStyle, StyleProp } from 'react-native';

/**
 * Apple-style content entrance: fades in while sliding up a touch, with a soft
 * spring. Stagger children by passing an increasing `delay`.
 */
export function FadeSlideIn({
  children, delay = 0, distance = 14, style,
}: {
  children: React.ReactNode;
  delay?: number;
  distance?: number;
  style?: StyleProp<ViewStyle>;
}) {
  const p = useRef(new Animated.Value(0)).current;
  useEffect(() => {
    const t = setTimeout(() => {
      Animated.spring(p, { toValue: 1, useNativeDriver: true, damping: 16, stiffness: 140, mass: 0.7 }).start();
    }, delay);
    return () => clearTimeout(t);
  }, []);
  return (
    <Animated.View
      style={[
        { opacity: p, transform: [{ translateY: p.interpolate({ inputRange: [0, 1], outputRange: [distance, 0] }) }] },
        style,
      ]}
    >
      {children}
    </Animated.View>
  );
}

/** Press feedback: scales down slightly while held (iOS-like). Wrap around Pressable content. */
export function usefaTapScale() {
  const s = useRef(new Animated.Value(1)).current;
  const to = (v: number) => Animated.spring(s, { toValue: v, useNativeDriver: true, damping: 15, stiffness: 260 }).start();
  return { scale: s, onPressIn: () => to(0.96), onPressOut: () => to(1) };
}

/** Standardized grab handle for bottom sheets. */
export function SheetHandle() {
  return (
    <Animated.View
      style={{ width: 38, height: 5, borderRadius: 3, backgroundColor: 'rgba(120,120,128,0.4)', alignSelf: 'center', marginBottom: 12 }}
    />
  );
}
