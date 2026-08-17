package m6;

import com.facebook.react.uimanager.events.PointerEventHelper;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.InterfaceC2191s1;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.P0;

/* JADX INFO: renamed from: m6.N, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class C2918N extends P0 implements InterfaceC2191s1 {
    private static final C2918N zzb;
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

    static {
        C2918N c2918n = new C2918N();
        zzb = c2918n;
        P0.y(C2918N.class, c2918n);
    }

    private C2918N() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.P0
    protected final Object E(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return P0.v(zzb, "\u0004\t\u0000\u0001\u0001\t\t\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဈ\u0005\u0007ဈ\u0006\bဈ\u0007\tဈ\b", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", "zzm"});
        }
        if (i11 == 3) {
            return new C2918N();
        }
        AbstractC2922b abstractC2922b = null;
        if (i11 == 4) {
            return new C2917M(abstractC2922b);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }
}
