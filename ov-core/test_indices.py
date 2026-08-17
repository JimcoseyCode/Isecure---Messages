#!/usr/bin/env python3
import hashlib, hmac, sys, os

HERE = os.path.dirname(os.path.abspath(__file__))
IDX = open(os.path.join(HERE, "index_charset.txt"), encoding='utf-8').read()
B36 = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ"
sha3h = lambda s: hashlib.sha3_256(s.encode()).hexdigest()
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
            if v < lim: 
                return v % rng
    return ni

def shuffle(base, seed):
    a = list(base)
    ni = _ni(seed)
    for i in range(len(a) - 1, 0, -1):
        j = ni(i)
        a[i], a[j] = a[j], a[i]
    return a

def derive_charset(base, a, b): 
    return shuffle(list(base), sha3h(a + "|" + b))

def subkey(ck, si): 
    return hmac256(hmac256(si.encode(), ck.encode()), b"OV_Charset_v1" + b"\x01").hex()

def b36(s):
    v = 0
    for ch in s: 
        v = v * 36 + B36.index(ch.upper())
    return v

def decode_indices(msg, contact_key, index_charset_base=IDX):
    body = msg[5:]
    gt = body.index('>')
    idxEnc = body[:gt]
    rest = body[gt+1:]
    col = rest.index(':')
    payEnc = rest[col+1:]
    
    ics = derive_charset(index_charset_base, contact_key, "OV_INDEX_CHARSET_V1")
    si = "".join(ics[b36(idxEnc[i:i+2])] for i in range(0, len(idxEnc), 2))
    sk = subkey(contact_key, si)
    ctxA = sha3h(si)
    
    L = 4096
    out_indices = []
    
    for k in range(0, len(payEnc), 3):
        v = b36(payEnc[k:k+3])
        shift = int(sha3h(f"{ctxA}:{k//3}:{sk}"), 16)
        ci = (v - shift) % L
        out_indices.append(ci)
        
    return out_indices

if __name__ == "__main__":
    ck = "d57eab4587b455eff9a5cddf044242e00c666359230949adfd062091890f39cd"
    m = "OV36:942JCC7C8J4HAT1J7UD2C8>xk6OHCvDaN-nxN5KYB2fNA:0UJ21Q25500Z24A0BL0BL1ED0421U50PT0581HW07321N"
    print("Indices:", decode_indices(m, ck))
