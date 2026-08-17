import { ViewStyle } from 'react-native';

// Shared so a full-screen route (the chat) can hide the floating glass tab bar
// on focus and restore this exact style on blur.
// Side inset of the visible glass pill from the screen edges (dp).
export const TAB_BAR_INSET = 46;

// Full-width, transparent container. The visible floating pill is drawn by the
// GlassView background inset by TAB_BAR_INSET, and the items are padded to match
// — this way the pill is reliably centred and never hugs the screen edges,
// regardless of how the navigator honours left/right on the style itself.
export const FLOATING_TAB_BAR_STYLE: ViewStyle = {
  position: 'absolute',
  left: 0,
  right: 0,
  bottom: 34,
  height: 62,
  borderTopWidth: 0,
  backgroundColor: 'transparent',
  elevation: 0,
  paddingTop: 8,
  paddingBottom: 8,
  paddingHorizontal: TAB_BAR_INSET,
};
