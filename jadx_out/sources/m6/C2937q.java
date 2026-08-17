package m6;

import com.facebook.react.uimanager.events.PointerEventHelper;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.InterfaceC2191s1;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.P0;

/* JADX INFO: renamed from: m6.q, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class C2937q extends P0 implements InterfaceC2191s1 {
    private static final C2937q zzb;
    private int zzd;
    private int zzf;
    private boolean zzh;
    private byte zzi = 2;
    private String zze = PointerEventHelper.POINTER_TYPE_UNKNOWN;
    private String zzg = PointerEventHelper.POINTER_TYPE_UNKNOWN;

    static {
        C2937q c2937q = new C2937q();
        zzb = c2937q;
        P0.y(C2937q.class, c2937q);
    }

    private C2937q() {
    }

    public static C2937q G() {
        return zzb;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.P0
    protected final Object E(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return Byte.valueOf(this.zzi);
        }
        if (i11 == 2) {
            return P0.v(zzb, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0001\u0001ᔈ\u0000\u0002᠌\u0001\u0003ဈ\u0002\u0004ဇ\u0003", new Object[]{"zzd", "zze", "zzf", C2935o.f29627a, "zzg", "zzh"});
        }
        if (i11 == 3) {
            return new C2937q();
        }
        AbstractC2922b abstractC2922b = null;
        if (i11 == 4) {
            return new C2934n(abstractC2922b);
        }
        if (i11 == 5) {
            return zzb;
        }
        this.zzi = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }

    public final String H() {
        return this.zzg;
    }

    public final String I() {
        return this.zze;
    }

    public final int J() {
        int iA = AbstractC2936p.a(this.zzf);
        if (iA == 0) {
            return 1;
        }
        return iA;
    }
}
