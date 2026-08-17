//! OV Message **OV36 base36 substitution codec** — byte-exact, reverse-engineered
//! from the Hermes pseudo-JS decompile and **validated live** against the real OV
//! Message app (a `bonjour` sent by OV decodes to `bonjour`).
//!
//! This lets ISecure decode OV Message's `OV36:` messages and emit `OV36:` messages
//! OV accepts, over the pairing `contactKey`.
//!
//! ## Algorithm (validated end-to-end)
//!
//! The `contactKey` is the OV pairing key **after `ov_encode_contact_key`** (the
//! `slot4` KDF in `ovcompat.rs`) — NOT the raw hex digest. Decode
//! `OV36:<idxEnc>><nonce_b64url16>:<payloadEnc>`:
//! ```text
//!   secureIndex = join( derivedIndexCharset[base36_2(idxEnc[2i..2i+2])] )   // 11 chars
//!     derivedIndexCharset = deriveCharset(INDEX_CHARSET, contactKey, "OV_INDEX_CHARSET_V1")
//!   ctxA   = SHA3-256(secureIndex).hex
//!   subKey = HMAC( HMAC(key=secureIndex, msg=contactKey), "OV_Charset_v1"‖0x01 ).hex
//!   for k, group in payloadEnc.chunks(3):
//!       num   = base36_3(group)
//!       shift = BigInt("0x"+SHA3-256(`${ctxA}:${k}:${subKey}`)) mod 4096
//!       out  += UNIVERSAL[(num - shift) mod 4096]
//!   out = out.trim_end (OV appends 3–10 "secure spaces"; decode strips /\s+$/)
//! ```
//! Encode is the inverse: `num = (UNIVERSAL.indexOf(char) + shift) mod 4096`.
//! The per-message special-charset shuffle never enters the numeric codec.
//!
//! Notes (ponytail): NFC normalization on the caller; secure-space padding omitted on
//! encode (OV strips trailing whitespace); chars whose UNIVERSAL index ≥ 4096 are the
//! lossy edge OV guards via `isCharSupported`.

use crate::error::{CoreError, Result};
use hmac::{Hmac, Mac};
use sha2::{Digest as _, Sha256};
use sha3::Sha3_256;

const UNIVERSAL: &str = include_str!("universal_charset.txt");
const INDEX_CHARSET: &str = include_str!("index_charset.txt");

const OV36_PREFIX: &str = "OV36:";
const SUBKEY_LABEL: &[u8] = b"OV_Charset_v1\x01";
const INDEX_SEED_LABEL: &str = "OV_INDEX_CHARSET_V1";
const B36: &[u8; 36] = b"0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
pub const MODULUS: usize = 4096;
pub const SECURE_INDEX_LEN: usize = 11;

fn universal() -> Vec<char> { UNIVERSAL.chars().collect() }
fn index_charset() -> Vec<char> { INDEX_CHARSET.chars().collect() }

fn b36_encode(mut n: usize, width: usize) -> String {
    let mut buf = vec![b'0'; width];
    for i in (0..width).rev() { buf[i] = B36[n % 36]; n /= 36; }
    String::from_utf8(buf).unwrap()
}

fn b36_decode(s: &str) -> Result<usize> {
    let mut acc: usize = 0;
    for c in s.chars() {
        let d = B36.iter().position(|&b| b == c.to_ascii_uppercase() as u8)
            .ok_or_else(|| CoreError::Malformed("non-base36 digit".into()))?;
        acc = acc * 36 + d;
    }
    Ok(acc)
}

fn sha3_hex(s: &str) -> String { hex::encode(Sha3_256::digest(s.as_bytes())) }

fn hmac256(key: &[u8], data: &[u8]) -> [u8; 32] {
    let mut m = <Hmac<Sha256>>::new_from_slice(key).expect("hmac any key len");
    m.update(data);
    m.finalize().into_bytes().into()
}

/// `subKey = HMAC( HMAC(key=secureIndex, msg=contactKey), "OV_Charset_v1"‖0x01 ).hex`.
fn derive_subkey(secure_index: &str, contact_key: &str) -> String {
    let prk = hmac256(secure_index.as_bytes(), contact_key.as_bytes());
    hex::encode(hmac256(&prk, SUBKEY_LABEL))
}

/// `shift_k mod 4096` = low 12 bits of `SHA3-256(`${ctxA}:${k}:${subKey}`)`.
fn shift_mod(ctx_a: &str, pos: usize, sub_key: &str) -> usize {
    let d = Sha3_256::digest(format!("{ctx_a}:{pos}:{sub_key}").as_bytes());
    (((d[30] as usize) & 0x0f) << 8) | d[31] as usize
}

