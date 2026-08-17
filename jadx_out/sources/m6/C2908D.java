package m6;

import com.facebook.react.uimanager.events.PointerEventHelper;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.InterfaceC2191s1;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.P0;

/* JADX INFO: renamed from: m6.D, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class C2908D extends P0 implements InterfaceC2191s1 {
    private static final C2908D zzb;
    private int zzd;
    private String zze = PointerEventHelper.POINTER_TYPE_UNKNOWN;
    private String zzf = PointerEventHelper.POINTER_TYPE_UNKNOWN;
    private String zzg = PointerEventHelper.POINTER_TYPE_UNKNOWN;
    private String zzh = PointerEventHelper.POINTER_TYPE_UNKNOWN;
    private String zzi = PointerEventHelper.POINTER_TYPE_UNKNOWN;
    private C2906B zzj;
    private C2906B zzk;

    static {
        C2908D c2908d = new C2908D();
        zzb = c2908d;
        P0.y(C2908D.class, c2908d);
    }

    private C2908D() {
    }

    public static C2908D I() {
        return zzb;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.P0
    protected final Object E(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return P0.v(zzb, "\u0004\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဉ\u0005\u0007ဉ\u0006", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk"});
        }
        if (i11 == 3) {
            return new C2908D();
        }
        AbstractC2922b abstractC2922b = null;
        if (i11 == 4) {
            return new C2907C(abstractC2922b);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }

    public final C2906B F() {
        C2906B c2906b = this.zzk;
        return c2906b == null ? C2906B.M() : c2906b;
    }

    public final C2906B G() {
        C2906B c2906b = this.zzj;
        return c2906b == null ? C2906B.M() : c2906b;
    }

    public final String J() {
        return this.zzf;
    }

    public final String K() {
        return this.zzg;
    }

    public final String L() {
        return this.zzh;
    }

    public final String M() {
        return this.zzi;
    }

    public final String N() {
        return this.zze;
    }
}
