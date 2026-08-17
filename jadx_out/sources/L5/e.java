package l5;

import com.facebook.react.uimanager.events.PointerEventHelper;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.AbstractC2171o0;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.InterfaceC2191s1;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.P0;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class e extends P0 implements InterfaceC2191s1 {
    private static final e zzb;
    private int zzd;
    private String zze = PointerEventHelper.POINTER_TYPE_UNKNOWN;
    private AbstractC2171o0 zzf;
    private String zzg;
    private AbstractC2171o0 zzh;
    private float zzi;
    private float zzj;
    private float zzk;
    private float zzl;
    private int zzm;

    static {
        e eVar = new e();
        zzb = eVar;
        P0.y(e.class, eVar);
    }

    private e() {
        AbstractC2171o0 abstractC2171o0 = AbstractC2171o0.f22405h;
        this.zzf = abstractC2171o0;
        this.zzg = PointerEventHelper.POINTER_TYPE_UNKNOWN;
        this.zzh = abstractC2171o0;
        this.zzi = 0.25f;
        this.zzj = 0.25f;
        this.zzk = 0.5f;
        this.zzl = 0.85f;
        this.zzm = 1;
    }

    public static C2874d F() {
        return (C2874d) zzb.j();
    }

    static /* synthetic */ void H(e eVar, AbstractC2171o0 abstractC2171o0) {
        abstractC2171o0.getClass();
        eVar.zzd |= 2;
        eVar.zzf = abstractC2171o0;
    }

    static /* synthetic */ void I(e eVar, AbstractC2171o0 abstractC2171o0) {
        abstractC2171o0.getClass();
        eVar.zzd |= 8;
        eVar.zzh = abstractC2171o0;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.P0
    protected final Object E(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return P0.v(zzb, "\u0004\t\u0000\u0001\u0001\t\t\u0000\u0000\u0000\u0001ဈ\u0000\u0002ည\u0001\u0003ဈ\u0002\u0004ည\u0003\u0005ခ\u0004\u0006ခ\u0005\u0007ခ\u0006\bခ\u0007\tင\b", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", "zzm"});
        }
        if (i11 == 3) {
            return new e();
        }
        AbstractC2873c abstractC2873c = null;
        if (i11 == 4) {
            return new C2874d(abstractC2873c);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }
}
