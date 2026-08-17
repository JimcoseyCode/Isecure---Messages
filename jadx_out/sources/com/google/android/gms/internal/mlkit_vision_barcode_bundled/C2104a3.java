package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import com.facebook.react.uimanager.events.PointerEventHelper;

/* JADX INFO: renamed from: com.google.android.gms.internal.mlkit_vision_barcode_bundled.a3, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public final class C2104a3 extends P0 implements InterfaceC2191s1 {
    private static final C2104a3 zzb;
    private int zzd;
    private boolean zzf;
    private int zzg;
    private boolean zzj;
    private int zzm;
    private int zzn;
    private boolean zzo;
    private int zze = -1;
    private AbstractC2171o0 zzh = AbstractC2171o0.f22405h;
    private String zzi = PointerEventHelper.POINTER_TYPE_UNKNOWN;
    private boolean zzk = true;
    private boolean zzl = true;

    static {
        C2104a3 c2104a3 = new C2104a3();
        zzb = c2104a3;
        P0.y(C2104a3.class, c2104a3);
    }

    private C2104a3() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.P0
    protected final Object E(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            T0 t02 = Y2.f22324a;
            T0 t03 = Z2.f22325a;
            return P0.v(zzb, "\u0001\u000b\u0000\u0001\u0001\u000b\u000b\u0000\u0000\u0000\u0001င\u0000\u0002ဇ\u0001\u0003᠌\u0002\u0004ည\u0003\u0005ဈ\u0004\u0006ဇ\u0005\u0007ဇ\u0006\bဇ\u0007\t᠌\b\n᠌\t\u000bဇ\n", new Object[]{"zzd", "zze", "zzf", "zzg", t02, "zzh", "zzi", "zzj", "zzk", "zzl", "zzm", t03, "zzn", t03, "zzo"});
        }
        if (i11 == 3) {
            return new C2104a3();
        }
        AbstractC2168n2 abstractC2168n2 = null;
        if (i11 == 4) {
            return new X2(abstractC2168n2);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }
}
