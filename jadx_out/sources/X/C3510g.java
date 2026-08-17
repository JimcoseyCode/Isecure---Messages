package x;

import F.InterfaceC0490j0;
import J.n;
import androidx.concurrent.futures.c;
import java.util.concurrent.Executor;
import m5.InterfaceFutureC2904a;
import q.C3091a;
import r.C3232y;
import y.InterfaceC3586j;

/* JADX INFO: renamed from: x.g, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public final class C3510g {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final C3232y f33190c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final Executor f33191d;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    c.a f33194g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f33188a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f33189b = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final Object f33192e = new Object();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private C3091a.C0345a f33193f = new C3091a.C0345a();

    public C3510g(C3232y c3232y, Executor executor) {
        this.f33190c = c3232y;
        this.f33191d = executor;
    }

    public static /* synthetic */ Object a(final C3510g c3510g, final c.a aVar) {
        c3510g.f33191d.execute(new Runnable() { // from class: x.f
            @Override // java.lang.Runnable
            public final void run() {
                this.f33186g.q(aVar);
            }
        });
        return "addCaptureRequestOptions";
    }

    public static /* synthetic */ Object b(final C3510g c3510g, final c.a aVar) {
        c3510g.f33191d.execute(new Runnable() { // from class: x.d
            @Override // java.lang.Runnable
            public final void run() {
                this.f33183g.q(aVar);
            }
        });
        return "clearCaptureRequestOptions";
    }

    private void h(l lVar) {
        synchronized (this.f33192e) {
            this.f33193f.d(lVar);
        }
    }

    private void k() {
        synchronized (this.f33192e) {
            this.f33193f = new C3091a.C0345a();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void l() {
        c.a aVar = this.f33194g;
        if (aVar != null) {
            aVar.c(null);
            this.f33194g = null;
        }
    }

    private void m(Exception exc) {
        c.a aVar = this.f33194g;
        if (aVar != null) {
            if (exc == null) {
                exc = new Exception("Camera2CameraControl failed with unknown error.");
            }
            aVar.f(exc);
            this.f33194g = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void p(boolean z10) {
        if (this.f33188a == z10) {
            return;
        }
        this.f33188a = z10;
        if (!z10) {
            m(new InterfaceC3586j.a("The camera control has became inactive."));
        } else if (this.f33189b) {
            r();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void q(c.a aVar) {
        this.f33189b = true;
        m(new InterfaceC3586j.a("Camera2CameraControl was updated with new options."));
        this.f33194g = aVar;
        if (this.f33188a) {
            r();
        }
    }

    private void r() {
        this.f33190c.r0().h(new Runnable() { // from class: x.e
            @Override // java.lang.Runnable
            public final void run() {
                this.f33185g.l();
            }
        }, this.f33191d);
        this.f33189b = false;
    }

    public InterfaceFutureC2904a g(l lVar) {
        h(lVar);
        return n.s(androidx.concurrent.futures.c.a(new c.InterfaceC0153c() { // from class: x.a
            @Override // androidx.concurrent.futures.c.InterfaceC0153c
            public final Object a(c.a aVar) {
                return C3510g.a(this.f33179a, aVar);
            }
        }));
    }

    public void i(C3091a.C0345a c0345a) {
        synchronized (this.f33192e) {
            c0345a.e(this.f33193f.b(), InterfaceC0490j0.c.ALWAYS_OVERRIDE);
        }
    }

    public InterfaceFutureC2904a j() {
        k();
        return n.s(androidx.concurrent.futures.c.a(new c.InterfaceC0153c() { // from class: x.c
            @Override // androidx.concurrent.futures.c.InterfaceC0153c
            public final Object a(c.a aVar) {
                return C3510g.b(this.f33182a, aVar);
            }
        }));
    }

    public C3091a n() {
        C3091a c3091aA;
        synchronized (this.f33192e) {
            c3091aA = this.f33193f.a();
        }
        return c3091aA;
    }

    public void o(final boolean z10) {
        this.f33191d.execute(new Runnable() { // from class: x.b
            @Override // java.lang.Runnable
            public final void run() {
                this.f33180g.p(z10);
            }
        });
    }
}
