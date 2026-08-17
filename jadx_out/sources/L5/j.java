package l5;

import com.google.android.gms.internal.mlkit_vision_barcode_bundled.InterfaceC2191s1;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.P0;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.W0;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class j extends P0 implements InterfaceC2191s1 {
    private static final j zzb;
    private W0 zzd = P0.s();

    static {
        j jVar = new j();
        zzb = jVar;
        P0.y(j.class, jVar);
    }

    private j() {
    }

    public static i F() {
        return (i) zzb.j();
    }

    static /* synthetic */ void H(j jVar, g gVar) {
        gVar.getClass();
        W0 w02 = jVar.zzd;
        if (!w02.a()) {
            jVar.zzd = P0.t(w02);
        }
        jVar.zzd.add(gVar);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.P0
    protected final Object E(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return P0.v(zzb, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zzd", g.class});
        }
        if (i11 == 3) {
            return new j();
        }
        h hVar = null;
        if (i11 == 4) {
            return new i(hVar);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }
}
