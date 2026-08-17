//! Flat FFI surface exposed to Kotlin/Swift via UniFFI.
//!
//! Everything is hex/String/bytes in and out — no Rust objects cross the
//! boundary except the opaque serialized keypair blob (also hex). This keeps
//! the generated Kotlin trivial for the React Native module to wrap.

use crate::{aead, kdf, kem, protocol};

#[derive(Debug, thiserror::Error, uniffi::Error)]
pub enum FfiError {
    #[error("{msg}")]
    Core { msg: String },
}

impl From<crate::error::CoreError> for FfiError {
    fn from(e: crate::error::CoreError) -> Self {
        FfiError::Core { msg: e.to_string() }
    }
}

type R<T> = std::result::Result<T, FfiError>;

// ---- password / key derivation -----------------------------------------

#[derive(uniffi::Record)]
pub struct DerivedKey {
    pub key_hex: String,
    pub salt_hex: String,
}

/// Argon2id. `salt_hex = None` mints a fresh salt; pass the stored salt to
/// reproduce the key on later logins.
#[uniffi::export]
pub fn derive_from_password(password: String, salt_hex: Option<String>) -> R<DerivedKey> {
    let salt = match salt_hex {
        Some(h) => {
            let b = hex::decode(h).map_err(|e| FfiError::Core { msg: e.to_string() })?;
            if b.len() != 32 {
                return Err(FfiError::Core { msg: "salt must be 32 bytes".into() });
            }
            let mut s = [0u8; 32];
            s.copy_from_slice(&b);
            Some(s)
        }
        None => None,
    };
    let dk = kdf::derive_from_password(&password, salt)?;
    Ok(DerivedKey { key_hex: hex::encode(dk.key), salt_hex: hex::encode(dk.salt) })
}

/// HKDF-derive the 500-key pool from the pairing master secret.
#[uniffi::export]
pub fn derive_key_pool(master_hex: String, count: u32) -> R<Vec<String>> {
    let master = hex::decode(master_hex).map_err(|e| FfiError::Core { msg: e.to_string() })?;
    Ok(kdf::derive_key_pool(&master, count).iter().map(hex::encode).collect())
}

/// 12-hex SAS for out-of-band pairing verification.
#[uniffi::export]
pub fn derive_sas(shared_hex: String) -> R<String> {
    let shared = hex::decode(shared_hex).map_err(|e| FfiError::Core { msg: e.to_string() })?;
    Ok(kdf::derive_sas(&shared))
}

/// A fresh random 32-byte key as hex (OS CSPRNG). For manually-keyed contacts.
#[uniffi::export]
pub fn random_key_hex() -> String {
    use rand_core::{OsRng, RngCore};
    let mut k = [0u8; 32];
    OsRng.fill_bytes(&mut k);
    hex::encode(k)
}

// ---- messages -----------------------------------------------------------

#[uniffi::export]
pub fn seal_message(pool_key_hex: String, key_index: u32, plaintext: String) -> R<String> {
    let key = hex::decode(pool_key_hex).map_err(|e| FfiError::Core { msg: e.to_string() })?;
    Ok(protocol::seal_message(&key, key_index, &plaintext)?)
}

#[uniffi::export]
pub fn open_message(pool_key_hex: String, payload: String) -> R<String> {
    let key = hex::decode(pool_key_hex).map_err(|e| FfiError::Core { msg: e.to_string() })?;
    Ok(protocol::open_message(&key, &payload)?)
}

#[uniffi::export]
pub fn peek_key_index(payload: String) -> R<u32> {
    Ok(protocol::peek_key_index(&payload)?)
}

// ---- multipart chunking -------------------------------------------------

#[derive(uniffi::Record)]
pub struct SmsChunk {
    pub msg_id: String,
    pub seq: u32,
    pub total: u32,
    pub data: String,
}

#[uniffi::export]
pub fn split_into_chunks(payload: String, msg_id: String, max_len: u32) -> Vec<String> {
    protocol::split_into_chunks(&payload, &msg_id, max_len as usize)
}

#[uniffi::export]
pub fn parse_chunk(sms: String) -> Option<SmsChunk> {
    protocol::parse_chunk(&sms).map(|c| SmsChunk {
        msg_id: c.msg_id,
        seq: c.seq,
        total: c.total,
        data: c.data,
    })
}

// ---- files --------------------------------------------------------------

#[uniffi::export]
pub fn encrypt_file(key_hex: String, content: Vec<u8>, filename: String) -> R<Vec<u8>> {
    let key = hex::decode(key_hex).map_err(|e| FfiError::Core { msg: e.to_string() })?;
    Ok(aead::encrypt_file(&key, &content, &filename)?)
}

#[derive(uniffi::Record)]
pub struct DecryptedFile {
    pub content: Vec<u8>,
    pub original_filename: String,
}

