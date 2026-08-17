package m6;

import com.facebook.react.uimanager.events.PointerEventHelper;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.InterfaceC2191s1;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.P0;

/* JADX INFO: renamed from: m6.j, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class C2930j extends P0 implements InterfaceC2191s1 {
    private static final C2930j zzb;
    private int zzd;
    private byte zzg = 2;
    private String zze = PointerEventHelper.POINTER_TYPE_UNKNOWN;
    private String zzf = PointerEventHelper.POINTER_TYPE_UNKNOWN;

    static {
        C2930j c2930j = new C2930j();
        zzb = c2930j;
        P0.y(C2930j.class, c2930j);
    }

    private C2930j() {
    }

    public static C2930j G() {
        return zzb;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.P0
    protected final Object E(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return Byte.valueOf(this.zzg);
        }
        if (i11 == 2) {
            return P0.v(zzb, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001ဈ\u0000\u0002ᔈ\u0001", new Object[]{"zzd", "zze", "zzf"});
        }
        if (i11 == 3) {
            return new C2930j();
        }
        AbstractC2922b abstractC2922b = null;
        if (i11 == 4) {
            return new C2929i(abstractC2922b);
        }
        if (i11 == 5) {
            return zzb;
        }
        this.zzg = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }

    public final String H() {
        return this.zze;
    }

    public final String I() {
        return this.zzf;
    }
}
