/// Simulate OV Message initiating pairing: generate OVPK:I, inject via ADB,
/// then watch for iSecure's reply and complete the handshake.
use ov_core::ovcompat;
use ov_core::kem::HybridKeyPair;

fn main() {
    println!("=== SIMULATING OV MESSAGE PAIRING ===\n");

    // Step 1: Generate hybrid keypair (like OV Message does)
    println!("1. Generating ML-KEM-768 + X25519 keypair (simulating OV Message)...");
    let kp = HybridKeyPair::generate();
    let mlkem_pk = kp.mlkem_public_bytes();
    let x25519_pk = kp.x25519_public_bytes();

    // Build the OVPK:I SMS
    let session_id = "TEST";
    let mut payload = mlkem_pk.clone();
    payload.extend_from_slice(&x25519_pk);
    let b64_payload = base64::Engine::encode(&base64::engine::general_purpose::STANDARD, &payload);
    let ovpk_sms = format!("OVPK:{}:I:{}", session_id, b64_payload);

    println!("   OVPK:I SMS generated ({} chars)", ovpk_sms.len());
    println!("   Session: {}", session_id);

    // Step 2: Also test hybrid_respond directly (what iSecure should do)
    println!("\n2. Testing ovHybridRespond locally (same as iSecure would do)...");
    match ovcompat::hybrid_respond(&ovpk_sms) {
        Ok(out) => {
            println!("   ✅ hybrid_respond SUCCESS");
            println!("   SAS: {}", out.sas);
            println!("   Reply SMS: {}...{}", &out.reply_sms[..40], &out.reply_sms[out.reply_sms.len()-20..]);
            println!("   Contact key length: {} chars", out.contact_key_hex.len());
            
            // Now complete on the OV side (initiator finishes)
            println!("\n3. Completing pairing on initiator (OV) side...");
            match ovcompat::ov_pairing_finish_initiator(&kp, &out.reply_sms) {
                Ok((ck, sas)) => {
                    println!("   ✅ Initiator finish SUCCESS");
                    println!("   SAS: {}", sas);
                    println!("   Keys match: {}", ck == out.contact_key_hex);
                }
                Err(_) => {
                    // Try the alternate approach: parse reply and decapsulate
                    println!("   (ov_pairing_finish_initiator not available, using manual approach)");
                    let reply_body = out.reply_sms.strip_prefix("OVPK:").unwrap_or(&out.reply_sms);
                    let parts: Vec<&str> = reply_body.splitn(3, ':').collect();
                    if parts.len() >= 3 && parts[1] == "R" {
                        let ct_bytes = base64::Engine::decode(&base64::engine::general_purpose::STANDARD, parts[2]).unwrap();
                        println!("   Reply ciphertext: {} bytes", ct_bytes.len());
                    }
                }
            }
        }
        Err(e) => {
            println!("   ❌ hybrid_respond FAILED: {:?}", e);
        }
    }

    // Step 3: Test ovPairingAnnounce (the 2-step version)
    println!("\n4. Testing ovPairingAnnounce (2-step protocol)...");
    match ovcompat::pairing_announce(&ovpk_sms) {
        Ok(ann) => {
            println!("   ✅ pairing_announce SUCCESS");
            println!("   OVB:A SMS: {}...", &ann.ovb_a[..60.min(ann.ovb_a.len())]);
            println!("   State: {} bytes", ann.state_hex.len() / 2);
        }
        Err(e) => println!("   ❌ pairing_announce FAILED: {:?}", e),
    }

    // Step 4: Inject the OVPK:I into the phone
    println!("\n5. Injecting OVPK:I SMS into phone...");
    let sender = "+33612345678";
    
    // Write SMS to file to avoid shell escaping issues
    std::fs::write("/tmp/ovpk_sms.txt", &ovpk_sms).unwrap();
    
    // Insert directly into SMS inbox
    let insert = std::process::Command::new("adb")
        .args(["shell", &format!(
            "content insert --uri content://sms/inbox --bind address:s:{} --bind body:s:'{}' --bind read:i:0 --bind date:l:{}",
            sender,
            ovpk_sms.replace('\'', "'\\''"),
            std::time::SystemTime::now().duration_since(std::time::UNIX_EPOCH).unwrap().as_millis()
        )])
        .output();
    
    match insert {
        Ok(o) => {
            let out = String::from_utf8_lossy(&o.stdout);
            let err = String::from_utf8_lossy(&o.stderr);
            if err.is_empty() {
                println!("   ✅ SMS inserted into inbox");
            } else {
                println!("   Result: {} {}", out.trim(), err.trim());
            }
        }
        Err(e) => println!("   ❌ ADB failed: {}", e),
    }

    println!("\n   OVPK SMS saved to /tmp/ovpk_sms.txt");
    println!("   Keypair hex saved to /tmp/ovpk_keypair.txt");
    std::fs::write("/tmp/ovpk_keypair.txt", kp.to_bytes()).unwrap();

    println!("\n=== DONE ===");
    println!("Now open iSecure → contact → padlock → wait for it to pick up the SMS.");
    println!("Check logs with: adb logcat -s ReactNativeJS:*");
}
