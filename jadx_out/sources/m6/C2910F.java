package m6;

import com.facebook.react.uimanager.events.PointerEventHelper;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.InterfaceC2191s1;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.P0;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.S;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.U;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.W0;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.Y;
import java.util.List;

/* JADX INFO: renamed from: m6.F, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class C2910F extends P0 implements InterfaceC2191s1 {
    private static final C2910F zzb;
    private int zzd;
    private U zze;
    private byte zzm = 2;
    private String zzf = PointerEventHelper.POINTER_TYPE_UNKNOWN;
    private String zzg = PointerEventHelper.POINTER_TYPE_UNKNOWN;
    private W0 zzh = P0.s();
    private W0 zzi = P0.s();
    private W0 zzj = P0.s();
    private W0 zzk = P0.s();
    private String zzl = PointerEventHelper.POINTER_TYPE_UNKNOWN;

    static {
        C2910F c2910f = new C2910F();
        zzb = c2910f;
        P0.y(C2910F.class, c2910f);
    }

    private C2910F() {
    }

    public static C2910F H() {
        return zzb;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.P0
    protected final Object E(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return Byte.valueOf(this.zzm);
        }
        if (i11 == 2) {
            return P0.v(zzb, "\u0004\b\u0000\u0001\u0001\b\b\u0000\u0004\u0001\u0001ဉ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004\u001b\u0005\u001b\u0006\u001a\u0007Л\bဈ\u0003", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", Y.class, "zzi", C2916L.class, "zzj", "zzk", S.class, "zzl"});
        }
        if (i11 == 3) {
            return new C2910F();
        }
        AbstractC2922b abstractC2922b = null;
        if (i11 == 4) {
            return new C2909E(abstractC2922b);
        }
        if (i11 == 5) {
            return zzb;
        }
        this.zzm = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }

    public final U F() {
        U u10 = this.zze;
        return u10 == null ? U.G() : u10;
    }

    public final String I() {
        return this.zzf;
    }

    public final String J() {
        return this.zzg;
    }

    public final List K() {
        return this.zzk;
    }

    public final List L() {
        return this.zzi;
    }

    public final List M() {
        return this.zzh;
    }

    public final List N() {
        return this.zzj;
    }
}
