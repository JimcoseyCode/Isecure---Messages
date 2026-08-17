package m6;

import com.facebook.react.uimanager.events.PointerEventHelper;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.A0;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.AbstractC2171o0;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.InterfaceC2191s1;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.P0;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.W0;
import java.util.List;

/* JADX INFO: renamed from: m6.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class C2921a extends P0 implements InterfaceC2191s1 {
    private static final C2921a zzb;
    private int zzd;
    private int zzf;
    private byte zzi = 2;
    private W0 zze = P0.s();
    private String zzg = PointerEventHelper.POINTER_TYPE_UNKNOWN;
    private AbstractC2171o0 zzh = AbstractC2171o0.f22405h;

    static {
        C2921a c2921a = new C2921a();
        zzb = c2921a;
        P0.y(C2921a.class, c2921a);
    }

    private C2921a() {
    }

    public static C2921a G(byte[] bArr, A0 a02) {
        return (C2921a) P0.o(zzb, bArr, a02);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.P0
    protected final Object E(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return Byte.valueOf(this.zzi);
        }
        if (i11 == 2) {
            return P0.v(zzb, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0002\u0001Л\u0002ᴌ\u0000\u0003ဈ\u0001\u0004ည\u0002", new Object[]{"zzd", "zze", C2939s.class, "zzf", C2931k.f29626a, "zzg", "zzh"});
        }
        if (i11 == 3) {
            return new C2921a();
        }
        AbstractC2922b abstractC2922b = null;
        if (i11 == 4) {
            return new x(abstractC2922b);
        }
        if (i11 == 5) {
            return zzb;
        }
        this.zzi = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }

    public final List H() {
        return this.zze;
    }
}
