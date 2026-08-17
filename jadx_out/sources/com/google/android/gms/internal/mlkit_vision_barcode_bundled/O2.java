package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import com.facebook.react.uimanager.events.PointerEventHelper;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public final class O2 extends P0 implements InterfaceC2191s1 {
    private static final O2 zzb;
    private int zzd;
    private int zze;
    private G2 zzh;
    private int zzj;
    private int zzk;
    private int zzn;
    private W0 zzf = P0.s();
    private int zzg = -1;
    private String zzi = PointerEventHelper.POINTER_TYPE_UNKNOWN;
    private V0 zzl = P0.r();
    private String zzm = PointerEventHelper.POINTER_TYPE_UNKNOWN;

    static {
        O2 o22 = new O2();
        zzb = o22;
        P0.y(O2.class, o22);
    }

    private O2() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.P0
    protected final Object E(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return P0.v(zzb, "\u0001\n\u0000\u0001\u0001\n\n\u0000\u0002\u0000\u0001᠌\u0000\u0002\u001b\u0003င\u0001\u0004ဉ\u0002\u0005ဈ\u0003\u0006᠌\u0004\u0007᠌\u0005\b'\tဈ\u0006\n᠌\u0007", new Object[]{"zzd", "zze", J2.f21739a, "zzf", I2.class, "zzg", "zzh", "zzi", "zzj", L2.f22286a, "zzk", M2.f22287a, "zzl", "zzm", "zzn", N2.f22293a});
        }
        if (i11 == 3) {
            return new O2();
        }
        AbstractC2168n2 abstractC2168n2 = null;
        if (i11 == 4) {
            return new K2(abstractC2168n2);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }
}
