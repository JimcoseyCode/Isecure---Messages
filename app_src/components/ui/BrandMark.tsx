import React from 'react';
import { StyleProp, ViewStyle } from 'react-native';
import Svg, {
  Path, Circle, Polyline, Defs, LinearGradient as SvgGradient, Stop, G,
} from 'react-native-svg';

// iSecure — Messages brand mark, rebuilt as line-art vector from the reference
// logo: padlock shackle + heartbeat, shield body ending in a chat-bubble tail,
// with a "…" message glyph at the center.
//
// stroke: pass a solid color (e.g. "#fff") for a monochrome mark, or leave
// undefined to use the blue→cyan→violet brand gradient.
export function BrandMark({
  size = 96,
  stroke,
  style,
}: {
  size?: number;
  stroke?: string;
  style?: StyleProp<ViewStyle>;
}) {
  const c = stroke ?? 'url(#isecureGrad)';
  return (
    <Svg width={size} height={size * 1.18} viewBox="0 0 100 118" style={style}>
      <Defs>
        <SvgGradient id="isecureGrad" x1="0" y1="0" x2="1" y2="1">
          <Stop offset="0" stopColor="#6366F1" />
          <Stop offset="0.5" stopColor="#3B82F6" />
          <Stop offset="1" stopColor="#22D3EE" />
        </SvgGradient>
      </Defs>
      <G fill="none" stroke={c} strokeWidth={5} strokeLinecap="round" strokeLinejoin="round">
        {/* Padlock shackle */}
        <Path d="M34 40 V30 a16 16 0 0 1 32 0 V40" />
        {/* Heartbeat pulse across the shackle */}
        <Polyline points="36,33 43,33 46,25 50,41 54,28 57,33 64,33" strokeWidth={4} />
        {/* Shield body with a chat-bubble tail at the bottom-right */}
        <Path d="M26 44 H74 a3 3 0 0 1 3 3 V70 c0 18 -12 27 -22 33 l6 10 -14 -8 C39 100 23 90 23 70 V47 a3 3 0 0 1 3 -3 Z" />
        {/* Message dots */}
        <Circle cx="41" cy="71" r="3.4" fill={c} stroke="none" />
        <Circle cx="50" cy="71" r="3.4" fill={c} stroke="none" />
        <Circle cx="59" cy="71" r="3.4" fill={c} stroke="none" />
      </G>
    </Svg>
  );
}
