//! Authenticated encryption for messages and files.
//!
//! One primitive only: **AES-256-GCM** (RustCrypto `aes-gcm`). No homemade
//! substitution/stream constructions. Every ciphertext is `nonce(12) || ct||tag`,
//! the nonce drawn fresh from the OS CSPRNG per call — so encrypting the same
//! plaintext twice never yields the same bytes, and there is no birthday
//! collision on a 96-bit random nonce the way the old `msgIndex ∈ [0,10^6)` had.

use aes_gcm::aead::{Aead, KeyInit, Payload};
use aes_gcm::{Aes256Gcm, Key, Nonce};
use rand_core::{OsRng, RngCore};

use crate::error::{CoreError, Result};

const NONCE_LEN: usize = 12; // 96-bit, the GCM standard
const KEY_LEN: usize = 32; // AES-256

fn cipher_from(key: &[u8]) -> Result<Aes256Gcm> {
    if key.len() != KEY_LEN {
        return Err(CoreError::KeyLen { expected: KEY_LEN, got: key.len() });
    }
    Ok(Aes256Gcm::new(Key::<Aes256Gcm>::from_slice(key)))
}

/// Encrypt with optional associated data (AAD) that is authenticated but not
/// encrypted — bind a message to its context (sender, msg index) to stop
/// cut-and-paste/replay across contexts.
pub fn seal(key: &[u8], plaintext: &[u8], aad: &[u8]) -> Result<Vec<u8>> {
    let cipher = cipher_from(key)?;
    let mut nonce_bytes = [0u8; NONCE_LEN];
    OsRng.fill_bytes(&mut nonce_bytes);
    let nonce = Nonce::from_slice(&nonce_bytes);

    let ct = cipher
        .encrypt(nonce, Payload { msg: plaintext, aad })
        .map_err(|_| CoreError::Decrypt)?; // encrypt only fails on absurd sizes

    let mut out = Vec::with_capacity(NONCE_LEN + ct.len());
    out.extend_from_slice(&nonce_bytes);
    out.extend_from_slice(&ct);
    Ok(out)
}

/// Inverse of [`seal`]. Fails closed on any tampering (GCM tag check) or a
/// truncated blob.
pub fn open(key: &[u8], blob: &[u8], aad: &[u8]) -> Result<Vec<u8>> {
    if blob.len() < NONCE_LEN {
        return Err(CoreError::Malformed("blob shorter than nonce".into()));
    }
    let cipher = cipher_from(key)?;
    let (nonce_bytes, ct) = blob.split_at(NONCE_LEN);
    let nonce = Nonce::from_slice(nonce_bytes);
    cipher
        .decrypt(nonce, Payload { msg: ct, aad })
        .map_err(|_| CoreError::Decrypt)
}

// ---- .ov file container -------------------------------------------------
// Format: "OVF1" | seal( u32_be(nameLen) | name | content ). The filename and
// type are inside the sealed blob, so the container leaks neither.

const OV_FILE_MAGIC: &[u8; 4] = b"OVF1";

pub fn encrypt_file(key: &[u8], content: &[u8], original_filename: &str) -> Result<Vec<u8>> {
    let name = original_filename.as_bytes();
    let mut plaintext = Vec::with_capacity(4 + name.len() + content.len());
    plaintext.extend_from_slice(&(name.len() as u32).to_be_bytes());
    plaintext.extend_from_slice(name);
    plaintext.extend_from_slice(content);

    let sealed = seal(key, &plaintext, OV_FILE_MAGIC)?;
    let mut out = Vec::with_capacity(4 + sealed.len());
    out.extend_from_slice(OV_FILE_MAGIC);
    out.extend_from_slice(&sealed);
    Ok(out)
}

pub struct DecryptedFile {
    pub content: Vec<u8>,
    pub original_filename: String,
}

pub fn decrypt_file(key: &[u8], ov_bytes: &[u8]) -> Result<DecryptedFile> {
    if ov_bytes.len() < 4 || &ov_bytes[..4] != OV_FILE_MAGIC {
        return Err(CoreError::Malformed("bad .ov magic".into()));
    }
    let plaintext = open(key, &ov_bytes[4..], OV_FILE_MAGIC)?;
    if plaintext.len() < 4 {
        return Err(CoreError::Malformed("truncated .ov plaintext".into()));
    }
    let name_len = u32::from_be_bytes([plaintext[0], plaintext[1], plaintext[2], plaintext[3]]) as usize;
    if plaintext.len() < 4 + name_len {
        return Err(CoreError::Malformed("bad .ov name length".into()));
    }
    let original_filename = String::from_utf8_lossy(&plaintext[4..4 + name_len]).into_owned();
    let content = plaintext[4 + name_len..].to_vec();
    Ok(DecryptedFile { content, original_filename })
}

#[cfg(test)]
mod tests {
    use super::*;

    #[test]
    fn roundtrip() {
        let key = [7u8; 32];
        let ct = seal(&key, b"salut, ca va? accents: eaui", b"ctx").unwrap();
        let pt = open(&key, &ct, b"ctx").unwrap();
        assert_eq!(pt, b"salut, ca va? accents: eaui");
    }

    #[test]
    fn nonce_is_unique_per_call() {
        // The old streamCipher reused keystream on msgIndex collision. GCM here
        // must produce distinct ciphertexts for identical plaintext.
        let key = [1u8; 32];
        let a = seal(&key, b"same", b"").unwrap();
        let b = seal(&key, b"same", b"").unwrap();
        assert_ne!(a, b, "identical plaintext must not yield identical ciphertext");
    }

