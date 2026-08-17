//! OV Message wire-format interoperability layer.
//!
//! Reconstructed by reverse-engineering the target app's Hermes bytecode
//! (`substitutionEngine` module). This lets ISecure emit/parse messages that
//! the original OV Message app accepts, over a key established by pairing.
//!
//! ## Confirmed wire format (byte-exact from `encodeOvMessageToBase36` /
//! `decodeBase36ToOvMessage`)
//!
//! ```text
//!   OV36:<indexEnc>><payloadEnc>
//! ```
//! * literal prefix `OV36:`
//! * `>` separates the encoded key index from the encoded payload
//! * `indexEnc`   = substitute( base36(keyIndex) , INDEX_CHARSET )
//! * `payloadEnc` = substitute( base36(ciphertext bytes) , PAYLOAD_CHARSET )
//!
//! ## Base36 (from `numberToBase36_2` / `numberToBase36_3`)
//! Standard alphabet `0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ`, big-endian,
//! fixed-width groups: 2 chars for values 0..=1295 (36²), 3 chars for 0..=46655 (36³).
//!
//! ## Substitution (from `getIndexCharsetLookup` / `getSpecialCharSetLookup`)
//! A monoalphabetic remap of the 36 base36 symbols onto a permuted 36-char
//! `charset`: standard symbol of value `v` (0..35) is emitted as `charset[v]`.
//!
//! ## STILL TO REVERSE (marked `ponytail: TODO-charset`)
//! The permutation is **derived per session** (`getDerivedCharsets`,
//! `bitReversalPermutation`, `EXTENDED_CHARSET`) — not a constant. Until that
//! derivation is reversed, callers must supply the 36-char charset. Payload
//! byte-grouping (`encodePayloadToBase36`) is also pending. Everything below is
//! the confirmed, tested substrate those two pieces plug into.

use crate::error::{CoreError, Result};

// Message cipher for OV36 is NOT AES — it is a keyed polyalphabetic SUBSTITUTION
// (`generateSubstitution`/`getReverseSubstitution`): each (char, position) maps to
//   special_charset[ (hash(char‖context) + position) mod special_charset.len() ]
// with '∑' (U+2211) as the error sentinel. The special_charset is the per-message
// derived permutation (see `derive_charset`). AES-256-GCM is used for OVB/OVF/OV1.
// ponytail: TODO-substitution — exact hash(char‖context) input pending one more trace.

pub const OV36_PREFIX: &str = "OV36:";
pub const OV36_SEP: char = '>';
const B36: &[u8; 36] = b"0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";

/// Encode a value into fixed-width standard base36, big-endian (most significant
/// digit first), matching `numberToBase36_2` (width 2) / `_3` (width 3).
pub fn to_base36(mut value: u32, width: usize) -> String {
    let mut buf = vec![b'0'; width];
    for i in (0..width).rev() {
        buf[i] = B36[(value % 36) as usize];
        value /= 36;
    }
    // MSB first is already produced by filling from the low end downward.
    String::from_utf8(buf).unwrap()
}

/// Inverse of [`to_base36`]. Case-insensitive, like `base36ToNumber_2`.
pub fn from_base36(s: &str) -> Result<u32> {
    let mut acc: u32 = 0;
    for c in s.chars() {
        let up = c.to_ascii_uppercase() as u8;
        let d = B36.iter().position(|&b| b == up)
            .ok_or_else(|| CoreError::Malformed("non-base36 digit".into()))? as u32;
        acc = acc.checked_mul(36).and_then(|a| a.checked_add(d))
            .ok_or_else(|| CoreError::Malformed("base36 overflow".into()))?;
    }
    Ok(acc)
}

/// A permuted base36 alphabet: `charset[v]` is the symbol emitted for the
/// standard base36 value `v` (0..35). ponytail: TODO-charset — this is the
/// per-session derivation output; supply it until `getDerivedCharsets` is ported.
#[derive(Clone)]
pub struct Charset {
    fwd: [char; 36],           // value -> permuted symbol
    rev: std::collections::HashMap<char, u8>, // permuted symbol -> value
}

impl Charset {
    /// Build from a 36-char permutation string (each base36 symbol exactly once).
    pub fn new(chars: &str) -> Result<Self> {
        let v: Vec<char> = chars.chars().collect();
        if v.len() != 36 {
            return Err(CoreError::Malformed("charset must be 36 chars".into()));
        }
        let mut fwd = ['0'; 36];
        let mut rev = std::collections::HashMap::with_capacity(36);
        for (i, &c) in v.iter().enumerate() {
            fwd[i] = c;
            if rev.insert(c, i as u8).is_some() {
                return Err(CoreError::Malformed("charset has duplicate symbol".into()));
            }
        }
        Ok(Self { fwd, rev })
    }

    /// The identity charset = plain standard base36 (no substitution). Useful for
    /// testing the frame/base36 layers independently of the derived permutation.
    pub fn identity() -> Self {
        Self::new(std::str::from_utf8(B36).unwrap()).unwrap()
    }

    /// Remap a standard base36 string onto this charset (encode direction).
    pub fn apply(&self, base36: &str) -> Result<String> {
        base36.chars().map(|c| {
            let v = B36.iter().position(|&b| b == c.to_ascii_uppercase() as u8)
                .ok_or_else(|| CoreError::Malformed("non-base36 symbol".into()))?;
            Ok(self.fwd[v])
        }).collect()
    }

    /// Inverse remap back to standard base36 (decode direction).
    pub fn invert(&self, encoded: &str) -> Result<String> {
        encoded.chars().map(|c| {
            let v = *self.rev.get(&c)
                .ok_or_else(|| CoreError::Malformed("symbol not in charset".into()))? as usize;
            Ok(B36[v] as char)
        }).collect()
    }
}

/// Encode a payload string the way `encodePayloadToBase36` does: every character
/// becomes exactly **3** standard-base36 digits — the character's index in the
/// per-message special charset if present, otherwise its Unicode code point.
pub fn encode_payload(payload: &str, special_charset: &[char]) -> String {
    let mut out = String::with_capacity(payload.chars().count() * 3);
    for ch in payload.chars() {
        let n = special_charset.iter().position(|&c| c == ch)
            .map(|i| i as u32)
            .unwrap_or(ch as u32);
        out.push_str(&to_base36(n, 3));
    }
    out
}

