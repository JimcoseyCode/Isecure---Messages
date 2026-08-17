package androidx.camera.core;

import F.F0;
import H.z;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.media.ImageWriter;
import androidx.camera.core.g;
import androidx.concurrent.futures.c;
import java.nio.ByteBuffer;
import java.util.concurrent.Executor;
import m5.InterfaceFutureC2904a;
import y.AbstractC3577e0;
import y.AbstractC3583h0;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
abstract class j implements F0.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private g.a f15205a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private volatile int f15206b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private volatile int f15207c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private volatile boolean f15209e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private volatile boolean f15210f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Executor f15211g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private r f15212h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private ImageWriter f15213i;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    ByteBuffer f15218n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    ByteBuffer f15219o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    ByteBuffer f15220p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    ByteBuffer f15221q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    ByteBuffer f15222r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    ByteBuffer f15223s;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private volatile int f15208d = 1;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private Rect f15214j = new Rect();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private Rect f15215k = new Rect();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private Matrix f15216l = new Matrix();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private Matrix f15217m = new Matrix();

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final Object f15224t = new Object();

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    protected boolean f15225u = true;

    j() {
    }

    public static /* synthetic */ void b(j jVar, o oVar, Matrix matrix, o oVar2, Rect rect, g.a aVar, c.a aVar2) {
        if (!jVar.f15225u) {
            aVar2.f(new D0.k("ImageAnalysis is detached"));
            return;
        }
        s sVar = new s(oVar2, AbstractC3577e0.f(oVar.i().b(), oVar.i().a(), jVar.f15209e ? 0 : jVar.f15206b, matrix, oVar.i().c()));
        if (!rect.isEmpty()) {
            sVar.b0(rect);
        }
        aVar.analyze(sVar);
        aVar2.c(null);
    }

    public static /* synthetic */ Object c(final j jVar, Executor executor, final o oVar, final Matrix matrix, final o oVar2, final Rect rect, final g.a aVar, final c.a aVar2) {
        jVar.getClass();
        executor.execute(new Runnable() { // from class: androidx.camera.core.h
            @Override // java.lang.Runnable
            public final void run() {
                j.b(this.f15180g, oVar, matrix, oVar2, rect, aVar, aVar2);
            }
        });
        return "analyzeImage";
    }

    private void g(o oVar) {
        if (this.f15208d != 1 && this.f15208d != 3) {
            if (this.f15208d == 2 && this.f15218n == null) {
                this.f15218n = ByteBuffer.allocateDirect(oVar.getWidth() * oVar.getHeight() * 4);
                return;
            }
            return;
        }
        if (this.f15219o == null) {
            this.f15219o = ByteBuffer.allocateDirect(oVar.getWidth() * oVar.getHeight());
        }
        this.f15219o.position(0);
        if (this.f15220p == null) {
            this.f15220p = ByteBuffer.allocateDirect((oVar.getWidth() * oVar.getHeight()) / 4);
        }
        this.f15220p.position(0);
        if (this.f15221q == null) {
            this.f15221q = ByteBuffer.allocateDirect((oVar.getWidth() * oVar.getHeight()) / 4);
        }
        this.f15221q.position(0);
        if (this.f15208d == 3) {
            if (this.f15222r == null) {
                this.f15222r = ByteBuffer.allocateDirect(oVar.getWidth() * oVar.getHeight());
            }
            this.f15222r.position(0);
            if (this.f15223s == null) {
                this.f15223s = ByteBuffer.allocateDirect((oVar.getWidth() * oVar.getHeight()) / 2);
            }
            this.f15223s.position(0);
        }
    }

    private static r h(int i10, int i11, int i12, int i13, int i14) {
        boolean z10 = i12 == 90 || i12 == 270;
        int i15 = z10 ? i11 : i10;
        if (!z10) {
            i10 = i11;
        }
        return new r(p.a(i15, i10, i13, i14));
    }

    static Matrix j(int i10, int i11, int i12, int i13, int i14) {
        Matrix matrix = new Matrix();
        if (i14 > 0) {
            matrix.setRectToRect(new RectF(0.0f, 0.0f, i10, i11), z.f3633a, Matrix.ScaleToFit.FILL);
            matrix.postRotate(i14);
            matrix.postConcat(z.c(new RectF(0.0f, 0.0f, i12, i13)));
        }
        return matrix;
    }

    static Rect k(Rect rect, Matrix matrix) {
        RectF rectF = new RectF(rect);
        matrix.mapRect(rectF);
        Rect rect2 = new Rect();
        rectF.round(rect2);
        return rect2;
    }

    private void m(int i10, int i11, int i12, int i13) {
        Matrix matrixJ = j(i10, i11, i12, i13, this.f15206b);
        this.f15215k = k(this.f15214j, matrixJ);
        this.f15217m.setConcat(this.f15216l, matrixJ);
    }

    private void n(o oVar, int i10) {
        r rVar = this.f15212h;
        if (rVar == null) {
            return;
        }
        rVar.j();
        this.f15212h = h(oVar.getWidth(), oVar.getHeight(), i10, this.f15212h.c(), this.f15212h.f());
        if (this.f15208d == 1) {
            ImageWriter imageWriter = this.f15213i;
            if (imageWriter != null) {
                L.a.a(imageWriter);
            }
            this.f15213i = L.a.c(this.f15212h.getSurface(), this.f15212h.f());
        }
    }

    @Override // F.F0.a
    public void a(F0 f02) {
        try {
            o oVarD = d(f02);
            if (oVarD != null) {
                l(oVarD);
            }
        } catch (IllegalStateException e10) {
            AbstractC3583h0.d("ImageAnalysisAnalyzer", "Failed to acquire image.", e10);
        }
    }

    abstract o d(F0 f02);

    InterfaceFutureC2904a e(final o oVar) throws Throwable {
        Object obj;
        final Executor executor;
        final g.a aVar;
        boolean z10;
        r rVar;
        ImageWriter imageWriter;
        ByteBuffer byteBuffer;
        ByteBuffer byteBuffer2;
        ByteBuffer byteBuffer3;
        ByteBuffer byteBuffer4;
        ByteBuffer byteBuffer5;
        ByteBuffer byteBuffer6;
        o oVarO;
        o oVar2;
        int i10 = this.f15209e ? this.f15206b : 0;
        Object obj2 = this.f15224t;
        synchronized (obj2) {
            try {
                try {
                    executor = this.f15211g;
                    aVar = this.f15205a;
                    z10 = this.f15209e && i10 != this.f15207c;
                    if (z10) {
                        n(oVar, i10);
                    }
                    if (this.f15209e || this.f15208d == 3) {
                        g(oVar);
                    }
                    try {
                        rVar = this.f15212h;
                        try {
                            imageWriter = this.f15213i;
                            byteBuffer = this.f15218n;
                            byteBuffer2 = this.f15219o;
                            byteBuffer3 = this.f15220p;
                            byteBuffer4 = this.f15221q;
                            byteBuffer5 = this.f15222r;
                            byteBuffer6 = this.f15223s;
                        } catch (Throwable th) {
                            th = th;
                            obj = obj2;
                            throw th;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        obj = obj2;
                    }
                } catch (Throwable th3) {
                    th = th3;
                }
            } catch (Throwable th4) {
                th = th4;
                obj = obj2;
            }
        }
        if (aVar == null || executor == null || !this.f15225u) {
            return J.n.n(new D0.k("No analyzer or executor currently set."));
        }
        if (rVar != null) {
            if (this.f15208d == 2) {
                oVarO = ImageProcessingUtil.g(oVar, rVar, byteBuffer, i10, this.f15210f);
            } else {
                if (this.f15208d == 1) {
                    if (this.f15210f) {
                        ImageProcessingUtil.c(oVar);
                    }
                    if (imageWriter != null && byteBuffer2 != null && byteBuffer3 != null && byteBuffer4 != null) {
                        oVarO = ImageProcessingUtil.n(oVar, rVar, imageWriter, byteBuffer2, byteBuffer3, byteBuffer4, i10);
                    }
                }
                oVar2 = null;
            }
            oVar2 = oVarO;
        } else {
            if (this.f15208d == 3) {
                if (this.f15210f) {
                    ImageProcessingUtil.c(oVar);
                }
                if (byteBuffer2 != null && byteBuffer3 != null && byteBuffer4 != null && byteBuffer5 != null && byteBuffer6 != null) {
                    oVarO = ImageProcessingUtil.o(oVar, byteBuffer2, byteBuffer3, byteBuffer4, byteBuffer5, byteBuffer6, i10);
                    oVar2 = oVarO;
                }
            }
            oVar2 = null;
        }
        boolean z11 = oVar2 == null;
        final o oVar3 = z11 ? oVar : oVar2;
        final Rect rect = new Rect();
        final Matrix matrix = new Matrix();
        synchronized (this.f15224t) {
            if (z10 && !z11) {
                try {
                    m(oVar.getWidth(), oVar.getHeight(), oVar3.getWidth(), oVar3.getHeight());
                } finally {
                }
            }
            this.f15207c = i10;
            rect.set(this.f15215k);
            matrix.set(this.f15217m);
        }
        return androidx.concurrent.futures.c.a(new c.InterfaceC0153c() { // from class: androidx.camera.core.i
            @Override // androidx.concurrent.futures.c.InterfaceC0153c
            public final Object a(c.a aVar2) {
                return j.c(this.f15187a, executor, oVar, matrix, oVar3, rect, aVar, aVar2);
            }
        });
    }

    abstract void f();

    void i() {
        this.f15225u = false;
        f();
    }

    abstract void l(o oVar);

    void o(Executor executor, g.a aVar) {
        if (aVar == null) {
            f();
        }
        synchronized (this.f15224t) {
            this.f15205a = aVar;
            this.f15211g = executor;
        }
    }

    void p(boolean z10) {
        this.f15210f = z10;
    }

    void q(int i10) {
        this.f15208d = i10;
    }

    void r(boolean z10) {
        this.f15209e = z10;
    }

    void s(r rVar) {
        synchronized (this.f15224t) {
            this.f15212h = rVar;
        }
    }

    void t(int i10) {
        this.f15206b = i10;
    }

    void u(Matrix matrix) {
        synchronized (this.f15224t) {
            this.f15216l = matrix;
            this.f15217m = new Matrix(this.f15216l);
        }
    }

    void v(Rect rect) {
        synchronized (this.f15224t) {
            this.f15214j = rect;
            this.f15215k = new Rect(this.f15214j);
        }
    }
}
