package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public final class N3 extends P0 implements InterfaceC2191s1 {
    private static final N3 zzb;
    private int zzd;
    private long zze;
    private long zzf;
    private C3 zzg;
    private byte zzh = 2;

    static {
        N3 n32 = new N3();
        zzb = n32;
        P0.y(N3.class, n32);
        P0.l(C3.H(), n32, n32, null, 13258261, EnumC2153k2.f22381r, N3.class);
    }

    private N3() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.P0
    protected final Object E(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return Byte.valueOf(this.zzh);
        }
        if (i11 == 2) {
            return P0.v(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0003\u0001ᔅ\u0000\u0002ᔅ\u0001\u0003ᐉ\u0002", new Object[]{"zzd", "zze", "zzf", "zzg"});
        }
        if (i11 == 3) {
            return new N3();
        }
        L3 l32 = null;
        if (i11 == 4) {
            return new M3(l32);
        }
        if (i11 == 5) {
            return zzb;
        }
        this.zzh = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