/// Inverse of [`encode_payload`], matching `decodeBase36ToPayload`: read 3-digit
/// groups, map back through the charset (or code point) to characters.
pub fn decode_payload(encoded: &str, special_charset: &[char]) -> Result<String> {
    let chars: Vec<char> = encoded.chars().collect();
    if chars.len() % 3 != 0 {
        return Err(CoreError::Malformed("payload length not a multiple of 3".into()));
    }
    let mut out = String::with_capacity(chars.len() / 3);
    for group in chars.chunks(3) {
        let n = from_base36(&group.iter().collect::<String>())?;
        let ch = if (n as usize) < special_charset.len() {
            special_charset[n as usize]
        } else {
            char::from_u32(n).ok_or_else(|| CoreError::Malformed("bad code point".into()))?
        };
        out.push(ch);
    }
    Ok(out)
}

/// The seed the target hashes to derive a charset: `SHA3-256(seed_a "|" seed_b)`
/// as lowercase hex (`deriveCharset`, domain-separated with `|`). The permutation
/// that turns this seed + a base alphabet into the final charset is the last
/// piece still being reversed (`getDerivedSpecialCharset` / permute helper).
/// ponytail: TODO-charset — seed is confirmed; permute step pending.
pub fn charset_seed_hex(seed_a: &str, seed_b: &str) -> String {
    use sha3::{Digest, Sha3_256};
    let mut h = Sha3_256::new();
    h.update(seed_a.as_bytes());
    h.update(b"|");
    h.update(seed_b.as_bytes());
    h.finalize().iter().map(|b| format!("{b:02x}")).collect()
}

/// Domain-separation tags the target feeds as `seed_b` to `deriveCharset`.
pub const TAG_INDEX_CHARSET: &str = "OV_INDEX_CHARSET_V1";
pub const TAG_SPECIAL_CHARSET: &str = "OV_SPECIAL_CHARSET_V1";

/// Hash-chain PRNG, byte-exact port of the target's `createSeededPRNG`/`nextInt`.
/// State is the running hex digest plus a call counter; each draw rehashes
/// `sha256(state_hex ‖ decimal_counter)` and takes the first 32 bits, with
/// rejection sampling for a uniform result in `[0, max]`.
pub struct SeededPrng {
    state_hex: String,
    counter: u64,
}

impl SeededPrng {
    pub fn new(seed_hex: &str) -> Self {
        Self { state_hex: seed_hex.to_string(), counter: 0 }
    }

    pub fn next_int(&mut self, max: u32) -> u32 {
        use sha2::{Digest, Sha256};
        let range = max as u64 + 1;
        let limit = (0x1_0000_0000u64 / range) * range; // floor(2^32 / range) * range
        loop {
            let mut h = Sha256::new();
            h.update(self.state_hex.as_bytes());
            h.update(self.counter.to_string().as_bytes());
            let digest = h.finalize();
            // state becomes the new lowercase-hex digest; counter advances
            self.state_hex = digest.iter().map(|b| format!("{b:02x}")).collect();
            self.counter += 1;
            // parseInt(hex.substring(0,8), 16) == first 4 bytes, big-endian
            let v = u32::from_be_bytes([digest[0], digest[1], digest[2], digest[3]]) as u64;
            if v < limit {
                return (v % range) as u32;
            }
        }
    }
}

/// Fisher–Yates shuffle driven by [`SeededPrng`] — port of `deterministicShuffle`.
/// `i` runs from `len-1` down to `1`, swapping with `j = nextInt(i) ∈ [0, i]`.
pub fn deterministic_shuffle<T: Clone>(items: &[T], seed_hex: &str) -> Vec<T> {
    let mut a = items.to_vec();
    if a.len() < 2 {
        return a;
    }
    let mut prng = SeededPrng::new(seed_hex);
    let mut i = a.len() - 1;
    while i > 0 {
        let j = prng.next_int(i as u32) as usize;
        a.swap(i, j);
        i -= 1;
    }
    a
}

/// Derive a charset the way the target does: permute `base` by a Fisher–Yates
/// shuffle seeded with `SHA3-256(seed_a ‖ "|" ‖ seed_b)`. `seed_a` is the session
/// key material; `seed_b` is a domain tag ([`TAG_INDEX_CHARSET`] / [`TAG_SPECIAL_CHARSET`]).
pub fn derive_charset(base: &[char], seed_a: &str, seed_b: &str) -> Vec<char> {
    let seed = charset_seed_hex(seed_a, seed_b);
    deterministic_shuffle(base, &seed)
}

/// Assemble the final OV36 SMS frame from already-encoded index and payload.
pub fn frame(index_enc: &str, payload_enc: &str) -> String {
    format!("{OV36_PREFIX}{index_enc}{OV36_SEP}{payload_enc}")
}

// ---- Full pairing key schedule (reverse-engineered, real-oracle verified) ----
//
// OV Message's pairing is the `@noble/post-quantum` hybrid KEM
//   KitchenSink-KEM(ML-KEM-768, X25519)-XOF(SHAKE256)-KDF(HKDF-SHA-256)
// followed by an app-specific HKDF. Two layers:
//
// LAYER 1 — noble KitchenSink combine -> `sharedSecret` (32 bytes):
//   ahash(x)   = SHAKE256(x) truncated to 32 bytes   (per-share pre-hash)
//   ikm        = concatBytes(<hashed shares & cts & pks…>, ascii("hybrid_prk"))
//   prk        = HKDF-Extract(salt, ikm)             (SHA-256)
//   info       = numberToBytesBE(32, 2) ‖ ascii("shared_secret")  (== 00 20 "shared_secret")
//   sharedSecret = HKDF-Expand(prk, info, 32)
//
// LAYER 2 — OV's `deriveFromSharedSecret` -> per-contact key (implemented below).
//
// The KEM primitives are ML-KEM-768 (encaps key 1184 / ct 1088 / ss 32) and
// X25519 (pk 32 / ss 32); ISecure already links `ml-kem` 0.2 + `x25519-dalek`.
pub const NOBLE_PRK_LABEL: &str = "hybrid_prk";
pub const NOBLE_SS_LABEL: &str = "shared_secret";

