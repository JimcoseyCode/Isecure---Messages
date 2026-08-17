package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import com.facebook.react.uimanager.events.PointerEventHelper;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public final class U2 extends P0 implements InterfaceC2191s1 {
    private static final U2 zzb;
    private int zzd;
    private boolean zze;
    private int zzf;
    private int zzh;
    private int zzi;
    private int zzj;
    private int zzk;
    private boolean zzg = true;
    private String zzl = PointerEventHelper.POINTER_TYPE_UNKNOWN;
    private String zzm = PointerEventHelper.POINTER_TYPE_UNKNOWN;

    static {
        U2 u22 = new U2();
        zzb = u22;
        P0.y(U2.class, u22);
    }

    private U2() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.P0
    protected final Object E(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            T0 t02 = W2.f22315a;
            T0 t03 = S2.f22306a;
            T0 t04 = V2.f22313a;
            return P0.v(zzb, "\u0001\t\u0000\u0001\u0001\t\t\u0000\u0000\u0000\u0001ဇ\u0000\u0002᠌\u0001\u0003ဇ\u0002\u0004᠌\u0003\u0005᠌\u0004\u0006᠌\u0005\u0007᠌\u0006\bဈ\u0007\tဈ\b", new Object[]{"zzd", "zze", "zzf", t02, "zzg", "zzh", t03, "zzi", t04, "zzj", t04, "zzk", t04, "zzl", "zzm"});
        }
        if (i11 == 3) {
            return new U2();
        }
        AbstractC2168n2 abstractC2168n2 = null;
        if (i11 == 4) {
            return new T2(abstractC2168n2);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }
}
