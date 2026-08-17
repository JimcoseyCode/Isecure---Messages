package l5;

import com.google.android.gms.internal.mlkit_vision_barcode_bundled.InterfaceC2191s1;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.P0;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.U0;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class g extends P0 implements InterfaceC2191s1 {
    private static final g zzb;
    private int zzd;
    private U0 zze = P0.p();
    private U0 zzf = P0.p();
    private int zzg;
    private int zzh;
    private int zzi;
    private int zzj;

    static {
        g gVar = new g();
        zzb = gVar;
        P0.y(g.class, gVar);
    }

    private g() {
    }

    public static f F() {
        return (f) zzb.j();
    }

    static /* synthetic */ void H(g gVar, int i10) {
        gVar.zzd |= 2;
        gVar.zzh = i10;
    }

    static /* synthetic */ void I(g gVar, float f10) {
        U0 u02 = gVar.zze;
        if (!u02.a()) {
            gVar.zze = P0.q(u02);
        }
        gVar.zze.m(f10);
    }

    static /* synthetic */ void J(g gVar, float f10) {
        U0 u02 = gVar.zzf;
        if (!u02.a()) {
            gVar.zzf = P0.q(u02);
        }
        gVar.zzf.m(f10);
    }

    static /* synthetic */ void K(g gVar, int i10) {
        gVar.zzd |= 1;
        gVar.zzg = i10;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.P0
    protected final Object E(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return P0.v(zzb, "\u0004\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0002\u0000\u0001\u0013\u0002\u0013\u0003ဋ\u0000\u0004ဋ\u0001\u0005ဋ\u0002\u0006ဋ\u0003", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj"});
        }
        if (i11 == 3) {
            return new g();
        }
        AbstractC2872b abstractC2872b = null;
        if (i11 == 4) {
            return new f(abstractC2872b);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }
}
