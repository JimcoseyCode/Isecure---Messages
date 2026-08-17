# iSecure — Coffre Web (web-vault)

Web dashboard to read **your own** archived OV Message conversations, decrypted in the
browser. OV Message rotates and deletes keys (forward secrecy) → old messages become
unreadable in-app. This vault keeps your keys so **your** conversations with **your clients**
stay readable on your side, forever.

> **Scope / legitimacy:** you are a party to every conversation here (your clients message
> you, to be read by you). This is your own data. Not a tool to read anyone else's messages.
> Inform your clients that you archive communications (GDPR is your responsibility).

## What's here
- `ov36.js` — OV36 decoder, byte-exact JS port of the validated Rust codec (`ov-core/src/ov36.rs`).
  Runs in the browser (via the import map in `index.html`) and in Node (via `node_modules`).
- `charsets.js` — embedded OV36 charsets (universal 4096, index 512).
- `index.html` — the dashboard: load an archive → contacts list + decrypted conversations.
- `sample-archive.json` — demo archive (real triple, decodes to real messages).
- `test.mjs` / `test_archive.mjs` — Node validation.

## Archive format (what the mobile app exports)
```json
{
  "contacts": [
    {
      "name": "Client X",
      "phone": "+33...",
      "contactKey": "<slot4 contactKey synced from the mobile pairing>",
      "messages": [ { "dir": "in|out", "body": "OV36:...", "ts": 1699999999 } ]
    }
  ]
}
```
The `contactKey` is the slot4 key iSecure derives at pairing (already persisted in the app's
DB). The web only needs `decode(body, contactKey)` — no pairing/RE happens in the browser.

## Run
```bash
cd web-vault
python3 -m http.server 8000     # or any static server (needs a server for ES modules + importmap)
# open http://localhost:8000  → "Charger une archive…" → pick your export JSON
```
Node self-test:
```bash
ln -s ../app_src/node_modules node_modules   # for @noble/hashes
node test_archive.mjs
```

## Next (mobile side)
Add an **Export** in the app: dump `contacts` (name, phone, `key_hex`/`contactKey`) + their
`messages` to this JSON, encrypted under a passphrase, and let the vault import it. The
decoder above is the hard part and is done.

## Security
- Keys/messages are sensitive — encrypt the archive at rest, protect the vault (auth, HTTPS).
- Everything decrypts **locally** in the browser; nothing is uploaded by `index.html`.
