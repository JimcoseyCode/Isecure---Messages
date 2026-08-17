//! End-to-end noble-compat test helper. Reads a hybrid publicKey hex (1216 =
//! mlkem_ek 1184 || x25519 32) on argv[1], runs ISecure's encapsulation exactly
//! like hybrid_respond, prints ct_hex + sharedSecret_hex (via the fixed combine).
use ml_kem::{EncodedSizeUser, KemCore, MlKem768, kem::Encapsulate};
use x25519_dalek::{PublicKey, StaticSecret};
use rand_core::OsRng;
use ov_core::ovcompat::kitchensink_combine;
fn hx(s:&str)->Vec<u8>{(0..s.len()).step_by(2).map(|i|u8::from_str_radix(&s[i..i+2],16).unwrap()).collect()}
fn hex(b:&[u8])->String{b.iter().map(|x|format!("{x:02x}")).collect()}
fn main(){
    let pk=hx(&std::env::args().nth(1).unwrap());
    let (ek_b,xp_b)=pk.split_at(1184);
    type Ek=<MlKem768 as KemCore>::EncapsulationKey;
    let arr=ml_kem::Encoded::<Ek>::try_from(ek_b).unwrap();
    let ek=Ek::from_bytes(&arr);
    let (ct_pq,ss_pq)=ek.encapsulate(&mut OsRng).unwrap();
    let eph=StaticSecret::random_from_rng(OsRng);
    let eph_pub=PublicKey::from(&eph);
    let mut xp=[0u8;32]; xp.copy_from_slice(xp_b);
    let ss_ec=eph.diffie_hellman(&PublicKey::from(xp)).to_bytes();
    let mut ct=ct_pq.as_slice().to_vec(); ct.extend_from_slice(eph_pub.as_bytes());
    let shared=kitchensink_combine(ss_pq.as_slice(),&ss_ec,eph_pub.as_bytes(),xp_b);
    println!("CT={}",hex(&ct));
    println!("SHARED={}",hex(&shared));
}