// ---- Pairing key derivation (byte-exact from `deriveFromSharedSecret`) -------
// Hybrid X25519+ML-KEM-768 shared secret -> per-contact key + SAS, via HKDF-SHA256:
//   salt       = SHA256("OV_PQHybrid_Salt_v1")
//   prk        = HMAC-SHA256(salt, sharedSecret)                       (HKDF-Extract)
//   contactKey = HMAC-SHA256(prk, "OV_PQHybrid_ContactKey_v1" ‖ 0x01)  (32 bytes, hex)
//   sas        = HEX( HMAC-SHA256(prk, "OV_PQHybrid_SAS_v1" ‖ 0x01)[0..6] ).upper()

pub const SALT_LABEL: &str = "OV_PQHybrid_Salt_v1";
pub const CONTACTKEY_LABEL: &str = "OV_PQHybrid_ContactKey_v1";
pub const SAS_LABEL: &str = "OV_PQHybrid_SAS_v1";

fn hmac_sha256(key: &[u8], data: &[u8]) -> [u8; 32] {
    use hmac::{Hmac, Mac};
    use sha2::Sha256;
    let mut m = <Hmac<Sha256>>::new_from_slice(key).expect("hmac takes any key len");
    m.update(data);
    m.finalize().into_bytes().into()
}

/// Derive `(contact_key_hex, sas)` from the hybrid shared secret, exactly as
/// OV Message's `deriveFromSharedSecret`. `contact_key_hex` is the 64-char hex
/// string used downstream as the charset-derivation seed and AES key material.
pub fn derive_from_shared_secret(shared_secret: &[u8]) -> (String, String) {
    use sha2::{Digest, Sha256};
    // OV (Hermes fn #18887): salt = SHA256("OV_PQHybrid_Salt_v1" ‖ sharedSecret),
    // then prk = HMAC-SHA256(salt, sharedSecret). The sharedSecret is folded into
    // the salt hash — not SHA256(label) alone.
    let mut salt_input = SALT_LABEL.as_bytes().to_vec();
    salt_input.extend_from_slice(shared_secret);
    let salt = Sha256::digest(&salt_input);
    let prk = hmac_sha256(&salt, shared_secret);

    let mut ck_info = CONTACTKEY_LABEL.as_bytes().to_vec();
    ck_info.push(0x01);
    let contact_key_digest = hmac_sha256(&prk, &ck_info);
    // OV does NOT use the hex digest — it runs it through a KDF (`slot4`, Hermes
    // fn #18882) that HMAC-expands the digest and re-encodes it over EXTENDED_CHARSET
    // into a 64–150 char string. THAT string is the contactKey used by the message
    // layer. Interop with OV requires this exact transform.
    let contact_key = ov_encode_contact_key(&contact_key_digest);

    let mut sas_info = SAS_LABEL.as_bytes().to_vec();
    sas_info.push(0x01);
    let sas_raw = hmac_sha256(&prk, &sas_info);
    let sas: String = sas_raw[..6].iter().map(|b| format!("{b:02X}")).collect();

    (contact_key, sas)
}

/// OV's `slot4` contactKey KDF (Hermes fn #18882), byte-exact from the decompile.
/// `digest` = `HMAC(prk, "OV_PQHybrid_ContactKey_v1"‖0x01)` (32 bytes). Returns the
/// EXTENDED_CHARSET-encoded string OV stores and uses as the message-layer contactKey.
pub fn ov_encode_contact_key(digest: &[u8]) -> String {
    const EXTENDED_CHARSET: &str = include_str!("extended_charset.txt");
    let ext: Vec<char> = EXTENDED_CHARSET.chars().collect();
    // length = 64 + (firstByte<174 mod 87); default 100 if no such byte
    let len = digest.iter().copied().find(|&b| b < 174)
        .map(|b| 64 + (b as usize % 87)).unwrap_or(100);
    // buf = HMAC(key=digest, msg=[counter]) for counter=1,2,… until len*2 bytes
    let mut buf: Vec<u8> = Vec::with_capacity(len * 2 + 32);
    let mut counter: u8 = 1;
    while buf.len() < len * 2 {
        buf.extend_from_slice(&hmac_sha256(digest, &[counter]));
        counter += 1;
    }
    // each 16-bit BE pair → EXTENDED_CHARSET[c mod len(charset)]
    (0..len).map(|i| {
        let c = ((buf[2 * i] as usize) << 8) | buf[2 * i + 1] as usize;
        ext[c % ext.len()]
    }).collect()
}

// ---- Noble ml_kem768_x25519 hybrid combine (the preset OV actually uses) --------
// Confirmed from the Hermes bytecode: OV calls `ml_kem768_x25519.decapsulate(...)`,
// NOT the KitchenSink preset. That combiner (noble 0.6.1 hybrid.js line 571) is:
//   sharedSecret = SHA3-256( ss[0] ‖ ss[1] ‖ ct[1] ‖ pk[1] ‖ ascii("\.//^\") )
// where index 0 = ML-KEM, 1 = X25519. Only the X25519 ct/pk are hashed (not the PQ
// ct/pk), the two component shared secrets, and the hard-coded label `\.//^\`.
//   ss[0] = ss_pq, ss[1] = ss_ec, ct[1] = x25519 ephemeral pub (ct_ec),
//   pk[1] = x25519 public key of the party encapsulated against (pk_ec).
pub const HYBRID_LABEL: &[u8] = &[0x5c, 0x2e, 0x2f, 0x2f, 0x5e, 0x5c]; // \.//^\

/// Combine the ML-KEM and X25519 shared secrets exactly like noble
/// `ml_kem768_x25519` (SHA3-256 combiner). `pk_ec` is the X25519 public key of the
/// party that was encapsulated against; `ct_ec` is the X25519 ephemeral public key.
pub fn kitchensink_combine(ss_pq: &[u8], ss_ec: &[u8], ct_ec: &[u8], pk_ec: &[u8]) -> [u8; 32] {
    use sha3::{Digest, Sha3_256};
    let mut h = Sha3_256::new();
    h.update(ss_pq);
    h.update(ss_ec);
    h.update(ct_ec);
    h.update(pk_ec);
    h.update(HYBRID_LABEL);
    h.finalize().into()
}

