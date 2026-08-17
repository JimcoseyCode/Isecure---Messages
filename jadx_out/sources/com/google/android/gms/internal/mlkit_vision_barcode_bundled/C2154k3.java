package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

/* JADX INFO: renamed from: com.google.android.gms.internal.mlkit_vision_barcode_bundled.k3, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public final class C2154k3 extends P0 implements InterfaceC2191s1 {
    private static final C2154k3 zzb;
    private int zzd;
    private W0 zze = P0.s();
    private C2164m3 zzf;
    private C2187r2 zzg;

    static {
        C2154k3 c2154k3 = new C2154k3();
        zzb = c2154k3;
        P0.y(C2154k3.class, c2154k3);
    }

    private C2154k3() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.P0
    protected final Object E(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return P0.v(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001\u001b\u0002ဉ\u0000\u0003ဉ\u0001", new Object[]{"zzd", "zze", w3.class, "zzf", "zzg"});
        }
        if (i11 == 3) {
            return new C2154k3();
        }
        AbstractC2168n2 abstractC2168n2 = null;
        if (i11 == 4) {
            return new C2149j3(abstractC2168n2);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }
}
