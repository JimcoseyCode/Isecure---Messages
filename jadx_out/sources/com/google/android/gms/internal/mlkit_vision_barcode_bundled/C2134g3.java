package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

/* JADX INFO: renamed from: com.google.android.gms.internal.mlkit_vision_barcode_bundled.g3, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public final class C2134g3 extends P0 implements InterfaceC2191s1 {
    private static final C2134g3 zzb;
    private int zzd;
    private int zzg;
    private N3 zzh;
    private I3 zzi;
    private C3 zzj;
    private int zzk;
    private byte zzm = 2;
    private int zze = 17;
    private W0 zzf = P0.s();
    private W0 zzl = P0.s();

    static {
        C2134g3 c2134g3 = new C2134g3();
        zzb = c2134g3;
        P0.y(C2134g3.class, c2134g3);
    }

    private C2134g3() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.P0
    protected final Object E(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return Byte.valueOf(this.zzm);
        }
        if (i11 == 2) {
            return P0.v(zzb, "\u0001\b\u0000\u0001\u0001\u000f\b\u0000\u0002\u0004\u0001᠌\u0000\u0003Л\u0004င\u0001\u0005ᐉ\u0002\u0006ᐉ\u0003\u0007င\u0005\b\u001b\u000fᐉ\u0004", new Object[]{"zzd", "zze", F2.f21672a, "zzf", C2140i.class, "zzg", "zzh", "zzi", "zzk", "zzl", C2155l.class, "zzj"});
        }
        if (i11 == 3) {
            return new C2134g3();
        }
        E1 e12 = null;
        if (i11 == 4) {
            return new C2123e2(e12);
        }
        if (i11 == 5) {
            return zzb;
        }
        this.zzm = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