// ---- REAL OV SMS pairing (verified envelope + noble ml_kem768_x25519) --------
// Envelope regex (byte-exact from the pairing module):
//   ^OVPK:([ABCDEFGHJKLMNPQRSTUVWXYZ23456789]{4}):([IR]):([A-Za-z0-9+/=]+)$
// Flow: initiator sends OVPK:<sess>:I:base64(hybridPk 1216). Responder calls
// noble `ml_kem768_x25519.encapsulate(pk)` -> {cipherText 1120, sharedSecret 32}
// and replies OVPK:<sess>:R:base64(cipherText). Both derive the contact key via
// `deriveFromSharedSecret`. cipherText = mlkem_ct(1088) ‖ x25519_ephemeral_pub(32).

pub const OVPK_SESSION_ALPHABET: &str = "ABCDEFGHJKLMNPQRSTUVWXYZ23456789";

pub struct OvPairingSms {
    pub session: String,
    pub role: String,     // "I" or "R"
    pub payload: Vec<u8>, // base64-decoded
}

/// Parse `OVPK:<sess>:<role>:<base64>` (the real SMS pairing envelope).
pub fn parse_pairing_sms(sms: &str) -> Result<OvPairingSms> {
    let body = sms.strip_prefix("OVPK:")
        .ok_or_else(|| CoreError::Malformed("not an OVPK pairing sms".into()))?;
    let mut it = body.splitn(3, ':');
    let session = it.next().ok_or_else(|| CoreError::Malformed("no session".into()))?.to_string();
    let role = it.next().ok_or_else(|| CoreError::Malformed("no role".into()))?.to_string();
    let payload_b64 = it.next().ok_or_else(|| CoreError::Malformed("no payload".into()))?;
    Ok(OvPairingSms { session, role, payload: b64_decode(payload_b64)? })
}

pub struct HybridRespondOut {
    pub reply_sms: String,
    pub contact_key_hex: String,
    pub sas: String,
    pub ss_ec_hex: String,
    pub ss_pq_hex: String,
    pub cipher_text_hex: String,
}

/// Responder side of the real OV pairing: consume an `OVPK:<sess>:I:...`, run the
/// noble ml_kem768_x25519 encapsulation, and produce the `OVPK:<sess>:R:...` reply
/// plus the derived contact key + SAS.
pub fn hybrid_respond(ovpk_sms: &str) -> Result<HybridRespondOut> {
    use ml_kem::{EncodedSizeUser, KemCore, MlKem768, kem::Encapsulate};
    use x25519_dalek::{PublicKey, StaticSecret};
    use rand_core::OsRng;

    let msg = parse_pairing_sms(ovpk_sms)?;
    if msg.role != "I" {
        return Err(CoreError::Malformed("expected initiator role I".into()));
    }
    if msg.payload.len() != PAIRING_BUNDLE_LEN {
        return Err(CoreError::Malformed("initiator pk not 1216 bytes".into()));
    }
    let (mlkem_ek_bytes, x_pk_bytes) = msg.payload.split_at(MLKEM768_PK_LEN);

    // ML-KEM-768 encapsulate
    type Ek = <MlKem768 as KemCore>::EncapsulationKey;
    let arr = ml_kem::Encoded::<Ek>::try_from(mlkem_ek_bytes)
        .map_err(|_| CoreError::Malformed("mlkem ek".into()))?;
    let ek = Ek::from_bytes(&arr);
    let (ct_pq, ss_pq) = ek.encapsulate(&mut OsRng).map_err(|_| CoreError::Malformed("encaps".into()))?;

    // X25519 ephemeral (the hybrid "ciphertext" for the EC half is the ephemeral pub)
    let eph = StaticSecret::random_from_rng(OsRng);
    let eph_pub = PublicKey::from(&eph);
    let mut xp = [0u8; 32];
    xp.copy_from_slice(x_pk_bytes);
    let ss_ec = eph.diffie_hellman(&PublicKey::from(xp)).to_bytes();

    // cipherText = mlkem_ct ‖ x25519_ephemeral_pub
    let mut cipher_text = ct_pq.as_slice().to_vec();
    cipher_text.extend_from_slice(eph_pub.as_bytes());

    // ml_kem768_x25519 combiner: only the x25519 ct (eph pub) + x25519 pub (OV's) are hashed
    let shared = kitchensink_combine(ss_pq.as_slice(), &ss_ec, eph_pub.as_bytes(), x_pk_bytes);
    let (contact_key_hex, sas) = derive_from_shared_secret(&shared);

    let reply_sms = format!("OVPK:{}:R:{}", msg.session, b64_encode(&cipher_text));
    let ss_ec_hex = ss_ec.iter().map(|b| format!("{b:02x}")).collect();
    let ss_pq_hex = ss_pq.as_slice().iter().map(|b| format!("{b:02x}")).collect();
    let cipher_text_hex = cipher_text.iter().map(|b| format!("{b:02x}")).collect();
    Ok(HybridRespondOut { reply_sms, contact_key_hex, sas, ss_ec_hex, ss_pq_hex, cipher_text_hex })
}

// ---- Correct OV handshake (verified message sizes): pks first, ct in OVB:B ---
// OVPK:I  = initiator pks (x25519 32 + mlkem 1184)
// OVB:A   = a party's pks (x25519 32 . mlkem_pk 1184)
// OVB:B   = a party's ciphertext (x25519 32 . mlkem_ct 1088)
// Responder flow: receive OVPK -> send OVB:A (own pks) -> receive OVB:B (ct) ->
// decapsulate + X25519 DH + noble combine + OV HKDF.

/// Parse an `OVB:B:` ciphertext message into (peer x25519 pub, mlkem ct).
pub fn parse_ovb_b(msg: &str) -> Result<(Vec<u8>, Vec<u8>)> {
    let body = msg.strip_prefix(OVB_PREFIX)
        .ok_or_else(|| CoreError::Malformed("not an OVB message".into()))?;
    let (_role, rest) = body.split_once(':').ok_or_else(|| CoreError::Malformed("no role".into()))?;
    let (p1, p2) = rest.split_once('.').ok_or_else(|| CoreError::Malformed("no '.'".into()))?;
    Ok((b64_decode(p1)?, b64_decode(p2)?))
}

pub struct PairingAnnounce {
    pub ovb_a: String,      // OVB:A to send back (ISecure's pks)
    pub state_hex: String,  // opaque state to pass to pairing_finish
}

