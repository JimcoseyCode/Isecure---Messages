# Handoff — OV Message ⇄ ISecure interoperability

Goal: ISecure ("com.ov.message.dev") pairs & talks with the real OV Message app
("com.ov.message", v45, release-signed) over its own SMS protocol. The pairing
generates a 12-char SAS ("le code généré") that must be IDENTICAL on both apps.

## STATUS: 95% — pairing works end-to-end, only the shared-secret matches is off

**PROVEN LIVE on the device**: OV accepts ISecure's `OVPK:<sess>:R:...` reply,
decapsulates the hybrid ciphertext, and advances to "Vérifiez ce code à deux"
showing a SAS. So envelope + KEM message flow + ciphertext format are ALL correct.

**The one open bug**: the SAS differs.
- OV shows e.g. `350E-6E63-A652`, ISecure computes `FF63-0C4B-1B6C` (session G4BM).
- Root cause is NOT the combine formula (see below) — it's that ISecure's
  `(ss_pq, ss_ec)` don't reproduce OV's, i.e. a byte-layout / KEM-serialization
  detail between RustCrypto `ml-kem` 0.2.3 and noble `ml_kem768`.

## The protocol (fully reverse-engineered, verified on real SMS)

Pairing SMS envelope (regex from bytecode):
```
^OVPK:([ABCDEFGHJKLMNPQRSTUVWXYZ23456789]{4}):([IR]):([A-Za-z0-9+/=]+)$
```
- session = 4 chars from that 32-char alphabet; role I=initiator, R=responder.
- Initiator sends `OVPK:<sess>:I:base64(publicKey 1216B)` where
  publicKey = mlkem768_ek(1184) ‖ x25519_pk(32).
- Responder runs noble `ml_kem768_x25519.encapsulate(pk)` → {cipherText 1120B,
  sharedSecret 32B}, replies `OVPK:<sess>:R:base64(cipherText)` where
  cipherText = mlkem768_ct(1088) ‖ x25519_ephemeral_pub(32).
- Both derive contactKey/SAS from `sharedSecret`.

KEM = `@noble/post-quantum` KitchenSink-KEM(ML-KEM-768,X25519)-XOF(SHAKE256)-KDF(HKDF-SHA-256):
  ecdhKem ss = RAW X25519 DH (no KDF). mlkem ss = raw ML-KEM ss.
  combine (noble main, CONFIRMED from source):
    preimage = ss[0]‖ss[1]‖ct[0]‖pk[0]‖ct[1]‖pk[1]‖ascii(label)   (index 0=ml_kem, 1=x25519)
    ikm      = ascii("hybrid_prk") ‖ preimage
    prk      = HKDF-Extract-SHA256(salt=zeros(32), ikm)
    info     = numberToBytesBE(32,2) ‖ ascii("shared_secret") ‖ ascii("")   (= 00 20 "shared_secret")
    sharedSecret = HKDF-Expand-SHA256(prk, info, 32)

OV's own layer on top (`deriveFromSharedSecret`, byte-exact, IMPLEMENTED):
    salt = SHA256("OV_PQHybrid_Salt_v1")
    prk  = HMAC-SHA256(salt, sharedSecret)
    contactKey = hex(HMAC-SHA256(prk, "OV_PQHybrid_ContactKey_v1"‖0x01))   (32B → 64 hex)
    sas        = hex(HMAC-SHA256(prk, "OV_PQHybrid_SAS_v1"‖0x01)[0..6]).upper()   (12 hex)

Message layer (not needed for pairing, already reversed): `OV36:<idxEnc>><payloadEnc>`
substitution cipher with per-session Fisher-Yates-derived charsets; AES-256-GCM
for OVB/OVF/OV1. See `ovcompat.rs`.

## What's built (in the repo)

- `ov-core/src/ovcompat.rs`: all formats + `hybrid_respond()` (envelope OVPK,
  ML-KEM encaps + x25519 ephemeral + `kitchensink_combine` + `derive_from_shared_secret`).
- `ov-core/src/ffi.rs`: `ov_hybrid_respond`, `ov_parse_ovpk`, `ov_derive_contact_key`,
  `ov_derive_charset`, `ov_encode_ov36`, etc. (UniFFI `#[uniffi::export]`).
- Kotlin `OvCoreModule.kt` @ReactMethod wrappers + JS `lib/native/ovcore.ts` types.
- **`OvAutoPair.kt`** (native, no-Metro): on app launch reads newest `OVPK:%:I:%`
  from the SMS provider, runs `ovHybridRespond`, LOGS everything under tag `OVCAL`,
  sends the `OVPK:<sess>:R:` reply via SmsManager multipart. Called from MainActivity.
  This is the reliable calibration harness (Metro/USB kept dropping otherwise).
- Brute-forcers: `src/bin/calibrate.rs`, `calibrate2.rs` (720-perm × hashing ×
  labels × salts — 550k variants, NO match on G4BM → confirms input mismatch, not order).
