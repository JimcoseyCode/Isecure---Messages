//! The KEM combine + inputs are CONFIRMED correct (noble 0.6.1 hybrid.js line 547
//! + RustCrypto ml-kem == noble ml_kem768 cross-check). So the SAS mismatch lives
//! ONLY in OV's post-KEM derive. Bundle string table exposes the real labels:
//!   OV_PQHybrid_Salt_v1, OV_PQHybrid_ContactKey_v1, OV_PQHybrid_SAS_v1,
//!   OV_VERIFY_v1 (NEW), hybrid_prk, OV_MSG_MAC_v1, OV_KeyPool_AES256_v1.
//! Brute-force the derive step against G4BM target 350E6E63A652.

use hmac::{Hmac, Mac};
use sha2::{Digest, Sha256};

fn hx(s: &str) -> Vec<u8> {
    (0..s.len()).step_by(2).map(|i| u8::from_str_radix(&s[i..i + 2], 16).unwrap()).collect()
}
fn hmac(key: &[u8], data: &[u8]) -> [u8; 32] {
    let mut m = <Hmac<Sha256>>::new_from_slice(key).unwrap();
    Mac::update(&mut m, data);
    m.finalize().into_bytes().into()
}
fn hexs(b: &[u8]) -> String { b.iter().map(|x| format!("{x:02x}")).collect() }

// HKDF-Expand SHA256
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

fn sas12(bytes6: &[u8]) -> String { bytes6[..6].iter().map(|b| format!("{b:02X}")).collect() }

fn main() {
    let target = "350E6E63A652";

    // ---- confirmed KitchenSink combine (noble 0.6.1) ----
    let ss_pq = hx("fd7dfab2f10a2e16e0c20135c187ad0b18c4bc54a6b71197cd19eeb1ea01bc11");
    let ss_ec = hx("96beb64dcdd4ebd732edc97dab6f87e80ce2277540b85dcc86a16480c4be4837");
    let ct_full = hx(include_str!("g4bm_ct.hex").trim());
    let ct_pq = &ct_full[..1088];
    let ct_ec = &ct_full[1088..];
    let pk_pq = hx(include_str!("g4bm_pkpq.hex").trim());
    let pk_ec = hx("b3f1973ab6e7a1ad35360345e3b19bbbcfa810f5e136719579e509b814e7fb57");
    let label = b"KitchenSink-KEM(ML-KEM-768,X25519)-XOF(SHAKE256)-KDF(HKDF-SHA-256)";

    let mut pre = Vec::new();
    pre.extend_from_slice(&ss_pq); pre.extend_from_slice(&ss_ec);
    pre.extend_from_slice(ct_pq);  pre.extend_from_slice(&pk_pq);
    pre.extend_from_slice(ct_ec);  pre.extend_from_slice(&pk_ec);
    pre.extend_from_slice(label);
    let mut ikm = b"hybrid_prk".to_vec();
    ikm.extend_from_slice(&pre);
    let prk_kem = hmac(&[0u8; 32], &ikm);
    let mut info = vec![0x00u8, 0x20];
    info.extend_from_slice(b"shared_secret");
    let shared_ks = expand(&prk_kem, &info, 32);
    println!("KitchenSink sharedSecret = {}", hexs(&shared_ks));

    // ml_kem768_x25519 (XWing-style) combiner: sha3_256(ss0||ss1||ct1||pk1||"\.//^\")
    let mut xw = Vec::new();
    xw.extend_from_slice(&ss_pq); xw.extend_from_slice(&ss_ec);
    xw.extend_from_slice(ct_ec);  xw.extend_from_slice(&pk_ec);
    xw.extend_from_slice(&[0x5c, 0x2e, 0x2f, 0x2f, 0x5e, 0x5c]); // \.//^\
    let shared_xw = <sha3::Sha3_256 as sha3::Digest>::digest(&xw).to_vec();
    println!("XWing sharedSecret       = {}", hexs(&shared_xw));

    for (which, shared) in [("KitchenSink", shared_ks.clone()), ("XWing-sha3", shared_xw.clone())] {
        println!("\n########## trying derive on {which} sharedSecret ##########");
        if run_derive(&shared, target) { return; }
    }
    println!("\nNO MATCH on either preset");
}

