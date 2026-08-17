# OV Message — message layer (OV1 / OV36 / OVB), reverse-engineered from Hermes bytecode

Source of truth: `hbc-disassembler` on `apktool_out/assets/index.android.bundle`
(HBC v96) → `ov.hasm`. Pairing/SAS is already solved (see `OV_PAIRING_CRYPTO.md`);
this file covers the **message** layer that must now interoperate.

## Real captured messages (this device, paired session)

See `REAL_OV_MESSAGES.txt`. Three coexisting formats seen live:

```
OVB:xaKw_IyW8USVISLnvo2URg:T1bil5As0JzDqSniiYjDokXiiYzOoc+D4p+p5L2n4qKM…   ← current message format
OV1|0|Kb3JsoBis5q0VyzC3pHvfS79Ok9CdUUlxfdD9A8hDof3x7s
OV36:BKB07P8D6905AB4DE2COBK⟩uNnLHsw0WefkRIabSCsbhw:2E832N2Y921C2HF0…
OVB:A:<x25519_b64(32)>.<mlkem_b64(1184)>       ← PAIRING handshake (not a message)
OVB:B:<x25519_b64(32)>.<mlkem_ct_b64(1088)>    ← PAIRING handshake (not a message)
```

Note `OVB:` is overloaded: `OVB:A|B:` = pairing key-exchange (already handled in
`ovcompat.rs`); `OVB:<16-byte-id>:<payload>` = an encrypted **message**.

## Format detection — `validateMessageFormat` (fn #14500)

