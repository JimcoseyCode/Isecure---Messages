package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import com.facebook.react.uimanager.events.PointerEventHelper;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public final class F3 extends P0 implements InterfaceC2191s1 {
    private static final F3 zzb;
    private int zzd;
    private W0 zze = P0.s();
    private String zzf = PointerEventHelper.POINTER_TYPE_UNKNOWN;

    static {
        F3 f32 = new F3();
        zzb = f32;
        P0.y(F3.class, f32);
    }

    private F3() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.P0
    protected final Object E(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return P0.v(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001a\u0002ဈ\u0000", new Object[]{"zzd", "zze", "zzf"});
        }
        if (i11 == 3) {
            return new F3();
        }
        D3 d32 = null;
        if (i11 == 4) {
            return new E3(d32);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }
}