#[uniffi::export]
pub fn decrypt_file(key_hex: String, ov_bytes: Vec<u8>) -> R<DecryptedFile> {
    let key = hex::decode(key_hex).map_err(|e| FfiError::Core { msg: e.to_string() })?;
    let d = aead::decrypt_file(&key, &ov_bytes)?;
    Ok(DecryptedFile { content: d.content, original_filename: d.original_filename })
}

// ---- pairing handshake --------------------------------------------------

#[derive(uniffi::Record)]
pub struct PairingInit {
    /// Serialized secret keypair — the app stores this until B replies.
    pub keypair_hex: String,
    /// The `OVB:A:` SMS to send.
    pub sms: String,
}

/// Party A: start pairing. Returns the keypair to persist + the SMS to send.
#[uniffi::export]
pub fn start_pairing_a() -> PairingInit {
    let kp = kem::HybridKeyPair::generate();
    PairingInit {
        keypair_hex: hex::encode(kp.to_bytes()),
        sms: protocol::serialize_pairing_a(&kp),
    }
}

#[derive(uniffi::Record)]
pub struct PairingResult {
    pub shared_key_hex: String,
    /// Present only for party B — the `OVB:B:` SMS to send back.
    pub sms: Option<String>,
    pub sas: String,
}

/// Party B: consume A's SMS, derive the shared key, and produce the reply.
#[uniffi::export]
pub fn respond_pairing_b(a_sms: String) -> R<PairingResult> {
    let bundle = protocol::parse_pairing_a(&a_sms)?;
    let kp_b = kem::HybridKeyPair::generate();
    let (shared, resp) = kem::respond_as_b(&kp_b, &bundle)?;
    Ok(PairingResult {
        shared_key_hex: hex::encode(shared),
        sms: Some(protocol::serialize_pairing_b(&resp)),
        sas: kdf::derive_sas(&shared),
    })
}

/// Party A: consume B's SMS and finish. `keypair_hex` is what `start_pairing_a`
/// returned.
#[uniffi::export]
pub fn complete_pairing_a(keypair_hex: String, b_sms: String) -> R<PairingResult> {
    let kp = kem::HybridKeyPair::from_bytes(
        &hex::decode(keypair_hex).map_err(|e| FfiError::Core { msg: e.to_string() })?,
    )?;
    let resp = protocol::parse_pairing_b(&b_sms)?;
    let shared = kem::complete_as_a(&kp, &resp)?;
    Ok(PairingResult {
        shared_key_hex: hex::encode(shared),
        sms: None,
        sas: kdf::derive_sas(&shared),
    })
}

// ==== OV Message interoperability (ovcompat) =============================
use crate::ovcompat;

#[derive(uniffi::Record)]
pub struct OvContactKey {
    pub contact_key_hex: String,
    pub sas: String,
}

/// Derive the OV-compatible per-contact key + SAS from a hybrid shared secret.
#[uniffi::export]
pub fn ov_derive_contact_key(shared_secret_hex: String) -> R<OvContactKey> {
    let ss = hex::decode(shared_secret_hex).map_err(|e| FfiError::Core { msg: e.to_string() })?;
    let (contact_key_hex, sas) = ovcompat::derive_from_shared_secret(&ss);
    Ok(OvContactKey { contact_key_hex, sas })
}

/// Derive a permuted charset (index or special) from a session key, OV-exact.
#[uniffi::export]
pub fn ov_derive_charset(base: String, seed_a: String, seed_b: String) -> String {
    let b: Vec<char> = base.chars().collect();
    ovcompat::derive_charset(&b, &seed_a, &seed_b).into_iter().collect()
}

#[derive(uniffi::Record)]
pub struct OvpkParsed {
    pub session: String,
    pub role: String,
    pub mlkem_pk_hex: String,
    pub x25519_pk_hex: String,
}

/// Parse a real OV Message `OVPK:` pairing announce.
#[uniffi::export]
pub fn ov_parse_ovpk(msg: String) -> R<OvpkParsed> {
    let p = ovcompat::parse_ovpk(&msg)?;
    Ok(OvpkParsed {
        session: p.session,
        role: p.role,
        mlkem_pk_hex: hex::encode(p.mlkem_pk),
        x25519_pk_hex: hex::encode(p.x25519_pk),
    })
}

/// Build an `OVPK:` announce from hex public keys.
#[uniffi::export]
pub fn ov_build_ovpk(session: String, role: String, mlkem_pk_hex: String, x25519_pk_hex: String) -> R<String> {
    let mlkem = hex::decode(mlkem_pk_hex).map_err(|e| FfiError::Core { msg: e.to_string() })?;
    let x = hex::decode(x25519_pk_hex).map_err(|e| FfiError::Core { msg: e.to_string() })?;
    Ok(ovcompat::build_ovpk(&session, &role, &mlkem, &x)?)
}

#[derive(uniffi::Record)]
pub struct Ov36Decoded {
    pub key_index: u32,
    pub payload: String,
}

