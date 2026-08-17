import * as SQLite from 'expo-sqlite';
import { sealSecret, openSecret } from '../vault';

let db: SQLite.SQLiteDatabase;

// Decrypt a contact's at-rest key material into memory (DEK vault). No-op for
// plaintext keys (retrocompat). Keeps all sync call sites unchanged downstream.
async function unsealContact(c: Contact | null): Promise<Contact | null> {
  if (!c) return c;
  c.key_hex = await openSecret(c.key_hex);
  c.key_pool = await openSecret(c.key_pool);
  return c;
}
async function unsealContacts(list: Contact[]): Promise<Contact[]> {
  for (const c of list) await unsealContact(c);
  return list;
}

export function getDB(): SQLite.SQLiteDatabase {
  if (!db) {
    db = SQLite.openDatabaseSync('ov_message.db');
  }
  return db;
}

export async function initDB(): Promise<void> {
  const database = getDB();

  await database.execAsync(`
    PRAGMA journal_mode = WAL;

    CREATE TABLE IF NOT EXISTS contacts (
      id INTEGER PRIMARY KEY AUTOINCREMENT,
      name TEXT NOT NULL,
      phone TEXT NOT NULL UNIQUE,
      key_hex TEXT,
      key_pool TEXT,
      current_key_index INTEGER DEFAULT 0,
      is_blocked INTEGER DEFAULT 0,
      is_pinned INTEGER DEFAULT 0,
      ephemeral_duration INTEGER DEFAULT 0,
      created_at INTEGER NOT NULL DEFAULT (strftime('%s', 'now')),
      updated_at INTEGER NOT NULL DEFAULT (strftime('%s', 'now'))
    );

    CREATE TABLE IF NOT EXISTS messages (
      id INTEGER PRIMARY KEY AUTOINCREMENT,
      contact_id INTEGER NOT NULL,
      content TEXT NOT NULL,
      encrypted_content TEXT,
      is_encrypted INTEGER DEFAULT 0,
      is_sent INTEGER DEFAULT 1,
      msg_index INTEGER,
      hmac_tag TEXT,
      is_read INTEGER DEFAULT 0,
      is_ephemeral INTEGER DEFAULT 0,
      expires_at INTEGER,
      created_at INTEGER NOT NULL DEFAULT (strftime('%s', 'now')),
      FOREIGN KEY (contact_id) REFERENCES contacts(id)
    );

    CREATE TABLE IF NOT EXISTS notes (
      id INTEGER PRIMARY KEY AUTOINCREMENT,
      title TEXT,
      content TEXT NOT NULL,
      encrypted_content TEXT,
      is_encrypted INTEGER DEFAULT 0,
      created_at INTEGER NOT NULL DEFAULT (strftime('%s', 'now')),
      updated_at INTEGER NOT NULL DEFAULT (strftime('%s', 'now'))
    );

    CREATE TABLE IF NOT EXISTS settings (
      key TEXT PRIMARY KEY,
      value TEXT NOT NULL
    );

    CREATE TABLE IF NOT EXISTS dedup_history (
      id INTEGER PRIMARY KEY AUTOINCREMENT,
      contact_id INTEGER NOT NULL,
      fingerprint TEXT NOT NULL,
      created_at INTEGER NOT NULL DEFAULT (strftime('%s', 'now')),
      UNIQUE(contact_id, fingerprint)
    );

    CREATE TABLE IF NOT EXISTS ecdh_sessions (
      id INTEGER PRIMARY KEY AUTOINCREMENT,
      contact_id INTEGER NOT NULL,
      private_key_hex TEXT NOT NULL,
      public_key_hex TEXT NOT NULL,
      their_public_key_hex TEXT,
      shared_secret_hex TEXT,
      status TEXT NOT NULL DEFAULT 'pending',
      created_at INTEGER NOT NULL DEFAULT (strftime('%s', 'now'))
    );
  `);
}

// Contacts
export async function getContacts(): Promise<Contact[]> {
  return unsealContacts(await getDB().getAllAsync<Contact>(
    'SELECT * FROM contacts WHERE is_blocked = 0 ORDER BY is_pinned DESC, name ASC'
  ));
}

export async function getContact(id: number): Promise<Contact | null> {
  return unsealContact(await getDB().getFirstAsync<Contact>('SELECT * FROM contacts WHERE id = ?', [id]));
}

export async function getContactByPhone(phone: string): Promise<Contact | null> {
  return unsealContact(await getDB().getFirstAsync<Contact>('SELECT * FROM contacts WHERE phone = ?', [phone]));
}

export async function insertContact(contact: Omit<Contact, 'id' | 'created_at' | 'updated_at'>): Promise<number> {
  const result = await getDB().runAsync(
    'INSERT INTO contacts (name, phone, key_hex, key_pool, current_key_index, is_blocked, is_pinned, ephemeral_duration) VALUES (?, ?, ?, ?, ?, ?, ?, ?)',
    [contact.name, contact.phone, await sealSecret(contact.key_hex ?? null), await sealSecret(contact.key_pool ?? null), contact.current_key_index ?? 0, contact.is_blocked ?? 0, contact.is_pinned ?? 0, contact.ephemeral_duration ?? 0]
  );
  return result.lastInsertRowId;
}