// ---- seeded SHA-256 PRNG + Fisher-Yates (for the derived INDEX charset) ----------
struct Prng { state: String, counter: u64 }
impl Prng {
    fn new(seed_hex: &str) -> Self { Prng { state: seed_hex.to_string(), counter: 0 } }
    fn next_int(&mut self, max: usize) -> usize {
        let range = (max + 1) as u64;
        let limit = (0x1_0000_0000u64 / range) * range;
        loop {
            let mut h = Sha256::new();
            h.update(self.state.as_bytes());
            h.update(self.counter.to_string().as_bytes());
            self.state = hex::encode(h.finalize());
            self.counter += 1;
            let v = u32::from_str_radix(&self.state[..8], 16).unwrap() as u64;
            if v < limit { return (v % range) as usize; }
        }
    }
}

fn derive_charset(base: &[char], a: &str, b: &str) -> Vec<char> {
    let mut arr = base.to_vec();
    let mut prng = Prng::new(&sha3_hex(&format!("{a}|{b}")));
    for i in (1..arr.len()).rev() { let j = prng.next_int(i); arr.swap(i, j); }
    arr
}

fn recover_secure_index(idx_enc: &str, contact_key: &str) -> Result<String> {
    let d_index = derive_charset(&index_charset(), contact_key, INDEX_SEED_LABEL);
    let chars: Vec<char> = idx_enc.chars().collect();
    if chars.len() % 2 != 0 { return Err(CoreError::Malformed("odd index length".into())); }
    let mut si = String::new();
    for pair in chars.chunks(2) {
        let v = b36_decode(&pair.iter().collect::<String>())?;
        si.push(*d_index.get(v).ok_or_else(|| CoreError::Malformed("index out of range".into()))?);
    }
    Ok(si)
}

/// Recovered pieces of an `OV36:` frame.
pub struct DecodedOv36 {
    pub secure_index: String,
    pub plaintext: String,
}

/// Decode an `OV36:` frame. `contact_key` is the pairing key **after** the `slot4`
/// KDF ([`crate::ovcompat::ov_encode_contact_key`]).
pub fn decode(msg: &str, contact_key: &str) -> Result<DecodedOv36> {
    let body = msg.strip_prefix(OV36_PREFIX)
        .ok_or_else(|| CoreError::Malformed("not an OV36 frame".into()))?;
    let gt = body.find('>').ok_or_else(|| CoreError::Malformed("missing '>'".into()))?;
    let idx_enc = &body[..gt];
    let after = &body[gt + 1..];
    let colon = after.find(':').ok_or_else(|| CoreError::Malformed("missing ':'".into()))?;
    let payload = &after[colon + 1..];

    let secure_index = recover_secure_index(idx_enc, contact_key)?;
    let ctx_a = sha3_hex(&secure_index);
    let sub_key = derive_subkey(&secure_index, contact_key);
    let uni = universal();

    let groups: Vec<char> = payload.chars().collect();
    if groups.len() % 3 != 0 { return Err(CoreError::Malformed("payload not a multiple of 3".into())); }
    let mut out = String::new();
    for (k, g) in groups.chunks(3).enumerate() {
        let num = b36_decode(&g.iter().collect::<String>())?;
        let shift = shift_mod(&ctx_a, k, &sub_key);
        let ci = (num + MODULUS - shift) % MODULUS;
        out.push(*uni.get(ci).ok_or_else(|| CoreError::Malformed("ci out of universal".into()))?);
    }
    let plaintext = out.trim_end_matches(char::is_whitespace).to_string();
    Ok(DecodedOv36 { secure_index, plaintext })
}

/// Encode `plaintext` into an `OV36:` frame OV can decode. `secure_index` is 11 chars,
/// each a member of the per-contact derived index charset; `nonce16` are 16 transport bytes.
pub fn encode(plaintext: &str, contact_key: &str, secure_index: &str, nonce16: &[u8; 16]) -> Result<String> {
    if secure_index.chars().count() != SECURE_INDEX_LEN {
        return Err(CoreError::Malformed("secureIndex must be 11 chars".into()));
    }
    let d_index = derive_charset(&index_charset(), contact_key, INDEX_SEED_LABEL);
    let mut index_enc = String::new();
    for c in secure_index.chars() {
        let p = d_index.iter().position(|&x| x == c)
            .ok_or_else(|| CoreError::Malformed("secureIndex char not in derived index charset".into()))?;
        index_enc.push_str(&b36_encode(p, 2));
    }
    let ctx_a = sha3_hex(secure_index);
    let sub_key = derive_subkey(secure_index, contact_key);
    let uni = universal();

    let mut payload = String::new();
    for (k, ch) in plaintext.chars().enumerate() {
        let ci = uni.iter().position(|&c| c == ch)
            .ok_or_else(|| CoreError::Malformed("unsupported char (not in universal charset)".into()))?;
        let shift = shift_mod(&ctx_a, k, &sub_key);
        payload.push_str(&b36_encode((ci + shift) % MODULUS, 3));
    }
    use base64::Engine;
    let nonce = base64::engine::general_purpose::URL_SAFE_NO_PAD.encode(nonce16);
    Ok(format!("{OV36_PREFIX}{index_enc}>{nonce}:{payload}"))
}

