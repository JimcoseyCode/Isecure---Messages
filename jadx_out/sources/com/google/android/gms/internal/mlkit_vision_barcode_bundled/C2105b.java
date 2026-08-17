package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

/* JADX INFO: renamed from: com.google.android.gms.internal.mlkit_vision_barcode_bundled.b, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public final class C2105b extends P0 implements InterfaceC2191s1 {
    private static final C2105b zzb;
    private int zzd;
    private C2120e zze;
    private boolean zzf;

    static {
        C2105b c2105b = new C2105b();
        zzb = c2105b;
        P0.y(C2105b.class, c2105b);
    }

    private C2105b() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.P0
    protected final Object E(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return P0.v(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဇ\u0001", new Object[]{"zzd", "zze", "zzf"});
        }
        if (i11 == 3) {
            return new C2105b();
        }
        R3 r32 = null;
        if (i11 == 4) {
            return new S3(r32);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }
}
