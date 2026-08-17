package m6;

import com.google.android.gms.internal.mlkit_vision_barcode_bundled.InterfaceC2191s1;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.P0;

/* JADX INFO: renamed from: m6.h, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class C2928h extends P0 implements InterfaceC2191s1 {
    private static final C2928h zzb;
    private int zzd;
    private int zze;
    private int zzf;
    private byte zzg = 2;

    static {
        C2928h c2928h = new C2928h();
        zzb = c2928h;
        P0.y(C2928h.class, c2928h);
    }

    private C2928h() {
    }

    public static C2927g H() {
        return (C2927g) zzb.j();
    }

    static /* synthetic */ void J(C2928h c2928h, int i10) {
        c2928h.zzd |= 1;
        c2928h.zze = i10;
    }

    static /* synthetic */ void K(C2928h c2928h, int i10) {
        c2928h.zzd |= 2;
        c2928h.zzf = i10;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.P0
    protected final Object E(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return Byte.valueOf(this.zzg);
        }
        if (i11 == 2) {
            return P0.v(zzb, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0002\u0001ᔄ\u0000\u0002ᔄ\u0001", new Object[]{"zzd", "zze", "zzf"});
        }
        if (i11 == 3) {
            return new C2928h();
        }
        AbstractC2922b abstractC2922b = null;
        if (i11 == 4) {
            return new C2927g(abstractC2922b);
        }
        if (i11 == 5) {
            return zzb;
        }
        this.zzg = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }

    public final int F() {
        return this.zze;
    }

    public final int G() {
        return this.zzf;
    }
}