/// Step 1 (responder): consume OV's `OVPK:`, generate ISecure's hybrid keypair,
/// return the `OVB:A` pk-announce to send + serialized state for step 2.
pub fn pairing_announce(ovpk_msg: &str) -> Result<PairingAnnounce> {
    let ov = parse_ovpk(ovpk_msg)?;
    let kp = crate::kem::HybridKeyPair::generate();
    let ovb_a = build_ovb_handshake("A", &kp.x25519_public_bytes(), &kp.mlkem_public_bytes())?;
    let mut state = kp.to_bytes();
    state.extend_from_slice(&ov.x25519_pk); // remember OV's x25519 pub for the DH
    Ok(PairingAnnounce { ovb_a, state_hex: hex::encode(state) })
}

/// Step 2 (responder): consume OV's `OVB:B:` (its ciphertext), decapsulate with
/// ISecure's ML-KEM secret, X25519-DH, noble combine + OV HKDF -> contact key + SAS.
pub fn pairing_finish(state_hex: &str, ovb_b_msg: &str) -> Result<(String, String)> {
    let state = hex::decode(state_hex).map_err(|e| CoreError::Malformed(e.to_string()))?;
    if state.len() < 32 {
        return Err(CoreError::Malformed("state too short".into()));
    }
    let (kp_bytes, ov_x) = state.split_at(state.len() - 32);
    let kp = crate::kem::HybridKeyPair::from_bytes(kp_bytes)?;
    let (peer_x, ct) = parse_ovb_b(ovb_b_msg)?;
    let ss_pq = kp.mlkem_decapsulate(&ct)?;
    // DH with OV's x25519 (prefer the one accompanying the ciphertext, fall back to OVPK's)
    let ss_ec = kp.x25519_dh(&peer_x).or_else(|_| kp.x25519_dh(ov_x))?;
    // Decapsulator side: ct_ec = OV's ephemeral x25519 pub; pk_ec = ISecure's OWN x25519 pub.
    let shared = kitchensink_combine(&ss_pq, &ss_ec, &peer_x, &kp.x25519_public_bytes());
    Ok(derive_from_shared_secret(&shared))
}

/// Full pairing responder: given OV's announced ML-KEM encaps key + X25519 pub,
/// produce the shared secret, contact key, SAS, and the ML-KEM ciphertext to send
/// back. Uses raw X25519 DH + raw ML-KEM-768 encapsulation, then the noble combine
/// and OV's HKDF — so ISecure derives the same per-contact key OV does.
pub struct PairingOutcome {
    pub contact_key_hex: String,
    pub sas: String,
    pub my_x25519_pub: Vec<u8>,   // 32 — to send back
    pub mlkem_ct: Vec<u8>,        // 1088 — to send back
}

pub fn respond_pairing(their_mlkem_ek: &[u8], their_x25519_pub: &[u8]) -> Result<PairingOutcome> {
    use ml_kem::{EncodedSizeUser, KemCore, MlKem768, kem::Encapsulate};
    use x25519_dalek::{PublicKey, StaticSecret};
    use rand_core::OsRng;

    if their_x25519_pub.len() != X25519_PK_LEN {
        return Err(CoreError::Malformed("x25519 pub not 32 bytes".into()));
    }
    // X25519 DH
    let my_sec = StaticSecret::random_from_rng(OsRng);
    let my_pub = PublicKey::from(&my_sec);
    let mut their_x = [0u8; 32];
    their_x.copy_from_slice(their_x25519_pub);
    let ss_ec = my_sec.diffie_hellman(&PublicKey::from(their_x)).to_bytes();

    // ML-KEM-768 encapsulate against their encapsulation key
    type Ek = <MlKem768 as KemCore>::EncapsulationKey;
    let arr = ml_kem::Encoded::<Ek>::try_from(their_mlkem_ek)
        .map_err(|_| CoreError::Malformed("mlkem ek not 1184".into()))?;
    let ek = Ek::from_bytes(&arr);
    let (ct, ss_pq) = ek.encapsulate(&mut OsRng).map_err(|_| CoreError::Malformed("encapsulate failed".into()))?;
    let ct_bytes = ct.as_slice().to_vec();

    // Encapsulator side: ct_ec = my ephemeral x25519 pub; pk_ec = their x25519 pub.
    let shared = kitchensink_combine(ss_pq.as_slice(), &ss_ec, &my_pub.to_bytes(), their_x25519_pub);
    let (contact_key_hex, sas) = derive_from_shared_secret(&shared);
    Ok(PairingOutcome {
        contact_key_hex, sas,
        my_x25519_pub: my_pub.to_bytes().to_vec(),
        mlkem_ct: ct_bytes,
    })
}

// ---- Pairing frame (verified against a real OV Message OVPK payload) --------
// A captured pairing SMS decoded byte-exact:
//   OVPK:HYUC:I:<base64>   where base64 -> 1216 bytes.
// 1216 = ML-KEM-768 public key (1184) ‖ X25519 public key (32). Confirmed.

pub const OVPK_PREFIX: &str = "OVPK:";
pub const MLKEM768_PK_LEN: usize = 1184;
pub const X25519_PK_LEN: usize = 32;
pub const PAIRING_BUNDLE_LEN: usize = MLKEM768_PK_LEN + X25519_PK_LEN; // 1216

/// A parsed OVPK pairing message.
pub struct Pairing {
    pub session: String,        // e.g. "HYUC" (short session id)
    pub role: String,           // e.g. "I" (initiator) / responder letter
    pub mlkem_pk: Vec<u8>,      // 1184 bytes
    pub x25519_pk: Vec<u8>,     // 32 bytes
}

/// Build the on-wire `OVPK:<session>:<role>:<base64(mlkem_pk ‖ x25519_pk)>`.
pub fn build_ovpk(session: &str, role: &str, mlkem_pk: &[u8], x25519_pk: &[u8]) -> Result<String> {
    if mlkem_pk.len() != MLKEM768_PK_LEN || x25519_pk.len() != X25519_PK_LEN {
        return Err(CoreError::Malformed("pairing key sizes wrong".into()));
    }
    let mut bundle = Vec::with_capacity(PAIRING_BUNDLE_LEN);
    bundle.extend_from_slice(mlkem_pk);
    bundle.extend_from_slice(x25519_pk);
    Ok(format!("{OVPK_PREFIX}{session}:{role}:{}", b64_encode(&bundle)))
}

