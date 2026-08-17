import * as SecureStore from 'expo-secure-store';
import { OvCore } from './native/ovcore';

// At-rest protection for contact key material (white paper #30-32). Each secret
// (contact key_hex / key_pool JSON) is AES-256-GCM sealed under the DEK — the
// Argon2id-derived master key that exists only when a login password is set.
// Retrocompat (#33): no password → no DEK → secrets stay plaintext, unchanged.

const PREFIX = 'VLT1:';

async function getDEK(): Promise<string | null> {
  return SecureStore.getItemAsync('master_key');
}

/** Seal a secret under the DEK. No DEK (no password) → returned as-is. */
export async function sealSecret(plain: string | null): Promise<string | null> {
  if (!plain) return plain;
  if (plain.startsWith(PREFIX)) return plain; // already sealed
  const dek = await getDEK();
  if (!dek) return plain;
  try { return PREFIX + (await OvCore.sealMessage(dek, 0, plain)); }
  catch { return plain; }
}

/** Open a stored secret. Plaintext (no prefix) is returned unchanged. */
export async function openSecret(stored: string | null): Promise<string | null> {
  if (!stored || !stored.startsWith(PREFIX)) return stored;
  const dek = await getDEK();
  if (!dek) return null; // sealed but locked
  try { return await OvCore.openMessage(dek, stored.slice(PREFIX.length)); }
  catch { return null; }
}
