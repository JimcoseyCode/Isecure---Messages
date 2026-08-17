// Apple / iMessage palette. System colors from Apple HIG (light appearance).
// Mapping to the app's security model:
//   • encrypted (secure) message  → iMessage blue  (#007AFF)
//   • plaintext SMS               → SMS green       (#34C759)  — like real iMessage
//   • received                    → system gray     (#E9E9EB)
export const Colors = {
  // Brand — systemBlue
  primary: '#007AFF',
  primaryDark: '#0040DD',
  primaryMid: '#4CA2FF',

  // Surfaces — light, grouped
  background: '#FFFFFF',
  backgroundSecondary: '#F2F2F7', // systemGroupedBackground
  surface: '#FFFFFF',
  surfaceElevated: '#FFFFFF',
  card: '#FFFFFF',

  // Bubbles
  sentBubble: '#34C759',       // SMS green (plaintext sent)
  encryptedBubble: '#007AFF',  // iMessage blue (encrypted)
  receivedBubble: '#E9E9EB',   // system gray

  // Text — label hierarchy
  textPrimary: '#000000',
  textSecondary: '#6C6C70',    // secondaryLabel
  textMuted: '#8E8E93',        // systemGray
  textWhite: '#FFFFFF',

  // Status
  error: '#FF3B30',            // systemRed
  errorBg: '#FFEBEA',
  success: '#34C759',          // systemGreen
  successBg: '#E7F9ED',
  warning: '#FF9500',          // systemOrange
  warningBg: '#FFF3E0',

  // UI chrome
  border: '#C6C6C8',           // separator (opaque)
  borderLight: '#E5E5EA',      // systemGray5
  separator: '#E5E5EA',
  avatarBg: '#C7C7CC',         // systemGray4
  avatarBgPrimary: '#007AFF',
  inputBg: '#FFFFFF',

  // Tab bar
  tabBarActive: '#007AFF',
  tabBarInactive: '#8E8E93',
  tabBarBg: '#F9F9F9',

  // Toggles
  toggleActive: '#34C759',     // Apple switches are green
  toggleInactive: '#E9E9EB',

  // Overlays
  overlayBg: 'rgba(0,0,0,0.4)',

  // Accents
  phoneIconBg: '#34C759',
  purpleIconBg: '#5856D6',     // systemIndigo
  checkmark: '#8E8E93',
  lockSuccess: '#34C759',
  lockFail: '#FF3B30',

  // Security modes (banners)
  ovnyBg: '#5856D6',           // indigo
  fortressBg: '#007AFF',       // blue
  ephemeralBg: '#FFF3E0',      // light orange

  // Night alias kept for compat
  nightBackground: '#FFFFFF',
  nightSurface: '#FFFFFF',

  // Legacy aliases
  sentEncBubble: '#007AFF',    // encrypted sent = iMessage blue
  cardBg: '#FFFFFF',
  cardBgLight: '#F2F2F7',
  panicRed: '#FF3B30',
} as const;