/// Parse an `OVPK:` pairing message into its session, role and the two public keys.
pub fn parse_ovpk(msg: &str) -> Result<Pairing> {
    let body = msg.strip_prefix(OVPK_PREFIX)
        .ok_or_else(|| CoreError::Malformed("not an OVPK message".into()))?;
    let mut it = body.splitn(3, ':');
    let session = it.next().ok_or_else(|| CoreError::Malformed("no session".into()))?.to_string();
    let role = it.next().ok_or_else(|| CoreError::Malformed("no role".into()))?.to_string();
    let b64 = it.next().ok_or_else(|| CoreError::Malformed("no payload".into()))?;
    let bundle = b64_decode(b64)?;
    if bundle.len() != PAIRING_BUNDLE_LEN {
        return Err(CoreError::Malformed("pairing bundle not 1216 bytes".into()));
    }
    Ok(Pairing {
        session,
        role,
        mlkem_pk: bundle[..MLKEM768_PK_LEN].to_vec(),
        x25519_pk: bundle[MLKEM768_PK_LEN..].to_vec(),
    })
}

// Minimal standard-base64 (no external dep) for the pairing bundle.
fn b64_encode(data: &[u8]) -> String {
    const T: &[u8; 64] = b"ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/";
    let mut out = String::with_capacity((data.len() + 2) / 3 * 4);
    for chunk in data.chunks(3) {
        let b = [chunk[0], *chunk.get(1).unwrap_or(&0), *chunk.get(2).unwrap_or(&0)];
        let n = (b[0] as u32) << 16 | (b[1] as u32) << 8 | b[2] as u32;
        out.push(T[(n >> 18 & 63) as usize] as char);
        out.push(T[(n >> 12 & 63) as usize] as char);
        out.push(if chunk.len() > 1 { T[(n >> 6 & 63) as usize] as char } else { '=' });
        out.push(if chunk.len() > 2 { T[(n & 63) as usize] as char } else { '=' });
    }
    out
}

fn b64_decode(s: &str) -> Result<Vec<u8>> {
    fn val(c: u8) -> Option<u32> {
        match c {
            b'A'..=b'Z' => Some((c - b'A') as u32),
            b'a'..=b'z' => Some((c - b'a' + 26) as u32),
            b'0'..=b'9' => Some((c - b'0' + 52) as u32),
            b'+' => Some(62),
            b'/' => Some(63),
            _ => None,
        }
    }
    let clean: Vec<u8> = s.bytes().filter(|&c| c != b'=' && !c.is_ascii_whitespace()).collect();
    let mut out = Vec::with_capacity(clean.len() / 4 * 3);
    for chunk in clean.chunks(4) {
        let mut n = 0u32;
        let mut bits = 0;
        for &c in chunk {
            let v = val(c).ok_or_else(|| CoreError::Malformed("bad base64".into()))?;
            n = (n << 6) | v;
            bits += 6;
        }
        n <<= 24 - bits;
        let bytes = (bits) / 8;
        for i in 0..bytes {
            out.push((n >> (16 - i * 8) & 0xff) as u8);
        }
    }
    Ok(out)
}

// ---- OVB pairing handshake (verified against real OV Message captures) ------
// `OVB:<role>:<x25519_pk_b64>.<mlkem768_pk_b64>` — role A/B key exchange.
// Part sizes from real data: 32 bytes (X25519 pk) and 1184 bytes (ML-KEM-768 pk).
pub const OVB_PREFIX: &str = "OVB:";

pub struct OvbHandshake {
    pub role: String,           // "A" / "B"
    pub x25519_pk: Vec<u8>,     // 32
    pub mlkem_pk: Vec<u8>,      // 1184
}

/// Parse an `OVB:<role>:<x25519_b64>.<mlkem_b64>` handshake message.
pub fn parse_ovb_handshake(msg: &str) -> Result<OvbHandshake> {
    let body = msg.strip_prefix(OVB_PREFIX)
        .ok_or_else(|| CoreError::Malformed("not an OVB message".into()))?;
    let (role, rest) = body.split_once(':')
        .ok_or_else(|| CoreError::Malformed("no role".into()))?;
    // handshake carries two '.'-separated base64 public keys; message-mode does not
    let (p1, p2) = rest.split_once('.')
        .ok_or_else(|| CoreError::Malformed("not a handshake (no '.')".into()))?;
    let x25519_pk = b64_decode(p1)?;
    let mlkem_pk = b64_decode(p2)?;
    if x25519_pk.len() != X25519_PK_LEN {
        return Err(CoreError::Malformed("x25519 pk not 32 bytes".into()));
    }
    if mlkem_pk.len() != MLKEM768_PK_LEN {
        return Err(CoreError::Malformed("mlkem pk not 1184 bytes".into()));
    }
    Ok(OvbHandshake { role: role.to_string(), x25519_pk, mlkem_pk })
}

/// Build an `OVB:<role>:<x25519_b64>.<mlkem_b64>` handshake message.
pub fn build_ovb_handshake(role: &str, x25519_pk: &[u8], mlkem_pk: &[u8]) -> Result<String> {
    if x25519_pk.len() != X25519_PK_LEN || mlkem_pk.len() != MLKEM768_PK_LEN {
        return Err(CoreError::Malformed("handshake key sizes wrong".into()));
    }
    Ok(format!("{OVB_PREFIX}{role}:{}.{}", b64_encode(x25519_pk), b64_encode(mlkem_pk)))
}

/// Variable-width standard base36 (no leading zeros), like `Number.toString(36)`
/// used for the key index before substitution.
pub fn u32_to_base36(mut n: u32) -> String {
    if n == 0 {
        return "0".to_string();
    }
    let mut d = Vec::new();
    while n > 0 {
        d.push(B36[(n % 36) as usize]);
        n /= 36;
    }
    d.reverse();
    String::from_utf8(d).unwrap()
}

/// End-to-end OV36 encode: `key_index` + already-stringified `payload` →
/// `OV36:<idxEnc>><payloadEnc>`, using the per-session `index_charset`
/// substitution and the per-message `special_charset`. This ties together every
/// reversed primitive (frame, base36, substitution, payload grouping).
pub fn encode_ov36_message(
    key_index: u32,
    payload: &str,
    index_charset: &Charset,
    special_charset: &[char],
) -> Result<String> {
    let idx_enc = index_charset.apply(&u32_to_base36(key_index))?;
    let payload_enc = encode_payload(payload, special_charset);
    Ok(frame(&idx_enc, &payload_enc))
}

