package m6;

import com.facebook.react.uimanager.events.PointerEventHelper;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.InterfaceC2191s1;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.P0;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.W0;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class z extends P0 implements InterfaceC2191s1 {
    private static final z zzb;
    private int zzd;
    private String zze = PointerEventHelper.POINTER_TYPE_UNKNOWN;
    private W0 zzf = P0.s();

    static {
        z zVar = new z();
        zzb = zVar;
        P0.y(z.class, zVar);
    }

    private z() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.P0
    protected final Object E(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return P0.v(zzb, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001b", new Object[]{"zzd", "zze", "zzf", C2918N.class});
        }
        if (i11 == 3) {
            return new z();
        }
        AbstractC2922b abstractC2922b = null;
        if (i11 == 4) {
            return new y(abstractC2922b);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }
}
