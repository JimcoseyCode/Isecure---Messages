//! Wide derive brute-force on the MVLV KitchenSink sharedSecret (6bebad2c…, proven
//! byte-identical to noble decapsulate) targeting OV's SAS 46EC6B3DA890. Combine is
//! confirmed; only OV's post-KEM SAS derivation is unknown. Try many hash families,
//! structures, labels, and slices.
use hmac::{Hmac, Mac};
use sha2::{Digest, Sha256, Sha512};
use sha3::{Sha3_256, Digest as _};
use sha3::digest::{ExtendableOutput, XofReader};

fn hx(s:&str)->Vec<u8>{(0..s.len()).step_by(2).map(|i|u8::from_str_radix(&s[i..i+2],16).unwrap()).collect()}
fn hmac256(k:&[u8],d:&[u8])->Vec<u8>{let mut m=<Hmac<Sha256>>::new_from_slice(k).unwrap();Mac::update(&mut m,d);m.finalize().into_bytes().to_vec()}
fn hmac512(k:&[u8],d:&[u8])->Vec<u8>{let mut m=<Hmac<Sha512>>::new_from_slice(k).unwrap();Mac::update(&mut m,d);m.finalize().into_bytes().to_vec()}
fn sha256v(d:&[u8])->Vec<u8>{Sha256::digest(d).to_vec()}
fn sha512v(d:&[u8])->Vec<u8>{Sha512::digest(d).to_vec()}
fn sha3v(d:&[u8])->Vec<u8>{Sha3_256::digest(d).to_vec()}
fn shakev(d:&[u8],n:usize)->Vec<u8>{let mut h=sha3::Shake256::default();sha3::digest::Update::update(&mut h,d);let mut o=vec![0u8;n];h.finalize_xof().read(&mut o);o}
fn hkdf256(salt:&[u8],ikm:&[u8],info:&[u8],n:usize)->Vec<u8>{
    let prk=hmac256(salt,ikm); let mut out=Vec::new(); let mut t=Vec::new(); let mut c=1u8;
    while out.len()<n{let mut m=<Hmac<Sha256>>::new_from_slice(&prk).unwrap();Mac::update(&mut m,&t);Mac::update(&mut m,info);Mac::update(&mut m,&[c]);t=m.finalize().into_bytes().to_vec();out.extend_from_slice(&t);c+=1;}
    out.truncate(n);out
}
fn hexs(b:&[u8])->String{b.iter().map(|x|format!("{x:02x}")).collect()}
fn up6(b:&[u8])->String{b[..6].iter().map(|x|format!("{x:02X}")).collect()}