```
isOvMessage(m) = m.startsWith("OV") && m.includes("⟩")     # ⟩ = U+27E9 (NOT ASCII '>')
```
Decoder (#14503) splits on `⟩` into exactly 2 parts; part[0] with a leading marker
stripped is the **index** string, part[1] is the **payload**. Error strings (FR):
`"Clé de contact manquante"`, `"Format de message invalide"`, `"Index string invalide"`.

## Charset derivation (OV36 / substitution layer)

`deriveCharset(baseCharset, seedA, seedB)` (fn #14780):
```
seed = SHA3-256( seedA + "|" + seedB ).digest("hex")       # note the literal "|" join
out  = deterministicShuffle([...baseCharset], seed)
```

`deterministicShuffle(array, seedHex)` (fn #14779) — Fisher-Yates with a seeded PRNG:
```
a = [...array]
prng = SeededPrng(seedHex)
for i = a.length-1 down to 1:
    j = prng.nextInt(i)          # arg is i (current high index)
    swap a[i], a[j]
return a
```

Per-contact charsets are cached; `getDerivedCharsets` (#14785) returns
`{ specialCharset, indexCharset }`, built via `getDerivedSpecialCharset` (#14783)
and `getDerivedIndexCharset` (#14784) keyed by contactKey.

## Key derivation from the pairing contactKey

`deriveMessageSubKey(info, contactKey)` (fn #14781):
```
prk    = HMAC-SHA256(key = contactKey_utf8, info_utf8)
subkey = HMAC-SHA256(key = prk, LABEL ‖ 0x01).digest("hex")     # LABEL from env slot 5
```
Message-layer labels present in the string table: **`OV_DEK_v1`** (data-encryption
key), **`OV_MSG_MAC_v1`** (message MAC key). Compare with the pairing labels
`OV_PQHybrid_*`. `setDEK`/`getDEK`/`clearDEK` (#14560–14562) cache the DEK per contact.

## OVB message AEAD (fn #14793, 888 bytes — uses `OV_MSG_MAC_v1`)

Helpers around it:
- `deriveMacKey` (#14807), `computeTag16` (#14808) → 16-byte MAC tag
- `replayKey` (#14809) → replay/nonce id (the 16-byte `OVB:<id>:` field)
- `_u8ToBase64` (#14804), `toBase64Url` (#14805), `constTimeEqualStr` (#14806)
- AEAD primitive: `aesGcmCipher`/`_aesGcmCipher` (#13240/#13241); generic
  `encrypt`/`decrypt`/`deriveKey` (#13338/#13322/#13334); `generateNonce` (#19528)

Shape (to confirm byte-exact next): `OVB:<replayKey_b64url(16B)>:<payload>` where
payload carries the AES-GCM ciphertext+tag, DEK = `deriveMessageSubKey("OV_DEK_v1", contactKey)`,
MAC key = `deriveMessageSubKey("OV_MSG_MAC_v1", contactKey)`, tag = `computeTag16`.

## OV36 substitution message

`OV36:<indexEnc>⟩<idOrNonce_b64url>:<payloadEnc>`. `indexEnc`/`payloadEnc` are the
plaintext mapped through `indexCharset` / `specialCharset` (base-N substitution using
the shuffled charsets above). Base36 helpers: `encodeIndexToBase36` (#15089),
`encodePayloadToBase36` (#15091), `encodeOvMessageToBase36` (#15093),
`numberToBase36_2/_3` (#15085/#15087).

## Function map (message layer, in ov.hasm)

| # | name | role |
|---|------|------|
| 13240/13241 | aesGcmCipher/_aesGcmCipher | AES-GCM AEAD |
| 13322/13334/13338 | decrypt/deriveKey/encrypt | WebCrypto-style AEAD wrappers |
| 14500/14503 | validateMessageFormat / decoder | format detect + split on ⟩ |
| 14560/14561/14562 | setDEK/getDEK/clearDEK | per-contact DEK cache |
| 14779 | deterministicShuffle | seeded Fisher-Yates |
| 14780 | deriveCharset | SHA3-256(a\|b) → shuffle |
| 14781 | deriveMessageSubKey | HMAC-SHA256 chain (DEK / MAC key) |
| 14783/14784/14785 | getDerived{Special,Index}Charset / getDerivedCharsets | per-contact charsets |
| 14793 | (OVB AEAD core) | uses OV_MSG_MAC_v1 |
| 14804/14805/14806 | _u8ToBase64/toBase64Url/constTimeEqualStr | encoding + const-time compare |
| 14807/14808/14809 | deriveMacKey/computeTag16/replayKey | OVB MAC + replay id |
| 15085–15093 | numberToBase36*/encode*ToBase36 | OV36 base36 |
| 19528 | generateNonce | random nonce |

## encryptMessage flow (fn #14868, byte-exact)

```
encryptMessage(plaintext, contactId):
  if !plaintext.trim()      throw "Texte vide"
  if !contactId             throw "ID de contact manquant"
  key = await loadContactKey(contactId)          # the pairing contactKey (hex)
  if !key                   throw "Clé de contact non trouvée"
  indexCharset   = getDerivedIndexCharset(contactId, INDEX_CHARSET)
  norm           = plaintext.normalize("NFC").replace(/\r\n/g,"\n").replace(/\r/g,"\n")
  secureIndex    = await generateSecureIndex(contactId, 11)      # 11 = index length
  specialCharset = getDerivedSpecialCharsetForMessage(contactId, getSpecialCharSet(), secureIndex)
  enc            = await encryptSubstitution(norm, specialCharset, …)   # returns "<indexEnc>⟩<payloadEnc>"
  idx            = enc.indexOf("⟩");  payload = enc.slice(idx+1)
  macKey         = deriveMacKey(key, contactId)
  tag            = computeTag16(secureIndex, <aad>, payload, macKey)     # 16-byte hex/bytes
  frame          = "OV" + secureIndex + ":" + … + payload (+ tag)        # ⟩-form
  if isBase36ModeEnabled():  return encodeOvMessageToBase36(...)         # -> OV36:
  if isBase64ModeEnabled():  return "OVB:" + base64(utf8(frame)) (+ ":" + …)   # -> OVB:
  else:                      return frame                                # raw ⟩ form
```

Errors (FR, for matching): `"Texte vide"`, `"ID de contact manquant"`,
`"Clé de contact non trouvée"`, `"Format chiffré invalide"`.

## Exact MAC / key formulas (byte-exact)

```
deriveMacKey(contactKey, ctx):                 # ctx = contactId
    prk    = HMAC-SHA256(key = "OV_MSG_HMAC_SALT_v1|" + ctx,  contactKey)
    macKey = HMAC-SHA256(key = prk,  "OV_MSG_MAC_v1" ‖ 0x01)

computeTag16(a, b, ciphertext, macKey):
    tag = HMAC-SHA256(macKey,  utf8(a + "|" + b) ‖ ciphertext).subarray(0,16)

replayKey(a, b) = "replay_" + a + "_" + b

deriveMessageSubKey(info, contactKey):         # DEK path, LABEL = "OV_DEK_v1"
    prk    = HMAC-SHA256(key = contactKey, info)
    subkey = HMAC-SHA256(key = prk, LABEL ‖ 0x01).hex()
```

New labels: **`OV_MSG_HMAC_SALT_v1|`** (MAC salt, note trailing `|`), `OV_MSG_MAC_v1`,
`OV_DEK_v1`. Index length constant = **11**. Charset join uses literal `"|"`.

## Seeded PRNG — `createSeededPRNG`/`nextInt` (fn #14777/#14778, byte-exact)

```
createSeededPRNG(seedHex):  state = seedHex (string); counter = 0
nextInt(max):
    range = max + 1
    limit = floor(2^32 / range) * range          # rejection-sampling threshold
    loop:
        state   = sha256(state + String(counter)).digest("hex")   # hex string
        counter = counter + 1
        v       = parseInt(state.substring(0, 8), 16)              # top 32 bits
        if v < limit: return v % range
```
`deterministicShuffle(arr, seedHex)`: copy arr; prng = createSeededPRNG(seedHex);
for i=len-1..1: j = prng.nextInt(i); swap arr[i], arr[j].

## OV36 wire format (base36 mode)

Base36 alphabet = `0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ` (`numberToBase36_2`,
`encodeIndexToBase36`, decode via `.indexOf(char.toUpperCase())`, val = d0*36+d1).

Raw substitution output is `<indexEnc>⟩<payloadEnc>` (⟩ = U+27E9).
`encodeOvMessageToBase36` rewrites it to the wire form (⟩ → literal `>`):
```
OV36:<indexEnc>><nonce_b64url(16B)>:<payloadEnc>
```
Confirmed on a live message: `OV36:9W3P4K8N8JC586BXDMAO7D>i828xzXD1jErFcVCLO8baA:19Y1TB0T90CT0WC1…`
- index part (base36, per-contact shuffled `indexCharset`)
- `>` then a 22-char base64url nonce (16 bytes)
- `:` then payload (base36, per-message shuffled `specialCharset`).

## Live known-answer triple (for offline validation)

`ov-core/OV36_KNOWN_ANSWER.txt` — captured from session DEJR via the native harness:
```
contactKey = bd7643d9953adb1675e13e5ab840546cb25d642d0d37df400b9040d996c27160
plaintext  = "test123"
OV36       = OV36:9W3P4K8N8JC586BXDMAO7D>i828xzXD1jErFcVCLO8baA:19Y1TB0T90CT0WC11A2LU2EN1S21WO0YD1LV
```
This unblocks offline reversal — no more device interaction needed.

## The substitution cipher (byte-exact core)

`hashString(s) = SHA3-256(s).digest("hex")` (fn #14483; throws
"Échec critique du hachage SHA3-256" on failure).

Universal plaintext alphabet = `getUniversalCharset()` (fn #14715): a fixed ordered
list built as `charRange(1425,1479)` (Hebrew) + a base string
`azertyuiopqsdfghjklmwxcvbnAZERTYUIOPQSDFGHJKLMWXCVBN0123456789@#%&-+()*"…` (AZERTY
order, then digits, symbols, accents) + ~50 more `charRange(a,b)` blocks
(Georgian, Armenian, Cyrillic, Ethiopic, Greek, Vietnamese, …). `charRange(a,b)` =
`String.fromCharCode(i)` for i in [a,b]. `charMap` = Map(char → index in this list).

`generateSubstitution` (fn #14488) — per-character keyed Caesar over the output charset:
```
cacheKey = `${ctxA}:${position}:${ctxB}`
shift    = BigInt("0x" + hashString(cacheKey)) mod BigInt(charset.length)
ci       = charMap.get(char)              # index of plaintext char in universal alphabet
if ci === undefined: return "∑"           # unsupported char sentinel
return charset[ Number( (BigInt(ci) + shift) mod BigInt(charset.length) ) ]
```
`getReverseSubstitution` (fn #14489) is the inverse: `ci = (outIndex − shift) mod len`,
then `universalCharset[ci]`.

`encryptSubstitution(text, contactKey, contactId)` (fn #14492):
```
if !contactKey: throw "Clé de contact manquante"
if !text.trim(): throw "Texte vide"
subKey         = deriveMessageSubKey(<info>, contactId)      # OV_DEK-style HMAC chain
specialCharset = getDerivedSpecialCharsetForMessage(subKey, contactId, secureIndex)  # per-msg shuffle
out = text.split("").map((ch,i) => generateSubstitution(…, ch, i)).join("")
return "OV" + <indexEnc> + "⟩" + out                        # ⟩ then base36-wrapped on the wire
```
The two Caesar context values (ctxA/ctxB) are the per-message subKey and the
secureIndex/nonce — exact arg wiring still to pin from #14493's call frame.

## Remaining to implement the OV36 codec (offline, ranked)

1. `encryptSubstitution`/`decryptSubstitution` — the char→charset mapping.
2. `getUniversalCharset` (fn #14715, 2484 B) — the full ordered plaintext alphabet.
3. Exact charset seeds: `getDerivedIndexCharset` = deriveCharset(INDEX_CHARSET, seedA, seedB)
   and `getDerivedSpecialCharsetForMessage` = deriveCharset(SPECIAL/universal, …, secureIndex);
   resolve seedA/seedB (contactKey vs contactId vs the 16-byte nonce).
4. `generateSecureIndex(contactId, 11)` — the per-message index/nonce source.
Then implement in `ovcompat.rs`, validate against the triple, expose via FFI.

## Status / next steps

1. Pairing/SAS: **SOLVED** (`OV_PAIRING_CRYPTO.md`), verified live.
2. Message decode: functions + algorithms above are extracted; remaining work is to
   read fn #14793 byte-exact (nonce/tag/ciphertext layout + how the payload bytes map
   to the unicode charset) and the OV36 charset base, then implement + validate.
3. **Validation blocker**: com.raphael.isecure is a release build (not debuggable) so
   the live contactKey can't be dumped. To unit-test the codec offline we need one
   known (contactKey, plaintext, ciphertext) triple — capturable from a debug build
   that logs the contactKey, or by adding a temporary decode-and-log path.
