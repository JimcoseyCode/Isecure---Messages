package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import com.facebook.react.uimanager.events.PointerEventHelper;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public final class I3 extends P0 implements InterfaceC2191s1 {
    private static final I3 zzb;
    private int zzd;
    private C3 zzj;
    private byte zzk = 2;
    private V0 zze = P0.r();
    private U0 zzf = P0.p();
    private boolean zzg = true;
    private String zzh = PointerEventHelper.POINTER_TYPE_UNKNOWN;
    private String zzi = PointerEventHelper.POINTER_TYPE_UNKNOWN;

    static {
        I3 i32 = new I3();
        zzb = i32;
        P0.y(I3.class, i32);
    }

    private I3() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.P0
    protected final Object E(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return Byte.valueOf(this.zzk);
        }
        if (i11 == 2) {
            return P0.v(zzb, "\u0001\u0006\u0000\u0001\u0001\u000f\u0006\u0000\u0002\u0001\u0001\u0016\u0002\u0013\u0003ဇ\u0000\u0004ဈ\u0001\u0005ဈ\u0002\u000fᐉ\u0003", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj"});
        }
        if (i11 == 3) {
            return new I3();
        }
        G3 g32 = null;
        if (i11 == 4) {
            return new H3(g32);
        }
        if (i11 == 5) {
            return zzb;
        }
        this.zzk = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
