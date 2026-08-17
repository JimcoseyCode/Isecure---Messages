import { Platform, NativeModules, NativeEventEmitter } from 'react-native';

// SMS sending is Android-only native functionality.
// On Expo managed workflow it requires a custom dev client or bare workflow.
// This service wraps the underlying native module with a clean interface.

export interface SmsMessage {
  address: string;  // phone number
  body: string;
  date: number;     // unix timestamp ms
  type: number;     // 1=received, 2=sent
}

export async function sendSms(phoneNumber: string, body: string): Promise<void> {
  if (Platform.OS !== 'android') {
    throw new Error('SMS sending is only available on Android.');
  }
  const { SmsModule } = NativeModules;
  if (!SmsModule) {
    // Fallback: open native SMS composer (works in Expo Go)
    const { Linking } = require('react-native');
    const encoded = encodeURIComponent(body);
    await Linking.openURL(`sms:${phoneNumber}?body=${encoded}`);
    return;
  }
  await SmsModule.sendSms(phoneNumber, body);
}

export function onSmsReceived(
  handler: (msg: SmsMessage) => void
): () => void {
  if (Platform.OS !== 'android') return () => {};
  const { SmsModule } = NativeModules;
  if (!SmsModule) return () => {};

  const emitter = new NativeEventEmitter(SmsModule);
  const sub = emitter.addListener('onSmsReceived', handler);
  return () => sub.remove();
}

// Normalize a phone number to E.164 format best-effort
export function normalizePhone(raw: string, defaultCountryCode = '33'): string {
  const digits = raw.replace(/\D/g, '');
  if (digits.startsWith('00')) return '+' + digits.slice(2);
  if (digits.startsWith('0')) return '+' + defaultCountryCode + digits.slice(1);
  if (digits.startsWith('+')) return raw.replace(/\s/g, '');
  if (digits.length >= 10) return '+' + defaultCountryCode + digits;
  return raw;
}

// Check if two phone strings refer to the same number (normalized comparison)
export function phonesMatch(a: string, b: string): boolean {
  const norm = (s: string) => s.replace(/\D/g, '').slice(-9);
  return norm(a) === norm(b);
}
