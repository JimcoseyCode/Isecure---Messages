package m6;

import com.facebook.react.uimanager.events.PointerEventHelper;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.InterfaceC2191s1;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.P0;

/* JADX INFO: renamed from: m6.H, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class C2912H extends P0 implements InterfaceC2191s1 {
    private static final C2912H zzb;
    private int zzd;
    private String zze = PointerEventHelper.POINTER_TYPE_UNKNOWN;
    private String zzf = PointerEventHelper.POINTER_TYPE_UNKNOWN;
    private String zzg = PointerEventHelper.POINTER_TYPE_UNKNOWN;
    private String zzh = PointerEventHelper.POINTER_TYPE_UNKNOWN;
    private String zzi = PointerEventHelper.POINTER_TYPE_UNKNOWN;
    private String zzj = PointerEventHelper.POINTER_TYPE_UNKNOWN;
    private String zzk = PointerEventHelper.POINTER_TYPE_UNKNOWN;
    private String zzl = PointerEventHelper.POINTER_TYPE_UNKNOWN;
    private String zzm = PointerEventHelper.POINTER_TYPE_UNKNOWN;
    private String zzn = PointerEventHelper.POINTER_TYPE_UNKNOWN;
    private String zzo = PointerEventHelper.POINTER_TYPE_UNKNOWN;
    private String zzp = PointerEventHelper.POINTER_TYPE_UNKNOWN;
    private String zzq = PointerEventHelper.POINTER_TYPE_UNKNOWN;
    private String zzr = PointerEventHelper.POINTER_TYPE_UNKNOWN;

    static {
        C2912H c2912h = new C2912H();
        zzb = c2912h;
        P0.y(C2912H.class, c2912h);
    }

    private C2912H() {
    }

    public static C2912H G() {
        return zzb;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.P0
    protected final Object E(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return P0.v(zzb, "\u0004\u000e\u0000\u0001\u0001\u000e\u000e\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဈ\u0005\u0007ဈ\u0006\bဈ\u0007\tဈ\b\nဈ\t\u000bဈ\n\fဈ\u000b\rဈ\f\u000eဈ\r", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", "zzm", "zzn", "zzo", "zzp", "zzq", "zzr"});
        }
        if (i11 == 3) {
            return new C2912H();
        }
        AbstractC2922b abstractC2922b = null;
        if (i11 == 4) {
            return new C2911G(abstractC2922b);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }

    public final String H() {
        return this.zzk;
    }

    public final String I() {
        return this.zzl;
    }

    public final String J() {
        return this.zzj;
    }

    public final String K() {
        return this.zzm;
    }

    public final String L() {
        return this.zzq;
    }

    public final String M() {
        return this.zze;
    }

    public final String N() {
        return this.zzp;
    }

    public final String O() {
        return this.zzf;
    }

    public final String P() {
        return this.zzi;
    }

    public final String Q() {
        return this.zzo;
    }

    public final String R() {
        return this.zzr;
    }

    public final String S() {
        return this.zzh;
    }

    public final String T() {
        return this.zzn;
    }

    public final String U() {
        return this.zzg;
    }
}
