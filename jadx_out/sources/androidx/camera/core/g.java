package androidx.camera.core;

import F.AbstractC0504q0;
import F.B0;
import F.D0;
import F.D1;
import F.E0;
import F.E1;
import F.G0;
import F.InterfaceC0490j0;
import F.L;
import F.M;
import F.R0;
import F.S0;
import F.X0;
import F.k1;
import F.o1;
import H.y;
import S.c;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.util.Size;
import androidx.camera.core.internal.compat.quirk.OnePixelShiftQuirk;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.UUID;
import java.util.concurrent.Executor;
import y.AbstractC3567L;
import y.AbstractC3583h0;
import y.C3563H;
import y.J0;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public final class g extends J0 {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public static final d f15164A = new d();

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    private static final Boolean f15165B = null;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final Object f15166r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    j f15167s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private Executor f15168t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private a f15169u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private Rect f15170v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private Matrix f15171w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    k1.b f15172x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private AbstractC0504q0 f15173y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private k1.c f15174z;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    @Retention(RetentionPolicy.SOURCE)
    public @interface b {
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class c implements E0.a, D1.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final S0 f15175a;

        public c() {
            this(S0.i0());
        }

        static c f(InterfaceC0490j0 interfaceC0490j0) {
            return new c(S0.j0(interfaceC0490j0));
        }

        @Override // y.InterfaceC3564I
        public R0 b() {
            return this.f15175a;
        }

        public g e() {
            B0 b0C = c();
            E0.P(b0C);
            return new g(b0C);
        }

        @Override // F.D1.b
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public B0 c() {
            return new B0(X0.h0(this.f15175a));
        }

        public c h(int i10) {
            b().X(B0.f1265Q, Integer.valueOf(i10));
            return this;
        }

        public c i(E1.b bVar) {
            b().X(D1.f1303G, bVar);
            return this;
        }

        public c j(Size size) {
            b().X(E0.f1327r, size);
            return this;
        }

        public c k(C3563H c3563h) {
            if (!Objects.equals(C3563H.f33650d, c3563h)) {
                throw new UnsupportedOperationException("ImageAnalysis currently only supports SDR");
            }
            b().X(D0.f1296l, c3563h);
            return this;
        }

        public c l(S.c cVar) {
            b().X(E0.f1330u, cVar);
            return this;
        }

        public c m(int i10) {
            b().X(D1.f1297A, Integer.valueOf(i10));
            return this;
        }

        public c n(int i10) {
            if (i10 == -1) {
                i10 = 0;
            }
            b().X(E0.f1322m, Integer.valueOf(i10));
            return this;
        }

        public c o(Class cls) {
            b().X(K.q.f7019N, cls);
            if (b().f(K.q.f7018M, null) == null) {
                p(cls.getCanonicalName() + "-" + UUID.randomUUID());
            }
            return this;
        }

        public c p(String str) {
            b().X(K.q.f7018M, str);
            return this;
        }

        @Override // F.E0.a
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public c a(Size size) {
            b().X(E0.f1326q, size);
            return this;
        }

        @Override // F.E0.a
        /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
        public c d(int i10) {
            b().X(E0.f1323n, Integer.valueOf(i10));
            return this;
        }

        private c(S0 s02) {
            this.f15175a = s02;
            Class cls = (Class) s02.f(K.q.f7019N, null);
            if (cls == null || cls.equals(g.class)) {
                i(E1.b.IMAGE_ANALYSIS);
                o(g.class);
                return;
            }
            throw new IllegalArgumentException("Invalid target class configuration for " + this + ": " + cls);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final Size f15176a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final C3563H f15177b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final S.c f15178c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final B0 f15179d;

        static {
            Size size = new Size(640, 480);
            f15176a = size;
            C3563H c3563h = C3563H.f33650d;
            f15177b = c3563h;
            S.c cVarA = new c.a().d(S.a.f10229c).f(new S.d(O.d.f8168c, 1)).a();
            f15178c = cVarA;
            f15179d = new c().j(size).m(1).n(0).l(cVarA).k(c3563h).c();
        }

        public B0 a() {
            return f15179d;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    @Retention(RetentionPolicy.SOURCE)
    public @interface e {
    }

    g(B0 b02) {
        super(b02);
        this.f15166r = new Object();
    }

    public static /* synthetic */ void g0(r rVar, r rVar2) {
        rVar.j();
        if (rVar2 != null) {
            rVar2.j();
        }
    }

    public static /* synthetic */ void h0(g gVar, j jVar, k1 k1Var, k1.g gVar2) {
        if (gVar.i() == null) {
            return;
        }
        gVar.k0();
        jVar.f();
        k1.b bVarL0 = gVar.l0(gVar.k(), (B0) gVar.l(), (o1) H0.g.g(gVar.g()));
        gVar.f15172x = bVarL0;
        gVar.d0(AbstractC3567L.a(new Object[]{bVarL0.p()}));
        gVar.L();
    }

    public static /* synthetic */ List j0(Size size, List list, int i10) {
        ArrayList arrayList = new ArrayList(list);
        if (arrayList.contains(size)) {
            arrayList.remove(size);
            arrayList.add(0, size);
        }
        return arrayList;
    }

    private boolean q0(M m10) {
        return r0() && t(m10) % 180 != 0;
    }

    private void s0() {
        a aVar;
        synchronized (this.f15166r) {
            try {
                B0 b02 = (B0) l();
                if (b02.f0(0) == 1) {
                    this.f15167s = new k();
                } else {
                    this.f15167s = new l(b02.a0(I.c.c()));
                }
                this.f15167s.q(p0());
                this.f15167s.r(r0());
                M mI = i();
                Boolean boolO0 = o0();
                boolean zA = mI != null ? mI.r().w().a(OnePixelShiftQuirk.class) : false;
                j jVar = this.f15167s;
                if (boolO0 != null) {
                    zA = boolO0.booleanValue();
                }
                jVar.p(zA);
                if (mI != null) {
                    this.f15167s.t(t(mI));
                }
                Rect rect = this.f15170v;
                if (rect != null) {
                    this.f15167s.v(rect);
                }
                Matrix matrix = this.f15171w;
                if (matrix != null) {
                    this.f15167s.u(matrix);
                }
                Executor executor = this.f15168t;
                if (executor != null && (aVar = this.f15169u) != null) {
                    this.f15167s.o(executor, aVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private void v0() {
        synchronized (this.f15166r) {
            try {
                M mI = i();
                if (mI != null) {
                    this.f15167s.t(t(mI));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // y.J0
    public D1.b D(InterfaceC0490j0 interfaceC0490j0) {
        return c.f(interfaceC0490j0);
    }

    @Override // y.J0
    protected D1 Q(L l10, D1.b bVar) {
        final Size defaultTargetResolution;
        synchronized (this.f15166r) {
            try {
                a aVar = this.f15169u;
                defaultTargetResolution = aVar != null ? aVar.getDefaultTargetResolution() : null;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (defaultTargetResolution == null) {
            return bVar.c();
        }
        if (l10.p(((Integer) bVar.b().f(E0.f1323n, 0)).intValue()) % 180 == 90) {
            defaultTargetResolution = new Size(defaultTargetResolution.getHeight(), defaultTargetResolution.getWidth());
        }
        D1 d1C = bVar.c();
        InterfaceC0490j0.a aVar2 = E0.f1326q;
        if (!d1C.b(aVar2)) {
            bVar.b().X(aVar2, defaultTargetResolution);
        }
        D1 d1C2 = bVar.c();
        InterfaceC0490j0.a aVar3 = E0.f1330u;
        if (d1C2.b(aVar3)) {
            S.c cVar = (S.c) e().f(aVar3, null);
            c.a aVar4 = cVar == null ? new c.a() : c.a.b(cVar);
            if (cVar == null || cVar.d() == null) {
                aVar4.f(new S.d(defaultTargetResolution, 1));
            }
            if (cVar == null) {
                aVar4.e(new S.b() { // from class: y.O
                    @Override // S.b
                    public final List a(List list, int i10) {
                        return androidx.camera.core.g.j0(defaultTargetResolution, list, i10);
                    }
                });
            }
            bVar.b().X(aVar3, aVar4.a());
        }
        return bVar.c();
    }

    @Override // y.J0
    protected o1 T(InterfaceC0490j0 interfaceC0490j0) {
        this.f15172x.g(interfaceC0490j0);
        d0(AbstractC3567L.a(new Object[]{this.f15172x.p()}));
        return g().i().d(interfaceC0490j0).a();
    }

    @Override // y.J0
    protected o1 U(o1 o1Var, o1 o1Var2) {
        AbstractC3583h0.a("ImageAnalysis", "onSuggestedStreamSpecUpdated: primaryStreamSpec = " + o1Var + ", secondaryStreamSpec " + o1Var2);
        k1.b bVarL0 = l0(k(), (B0) l(), o1Var);
        this.f15172x = bVarL0;
        d0(AbstractC3567L.a(new Object[]{bVarL0.p()}));
        return o1Var;
    }

    @Override // y.J0
    public void V() {
        k0();
        synchronized (this.f15166r) {
            this.f15167s.i();
            this.f15167s = null;
        }
    }

    @Override // y.J0
    public void Z(Matrix matrix) {
        super.Z(matrix);
        synchronized (this.f15166r) {
            try {
                j jVar = this.f15167s;
                if (jVar != null) {
                    jVar.u(matrix);
                }
                this.f15171w = matrix;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // y.J0
    public void b0(Rect rect) {
        super.b0(rect);
        synchronized (this.f15166r) {
            try {
                j jVar = this.f15167s;
                if (jVar != null) {
                    jVar.v(rect);
                }
                this.f15170v = rect;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    void k0() {
        y.b();
        k1.c cVar = this.f15174z;
        if (cVar != null) {
            cVar.b();
            this.f15174z = null;
        }
        AbstractC0504q0 abstractC0504q0 = this.f15173y;
        if (abstractC0504q0 != null) {
            abstractC0504q0.d();
            this.f15173y = null;
        }
    }

    k1.b l0(String str, B0 b02, o1 o1Var) {
        final j jVar;
        y.b();
        Size sizeF = o1Var.f();
        Executor executor = (Executor) H0.g.g(b02.a0(I.c.c()));
        boolean z10 = true;
        int iN0 = m0() == 1 ? n0() : 4;
        b02.h0();
        final r rVar = new r(p.a(sizeF.getWidth(), sizeF.getHeight(), p(), iN0));
        synchronized (this.f15166r) {
            s0();
            jVar = this.f15167s;
        }
        boolean zQ0 = i() != null ? q0(i()) : false;
        int height = zQ0 ? sizeF.getHeight() : sizeF.getWidth();
        int width = zQ0 ? sizeF.getWidth() : sizeF.getHeight();
        int i10 = p0() == 2 ? 1 : 35;
        boolean z11 = p() == 35 && p0() == 2;
        boolean z12 = p() == 35 && p0() == 3;
        if (p() != 35 || ((i() == null || t(i()) == 0) && !Boolean.TRUE.equals(o0()))) {
            z10 = false;
        }
        final r rVar2 = (z11 || (z10 && !z12)) ? new r(p.a(height, width, i10, rVar.f())) : null;
        if (rVar2 != null) {
            jVar.s(rVar2);
        }
        v0();
        rVar.e(jVar, executor);
        k1.b bVarR = k1.b.r(b02, o1Var.f());
        if (o1Var.d() != null) {
            bVarR.g(o1Var.d());
        }
        AbstractC0504q0 abstractC0504q0 = this.f15173y;
        if (abstractC0504q0 != null) {
            abstractC0504q0.d();
        }
        G0 g02 = new G0(rVar.getSurface(), sizeF, p());
        this.f15173y = g02;
        g02.k().h(new Runnable() { // from class: y.P
            @Override // java.lang.Runnable
            public final void run() {
                androidx.camera.core.g.g0(rVar, rVar2);
            }
        }, I.c.e());
        bVarR.A(o1Var.g());
        b(bVarR, o1Var);
        bVarR.n(this.f15173y, o1Var.b(), null, -1);
        k1.c cVar = this.f15174z;
        if (cVar != null) {
            cVar.b();
        }
        k1.c cVar2 = new k1.c(new k1.d() { // from class: androidx.camera.core.f
            @Override // F.k1.d
            public final void a(k1 k1Var, k1.g gVar) {
                g.h0(this.f15162a, jVar, k1Var, gVar);
            }
        });
        this.f15174z = cVar2;
        bVarR.u(cVar2);
        return bVarR;
    }

    @Override // y.J0
    public D1 m(boolean z10, E1 e12) {
        d dVar = f15164A;
        InterfaceC0490j0 interfaceC0490j0A = e12.a(dVar.a().G(), 1);
        if (z10) {
            interfaceC0490j0A = InterfaceC0490j0.W(interfaceC0490j0A, dVar.a());
        }
        if (interfaceC0490j0A == null) {
            return null;
        }
        return D(interfaceC0490j0A).c();
    }

    public int m0() {
        return ((B0) l()).f0(0);
    }

    public int n0() {
        return ((B0) l()).g0(6);
    }

    public Boolean o0() {
        return ((B0) l()).i0(f15165B);
    }

    public int p0() {
        return ((B0) l()).j0(1);
    }

    public boolean r0() {
        return ((B0) l()).k0(Boolean.FALSE).booleanValue();
    }

    public void t0(Executor executor, final a aVar) {
        synchronized (this.f15166r) {
            try {
                j jVar = this.f15167s;
                if (jVar != null) {
                    jVar.o(executor, new a() { // from class: y.N
                        @Override // androidx.camera.core.g.a
                        public final void analyze(androidx.camera.core.o oVar) {
                            aVar.analyze(oVar);
                        }
                    });
                }
                if (this.f15169u == null) {
                    J();
                }
                this.f15168t = executor;
                this.f15169u = aVar;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public String toString() {
        return "ImageAnalysis:" + r();
    }

    public void u0(int i10) {
        if (a0(i10)) {
            v0();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public interface a {
        void analyze(o oVar);

        default Size getDefaultTargetResolution() {
            return null;
        }

        default int getTargetCoordinateSystem() {
            return 0;
        }

        default void updateTransform(Matrix matrix) {
        }
    }
}