fn main(){
    let target="46EC6B3DA890";
    // sharedSecret candidates from the MVLV consistent transcript
    let ks=hx("6bebad2cf8a542b13be3af1d5e4889c610533c3db331f418274ef130d6a478cd");
    let ss_pq=hx("b2b37780befea69bd83abda662a5ff3bb3fd53dc40924906f21fdb1512ab2540");
    let ss_ec=hx("9a5da7dababdd573e9763e6a395f4c747e03665471f69e0f991b33a49fd20d6d");
    let mut ss_cat=ss_pq.clone(); ss_cat.extend_from_slice(&ss_ec);
    let mut ss_cat2=ss_ec.clone(); ss_cat2.extend_from_slice(&ss_pq);
    // XWing-style sha3 combiners on the MVLV transcript
    let ct_full=hx(include_str!("mvlv_ct.hex").trim());
    let ct_pq=&ct_full[..1088]; let ct_ec=&ct_full[1088..];
    let pk_pq=hx(include_str!("mvlv_pkpq.hex").trim());
    let pk_ec=hx("79da36f580ac8a9741147f7cfa8143e9aacc675cd6028379071e23fdcd5acc6f");
    let lbl_xw:&[u8]=&[0x5c,0x2e,0x2f,0x2f,0x5e,0x5c]; // \.//^\
    let cat=|parts:&[&[u8]]|->Vec<u8>{let mut v=Vec::new();for p in parts{v.extend_from_slice(p);}v};
    let xw   = sha3v(&cat(&[&ss_pq,&ss_ec,ct_ec,&pk_ec,lbl_xw]));           // noble ml_kem768_x25519
    let xw_pq= sha3v(&cat(&[&ss_pq,&ss_ec,ct_pq,&pk_pq,lbl_xw]));           // pq halves instead
    let xw_all=sha3v(&cat(&[&ss_pq,&ss_ec,ct_pq,&pk_pq,ct_ec,&pk_ec,lbl_xw]));
    let xw_nolbl=sha3v(&cat(&[&ss_pq,&ss_ec,ct_ec,&pk_ec]));
    let shareds:Vec<(&str,Vec<u8>)>=vec![
        ("KS",ks.clone()),("ss_pq||ss_ec",ss_cat),("ss_ec||ss_pq",ss_cat2),
        ("XW",xw),("XW_pq",xw_pq),("XW_all",xw_all),("XW_nolbl",xw_nolbl)];

    let labels:Vec<&str>=vec!["OV_VERIFY_v1","OV_PQHybrid_SAS_v1","OV_PQHybrid_Verify_v1",
        "OV_PQHybrid_ContactKey_v1","OV_PQHybrid_Salt_v1","OV_MSG_MAC_v1",""];
    let salts_labels:Vec<&str>=vec!["OV_PQHybrid_Salt_v1"];
    let ctrs:Vec<Vec<u8>>=vec![vec![],vec![1],vec![0],vec![0,0,0,1]];

    let mut n=0u64;
    let mut hit=|recipe:String,out:&[u8]|->bool{ if up6(out)==target{println!("🎯 MATCH: {recipe}");true}else{false} };

    for (shn,shared) in &shareds {
        // salt variants
        let salt_variants:Vec<(String,Vec<u8>)>=salts_labels.iter().map(|s|(format!("sha256({s})"),sha256v(s.as_bytes()))).chain(
            vec![("zeros32".to_string(),vec![0u8;32]),("empty".to_string(),vec![]),
                 ("rawSalt".to_string(),b"OV_PQHybrid_Salt_v1".to_vec())]).collect();

        for (saltn,salt) in &salt_variants {
            // prk = HMAC(salt, shared)   (HKDF-Extract)
            let prk=hmac256(salt,shared);
            // contactKey candidates
            for ck_label in &["OV_PQHybrid_ContactKey_v1"] {
                for ck_ctr in &ctrs {
                    let mut cki=ck_label.as_bytes().to_vec(); cki.extend_from_slice(ck_ctr);
                    let ck_hmac=hmac256(&prk,&cki);
                    let ck_hkdf=hkdf256(salt,shared,&cki,32);
                    for (ckn,ck) in [("ckHMAC",&ck_hmac),("ckHKDF",&ck_hkdf)] {
                        let ck_hex=hexs(ck);
                        // keys to PRF the SAS with
                        let keys:Vec<(String,Vec<u8>)>=vec![
                            ("prk".into(),prk.clone()),("shared".into(),shared.clone()),
                            ("ckRaw".into(),ck.clone()),("ckHex".into(),ck_hex.into_bytes()),
                        ];
                        for slab in &labels {
                            for sctr in &ctrs {
                                let mut si=slab.as_bytes().to_vec(); si.extend_from_slice(sctr);
                                for (kn,key) in &keys {
                                    n+=8;
                                    let base=format!("sh={shn} salt={saltn} ck={ckn}{:?} key={kn} lab={slab} ctr={:?}",ck_ctr,sctr);
                                    if hit(format!("HMAC256 {base}"),&hmac256(key,&si)){return;}
                                    if hit(format!("HMAC512 {base}"),&hmac512(key,&si)){return;}
                                    if hit(format!("HKDF256 {base}"),&hkdf256(salt,key,&si,6)){return;}
                                    if hit(format!("SHA256(k||i) {base}"),&sha256v(&[&key[..],&si[..]].concat())){return;}
                                    if hit(format!("SHA512(k||i) {base}"),&sha512v(&[&key[..],&si[..]].concat())){return;}
                                    if hit(format!("SHA3(k||i) {base}"),&sha3v(&[&key[..],&si[..]].concat())){return;}
                                    if hit(format!("SHAKE(k||i) {base}"),&shakev(&[&key[..],&si[..]].concat(),6)){return;}
                                    if hit(format!("SHA256(i||k) {base}"),&sha256v(&[&si[..],&key[..]].concat())){return;}
                                }
                            }
                        }
                    }
                }
            }
        }
        // direct: SAS = first6 of shared / hash(shared)
        n+=5;
        if hit(format!("direct shared[:6] sh={shn}"),shared){return;}
        if hit(format!("SHA256(shared)[:6] sh={shn}"),&sha256v(shared)){return;}
        if hit(format!("SHA3(shared)[:6] sh={shn}"),&sha3v(shared)){return;}
        if hit(format!("SHAKE(shared)[:6] sh={shn}"),&shakev(shared,6)){return;}
        if hit(format!("SHA512(shared)[:6] sh={shn}"),&sha512v(shared)){return;}
    }
    println!("NO MATCH after {n} wide derive variants");
}