export async function updateContactKey(id: number, keyHex: string): Promise<void> {
  await getDB().runAsync(
    'UPDATE contacts SET key_hex = ?, updated_at = strftime(\'%s\', \'now\') WHERE id = ?',
    [await sealSecret(keyHex), id]
  );
}

export async function deleteContact(id: number): Promise<void> {
  await getDB().runAsync('DELETE FROM contacts WHERE id = ?', [id]);
  await getDB().runAsync('DELETE FROM messages WHERE contact_id = ?', [id]);
}

// Messages
export async function getMessages(contactId: number): Promise<Message[]> {
  return getDB().getAllAsync<Message>(
    'SELECT * FROM messages WHERE contact_id = ? ORDER BY created_at ASC',
    [contactId]
  );
}

export async function insertMessage(msg: Omit<Message, 'id' | 'created_at'>): Promise<number> {
  const result = await getDB().runAsync(
    'INSERT INTO messages (contact_id, content, encrypted_content, is_encrypted, is_sent, msg_index, hmac_tag, is_read, is_ephemeral, expires_at) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)',
    [msg.contact_id, msg.content, msg.encrypted_content ?? null, msg.is_encrypted ?? 0, msg.is_sent ?? 1, msg.msg_index ?? null, msg.hmac_tag ?? null, msg.is_read ?? 0, msg.is_ephemeral ?? 0, msg.expires_at ?? null]
  );
  return result.lastInsertRowId;
}

export async function getLastMessage(contactId: number): Promise<Message | null> {
  return getDB().getFirstAsync<Message>(
    'SELECT * FROM messages WHERE contact_id = ? ORDER BY created_at DESC LIMIT 1',
    [contactId]
  );
}

// Settings
export async function getSetting(key: string, defaultValue = ''): Promise<string> {
  const row = await getDB().getFirstAsync<{ value: string }>('SELECT value FROM settings WHERE key = ?', [key]);
  return row?.value ?? defaultValue;
}

export async function setSetting(key: string, value: string): Promise<void> {
  await getDB().runAsync('INSERT OR REPLACE INTO settings (key, value) VALUES (?, ?)', [key, value]);
}

// Notes
export async function getNotes(): Promise<Note[]> {
  return getDB().getAllAsync<Note>('SELECT * FROM notes ORDER BY updated_at DESC');
}

export async function insertNote(note: Omit<Note, 'id' | 'created_at' | 'updated_at'>): Promise<number> {
  const result = await getDB().runAsync(
    'INSERT INTO notes (title, content, encrypted_content, is_encrypted) VALUES (?, ?, ?, ?)',
    [note.title ?? '', note.content, note.encrypted_content ?? null, note.is_encrypted ?? 0]
  );
  return result.lastInsertRowId;
}

export async function deleteNote(id: number): Promise<void> {
  await getDB().runAsync('DELETE FROM notes WHERE id = ?', [id]);
}

// Blocked contacts
export async function getBlockedContacts(): Promise<Contact[]> {
  return unsealContacts(await getDB().getAllAsync<Contact>('SELECT * FROM contacts WHERE is_blocked = 1 ORDER BY name ASC'));
}

export async function blockContact(id: number): Promise<void> {
  await getDB().runAsync('UPDATE contacts SET is_blocked = 1, updated_at = strftime(\'%s\', \'now\') WHERE id = ?', [id]);
}

export async function unblockContact(id: number): Promise<void> {
  await getDB().runAsync('UPDATE contacts SET is_blocked = 0, updated_at = strftime(\'%s\', \'now\') WHERE id = ?', [id]);
}

export async function setPinned(id: number, pinned: boolean): Promise<void> {
  await getDB().runAsync('UPDATE contacts SET is_pinned = ?, updated_at = strftime(\'%s\', \'now\') WHERE id = ?', [pinned ? 1 : 0, id]);
}

export async function updateContact(id: number, name: string, phone: string): Promise<void> {
  await getDB().runAsync(
    'UPDATE contacts SET name = ?, phone = ?, updated_at = strftime(\'%s\', \'now\') WHERE id = ?',
    [name, phone, id]
  );
}

export async function updateContactKeyPool(id: number, keyHex: string, keyPool: string[], poolIndex: number): Promise<void> {
  await getDB().runAsync(
    'UPDATE contacts SET key_hex = ?, key_pool = ?, current_key_index = ?, updated_at = strftime(\'%s\', \'now\') WHERE id = ?',
    [await sealSecret(keyHex), await sealSecret(JSON.stringify(keyPool)), poolIndex, id]
  );
}

