//! # ov-core
//!
//! Cryptographic + protocol core for OV Message. Every primitive is a vetted
//! RustCrypto (or dalek) implementation — there is deliberately **no homemade
//! cipher, KDF, or MAC** here. The public surface is small and byte-oriented so
//! the same core drives the Android/iOS bindings and the host test suite.
//!
//! Modules:
//! * [`aead`]  — AES-256-GCM message + `.ov` file encryption
//! * [`kem`]   — X25519 + ML-KEM-768 hybrid pairing
//! * [`kdf`]   — Argon2id password hashing, HKDF key-pool, SAS
//! * [`error`] — unified error type

pub mod aead;
pub mod error;
pub mod kdf;
pub mod kem;
pub mod ov36;
pub mod ovcompat;
pub mod protocol;

pub use error::{CoreError, Result};

#[cfg(feature = "ffi")]
pub mod ffi;

#[cfg(feature = "ffi")]
uniffi::setup_scaffolding!();
