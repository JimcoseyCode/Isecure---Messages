#!/usr/bin/env python3
"""OV Message OV36 base36 codec — COMPLETE, byte-exact from the Hermes pseudo-JS
decompilation (hbc-decompiler on apktool_out/assets/index.android.bundle).

Every step below is verified against the decompiled source (getUniversalCharset
#14715, generateSubstitution #14488, getReverseSubstitution #14489, the encrypt
driver #14492/#14493, the message-level encryptMessage #14868, deriveMessageSubKey
#14781, getDerivedSpecialCharsetForMessage #14782, getDerivedIndexCharset #14784,
deriveCharset #14780, deterministicShuffle #14779, createSeededPRNG/nextInt
#14777/#14778, the base36 cluster #15085-#15095) and reproduced identically in Node.

## Pipeline (decode `OV36:<idxEnc>><nonce_b64url16>:<payloadEnc>`)

    dIndex      = deriveCharset(INDEX_CHARSET, contactKey, "OV_INDEX_CHARSET_V1")
    secureIndex = join( dIndex[base36_2(idxEnc[2i:2i+2])] for i in 0..10 )   # 11 chars

    ctxA   = SHA3-256(contactKey).hex
    subKey = deriveMessageSubKey(secureIndex, contactKey)
           = HMAC( HMAC(key=contactKey, msg=secureIndex), "OV_Charset_v1"‖0x01 ).hex

    # TWO different derived special charsets (deriveMessageSubKey args are SWAPPED):
    csB = deriveCharset(getSpecialCharSet(), deriveMessageSubKey(secureIndex, contactKey), "OV_SPECIAL_CHARSET_V1")  # == subKey seed; substitution/output charset
    csA = deriveCharset(getSpecialCharSet(), deriveMessageSubKey(contactKey, secureIndex), "OV_SPECIAL_CHARSET_V1")  # base36 transport charset

    for k, group in enumerate(payloadEnc split by 3):
        num    = base36_3(group)                          # index in csA (transport)
        symbol = csA[num]
        numGen = csB.index(symbol)                        # index in csB (substitution)
        shift  = int(SHA3-256(f"{ctxA}:{k}:{subKey}").hex, 16)
        ci     = (numGen - shift) mod 4096
        out   += getUniversalCharset()[ci]

    # then strip the trailing "secure spaces" (3-10 appended before substitution)

## Helpers (byte-exact)
    deriveCharset(base,a,b)      = deterministicShuffle(base, SHA3-256(a+"|"+b).hex)
    deriveMessageSubKey(a0,a1)   = HMAC( HMAC(key=a1, msg=a0), "OV_Charset_v1"‖0x01 ).hex
    deterministicShuffle(arr,s)  = Fisher-Yates i=len-1..1, j=prng.nextInt(i)
    createSeededPRNG(seed): state=seed, counter=0
    nextInt(max): range=max+1; limit=floor(2^32/range)*range
                  loop: state=SHA256(state+str(counter)).hex; counter++;
                        v=int(state[:8],16); if v<limit: return v%range

NOTE: validated internally (encode∘decode == identity) and every primitive matches
the decompiled source + Node. Live decode of a real OV message is still blocked
because OV encrypts with a contactKey the pairing harness does not log (OV does not
adopt the harness pairing key even when the SAS is confirmed). See [[ov36-codec]].
"""
import hashlib, hmac, json, os, sys
HERE = os.path.dirname(os.path.abspath(__file__))
UNI     = open(os.path.join(HERE, "universal_charset_v3.txt"), encoding="utf-8").read()
IDX     = list(open(os.path.join(HERE, "index_charset.txt"), encoding="utf-8").read())
SPECIAL = json.load(open(os.path.join(HERE, "special_charset.json")))
B36 = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ"
LABEL = b"OV_Charset_v1\x01"

sha3h = lambda s: hashlib.sha3_256(s.encode()).hexdigest()
H = lambda k, m: hmac.new(k, m, hashlib.sha256).digest()

def base36(s):
    n = 0
    for ch in s:
        n = n * 36 + B36.index(ch.upper())
    return n

def _prng(seed):
    st, c = [seed], [0]
    def nxt(mx):
        rng = mx + 1; lim = (2**32 // rng) * rng
        while True:
            st[0] = hashlib.sha256((st[0] + str(c[0])).encode()).hexdigest(); c[0] += 1
            v = int(st[0][:8], 16)
            if v < lim:
                return v % rng
    return nxt

def shuffle(base, seed_hex):
    a = list(base); nxt = _prng(seed_hex)
    for i in range(len(a) - 1, 0, -1):
        j = nxt(i); a[i], a[j] = a[j], a[i]
    return a

def derive_charset(base, a, b):
    return shuffle(list(base), sha3h(a + "|" + b))

def derive_message_subkey(a0, a1):
    return H(H(a1.encode(), a0.encode()), LABEL).hex()

def decode(msg, contact_key):
    body = msg[5:]; gt = body.index(">"); idx_enc = body[:gt]
    rest = body[gt + 1:]; col = rest.index(":"); pay = rest[col + 1:]

    d_index = derive_charset(IDX, contact_key, "OV_INDEX_CHARSET_V1")
    secure_index = "".join(d_index[base36(idx_enc[i:i+2])] for i in range(0, len(idx_enc), 2))

    ctx_a = sha3h(contact_key)
    sub_key = derive_message_subkey(secure_index, contact_key)
    cs_b = derive_charset(SPECIAL, derive_message_subkey(secure_index, contact_key), "OV_SPECIAL_CHARSET_V1")
    cs_a = derive_charset(SPECIAL, derive_message_subkey(contact_key, secure_index), "OV_SPECIAL_CHARSET_V1")
    enc_pos = {c: i for i, c in enumerate(cs_b)}

    out = []
    for k in range(0, len(pay), 3):
        num = base36(pay[k:k+3])
        num_gen = enc_pos[cs_a[num]]
        shift = int(sha3h(f"{ctx_a}:{k//3}:{sub_key}"), 16)
        out.append(UNI[(num_gen - shift) % 4096])
    # OV appends 3-10 "secure spaces" before substitution; strip trailing whitespace.
    return "".join(out).rstrip()

if __name__ == "__main__":
    ck = sys.argv[1] if len(sys.argv) > 1 else "7162f92e626b244c0c59a6f11c56059f6c12d0c4bfa0588663b0c59a16987376"
    m = sys.argv[2] if len(sys.argv) > 2 else "OV36:BYDU1JCV1E573462599I2Y>8NExsU_tiZEWDUaBppNu-Q:2WY0RX0DC0ZS3450DS0EI0RV0FS20V2JK1LU04G1Y3"
    print(repr(decode(m, ck)))
