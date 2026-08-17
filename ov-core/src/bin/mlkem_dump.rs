//! Dump an ML-KEM-768 keypair + encaps output to cross-check RustCrypto vs noble.
use ml_kem::{KemCore, MlKem768, EncodedSizeUser};
use ml_kem::kem::{Encapsulate, Decapsulate};
use rand_core::OsRng;
fn hex(b: &[u8]) -> String { b.iter().map(|x| format!("{x:02x}")).collect() }
fn main() {
    let (dk, ek) = MlKem768::generate(&mut OsRng);
    let (ct, ss) = ek.encapsulate(&mut OsRng).unwrap();
    let ss2 = dk.decapsulate(&ct).unwrap(); // self round-trip sanity
    println!("EK={}", hex(ek.as_bytes().as_slice()));
    println!("DK={}", hex(dk.as_bytes().as_slice()));
    println!("CT={}", hex(ct.as_slice()));
    println!("SS={}", hex(ss.as_slice()));
    println!("SS_selfdecaps={}", hex(ss2.as_slice()));
}
