package P;

import F.AbstractC0504q0;
import F.o1;
import P.L;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.util.Size;
import android.view.Surface;
import androidx.concurrent.futures.c;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import m5.InterfaceFutureC2904a;
import y.I0;
import y.w0;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public class L {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f8647a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Matrix f8648b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f8649c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Rect f8650d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f8651e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f8652f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final o1 f8653g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f8654h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f8655i;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private I0 f8657k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private a f8658l;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f8656j = false;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final Set f8659m = new HashSet();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f8660n = false;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final List f8661o = new ArrayList();

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    static class a extends AbstractC0504q0 {

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        final InterfaceFutureC2904a f8662o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        c.a f8663p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private AbstractC0504q0 f8664q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private O f8665r;

        a(Size size, int i10) {
            super(size, i10);
            this.f8662o = androidx.concurrent.futures.c.a(new c.InterfaceC0153c() { // from class: P.J
                @Override // androidx.concurrent.futures.c.InterfaceC0153c
                public final Object a(c.a aVar) {
                    return L.a.r(this.f8645a, aVar);
                }
            });
        }

        public static /* synthetic */ void q(a aVar) {
            O o10 = aVar.f8665r;
            if (o10 != null) {
                o10.s();
            }
            if (aVar.f8664q == null) {
                aVar.f8663p.d();
            }
            aVar.f8664q = null;
        }

        public static /* synthetic */ Object r(a aVar, c.a aVar2) {
            aVar.f8663p = aVar2;
            return "SettableFuture hashCode: " + aVar.hashCode();
        }

        @Override // F.AbstractC0504q0
        public void d() {
            super.d();
            H.y.e(new Runnable() { // from class: P.I
                @Override // java.lang.Runnable
                public final void run() {
                    L.a.q(this.f8644g);
                }
            });
        }

        @Override // F.AbstractC0504q0
        protected InterfaceFutureC2904a o() {
            return this.f8662o;
        }

        boolean s() {
            H.y.b();
            return this.f8664q == null && !m();
        }

        public void t(O o10) {
            H0.g.j(this.f8665r == null, "Consumer can only be linked once.");
            this.f8665r = o10;
        }

        public boolean u(final AbstractC0504q0 abstractC0504q0, Runnable runnable) {
            H.y.b();
            H0.g.g(abstractC0504q0);
            AbstractC0504q0 abstractC0504q02 = this.f8664q;
            if (abstractC0504q02 == abstractC0504q0) {
                return false;
            }
            H0.g.j(abstractC0504q02 == null, "A different provider has been set. To change the provider, call SurfaceEdge#invalidate before calling SurfaceEdge#setProvider");
            H0.g.b(h().equals(abstractC0504q0.h()), String.format("The provider's size(%s) must match the parent(%s)", h(), abstractC0504q0.h()));
            H0.g.b(i() == abstractC0504q0.i(), String.format("The provider's format(%s) must match the parent(%s)", Integer.valueOf(i()), Integer.valueOf(abstractC0504q0.i())));
            H0.g.j(!m(), "The parent is closed. Call SurfaceEdge#invalidate() before setting a new provider.");
            this.f8664q = abstractC0504q0;
            J.n.t(abstractC0504q0.j(), this.f8663p);
            abstractC0504q0.l();
            k().h(new Runnable() { // from class: P.K
                @Override // java.lang.Runnable
                public final void run() {
                    abstractC0504q0.e();
                }
            }, I.c.b());
            abstractC0504q0.f().h(runnable, I.c.e());
            return true;
        }
    }

    public L(int i10, int i11, o1 o1Var, Matrix matrix, boolean z10, Rect rect, int i12, int i13, boolean z11) {
        this.f8652f = i10;
        this.f8647a = i11;
        this.f8653g = o1Var;
        this.f8648b = matrix;
        this.f8649c = z10;
        this.f8650d = rect;
        this.f8655i = i12;
        this.f8654h = i13;
        this.f8651e = z11;
        this.f8658l = new a(o1Var.f(), i11);
    }

    public static /* synthetic */ void a(final L l10) {
        l10.getClass();
        I.c.e().execute(new Runnable() { // from class: P.G
            @Override // java.lang.Runnable
            public final void run() {
                L.b(this.f8642g);
            }
        });
    }

    public static /* synthetic */ void b(L l10) {
        if (l10.f8660n) {
            return;
        }
        l10.v();
    }

    public static /* synthetic */ void c(L l10, int i10, int i11) {
        boolean z10;
        boolean z11 = true;
        if (l10.f8655i != i10) {
            l10.f8655i = i10;
            z10 = true;
        } else {
            z10 = false;
        }
        if (l10.f8654h != i11) {
            l10.f8654h = i11;
        } else {
            z11 = z10;
        }
        if (z11) {
            l10.x();
        }
    }

    public static /* synthetic */ InterfaceFutureC2904a d(L l10, final a aVar, int i10, w0.a aVar2, w0.a aVar3, Surface surface) {
        l10.getClass();
        H0.g.g(surface);
        try {
            aVar.l();
            O o10 = new O(surface, l10.t(), i10, l10.f8653g.f(), aVar2, aVar3, l10.f8648b);
            o10.r().h(new Runnable() { // from class: P.H
                @Override // java.lang.Runnable
                public final void run() {
                    aVar.e();
                }
            }, I.c.b());
            aVar.t(o10);
            return J.n.p(o10);
        } catch (AbstractC0504q0.a e10) {
            return J.n.n(e10);
        }
    }

    private void g() {
        H0.g.j(!this.f8656j, "Consumer can only be linked once.");
        this.f8656j = true;
    }

    private void h() {
        H0.g.j(!this.f8660n, "Edge is already closed.");
    }

    private void x() {
        H.y.b();
        I0.h hVarG = I0.h.g(this.f8650d, this.f8655i, this.f8654h, u(), this.f8648b, this.f8651e);
        I0 i02 = this.f8657k;
        if (i02 != null) {
            i02.y(hVarG);
        }
        Iterator it = this.f8661o.iterator();
        while (it.hasNext()) {
            ((H0.a) it.next()).accept(hVarG);
        }
    }

    public void e(Runnable runnable) {
        H.y.b();
        h();
        this.f8659m.add(runnable);
    }

    public void f(H0.a aVar) {
        H0.g.g(aVar);
        this.f8661o.add(aVar);
    }

    public final void i() {
        H.y.b();
        this.f8658l.d();
        this.f8660n = true;
        this.f8661o.clear();
        this.f8659m.clear();
    }

    public InterfaceFutureC2904a j(final int i10, final w0.a aVar, final w0.a aVar2) {
        H.y.b();
        h();
        g();
        final a aVar3 = this.f8658l;
        return J.n.y(aVar3.j(), new J.a() { // from class: P.E
            @Override // J.a
            public final InterfaceFutureC2904a apply(Object obj) {
                return L.d(this.f8634a, aVar3, i10, aVar, aVar2, (Surface) obj);
            }
        }, I.c.e());
    }

    public I0 k(F.M m10) {
        return l(m10, true);
    }

    public I0 l(F.M m10, boolean z10) {
        H.y.b();
        h();
        I0 i02 = new I0(this.f8653g.f(), m10, z10, this.f8653g.b(), this.f8653g.g(), this.f8653g.c(), new Runnable() { // from class: P.B
            @Override // java.lang.Runnable
            public final void run() {
                L.a(this.f8631g);
            }
        });
        try {
            final AbstractC0504q0 abstractC0504q0N = i02.n();
            a aVar = this.f8658l;
            Objects.requireNonNull(aVar);
            if (aVar.u(abstractC0504q0N, new C(aVar))) {
                InterfaceFutureC2904a interfaceFutureC2904aK = aVar.k();
                Objects.requireNonNull(abstractC0504q0N);
                interfaceFutureC2904aK.h(new Runnable() { // from class: P.D
                    @Override // java.lang.Runnable
                    public final void run() {
                        abstractC0504q0N.d();
                    }
                }, I.c.b());
            }
            this.f8657k = i02;
            x();
            return i02;
        } catch (AbstractC0504q0.a e10) {
            throw new AssertionError("Surface is somehow already closed", e10);
        } catch (RuntimeException e11) {
            i02.z();
            throw e11;
        }
    }

    public final void m() {
        H.y.b();
        h();
        this.f8658l.d();
    }

    public Rect n() {
        return this.f8650d;
    }

    public AbstractC0504q0 o() {
        H.y.b();
        h();
        g();
        return this.f8658l;
    }

    public int p() {
        return this.f8647a;
    }

    public int q() {
        return this.f8655i;
    }

    public Matrix r() {
        return this.f8648b;
    }

    public o1 s() {
        return this.f8653g;
    }

    public int t() {
        return this.f8652f;
    }

    public String toString() {
        return "SurfaceEdge{targets=" + this.f8652f + ", format=" + this.f8647a + ", resolution=" + this.f8653g.f() + ", cropRect=" + this.f8650d + ", rotationDegrees=" + this.f8655i + ", mirroring=" + this.f8651e + ", sensorToBufferTransform= " + this.f8648b + ", rotationInTransform= " + H.z.g(this.f8648b) + ", isMirrorInTransform= " + H.z.l(this.f8648b) + ", isClosed=" + this.f8660n + '}';
    }

    public boolean u() {
        return this.f8649c;
    }

    public void v() {
        H.y.b();
        h();
        if (this.f8658l.s()) {
            return;
        }
        this.f8656j = false;
        this.f8658l.d();
        this.f8658l = new a(this.f8653g.f(), this.f8647a);
        Iterator it = this.f8659m.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
    }

    public boolean w() {
        return this.f8651e;
    }

    public void y(AbstractC0504q0 abstractC0504q0) {
        H.y.b();
        h();
        a aVar = this.f8658l;
        Objects.requireNonNull(aVar);
        aVar.u(abstractC0504q0, new C(aVar));
    }

    public void z(final int i10, final int i11) {
        H.y.e(new Runnable() { // from class: P.F
            @Override // java.lang.Runnable
            public final void run() {
                L.c(this.f8639g, i10, i11);
            }
        });
    }
}
