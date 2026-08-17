package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import com.facebook.react.uimanager.events.PointerEventHelper;

/* JADX INFO: renamed from: com.google.android.gms.internal.mlkit_vision_barcode_bundled.g1, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public final class C2132g1 extends P0 implements InterfaceC2191s1 {
    private static final C2132g1 zzb;
    private int zzd;
    private C3 zzi;
    private C2132g1 zzj;
    private Q3 zzk;
    private byte zzl = 2;
    private String zze = PointerEventHelper.POINTER_TYPE_UNKNOWN;
    private W0 zzf = P0.s();
    private W0 zzg = P0.s();
    private W0 zzh = P0.s();

    static {
        C2132g1 c2132g1 = new C2132g1();
        zzb = c2132g1;
        P0.y(C2132g1.class, c2132g1);
        P0.l(C3.H(), c2132g1, c2132g1, null, 12208774, EnumC2153k2.f22381r, C2132g1.class);
    }

    private C2132g1() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.P0
    protected final Object E(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return Byte.valueOf(this.zzl);
        }
        if (i11 == 2) {
            return P0.v(zzb, "\u0001\u0007\u0000\u0001\u0002Ǵ\u0007\u0000\u0003\u0004\u0002Л\u0005Л\u0006\u001b\bᐉ\u0001\nဈ\u0000\u000bᐉ\u0002Ǵဉ\u0003", new Object[]{"zzd", "zzf", C2134g3.class, "zzh", C2134g3.class, "zzg", F3.class, "zzi", "zze", "zzj", "zzk"});
        }
        if (i11 == 3) {
            return new C2132g1();
        }
        AbstractC2141i0 abstractC2141i0 = null;
        if (i11 == 4) {
            return new I0(abstractC2141i0);
        }
        if (i11 == 5) {
            return zzb;
        }
        this.zzl = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
