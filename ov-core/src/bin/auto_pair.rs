/// Auto-pairing harness: generates an OVPK:I SMS, injects it via ADB,
/// watches logcat/sms for iSecure's reply, completes the pairing, and
/// optionally decodes an OV36 message.
use std::process::Command;
use std::thread;
use std::time::Duration;

fn main() {
    println!("=== AUTO-PAIR HARNESS ===");
    println!("Step 1: Generating initiator keypair (simulating OV Message)...");

    // Generate the OVPK:I SMS (initiator side)
    let a = ov_core::ffi::start_pairing_a();
    let ovpk_sms = &a.sms;
    let keypair_hex = &a.keypair_hex;

    println!("  OVPK SMS length: {} chars", ovpk_sms.len());
    println!("  Keypair saved.");

    // Inject the SMS into the phone
    println!("\nStep 2: Injecting OVPK:I SMS into phone via ADB...");
    
    // We need to get the phone number from the contact in iSecure
    // For testing, we'll use a dummy sender number
    let sender = "+33600000000";  // fake OV sender
    
    // Use adb to inject the SMS  
    let inject = Command::new("adb")
        .args(["shell", "am", "broadcast",
            "-a", "android.provider.Telephony.SMS_RECEIVED",
            "--es", "sender", sender,
            "--es", "body", ovpk_sms,
            "-n", "com.raphael.isecure.dev/com.ov.message.SmsReceiver",
        ])
        .output();

    match inject {
        Ok(o) => println!("  ADB inject result: {}", String::from_utf8_lossy(&o.stdout)),
        Err(e) => println!("  ADB inject failed: {}", e),
    }

    // Also try inserting into content://sms
    let body_escaped = ovpk_sms.replace('\'', "'\\''");
    let insert_cmd = format!(
        "content insert --uri content://sms/inbox --bind address:s:{} --bind body:s:'{}' --bind read:i:0",
        sender, body_escaped
    );
    let _ = Command::new("adb")
        .args(["shell", &insert_cmd])
        .output();

    println!("  SMS injected. Waiting for iSecure to process...");
    
    // Wait and poll logcat for the response
    println!("\nStep 3: Watching for iSecure's reply SMS...");
    
    for i in 0..30 {
        thread::sleep(Duration::from_secs(2));
        
        // Check logcat for any OVPK:R or OVB response
        let log = Command::new("adb")
            .args(["logcat", "-d", "-v", "raw", "-s", "ReactNativeJS:*"])
            .output();
        
        if let Ok(o) = log {
            let output = String::from_utf8_lossy(&o.stdout);
            for line in output.lines() {
                if line.contains("OVPK:") || line.contains("OVB:") || line.contains("Incoming SMS") || line.contains("CALIBRATION") {
                    println!("  [LOG] {}", line);
                }
            }
        }
        
        // Also check sent SMS
        let sms_check = Command::new("adb")
            .args(["shell", "content", "query", "--uri", "content://sms/sent",
                   "--projection", "body", "--sort", "date DESC LIMIT 3"])
            .output();
        
        if let Ok(o) = sms_check {
            let output = String::from_utf8_lossy(&o.stdout);
            for line in output.lines() {
                if line.contains("OVPK:") && line.contains(":R:") {
                    let body = line.split("body=").nth(1).unwrap_or("").trim();
                    println!("\n  ✅ Found iSecure's reply: {}...", &body[..80.min(body.len())]);
                    
                    // Complete the pairing
                    println!("\nStep 4: Completing pairing (initiator side)...");
                    match ov_core::ffi::complete_pairing_a(keypair_hex.clone(), body.to_string()) {
                        Ok(res) => {
                            println!("  ✅ PAIRING SUCCESS!");
                            println!("  SAS code: {}", res.sas);
                            println!("  Shared key: {}...{}", &res.shared_key_hex[..8], &res.shared_key_hex[res.shared_key_hex.len()-8..]);
                        }
                        Err(e) => println!("  ❌ Pairing completion failed: {:?}", e),
                    }
                    return;
                }
                if line.contains("OVB:A:") {
                    println!("  Found OVB:A response from iSecure (announce mode)");
                }
            }
        }
        
        print!("  Waiting... ({}/30)\r", i + 1);
    }
    
    println!("\n  ⏰ Timeout - no reply from iSecure after 60s");
    println!("  Check that iSecure is open with the pairing modal armed.");
}
