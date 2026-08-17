import React, { useRef, useState } from 'react';
import {
  View, StyleSheet, Animated, PanResponder, LayoutChangeEvent,
} from 'react-native';
import { Ionicons } from '@expo/vector-icons';
import { Colors } from '@/constants/colors';

const THUMB = 56;
const PAD = 4;

// iOS "slide to confirm" — deliberate drag gesture replaces a tap for
// irreversible actions. Thumb springs back unless dragged past the threshold.
export function SlideToConfirm({
  label = 'Glisser pour confirmer',
  confirmedLabel = 'Confirmé',
  icon = 'arrow-forward',
  color = Colors.error,
  onConfirm,
}: {
  label?: string;
  confirmedLabel?: string;
  icon?: keyof typeof Ionicons.glyphMap;
  color?: string;
  onConfirm: () => void;
}) {
  const [done, setDone] = useState(false);
  const x = useRef(new Animated.Value(0)).current;
  const doneRef = useRef(false);
  // Refs so the (once-created) PanResponder always reads the CURRENT track width
  // instead of the 0 captured on first render.
  const maxTravelRef = useRef(0);

  const pan = useRef(
    PanResponder.create({
      // Capture the gesture before the parent ScrollView can claim it.
      onStartShouldSetPanResponder: () => !doneRef.current,
      onStartShouldSetPanResponderCapture: () => !doneRef.current,
      onMoveShouldSetPanResponder: (_, g) => !doneRef.current && Math.abs(g.dx) > 2,
      onMoveShouldSetPanResponderCapture: (_, g) => !doneRef.current && Math.abs(g.dx) > 2,
      onPanResponderTerminationRequest: () => false,
      onPanResponderMove: (_, g) => {
        const max = maxTravelRef.current;
        x.setValue(Math.min(Math.max(0, g.dx), max));
      },
      onPanResponderRelease: (_, g) => {
        const max = maxTravelRef.current;
        if (max > 0 && g.dx >= max * 0.8) {
          doneRef.current = true;
          setDone(true);
          Animated.timing(x, { toValue: max, duration: 120, useNativeDriver: false }).start(() => onConfirm());
        } else {
          Animated.spring(x, { toValue: 0, useNativeDriver: false, friction: 6, tension: 80 }).start();
        }
      },
    })
  ).current;

  const onLayout = (e: LayoutChangeEvent) => {
    maxTravelRef.current = Math.max(0, e.nativeEvent.layout.width - THUMB - PAD * 2);
  };
  const fillW = Animated.add(x, new Animated.Value(THUMB + PAD));

  return (
    <View style={[styles.track, { backgroundColor: color + '18', borderColor: color + '33' }]} onLayout={onLayout}>
      <Animated.View style={[styles.fill, { width: fillW, backgroundColor: color + '22' }]} />
      <Animated.Text style={[styles.label, { color }]} numberOfLines={1}>
        {done ? confirmedLabel : label}
      </Animated.Text>
      <Animated.View
        style={[styles.thumb, { backgroundColor: color, transform: [{ translateX: x }] }]}
        {...pan.panHandlers}
      >
        <Ionicons name={done ? 'checkmark' : icon} size={26} color="#fff" />
      </Animated.View>
    </View>
  );
}

const styles = StyleSheet.create({
  track: {
    height: THUMB + PAD * 2, borderRadius: (THUMB + PAD * 2) / 2,
    borderWidth: 1, justifyContent: 'center', overflow: 'hidden',
  },
  fill: {
    position: 'absolute', left: PAD, top: PAD, bottom: PAD,
    borderRadius: THUMB / 2,
  },
  label: {
    position: 'absolute', left: THUMB + 16, right: 20,
    fontSize: 14, fontFamily: 'Roboto-Bold', letterSpacing: 0.2,
  },
  thumb: {
    position: 'absolute', left: PAD, width: THUMB, height: THUMB, borderRadius: THUMB / 2,
    alignItems: 'center', justifyContent: 'center',
    shadowColor: '#000', shadowOffset: { width: 0, height: 2 }, shadowOpacity: 0.25, shadowRadius: 4, elevation: 4,
  },
});
