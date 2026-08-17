// OV36 decoder — JS port of ov-core/src/ov36.rs (byte-exact, validated).
// Decrypts OV Message OV36 frames given the pairing contactKey (slot4 form,
// synced from the mobile app). Party-to-your-own-conversations use only.
import { sha3_256 } from '@noble/hashes/sha3.js';
import { sha256 } from '@noble/hashes/sha2.js';
import { hmac } from '@noble/hashes/hmac.js';
import { UNIVERSAL, INDEX_CHARSET } from './charsets.js';

const UNI = Array.from(UNIVERSAL);        // 4096 code points
const IDX = Array.from(INDEX_CHARSET);    // 512
const MODULUS = 4096;
const B36 = '0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ';
const enc = new TextEncoder();
const u8 = (s) => enc.encode(s);
const hex = (b) => Array.from(b, (x) => x.toString(16).padStart(2, '0')).join('');

const sha3hex = (s) => hex(sha3_256(u8(s)));
const hmac256 = (key, data) => hmac(sha256, key, data); // key,data: Uint8Array

function b36decode(s) {
  let acc = 0;
  for (const c of s) {
    const d = B36.indexOf(c.toUpperCase());
    if (d < 0) throw new Error('non-base36 digit');
    acc = acc * 36 + d;
  }
  return acc;
}

// Seeded SHA-256-counter PRNG + Fisher-Yates (matches ov36.rs deriveCharset).
function deriveCharset(base, a, b) {
  const arr = base.slice();
  let state = sha3hex(`${a}|${b}`);
  let counter = 0;
  const nextInt = (max) => {
    const range = max + 1;
    const limit = Math.floor(0x100000000 / range) * range;
    for (;;) {
      const h = sha256(new Uint8Array([...u8(state), ...u8(String(counter))]));
      state = hex(h);
      counter++;
      const v = parseInt(state.slice(0, 8), 16);
      if (v < limit) return v % range;
    }
  };
  for (let i = arr.length - 1; i >= 1; i--) {
    const j = nextInt(i);
    [arr[i], arr[j]] = [arr[j], arr[i]];
  }
  return arr;
}

function recoverSecureIndex(idxEnc, contactKey) {
  const dIndex = deriveCharset(IDX, contactKey, 'OV_INDEX_CHARSET_V1');
  const chars = Array.from(idxEnc);
  if (chars.length % 2 !== 0) throw new Error('odd index length');
  let si = '';
  for (let i = 0; i < chars.length; i += 2) {
    const v = b36decode(chars[i] + chars[i + 1]);
    si += dIndex[v];
  }
  return si;
}

// subKey = HMAC(HMAC(key=secureIndex, msg=contactKey), "OV_Charset_v1"||0x01).hex
function deriveSubkey(secureIndex, contactKey) {
  const prk = hmac256(u8(secureIndex), u8(contactKey));
  const label = new Uint8Array([...u8('OV_Charset_v1'), 0x01]);
  return hex(hmac256(prk, label));
}

function shiftMod(ctxA, pos, subKey) {
  const d = sha3_256(u8(`${ctxA}:${pos}:${subKey}`));
  return ((d[30] & 0x0f) << 8) | d[31];
}

/** Decode an "OV36:" frame with the pairing contactKey (slot4 form). */
export function decode(msg, contactKey) {
  if (!msg.startsWith('OV36:')) throw new Error('not an OV36 frame');
  const body = msg.slice(5);
  const gt = body.indexOf('>');
  if (gt < 0) throw new Error("missing '>'");
  const idxEnc = body.slice(0, gt);
  const after = body.slice(gt + 1);
  const colon = after.indexOf(':');
  if (colon < 0) throw new Error("missing ':'");
  const payload = after.slice(colon + 1);

  const secureIndex = recoverSecureIndex(idxEnc, contactKey);
  const ctxA = sha3hex(secureIndex);
  const subKey = deriveSubkey(secureIndex, contactKey);

  const groups = Array.from(payload);
  if (groups.length % 3 !== 0) throw new Error('payload not a multiple of 3');
  let out = '';
  for (let k = 0; k < groups.length / 3; k++) {
    const num = b36decode(groups[3 * k] + groups[3 * k + 1] + groups[3 * k + 2]);
    const shift = shiftMod(ctxA, k, subKey);
    out += UNI[(num + MODULUS - shift) % MODULUS];
  }
  return { secureIndex, plaintext: out.replace(/\s+$/, '') };
}
