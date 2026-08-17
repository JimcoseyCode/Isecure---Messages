//! Hybrid post-quantum key agreement: **X25519 + ML-KEM-768**.
//!
//! The two shared secrets are folded together with SHA3-512, so the session
//! key is safe as long as *either* problem stays hard — a classical break of
//! X25519 or a quantum break of the elliptic curve is covered by ML-KEM, and a
//! flaw in the newer lattice scheme is covered by X25519.
//!
//! Only public keys travel over SMS; the private halves never leave the device.

use ml_kem::kem::{Decapsulate, Encapsulate};
use ml_kem::{Ciphertext, EncodedSizeUser, KemCore, MlKem768};
use rand_core::OsRng;
use sha3::{Digest, Sha3_512};
use x25519_dalek::{PublicKey, StaticSecret};

use crate::error::{CoreError, Result};

type MlEk = <MlKem768 as KemCore>::EncapsulationKey;
type MlDk = <MlKem768 as KemCore>::DecapsulationKey;

const X_PUB: usize = 32;
const X_SEC: usize = 32;

/// A device's long-lived-for-this-pairing key material. Serialized so the FFI
/// layer can persist it between the two handshake steps.
pub struct HybridKeyPair {
    x_secret: StaticSecret,
    x_public: PublicKey,
    ml_dk: MlDk,
    ml_ek: MlEk,
}

impl HybridKeyPair {
    pub fn generate() -> Self {
        let x_secret = StaticSecret::random_from_rng(OsRng);
        let x_public = PublicKey::from(&x_secret);
        let (ml_dk, ml_ek) = MlKem768::generate(&mut OsRng);
        Self { x_secret, x_public, ml_dk, ml_ek }
    }

    /// Public keys to put on the wire (party A's pairing request).
    pub fn public_bundle(&self) -> PublicBundle {
        PublicBundle {
            x25519_public: self.x_public.to_bytes().to_vec(),
            mlkem_public: self.ml_ek.as_bytes().to_vec(),
        }
    }

    /// Serialize secret material for storage between handshake steps.
    pub fn to_bytes(&self) -> Vec<u8> {
        let mut out = Vec::new();
        out.extend_from_slice(&self.x_secret.to_bytes());
        out.extend_from_slice(&self.ml_dk.as_bytes());
        out
    }

    /// Raw public keys (for the OV interop handshake, which exchanges bare pks).
    pub fn x25519_public_bytes(&self) -> [u8; 32] { self.x_public.to_bytes() }
    pub fn mlkem_public_bytes(&self) -> Vec<u8> { self.ml_ek.as_bytes().to_vec() }

    /// Raw X25519 Diffie–Hellman with a peer public key (no KDF).
    pub fn x25519_dh(&self, their_pub: &[u8]) -> Result<[u8; 32]> {
        let p = parse_x_public(their_pub)?;
        Ok(self.x_secret.diffie_hellman(&p).to_bytes())
    }

    /// Raw ML-KEM-768 decapsulation of a ciphertext -> 32-byte shared secret.
    pub fn mlkem_decapsulate(&self, ct: &[u8]) -> Result<[u8; 32]> {
        let c = Ciphertext::<MlKem768>::try_from(ct)
            .map_err(|_| CoreError::Malformed("bad ml-kem ciphertext".into()))?;
        let ss = self.ml_dk.decapsulate(&c).map_err(|_| CoreError::Kem("decapsulation failed".into()))?;
        let mut out = [0u8; 32];
        out.copy_from_slice(ss.as_slice());
        Ok(out)
    }

    pub fn from_bytes(bytes: &[u8]) -> Result<Self> {
        if bytes.len() < X_SEC {
            return Err(CoreError::Malformed("keypair blob too short".into()));
        }
        let mut xs = [0u8; X_SEC];
        xs.copy_from_slice(&bytes[..X_SEC]);
        let x_secret = StaticSecret::from(xs);
        let x_public = PublicKey::from(&x_secret);

        let dk_bytes = &bytes[X_SEC..];
        let dk_arr = ml_kem::Encoded::<MlDk>::try_from(dk_bytes)
            .map_err(|_| CoreError::Malformed("bad ml-kem dk length".into()))?;
        let ml_dk = MlDk::from_bytes(&dk_arr);
        let ml_ek = ml_dk.encapsulation_key().clone();

        Ok(Self { x_secret, x_public, ml_dk, ml_ek })
    }
}

/// Party A's public keys, or party B's public key inside the response.
pub struct PublicBundle {
    pub x25519_public: Vec<u8>,
    pub mlkem_public: Vec<u8>,
}

