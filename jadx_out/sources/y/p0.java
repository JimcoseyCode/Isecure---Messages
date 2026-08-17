package y;

import F.AbstractC0504q0;
import F.C0468a1;
import F.D1;
import F.E0;
import F.E1;
import F.InterfaceC0490j0;
import F.R0;
import F.S0;
import F.X0;
import F.k1;
import F.o1;
import S.c;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.util.Size;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public final class p0 extends J0 {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private c f33821r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private Executor f33822s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    k1.b f33823t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private AbstractC0504q0 f33824u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private P.L f33825v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    I0 f33826w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private P.U f33827x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private k1.c f33828y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final b f33820z = new b();

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    private static final Executor f33819A = I.c.e();

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class a implements D1.b, E0.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final S0 f33829a;

        public a() {
            this(S0.i0());
        }

        static a f(InterfaceC0490j0 interfaceC0490j0) {
            return new a(S0.j0(interfaceC0490j0));
        }

        @Override // y.InterfaceC3564I
        public R0 b() {
            return this.f33829a;
        }

        public p0 e() {
            C0468a1 c0468a1C = c();
            F.E0.P(c0468a1C);
            return new p0(c0468a1C);
        }

        @Override // F.D1.b
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public C0468a1 c() {
            return new C0468a1(X0.h0(this.f33829a));
        }

        public a h(E1.b bVar) {
            b().X(D1.f1303G, bVar);
            return this;
        }

        public a i(C3563H c3563h) {
            b().X(F.D0.f1296l, c3563h);
            return this;
        }

        public a j(boolean z10) {
            b().X(D1.f1302F, Boolean.valueOf(z10));
            return this;
        }

        public a k(S.c cVar) {
            b().X(F.E0.f1330u, cVar);
            return this;
        }

        public a l(int i10) {
            b().X(D1.f1297A, Integer.valueOf(i10));
            return this;
        }

        public a m(int i10) {
            if (i10 == -1) {
                i10 = 0;
            }
            b().X(F.E0.f1322m, Integer.valueOf(i10));
            return this;
        }

        public a n(Class cls) {
            b().X(K.q.f7019N, cls);
            if (b().f(K.q.f7018M, null) == null) {
                o(cls.getCanonicalName() + "-" + UUID.randomUUID());
            }
            return this;
        }

        public a o(String str) {
            b().X(K.q.f7018M, str);
            return this;
        }

        @Override // F.E0.a
        /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
        public a a(Size size) {
            b().X(F.E0.f1326q, size);
            return this;
        }

        @Override // F.E0.a
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public a d(int i10) {
            b().X(F.E0.f1323n, Integer.valueOf(i10));
            b().X(F.E0.f1324o, Integer.valueOf(i10));
            return this;
        }

        private a(S0 s02) {
            this.f33829a = s02;
            Class cls = (Class) s02.f(K.q.f7019N, null);
            if (cls != null && !cls.equals(p0.class)) {
                throw new IllegalArgumentException("Invalid target class configuration for " + this + ": " + cls);
            }
            h(E1.b.PREVIEW);
            n(p0.class);
            InterfaceC0490j0.a aVar = F.E0.f1325p;
            if (((Integer) s02.f(aVar, -1)).intValue() == -1) {
                s02.X(aVar, 2);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final S.c f33830a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final C0468a1 f33831b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final C3563H f33832c;

        static {
            S.c cVarA = new c.a().d(S.a.f10229c).f(S.d.f10241c).a();
            f33830a = cVarA;
            C3563H c3563h = C3563H.f33649c;
            f33832c = c3563h;
            f33831b = new a().l(2).m(0).k(cVarA).j(true).i(c3563h).c();
        }

        public C0468a1 a() {
            return f33831b;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public interface c {
        void a(I0 i02);
    }

    p0(C0468a1 c0468a1) {
        super(c0468a1);
        this.f33822s = f33819A;
    }

    public static /* synthetic */ void g0(p0 p0Var, k1 k1Var, k1.g gVar) {
        if (p0Var.i() == null) {
            return;
        }
        p0Var.r0((C0468a1) p0Var.l(), p0Var.g());
        p0Var.L();
    }

    private void i0(k1.b bVar, o1 o1Var) {
        if (this.f33821r != null) {
            bVar.n(this.f33824u, o1Var.b(), s(), q());
        }
        k1.c cVar = this.f33828y;
        if (cVar != null) {
            cVar.b();
        }
        k1.c cVar2 = new k1.c(new k1.d() { // from class: y.o0
            @Override // F.k1.d
            public final void a(k1 k1Var, k1.g gVar) {
                p0.g0(this.f33815a, k1Var, gVar);
            }
        });
        this.f33828y = cVar2;
        bVar.u(cVar2);
    }

    private void j0() {
        k1.c cVar = this.f33828y;
        if (cVar != null) {
            cVar.b();
            this.f33828y = null;
        }
        AbstractC0504q0 abstractC0504q0 = this.f33824u;
        if (abstractC0504q0 != null) {
            abstractC0504q0.d();
            this.f33824u = null;
        }
        P.U u10 = this.f33827x;
        if (u10 != null) {
            u10.f();
            this.f33827x = null;
        }
        P.L l10 = this.f33825v;
        if (l10 != null) {
            l10.i();
            this.f33825v = null;
        }
        I0 i02 = this.f33826w;
        if (i02 != null) {
            i02.l();
        }
        this.f33826w = null;
    }

    private k1.b k0(C0468a1 c0468a1, o1 o1Var) {
        H.y.b();
        F.M mI = i();
        Objects.requireNonNull(mI);
        F.M m10 = mI;
        j0();
        H0.g.i(this.f33825v == null);
        Matrix matrixY = y();
        boolean zO = m10.o();
        Rect rectL0 = l0(o1Var.f());
        Objects.requireNonNull(rectL0);
        this.f33825v = new P.L(1, 34, o1Var, matrixY, zO, rectL0, u(m10, H(m10)), f(), q0(m10));
        n();
        this.f33825v.e(new Runnable() { // from class: y.m0
            @Override // java.lang.Runnable
            public final void run() {
                this.f33807g.L();
            }
        });
        I0 i0K = this.f33825v.k(m10);
        this.f33826w = i0K;
        this.f33824u = i0K.n();
        if (this.f33821r != null) {
            m0();
        }
        k1.b bVarR = k1.b.r(c0468a1, o1Var.f());
        bVarR.A(o1Var.g());
        b(bVarR, o1Var);
        bVarR.z(c0468a1.Q());
        if (o1Var.d() != null) {
            bVarR.g(o1Var.d());
        }
        i0(bVarR, o1Var);
        return bVarR;
    }

    private Rect l0(Size size) {
        if (E() != null) {
            return E();
        }
        if (size != null) {
            return new Rect(0, 0, size.getWidth(), size.getHeight());
        }
        return null;
    }

    private void m0() {
        n0();
        final c cVar = (c) H0.g.g(this.f33821r);
        final I0 i02 = (I0) H0.g.g(this.f33826w);
        this.f33822s.execute(new Runnable() { // from class: y.n0
            @Override // java.lang.Runnable
            public final void run() {
                cVar.a(i02);
            }
        });
    }

    private void n0() {
        F.M mI = i();
        P.L l10 = this.f33825v;
        if (mI == null || l10 == null) {
            return;
        }
        l10.z(u(mI, H(mI)), f());
    }

    private boolean q0(F.M m10) {
        return m10.o() && H(m10);
    }

    private void r0(C0468a1 c0468a1, o1 o1Var) {
        k1.b bVarK0 = k0(c0468a1, o1Var);
        this.f33823t = bVarK0;
        d0(AbstractC3567L.a(new Object[]{bVarK0.p()}));
    }

    @Override // y.J0
    public Set B() {
        HashSet hashSet = new HashSet();
        hashSet.add(1);
        return hashSet;
    }

    @Override // y.J0
    public D1.b D(InterfaceC0490j0 interfaceC0490j0) {
        return a.f(interfaceC0490j0);
    }

    @Override // y.J0
    protected D1 Q(F.L l10, D1.b bVar) {
        bVar.b().X(F.D0.f1294j, 34);
        return bVar.c();
    }

    @Override // y.J0
    protected o1 T(InterfaceC0490j0 interfaceC0490j0) {
        this.f33823t.g(interfaceC0490j0);
        d0(AbstractC3567L.a(new Object[]{this.f33823t.p()}));
        return g().i().d(interfaceC0490j0).a();
    }

    @Override // y.J0
    protected o1 U(o1 o1Var, o1 o1Var2) {
        AbstractC3583h0.a("Preview", "onSuggestedStreamSpecUpdated: primaryStreamSpec = " + o1Var + ", secondaryStreamSpec " + o1Var2);
        r0((C0468a1) l(), o1Var);
        return o1Var;
    }

    @Override // y.J0
    public void V() {
        j0();
    }

    @Override // y.J0
    public void b0(Rect rect) {
        super.b0(rect);
        n0();
    }

    @Override // y.J0
    public D1 m(boolean z10, E1 e12) {
        b bVar = f33820z;
        InterfaceC0490j0 interfaceC0490j0A = e12.a(bVar.a().G(), 1);
        if (z10) {
            interfaceC0490j0A = InterfaceC0490j0.W(interfaceC0490j0A, bVar.a());
        }
        if (interfaceC0490j0A == null) {
            return null;
        }
        return D(interfaceC0490j0A).c();
    }

    public void o0(Executor executor, c cVar) {
        H.y.b();
        if (cVar == null) {
            this.f33821r = null;
            K();
            return;
        }
        this.f33821r = cVar;
        this.f33822s = executor;
        if (h() != null) {
            r0((C0468a1) l(), g());
            L();
        }
        J();
    }

    public void p0(c cVar) {
        o0(f33819A, cVar);
    }

    public String toString() {
        return "Preview:" + r();
    }
}
