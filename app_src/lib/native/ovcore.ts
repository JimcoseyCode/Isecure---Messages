import { NativeModules, NativeEventEmitter } from 'react-native';

/**
 * Typed wrapper over the native OV modules.
 *
 * `OvCore` runs the Rust `ov-core` crypto (AES-256-GCM, X25519 + ML-KEM-768,
 * Argon2id) — all vetted RustCrypto primitives, no JS crypto. `Sms` is the
 * native SMS transport. Everything is async: the work happens off the JS thread.
 */

interface OvCoreNative {
  deriveFromPassword(password: string, saltHex: string | null): Promise<{ keyHex: string; saltHex: string }>;
  deriveKeyPool(masterHex: string, count: number): Promise<string[]>;
  deriveSas(sharedHex: string): Promise<string>;
  randomKeyHex(): Promise<string>;
  sealMessage(poolKeyHex: string, keyIndex: number, plaintext: string): Promise<string>;
  openMessage(poolKeyHex: string, payload: string): Promise<string>;
  peekKeyIndex(payload: string): Promise<number>;
  splitIntoChunks(payload: string, msgId: string, maxLen: number): Promise<string[]>;
  parseChunk(sms: string): Promise<{ msgId: string; seq: number; total: number; data: string } | null>;
  encryptFile(keyHex: string, content: number[], filename: string): Promise<number[]>;
  decryptFile(keyHex: string, ovBytes: number[]): Promise<{ content: number[]; originalFilename: string }>;
  startPairingA(): Promise<{ keypairHex: string; sms: string }>;
  respondPairingB(aSms: string): Promise<{ sharedKeyHex: string; sms: string; sas: string }>;
  completePairingA(keypairHex: string, bSms: string): Promise<{ sharedKeyHex: string; sms: string | null; sas: string }>;

  // OV Message interop (ovcompat)
  ovDeriveContactKey(sharedSecretHex: string): Promise<{ contactKeyHex: string; sas: string }>;
  ovDeriveCharset(base: string, seedA: string, seedB: string): Promise<string>;
  ovParseOvpk(msg: string): Promise<{ session: string; role: string; mlkemPkHex: string; x25519PkHex: string }>;
  ovBuildOvpk(session: string, role: string, mlkemPkHex: string, x25519PkHex: string): Promise<string>;
  ovEncodeOv36(keyIndex: number, payload: string, indexCharset: string, specialCharset: string): Promise<string>;
  ovDecodeOv36(msg: string, indexCharset: string, specialCharset: string): Promise<{ keyIndex: number; payload: string }>;
  ovRespondPairing(mlkemEkHex: string, x25519PubHex: string): Promise<{ contactKeyHex: string; sas: string; myX25519PubHex: string; mlkemCtHex: string }>;
  ovPairingAnnounce(ovpkMsg: string): Promise<{ ovbA: string; stateHex: string }>;
  ovPairingFinish(stateHex: string, ovbBMsg: string): Promise<{ contactKeyHex: string; sas: string }>;
  ovHybridRespond(ovpkSms: string): Promise<{ replySms: string; contactKeyHex: string; sas: string }>;
  ov36Decode(msg: string, contactKeyHex: string): Promise<{ secureIndex: string; plaintext: string }>;
  ov36Encode(plaintext: string, contactKeyHex: string): Promise<string>;
}

interface SmsNative {
  sendSms(phoneNumber: string, body: string): Promise<boolean>;
  isDefaultSmsApp(): Promise<boolean>;
  requestSmsRole(): Promise<boolean>;
  setScreenSecure(enabled: boolean): Promise<boolean>;
  getSimNumbers(): Promise<SimInfo[]>;
  readLatestPairingSms(): Promise<string | null>;
}

export interface SimInfo {
  slot: number;
  number: string;
  carrier: string;
  displayName: string;
}

export const OvCore = NativeModules.OvCore as OvCoreNative;
export const Sms = NativeModules.SmsModule as SmsNative;

export interface IncomingSms {
  address: string;
  body: string;
  date: number;
  type: number;
}

/** Subscribe to inbound SMS. Returns an unsubscribe fn. */
export function onSmsReceived(handler: (msg: IncomingSms) => void): () => void {
  if (!NativeModules.SmsModule) return () => {};
  const emitter = new NativeEventEmitter(NativeModules.SmsModule);
  const sub = emitter.addListener('onSmsReceived', handler);
  return () => sub.remove();
}

/** True on a real device build where the native modules are linked. */
export const nativeAvailable = !!NativeModules.OvCore && !!NativeModules.SmsModule;

/** `.ov` = encrypted file container produced by encryptFile. */
export function isOvFile(filename: string): boolean {
  return filename.toLowerCase().endsWith('.ov');
}

// SMS payload budget per single message before multipart kicks in. UCS-2 caps a
// single SMS at 70 chars, but our payloads are base64 (GSM7-safe) so 140 is safe
// for the first segment; the native side auto-splits anything longer.
export const SMS_MAX_LEN = 140;
