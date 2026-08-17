package m6;

import com.google.android.gms.internal.mlkit_vision_barcode_bundled.InterfaceC2191s1;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.P0;

/* JADX INFO: renamed from: m6.B, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class C2906B extends P0 implements InterfaceC2191s1 {
    private static final C2906B zzb;
    private int zzd;
    private int zze;
    private int zzf;
    private int zzg;
    private int zzh;
    private int zzi;
    private int zzj;
    private boolean zzk;

    static {
        C2906B c2906b = new C2906B();
        zzb = c2906b;
        P0.y(C2906B.class, c2906b);
    }

    private C2906B() {
    }

    public static C2906B M() {
        return zzb;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.P0
    protected final Object E(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return P0.v(zzb, "\u0004\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003င\u0002\u0004င\u0003\u0005င\u0004\u0006င\u0005\u0007ဇ\u0006", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk"});
        }
        if (i11 == 3) {
            return new C2906B();
        }
        AbstractC2922b abstractC2922b = null;
        if (i11 == 4) {
            return new C2905A(abstractC2922b);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }

    public final int F() {
        return this.zzg;
    }

    public final int G() {
        return this.zzh;
    }

    public final int H() {
        return this.zzi;
    }

    public final int I() {
        return this.zzf;
    }

    public final int J() {
        return this.zzj;
    }

    public final int K() {
        return this.zze;
    }

    public final boolean N() {
        return this.zzk;
    }
}
