package P;

import android.graphics.Matrix;
import android.graphics.RectF;
import android.util.Size;
import android.view.Surface;
import androidx.concurrent.futures.c;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicReference;
import m5.InterfaceFutureC2904a;
import y.AbstractC3583h0;
import y.w0;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
final class O implements w0 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Surface f8670h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final int f8671i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final int f8672j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final Size f8673k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final w0.a f8674l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final w0.a f8675m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final float[] f8676n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final float[] f8677o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final float[] f8678p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final float[] f8679q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private H0.a f8680r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private Executor f8681s;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final InterfaceFutureC2904a f8684v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private c.a f8685w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private Matrix f8686x;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Object f8669g = new Object();

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private boolean f8682t = false;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private boolean f8683u = false;

    O(Surface surface, int i10, int i11, Size size, w0.a aVar, w0.a aVar2, Matrix matrix) {
        float[] fArr = new float[16];
        this.f8676n = fArr;
        float[] fArr2 = new float[16];
        this.f8677o = fArr2;
        float[] fArr3 = new float[16];
        this.f8678p = fArr3;
        float[] fArr4 = new float[16];
        this.f8679q = fArr4;
        this.f8670h = surface;
        this.f8671i = i10;
        this.f8672j = i11;
        this.f8673k = size;
        this.f8674l = aVar;
        this.f8675m = aVar2;
        this.f8686x = matrix;
        k(fArr, fArr3, aVar);
        k(fArr2, fArr4, aVar2);
        this.f8684v = androidx.concurrent.futures.c.a(new c.InterfaceC0153c() { // from class: P.M
            @Override // androidx.concurrent.futures.c.InterfaceC0153c
            public final Object a(c.a aVar3) {
                return O.d(this.f8666a, aVar3);
            }
        });
    }

    public static /* synthetic */ Object d(O o10, c.a aVar) {
        o10.f8685w = aVar;
        return "SurfaceOutputImpl close future complete";
    }

    public static /* synthetic */ void e(O o10, AtomicReference atomicReference) {
        o10.getClass();
        ((H0.a) atomicReference.get()).accept(w0.b.c(0, o10));
    }

    private static void k(float[] fArr, float[] fArr2, w0.a aVar) {
        android.opengl.Matrix.setIdentityM(fArr, 0);
        if (aVar == null) {
            return;
        }
        H.s.d(fArr, 0.5f);
        H.s.c(fArr, aVar.e(), 0.5f, 0.5f);
        if (aVar.d()) {
            android.opengl.Matrix.translateM(fArr, 0, 1.0f, 0.0f, 0.0f);
            android.opengl.Matrix.scaleM(fArr, 0, -1.0f, 1.0f, 1.0f);
        }
        Matrix matrixE = H.z.e(H.z.s(aVar.c()), H.z.s(H.z.p(aVar.c(), aVar.e())), aVar.e(), aVar.d());
        RectF rectF = new RectF(aVar.b());
        matrixE.mapRect(rectF);
        float width = rectF.left / r1.getWidth();
        float height = ((r1.getHeight() - rectF.height()) - rectF.top) / r1.getHeight();
        float fWidth = rectF.width() / r1.getWidth();
        float fHeight = rectF.height() / r1.getHeight();
        android.opengl.Matrix.translateM(fArr, 0, width, height, 0.0f);
        android.opengl.Matrix.scaleM(fArr, 0, fWidth, fHeight, 1.0f);
        m(fArr2, aVar.a());
        android.opengl.Matrix.multiplyMM(fArr, 0, fArr2, 0, fArr, 0);
    }

    private static void m(float[] fArr, F.M m10) {
        android.opengl.Matrix.setIdentityM(fArr, 0);
        H.s.d(fArr, 0.5f);
        if (m10 != null) {
            H0.g.j(m10.o(), "Camera has no transform.");
            H.s.c(fArr, m10.d().a(), 0.5f, 0.5f);
            if (m10.f()) {
                android.opengl.Matrix.translateM(fArr, 0, 1.0f, 0.0f, 0.0f);
                android.opengl.Matrix.scaleM(fArr, 0, -1.0f, 1.0f, 1.0f);
            }
        }
        android.opengl.Matrix.invertM(fArr, 0, fArr, 0);
    }

    @Override // y.w0
    public Size b() {
        return this.f8673k;
    }

    @Override // y.w0, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        synchronized (this.f8669g) {
            try {
                if (!this.f8683u) {
                    this.f8683u = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f8685w.c(null);
    }

    @Override // y.w0
    public int getFormat() {
        return this.f8672j;
    }

    @Override // y.w0
    public Surface o(Executor executor, H0.a aVar) {
        boolean z10;
        synchronized (this.f8669g) {
            this.f8681s = executor;
            this.f8680r = aVar;
            z10 = this.f8682t;
        }
        if (z10) {
            s();
        }
        return this.f8670h;
    }

    public InterfaceFutureC2904a r() {
        return this.f8684v;
    }

    public void s() {
        Executor executor;
        H0.a aVar;
        final AtomicReference atomicReference = new AtomicReference();
        synchronized (this.f8669g) {
            try {
                if (this.f8681s == null || (aVar = this.f8680r) == null) {
                    this.f8682t = true;
                } else if (!this.f8683u) {
                    atomicReference.set(aVar);
                    executor = this.f8681s;
                    this.f8682t = false;
                }
                executor = null;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (executor != null) {
            try {
                executor.execute(new Runnable() { // from class: P.N
                    @Override // java.lang.Runnable
                    public final void run() {
                        O.e(this.f8667g, atomicReference);
                    }
                });
            } catch (RejectedExecutionException e10) {
                AbstractC3583h0.b("SurfaceOutputImpl", "Processor executor closed. Close request not posted.", e10);
            }
        }
    }

    @Override // y.w0
    public void v(float[] fArr, float[] fArr2, boolean z10) {
        android.opengl.Matrix.multiplyMM(fArr, 0, fArr2, 0, z10 ? this.f8676n : this.f8677o, 0);
    }

    @Override // y.w0
    public void w(float[] fArr, float[] fArr2) {
        v(fArr, fArr2, true);
    }
}
