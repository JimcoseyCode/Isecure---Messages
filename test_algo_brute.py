#!/usr/bin/env python3
import hashlib, hmac

B36 = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ"
sha3h = lambda s: hashlib.sha3_256(s if isinstance(s, bytes) else s.encode()).hexdigest()
hmac256 = lambda k,m: hmac.new(k,m,hashlib.sha256).digest()

def _ni(seed):
    st = [seed]
    c = [0]
    def ni(mx):
        rng = mx + 1
        lim = (2**32 // rng) * rng
        while True:
            st[0] = hashlib.sha256((st[0] + str(c[0])).encode()).hexdigest()
            c[0] += 1
            v = int(st[0][:8], 16)
            if v < lim: return v % rng
    return ni

def shuffle(base, seed):
    a = list(base)
    ni = _ni(seed)
    for i in range(len(a) - 1, 0, -1):
        j = ni(i)
        a[i], a[j] = a[j], a[i]
    return a

def derive_charset(base, a, b):
    # a and b might be strings
    return shuffle(list(base), sha3h(a.encode() + b"|" + b.encode()))

def b36(s):
    v = 0
    for ch in s: v = v * 36 + B36.index(ch.upper())
    return v

# Try all reasonable variants for subkey and shift
def test_all():
    ck = "d57eab4587b455eff9a5cddf044242e00c666359230949adfd062091890f39cd"
    msg = "OV36:942JCC7C8J4HAT1J7UD2C8>xk6OHCvDaN-nxN5KYB2fNA:0UJ21Q25500Z24A0BL0BL1ED0421U50PT0581HW07321N"
    body = msg[5:]
    gt = body.index('>')
    idxEnc = body[:gt]
    rest = body[gt+1:]
    col = rest.index(':')
    payEnc = rest[col+1:]

    import os
    IDX = open("ov-core/index_charset.txt").read()
    
    # Maybe contact key is passed as hex bytes to derive_charset?
    # Actually, the JS code has `deriveCharset(indexBase, key)`
    # where key is the contactKey string.
    ics = derive_charset(IDX, ck, "OV_INDEX_CHARSET_V1")
    si = "".join(ics[b36(idxEnc[i:i+2])] for i in range(0, len(idxEnc), 2))
    
    # Let's try all hmac combinations
    for k1, m1 in [(si.encode(), ck.encode()), (ck.encode(), si.encode()), 
                   (si.encode(), bytes.fromhex(ck)), (bytes.fromhex(ck), si.encode())]:
        inner = hmac256(k1, m1)
        for label in [b"OV_Charset_v1", b"OV_Charset_V1"]:
            sk_bytes = hmac256(inner, label + b"\x01")
            sk = sk_bytes.hex()
            
            for ctx_input in [si.encode(), bytes.fromhex(ck)]:
                ctxA = sha3h(ctx_input)
                
                L = 4096
                out_indices = []
                for k in range(0, len(payEnc), 3):
                    v = b36(payEnc[k:k+3])
                    # shift = int(sha3h(f"{ctxA}:{k//3}:{sk}"), 16)
                    shift = int(sha3h(f"{ctxA}:{k//3}:{sk}".encode()), 16)
                    ci = (v - shift) % L
                    out_indices.append(ci)
                
                # Check if out_indices contains the same value 6 times (since "aaaaaa")
                # Wait, "aaaaaa" is 6 characters. The payload has 15 groups.
                # If the payload is json {"msg":"aaaaaa"}, the "aaaaaa" is at index 9 to 14.
                # Let's see if ANY 6 consecutive indices are identical!
                for i in range(len(out_indices) - 5):
                    if len(set(out_indices[i:i+6])) == 1:
                        print("FOUND MATCH!")
                        print(f"k1={k1[:10]}, m1={m1[:10]}, label={label}")
                        print(f"ctxA input={ctx_input[:10]}")
                        print("Indices:", out_indices)
                        return
                        
test_all()