/// Inverse of [`encode_ov36_message`]: parse an `OV36:` frame back to
/// `(key_index, payload)` with the same two charsets.
pub fn decode_ov36_message(
    msg: &str,
    index_charset: &Charset,
    special_charset: &[char],
) -> Result<(u32, String)> {
    let (idx_enc, payload_enc) = unframe(msg)
        .ok_or_else(|| CoreError::Malformed("not an OV36 message".into()))?;
    let key_index = from_base36(&index_charset.invert(idx_enc)?)?;
    let payload = decode_payload(payload_enc, special_charset)?;
    Ok((key_index, payload))
}

/// Split an OV36 frame into (index_enc, payload_enc). Returns `None` if the
/// string is not an OV36 message, mirroring `decodeBase36ToOvMessage`'s guards.
pub fn unframe(s: &str) -> Option<(&str, &str)> {
    let body = s.strip_prefix(OV36_PREFIX)?;
    let sep = body.find(OV36_SEP)?;
    Some((&body[..sep], &body[sep + 1..]))
}

#[cfg(test)]
mod tests {
    use super::*;

    #[test]
    fn base36_fixed_width_big_endian() {
        assert_eq!(to_base36(0, 2), "00");
        assert_eq!(to_base36(35, 2), "0Z");
        assert_eq!(to_base36(36, 2), "10");
        assert_eq!(to_base36(1295, 2), "ZZ"); // 36^2 - 1
        assert_eq!(to_base36(46655, 3), "ZZZ"); // 36^3 - 1
        for n in [0u32, 1, 35, 36, 1000, 1295, 46655] {
            let w = if n < 1296 { 2 } else { 3 };
            assert_eq!(from_base36(&to_base36(n, w)).unwrap(), n);
        }
    }

    #[test]
    fn substitution_roundtrip() {
        // a sample permutation of the 36 symbols
        let cs = Charset::new("ZYXWVUTSRQPONMLKJIHGFEDCBA9876543210").unwrap();
        let std = to_base36(1234, 3);
        let enc = cs.apply(&std).unwrap();
        assert_ne!(enc, std, "substitution must change the symbols");
        assert_eq!(cs.invert(&enc).unwrap(), std);
    }

    #[test]
    fn identity_charset_is_passthrough() {
        let id = Charset::identity();
        assert_eq!(id.apply("AB12").unwrap(), "AB12");
        assert_eq!(id.invert("AB12").unwrap(), "AB12");
    }

    #[test]
    fn frame_matches_target_format() {
        // OV36:<idx>><payload> — exact prefix and '>' separator
        let f = frame("A7", "3XQ9Z");
        assert_eq!(f, "OV36:A7>3XQ9Z");
        assert_eq!(unframe(&f), Some(("A7", "3XQ9Z")));
        assert_eq!(unframe("plain sms"), None);
        assert_eq!(unframe("OV36:noSeparator"), None);
    }

    #[test]
    fn payload_per_char_three_base36_digits() {
        // each char -> 3 base36 digits; charset index wins over code point
        let cs: Vec<char> = "XYZ".chars().collect();
        // 'X' -> index 0 -> "000", 'Y' -> 1 -> "001", 'Z' -> 2 -> "002"
        assert_eq!(encode_payload("XYZ", &cs), "000001002");
        // char not in charset -> code point: 'A' = 65 -> base36_3 "01T"
        assert_eq!(encode_payload("A", &cs), to_base36(65, 3));
        // round trip over binary-ish bytes as latin1 chars
        let charset: Vec<char> = (0u8..=255).map(|b| b as char).collect();
        let s: String = (0u8..=255).map(|b| b as char).collect();
        let enc = encode_payload(&s, &charset);
        assert_eq!(enc.len(), 256 * 3);
        assert_eq!(decode_payload(&enc, &charset).unwrap(), s);
    }

    #[test]
    fn charset_seed_is_sha3_256_domain_separated() {
        // stable, and '|' separation makes (a|b) != (ab|"")
        let s = charset_seed_hex("session42", "0");
        assert_eq!(s.len(), 64); // 32 bytes hex
        assert_ne!(charset_seed_hex("a", "b"), charset_seed_hex("ab", ""));
        assert_eq!(charset_seed_hex("a", "b"), charset_seed_hex("a", "b")); // deterministic
    }

    #[test]
    fn prng_is_deterministic_and_in_range() {
        let mut a = SeededPrng::new("deadbeef");
        let mut b = SeededPrng::new("deadbeef");
        for max in [0u32, 1, 5, 35, 255, 1000] {
            let x = a.next_int(max);
            assert_eq!(x, b.next_int(max), "same seed must reproduce the stream");
            assert!(x <= max, "result {x} out of range 0..={max}");
        }
        // different seed -> different stream (overwhelmingly)
        let mut c = SeededPrng::new("feedface");
        assert_ne!(SeededPrng::new("deadbeef").next_int(1_000_000),
                   c.next_int(1_000_000));
    }

    #[test]
    fn shuffle_is_a_seeded_permutation() {
        let base: Vec<char> = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ".chars().collect();
        let s1 = deterministic_shuffle(&base, "aa");
        let s2 = deterministic_shuffle(&base, "aa");
        assert_eq!(s1, s2, "deterministic for a fixed seed");
        assert_ne!(s1, base, "actually permutes");
        // same multiset (a real permutation, nothing lost/added)
        let mut sorted = s1.clone();
        sorted.sort();
        let mut ref_sorted = base.clone();
        ref_sorted.sort();
        assert_eq!(sorted, ref_sorted);
        assert_ne!(deterministic_shuffle(&base, "bb"), s1, "seed changes the order");
    }

    #[test]
    fn derived_index_charset_is_usable_substitution() {
        // full end-to-end: derive a 36-symbol index charset from a session key,
        // then encode/decode a key index through it.
        let base: Vec<char> = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ".chars().collect();
        let derived = derive_charset(&base, "session-key-hex-abc123", TAG_INDEX_CHARSET);
        let cs = Charset::new(&derived.iter().collect::<String>()).unwrap();
        let idx_std = to_base36(7, 2);
        let enc = cs.apply(&idx_std).unwrap();
        assert_eq!(cs.invert(&enc).unwrap(), idx_std, "index survives the derived substitution");
    }

