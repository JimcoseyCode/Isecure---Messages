import * as FileSystem from 'expo-file-system';
import * as Sharing from 'expo-sharing';
import { getContacts, getMessages } from './database/db';

// Export the owner's own archived conversations (contacts + keys + messages) in the
// web-vault format. Party-to-own-conversation archival only — this is your data.
export interface ArchiveContact {
  name: string;
  phone: string;
  contactKey: string | null;   // slot4 contactKey for OV-compat contacts
  keyPool: string[] | null;
  messages: { dir: 'in' | 'out'; body: string; ts: number }[];
}

export async function buildArchive(): Promise<{ exportedAt: number; contacts: ArchiveContact[] }> {
  const contacts = await getContacts(); // DEK vault decrypts keys in-memory
  const out: ArchiveContact[] = [];
  for (const c of contacts) {
    const msgs = await getMessages(c.id);
    out.push({
      name: c.name,
      phone: c.phone,
      contactKey: c.key_hex,
      keyPool: c.key_pool ? JSON.parse(c.key_pool) : null,
      messages: msgs.map((m) => ({
        dir: m.is_sent ? 'out' : 'in',
        body: m.content,
        ts: m.created_at,
      })),
    });
  }
  return { exportedAt: Math.floor(Date.now() / 1000), contacts: out };
}

/** Write the archive JSON to a file and open the share sheet (save / send to your vault). */
export async function exportArchive(): Promise<void> {
  const archive = await buildArchive();
  const json = JSON.stringify(archive, null, 2);
  const path = `${FileSystem.cacheDirectory}isecure-archive-${Date.now()}.json`;
  await FileSystem.writeAsStringAsync(path, json, { encoding: FileSystem.EncodingType.UTF8 });
  if (await Sharing.isAvailableAsync()) {
    await Sharing.shareAsync(path, { mimeType: 'application/json', dialogTitle: 'Exporter mes conversations' });
  }
}
