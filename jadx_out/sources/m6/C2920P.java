package m6;

import com.google.android.gms.internal.mlkit_vision_barcode_bundled.InterfaceC2191s1;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.P0;

/* JADX INFO: renamed from: m6.P, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class C2920P extends P0 implements InterfaceC2191s1 {
    private static final C2920P zzb;
    private int zzd;
    private double zze;
    private double zzf;
    private byte zzg = 2;

    static {
        C2920P c2920p = new C2920P();
        zzb = c2920p;
        P0.y(C2920P.class, c2920p);
    }

    private C2920P() {
    }

    public static C2920P I() {
        return zzb;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.P0
    protected final Object E(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return Byte.valueOf(this.zzg);
        }
        if (i11 == 2) {
            return P0.v(zzb, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0002\u0001ᔀ\u0000\u0002ᔀ\u0001", new Object[]{"zzd", "zze", "zzf"});
        }
        if (i11 == 3) {
            return new C2920P();
        }
        AbstractC2922b abstractC2922b = null;
        if (i11 == 4) {
            return new C2919O(abstractC2922b);
        }
        if (i11 == 5) {
            return zzb;
        }
        this.zzg = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }

    public final double F() {
        return this.zze;
    }

    public final double G() {
        return this.zzf;
    }
}
