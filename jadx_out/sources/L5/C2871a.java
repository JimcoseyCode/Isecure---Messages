package l5;

import com.google.android.gms.internal.mlkit_vision_barcode_bundled.InterfaceC2191s1;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.P0;

/* JADX INFO: renamed from: l5.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class C2871a extends P0 implements InterfaceC2191s1 {
    private static final C2871a zzb;
    private int zzd;
    private m zze;
    private e zzf;
    private u zzg;

    static {
        C2871a c2871a = new C2871a();
        zzb = c2871a;
        P0.y(C2871a.class, c2871a);
    }

    private C2871a() {
    }

    public static o F() {
        return (o) zzb.j();
    }

    static /* synthetic */ void H(C2871a c2871a, m mVar) {
        mVar.getClass();
        c2871a.zze = mVar;
        c2871a.zzd |= 1;
    }

    static /* synthetic */ void I(C2871a c2871a, e eVar) {
        eVar.getClass();
        c2871a.zzf = eVar;
        c2871a.zzd |= 2;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.P0
    protected final Object E(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return P0.v(zzb, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002", new Object[]{"zzd", "zze", "zzf", "zzg"});
        }
        if (i11 == 3) {
            return new C2871a();
        }
        n nVar = null;
        if (i11 == 4) {
            return new o(nVar);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }
}
