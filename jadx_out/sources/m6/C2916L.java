package m6;

import com.facebook.react.uimanager.events.PointerEventHelper;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.InterfaceC2191s1;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.P0;

/* JADX INFO: renamed from: m6.L, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class C2916L extends P0 implements InterfaceC2191s1 {
    private static final C2916L zzb;
    private int zzd;
    private int zze;
    private String zzf = PointerEventHelper.POINTER_TYPE_UNKNOWN;
    private String zzg = PointerEventHelper.POINTER_TYPE_UNKNOWN;
    private String zzh = PointerEventHelper.POINTER_TYPE_UNKNOWN;

    static {
        C2916L c2916l = new C2916L();
        zzb = c2916l;
        P0.y(C2916L.class, c2916l);
    }

    private C2916L() {
    }

    public static C2916L G() {
        return zzb;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.P0
    protected final Object E(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return P0.v(zzb, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001᠌\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003", new Object[]{"zzd", "zze", C2914J.f29625a, "zzf", "zzg", "zzh"});
        }
        if (i11 == 3) {
            return new C2916L();
        }
        AbstractC2922b abstractC2922b = null;
        if (i11 == 4) {
            return new C2913I(abstractC2922b);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }

    public final String H() {
        return this.zzf;
    }

    public final String I() {
        return this.zzh;
    }

    public final String J() {
        return this.zzg;
    }

    public final int K() {
        int iA = AbstractC2915K.a(this.zze);
        if (iA == 0) {
            return 1;
        }
        return iA;
    }
}
