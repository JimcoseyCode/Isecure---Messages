import React, { useState, useRef } from 'react';
import {
  View, Text, TouchableOpacity, StyleSheet,
  FlatList, Dimensions, Animated, Easing, NativeSyntheticEvent, NativeScrollEvent,
} from 'react-native';
import { SafeAreaView } from 'react-native-safe-area-context';
import { useRouter } from 'expo-router';
import { Ionicons } from '@expo/vector-icons';
import { LinearGradient } from 'expo-linear-gradient';
import { BlurView } from 'expo-blur';
import { Colors } from '@/constants/colors';
import { S } from '@/constants/strings';
import { setSetting } from '@/lib/database/db';
import { BrandMark } from '@/components/ui/BrandMark';

const { width } = Dimensions.get('window');

type Slide = {
  key: string;
  mark?: boolean;
  icon?: keyof typeof Ionicons.glyphMap;
  grad: [string, string];
  title: string;
  desc: string;
};

const slides: Slide[] = [
  { key: '1', mark: true, grad: ['#4F46E5', '#22D3EE'], title: S.onboarding1Title, desc: S.onboarding1Desc },
  { key: '2', icon: 'git-network', grad: ['#3B82F6', '#06B6D4'], title: S.onboarding2Title, desc: S.onboarding2Desc },
  { key: '3', icon: 'chatbubbles', grad: ['#6366F1', '#22D3EE'], title: S.onboarding3Title, desc: S.onboarding3Desc },
];

export default function OnboardingScreen() {
  const router = useRouter();
  const [currentIndex, setCurrentIndex] = useState(0);
  const flatListRef = useRef<FlatList>(null);

  async function finishOnboarding() {
    await setSetting('onboarding_done', '1');
    router.replace('/auth/login');
  }

  function handleNext() {
    if (currentIndex < slides.length - 1) {
      const next = currentIndex + 1;
      flatListRef.current?.scrollToIndex({ index: next, animated: true });
      setCurrentIndex(next);
    } else {
      finishOnboarding();
    }
  }

  function onScrollEnd(e: NativeSyntheticEvent<NativeScrollEvent>) {
    setCurrentIndex(Math.round(e.nativeEvent.contentOffset.x / width));
  }

  const isLast = currentIndex === slides.length - 1;

  return (
    <View style={styles.root}>
      <LinearGradient
        colors={['#0B1A3A', '#0A1024', '#05070F']}
        start={{ x: 0.2, y: 0 }} end={{ x: 0.8, y: 1 }}
        style={StyleSheet.absoluteFill}
      />
      <View style={[styles.blob, { backgroundColor: '#2E7CF6', top: -70, left: -60 }]} />
      <View style={[styles.blob, { backgroundColor: '#22D3EE', top: 60, right: -90, opacity: 0.32 }]} />
      <View style={[styles.blob, { backgroundColor: '#6366F1', bottom: -50, left: -30, opacity: 0.38 }]} />
      <BlurView intensity={90} tint="dark" style={StyleSheet.absoluteFill} pointerEvents="none" />

      <SafeAreaView style={styles.safe}>
        <TouchableOpacity style={styles.skip} onPress={finishOnboarding} hitSlop={{ top: 10, bottom: 10, left: 10, right: 10 }}>
          <Text style={styles.skipText}>{S.skip}</Text>
        </TouchableOpacity>

        <FlatList
          ref={flatListRef}
          data={slides}
          keyExtractor={(item) => item.key}
          horizontal
          pagingEnabled
          showsHorizontalScrollIndicator={false}
          onMomentumScrollEnd={onScrollEnd}
          renderItem={({ item }) => <SlideView slide={item} />}
          style={{ flexGrow: 0 }}
        />

        <View style={styles.dots}>
          {slides.map((_, i) => (
            <View key={i} style={[styles.dot, i === currentIndex && styles.dotActive]} />
          ))}
        </View>

        <TouchableOpacity onPress={handleNext} activeOpacity={0.9} style={styles.nextWrap}>
          <LinearGradient
            colors={['#3B82F6', '#22D3EE']}
            start={{ x: 0, y: 0 }} end={{ x: 1, y: 1 }}
            style={styles.nextBtn}
          >
            <LinearGradient colors={['rgba(255,255,255,0.35)', 'transparent']} style={styles.btnSheen} pointerEvents="none" />
            <Text style={styles.nextText}>{isLast ? S.getStarted : S.next}</Text>
            <Ionicons name={isLast ? 'shield-checkmark' : 'arrow-forward'} size={19} color="#fff" />
          </LinearGradient>
        </TouchableOpacity>
      </SafeAreaView>
    </View>
  );
}

