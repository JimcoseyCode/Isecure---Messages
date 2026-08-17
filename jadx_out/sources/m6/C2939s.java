package m6;

import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.facebook.react.uimanager.events.PointerEventHelper;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.AbstractC2171o0;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.InterfaceC2191s1;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.P0;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.V0;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.W0;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.Y;
import java.util.List;

/* JADX INFO: renamed from: m6.s, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class C2939s extends P0 implements InterfaceC2191s1 {
    private static final C2939s zzb;
    private byte zzA = 2;
    private int zzd;
    private int zze;
    private AbstractC2171o0 zzf;
    private String zzg;
    private C2926f zzh;
    private int zzi;
    private C2910F zzj;
    private C2916L zzk;
    private Y zzl;
    private C2930j zzm;
    private C2937q zzn;
    private C2933m zzo;
    private C2920P zzp;
    private C2908D zzq;
    private C2912H zzr;
    private z zzs;
    private W0 zzt;
    private V0 zzu;
    private String zzv;
    private W0 zzw;
    private boolean zzx;
    private double zzy;
    private AbstractC2171o0 zzz;

    static {
        C2939s c2939s = new C2939s();
        zzb = c2939s;
        P0.y(C2939s.class, c2939s);
    }

    private C2939s() {
        AbstractC2171o0 abstractC2171o0 = AbstractC2171o0.f22405h;
        this.zzf = abstractC2171o0;
        this.zzg = PointerEventHelper.POINTER_TYPE_UNKNOWN;
        this.zzt = P0.s();
        this.zzu = P0.r();
        this.zzv = PointerEventHelper.POINTER_TYPE_UNKNOWN;
        this.zzw = P0.s();
        this.zzx = true;
        this.zzz = abstractC2171o0;
    }

    static /* synthetic */ void U(C2939s c2939s, int i10, C2928h c2928h) {
        c2928h.getClass();
        W0 w02 = c2939s.zzt;
        if (!w02.a()) {
            c2939s.zzt = P0.t(w02);
        }
        c2939s.zzt.set(i10, c2928h);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.P0
    protected final Object E(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return Byte.valueOf(this.zzA);
        }
        if (i11 == 2) {
            return P0.v(zzb, "\u0004\u0016\u0000\u0001\u0001\u0017\u0016\u0000\u0003\u000b\u0001ᴌ\u0000\u0002ᔊ\u0001\u0003ᔈ\u0002\u0004ᴌ\u0004\u0005ᐉ\u0005\u0006ဉ\u0006\u0007ဉ\u0007\bᐉ\b\tᐉ\t\nᐉ\n\u000bЛ\fဈ\u000f\rЛ\u000eည\u0012\u000fᐉ\u000b\u0010ဉ\f\u0011ဉ\r\u0012\u0016\u0013ဉ\u000e\u0014ဇ\u0010\u0015က\u0011\u0017ဉ\u0003", new Object[]{"zzd", "zze", C2940t.f29628a, "zzf", "zzg", "zzi", v.f29629a, "zzj", "zzk", "zzl", "zzm", "zzn", "zzo", "zzt", C2928h.class, "zzv", "zzw", C2928h.class, "zzz", "zzp", "zzq", "zzr", "zzu", "zzs", "zzx", "zzy", "zzh"});
        }
        if (i11 == 3) {
            return new C2939s();
        }
        AbstractC2922b abstractC2922b = null;
        if (i11 == 4) {
            return new C2938r(abstractC2922b);
        }
        if (i11 == 5) {
            return zzb;
        }
        this.zzA = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }

    public final int F() {
        int iA = w.a(this.zzi);
        if (iA == 0) {
            return 1;
        }
        return iA;
    }

    public final int G() {
        return this.zzt.size();
    }

    public final Y H() {
        Y y10 = this.zzl;
        return y10 == null ? Y.G() : y10;
    }

    public final C2908D J() {
        C2908D c2908d = this.zzq;
        return c2908d == null ? C2908D.I() : c2908d;
    }

    public final C2910F K() {
        C2910F c2910f = this.zzj;
        return c2910f == null ? C2910F.H() : c2910f;
    }

    public final C2912H L() {
        C2912H c2912h = this.zzr;
        return c2912h == null ? C2912H.G() : c2912h;
    }

    public final C2916L M() {
        C2916L c2916l = this.zzk;
        return c2916l == null ? C2916L.G() : c2916l;
    }

    public final C2920P N() {
        C2920P c2920p = this.zzp;
        return c2920p == null ? C2920P.I() : c2920p;
    }

    public final C2930j O() {
        C2930j c2930j = this.zzm;
        return c2930j == null ? C2930j.G() : c2930j;
    }

    public final C2933m P() {
        C2933m c2933m = this.zzo;
        return c2933m == null ? C2933m.G() : c2933m;
    }

    public final C2937q Q() {
        C2937q c2937q = this.zzn;
        return c2937q == null ? C2937q.G() : c2937q;
    }

    public final AbstractC2171o0 R() {
        return this.zzf;
    }

    public final String S() {
        return this.zzg;
    }

    public final List T() {
        return this.zzt;
    }

    public final boolean V() {
        return (this.zzd & 4096) != 0;
    }

    public final boolean W() {
        return (this.zzd & 32) != 0;
    }

    public final boolean X() {
        return (this.zzd & 8192) != 0;
    }

    public final boolean Y() {
        return (this.zzd & 64) != 0;
    }

    public final boolean Z() {
        return (this.zzd & 2048) != 0;
    }

    public final boolean a0() {
        return (this.zzd & IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) != 0;
    }

    public final boolean b0() {
        return (this.zzd & 256) != 0;
    }

    public final boolean c0() {
        return (this.zzd & IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET) != 0;
    }

    public final boolean d0() {
        return (this.zzd & IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING) != 0;
    }

    public final int e0() {
        int iA = u.a(this.zze);
        if (iA == 0) {
            return 1;
        }
        return iA;
    }
}
