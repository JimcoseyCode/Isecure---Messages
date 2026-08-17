# iSecure — Messages

Serverless, end-to-end encrypted **SMS** messenger with a native **Rust** crypto core.
Interoperates with **OV Message** (pairs over SMS and decodes its OV36 messages) and
reimplements its security feature set. No server, no account — everything on-device.

> **Private repo.** Contains OV Message decompile + reverse-engineering artifacts as
> local reference. Do **not** make this repository public.

## Highlights
- **Post-quantum pairing** — hybrid ML-KEM-768 + X25519 over SMS, with a 12-char SAS
  verified out-of-band.
- **OV Message interop** — pairs with OV Message and **decodes its OV36 messages** (validated live).
- **Message crypto** — AES-256-GCM, 500-key HKDF pool with per-message rotation, HMAC integrity.
- **Files** — AES-256-GCM `.ov` containers.
- **At-rest** — Argon2id login gate + **DEK vault** (contact keys sealed AES-GCM), Panic mode,
  auto-destruct (3 wrong tries), Fortress mode, anti-replay, FLAG_SECURE, `allowBackup=false`.
- **Key sharing** — in-person **QR** exchange, QuickShare, paste-to-save, and **auto re-pair**
  (new key sent encrypted under the old one, peer warned of the rotation).

## Architecture
| Layer | Path | Tech |
|-------|------|------|
| Crypto core | `ov-core/` | Rust (uniffi FFI). `src/ov36.rs`, `ovcompat.rs`, `aead.rs`, `kem.rs`, `kdf.rs`, `ffi.rs` |
| Native bridge | `app_src/android/app/src/main/java/com/ov/message/` | Kotlin (`OvCoreModule.kt`, `SmsModule.kt`) + `jniLibs/arm64-v8a/libov_core.so` |
| Frontend | `app_src/app/` | Expo Router (Expo SDK 56, RN 0.85, React 19.2), TypeScript |
| Pairing web | `pairing-platform/` | web demo |

## Build (see `HANDOFF.md` for the full recipe — 3 fixes are mandatory)
```bash
cd app_src && npm install --legacy-peer-deps
npm i -D babel-preset-expo@~56.0.0 --legacy-peer-deps      # else Metro "transformFile undefined"
# gradle wrapper must be 8.14.3 (RN plugin uses removed JvmVendorSpec.IBM_SEMERU on Gradle 9)
export ANDROID_NDK_HOME=$ANDROID_HOME/ndk/27.1.12297006
cd android && ./gradlew assembleRelease -x lintVitalRelease -x lintVitalAnalyzeRelease
# → app/build/outputs/apk/release/app-release.apk  (com.raphael.isecure, self-contained)
```
Rust core rebuild (only when `ov-core/src/**` changes):
```bash
cd ov-core && cargo ndk -t arm64-v8a -o ../app_src/android/app/src/main/jniLibs build --release --features ffi
# then regenerate uniffi Kotlin bindings + add a @ReactMethod in OvCoreModule.kt for each new export
```
Debug (live logs/reload): `npx expo start` + `adb reverse tcp:8081 tcp:8081`, launch `com.raphael.isecure.dev`.

## Status
- ✅ Pairing (OV Message → iSecure) + **OV36 decode** — proven live on device.
- ✅ Security features (Panic, Fortress, DEK vault, auto-destruct, anti-replay, ephemeral).
- ✅ Key sharing (QR / QuickShare / paste / auto re-pair).
- 🚧 **OV36 encode (iSecure → OV)** — the 22-char field is an HMAC integrity tag; recipe
  extracted but not yet reproduced (OV shows `Σ` for our sends). See `HANDOFF.md` §5.
- 🚧 i18n fr/en full extraction, encrypted groups, encrypted images over MMS.

## Notes
- Decompiled OV Message (`apktool_out/`, `jadx_out/`, `hermes-dec/`) is OVLabs' proprietary app,
  kept here as private interop reference only.
- Reverse-engineered algorithms (OV36, pairing, MAC) are documented in `HANDOFF.md`.