/// Convenience encode: random secureIndex (from the derived index charset) + random nonce.
pub fn encode_random(plaintext: &str, contact_key: &str) -> Result<String> {
    let d_index = derive_charset(&index_charset(), contact_key, INDEX_SEED_LABEL);
    let mut rnd = [0u8; 16 + SECURE_INDEX_LEN * 2];
    getrandom::getrandom(&mut rnd).map_err(|e| CoreError::Malformed(format!("rng: {e}")))?;
    let nonce: [u8; 16] = rnd[..16].try_into().unwrap();
    let mut si = String::new();
    for i in 0..SECURE_INDEX_LEN {
        let idx = ((rnd[16 + i * 2] as usize) << 8 | rnd[16 + i * 2 + 1] as usize) % d_index.len();
        si.push(d_index[idx]);
    }
    encode(plaintext, contact_key, &si, &nonce)
}

#[cfg(test)]
mod tests {
    use super::*;

    // Real OV Message triple (paired session 2C5P, SAS E3F7-59EE-25AB verified on OV's
    // screen). digest = the pairing HMAC digest; contactKey = ov_encode_contact_key(digest).
    const DIGEST_HEX: &str = "9816ff1c1761a966934114e3dd2b2df39ee95545d283797f423f6c27b1c0bcc7";
    const BONJOUR: &str = "OV36:8D329GAE5F0Z8R0LCVBPDD>CyQ9KwuFCJeJRQBzHCV_lA:0U402U1492BS1891OM1HT2SC0A12RE16J2J22F02GX2S5";

    fn contact_key() -> String {
        crate::ovcompat::ov_encode_contact_key(&hex::decode(DIGEST_HEX).unwrap())
    }

    #[test]
    fn charsets() {
        assert_eq!(universal().len(), 4096);
        assert_eq!(index_charset().len(), 512);
        assert_eq!(universal()[0], 'a');
    }

    #[test]
    fn decodes_real_ov_message() {
        let out = decode(BONJOUR, &contact_key()).unwrap();
        assert_eq!(out.plaintext, "bonjour", "live OV interop");
    }

    #[test]
    fn dbg_padding_codepoints() {
        let ck = contact_key();
        let body = BONJOUR.strip_prefix(OV36_PREFIX).unwrap();
        let gt = body.find('>').unwrap();
        let idx_enc = &body[..gt];
        let after = &body[gt + 1..];
        let payload = &after[after.find(':').unwrap() + 1..];
        let si = recover_secure_index(idx_enc, &ck).unwrap();
        let ctx_a = sha3_hex(&si);
        let sub_key = derive_subkey(&si, &ck);
        let uni = universal();
        let groups: Vec<char> = payload.chars().collect();
        let mut chars = Vec::new();
        for (k, g) in groups.chunks(3).enumerate() {
            let num = b36_decode(&g.iter().collect::<String>()).unwrap();
            let shift = shift_mod(&ctx_a, k, &sub_key);
            let ci = (num + MODULUS - shift) % MODULUS;
            chars.push(uni[ci]);
        }
        for (i, c) in chars.iter().enumerate() {
            println!("[{i}] U+{:04X} {:?}", *c as u32, c);
        }
        panic!("dbg done, {} chars", chars.len());
    }

