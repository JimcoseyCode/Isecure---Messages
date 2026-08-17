package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import com.facebook.react.uimanager.events.PointerEventHelper;

/* JADX INFO: renamed from: com.google.android.gms.internal.mlkit_vision_barcode_bundled.e, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public final class C2120e extends P0 implements InterfaceC2191s1 {
    private static final C2120e zzb;
    private int zzd;
    private int zze = 4369;
    private String zzf = PointerEventHelper.POINTER_TYPE_UNKNOWN;

    static {
        C2120e c2120e = new C2120e();
        zzb = c2120e;
        P0.y(C2120e.class, c2120e);
    }

    private C2120e() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.P0
    protected final Object E(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return P0.v(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002ဈ\u0001", new Object[]{"zzd", "zze", J3.f21740a, "zzf"});
        }
        if (i11 == 3) {
            return new C2120e();
        }
        AbstractC2110c abstractC2110c = null;
        if (i11 == 4) {
            return new C2115d(abstractC2110c);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }
}
