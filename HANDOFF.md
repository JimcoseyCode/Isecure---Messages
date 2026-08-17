# iSecure — HANDOFF (context brain)

> Read this first. Lets any AI/dev continue without re-deriving context.
> iSecure = serverless E2E-encrypted SMS app that **interoperates with OV Message** (ovlabs.fr)
> and reimplements its security feature set on a native Rust crypto core.
> **App builds, runs on-device, pairing + OV36 decode PROVEN live.**

## 1. Repo layout (`~/Desktop/ovmessage_clone`)
- `ov-core/` — **Rust crypto core** (uniffi FFI → Kotlin). Key files:
  - `src/ov36.rs` — OV36 substitution codec. **decode validated live; encode blocked on MAC** (§5).
  - `src/ovcompat.rs` — `ov_encode_contact_key` (slot4 KDF), `ovHybridRespond` pairing, SAS.
  - `src/ffi.rs` — uniffi exports incl. `ov36_decode`/`ov36_encode`, `seal/open_message`,
    `encrypt/decrypt_file`, `derive_from_password` (Argon2id), `derive_key_pool`, pairing fns.
  - `src/aead.rs kem.rs kdf.rs protocol.rs` — AES-GCM, X25519+ML-KEM-768, HKDF pool, SMS framing.
- `app_src/` — **Expo Router frontend** (Expo SDK 56, RN 0.85.3, React 19.2). Native module +
  jniLibs live under `app_src/android/app/src/main/`:
  `java/com/ov/message/OvCoreModule.kt` (@ReactMethod bridge), `SmsModule.kt`
  (sendSms/onSmsReceived/setScreenSecure=FLAG_SECURE/getSimNumbers), `java/uniffi/ov_core/ov_core.kt`
  (AUTO-GEN bindings — don't hand-edit), `jniLibs/arm64-v8a/libov_core.so`.
  - `app/` screens: `_layout.tsx` (DB init, i18n apply+remount, auto-lock, FLAG_SECURE),
    `auth/login.tsx onboarding.tsx setup-phone.tsx`, `modals/pairing.tsx` (pairing UI),
    `tabs/discussions/[id].tsx` (CHAT: send/receive/decrypt), `tabs/discussions/index.tsx` (inbox),
    `tabs/contacts/*`, `tabs/settings/*` (index = big security hub).
  - `lib/native/ovcore.ts` (typed native wrapper), `lib/database/db.ts` (SQLite),
    `lib/vault.ts` (DEK seal/open), `constants/strings.ts` (i18n fr+en), `constants/tabBarStyle.ts`.
- `apktool_out/` `jadx_out/` — decompiled OV Message. Full JS decompile (36MB, hbc-decompiler):
  `/private/tmp/claude-501/.../scratchpad/ov_decomp.js`. Real DB triples: `scratchpad/dev_ov_message.db`.
- Package IDs: release **`com.raphael.isecure`**, debug **`com.raphael.isecure.dev`** (coexist).
  Reference app **`com.ov.message`** stays installed & untouched.

## 2. BUILD (exact recipe — 3 fixes are mandatory)
Env: `ANDROID_NDK_HOME=/opt/homebrew/share/android-commandlinetools/ndk/27.1.12297006`,
`ANDROID_HOME=/opt/homebrew/share/android-commandlinetools`, `JAVA_HOME=$(/usr/libexec/java_home)`.
1. Gradle wrapper **8.14.3**, NOT 9.x (RN plugin references removed `JvmVendorSpec.IBM_SEMERU`) —
   set in `app_src/android/gradle/wrapper/gradle-wrapper.properties`.
2. `cd app_src && npm i -D babel-preset-expo@~56.0.0 --legacy-peer-deps` (missing → Metro error
   "Cannot read properties of undefined (reading 'transformFile')"). `babel.config.js`+`metro.config.js` exist.
3. Skip lint (OOMs on release): `-x lintVitalRelease -x lintVitalAnalyzeRelease`.
- **Do NOT** `rm -rf node_modules && npm install` — re-resolves caret ranges, breaks toolchain.
- Fast JS sanity (~15s, catches TS/import errors before a 10-min gradle build):
  `cd app_src && npx expo export:embed --platform android --dev false --bundle-output /tmp/b.js --assets-dest /tmp/a`
- Release (~10min, cached ~40s): `cd app_src/android && ./gradlew assembleRelease -x lintVitalRelease -x lintVitalAnalyzeRelease`
  → `app/build/outputs/apk/release/app-release.apk` (138M, self-contained, debug-signed). Copy to repo root `iSecure-final.apk`.
- Rust core rebuild (only when `ov-core/src/**` changes): `cargo ndk -t arm64-v8a -o ../app_src/android/app/src/main/jniLibs build --release --features ffi`,
  then regenerate bindings and **add a matching `@ReactMethod` in OvCoreModule.kt for every new `#[uniffi::export]`**.
- Debug live (logs+reload): `npx expo start` + `adb reverse tcp:8081 tcp:8081`, launch `com.raphael.isecure.dev`.
  Debug variant needs Metro running. Grant perms after install: `for p in READ_SMS SEND_SMS RECEIVE_SMS READ_CONTACTS POST_NOTIFICATIONS; do adb shell pm grant <pkg> android.permission.$p; done`.

## 3. WORKS (validated live on device)
- **Pairing** OV Message → iSecure: OV sends `OVPK:<sess>:I:...`; iSecure (armed, ov_compat on)
  `ovHybridRespond` derives shared secret + slot4 `contactKey` + SAS, replies `OVPK:R`. SAS matched pixel-exact.
- **OV36 decode**: iSecure decodes OV's messages ("bonjour", "salut ov"). Codec byte-exact (`src/ov36.rs`).
- Contact key stored (slot4 form) → auto-decode in chat.

## 4. DONE recently (in the shipped APK)
- Security logic that was stubbed: auto-destruction after 3 wrong passwords (`login.tsx`);
  Fortress silences non-encrypted inbound, replay saturation alerts 1500/1800/1999, ephemeral
  hard-delete (`discussions/[id].tsx`).
- **DEK vault** (`lib/vault.ts`+`db.ts`): contact `key_hex`/`key_pool` sealed AES-GCM under the
  Argon2id DEK at rest, decrypted in-memory on read. Retrocompat (no password → plaintext).
- Language list restricted to fr+en (only ones with dictionaries).
- Already implemented (verified, don't rebuild): Argon2id login gate + Panic mode, anti-replay
  (dedup_history rotate 2000), FLAG_SECURE, `allowBackup=false`, forced-encryption, auto-lock,
  ephemeral, files AES-GCM, key pool. UI already polished (aurora login, glass settings, floating dock).

## 5. BLOCKED / TODO (priority order the user wants)
1. **Key-management UX** (next up): "modifier contact" → regenerate key → share via **QR /
   QuickShare / auto re-pair with peer notification ("key changed, may be compromised")** →
   receive: **paste + save** in a clean UI. `react-native-qrcode-svg` dep present, not wired.
2. **i18n fr/en complete**: mechanism works (`applyLanguage` mutates `S`, root remounts via
   `key={langKey}` in `_layout.tsx`), but only ~9/25 screens use `S.`; rest is hardcoded French
   (e.g. `settings/index.tsx` = 0 `S.`). Extract hardcoded strings → `constants/strings.ts` (fr+en).
3. **OV36 ENCODE (iSecure→OV)** — the 22-char field in `OV36:idx>FIELD:payload` is an **HMAC
   integrity tag**, not a nonce → wrong tag makes OV render `Σ`. Recipe extracted (memory
   `ov36-mac-encode`): `tag=computeTag16(contactId, secureIndex, payload, deriveMacKey(contactKey,contactId))`,
   `contactId=generateChatId=sort([normPhoneA,normPhoneB]).join('_')`. Exhaustive brute vs a
   fully-known DB triple did NOT reproduce it → one input string still wrong (likely exact chatId
   form). Decode unaffected. **Do not attack OV Message itself — interop only, no offensive work.**
4. **Encrypted GROUP chats** (Telegram-style) — not started; needs group-key protocol. Big.
5. **Encrypted images over MMS** + "MMS may be billed on some carriers" notice — not started;
   `encrypt/decrypt_file` exist, MMS transport does not. Big (native MMS).

## 6. Gotchas (still valid, cost hours)
- `adb reverse tcp:8081` **drops on every reconnect** — re-run it; red "Unable to load script" = reverse died.
- `adb screencap` returns **BLACK when FLAG_SECURE active** (anti-screenshot working). `_layout.tsx`
  clears it on startup unless the setting is on.
- All screens must use `SafeAreaView` from `react-native-safe-area-context` (RN's has no Android top inset).
- Floating tab bar: RN Nav ignores `left/right` on `tabBarStyle`; the visible pill is the
  `tabBarBackground` GlassView inset by `TAB_BAR_INSET`. Chat hides it, restores `FLOATING_TAB_BAR_STYLE`.
- Debug app is `run-as`-able → read its SQLite: `adb exec-out run-as com.raphael.isecure.dev cat files/SQLite/ov_message.db`.
  Release is NOT debuggable and strips `console.log` — use the `.dev` build + logcat `ReactNativeJS` to debug JS.
- iSecure can't be default SMS app (manifest lacks `SMS_DELIVER` receiver) — not needed; it
  receives via `RECEIVE_SMS` broadcast + sends via SmsManager.

## 7. Memory (`~/.claude/projects/-Users-raphael-raphix-Desktop-msafara-app/memory/`)
`ov36-codec`, `ov36-mac-encode`, `ov-pairing-crypto`, `isecure-build-recipe`, `isecure-project`.
Device: Samsung SM-S928B (S24 Ultra, arm64), USB adb. Own number setting `my_phone`.
