package l5;

import com.google.android.gms.internal.mlkit_vision_barcode_bundled.InterfaceC2191s1;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.P0;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class x extends P0 implements InterfaceC2191s1 {
    private static final x zzb;

    static {
        x xVar = new x();
        zzb = xVar;
        P0.y(x.class, xVar);
    }

    private x() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.P0
    protected final Object E(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        v vVar = null;
        if (i11 == 2) {
            return P0.v(zzb, "\u0001\u0000", null);
        }
        if (i11 == 3) {
            return new x();
        }
        if (i11 == 4) {
            return new w(vVar);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }
}
