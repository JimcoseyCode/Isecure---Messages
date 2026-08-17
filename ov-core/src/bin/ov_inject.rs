use ov_core::kem::HybridKeyPair;
use ov_core::ovcompat;

fn main() {
    // 1. Generate keypair (simulating OV Message initiator)
    let kp = HybridKeyPair::generate();
    let mut payload = kp.mlkem_public_bytes();
    payload.extend_from_slice(&kp.x25519_public_bytes());
    let b64 = base64::Engine::encode(&base64::engine::general_purpose::STANDARD, &payload);
    let session = "T1";
    let ovpk_i = format!("OVPK:{}:I:{}", session, b64);
    
    // 2. Test hybrid_respond locally 
    let resp = ovcompat::hybrid_respond(&ovpk_i).expect("hybrid_respond failed");
    eprintln!("✅ Local test: hybrid_respond OK, SAS={}", resp.sas);
    eprintln!("   Contact key: {}...{}", &resp.contact_key_hex[..16], &resp.contact_key_hex[resp.contact_key_hex.len().min(16)..]);
    
    // 3. Output the OVPK:I for injection
    println!("{}", ovpk_i);
    
    // Save keypair for later completion
    let kp_hex = hex::encode(kp.to_bytes());
    std::fs::write("/tmp/ov_keypair.hex", &kp_hex).ok();
    std::fs::write("/tmp/ov_session.txt", session).ok();
    eprintln!("   Keypair saved to /tmp/ov_keypair.hex");
}
