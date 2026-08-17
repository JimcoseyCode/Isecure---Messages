//! Key derivation. Two jobs, two right tools:
//!
//! * **Password → key**: Argon2id (memory-hard). Replaces the old `sha3(x‖salt)`
//!   loop, which had zero memory cost and fell to GPU brute force.
//! * **Master secret → many sub-keys**: HKDF-SHA256. Used for the 500-key pool
//!   and per-purpose key separation.

use argon2::{Algorithm, Argon2, Params, Version};
use hkdf::Hkdf;
use rand_core::{OsRng, RngCore};
use sha2::Sha256;
use sha3::{Digest, Sha3_256};

use crate::error::{CoreError, Result};

// OV Message Argon2id params: 64 MiB, t=3, p=1, 32-byte output.
const ARGON_MEM_KIB: u32 = 64 * 1024;
const ARGON_TIME: u32 = 3;
const ARGON_LANES: u32 = 1;
const OUT_LEN: usize = 32;

pub struct DerivedKey {
    pub key: [u8; 32],
    pub salt: [u8; 32],
}

/// Derive a 32-byte key from a password. Pass `salt = None` to mint a fresh
/// random salt (first time); pass the stored salt to reproduce the key.
pub fn derive_from_password(password: &str, salt: Option<[u8; 32]>) -> Result<DerivedKey> {
    let salt = salt.unwrap_or_else(|| {
        let mut s = [0u8; 32];
        OsRng.fill_bytes(&mut s);
        s
    });
    let params = Params::new(ARGON_MEM_KIB, ARGON_TIME, ARGON_LANES, Some(OUT_LEN))
        .map_err(|e| CoreError::Kdf(e.to_string()))?;
    let argon = Argon2::new(Algorithm::Argon2id, Version::V0x13, params);
    let mut key = [0u8; 32];
    argon
        .hash_password_into(password.as_bytes(), &salt, &mut key)
        .map_err(|e| CoreError::Kdf(e.to_string()))?;
    Ok(DerivedKey { key, salt })
}

/// Derive `count` independent 32-byte sub-keys from a master secret via HKDF.
/// Deterministic: same master + same index always yields the same sub-key, so
/// both peers derive an identical pool without exchanging it.
pub fn derive_key_pool(master: &[u8], count: u32) -> Vec<[u8; 32]> {
    let hk = Hkdf::<Sha256>::new(Some(b"OVPool-v1"), master);
    (0..count)
        .map(|i| {
            let mut okm = [0u8; 32];
            let info = [b"pool".as_slice(), &i.to_be_bytes()].concat();
            // expand only fails for absurd output lengths; 32 bytes never does.
            hk.expand(&info, &mut okm).expect("hkdf expand 32B");
            okm
        })
        .collect()
}

/// Short Authentication String for out-of-band (voice) verification after
/// pairing. 12 uppercase hex chars over the agreed shared key — if a MITM
/// swapped a public key, the two peers compute different SAS.
pub fn derive_sas(shared_key: &[u8]) -> String {
    let mut h = Sha3_256::new();
    h.update(shared_key);
    h.update(b"OVMessage-v1-sas");
    let digest = h.finalize();
    hex::encode_upper(&digest[..6]) // 6 bytes -> 12 hex chars
}

#[cfg(test)]
mod tests {
    use super::*;

    #[test]
    fn password_is_deterministic_with_salt() {
        let a = derive_from_password("hunter2", None).unwrap();
        let b = derive_from_password("hunter2", Some(a.salt)).unwrap();
        assert_eq!(a.key, b.key);
    }

    #[test]
    fn different_password_different_key() {
        let a = derive_from_password("hunter2", None).unwrap();
        let b = derive_from_password("hunter3", Some(a.salt)).unwrap();
        assert_ne!(a.key, b.key);
    }

    #[test]
    fn pool_is_deterministic_and_distinct() {
        let master = [5u8; 32];
        let p1 = derive_key_pool(&master, 500);
        let p2 = derive_key_pool(&master, 500);
        assert_eq!(p1, p2, "same master must reproduce the pool");
        assert_eq!(p1.len(), 500);
        assert_ne!(p1[0], p1[1], "sub-keys must differ");
        assert_ne!(p1[0], p1[499]);
    }

    #[test]
    fn sas_is_12_hex_and_key_sensitive() {
        let s1 = derive_sas(&[1u8; 32]);
        let s2 = derive_sas(&[2u8; 32]);
        assert_eq!(s1.len(), 12);
        assert!(s1.chars().all(|c| c.is_ascii_hexdigit() && !c.is_ascii_lowercase()));
        assert_ne!(s1, s2);
    }
}
