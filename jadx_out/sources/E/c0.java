package E;

import E.Y;
import E.i0;
import F.C0486h0;
import androidx.camera.core.e;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import m5.InterfaceFutureC2904a;
import y.AbstractC3583h0;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public class c0 implements Y, e.a, i0.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final InterfaceC0464y f941b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    C0465z f942c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private V f943d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final List f944e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final Deque f940a = new ArrayDeque();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    boolean f945f = false;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    class a implements J.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ C0451k f946a;

        a(C0451k c0451k) {
            this.f946a = c0451k;
        }

        @Override // J.c
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(Void r12) {
            c0.this.f941b.c();
        }

        @Override // J.c
        public void onFailure(Throwable th) {
            if (this.f946a.b()) {
                return;
            }
            int iF = ((C0486h0) this.f946a.a().get(0)).f();
            if (th instanceof y.X) {
                c0.this.f942c.j(Y.a.c(iF, (y.X) th));
            } else {
                c0.this.f942c.j(Y.a.c(iF, new y.X(2, "Failed to submit capture request", th)));
            }
            c0.this.f941b.c();
        }
    }

    public c0(InterfaceC0464y interfaceC0464y) {
        H.y.b();
        this.f941b = interfaceC0464y;
        this.f944e = new ArrayList();
    }

    public static /* synthetic */ void h(c0 c0Var) {
        c0Var.f943d = null;
        c0Var.j();
    }

    private InterfaceFutureC2904a k(C0451k c0451k) {
        H.y.b();
        this.f941b.b();
        InterfaceFutureC2904a interfaceFutureC2904aA = this.f941b.a(c0451k.a());
        J.n.j(interfaceFutureC2904aA, new a(c0451k), I.c.e());
        return interfaceFutureC2904aA;
    }

    private void l(final V v10) {
        H0.g.i(!i());
        this.f943d = v10;
        v10.o().h(new Runnable() { // from class: E.a0
            @Override // java.lang.Runnable
            public final void run() {
                c0.h(this.f928g);
            }
        }, I.c.b());
        this.f944e.add(v10);
        v10.p().h(new Runnable() { // from class: E.b0
            @Override // java.lang.Runnable
            public final void run() {
                this.f936g.f944e.remove(v10);
            }
        }, I.c.b());
    }

    @Override // androidx.camera.core.e.a
    public void a(androidx.camera.core.o oVar) {
        I.c.e().execute(new Runnable() { // from class: E.Z
            @Override // java.lang.Runnable
            public final void run() {
                this.f925g.j();
            }
        });
    }

    @Override // E.Y
    public void b() {
        H.y.b();
        this.f945f = false;
        j();
    }

    @Override // E.Y
    public void c() {
        H.y.b();
        y.X x10 = new y.X(3, "Camera is closed.", null);
        Iterator it = this.f940a.iterator();
        while (it.hasNext()) {
            ((i0) it.next()).x(x10);
        }
        this.f940a.clear();
        Iterator it2 = new ArrayList(this.f944e).iterator();
        while (it2.hasNext()) {
            ((V) it2.next()).l(x10);
        }
    }

    @Override // E.Y
    public void d(C0465z c0465z) {
        H.y.b();
        this.f942c = c0465z;
        c0465z.k(this);
    }

    @Override // E.Y
    public void e(i0 i0Var) {
        H.y.b();
        this.f940a.offer(i0Var);
        j();
    }

    @Override // E.i0.a
    public void f(i0 i0Var) {
        H.y.b();
        AbstractC3583h0.a("TakePictureManagerImpl", "Add a new request for retrying.");
        this.f940a.addFirst(i0Var);
        j();
    }

    public boolean i() {
        return this.f943d != null;
    }

    void j() {
        i0 i0Var;
        H.y.b();
        if (i() || this.f945f || this.f942c.h() == 0 || (i0Var = (i0) this.f940a.poll()) == null) {
            return;
        }
        V v10 = new V(i0Var, this);
        l(v10);
        H0.d dVarE = this.f942c.e(i0Var, v10, v10.o());
        C0451k c0451k = (C0451k) dVarE.f3634a;
        Objects.requireNonNull(c0451k);
        S s10 = (S) dVarE.f3635b;
        Objects.requireNonNull(s10);
        this.f942c.m(s10);
        v10.s(k(c0451k));
    }

    @Override // E.Y
    public void pause() {
        H.y.b();
        this.f945f = true;
        V v10 = this.f943d;
        if (v10 != null) {
            v10.m();
        }
    }
}