/// Party B's response back to A.
pub struct PairingResponse {
    pub x25519_public: Vec<u8>,
    pub mlkem_ciphertext: Vec<u8>,
}

fn combine(x_secret: &[u8], ml_secret: &[u8]) -> [u8; 32] {
    let mut h = Sha3_512::new();
    h.update(x_secret);
    h.update(ml_secret);
    h.update(b"OVMessage-v1-hybrid-key");
    let digest = h.finalize();
    let mut key = [0u8; 32];
    key.copy_from_slice(&digest[..32]);
    key
}

fn parse_x_public(bytes: &[u8]) -> Result<PublicKey> {
    if bytes.len() != X_PUB {
        return Err(CoreError::Malformed("bad x25519 public length".into()));
    }
    let mut b = [0u8; X_PUB];
    b.copy_from_slice(bytes);
    Ok(PublicKey::from(b))
}

fn parse_ml_ek(bytes: &[u8]) -> Result<MlEk> {
    let arr = ml_kem::Encoded::<MlEk>::try_from(bytes)
        .map_err(|_| CoreError::Malformed("bad ml-kem ek length".into()))?;
    Ok(MlEk::from_bytes(&arr))
}

/// **Party B**: given B's keypair and A's public bundle, produce the shared key
/// and the response to send back to A.
pub fn respond_as_b(kp_b: &HybridKeyPair, a: &PublicBundle) -> Result<([u8; 32], PairingResponse)> {
    let a_x_pub = parse_x_public(&a.x25519_public)?;
    let a_ml_ek = parse_ml_ek(&a.mlkem_public)?;

    let x_shared = kp_b.x_secret.diffie_hellman(&a_x_pub);
    let (ct, ml_shared) = a_ml_ek
        .encapsulate(&mut OsRng)
        .map_err(|_| CoreError::Kem("encapsulation failed".into()))?;

    let shared = combine(x_shared.as_bytes(), &ml_shared);
    let response = PairingResponse {
        x25519_public: kp_b.x_public.to_bytes().to_vec(),
        mlkem_ciphertext: ct.as_slice().to_vec(),
    };
    Ok((shared, response))
}

/// **Party A**: given A's keypair and B's response, complete the agreement.
pub fn complete_as_a(kp_a: &HybridKeyPair, resp: &PairingResponse) -> Result<[u8; 32]> {
    let b_x_pub = parse_x_public(&resp.x25519_public)?;
    let ct = Ciphertext::<MlKem768>::try_from(resp.mlkem_ciphertext.as_slice())
        .map_err(|_| CoreError::Malformed("bad ml-kem ciphertext length".into()))?;

    let x_shared = kp_a.x_secret.diffie_hellman(&b_x_pub);
    let ml_shared = kp_a
        .ml_dk
        .decapsulate(&ct)
        .map_err(|_| CoreError::Kem("decapsulation failed".into()))?;

    Ok(combine(x_shared.as_bytes(), &ml_shared))
}

#[cfg(test)]
mod tests {
    use super::*;

    #[test]
    fn both_parties_agree_on_shared_key() {
        let kp_a = HybridKeyPair::generate();
        let kp_b = HybridKeyPair::generate();

        let a_pub = kp_a.public_bundle();
        let (key_b, response) = respond_as_b(&kp_b, &a_pub).unwrap();
        let key_a = complete_as_a(&kp_a, &response).unwrap();

        assert_eq!(key_a, key_b, "A and B must derive the identical session key");
    }

    #[test]
    fn keypair_survives_serialization() {
        // A generates, persists, then reloads before processing B's response.
        let kp_a = HybridKeyPair::generate();
        let kp_b = HybridKeyPair::generate();
        let a_pub = kp_a.public_bundle();

        let stored = kp_a.to_bytes();
        let (key_b, response) = respond_as_b(&kp_b, &a_pub).unwrap();

        let kp_a_reloaded = HybridKeyPair::from_bytes(&stored).unwrap();
        let key_a = complete_as_a(&kp_a_reloaded, &response).unwrap();
        assert_eq!(key_a, key_b);
    }

    #[test]
    fn tampered_response_diverges() {
        let kp_a = HybridKeyPair::generate();
        let kp_b = HybridKeyPair::generate();
        let a_pub = kp_a.public_bundle();
        let (key_b, mut response) = respond_as_b(&kp_b, &a_pub).unwrap();
        response.x25519_public[0] ^= 0xff; // MITM swaps a key
        let key_a = complete_as_a(&kp_a, &response).unwrap();
        assert_ne!(key_a, key_b, "SAS over these keys would differ -> MITM caught");
    }
}
