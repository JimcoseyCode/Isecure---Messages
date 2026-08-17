package T;

import F.D0;
import F.D1;
import F.E0;
import F.E1;
import F.InterfaceC0490j0;
import F.M;
import F.R0;
import F.S0;
import F.X0;
import F.k1;
import F.o1;
import F.p1;
import H.y;
import P.C1364t;
import P.L;
import P.U;
import Q.o;
import Q.r;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.util.Size;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import m5.InterfaceFutureC2904a;
import y.AbstractC3567L;
import y.AbstractC3583h0;
import y.C3561F;
import y.J0;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public class g extends J0 {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    private L f10341A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    private L f10342B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private L f10343C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private L f10344D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private L f10345E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    k1.b f10346F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    k1.b f10347G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private k1.c f10348H;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final i f10349r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final k f10350s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final C3561F f10351t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final C3561F f10352u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private U f10353v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private U f10354w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private r f10355x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private U f10356y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private L f10357z;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    interface a {
        InterfaceFutureC2904a a(int i10, int i11);
    }

    public g(M m10, M m11, C3561F c3561f, C3561F c3561f2, Set set, E1 e12) {
        super(u0(set));
        this.f10349r = u0(set);
        this.f10351t = c3561f;
        this.f10352u = c3561f2;
        this.f10350s = new k(m10, m11, set, e12, new a() { // from class: T.e
            @Override // T.g.a
            public final InterfaceFutureC2904a a(int i10, int i11) {
                return g.h0(this.f10334a, i10, i11);
            }
        });
        B0(set);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void A0(L l10, L l11, r rVar, o1 o1Var) {
        n();
        boolean z10 = E() != null;
        Map mapE = this.f10350s.E(l10, l11, C(), z10);
        r.c cVarG = this.f10355x.g(r.b.d(l10, l11, new ArrayList(mapE.values())));
        HashMap map = new HashMap();
        for (Map.Entry entry : mapE.entrySet()) {
            map.put((J0) entry.getKey(), (L) cVarG.get(entry.getValue()));
        }
        this.f10350s.R(map, this.f10350s.H(l10, z10));
    }

    public static /* synthetic */ void g0(g gVar, String str, String str2, D1 d12, o1 o1Var, o1 o1Var2, k1 k1Var, k1.g gVar2) {
        if (gVar.i() == null) {
            return;
        }
        gVar.j0();
        gVar.d0(gVar.m0(str, str2, d12, o1Var, o1Var2));
        gVar.L();
        gVar.f10350s.O();
    }

    public static /* synthetic */ InterfaceFutureC2904a h0(g gVar, int i10, int i11) {
        U u10 = gVar.f10354w;
        return u10 != null ? u10.e().d(i10, i11) : J.n.n(new Exception("Failed to take picture: pipeline is not ready."));
    }

    private void i0(k1.b bVar, final String str, final String str2, final D1 d12, final o1 o1Var, final o1 o1Var2) {
        k1.c cVar = this.f10348H;
        if (cVar != null) {
            cVar.b();
        }
        k1.c cVar2 = new k1.c(new k1.d() { // from class: T.f
            @Override // F.k1.d
            public final void a(k1 k1Var, k1.g gVar) {
                g.g0(this.f10335a, str, str2, d12, o1Var, o1Var2, k1Var, gVar);
            }
        });
        this.f10348H = cVar2;
        bVar.u(cVar2);
    }

    private void j0() {
        k1.c cVar = this.f10348H;
        if (cVar != null) {
            cVar.b();
            this.f10348H = null;
        }
        L l10 = this.f10357z;
        if (l10 != null) {
            l10.i();
            this.f10357z = null;
        }
        L l11 = this.f10341A;
        if (l11 != null) {
            l11.i();
            this.f10341A = null;
        }
        L l12 = this.f10342B;
        if (l12 != null) {
            l12.i();
            this.f10342B = null;
        }
        L l13 = this.f10343C;
        if (l13 != null) {
            l13.i();
            this.f10343C = null;
        }
        L l14 = this.f10344D;
        if (l14 != null) {
            l14.i();
            this.f10344D = null;
        }
        L l15 = this.f10345E;
        if (l15 != null) {
            l15.i();
            this.f10345E = null;
        }
        U u10 = this.f10354w;
        if (u10 != null) {
            u10.f();
            this.f10354w = null;
        }
        r rVar = this.f10355x;
        if (rVar != null) {
            rVar.d();
            this.f10355x = null;
        }
        U u11 = this.f10353v;
        if (u11 != null) {
            u11.f();
            this.f10353v = null;
        }
        U u12 = this.f10356y;
        if (u12 != null) {
            u12.f();
            this.f10356y = null;
        }
    }

    private r k0(M m10, M m11, o1 o1Var, C3561F c3561f, C3561F c3561f2) {
        return new r(m10, m11, o.a.a(o1Var.b(), c3561f, c3561f2));
    }

    private U l0(M m10, o1 o1Var) {
        n();
        return new U(m10, C1364t.a.a(o1Var.b()));
    }

    private List m0(String str, String str2, D1 d12, o1 o1Var, o1 o1Var2) {
        y.b();
        if (o1Var2 != null) {
            L lN0 = n0(str, str2, d12, o1Var, o1Var2);
            L lO0 = o0(str, str2, d12, o1Var, o1Var2);
            r rVarK0 = k0(i(), v(), o1Var, this.f10351t, this.f10352u);
            this.f10355x = rVarK0;
            A0(lN0, lO0, rVarK0, o1Var);
            return AbstractC3567L.a(new Object[]{this.f10346F.p(), this.f10347G.p()});
        }
        L lN02 = n0(str, str2, d12, o1Var, null);
        M mI = i();
        Objects.requireNonNull(mI);
        U uL0 = l0(mI, o1Var);
        this.f10354w = uL0;
        z0(lN02, uL0, false);
        return AbstractC3567L.a(new Object[]{this.f10346F.p()});
    }

    private L n0(String str, String str2, D1 d12, o1 o1Var, o1 o1Var2) {
        Matrix matrixY = y();
        M mI = i();
        Objects.requireNonNull(mI);
        boolean zO = mI.o();
        Rect rectT0 = t0(o1Var.f());
        Objects.requireNonNull(rectT0);
        M mI2 = i();
        Objects.requireNonNull(mI2);
        int iT = t(mI2);
        M mI3 = i();
        Objects.requireNonNull(mI3);
        L l10 = new L(3, 34, o1Var, matrixY, zO, rectT0, iT, -1, H(mI3));
        this.f10357z = l10;
        boolean z10 = str2 != null;
        M mI4 = i();
        Objects.requireNonNull(mI4);
        this.f10342B = v0(l10, mI4, z10);
        k1.b bVarP0 = p0(this.f10357z, d12, o1Var);
        this.f10346F = bVarP0;
        i0(bVarP0, str, str2, d12, o1Var, o1Var2);
        return this.f10342B;
    }

    private L o0(String str, String str2, D1 d12, o1 o1Var, o1 o1Var2) {
        Matrix matrixY = y();
        M mV = v();
        Objects.requireNonNull(mV);
        boolean zO = mV.o();
        Rect rectT0 = t0(o1Var2.f());
        Objects.requireNonNull(rectT0);
        M mV2 = v();
        Objects.requireNonNull(mV2);
        int iT = t(mV2);
        M mV3 = v();
        Objects.requireNonNull(mV3);
        L l10 = new L(3, 34, o1Var2, matrixY, zO, rectT0, iT, -1, H(mV3));
        this.f10341A = l10;
        M mV4 = v();
        Objects.requireNonNull(mV4);
        this.f10343C = v0(l10, mV4, true);
        k1.b bVarP0 = p0(this.f10341A, d12, o1Var2);
        this.f10347G = bVarP0;
        i0(bVarP0, str, str2, d12, o1Var, o1Var2);
        return this.f10343C;
    }

    private k1.b p0(L l10, D1 d12, o1 o1Var) {
        k1.b bVarR = k1.b.r(d12, o1Var.f());
        y0(bVarR);
        x0(o1Var.f(), bVarR);
        bVarR.n(l10.o(), o1Var.b(), null, -1);
        bVarR.j(this.f10350s.G());
        if (o1Var.d() != null) {
            bVarR.g(o1Var.d());
        }
        bVarR.A(o1Var.g());
        b(bVarR, o1Var);
        return bVarR;
    }

    public static List q0(J0 j02) {
        ArrayList arrayList = new ArrayList();
        if (!w0(j02)) {
            arrayList.add(j02.l().G());
            return arrayList;
        }
        Iterator it = ((g) j02).s0().iterator();
        while (it.hasNext()) {
            arrayList.add(((J0) it.next()).l().G());
        }
        return arrayList;
    }

    private static int r0(J0 j02) {
        return j02.l().w().p();
    }

    private Rect t0(Size size) {
        return E() != null ? E() : new Rect(0, 0, size.getWidth(), size.getHeight());
    }

    private static i u0(Set set) {
        R0 r0B = new h().b();
        r0B.X(D0.f1294j, 34);
        ArrayList arrayList = new ArrayList();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            J0 j02 = (J0) it.next();
            if (j02.l().b(D1.f1303G)) {
                arrayList.add(j02.l().G());
            }
        }
        r0B.X(i.f10359Q, arrayList);
        r0B.X(E0.f1325p, 2);
        r0B.X(D1.f1307K, p1.f1610m);
        return new i(X0.h0(r0B));
    }

    private L v0(L l10, M m10, boolean z10) {
        n();
        return l10;
    }

    public static boolean w0(J0 j02) {
        return j02 instanceof g;
    }

    private void x0(Size size, k1.b bVar) {
        Iterator it = s0().iterator();
        while (it.hasNext()) {
            k1 k1VarP = k1.b.r(((J0) it.next()).l(), size).p();
            bVar.c(k1VarP.j());
            bVar.a(k1VarP.n());
            bVar.d(k1VarP.l());
            bVar.b(k1VarP.c());
            bVar.g(k1VarP.g());
        }
    }

    private void y0(k1.b bVar) {
        Iterator it = s0().iterator();
        int iF = -1;
        while (it.hasNext()) {
            iF = k1.f(iF, r0((J0) it.next()));
        }
        if (iF != -1) {
            bVar.B(iF);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void z0(L l10, U u10, boolean z10) {
        boolean z11 = E() != null;
        Map mapD = this.f10350s.D(l10, C(), z11, z10);
        U.c cVarJ = u10.j(U.b.c(l10, new ArrayList(mapD.values())));
        HashMap map = new HashMap();
        for (Map.Entry entry : mapD.entrySet()) {
            map.put((J0) entry.getKey(), (L) cVarJ.get(entry.getValue()));
        }
        this.f10350s.R(map, this.f10350s.H(l10, z11));
    }

    @Override // y.J0
    public Set A(F.L l10) {
        Set setS0 = s0();
        HashSet hashSet = null;
        if (setS0.isEmpty()) {
            return null;
        }
        Iterator it = setS0.iterator();
        while (it.hasNext()) {
            Set setA = ((J0) it.next()).A(l10);
            if (setA != null) {
                if (hashSet == null) {
                    hashSet = new HashSet(setA);
                } else {
                    hashSet.retainAll(setA);
                }
            }
        }
        return hashSet;
    }

    @Override // y.J0
    public Set B() {
        HashSet hashSet = new HashSet();
        hashSet.add(3);
        return hashSet;
    }

    public void B0(Set set) {
        Y(((J0) set.iterator().next()).o());
    }

    @Override // y.J0
    public D1.b D(InterfaceC0490j0 interfaceC0490j0) {
        return new h(S0.j0(interfaceC0490j0));
    }

    @Override // y.J0
    public void O() {
        super.O();
        this.f10350s.t();
    }

    @Override // y.J0
    public void P() {
        super.P();
        this.f10350s.L();
    }

    @Override // y.J0
    protected D1 Q(F.L l10, D1.b bVar) {
        this.f10350s.K(bVar.b());
        return bVar.c();
    }

    @Override // y.J0
    public void R() {
        super.R();
        this.f10350s.M();
    }

    @Override // y.J0
    public void S() {
        super.S();
        this.f10350s.N();
    }

    @Override // y.J0
    protected o1 T(InterfaceC0490j0 interfaceC0490j0) {
        this.f10346F.g(interfaceC0490j0);
        d0(AbstractC3567L.a(new Object[]{this.f10346F.p()}));
        return g().i().d(interfaceC0490j0).a();
    }

    @Override // y.J0
    protected o1 U(o1 o1Var, o1 o1Var2) {
        AbstractC3583h0.a("StreamSharing", "onSuggestedStreamSpecUpdated: primaryStreamSpec = " + o1Var + ", secondaryStreamSpec " + o1Var2);
        d0(m0(k(), w(), l(), o1Var, o1Var2));
        J();
        return o1Var;
    }

    @Override // y.J0
    public void V() {
        super.V();
        j0();
        this.f10350s.T();
    }

    @Override // y.J0
    public D1 m(boolean z10, E1 e12) {
        InterfaceC0490j0 interfaceC0490j0A = e12.a(this.f10349r.G(), 1);
        if (z10) {
            interfaceC0490j0A = InterfaceC0490j0.W(interfaceC0490j0A, this.f10349r.o());
        }
        if (interfaceC0490j0A == null) {
            return null;
        }
        return D(interfaceC0490j0A).c();
    }

    public Set s0() {
        return this.f10350s.C();
    }
}
