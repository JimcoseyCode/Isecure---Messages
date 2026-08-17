package E;

import E.C0460u;
import E.Q;
import E.Y;
import F.AbstractC0504q0;
import F.AbstractC0506s;
import F.F0;
import F.G0;
import P.C1365u;
import android.util.Size;
import android.view.Surface;
import androidx.camera.core.e;
import java.util.List;
import java.util.Objects;
import y.AbstractC3583h0;
import y.InterfaceC3575d0;

/* JADX INFO: renamed from: E.u, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
class C0460u {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    androidx.camera.core.r f990b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    androidx.camera.core.r f991c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    androidx.camera.core.r f992d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Q.a f993e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private c f994f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    S f989a = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private F f995g = null;

    /* JADX INFO: renamed from: E.u$a */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    class a extends F.r {
        a() {
        }

        public static /* synthetic */ void e(a aVar) {
            S s10 = C0460u.this.f989a;
            if (s10 != null) {
                s10.p();
            }
        }

        @Override // F.r
        public void d(int i10) {
            I.c.e().execute(new Runnable() { // from class: E.t
                @Override // java.lang.Runnable
                public final void run() {
                    C0460u.a.e(this.f988g);
                }
            });
        }
    }

    /* JADX INFO: renamed from: E.u$c */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    static abstract class c {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private F.r f1000b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private AbstractC0504q0 f1001c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private AbstractC0504q0 f1002d;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private F.r f999a = new a();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private AbstractC0504q0 f1003e = null;

        /* JADX INFO: renamed from: E.u$c$a */
        /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
        class a extends F.r {
            a() {
            }
        }

        c() {
        }

        static c n(Size size, int i10, List list, boolean z10, InterfaceC3575d0 interfaceC3575d0, G g10) {
            return new C0442b(size, i10, list, z10, interfaceC3575d0, g10, new C1365u(), new C1365u());
        }

        F.r a() {
            return this.f999a;
        }

        abstract C1365u b();

        abstract InterfaceC3575d0 c();

        abstract int d();

        abstract List e();

        abstract G f();

        AbstractC0504q0 g() {
            return this.f1003e;
        }

        abstract C1365u h();

        F.r i() {
            return this.f1000b;
        }

        AbstractC0504q0 j() {
            return this.f1002d;
        }

        abstract Size k();

        AbstractC0504q0 l() {
            AbstractC0504q0 abstractC0504q0 = this.f1001c;
            Objects.requireNonNull(abstractC0504q0);
            return abstractC0504q0;
        }

        abstract boolean m();

        void o(F.r rVar) {
            this.f999a = rVar;
        }

        void p(Surface surface, Size size, int i10) {
            this.f1003e = new G0(surface, size, i10);
        }

        void q(F.r rVar) {
            this.f1000b = rVar;
        }

        void r(Surface surface) {
            H0.g.j(this.f1002d == null, "The secondary surface is already set.");
            this.f1002d = new G0(surface, k(), d());
        }

        void s(Surface surface) {
            H0.g.j(this.f1001c == null, "The surface is already set.");
            this.f1001c = new G0(surface, k(), d());
        }
    }

    C0460u() {
    }

    public static /* synthetic */ void a(C0460u c0460u, F0 f02) {
        c0460u.getClass();
        try {
            androidx.camera.core.o oVarB = f02.b();
            if (oVarB != null) {
                c0460u.k(oVarB);
                return;
            }
            S s10 = c0460u.f989a;
            if (s10 != null) {
                c0460u.p(Y.a.c(s10.e(), new y.X(2, "Failed to acquire latest image", null)));
            }
        } catch (IllegalStateException e10) {
            S s11 = c0460u.f989a;
            if (s11 != null) {
                c0460u.p(Y.a.c(s11.e(), new y.X(2, "Failed to acquire latest image", e10)));
            }
        }
    }

    public static /* synthetic */ void b(C0460u c0460u, S s10) {
        c0460u.l(s10);
        c0460u.f995g.h(s10);
    }

    public static /* synthetic */ void d(androidx.camera.core.r rVar) {
        if (rVar != null) {
            rVar.j();
        }
    }

    public static /* synthetic */ void e(C0460u c0460u, F0 f02) {
        c0460u.getClass();
        try {
            androidx.camera.core.o oVarB = f02.b();
            if (oVarB != null) {
                c0460u.m(oVarB);
            }
        } catch (IllegalStateException e10) {
            AbstractC3583h0.d("CaptureNode", "Failed to acquire latest image of postview", e10);
        }
    }

    public static /* synthetic */ void f(androidx.camera.core.r rVar) {
        if (rVar != null) {
            rVar.j();
        }
    }

    private static F0 h(InterfaceC3575d0 interfaceC3575d0, int i10, int i11, int i12) {
        return interfaceC3575d0 != null ? interfaceC3575d0.a(i10, i11, i12, 4, 0L) : androidx.camera.core.p.a(i10, i11, i12, 4);
    }

    private void j(androidx.camera.core.o oVar) {
        S s10;
        S s11;
        H.y.b();
        Q.a aVar = this.f993e;
        Objects.requireNonNull(aVar);
        aVar.a().accept(Q.b.c(this.f989a, oVar));
        S s12 = this.f989a;
        c cVar = this.f994f;
        boolean z10 = cVar != null && cVar.e().size() > 1;
        if (z10 && (s11 = this.f989a) != null) {
            s11.k().u(oVar.getFormat(), true);
        }
        if (!z10 || ((s10 = this.f989a) != null && s10.k().s())) {
            this.f989a = null;
        }
        s12.s();
    }

    private void m(androidx.camera.core.o oVar) {
        if (this.f989a == null) {
            AbstractC3583h0.l("CaptureNode", "Postview image is closed due to request completed or aborted");
            oVar.close();
        } else {
            Q.a aVar = this.f993e;
            Objects.requireNonNull(aVar);
            aVar.d().accept(Q.b.c(this.f989a, oVar));
        }
    }

    private void o(c cVar, final androidx.camera.core.r rVar, final androidx.camera.core.r rVar2, final androidx.camera.core.r rVar3) {
        cVar.l().d();
        cVar.l().k().h(new Runnable() { // from class: E.q
            @Override // java.lang.Runnable
            public final void run() {
                rVar.j();
            }
        }, I.c.e());
        if (cVar.g() != null) {
            cVar.g().d();
            cVar.g().k().h(new Runnable() { // from class: E.r
                @Override // java.lang.Runnable
                public final void run() {
                    C0460u.f(rVar3);
                }
            }, I.c.e());
        }
        if (cVar.e().size() <= 1 || cVar.j() == null) {
            return;
        }
        cVar.j().d();
        cVar.j().k().h(new Runnable() { // from class: E.s
            @Override // java.lang.Runnable
            public final void run() {
                C0460u.d(rVar2);
            }
        }, I.c.e());
    }

    private void q(F0 f02) {
        f02.e(new F0.a() { // from class: E.l
            @Override // F.F0.a
            public final void a(F0 f03) {
                C0460u.a(this.f980a, f03);
            }
        }, I.c.e());
    }

    public int i() {
        H.y.b();
        H0.g.j(this.f990b != null, "The ImageReader is not initialized.");
        return this.f990b.i();
    }

    void k(androidx.camera.core.o oVar) {
        H.y.b();
        if (this.f989a == null) {
            AbstractC3583h0.l("CaptureNode", "Discarding ImageProxy which was inadvertently acquired: " + oVar);
            oVar.close();
            return;
        }
        if (((Integer) oVar.i().b().d(this.f989a.j())) != null) {
            j(oVar);
        } else {
            AbstractC3583h0.l("CaptureNode", "Discarding ImageProxy which was acquired for aborted request");
            oVar.close();
        }
    }

    void l(S s10) {
        H.y.b();
        H0.g.j(s10.i().size() == 1, "only one capture stage is supported.");
        H0.g.j(i() > 0, "Too many acquire images. Close image to be able to process next.");
        this.f989a = s10;
        J.n.j(s10.a(), new b(s10), I.c.b());
    }

    public void n() {
        H.y.b();
        c cVar = this.f994f;
        Objects.requireNonNull(cVar);
        androidx.camera.core.r rVar = this.f990b;
        Objects.requireNonNull(rVar);
        o(cVar, rVar, this.f991c, this.f992d);
    }

    void p(Y.a aVar) {
        H.y.b();
        S s10 = this.f989a;
        if (s10 == null || s10.e() != aVar.b()) {
            return;
        }
        this.f989a.n(aVar.a());
    }

    public void r(e.a aVar) {
        H.y.b();
        H0.g.j(this.f990b != null, "The ImageReader is not initialized.");
        this.f990b.k(aVar);
    }

    public Q.a s(c cVar) {
        H0.a aVar;
        F0 f02;
        androidx.camera.core.q qVar;
        F0 f03;
        H0.g.j(this.f994f == null && this.f990b == null, "CaptureNode does not support recreation yet.");
        this.f994f = cVar;
        Size sizeK = cVar.k();
        int iD = cVar.d();
        boolean zM = cVar.m();
        F.r aVar2 = new a();
        boolean z10 = cVar.e().size() > 1;
        F.r rVarB = null;
        if (zM) {
            cVar.c();
            F f10 = new F(h(null, sizeK.getWidth(), sizeK.getHeight(), iD));
            this.f995g = f10;
            aVar = new H0.a() { // from class: E.n
                @Override // H0.a
                public final void accept(Object obj) {
                    C0460u.b(this.f982a, (S) obj);
                }
            };
            f02 = f10;
            qVar = null;
        } else {
            cVar.c();
            if (z10) {
                androidx.camera.core.q qVar2 = new androidx.camera.core.q(sizeK.getWidth(), sizeK.getHeight(), 256, 4);
                F.r rVarB2 = AbstractC0506s.b(aVar2, qVar2.m());
                qVar = new androidx.camera.core.q(sizeK.getWidth(), sizeK.getHeight(), 32, 4);
                F.r[] rVarArr = {aVar2, qVar.m()};
                aVar2 = rVarB2;
                rVarB = AbstractC0506s.b(rVarArr);
                f03 = qVar2;
            } else {
                androidx.camera.core.q qVar3 = new androidx.camera.core.q(sizeK.getWidth(), sizeK.getHeight(), iD, 4);
                aVar2 = AbstractC0506s.b(aVar2, qVar3.m());
                f03 = qVar3;
                qVar = null;
            }
            aVar = new H0.a() { // from class: E.m
                @Override // H0.a
                public final void accept(Object obj) {
                    this.f981a.l((S) obj);
                }
            };
            f02 = f03;
        }
        cVar.o(aVar2);
        if (z10 && rVarB != null) {
            cVar.q(rVarB);
        }
        Surface surface = f02.getSurface();
        Objects.requireNonNull(surface);
        cVar.s(surface);
        this.f990b = new androidx.camera.core.r(f02);
        q(f02);
        cVar.f();
        if (z10 && qVar != null) {
            cVar.r(qVar.getSurface());
            this.f991c = new androidx.camera.core.r(qVar);
            q(qVar);
        }
        cVar.h().a(aVar);
        cVar.b().a(new H0.a() { // from class: E.p
            @Override // H0.a
            public final void accept(Object obj) {
                this.f984a.p((Y.a) obj);
            }
        });
        Q.a aVarE = Q.a.e(cVar.d(), cVar.e());
        this.f993e = aVarE;
        return aVarE;
    }

    /* JADX INFO: renamed from: E.u$b */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    class b implements J.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ S f997a;

        b(S s10) {
            this.f997a = s10;
        }

        @Override // J.c
        public void onFailure(Throwable th) {
            H.y.b();
            if (this.f997a == C0460u.this.f989a) {
                AbstractC3583h0.l("CaptureNode", "request aborted, id=" + C0460u.this.f989a.e());
                if (C0460u.this.f995g != null) {
                    C0460u.this.f995g.i();
                }
                C0460u.this.f989a = null;
            }
        }

        @Override // J.c
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(Void r12) {
        }
    }
}
