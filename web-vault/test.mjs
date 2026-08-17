import { readFileSync } from 'fs';
import { decode } from './ov36.js';
const dir = process.argv[2];
const ck = readFileSync(dir + '/ck_db.txt', 'utf8').replace(/\n+$/, '');
const msgs = readFileSync(dir + '/msgs_db.txt', 'utf8').split('\n').filter(l => l.startsWith('OV36:'));
for (const m of msgs) {
  try { console.log('OK:', JSON.stringify(decode(m, ck).plaintext)); }
  catch (e) { console.log('ERR:', e.message); }
}
