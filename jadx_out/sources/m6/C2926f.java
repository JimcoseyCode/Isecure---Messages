package m6;

import com.google.android.gms.internal.mlkit_vision_barcode_bundled.InterfaceC2191s1;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.P0;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.W0;

/* JADX INFO: renamed from: m6.f, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class C2926f extends P0 implements InterfaceC2191s1 {
    private static final C2926f zzb;
    private W0 zzd = P0.s();

    static {
        C2926f c2926f = new C2926f();
        zzb = c2926f;
        P0.y(C2926f.class, c2926f);
    }

    private C2926f() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.P0
    protected final Object E(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return P0.v(zzb, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zzd", C2925e.class});
        }
        if (i11 == 3) {
            return new C2926f();
        }
        AbstractC2922b abstractC2922b = null;
        if (i11 == 4) {
            return new C2923c(abstractC2922b);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }
}