export async function advanceKeyPoolIndex(contactId: number): Promise<string | null> {
  const contact = await getContact(contactId);
  if (!contact?.key_pool) return null;
  const pool: string[] = JSON.parse(contact.key_pool);
  const next = (contact.current_key_index + 1) % pool.length;
  await getDB().runAsync('UPDATE contacts SET current_key_index = ? WHERE id = ?', [next, contactId]);
  return pool[next];
}

// Dedup history — prevents replay attacks
export async function isDuplicate(contactId: number, fingerprint: string): Promise<boolean> {
  const row = await getDB().getFirstAsync<{ id: number }>(
    'SELECT id FROM dedup_history WHERE contact_id = ? AND fingerprint = ?',
    [contactId, fingerprint]
  );
  return !!row;
}

export async function addDedupEntry(contactId: number, fingerprint: string): Promise<void> {
  try {
    await getDB().runAsync(
      'INSERT OR IGNORE INTO dedup_history (contact_id, fingerprint) VALUES (?, ?)',
      [contactId, fingerprint]
    );
    // Rotate: keep last 2000 entries per contact
    await getDB().runAsync(
      `DELETE FROM dedup_history WHERE contact_id = ? AND id NOT IN (
         SELECT id FROM dedup_history WHERE contact_id = ? ORDER BY id DESC LIMIT 2000
       )`,
      [contactId, contactId]
    );
  } catch {}
}

export async function getDedupCount(contactId: number): Promise<number> {
  const row = await getDB().getFirstAsync<{ n: number }>(
    'SELECT COUNT(*) as n FROM dedup_history WHERE contact_id = ?',
    [contactId]
  );
  return row?.n ?? 0;
}

// ECDH sessions
export async function createEcdhSession(contactId: number, privateKeyHex: string, publicKeyHex: string): Promise<number> {
  const result = await getDB().runAsync(
    'INSERT INTO ecdh_sessions (contact_id, private_key_hex, public_key_hex, status) VALUES (?, ?, ?, ?)',
    [contactId, privateKeyHex, publicKeyHex, 'pending']
  );
  return result.lastInsertRowId;
}

export async function getPendingEcdhSession(contactId: number): Promise<EcdhSession | null> {
  return getDB().getFirstAsync<EcdhSession>(
    'SELECT * FROM ecdh_sessions WHERE contact_id = ? AND status = ? ORDER BY created_at DESC LIMIT 1',
    [contactId, 'pending']
  );
}

export async function completeEcdhSession(sessionId: number, theirPublicKeyHex: string, sharedSecretHex: string): Promise<void> {
  await getDB().runAsync(
    'UPDATE ecdh_sessions SET their_public_key_hex = ?, shared_secret_hex = ?, status = ? WHERE id = ?',
    [theirPublicKeyHex, sharedSecretHex, 'complete', sessionId]
  );
}

export async function deleteMessages(contactId: number): Promise<void> {
  await getDB().runAsync('DELETE FROM messages WHERE contact_id = ?', [contactId]);
}

export async function markMessageRead(messageId: number): Promise<void> {
  await getDB().runAsync('UPDATE messages SET is_read = 1 WHERE id = ?', [messageId]);
}

export async function deleteAllData(): Promise<void> {
  await getDB().execAsync(`
    DELETE FROM messages;
    DELETE FROM contacts;
    DELETE FROM notes;
    DELETE FROM settings;
    DELETE FROM dedup_history;
    DELETE FROM ecdh_sessions;
  `);
}

export async function deleteMessage(id: number): Promise<void> {
  await getDB().runAsync('DELETE FROM messages WHERE id = ?', [id]);
}

export async function updateContactEphemeral(id: number, durationSeconds: number): Promise<void> {
  await getDB().runAsync(
    "UPDATE contacts SET ephemeral_duration = ?, updated_at = strftime('%s', 'now') WHERE id = ?",
    [durationSeconds, id]
  );
}

export interface Contact {
  id: number;
  name: string;
  phone: string;
  key_hex: string | null;
  key_pool: string | null;
  current_key_index: number;
  is_blocked: number;
  is_pinned: number;
  ephemeral_duration: number;
  created_at: number;
  updated_at: number;
}

export interface Message {
  id: number;
  contact_id: number;
  content: string;
  encrypted_content: string | null;
  is_encrypted: number;
  is_sent: number;
  msg_index: number | null;
  hmac_tag: string | null;
  is_read: number;
  is_ephemeral: number;
  expires_at: number | null;
  created_at: number;
}

export interface Note {
  id: number;
  title: string | null;
  content: string;
  encrypted_content: string | null;
  is_encrypted: number;
  created_at: number;
  updated_at: number;
}

export interface EcdhSession {
  id: number;
  contact_id: number;
  private_key_hex: string;
  public_key_hex: string;
  their_public_key_hex: string | null;
  shared_secret_hex: string | null;
  status: string;
  created_at: number;
}