    #[test]
    fn end_to_end_ov36_roundtrip_with_derived_charsets() {
        // Full pipeline: derive both charsets from a session key, then encode a
        // key index + a payload string and decode it back byte-exact.
        let idx_base: Vec<char> = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ".chars().collect();
        let derived_idx = derive_charset(&idx_base, "sess-key-9f3a", TAG_INDEX_CHARSET);
        let index_charset = Charset::new(&derived_idx.iter().collect::<String>()).unwrap();

        // special charset = derived permutation of the latin1 byte alphabet
        let byte_base: Vec<char> = (0u8..=255).map(|b| b as char).collect();
        let special_charset = derive_charset(&byte_base, "sess-key-9f3a", TAG_SPECIAL_CHARSET);

        // a "ciphertext as latin1 string" stand-in
        let payload: String = (0u8..64).map(|b| b as char).collect();

        let msg = encode_ov36_message(42, &payload, &index_charset, &special_charset).unwrap();
        assert!(msg.starts_with("OV36:"));
        assert!(msg.contains('>'));

        let (idx, got) = decode_ov36_message(&msg, &index_charset, &special_charset).unwrap();
        assert_eq!(idx, 42);
        assert_eq!(got, payload);
    }

    #[test]
    fn mvlv_known_answer_matches_real_ov_sas() {
        // Live known-answer (session MVLV): iSecure encapsulated against OV; OV
        // displayed SAS 46EC-6B3D-A890. ss/ct_ec/pk_ec logged from that exchange.
        let ss_pq = hex::decode("b2b37780befea69bd83abda662a5ff3bb3fd53dc40924906f21fdb1512ab2540").unwrap();
        let ss_ec = hex::decode("9a5da7dababdd573e9763e6a395f4c747e03665471f69e0f991b33a49fd20d6d").unwrap();
        let ct_ec = hex::decode("6444b51c70d9aa3dda713c8583372c79c91afc4d4748ed5eb5587f5a3c161172").unwrap();
        let pk_ec = hex::decode("79da36f580ac8a9741147f7cfa8143e9aacc675cd6028379071e23fdcd5acc6f").unwrap();
        let shared = kitchensink_combine(&ss_pq, &ss_ec, &ct_ec, &pk_ec);
        let (_ck, sas) = derive_from_shared_secret(&shared);
        assert_eq!(sas, "46EC6B3DA890", "must match OV's displayed SAS");
    }

    #[test]
    fn contact_key_kdf_shape_and_determinism() {
        let ss = b"hybrid shared secret bytes (x25519 || mlkem)";
        let (ck, sas) = derive_from_shared_secret(ss);
        // OV's contactKey = slot4 KDF output: 64..=150 chars over EXTENDED_CHARSET.
        assert!((64..=150).contains(&ck.chars().count()), "contact key length in slot4 range");
        assert_eq!(sas.len(), 12, "SAS = 6 bytes hex, matches OV (12 chars)");
        assert!(sas.chars().all(|c| c.is_ascii_hexdigit()));
        // deterministic; different secret -> different key
        assert_eq!(derive_from_shared_secret(ss), (ck.clone(), sas.clone()));
        assert_ne!(derive_from_shared_secret(b"other secret").0, ck);
    }

    #[test]
    fn respond_pairing_produces_valid_contact_key() {
        // internal consistency: a valid ML-KEM ek + X25519 pub -> 32B key + 12-hex SAS
        use ml_kem::{KemCore, MlKem768, EncodedSizeUser};
        use rand_core::OsRng;
        let (_dk, ek) = MlKem768::generate(&mut OsRng);
        let xsec = x25519_dalek::StaticSecret::random_from_rng(OsRng);
        let xpub = x25519_dalek::PublicKey::from(&xsec);
        let o = respond_pairing(ek.as_bytes().as_slice(), xpub.as_bytes()).unwrap();
        assert!((64..=150).contains(&o.contact_key_hex.chars().count()));
        assert_eq!(o.sas.len(), 12);
        assert_eq!(o.mlkem_ct.len(), 1088);
        assert_eq!(o.my_x25519_pub.len(), 32);
    }

    #[test]
    fn ovpk_pairing_frame_matches_real_capture() {
        // Sizes verified against a real OV Message OVPK SMS (1216-byte bundle).
        assert_eq!(PAIRING_BUNDLE_LEN, 1216);
        let mlkem = vec![0xABu8; MLKEM768_PK_LEN];
        let x = vec![0xCDu8; X25519_PK_LEN];
        let msg = build_ovpk("HYUC", "I", &mlkem, &x).unwrap();
        assert!(msg.starts_with("OVPK:HYUC:I:"));
        let p = parse_ovpk(&msg).unwrap();
        assert_eq!(p.session, "HYUC");
        assert_eq!(p.role, "I");
        assert_eq!(p.mlkem_pk, mlkem);
        assert_eq!(p.x25519_pk, x);
        // wrong sizes rejected
        assert!(build_ovpk("S", "I", &[0u8; 10], &x).is_err());
    }

    #[test]
    fn ovb_handshake_frame_roundtrip() {
        let x = vec![0x11u8; X25519_PK_LEN];
        let m = vec![0x22u8; MLKEM768_PK_LEN];
        let msg = build_ovb_handshake("A", &x, &m).unwrap();
        assert!(msg.starts_with("OVB:A:"));
        assert!(msg.contains('.'));
        let h = parse_ovb_handshake(&msg).unwrap();
        assert_eq!(h.role, "A");
        assert_eq!(h.x25519_pk, x);
        assert_eq!(h.mlkem_pk, m);
    }

    #[test]
    fn base64_roundtrip_matches_std() {
        for len in [0usize, 1, 2, 3, 31, 32, 1216] {
            let data: Vec<u8> = (0..len).map(|i| (i * 7 + 3) as u8).collect();
            assert_eq!(b64_decode(&b64_encode(&data)).unwrap(), data, "len {len}");
        }
    }

    #[test]
    fn charset_rejects_bad_input() {
        assert!(Charset::new("too short").is_err());
        assert!(Charset::new("AABBCCDDEEFFGGHHIIJJKKLLMMNNOOPPQQRR").is_err()); // dups
    }
}
