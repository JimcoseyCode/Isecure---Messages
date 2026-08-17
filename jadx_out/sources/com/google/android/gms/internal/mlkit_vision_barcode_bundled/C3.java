package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public final class C3 extends M0 implements InterfaceC2191s1 {
    private static final C3 zzd;
    private byte zze = 2;

    static {
        C3 c32 = new C3();
        zzd = c32;
        P0.y(C3.class, c32);
    }

    private C3() {
    }

    public static C3 H() {
        return zzd;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.P0
    protected final Object E(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return Byte.valueOf(this.zze);
        }
        A3 a32 = null;
        if (i11 == 2) {
            return P0.v(zzd, "\u0003\u0000", null);
        }
        if (i11 == 3) {
            return new C3();
        }
        if (i11 == 4) {
            return new B3(a32);
        }
        if (i11 == 5) {
            return zzd;
        }
        this.zze = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
