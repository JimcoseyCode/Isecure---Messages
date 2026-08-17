//! On-the-wire protocol: turn plaintext into SMS-safe strings and back.
//!
//! Pure and stateless — the app owns the database (key-pool index cursor,
//! replay dedup, chunk reassembly buffer). This module only does the
//! deterministic encode/decode so both platforms share one implementation.
//!
//! Wire formats (all ASCII, SMS-safe):
//! * message  : `OV1|<keyIndex>|<base64(nonce‖ct‖tag)>`
//! * chunk    : `OVc|<msgId>|<seq>|<total>|<payloadSlice>`
//! * pairing A : `OVB:A:<base64x25519>.<base64mlkem>`
//! * pairing B : `OVB:B:<base64x25519>.<base64mlkemCt>`

use base64::engine::general_purpose::STANDARD_NO_PAD as B64;
use base64::Engine;

use crate::aead;
use crate::error::{CoreError, Result};
use crate::kem::{HybridKeyPair, PairingResponse, PublicBundle};

const MSG_PREFIX: &str = "OV1|";

/// Bind the key-pool index into the AEAD associated data so an attacker can't
/// renumber a captured message to a different pool slot.
fn msg_aad(key_index: u32) -> Vec<u8> {
    format!("OV1|{key_index}").into_bytes()
}

/// Encrypt one message with pool key `key_index`. Returns the SMS payload
/// string (before any chunking).
pub fn seal_message(pool_key: &[u8], key_index: u32, plaintext: &str) -> Result<String> {
    let blob = aead::seal(pool_key, plaintext.as_bytes(), &msg_aad(key_index))?;
    Ok(format!("{MSG_PREFIX}{key_index}|{}", B64.encode(&blob)))
}

/// The key index carried by a message payload — the app uses it to pick the
/// matching pool key before calling [`open_message`].
pub fn peek_key_index(payload: &str) -> Result<u32> {
    let rest = payload
        .strip_prefix(MSG_PREFIX)
        .ok_or_else(|| CoreError::Malformed("not an OV1 message".into()))?;
    let idx_str = rest
        .split('|')
        .next()
        .ok_or_else(|| CoreError::Malformed("missing key index".into()))?;
    idx_str
        .parse::<u32>()
        .map_err(|_| CoreError::Malformed("bad key index".into()))
}

/// Decrypt a message payload with the resolved pool key. Fails closed on
/// tamper (GCM) or a renumbered index (AAD mismatch).
pub fn open_message(pool_key: &[u8], payload: &str) -> Result<String> {
    let rest = payload
        .strip_prefix(MSG_PREFIX)
        .ok_or_else(|| CoreError::Malformed("not an OV1 message".into()))?;
    let mut parts = rest.splitn(2, '|');
    let key_index: u32 = parts
        .next()
        .and_then(|s| s.parse().ok())
        .ok_or_else(|| CoreError::Malformed("bad key index".into()))?;
    let b64 = parts
        .next()
        .ok_or_else(|| CoreError::Malformed("missing ciphertext".into()))?;
    let blob = B64
        .decode(b64.as_bytes())
        .map_err(|e| CoreError::Malformed(format!("base64: {e}")))?;
    let pt = aead::open(pool_key, &blob, &msg_aad(key_index))?;
    String::from_utf8(pt).map_err(|_| CoreError::Malformed("plaintext not utf-8".into()))
}

// ---- multipart chunking -------------------------------------------------

const CHUNK_PREFIX: &str = "OVc|";

/// Split a payload that exceeds `max_len` chars into `OVc|` chunks. If it fits,
/// returns it unchanged as a single element. `msg_id` correlates the parts.
pub fn split_into_chunks(payload: &str, msg_id: &str, max_len: usize) -> Vec<String> {
    if payload.len() <= max_len {
        return vec![payload.to_string()];
    }
    // reserve room for the "OVc|id|seq|total|" header
    let header_budget = CHUNK_PREFIX.len() + msg_id.len() + 12;
    let body = max_len.saturating_sub(header_budget).max(1);
    let bytes = payload.as_bytes();
    let total = bytes.len().div_ceil(body);
    (0..total)
        .map(|seq| {
            let start = seq * body;
            let end = (start + body).min(bytes.len());
            let slice = std::str::from_utf8(&bytes[start..end]).unwrap_or("");
            format!("{CHUNK_PREFIX}{msg_id}|{seq}|{total}|{slice}")
        })
        .collect()
}

pub struct Chunk {
    pub msg_id: String,
    pub seq: u32,
    pub total: u32,
    pub data: String,
}

/// Parse one `OVc|` chunk. Returns `None` if the SMS isn't a chunk (the app
/// then treats it as a whole message).
pub fn parse_chunk(sms: &str) -> Option<Chunk> {
    let rest = sms.strip_prefix(CHUNK_PREFIX)?;
    let mut parts = rest.splitn(4, '|');
    let msg_id = parts.next()?.to_string();
    let seq = parts.next()?.parse().ok()?;
    let total = parts.next()?.parse().ok()?;
    let data = parts.next()?.to_string();
    Some(Chunk { msg_id, seq, total, data })
}

