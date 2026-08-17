use hkdf::Hkdf;
use sha2::{Digest, Sha256};
use sha3::digest::{ExtendableOutput, Update, XofReader};
use sha3::Shake256;
use hmac::{Hmac, Mac};

fn hx(s: &str) -> Vec<u8> {
    (0..s.len()).step_by(2).map(|i| u8::from_str_radix(&s[i..i + 2], 16).unwrap()).collect()
}

fn shake256_32(data: &[u8]) -> [u8; 32] {
    let mut hasher = Shake256::default();
    hasher.update(data);
    let mut reader = hasher.finalize_xof();
    let mut res = [0u8; 32];
    reader.read(&mut res);
    res
}

fn hmac_sha256(key: &[u8], data: &[u8]) -> [u8; 32] {
    let mut m = <Hmac<Sha256>>::new_from_slice(key).unwrap();
    Mac::update(&mut m, data);
    m.finalize().into_bytes().into()
}

fn sas(shared: &[u8]) -> String {
    let salt = Sha256::digest(b"OV_PQHybrid_Salt_v1");
    let prk = hmac_sha256(&salt, shared);
    let mut info = b"OV_PQHybrid_SAS_v1".to_vec();
    info.push(1);
    let t = hmac_sha256(&prk, &info);
    t[..6].iter().map(|b| format!("{b:02X}")).collect()
}

fn main() {
    let ss_pq = hx("fd7dfab2f10a2e16e0c20135c187ad0b18c4bc54a6b71197cd19eeb1ea01bc11");
    let ss_ec = hx("96beb64dcdd4ebd732edc97dab6f87e80ce2277540b85dcc86a16480c4be4837");
    let ct = hx("c1679c4338c9d3ff612ef6445fd42eb3155465579988c44fbd282fc5269e6e5331c41e8f565e7d39756ee6b728c9b4f32e2fac58fb876ddbab6ffb092f3829cb94b797c0dcbb7c0b4819725cfd2c2d11f8886071f908b71fb89030ca80afde118202821529eacfe8f1e09bfd2299f5c10a278ff262c1aef90b23713b84d7ac7f9e17ef51434414d634bdb78bfbc9e07fa849dcb68721cdd53c0a2626af9b4094b93fbe9bc9abeaacd20dcdb3b2a6865ff7b30a9f5b2399b044d2db61add857ad0d9f1ecb117f6bab57e95b8ae2128cce62ad3f89ce1d9678955d4cfd66f122ab02736165ae36c4c84c09e7a8563a151f54a9cc09be088243e7f41f51f89db35566ef4f4008ee3564efffc23f57f167bdf71b77631c3a07918925d9ee57588fdfd4ea2bfd82aee8beaad399b7d5e5950829cdd57102cea2bfc42140f5c942613268367af1855ab83bbff90066c967de2f37c713486bba9346b79d754a8a63ffcbb1919ea585f482ff9906dbae52e99996d1d894ec5312b4cb5db5daec9bd36d32c0afef53aa09f552f84abb235f89182d1fd7a80538cd94275516eb3e8a5d463e1cc9192e6cddbfaa99ea7418cfb821e098a3f21f4c808963d0e7ebdec52e6dfc820148f4bbe71ac0f380797243b67aea6ad544a7e59955f71f7c6ec0cebd5d096e7a09d22bb3f457a30e26bb221ee6b06238b1d9c17425871f13f0424cf0bf457d4357c273bf198f81ea334996f30f0a269a5aad15a8d63813e7cb383610bd5127d2eb79c91faebccd1fa2cdbc1c9be14a7b864222dcac7bc9d6c3a17ef2b82dff27428526e15445e33caaef488e1bf6ec15f52dd32cb9eea73ace38084d3b7c80d7afc17da0d513dfb95602e714a98e09ee9b709d761c83a36a7eaa4a07733cfce96c95733c96dfafecaba657efb7d6d77a545398260f7facc866e438872c3fdf0a80faab3f7bf8067a3375f5232ffbdbd5242a93c481add2530bb0e9607756432deaf873a08360f27028f06a303bd538ed770b6201c21e30b17aceaf94afd71983544554c37601cca5b7ae24700809e8440dc694c00ddadce4d2f62831c5052993203ddd8b1c951cdbbae5ae7f6c2b8cc825e27837fa293368360505734442e7b06d3b1db90ffa7b772a2c4f18e3227ffd198d4802042e5e36e901989de0346d225fa75df92db8271cabe2116058095842ca0e2c0385fea8c08a76c5411b4804e7b9b47a6e5bd3a54e5b1cdcd3a5cf455f127def36f5651e4822c09d84210d21400b1f582554266c3a53a1b31bc562d783cb837c0ca916d5f19b1d3d5389e654f072616109efc17635b1755cac10af628de2198a1430c8abf73dbc7d140d130557f1d65273e7f9488d0d07de728907d8ffd20e9b321ab130324f811fb32bb29746ef95b5347befc60c167f549785397dc6561be126f5abf142beb728f8f09b99bd1a06f94e381364b66c1ace28da4f40150824bb0b04e6c373b984649b91a23d74e16ac0eeca03b04d5bc2c5ba87c3638986838d8199ce912e7e66f62b3c6b255e44977df7ea1d9d2ac6e18d9a0500afdad648252c7a0cdbd134aba8429f6e");
    
    let mut ikm = Vec::new();
    ikm.extend_from_slice(&shake256_32(&ss_ec));
    ikm.extend_from_slice(&shake256_32(&ss_pq));
    ikm.extend_from_slice(&ct);
    ikm.extend_from_slice(b"hybrid_prk");
    
    let hk = Hkdf::<Sha256>::new(None, &ikm);
    let mut info = vec![0x00u8, 0x20];
    info.extend_from_slice(b"shared_secret");
    
    let mut out = [0u8; 32];
    hk.expand(&info, &mut out).unwrap();
    
    println!("SAS: {}", sas(&out));
}
