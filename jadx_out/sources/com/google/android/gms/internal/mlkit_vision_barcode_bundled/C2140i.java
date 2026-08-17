package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import com.facebook.react.uimanager.events.PointerEventHelper;

/* JADX INFO: renamed from: com.google.android.gms.internal.mlkit_vision_barcode_bundled.i, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public final class C2140i extends P0 implements InterfaceC2191s1 {
    private static final C2140i zzb;
    private int zzd;
    private Q3 zzj;
    private C3 zzk;
    private byte zzl = 2;
    private String zze = PointerEventHelper.POINTER_TYPE_UNKNOWN;
    private String zzf = PointerEventHelper.POINTER_TYPE_UNKNOWN;
    private V0 zzg = P0.r();
    private String zzh = PointerEventHelper.POINTER_TYPE_UNKNOWN;
    private String zzi = PointerEventHelper.POINTER_TYPE_UNKNOWN;

    static {
        C2140i c2140i = new C2140i();
        zzb = c2140i;
        P0.y(C2140i.class, c2140i);
        P0.l(C3.H(), c2140i, c2140i, null, 308676116, EnumC2153k2.f22381r, C2140i.class);
    }

    private C2140i() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.P0
    protected final Object E(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return Byte.valueOf(this.zzl);
        }
        if (i11 == 2) {
            return P0.v(zzb, "\u0001\u0007\u0000\u0001\u0001Ǵ\u0007\u0000\u0001\u0002\u0001ᔈ\u0000\u0002ဈ\u0001\u0003ࠞ\u0005ဈ\u0002\u0006ဈ\u0003\u000fᐉ\u0005Ǵဉ\u0004", new Object[]{"zzd", "zze", "zzf", "zzg", C2135h.f22362a, "zzh", "zzi", "zzk", "zzj"});
        }
        if (i11 == 3) {
            return new C2140i();
        }
        AbstractC2125f abstractC2125f = null;
        if (i11 == 4) {
            return new C2130g(abstractC2125f);
        }
        if (i11 == 5) {
            return zzb;
        }
        this.zzl = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
