// We have the OVPK:I (Initiator) public keys and OVPK:R (Responder) ciphertexts.
// But as seen in the code, the X25519 ephemeral private key and ML-KEM private key
// are generated securely via OsRng on the devices.
// Finding the key requires breaking X25519 or ML-KEM-768 without the private key.
console.log("To find the key without the private key requires a quantum computer to break X25519 and breaking ML-KEM-768.");