fn run_derive(shared: &[u8], target: &str) -> bool {

    // ---- derive-step brute force ----
    let salts: Vec<(&str, Vec<u8>)> = vec![
        ("sha256(Salt)", Sha256::digest(b"OV_PQHybrid_Salt_v1").to_vec()),
        ("raw Salt", b"OV_PQHybrid_Salt_v1".to_vec()),
        ("zeros32", vec![0u8; 32]),
        ("empty", vec![]),
    ];
    let ck_labels = ["OV_PQHybrid_ContactKey_v1"];
    let sas_labels = ["OV_VERIFY_v1", "OV_PQHybrid_SAS_v1", "OV_PQHybrid_Verify_v1"];
    let counters: Vec<(&str, Vec<u8>)> = vec![
        ("+01", vec![1]), ("+00", vec![0]), ("none", vec![]),
    ];

    let mut tries = 0u64;
    let mut check = |name: String, out6: &[u8]| -> bool {
        let s = sas12(out6);
        if s == target {
            println!("\n🎯 MATCH via: {name}\n   SAS={s}");
            true
        } else { false }
    };

    for (sn, salt) in &salts {
        // prk = HMAC(salt, shared)  (= HKDF-Extract)
        let prk = hmac(salt, shared);
        for (ckn, cklab) in ck_labels.iter().enumerate() {
            let _ = ckn;
            for (cctn, cctr) in &counters {
                // contactKey candidates (32B) and its hex form
                let mut ckinfo = cklab.as_bytes().to_vec(); ckinfo.extend_from_slice(cctr);
                let ck_hmac = hmac(&prk, &ckinfo);                 // HMAC(prk, label|ctr)
                let ck_hkdf = expand(&prk, &ckinfo, 32);           // HKDF-Expand(prk, label|ctr)
                for (ck_name, ck) in [("ckHMAC", ck_hmac.to_vec()), ("ckHKDF", ck_hkdf.clone())] {
                    let ck_hex = hexs(&ck);
                    for slab in &sas_labels {
                        for (scn, sctr) in &counters {
                            let mut sinfo = slab.as_bytes().to_vec(); sinfo.extend_from_slice(sctr);
                            // keys to try for the SAS PRF
                            let keys: Vec<(&str, &[u8])> = vec![
                                ("prk", &prk),
                                ("shared", &shared),
                                ("ckRaw", &ck),
                                ("ckHex", ck_hex.as_bytes()),
                            ];
                            for (kn, key) in &keys {
                                tries += 4;
                                // a) HMAC(key, sinfo)[:6]
                                let a = hmac(key, &sinfo);
                                if check(format!("salt={sn} ck={ck_name}{cctn} HMAC(key={kn}, {slab}{scn})[:6]"), &a) { return true; }
                                // b) HKDF-Expand(key, sinfo, 6)
                                let b = expand(key, &sinfo, 6);
                                if check(format!("salt={sn} ck={ck_name}{cctn} HKDF(key={kn}, {slab}{scn})[:6]"), &b) { return true; }
                                // c) SHA256(key || sinfo)[:6]
                                let mut h = Sha256::new(); h.update(key); h.update(&sinfo);
                                if check(format!("salt={sn} ck={ck_name}{cctn} SHA256(key={kn} || {slab}{scn})[:6]"), &h.finalize()) { return true; }
                                // d) SHA256(sinfo || key)[:6]
                                let mut h2 = Sha256::new(); h2.update(&sinfo); h2.update(key);
                                if check(format!("salt={sn} ck={ck_name}{cctn} SHA256({slab}{scn} || key={kn})[:6]"), &h2.finalize()) { return true; }
                            }
                        }
                    }
                }
            }
        }
    }
    // Also: SAS straight from shared with no contactKey layer, HMAC(prk, sha) style already covered.
    println!("  ({tries} derive variants, no match)");
    false
}