    #[test]
    fn tamper_is_rejected() {
        let key = [9u8; 32];
        let mut ct = seal(&key, b"secret", b"").unwrap();
        let last = ct.len() - 1;
        ct[last] ^= 0x01; // flip one bit of the tag
        assert!(open(&key, &ct, b"").is_err());
    }

    #[test]
    fn wrong_aad_is_rejected() {
        let key = [3u8; 32];
        let ct = seal(&key, b"secret", b"ctxA").unwrap();
        assert!(open(&key, &ct, b"ctxB").is_err());
    }

    #[test]
    fn wrong_key_len_errors() {
        assert!(seal(&[0u8; 16], b"x", b"").is_err());
    }

    #[test]
    fn file_container_roundtrip_and_hides_name() {
        let key = [42u8; 32];
        let ov = encrypt_file(&key, b"file body", "secret_photo.jpg").unwrap();
        // filename must not appear in the container
        assert!(!ov.windows(6).any(|w| w == b"secret"));
        let dec = decrypt_file(&key, &ov).unwrap();
        assert_eq!(dec.content, b"file body");
        assert_eq!(dec.original_filename, "secret_photo.jpg");
    }

    // ---- exhaustive "any file type reconstructs byte-exact" E2E ----------

    fn rt_file(key: &[u8; 32], content: &[u8], name: &str) {
        let ov = encrypt_file(key, content, name).unwrap();
        assert_eq!(&ov[..4], OV_FILE_MAGIC, "container must start with magic");
        let dec = decrypt_file(key, &ov).unwrap();
        assert_eq!(dec.content, content, "content not byte-exact ({} bytes)", content.len());
        assert_eq!(dec.original_filename, name, "filename not reconstructed");
    }

    // deterministic pseudo-random fill (LCG) so large tests stay reproducible
    fn fill(n: usize, seed: u32) -> Vec<u8> {
        let mut x = seed;
        (0..n).map(|_| { x = x.wrapping_mul(1664525).wrapping_add(1013904223); (x >> 24) as u8 }).collect()
    }

    #[test]
    fn file_every_byte_value_and_sizes() {
        let key = [5u8; 32];
        // full 0x00..=0xFF coverage, repeated — proves no byte value is special
        let all: Vec<u8> = (0..=255u8).cycle().take(4096).collect();
        rt_file(&key, &all, "bin.dat");
        for n in [0usize, 1, 2, 15, 16, 17, 255, 256, 1000] {
            rt_file(&key, &fill(n, 0xDEADBEEF ^ n as u32), "sized.bin");
        }
    }

    #[test]
    fn file_large_2mb() {
        // 2 MB binary — a photo/short video — reconstructs exactly
        rt_file(&[8u8; 32], &fill(2 * 1024 * 1024, 0x9E3779B9), "big.mp4");
    }

    #[test]
    fn file_real_type_signatures_reconstruct() {
        // real magic headers: any format is just bytes to the cipher
        let key = [11u8; 32];
        rt_file(&key, &[0x89, 0x50, 0x4E, 0x47, 0x0D, 0x0A, 0x1A, 0x0A, 1, 2, 3], "img.png");
        rt_file(&key, &[0xFF, 0xD8, 0xFF, 0xE0, 4, 5, 6, 7], "img.jpg");
        rt_file(&key, b"%PDF-1.7\n1 0 obj\n<<>>\n%%EOF", "doc.pdf");
        rt_file(&key, &[0x50, 0x4B, 0x03, 0x04, 8, 9, 10], "archive.zip");
        rt_file(&key, &[0x00, 0x00, 0x00, 0x18, 0x66, 0x74, 0x79, 0x70], "clip.mp4");
        rt_file(&key, &[0x1F, 0x8B, 0x08, 0x00], "log.gz");
        rt_file(&key, &fill(65536, 7), "voice.opus");
    }

    #[test]
    fn file_content_embedding_magic_is_safe() {
        // content that itself contains the framing magic must not confuse parsing
        rt_file(&[12u8; 32], b"OVF1OVF1 header-like bytes OVF1 trailing", "tricky.bin");
    }

    #[test]
    fn file_unicode_and_edge_filenames() {
        let key = [13u8; 32];
        rt_file(&key, b"data", "reçu_2024_€.pdf");
        rt_file(&key, b"data", "photo 📸 vacances.jpg");
        rt_file(&key, b"data", ""); // empty name
        rt_file(&key, b"data", &"a".repeat(1024)); // very long name
    }

    #[test]
    fn file_wrong_key_and_truncation_fail_closed() {
        let ov = encrypt_file(&[1u8; 32], b"secret body", "x.bin").unwrap();
        assert!(decrypt_file(&[2u8; 32], &ov).is_err(), "wrong key must fail");
        assert!(decrypt_file(&[1u8; 32], &ov[..ov.len() - 1]).is_err(), "truncation must fail");
        let mut flipped = ov.clone();
        let i = flipped.len() - 1;
        flipped[i] ^= 0x01;
        assert!(decrypt_file(&[1u8; 32], &flipped).is_err(), "tamper must fail");
    }

    #[test]
    fn message_edge_cases_roundtrip() {
        let key = [4u8; 32];
        let big = fill(100_000, 1);
        let cases: [&[u8]; 4] = [b"", "éàü emoji 🚀🔒 accents".as_bytes(), &[0u8; 64], big.as_slice()];
        for m in cases {
            let ct = seal(&key, m, b"aad").unwrap();
            assert_eq!(open(&key, &ct, b"aad").unwrap(), m);
        }
    }
}
