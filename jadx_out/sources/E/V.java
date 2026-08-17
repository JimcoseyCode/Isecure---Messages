package E;

import E.i0;
import android.graphics.Bitmap;
import androidx.concurrent.futures.c;
import java.util.Objects;
import m5.InterfaceFutureC2904a;
import y.V;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public class V implements X {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final i0 f904a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final i0.a f905b;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private c.a f908e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private c.a f909f;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private InterfaceFutureC2904a f912i;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f910g = false;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f911h = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final InterfaceFutureC2904a f906c = androidx.concurrent.futures.c.a(new c.InterfaceC0153c() { // from class: E.T
        @Override // androidx.concurrent.futures.c.InterfaceC0153c
        public final Object a(c.a aVar) {
            return V.i(this.f902a, aVar);
        }
    });

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final InterfaceFutureC2904a f907d = androidx.concurrent.futures.c.a(new c.InterfaceC0153c() { // from class: E.U
        @Override // androidx.concurrent.futures.c.InterfaceC0153c
        public final Object a(c.a aVar) {
            return V.j(this.f903a, aVar);
        }
    });

    V(i0 i0Var, i0.a aVar) {
        this.f904a = i0Var;
        this.f905b = aVar;
    }

    public static /* synthetic */ Object i(V v10, c.a aVar) {
        v10.f908e = aVar;
        return "CaptureCompleteFuture";
    }

    public static /* synthetic */ Object j(V v10, c.a aVar) {
        v10.f909f = aVar;
        return "RequestCompleteFuture";
    }

    private void k(y.X x10) {
        H.y.b();
        this.f910g = true;
        InterfaceFutureC2904a interfaceFutureC2904a = this.f912i;
        Objects.requireNonNull(interfaceFutureC2904a);
        interfaceFutureC2904a.cancel(true);
        this.f908e.f(x10);
        this.f909f.c(null);
    }

    private void n() {
        H0.g.j(this.f906c.isDone(), "onImageCaptured() must be called before onFinalResult()");
    }

    private void q() {
        if (!this.f904a.t() || this.f904a.s()) {
            if (!this.f904a.t()) {
                H0.g.j(!this.f907d.isDone(), "The callback can only complete once.");
            }
            this.f909f.c(null);
        }
    }

    private void r(y.X x10) {
        H.y.b();
        this.f904a.x(x10);
    }

    @Override // E.X
    public boolean a() {
        return this.f910g;
    }

    @Override // E.X
    public void b(y.X x10) {
        H.y.b();
        if (this.f910g) {
            return;
        }
        n();
        q();
        r(x10);
    }

    @Override // E.X
    public void c(y.X x10) {
        H.y.b();
        if (this.f910g) {
            return;
        }
        boolean zF = this.f904a.f();
        if (!zF) {
            r(x10);
        }
        q();
        this.f908e.f(x10);
        if (zF) {
            this.f905b.f(this.f904a);
        }
    }

    @Override // E.X
    public void d() {
        H.y.b();
        if (this.f910g) {
            return;
        }
        if (!this.f911h) {
            g();
        }
        this.f908e.c(null);
    }

    @Override // E.X
    public void e(Bitmap bitmap) {
        H.y.b();
        if (this.f910g) {
            return;
        }
        this.f904a.y(bitmap);
    }

    @Override // E.X
    public void f(V.h hVar) {
        H.y.b();
        if (this.f910g) {
            return;
        }
        n();
        q();
        this.f904a.A(hVar);
    }

    @Override // E.X
    public void g() {
        H.y.b();
        if (this.f910g || this.f911h) {
            return;
        }
        this.f911h = true;
        V.e eVarJ = this.f904a.j();
        if (eVarJ != null) {
            eVarJ.onCaptureStarted();
        }
        this.f904a.l();
    }

    @Override // E.X
    public void h(androidx.camera.core.o oVar) {
        H.y.b();
        if (this.f910g) {
            oVar.close();
            return;
        }
        n();
        q();
        this.f904a.z(oVar);
    }

    void l(y.X x10) {
        H.y.b();
        if (this.f907d.isDone()) {
            return;
        }
        k(x10);
        r(x10);
    }

    void m() {
        H.y.b();
        if (this.f907d.isDone()) {
            return;
        }
        k(new y.X(3, "The request is aborted silently and retried.", null));
        this.f905b.f(this.f904a);
    }

    InterfaceFutureC2904a o() {
        H.y.b();
        return this.f906c;
    }

    @Override // E.X
    public void onCaptureProcessProgressed(int i10) {
        H.y.b();
        if (this.f910g) {
            return;
        }
        this.f904a.w(i10);
    }

    InterfaceFutureC2904a p() {
        H.y.b();
        return this.f907d;
    }

    public void s(InterfaceFutureC2904a interfaceFutureC2904a) {
        H.y.b();
        H0.g.j(this.f912i == null, "CaptureRequestFuture can only be set once.");
        this.f912i = interfaceFutureC2904a;
    }
}
