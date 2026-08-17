//! Targeted brute-force of OV's KitchenSink combine around noble's real HKDF
//! structure, using the G4BM known-answer (SAS 350E6E63A652). Noble main's exact
//! formula gives 4AEEC1B95C68, so OV's build differs in one axis: element order,
//! per-share hashing (noble x25519kem may hash the DH output), the domain label,
//! the extract salt, or the ikm label prefix. Vary all of those.

use hmac::{Hmac, Mac};
use sha2::{Digest, Sha256};
use sha3::digest::{ExtendableOutput, XofReader};
use itertools::Itertools;

fn hx(s: &str) -> Vec<u8> {
    (0..s.len()).step_by(2).map(|i| u8::from_str_radix(&s[i..i + 2], 16).unwrap()).collect()
}
fn hmac(key: &[u8], data: &[u8]) -> [u8; 32] {
    let mut m = <Hmac<Sha256>>::new_from_slice(key).unwrap();
    Mac::update(&mut m, data);
    m.finalize().into_bytes().into()
}
fn shake(x: &[u8], n: usize) -> Vec<u8> {
    let mut h = sha3::Shake256::default();
    sha3::digest::Update::update(&mut h, x);
    let mut o = vec![0u8; n];
    h.finalize_xof().read(&mut o);
    o
}
fn sha256v(x: &[u8]) -> Vec<u8> { Sha256::digest(x).to_vec() }

fn sas(shared: &[u8]) -> String {
    let salt = Sha256::digest(b"OV_PQHybrid_Salt_v1");
    let prk = hmac(&salt, shared);
    let mut info = b"OV_PQHybrid_SAS_v1".to_vec();
    info.push(1);
    hmac(&prk, &info)[..6].iter().map(|b| format!("{b:02X}")).collect()
}
// HKDF-Expand (SHA-256)
fn expand(prk: &[u8], info: &[u8], len: usize) -> Vec<u8> {
    let mut out = Vec::new();
    let mut t: Vec<u8> = Vec::new();
    let mut c = 1u8;
    while out.len() < len {
        let mut m = <Hmac<Sha256>>::new_from_slice(prk).unwrap();
        Mac::update(&mut m, &t);
        Mac::update(&mut m, info);
        Mac::update(&mut m, &[c]);
        t = m.finalize().into_bytes().to_vec();
        out.extend_from_slice(&t);
        c += 1;
    }
    out.truncate(len);
    out
}

fn main() {
    let ss_pq = hx(&std::env::args().nth(1).unwrap());
    let ss_ec = hx(&std::env::args().nth(2).unwrap());
    let ct_pq = hx(&std::env::args().nth(3).unwrap());
    let ct_ec = hx(&std::env::args().nth(4).unwrap());
    let pk_pq = hx(&std::env::args().nth(5).unwrap());
    let pk_ec = hx(&std::env::args().nth(6).unwrap());
    let target = std::env::args().nth(7).unwrap().to_uppercase();

    // per-share transforms to try for the two shared secrets
    let xf = |v: &[u8], m: u8| -> Vec<u8> {
        match m { 0 => v.to_vec(), 1 => sha256v(v), 2 => shake(v, 32), 3 => shake(v, 64), _ => v.to_vec() }
    };
    let labels: Vec<&[u8]> = vec![
        b"KitchenSink-KEM(ML-KEM-768,X25519)-XOF(SHAKE256)-KDF(HKDF-SHA-256)",
        b"",
        b"hybrid_prk",
        b"OV_PQHybrid_v1",
    ];
    let info_std = { let mut v = vec![0u8, 0x20]; v.extend_from_slice(b"shared_secret"); v };
    let salts: Vec<Vec<u8>> = vec![vec![0u8; 32], vec![], b"OV_PQHybrid_Salt_v1".to_vec()];
    let prefixes: Vec<&[u8]> = vec![b"hybrid_prk", b""];

    let mut tries: u64 = 0;
    // For each hashing of ss_pq/ss_ec, build the six labelled elements, permute, add label + salt + prefix.
    for h_pq in 0u8..=3 {
        for h_ec in 0u8..=3 {
            let elems: Vec<Vec<u8>> = vec![
                xf(&ss_pq, h_pq), xf(&ss_ec, h_ec),
                ct_pq.clone(), ct_ec.clone(), pk_pq.clone(), pk_ec.clone(),
            ];
            let names = ["ss_pq", "ss_ec", "ct_pq", "ct_ec", "pk_pq", "pk_ec"];
            for perm in (0..6usize).permutations(6) {
                for lab in &labels {
                    for label_at_end in [true, false] {
                        for prefix in &prefixes {
                            let mut preimage = Vec::new();
                            if !label_at_end && !lab.is_empty() { preimage.extend_from_slice(lab); }
                            for &i in &perm { preimage.extend_from_slice(&elems[i]); }
                            if label_at_end && !lab.is_empty() { preimage.extend_from_slice(lab); }
                            let mut ikm = prefix.to_vec();
                            ikm.extend_from_slice(&preimage);
                            for salt in &salts {
                                tries += 1;
                                let prk = hmac(salt, &ikm);
                                let shared = expand(&prk, &info_std, 32);
                                if sas(&shared) == target {
                                    let ord: Vec<&str> = perm.iter().map(|&i| names[i]).collect();
                                    println!("MATCH after {tries}:");
                                    println!("  h_pq={h_pq} h_ec={h_ec} order={ord:?}");
                                    println!("  label={:?} label_at_end={label_at_end} prefix={:?} salt_len={}",
                                        String::from_utf8_lossy(lab), String::from_utf8_lossy(prefix), salt.len());
                                    let cksalt = Sha256::digest(b"OV_PQHybrid_Salt_v1");
                                    let ckprk = hmac(&cksalt, &shared);
                                    let mut cki = b"OV_PQHybrid_ContactKey_v1".to_vec(); cki.push(1);
                                    let ck = hmac(&ckprk, &cki);
                                    println!("  contactKey={}", ck.iter().map(|b| format!("{b:02x}")).collect::<String>());
                                    return;
                                }
                            }
                        }
                    }
                }
            }
        }
    }
    println!("NO MATCH after {tries}");
}
