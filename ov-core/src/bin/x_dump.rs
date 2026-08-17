use x25519_dalek::{StaticSecret, PublicKey};
use rand_core::OsRng;
fn hex(b:&[u8])->String{b.iter().map(|x|format!("{x:02x}")).collect()}
fn main(){
    let a = StaticSecret::random_from_rng(OsRng);
    let b = StaticSecret::random_from_rng(OsRng);
    let pa = PublicKey::from(&a); let pb = PublicKey::from(&b);
    let ss_ab = a.diffie_hellman(&pb).to_bytes();
    let ss_ba = b.diffie_hellman(&pa).to_bytes();
    println!("SKA={}", hex(a.to_bytes().as_slice()));
    println!("PKB={}", hex(pb.as_bytes()));
    println!("SS_AB={}", hex(&ss_ab));
    println!("SS_BA={}", hex(&ss_ba));
}
