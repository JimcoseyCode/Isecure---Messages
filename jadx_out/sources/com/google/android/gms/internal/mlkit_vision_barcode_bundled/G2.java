package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public final class G2 extends P0 implements InterfaceC2191s1 {
    private static final G2 zzb;
    private int zzd;
    private int zze;
    private int zzf;
    private W0 zzg = P0.s();
    private int zzh;

    static {
        G2 g22 = new G2();
        zzb = g22;
        P0.y(G2.class, g22);
    }

    private G2() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.P0
    protected final Object E(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return P0.v(zzb, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001᠌\u0000\u0002င\u0001\u0003\u001a\u0004င\u0002", new Object[]{"zzd", "zze", E2.f21667a, "zzf", "zzg", "zzh"});
        }
        if (i11 == 3) {
            return new G2();
        }
        AbstractC2168n2 abstractC2168n2 = null;
        if (i11 == 4) {
            return new D2(abstractC2168n2);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }
}