function SlideView({ slide }: { slide: Slide }) {
  const enter = useRef(new Animated.Value(0)).current;
  const float = useRef(new Animated.Value(0)).current;
  React.useEffect(() => {
    enter.setValue(0);
    Animated.timing(enter, { toValue: 1, duration: 520, easing: Easing.out(Easing.cubic), useNativeDriver: true }).start();
    Animated.loop(
      Animated.sequence([
        Animated.timing(float, { toValue: 1, duration: 2200, easing: Easing.inOut(Easing.ease), useNativeDriver: true }),
        Animated.timing(float, { toValue: 0, duration: 2200, easing: Easing.inOut(Easing.ease), useNativeDriver: true }),
      ])
    ).start();
  }, [enter, float]);

  const translateY = Animated.add(
    enter.interpolate({ inputRange: [0, 1], outputRange: [24, 0] }),
    float.interpolate({ inputRange: [0, 1], outputRange: [0, -10] })
  );

  return (
    <View style={styles.slide}>
      <Animated.View style={[styles.heroWrap, { opacity: enter, transform: [{ translateY }] }]}>
        <View style={[styles.heroGlow, { shadowColor: slide.grad[1] }]}>
          <LinearGradient colors={slide.grad} start={{ x: 0, y: 0 }} end={{ x: 1, y: 1 }} style={styles.hero}>
            {slide.mark
              ? <BrandMark size={92} stroke="#fff" />
              : <Ionicons name={slide.icon!} size={78} color="#fff" />}
            <LinearGradient colors={['rgba(255,255,255,0.4)', 'transparent']} style={styles.heroSheen} pointerEvents="none" />
          </LinearGradient>
        </View>
      </Animated.View>

      <Animated.Text style={[styles.title, { opacity: enter }]}>{slide.title}</Animated.Text>
      <Animated.Text style={[styles.desc, { opacity: enter }]}>{slide.desc}</Animated.Text>
    </View>
  );
}

const styles = StyleSheet.create({
  root: { flex: 1, backgroundColor: '#05070F' },
  safe: { flex: 1, alignItems: 'center' },
  blob: { position: 'absolute', width: 260, height: 260, borderRadius: 130, opacity: 0.5 },

  skip: { alignSelf: 'flex-end', paddingHorizontal: 24, paddingVertical: 12 },
  skipText: { fontSize: 15, color: 'rgba(255,255,255,0.55)', fontFamily: 'Roboto-Medium' },

  slide: { width, alignItems: 'center', paddingHorizontal: 36, paddingTop: 40 },
  heroWrap: { marginBottom: 44 },
  heroGlow: {
    borderRadius: 44,
    shadowOffset: { width: 0, height: 0 }, shadowOpacity: 0.7, shadowRadius: 34, elevation: 20,
  },
  hero: {
    width: 168, height: 168, borderRadius: 44,
    alignItems: 'center', justifyContent: 'center', overflow: 'hidden',
  },
  heroSheen: { position: 'absolute', top: 0, left: 0, right: 0, height: 84 },

  title: {
    fontSize: 27, fontFamily: 'Roboto-Bold', color: '#fff', textAlign: 'center', marginBottom: 14,
    textShadowColor: 'rgba(34,211,238,0.35)', textShadowOffset: { width: 0, height: 0 }, textShadowRadius: 16,
  },
  desc: { fontSize: 15, fontFamily: 'Roboto-Regular', color: 'rgba(255,255,255,0.6)', textAlign: 'center', lineHeight: 23 },

  dots: { flexDirection: 'row', gap: 8, marginTop: 8, marginBottom: 24 },
  dot: { width: 8, height: 8, borderRadius: 4, backgroundColor: 'rgba(255,255,255,0.2)' },
  dotActive: { backgroundColor: '#22D3EE', width: 26 },

  nextWrap: {
    marginBottom: 32, borderRadius: 18,
    shadowColor: '#22D3EE', shadowOffset: { width: 0, height: 6 }, shadowOpacity: 0.5, shadowRadius: 16, elevation: 10,
  },
  nextBtn: {
    borderRadius: 18, paddingVertical: 17, paddingHorizontal: 56, overflow: 'hidden',
    flexDirection: 'row', alignItems: 'center', gap: 10,
  },
  btnSheen: { position: 'absolute', top: 0, left: 0, right: 0, height: 26 },
  nextText: { color: '#fff', fontFamily: 'Roboto-Bold', fontSize: 16, letterSpacing: 0.3 },
});
