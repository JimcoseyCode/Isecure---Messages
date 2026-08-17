use ov_core::ffi::{start_pairing_a, respond_pairing_b, complete_pairing_a};

fn main() {
    let a_init = start_pairing_a();
    let b_res = respond_pairing_b(a_init.sms.clone()).unwrap();
    let a_res = complete_pairing_a(a_init.keypair_hex.clone(), b_res.sms.clone().unwrap()).unwrap();

    let json = format!(r#"{{
  "partyA": {{
    "sms": "{}",
    "sas": "{}"
  }},
  "partyB": {{
    "sms": "{}",
    "sas": "{}"
  }}
}}"#, a_init.sms, a_res.sas, b_res.sms.unwrap(), b_res.sas);

    println!("{}", json);
}
