package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import com.facebook.react.uimanager.events.PointerEventHelper;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public final class U extends P0 implements InterfaceC2191s1 {
    private static final U zzb;
    private int zzd;
    private String zze = PointerEventHelper.POINTER_TYPE_UNKNOWN;
    private String zzf = PointerEventHelper.POINTER_TYPE_UNKNOWN;
    private String zzg = PointerEventHelper.POINTER_TYPE_UNKNOWN;
    private String zzh = PointerEventHelper.POINTER_TYPE_UNKNOWN;
    private String zzi = PointerEventHelper.POINTER_TYPE_UNKNOWN;
    private String zzj = PointerEventHelper.POINTER_TYPE_UNKNOWN;
    private String zzk = PointerEventHelper.POINTER_TYPE_UNKNOWN;

    static {
        U u10 = new U();
        zzb = u10;
        P0.y(U.class, u10);
    }

    private U() {
    }

    public static U G() {
        return zzb;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.P0
    protected final Object E(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return P0.v(zzb, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဈ\u0005\u0007ဈ\u0006", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk"});
        }
        if (i11 == 3) {
            return new U();
        }
        N n10 = null;
        if (i11 == 4) {
            return new T(n10);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }

    public final String H() {
        return this.zzh;
    }

    public final String I() {
        return this.zze;
    }

    public final String J() {
        return this.zzj;
    }

    public final String K() {
        return this.zzi;
    }

    public final String L() {
        return this.zzg;
    }

    public final String M() {
        return this.zzf;
    }

    public final String N() {
        return this.zzk;
    }
}
