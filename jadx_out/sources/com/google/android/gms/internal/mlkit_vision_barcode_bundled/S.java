package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public final class S extends P0 implements InterfaceC2191s1 {
    private static final S zzb;
    private int zzd;
    private int zze;
    private C2132g1 zzg;
    private byte zzh = 2;
    private W0 zzf = P0.s();

    static {
        S s10 = new S();
        zzb = s10;
        P0.y(S.class, s10);
    }

    private S() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.P0
    protected final Object E(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return Byte.valueOf(this.zzh);
        }
        if (i11 == 2) {
            return P0.v(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0001\u0001᠌\u0000\u0002\u001a\u0003ᐉ\u0001", new Object[]{"zzd", "zze", P.f22296a, "zzf", "zzg"});
        }
        if (i11 == 3) {
            return new S();
        }
        N n10 = null;
        if (i11 == 4) {
            return new O(n10);
        }
        if (i11 == 5) {
            return zzb;
        }
        this.zzh = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }

    public final List G() {
        return this.zzf;
    }

    public final int H() {
        int iA = Q.a(this.zze);
        if (iA == 0) {
            return 1;
        }
        return iA;
    }
}
