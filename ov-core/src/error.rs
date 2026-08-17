use thiserror::Error;

/// All fallible core operations funnel through this. FFI maps it to a thrown
/// exception on the mobile side.
#[derive(Debug, Error)]
pub enum CoreError {
    #[error("decryption failed: authentication tag mismatch or corrupt data")]
    Decrypt,
    #[error("invalid key length: expected {expected} bytes, got {got}")]
    KeyLen { expected: usize, got: usize },
    #[error("malformed payload: {0}")]
    Malformed(String),
    #[error("hex decode error: {0}")]
    Hex(String),
    #[error("kem error: {0}")]
    Kem(String),
    #[error("kdf error: {0}")]
    Kdf(String),
}

impl From<hex::FromHexError> for CoreError {
    fn from(e: hex::FromHexError) -> Self {
        CoreError::Hex(e.to_string())
    }
}

pub type Result<T> = std::result::Result<T, CoreError>;
