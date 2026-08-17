package l5;

import com.facebook.react.uimanager.events.PointerEventHelper;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.AbstractC2171o0;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.C2178p2;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.InterfaceC2191s1;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.P0;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class m extends P0 implements InterfaceC2191s1 {
    private static final m zzb;
    private int zzd;
    private j zzj;
    private C2178p2 zzl;
    private String zze = PointerEventHelper.POINTER_TYPE_UNKNOWN;
    private AbstractC2171o0 zzf = AbstractC2171o0.f22405h;
    private int zzg = 10;
    private float zzh = 0.5f;
    private float zzi = 0.05f;
    private int zzk = 1;
    private int zzm = 320;
    private int zzn = 4;
    private int zzo = 2;

    static {
        m mVar = new m();
        zzb = mVar;
        P0.y(m.class, mVar);
    }

    private m() {
    }

    public static l F() {
        return (l) zzb.j();
    }

    static /* synthetic */ void H(m mVar, j jVar) {
        jVar.getClass();
        mVar.zzj = jVar;
        mVar.zzd |= 32;
    }

    static /* synthetic */ void I(m mVar, AbstractC2171o0 abstractC2171o0) {
        abstractC2171o0.getClass();
        mVar.zzd |= 2;
        mVar.zzf = abstractC2171o0;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.P0
    protected final Object E(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return P0.v(zzb, "\u0004\u000b\u0000\u0001\u0001\f\u000b\u0000\u0000\u0000\u0001ဈ\u0000\u0002ည\u0001\u0003ဋ\u0002\u0004ခ\u0003\u0005ခ\u0004\u0006ဉ\u0005\bင\u0006\tဉ\u0007\nင\b\u000bင\t\fင\n", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", "zzm", "zzn", "zzo"});
        }
        if (i11 == 3) {
            return new m();
        }
        k kVar = null;
        if (i11 == 4) {
            return new l(kVar);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }
}