// ---- pairing wire format ------------------------------------------------

pub const PAIR_A_PREFIX: &str = "OVB:A:";
pub const PAIR_B_PREFIX: &str = "OVB:B:";

pub fn serialize_pairing_a(kp: &HybridKeyPair) -> String {
    let b = kp.public_bundle();
    format!(
        "{PAIR_A_PREFIX}{}.{}",
        B64.encode(&b.x25519_public),
        B64.encode(&b.mlkem_public)
    )
}

pub fn parse_pairing_a(sms: &str) -> Result<PublicBundle> {
    let rest = sms
        .strip_prefix(PAIR_A_PREFIX)
        .ok_or_else(|| CoreError::Malformed("not a pairing-A sms".into()))?;
    let (x, ml) = rest
        .split_once('.')
        .ok_or_else(|| CoreError::Malformed("pairing-A missing separator".into()))?;
    Ok(PublicBundle {
        x25519_public: B64.decode(x).map_err(|e| CoreError::Malformed(e.to_string()))?,
        mlkem_public: B64.decode(ml).map_err(|e| CoreError::Malformed(e.to_string()))?,
    })
}

pub fn serialize_pairing_b(resp: &PairingResponse) -> String {
    format!(
        "{PAIR_B_PREFIX}{}.{}",
        B64.encode(&resp.x25519_public),
        B64.encode(&resp.mlkem_ciphertext)
    )
}

pub fn parse_pairing_b(sms: &str) -> Result<PairingResponse> {
    let rest = sms
        .strip_prefix(PAIR_B_PREFIX)
        .ok_or_else(|| CoreError::Malformed("not a pairing-B sms".into()))?;
    let (x, ct) = rest
        .split_once('.')
        .ok_or_else(|| CoreError::Malformed("pairing-B missing separator".into()))?;
    Ok(PairingResponse {
        x25519_public: B64.decode(x).map_err(|e| CoreError::Malformed(e.to_string()))?,
        mlkem_ciphertext: B64.decode(ct).map_err(|e| CoreError::Malformed(e.to_string()))?,
    })
}

#[cfg(test)]
mod tests {
    use super::*;
    use crate::kdf::derive_key_pool;
    use crate::kem::{complete_as_a, respond_as_b};

    #[test]
    fn message_roundtrip_with_pool() {
        let pool = derive_key_pool(&[3u8; 32], 500);
        let idx = 42u32;
        let payload = seal_message(&pool[idx as usize], idx, "hey, ca marche?").unwrap();
        assert_eq!(peek_key_index(&payload).unwrap(), idx);
        let out = open_message(&pool[idx as usize], &payload).unwrap();
        assert_eq!(out, "hey, ca marche?");
    }

    #[test]
    fn renumbered_index_is_rejected() {
        let pool = derive_key_pool(&[3u8; 32], 500);
        let payload = seal_message(&pool[10], 10, "secret").unwrap();
        // forge the header to claim index 11 (attacker also has pool[11])
        let b64 = payload.splitn(3, '|').nth(2).unwrap();
        let forged = format!("OV1|11|{b64}");
        assert!(open_message(&pool[11], &forged).is_err(), "AAD binds the index");
    }

    #[test]
    fn chunking_reassembles() {
        let long = "A".repeat(1000);
        let chunks = split_into_chunks(&long, "m1", 200);
        assert!(chunks.len() > 1);
        let mut parsed: Vec<_> = chunks.iter().map(|c| parse_chunk(c).unwrap()).collect();
        assert!(parsed.iter().all(|c| c.msg_id == "m1"));
        assert_eq!(parsed[0].total as usize, chunks.len());
        parsed.sort_by_key(|c| c.seq);
        let joined: String = parsed.iter().map(|c| c.data.clone()).collect();
        assert_eq!(joined, long);
    }

    #[test]
    fn short_message_is_single_chunk() {
        let chunks = split_into_chunks("short", "m2", 200);
        assert_eq!(chunks.len(), 1);
        assert!(parse_chunk(&chunks[0]).is_none()); // not wrapped
    }

    #[test]
    fn full_pairing_over_wire() {
        let kp_a = HybridKeyPair::generate();
        let kp_b = HybridKeyPair::generate();

        let a_sms = serialize_pairing_a(&kp_a);
        let a_bundle = parse_pairing_a(&a_sms).unwrap();
        let (key_b, resp) = respond_as_b(&kp_b, &a_bundle).unwrap();

        let b_sms = serialize_pairing_b(&resp);
        let resp_parsed = parse_pairing_b(&b_sms).unwrap();
        let key_a = complete_as_a(&kp_a, &resp_parsed).unwrap();

        assert_eq!(key_a, key_b);
    }
}
