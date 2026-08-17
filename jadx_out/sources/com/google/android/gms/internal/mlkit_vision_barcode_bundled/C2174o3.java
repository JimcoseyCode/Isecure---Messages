package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import com.facebook.react.uimanager.events.PointerEventHelper;

/* JADX INFO: renamed from: com.google.android.gms.internal.mlkit_vision_barcode_bundled.o3, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public final class C2174o3 extends P0 implements InterfaceC2191s1 {
    private static final C2174o3 zzb;
    private int zzd;
    private String zze = PointerEventHelper.POINTER_TYPE_UNKNOWN;
    private String zzf = PointerEventHelper.POINTER_TYPE_UNKNOWN;

    static {
        C2174o3 c2174o3 = new C2174o3();
        zzb = c2174o3;
        P0.y(C2174o3.class, c2174o3);
    }

    private C2174o3() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.P0
    protected final Object E(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return P0.v(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"zzd", "zze", "zzf"});
        }
        if (i11 == 3) {
            return new C2174o3();
        }
        AbstractC2168n2 abstractC2168n2 = null;
        if (i11 == 4) {
            return new C2169n3(abstractC2168n2);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }
}