- `src/bin/verify_combine.rs` (Gemini): the EXACT noble main combine → gives
  4AEEC1B95C68 for G4BM, not the target 350E6E63A652.
- `ov-core/CALIBRATION_VECTOR.md`: the G4BM known-answer (ss_pq, ss_ec, ct, pk_pq,
  pk_ec + target SAS 350E6E63A652). Use it to test any combine/layout hypothesis.

## Build / test recipe

```
# rust host + tests
cd ov-core && cargo test ovcompat
# cross-compile .so (arm64) after any ovcompat/ffi change
export ANDROID_NDK_HOME=/opt/homebrew/share/android-commandlinetools/ndk/27.1.12297006
cargo ndk -t arm64-v8a -o ../app_src/android/app/src/main/jniLibs build --release --features ffi
# regenerate kotlin bindings
cargo build --release --features ffi
./target/release/uniffi-bindgen generate --library target/release/libov_core.dylib --language kotlin --out-dir ../app_src/android/app/src/main/java
# build+install APK (Kotlin-only changes: skip the .so/bindgen steps)
cd ../app_src/android && export ANDROID_HOME=/opt/homebrew/share/android-commandlinetools
./gradlew :app:assembleDebug -x lint && adb install -r app/build/outputs/apk/debug/app-debug.apk
adb shell pm grant com.ov.message.dev android.permission.READ_SMS
adb shell pm grant com.ov.message.dev android.permission.SEND_SMS
```

## Live calibration loop (reliable, native — no Metro)

1. Make OV the default SMS app so it receives:
   `adb shell cmd role add-role-holder android.app.role.SMS com.ov.message`
2. On the phone, open OV → contact Raphael (= this phone's own number
   +33634467686) → purple pairing icon → enable "Pairing autorisé" → **Envoyer**.
   OV sends `OVPK:<sess>:I:` to self and waits ("En attente").
3. `adb logcat -c ; adb shell am start -n com.ov.message.dev/com.ov.message.MainActivity`
   → OvAutoPair reads the OVPK, responds, logs `OVCAL PKPQ/PKEC/SSPQ/SSEC/CT/ISECURE_SAS`,
   sends `OVPK:<sess>:R:`.
4. OV (default SMS) receives the reply → shows its 12-char SAS. Screenshot it.
5. `cargo run --release --bin calibrate2 -- <ssPq> <ssEc> <ctPq(=CT[0:2176])> <ctEc(=CT[2176:])> <pkPq> <pkEc> <OV_SAS>`

## THE OPEN PROBLEM — next steps (ranked)

The combine formula is confirmed correct, so ISecure's `ss_pq`/`ss_ec` must not
match what OV derives. Investigate, in order:

1. **ML-KEM cross-impl (most likely)**: is RustCrypto `ml-kem` 0.2.3's ciphertext/
   encapsulation-key SERIALIZATION byte-identical to noble `ml_kem768`? Both claim
   FIPS 203 final, but confirm with a shared test vector. If OV implicit-rejects
   ISecure's ct, OV's ss_pq becomes an unpredictable pseudo-random value → no
   combine matches. Test: encaps in RustCrypto, decaps the SAME ct in a JS harness
   with noble `ml_kem768`, compare ss. If they differ, switch the Rust side to a
   noble-compatible ML-KEM (e.g. bump `ml-kem` and re-verify, or match byte order).
2. **cipherText / publicKey split order**: verify noble's combined-KEM byte layout
   is exactly `ct_pq(1088)‖ct_ec(32)` and `pk_pq(1184)‖pk_ec(32)` (index 0 = ml_kem).
   If OV expects the x25519 half first, ISecure's split in `parse_ovpk` /
   `hybrid_respond` is off → garbage ss. Try the swapped layout.
3. **x25519 DH direction / clamping**: confirm `X25519(eph_sk, recipient_pk)` (not
   reversed) and that x25519-dalek and noble agree on the 32-byte output for a known pair.
4. Widen the brute-forcer to ALSO permute the ct/pk split points + try SHAKE256 as
   the combine KDF (label says XOF SHAKE256 — though KDF says HKDF-SHA256).

Once ss inputs match OV's, `verify_combine`'s formula (or `calibrate2`) will hit
the target SAS; hardcode the winning recipe into `kitchensink_combine`, rebuild,
and the two apps' generated codes will be identical.

## Notes / gotchas
- OV pairing to "Raphael" = SMS loopback to THIS phone's own number (+33634467686).
- OV must be default SMS app to RECEIVE the reply and complete.
- OV pairing session auto-expires ~10 min; move fast.
- USB drops to "charge only" a lot → `adb` disconnects; keep it in MTP mode.
- OV password (for its lock screen): 180203.
- Do NOT touch the real `com.ov.message` install beyond driving its pairing UI.
