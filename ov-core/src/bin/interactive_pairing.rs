use std::io::{self, Read};
use serde::Deserialize;
use ov_core::ffi::{start_pairing_a, respond_pairing_b, complete_pairing_a};

#[derive(Deserialize)]
struct Input {
    action: String,
    a_sms: Option<String>,
    b_sms: Option<String>,
    keypair_hex: Option<String>,
    ss_pq: Option<String>,
    ss_ec: Option<String>,
    ct_ec: Option<String>,
    pk_ec: Option<String>,
}

fn main() {
    let mut input_data = String::new();
    io::stdin().read_to_string(&mut input_data).unwrap();
    let input: Input = serde_json::from_str(&input_data).expect("Invalid JSON");

    match input.action.as_str() {
        "start_a" => {
            let res = start_pairing_a();
            println!(r#"{{"keypair_hex": "{}", "sms": "{}"}}"#, res.keypair_hex, res.sms);
        }
        "respond_b" => {
            if let Some(sms) = input.a_sms {
                match respond_pairing_b(sms) {
                    Ok(res) => println!(r#"{{"shared_key_hex": "{}", "sms": "{}", "sas": "{}"}}"#, res.shared_key_hex, res.sms.unwrap_or_default(), res.sas),
                    Err(e) => println!(r#"{{"error": "{:?}"}}"#, e),
                }
            }
        }
        "complete_a" => {
            if let (Some(kp), Some(sms)) = (input.keypair_hex, input.b_sms) {
                match complete_pairing_a(kp, sms) {
                    Ok(res) => println!(r#"{{"shared_key_hex": "{}", "sas": "{}"}}"#, res.shared_key_hex, res.sas),
                    Err(e) => println!(r#"{{"error": "{:?}"}}"#, e),
                }
            }
        }
        "combine" => {
            if let (Some(sspq), Some(ssec), Some(ctec), Some(pkec)) = (input.ss_pq, input.ss_ec, input.ct_ec, input.pk_ec) {
                let ss_pq = hex::decode(sspq).unwrap_or_default();
                let ss_ec = hex::decode(ssec).unwrap_or_default();
                let ct_ec = hex::decode(ctec).unwrap_or_default();
                let pk_ec = hex::decode(pkec).unwrap_or_default();
                
                let shared = ov_core::ovcompat::kitchensink_combine(&ss_pq, &ss_ec, &ct_ec, &pk_ec);
                let (ck, sas) = ov_core::ovcompat::derive_from_shared_secret(&shared);
                println!(r#"{{"sas": "{}"}}"#, sas);
            } else {
                println!(r#"{{"error": "Missing parameters"}}"#);
            }
        }
        _ => println!(r#"{{"error": "Unknown action"}}"#),
    }
}
