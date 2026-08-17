package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public final class Q3 extends P0 implements InterfaceC2191s1 {
    private static final Q3 zzb;
    private int zzd;
    private C2105b zze;

    static {
        Q3 q32 = new Q3();
        zzb = q32;
        P0.y(Q3.class, q32);
    }

    private Q3() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.P0
    protected final Object E(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return P0.v(zzb, "\u0001\u0001\u0000\u0001\u000f\u000f\u0001\u0000\u0000\u0000\u000fဉ\u0000", new Object[]{"zzd", "zze"});
        }
        if (i11 == 3) {
            return new Q3();
        }
        O3 o32 = null;
        if (i11 == 4) {
            return new P3(o32);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }
}
