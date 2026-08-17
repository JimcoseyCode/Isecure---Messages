# OV Message pairing crypto — exact formulas (interop with iSecure)

Reverse-engineered **byte-exact** from the OV Message Hermes bytecode
(`hbc-disassembler` on `apktool_out/assets/index.android.bundle`, HBC v96),
functions `deriveFromSharedSecret` (#18887) and the `ml_kem768_x25519.decapsulate`
call site. **Verified live**: session MVLV → OV displayed SAS `46EC-6B3D-A890`,
and iSecure now computes the identical `46EC6B3DA890`.

## 1. Hybrid KEM combine — noble `ml_kem768_x25519` (NOT KitchenSink)

OV calls noble `@noble/post-quantum` preset **`ml_kem768_x25519`**, whose combiner
is a single SHA3-256 over only the two shared secrets + the **X25519** ct/pk +
a hard-coded label. It does **not** hash the ML-KEM ct/pk, and it is **not** the
HKDF-based KitchenSink preset.

```
label  = "\.//^\"                       # bytes: 5c 2e 2f 2f 5e 5c
shared = SHA3-256( ss_pq ‖ ss_ec ‖ ct_ec ‖ pk_ec ‖ label )
```

- `ss_pq`  = ML-KEM-768 shared secret (encaps/decaps)
- `ss_ec`  = raw X25519 Diffie-Hellman output (no KDF)
- `ct_ec`  = X25519 ephemeral public key (the "ciphertext" of the EC half)
- `pk_ec`  = X25519 public key of the party encapsulated against

## 2. deriveFromSharedSecret (Hermes fn #18887)

```
salt       = SHA256( "OV_PQHybrid_Salt_v1" ‖ sharedSecret )   # sharedSecret folded in
prk        = HMAC-SHA256( salt, sharedSecret )
contactKey = HMAC-SHA256( prk, "OV_PQHybrid_ContactKey_v1" ‖ 0x01 )          → hex (64 chars)
sas        = HMAC-SHA256( prk, "OV_PQHybrid_SAS_v1"        ‖ 0x01 )[0..6]    → hex → UPPER (12 chars)
```

The SAS is shown grouped `XXXX-XXXX-XXXX` (display only; the value is the 12 hex chars).

## Pairing envelope

```
^OVPK:([ABCDEFGHJKLMNPQRSTUVWXYZ23456789]{4}):([IR]):([A-Za-z0-9+/=]+)$
```
- Initiator `OVPK:<sess>:I:base64(publicKey)` — publicKey = `mlkem768_ek(1184) ‖ x25519_pk(32)` = 1216 B.
- Responder `OVPK:<sess>:R:base64(cipherText)` — cipherText = `mlkem768_ct(1088) ‖ x25519_ephemeral_pub(32)` = 1120 B.

## What was wrong before (the whole bug)

The deployed iSecure code used:
- the **KitchenSink** HKDF combine (`hybrid_prk ‖ … ‖ HKDF-SHA256`) instead of the SHA3 `ml_kem768_x25519` combiner, and
- `salt = SHA256("OV_PQHybrid_Salt_v1")` alone instead of `SHA256(label ‖ sharedSecret)`.

Both were RE guesses. Fixed in `ov-core/src/ovcompat.rs` (`kitchensink_combine`,
`derive_from_shared_secret`); locked by test `mvlv_known_answer_matches_real_ov_sas`.

## Verified primitives (byte-compatible)

- RustCrypto `ml-kem` 0.2.3 encaps/decaps == noble `ml_kem768` (0.6.1 and 0.7.0)
- `x25519-dalek` DH == noble `@noble/curves` x25519
- iSecure encaps + combine == `noble ml_kem768_x25519.decapsulate` (end-to-end)
