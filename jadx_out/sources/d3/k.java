package d3;

import android.graphics.ColorSpace;
import com.facebook.imageutils.BitmapUtil;
import com.facebook.imageutils.HeifExifUtil;
import com.facebook.imageutils.ImageMetaData;
import com.facebook.imageutils.JfifUtil;
import com.facebook.imageutils.WebpUtil;
import com.facebook.react.uimanager.events.PointerEventHelper;
import g2.AbstractC2662a;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import kotlin.Pair;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public class k implements Closeable {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static boolean f25574t;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final AbstractC2662a f25575g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final c2.n f25576h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private Q2.c f25577i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f25578j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f25579k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f25580l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f25581m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f25582n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f25583o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private X2.b f25584p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private ColorSpace f25585q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private String f25586r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private boolean f25587s;

    public k(AbstractC2662a abstractC2662a) {
        this.f25577i = Q2.c.f9081d;
        this.f25578j = -1;
        this.f25579k = 0;
        this.f25580l = -1;
        this.f25581m = -1;
        this.f25582n = 1;
        this.f25583o = -1;
        c2.k.b(Boolean.valueOf(AbstractC2662a.d0(abstractC2662a)));
        this.f25575g = abstractC2662a.clone();
        this.f25576h = null;
    }

    private ImageMetaData A0() throws Throwable {
        InputStream inputStreamJ;
        try {
            inputStreamJ = J();
        } catch (Throwable th) {
            th = th;
            inputStreamJ = null;
        }
        try {
            ImageMetaData imageMetaDataDecodeDimensionsAndColorSpace = BitmapUtil.decodeDimensionsAndColorSpace(inputStreamJ);
            this.f25585q = imageMetaDataDecodeDimensionsAndColorSpace.getColorSpace();
            Pair<Integer, Integer> dimensions = imageMetaDataDecodeDimensionsAndColorSpace.getDimensions();
            if (dimensions != null) {
                this.f25580l = ((Integer) dimensions.getFirst()).intValue();
                this.f25581m = ((Integer) dimensions.getSecond()).intValue();
            }
            if (inputStreamJ != null) {
                try {
                    inputStreamJ.close();
                } catch (IOException unused) {
                }
            }
            return imageMetaDataDecodeDimensionsAndColorSpace;
        } catch (Throwable th2) {
            th = th2;
            if (inputStreamJ != null) {
                try {
                    inputStreamJ.close();
                } catch (IOException unused2) {
                }
            }
            throw th;
        }
    }

    private Pair D0() {
        InputStream inputStreamJ = J();
        if (inputStreamJ == null) {
            return null;
        }
        Pair<Integer, Integer> size = WebpUtil.getSize(inputStreamJ);
        if (size != null) {
            this.f25580l = ((Integer) size.getFirst()).intValue();
            this.f25581m = ((Integer) size.getSecond()).intValue();
        }
        return size;
    }

    public static k e(k kVar) {
        if (kVar != null) {
            return kVar.d();
        }
        return null;
    }

    private void i0() {
        Q2.c cVarD = Q2.e.d(J());
        this.f25577i = cVarD;
        Pair<Integer, Integer> pairD0 = Q2.b.b(cVarD) ? D0() : A0().getDimensions();
        if (cVarD == Q2.b.f9065b && this.f25578j == -1) {
            if (pairD0 != null) {
                int orientation = JfifUtil.getOrientation(J());
                this.f25579k = orientation;
                this.f25578j = JfifUtil.getAutoRotateAngleFromOrientation(orientation);
                return;
            }
            return;
        }
        if (cVarD == Q2.b.f9075l && this.f25578j == -1) {
            int orientation2 = HeifExifUtil.getOrientation(J());
            this.f25579k = orientation2;
            this.f25578j = JfifUtil.getAutoRotateAngleFromOrientation(orientation2);
        } else if (this.f25578j == -1) {
            this.f25578j = 0;
        }
    }

    public static void k(k kVar) {
        if (kVar != null) {
            kVar.close();
        }
    }

    public static boolean l0(k kVar) {
        return kVar.f25578j >= 0 && kVar.f25580l >= 0 && kVar.f25581m >= 0;
    }

    public static boolean u0(k kVar) {
        return kVar != null && kVar.t0();
    }

    private void y0() {
        if (this.f25580l < 0 || this.f25581m < 0) {
            w0();
        }
    }

    public ColorSpace A() {
        y0();
        return this.f25585q;
    }

    public String B(int i10) {
        AbstractC2662a abstractC2662aR = r();
        if (abstractC2662aR == null) {
            return PointerEventHelper.POINTER_TYPE_UNKNOWN;
        }
        int iMin = Math.min(X(), i10);
        byte[] bArr = new byte[iMin];
        try {
            f2.h hVar = (f2.h) abstractC2662aR.J();
            if (hVar == null) {
                return PointerEventHelper.POINTER_TYPE_UNKNOWN;
            }
            hVar.h(0, bArr, 0, iMin);
            abstractC2662aR.close();
            StringBuilder sb = new StringBuilder(iMin * 2);
            for (int i11 = 0; i11 < iMin; i11++) {
                sb.append(String.format("%02X", Byte.valueOf(bArr[i11])));
            }
            return sb.toString();
        } finally {
            abstractC2662aR.close();
        }
    }

    public int F() {
        y0();
        return this.f25578j;
    }

    public Q2.c I() {
        y0();
        return this.f25577i;
    }

    public int I0() {
        y0();
        return this.f25579k;
    }

    public InputStream J() {
        c2.n nVar = this.f25576h;
        if (nVar != null) {
            return (InputStream) nVar.get();
        }
        AbstractC2662a abstractC2662aR = AbstractC2662a.r(this.f25575g);
        if (abstractC2662aR == null) {
            return null;
        }
        try {
            return new f2.j((f2.h) abstractC2662aR.J());
        } finally {
            AbstractC2662a.B(abstractC2662aR);
        }
    }

    public void J0(X2.b bVar) {
        this.f25584p = bVar;
    }

    public void K0(int i10) {
        this.f25579k = i10;
    }

    public void L0(int i10) {
        this.f25581m = i10;
    }

    public InputStream M() {
        return (InputStream) c2.k.g(J());
    }

    public void M0(Q2.c cVar) {
        this.f25577i = cVar;
    }

    public void N0(int i10) {
        this.f25578j = i10;
    }

    public void O0(int i10) {
        this.f25582n = i10;
    }

    public void P0(String str) {
        this.f25586r = str;
    }

    public void Q0(int i10) {
        this.f25580l = i10;
    }

    public int W() {
        return this.f25582n;
    }

    public int X() {
        AbstractC2662a abstractC2662a = this.f25575g;
        return (abstractC2662a == null || abstractC2662a.J() == null) ? this.f25583o : ((f2.h) this.f25575g.J()).size();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        AbstractC2662a.B(this.f25575g);
    }

    public k d() {
        k kVar;
        c2.n nVar = this.f25576h;
        if (nVar != null) {
            kVar = new k(nVar, this.f25583o);
        } else {
            AbstractC2662a abstractC2662aR = AbstractC2662a.r(this.f25575g);
            if (abstractC2662aR == null) {
                kVar = null;
            } else {
                try {
                    kVar = new k(abstractC2662aR);
                } finally {
                    AbstractC2662a.B(abstractC2662aR);
                }
            }
        }
        if (kVar != null) {
            kVar.m(this);
        }
        return kVar;
    }

    public String d0() {
        return this.f25586r;
    }

    protected boolean g0() {
        return this.f25587s;
    }

    public int getHeight() {
        y0();
        return this.f25581m;
    }

    public int getWidth() {
        y0();
        return this.f25580l;
    }

    public boolean k0(int i10) {
        Q2.c cVar = this.f25577i;
        if ((cVar != Q2.b.f9065b && cVar != Q2.b.f9076m) || this.f25576h != null) {
            return true;
        }
        c2.k.g(this.f25575g);
        f2.h hVar = (f2.h) this.f25575g.J();
        return i10 >= 2 && hVar.g(i10 + (-2)) == -1 && hVar.g(i10 - 1) == -39;
    }

    public void m(k kVar) {
        this.f25577i = kVar.I();
        this.f25580l = kVar.getWidth();
        this.f25581m = kVar.getHeight();
        this.f25578j = kVar.F();
        this.f25579k = kVar.I0();
        this.f25582n = kVar.W();
        this.f25583o = kVar.X();
        this.f25584p = kVar.s();
        this.f25585q = kVar.A();
        this.f25587s = kVar.g0();
    }

    public AbstractC2662a r() {
        return AbstractC2662a.r(this.f25575g);
    }

    public X2.b s() {
        return this.f25584p;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0012  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public synchronized boolean t0() {
        boolean z10;
        if (!AbstractC2662a.d0(this.f25575g)) {
            z10 = this.f25576h != null;
        }
        return z10;
    }

    public void w0() {
        if (!f25574t) {
            i0();
        } else {
            if (this.f25587s) {
                return;
            }
            i0();
            this.f25587s = true;
        }
    }

    public k(c2.n nVar) {
        this.f25577i = Q2.c.f9081d;
        this.f25578j = -1;
        this.f25579k = 0;
        this.f25580l = -1;
        this.f25581m = -1;
        this.f25582n = 1;
        this.f25583o = -1;
        c2.k.g(nVar);
        this.f25575g = null;
        this.f25576h = nVar;
    }

    public k(c2.n nVar, int i10) {
        this(nVar);
        this.f25583o = i10;
    }
}
