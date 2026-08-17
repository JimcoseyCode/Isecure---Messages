import { readFileSync } from 'fs';
import { decode } from './ov36.js';
const a = JSON.parse(readFileSync('./sample-archive.json','utf8'));
for (const c of a.contacts) for (const m of c.messages)
  console.log('•', decode(m.body, c.contactKey).plaintext);
