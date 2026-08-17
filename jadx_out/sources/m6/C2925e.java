package m6;

import com.google.android.gms.internal.mlkit_vision_barcode_bundled.AbstractC2171o0;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.InterfaceC2191s1;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.P0;

/* JADX INFO: renamed from: m6.e, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class C2925e extends P0 implements InterfaceC2191s1 {
    private static final C2925e zzb;
    private int zzd;
    private int zze;
    private AbstractC2171o0 zzf = AbstractC2171o0.f22405h;

    static {
        C2925e c2925e = new C2925e();
        zzb = c2925e;
        P0.y(C2925e.class, c2925e);
    }

    private C2925e() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.P0
    protected final Object E(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return P0.v(zzb, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002ည\u0001", new Object[]{"zzd", "zze", "zzf"});
        }
        if (i11 == 3) {
            return new C2925e();
        }
        AbstractC2922b abstractC2922b = null;
        if (i11 == 4) {
            return new C2924d(abstractC2922b);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }
}