    #[test]
    fn brute_force_tag() {
        use base64::Engine;
        // Fully-known triple pulled from the dev-app SQLite DB: the STORED contactKey
        // (slot4 form) for contact +330634467686 and its real OV36 messages from OV.
        let dir = "/private/tmp/claude-501/-Users-raphael-raphix-Desktop-msafara-app/1b49f4f7-5d91-41fe-8a4d-3fa5801f3644/scratchpad";
        let ck = std::fs::read_to_string(format!("{dir}/ck_db.txt")).unwrap().trim_end().to_string();
        let msgs = std::fs::read_to_string(format!("{dir}/msgs_db.txt")).unwrap();
        let msg = msgs.lines().find(|l| l.starts_with("OV36:")).unwrap();

        let _ = msg;
        let derive_mac_key = |ikm: &str, salt_suffix: &str| -> [u8; 32] {
            let salt = format!("OV_MSG_HMAC_SALT_v1|{salt_suffix}");
            let prk = hmac256(salt.as_bytes(), ikm.as_bytes());
            let mut info = b"OV_MSG_MAC_v1".to_vec();
            info.push(1);
            hmac256(&prk, &info)
        };
        let compute_tag16 = |a0: &str, a1: &str, a2: &str, mac_key: &[u8]| -> String {
            let full = hmac256(mac_key, format!("{a0}|{a1}|{a2}").as_bytes());
            base64::engine::general_purpose::URL_SAFE_NO_PAD.encode(&full[..16])
        };
        let untrim = |payload: &str, si: &str| -> String {
            let ctx_a = sha3_hex(si);
            let sub_key = derive_subkey(si, &ck);
            let uni = universal();
            payload.chars().collect::<Vec<_>>().chunks(3).enumerate().map(|(k, grp)| {
                let num = b36_decode(&grp.iter().collect::<String>()).unwrap();
                uni[(num + MODULUS - shift_mod(&ctx_a, k, &sub_key)) % MODULUS]
            }).collect()
        };
        let na = "+33634467686"; let nb = "+330634467686";
        let na0 = "33634467686"; let nb0 = "330634467686"; let nat = "0634467686";
        let chatids: Vec<String> = vec![
            format!("{na}_{na}"), format!("{nb}_{na}"), format!("{na}_{nb}"),
            format!("{na0}_{na0}"), format!("{nb0}_{na0}"), format!("{na0}_{nb0}"),
            format!("{nat}_{nat}"), format!("{nat}_{na}"),
            na.to_string(), nb.to_string(), na0.to_string(), nat.to_string(),
            format!("{na}:{na}"), format!("{na}|{na}"),
            format!("{nb}_{na}").replace('+', ""),
            "0634467686_0634467686".to_string(),
            "+33 6 34 46 76 86".to_string(),
        ];
        let chatids: Vec<&str> = chatids.iter().map(|s| s.as_str()).collect();
        let mut found = false;
        for msg in msgs.lines().filter(|l| l.starts_with("OV36:")) {
            let body = msg.strip_prefix(OV36_PREFIX).unwrap();
            let gt = body.find('>').unwrap();
            let idx_enc = &body[..gt];
            let after = &body[gt + 1..];
            let colon = after.find(':').unwrap();
            let target = &after[..colon];
            let payload = &after[colon + 1..];
            let si = recover_secure_index(idx_enc, &ck).unwrap();
            let untrimmed = untrim(payload, &si);
            let plain = decode(msg, &ck).unwrap().plaintext;
            // a2 candidates: payload + every 3-char prefix, plaintext with 0..=20 spaces, untrimmed
            let mut a2s: Vec<String> = vec![untrimmed.clone(), plain.clone()];
            let pc: Vec<char> = payload.chars().collect();
            let mut k = 3;
            while k <= pc.len() { a2s.push(pc[..k].iter().collect()); k += 3; }
            for n in 0..=20 { a2s.push(format!("{plain}{}", " ".repeat(n))); }
            // big candidate set for a0/a1/a2 (independent), salt = chatId
            let mut big: Vec<String> = vec![si.clone(), idx_enc.to_string(), payload.to_string(),
                untrimmed.clone(), plain.clone(), String::new()];
            for c in &chatids { big.push(c.to_string()); }
            for (n, pad) in (0..=6).map(|n| (n, format!("{plain}{}", " ".repeat(n)))) { let _=n; big.push(pad); }
            for cid in &chatids {
                let mk = derive_mac_key(&ck, cid);
                for a0 in &big {
                    for a1 in &big {
                        for a2 in &big {
                            if &compute_tag16(a0, a1, a2, &mk) == target {
                                eprintln!("MATCH! msg={} salt={cid} a0={a0:?} a1={a1:?} a2={a2:?}", &msg[..16]);
                                found = true;
                            }
                        }
                    }
                }
            }
        }
        assert!(found, "no tag combo matched — recipe still unknown");
    }

    #[test]
    fn round_trip() {
        let ck = contact_key();
        let d_index = derive_charset(&index_charset(), &ck, INDEX_SEED_LABEL);
        let si: String = [3usize, 40, 11, 200, 7, 300, 58, 100, 400, 1, 500]
            .iter().map(|&i| d_index[i]).collect();
        let text = "Bonjour azerty 123";
        let frame = encode(text, &ck, &si, &[7u8; 16]).unwrap();
        assert_eq!(decode(&frame, &ck).unwrap().plaintext, text);
    }
}
