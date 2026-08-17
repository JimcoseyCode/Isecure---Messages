package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import com.facebook.react.uimanager.events.PointerEventHelper;

/* JADX INFO: renamed from: com.google.android.gms.internal.mlkit_vision_barcode_bundled.q3, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public final class C2184q3 extends P0 implements InterfaceC2191s1 {
    private static final C2184q3 zzb;
    private int zzd;
    private String zze = PointerEventHelper.POINTER_TYPE_UNKNOWN;
    private String zzf = PointerEventHelper.POINTER_TYPE_UNKNOWN;
    private String zzg = PointerEventHelper.POINTER_TYPE_UNKNOWN;
    private int zzh;
    private int zzi;
    private R2 zzj;
    private boolean zzk;
    private int zzl;
    private boolean zzm;
    private boolean zzn;
    private boolean zzo;
    private long zzp;

    static {
        C2184q3 c2184q3 = new C2184q3();
        zzb = c2184q3;
        P0.y(C2184q3.class, c2184q3);
    }

    private C2184q3() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.P0
    protected final Object E(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return P0.v(zzb, "\u0001\f\u0000\u0001\u0001\f\f\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004᠌\u0003\u0005င\u0004\u0006ဉ\u0005\u0007ဇ\u0006\b᠌\u0007\tဇ\b\nဇ\t\u000bဇ\n\fဂ\u000b", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", C2188r3.f22410a, "zzi", "zzj", "zzk", "zzl", C2193s3.f22412a, "zzm", "zzn", "zzo", "zzp"});
        }
        if (i11 == 3) {
            return new C2184q3();
        }
        AbstractC2168n2 abstractC2168n2 = null;
        if (i11 == 4) {
            return new C2179p3(abstractC2168n2);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }
}
