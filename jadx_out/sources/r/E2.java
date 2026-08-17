package r;

import android.graphics.Rect;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.TotalCaptureResult;
import android.os.Build;
import android.os.Looper;
import android.util.Range;
import androidx.concurrent.futures.c;
import androidx.lifecycle.AbstractC1776x;
import java.util.concurrent.Executor;
import m5.InterfaceFutureC2904a;
import q.C3091a;
import r.C3232y;
import y.AbstractC3583h0;
import y.InterfaceC3586j;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
final class E2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C3232y f30946a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Executor f30947b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final F2 f30948c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final androidx.lifecycle.A f30949d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final b f30950e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f30951f = false;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private C3232y.c f30952g = new a();

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    class a implements C3232y.c {
        a() {
        }

        @Override // r.C3232y.c
        public boolean a(TotalCaptureResult totalCaptureResult) {
            E2.this.f30950e.a(totalCaptureResult);
            return false;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    interface b {
        void a(TotalCaptureResult totalCaptureResult);

        void b(float f10, c.a aVar);

        float c();

        void d(C3091a.C0345a c0345a);

        float e();

        Rect f();

        void g();
    }

    E2(C3232y c3232y, s.E e10, Executor executor) {
        this.f30946a = c3232y;
        this.f30947b = executor;
        b bVarD = d(e10);
        this.f30950e = bVarD;
        F2 f22 = new F2(bVarD.c(), bVarD.e());
        this.f30948c = f22;
        f22.e(1.0f);
        this.f30949d = new androidx.lifecycle.A(K.h.f(f22));
        c3232y.B(this.f30952g);
    }

    public static /* synthetic */ Object b(final E2 e22, final y.M0 m02, final c.a aVar) {
        e22.f30947b.execute(new Runnable() { // from class: r.D2
            @Override // java.lang.Runnable
            public final void run() {
                this.f30933g.l(aVar, m02);
            }
        });
        return "setZoomRatio";
    }

    private static b d(s.E e10) {
        return i(e10) ? new C3156c(e10) : new C3211q1(e10);
    }

    static y.M0 f(s.E e10) {
        b bVarD = d(e10);
        F2 f22 = new F2(bVarD.c(), bVarD.e());
        f22.e(1.0f);
        return K.h.f(f22);
    }

    private static Range g(s.E e10) {
        try {
            return (Range) e10.a(CameraCharacteristics.CONTROL_ZOOM_RATIO_RANGE);
        } catch (AssertionError e11) {
            AbstractC3583h0.m("ZoomControl", "AssertionError, fail to get camera characteristic.", e11);
            return null;
        }
    }

    static boolean i(s.E e10) {
        return Build.VERSION.SDK_INT >= 30 && g(e10) != null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void l(c.a aVar, y.M0 m02) {
        y.M0 m0F;
        if (this.f30951f) {
            this.f30950e.b(m02.c(), aVar);
            this.f30946a.s0();
            return;
        }
        synchronized (this.f30948c) {
            this.f30948c.e(1.0f);
            m0F = K.h.f(this.f30948c);
        }
        m(m0F);
        aVar.f(new InterfaceC3586j.a("Camera is not active."));
    }

    private void m(y.M0 m02) {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            this.f30949d.n(m02);
        } else {
            this.f30949d.l(m02);
        }
    }

    void c(C3091a.C0345a c0345a) {
        this.f30950e.d(c0345a);
    }

    Rect e() {
        return this.f30950e.f();
    }

    AbstractC1776x h() {
        return this.f30949d;
    }

    void j(boolean z10) {
        y.M0 m0F;
        if (this.f30951f == z10) {
            return;
        }
        this.f30951f = z10;
        if (z10) {
            return;
        }
        synchronized (this.f30948c) {
            this.f30948c.e(1.0f);
            m0F = K.h.f(this.f30948c);
        }
        m(m0F);
        this.f30950e.g();
        this.f30946a.s0();
    }

    InterfaceFutureC2904a k(float f10) {
        final y.M0 m0F;
        synchronized (this.f30948c) {
            try {
                this.f30948c.e(f10);
                m0F = K.h.f(this.f30948c);
            } catch (IllegalArgumentException e10) {
                return J.n.n(e10);
            }
        }
        m(m0F);
        return androidx.concurrent.futures.c.a(new c.InterfaceC0153c() { // from class: r.C2
            @Override // androidx.concurrent.futures.c.InterfaceC0153c
            public final Object a(c.a aVar) {
                return E2.b(this.f30927a, m0F, aVar);
            }
        });
    }
}
