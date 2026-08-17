package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import com.facebook.react.uimanager.events.PointerEventHelper;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public final class Y extends P0 implements InterfaceC2191s1 {
    private static final Y zzb;
    private int zzd;
    private int zze;
    private String zzf = PointerEventHelper.POINTER_TYPE_UNKNOWN;

    static {
        Y y10 = new Y();
        zzb = y10;
        P0.y(Y.class, y10);
    }

    private Y() {
    }

    public static Y G() {
        return zzb;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.P0
    protected final Object E(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return P0.v(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002ဈ\u0001", new Object[]{"zzd", "zze", W.f22314a, "zzf"});
        }
        if (i11 == 3) {
            return new Y();
        }
        N n10 = null;
        if (i11 == 4) {
            return new V(n10);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }

    public final String H() {
        return this.zzf;
    }

    public final int I() {
        int iA = X.a(this.zze);
        if (iA == 0) {
            return 1;
        }
        return iA;
    }
}
