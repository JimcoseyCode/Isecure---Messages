//! Calibrate against the FRESH consistent MVLV transcript (same session: iSecure's
//! logged ss/ct/pk + OV's displayed SAS). iSecure (noble-exact combine) = D392FD98C302,
//! OV = 46EC6B3DA890. Goal: find the combine/derive recipe that maps this transcript
//! to OV's SAS. If nothing matches even here, the ss inputs themselves differ.

use hmac::{Hmac, Mac};
use sha2::{Digest, Sha256};
use itertools::Itertools;

fn hx(s: &str) -> Vec<u8> {
    (0..s.len()).step_by(2).map(|i| u8::from_str_radix(&s[i..i + 2], 16).unwrap()).collect()
}
fn hmac(key: &[u8], data: &[u8]) -> [u8; 32] {
    let mut m = <Hmac<Sha256>>::new_from_slice(key).unwrap();
    Mac::update(&mut m, data);
    m.finalize().into_bytes().into()
}
fn hexs(b: &[u8]) -> String { b.iter().map(|x| format!("{x:02x}")).collect() }
fn expand(prk: &[u8], info: &[u8], len: usize) -> Vec<u8> {
    let mut out = Vec::new(); let mut t: Vec<u8> = Vec::new(); let mut c = 1u8;
    while out.len() < len {
        let mut m = <Hmac<Sha256>>::new_from_slice(prk).unwrap();
        Mac::update(&mut m, &t); Mac::update(&mut m, info); Mac::update(&mut m, &[c]);
        t = m.finalize().into_bytes().to_vec(); out.extend_from_slice(&t); c += 1;
    }
    out.truncate(len); out
}
fn sas12(b: &[u8]) -> String { b[..6].iter().map(|x| format!("{x:02X}")).collect() }

// full OV derive over a candidate sharedSecret, returns SAS (my current impl)
fn my_derive_sas(shared: &[u8]) -> String {
    let salt = Sha256::digest(b"OV_PQHybrid_Salt_v1");
    let prk = hmac(&salt, shared);
    let mut info = b"OV_PQHybrid_SAS_v1".to_vec(); info.push(1);
    sas12(&hmac(&prk, &info))
}

fn kitchensink(order: &[usize], elems: &[Vec<u8>], label: &[u8]) -> [u8; 32] {
    let mut ikm = b"hybrid_prk".to_vec();
    for &i in order { ikm.extend_from_slice(&elems[i]); }
    ikm.extend_from_slice(label);
    let prk = hmac(&[0u8; 32], &ikm);
    let mut info = vec![0x00u8, 0x20]; info.extend_from_slice(b"shared_secret");
    let mut out = [0u8; 32]; out.copy_from_slice(&expand(&prk, &info, 32)); out
}

fn main() {
    let target = "46EC6B3DA890";
    let iss    = "D392FD98C302";
    let ss_pq = hx("b2b37780befea69bd83abda662a5ff3bb3fd53dc40924906f21fdb1512ab2540");
    let ss_ec = hx("9a5da7dababdd573e9763e6a395f4c747e03665471f69e0f991b33a49fd20d6d");
    let ct_full = hx(include_str!("mvlv_ct.hex").trim());
    let ct_pq = ct_full[..1088].to_vec();
    let ct_ec = ct_full[1088..].to_vec();
    let pk_pq = hx(include_str!("mvlv_pkpq.hex").trim());
    let pk_ec = hx("79da36f580ac8a9741147f7cfa8143e9aacc675cd6028379071e23fdcd5acc6f");
    let label = b"KitchenSink-KEM(ML-KEM-768,X25519)-XOF(SHAKE256)-KDF(HKDF-SHA-256)";

    // noble order: ss_pq, ss_ec, ct_pq, pk_pq, ct_ec, pk_ec
    let names = ["ss_pq","ss_ec","ct_pq","pk_pq","ct_ec","pk_ec"];
    let elems = vec![ss_pq.clone(), ss_ec.clone(), ct_pq.clone(), pk_pq.clone(), ct_ec.clone(), pk_ec.clone()];
    let noble_order = [0,1,2,3,4,5];
    let shared_noble = kitchensink(&noble_order, &elems, label);
    println!("noble-exact sharedSecret = {}", hexs(&shared_noble));
    println!("noble-exact my-derive SAS = {}  (iSecure logged {})", my_derive_sas(&shared_noble), iss);
    println!("OV target                 = {}\n", target);

    // ---- PASS 1: derive brute on noble sharedSecret (OV derive may differ) ----
    let salts: Vec<(&str, Vec<u8>)> = vec![
        ("sha256(Salt)", Sha256::digest(b"OV_PQHybrid_Salt_v1").to_vec()),
        ("raw Salt", b"OV_PQHybrid_Salt_v1".to_vec()),
        ("zeros32", vec![0u8; 32]), ("empty", vec![]),
    ];
    let sas_labels = ["OV_VERIFY_v1","OV_PQHybrid_SAS_v1","OV_PQHybrid_Verify_v1","OV_PQHybrid_ContactKey_v1"];
    let counters: Vec<(&str, Vec<u8>)> = vec![("+01",vec![1]),("+00",vec![0]),("none",vec![])];
    let mut n1 = 0u64;
    for (sn, salt) in &salts {
        let prk = hmac(salt, &shared_noble);
        // contactKey (for ck-as-key)
        let mut cki = b"OV_PQHybrid_ContactKey_v1".to_vec(); cki.push(1);
        let ck = hmac(&prk, &cki); let ck_hex = hexs(&ck);
        for slab in &sas_labels {
            for (scn, sctr) in &counters {
                let mut si = slab.as_bytes().to_vec(); si.extend_from_slice(sctr);
                let keys: Vec<(&str,&[u8])> = vec![("prk",&prk),("shared",&shared_noble),("ckRaw",&ck),("ckHex",ck_hex.as_bytes())];
                for (kn,key) in &keys {
                    n1 += 3;
                    if sas12(&hmac(key,&si)) == target { println!("🎯 P1 HMAC(key={kn},{slab}{scn}) salt={sn}"); return; }
                    if sas12(&expand(key,&si,6)) == target { println!("🎯 P1 HKDF(key={kn},{slab}{scn}) salt={sn}"); return; }
                    let mut h=Sha256::new(); h.update(key); h.update(&si);
                    if sas12(&h.finalize()) == target { println!("🎯 P1 SHA256(key={kn}||{slab}{scn}) salt={sn}"); return; }
                }
            }
        }
    }
    println!("PASS1 (derive on noble ss): no match ({n1} variants)");

    // ---- PASS 2: combine element-order permutations, then MY derive ----
    let mut n2 = 0u64;
    for perm in (0..6usize).permutations(6) {
        let s = kitchensink(&perm, &elems, label);
        n2 += 1;
        if my_derive_sas(&s) == target {
            let ord: Vec<&str> = perm.iter().map(|&i| names[i]).collect();
            println!("🎯 P2 combine order {ord:?} + my-derive"); return;
        }
    }
    println!("PASS2 (combine perms + my derive): no match ({n2} perms)");

    // ---- PASS 3: does ANY combine perm reproduce iSecure's own D392? (sanity) ----
    for perm in (0..6usize).permutations(6) {
        let s = kitchensink(&perm, &elems, label);
        if my_derive_sas(&s) == iss {
            let ord: Vec<&str> = perm.iter().map(|&i| names[i]).collect();
            println!("(sanity) iSecure D392 reproduced by order {ord:?}"); break;
        }
    }
    println!("\nNO MATCH → OV's shared secret differs from iSecure's logged ss (input-level).");
}
