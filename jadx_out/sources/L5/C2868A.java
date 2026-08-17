package l5;

import com.google.android.gms.internal.mlkit_vision_barcode_bundled.AbstractC2171o0;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.C2178p2;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.InterfaceC2191s1;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.P0;

/* JADX INFO: renamed from: l5.A, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class C2868A extends P0 implements InterfaceC2191s1 {
    private static final C2868A zzb;
    private int zzd;
    private C2178p2 zzf;
    private AbstractC2171o0 zze = AbstractC2171o0.f22405h;
    private int zzg = 1;
    private float zzh = 0.75f;
    private boolean zzi = true;

    static {
        C2868A c2868a = new C2868A();
        zzb = c2868a;
        P0.y(C2868A.class, c2868a);
    }

    private C2868A() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.P0
    protected final Object E(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return P0.v(zzb, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ည\u0000\u0002ဉ\u0001\u0003င\u0002\u0004ခ\u0003\u0005ဇ\u0004", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi"});
        }
        if (i11 == 3) {
            return new C2868A();
        }
        y yVar = null;
        if (i11 == 4) {
            return new z(yVar);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }
}