/// Encode an OV36 message: `OV36:<idx>><payload>` using OV-derived charsets.
#[uniffi::export]
pub fn ov_encode_ov36(key_index: u32, payload: String, index_charset: String, special_charset: String) -> R<String> {
    let idx = ovcompat::Charset::new(&index_charset)?;
    let special: Vec<char> = special_charset.chars().collect();
    Ok(ovcompat::encode_ov36_message(key_index, &payload, &idx, &special)?)
}

/// Decode an OV36 message back to (key index, payload).
#[uniffi::export]
pub fn ov_decode_ov36(msg: String, index_charset: String, special_charset: String) -> R<Ov36Decoded> {
    let idx = ovcompat::Charset::new(&index_charset)?;
    let special: Vec<char> = special_charset.chars().collect();
    let (key_index, payload) = ovcompat::decode_ov36_message(&msg, &idx, &special)?;
    Ok(Ov36Decoded { key_index, payload })
}

#[derive(uniffi::Record)]
pub struct Ov36Message {
    pub secure_index: String,
    pub plaintext: String,
}

/// Decode a real OV Message `OV36:` frame to plaintext, using only the pairing
/// `contact_key_hex` (the byte-exact `ov36` codec — everything else is derived).
#[uniffi::export]
pub fn ov36_decode(msg: String, contact_key_hex: String) -> R<Ov36Message> {
    let d = crate::ov36::decode(&msg, &contact_key_hex)?;
    Ok(Ov36Message { secure_index: d.secure_index, plaintext: d.plaintext })
}

/// Encode `plaintext` into an `OV36:` frame the OV Message app decodes, under the
/// pairing `contact_key_hex`. A fresh random secureIndex + nonce are generated.
#[uniffi::export]
pub fn ov36_encode(plaintext: String, contact_key_hex: String) -> R<String> {
    Ok(crate::ov36::encode_random(&plaintext, &contact_key_hex)?)
}

#[derive(uniffi::Record)]
pub struct OvPairingOutcome {
    pub contact_key_hex: String,
    pub sas: String,
    pub my_x25519_pub_hex: String,
    pub mlkem_ct_hex: String,
}

/// Full OV pairing responder: consume OV's announced ML-KEM encaps key + X25519
/// pub (from an `OVPK:`), run X25519 DH + ML-KEM-768 encaps + noble KitchenSink
/// combine + OV HKDF -> the same per-contact key OV derives, plus the ciphertext
/// and X25519 pub to send back.
#[uniffi::export]
pub fn ov_respond_pairing(mlkem_ek_hex: String, x25519_pub_hex: String) -> R<OvPairingOutcome> {
    let ek = hex::decode(mlkem_ek_hex).map_err(|e| FfiError::Core { msg: e.to_string() })?;
    let xp = hex::decode(x25519_pub_hex).map_err(|e| FfiError::Core { msg: e.to_string() })?;
    let o = ovcompat::respond_pairing(&ek, &xp)?;
    Ok(OvPairingOutcome {
        contact_key_hex: o.contact_key_hex,
        sas: o.sas,
        my_x25519_pub_hex: hex::encode(o.my_x25519_pub),
        mlkem_ct_hex: hex::encode(o.mlkem_ct),
    })
}

#[derive(uniffi::Record)]
pub struct OvAnnounce {
    pub ovb_a: String,
    pub state_hex: String,
}

/// OV handshake step 1 (responder): OVPK in -> OVB:A pk-announce + state.
#[uniffi::export]
pub fn ov_pairing_announce(ovpk_msg: String) -> R<OvAnnounce> {
    let a = ovcompat::pairing_announce(&ovpk_msg)?;
    Ok(OvAnnounce { ovb_a: a.ovb_a, state_hex: a.state_hex })
}

/// OV handshake step 2 (responder): state + OVB:B ciphertext -> contact key + SAS.
#[uniffi::export]
pub fn ov_pairing_finish(state_hex: String, ovb_b_msg: String) -> R<OvContactKey> {
    let (contact_key_hex, sas) = ovcompat::pairing_finish(&state_hex, &ovb_b_msg)?;
    Ok(OvContactKey { contact_key_hex, sas })
}

#[derive(uniffi::Record)]
pub struct OvHybridRespond {
    pub reply_sms: String,
    pub contact_key_hex: String,
    pub sas: String,
    pub ss_ec_hex: String,
    pub ss_pq_hex: String,
    pub cipher_text_hex: String,
}

/// Real OV SMS pairing responder: OVPK:<sess>:I:... in -> OVPK:<sess>:R:... reply
/// + contact key + SAS (noble ml_kem768_x25519 + OV HKDF).
#[uniffi::export]
pub fn ov_hybrid_respond(ovpk_sms: String) -> R<OvHybridRespond> {
    let o = ovcompat::hybrid_respond(&ovpk_sms)?;
    Ok(OvHybridRespond { reply_sms: o.reply_sms, contact_key_hex: o.contact_key_hex, sas: o.sas, ss_ec_hex: o.ss_ec_hex, ss_pq_hex: o.ss_pq_hex, cipher_text_hex: o.cipher_text_hex })
}
