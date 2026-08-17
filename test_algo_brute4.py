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
    return shuffle(list(base), sha3h(a.encode() + b"|" + b.encode()))

def b36(s):
    v = 0
    for ch in s: v = v * 36 + B36.index(ch.upper())
    return v

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
    
    ics = derive_charset(IDX, ck, "OV_INDEX_CHARSET_V1")
    si = "".join(ics[b36(idxEnc[i:i+2])] for i in range(0, len(idxEnc), 2))
    
    inner = hmac256(si.encode(), ck.encode())
    sk_bytes = hmac256(inner, b"OV_Charset_v1\x01")
    sk = sk_bytes.hex()
    ctxA = sha3h(si.encode())

    # Try different slice lengths for shift
    for slice_len in [None, 8, 16, 12]:
        for shift_fmt in ["{ctxA}:{idx}:{sk}", "{ctxA}:{idx}:{sk_upper}", "{sk}:{idx}:{ctxA}", "{ctxA}|{idx}|{sk}"]:
            out_indices = []
            for k in range(0, len(payEnc), 3):
                v = b36(payEnc[k:k+3])
                idx = k // 3
                
                if shift_fmt == "{ctxA}:{idx}:{sk}": s_str = f"{ctxA}:{idx}:{sk}"
                elif shift_fmt == "{ctxA}:{idx}:{sk_upper}": s_str = f"{ctxA}:{idx}:{sk.upper()}"
                elif shift_fmt == "{sk}:{idx}:{ctxA}": s_str = f"{sk}:{idx}:{ctxA}"
                elif shift_fmt == "{ctxA}|{idx}|{sk}": s_str = f"{ctxA}|{idx}|{sk}"
                    
                h = sha3h(s_str.encode())
                if slice_len: h = h[:slice_len]
                shift = int(h, 16)
                ci = (v - shift) % 4096
                out_indices.append(ci)
            
            for i in range(len(out_indices) - 5):
                if len(set(out_indices[i:i+6])) == 1:
                    print(f"FOUND MATCH with fmt {shift_fmt}, slice {slice_len}!")
                    print("Indices:", out_indices)
                    return
    
    print("Still no match...")
    
test_all()
