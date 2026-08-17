package T;

import F.AbstractC0504q0;
import F.B;
import F.D0;
import F.D1;
import F.E0;
import F.E1;
import F.M;
import F.R0;
import F.k1;
import F.o1;
import F.r;
import H.y;
import H.z;
import P.L;
import T.g;
import android.graphics.Rect;
import android.util.Range;
import android.util.Size;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import y.AbstractC3583h0;
import y.C3563H;
import y.J0;
import y.V;
import y.p0;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
class k implements J0.c {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final Set f10365g;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final E1 f10369k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final M f10370l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final M f10371m;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final Set f10373o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final Map f10374p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final c f10375q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private c f10376r;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    final Map f10366h = new HashMap();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final Map f10367i = new HashMap();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    final Map f10368j = new HashMap();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final r f10372n = v();

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    static class a extends r {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final WeakReference f10377a;

        a(k kVar) {
            this.f10377a = new WeakReference(kVar);
        }

        @Override // F.r
        public void b(int i10, B b10) {
            k kVar = (k) this.f10377a.get();
            if (kVar != null) {
                Iterator it = kVar.f10365g.iterator();
                while (it.hasNext()) {
                    k.Q(b10, ((J0) it.next()).z(), i10);
                }
            }
        }
    }

    k(M m10, M m11, Set set, E1 e12, g.a aVar) {
        this.f10370l = m10;
        this.f10371m = m11;
        this.f10369k = e12;
        this.f10365g = set;
        Map mapS = S(m10, set, e12);
        this.f10374p = mapS;
        HashSet hashSet = new HashSet(mapS.values());
        this.f10373o = hashSet;
        this.f10375q = new c(m10, hashSet);
        if (m11 != null) {
            this.f10376r = new c(m11, hashSet);
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            J0 j02 = (J0) it.next();
            this.f10368j.put(j02, Boolean.FALSE);
            this.f10367i.put(j02, new j(m10, this, aVar));
        }
    }

    static AbstractC0504q0 A(J0 j02) {
        List listO = j02 instanceof V ? j02.z().o() : j02.z().k().i();
        H0.g.i(listO.size() <= 1);
        if (listO.size() == 1) {
            return (AbstractC0504q0) listO.get(0);
        }
        return null;
    }

    private static int B(J0 j02) {
        if (j02 instanceof p0) {
            return 1;
        }
        return j02 instanceof V ? 4 : 2;
    }

    private static int F(Set set) {
        Iterator it = set.iterator();
        int iMax = 0;
        while (it.hasNext()) {
            iMax = Math.max(iMax, ((D1) it.next()).N(0));
        }
        return iMax;
    }

    private L I(J0 j02) {
        L l10 = (L) this.f10366h.get(j02);
        Objects.requireNonNull(l10);
        return l10;
    }

    private boolean J(J0 j02) {
        Boolean bool = (Boolean) this.f10368j.get(j02);
        Objects.requireNonNull(bool);
        return bool.booleanValue();
    }

    private static Range P(Set set) {
        Range rangeIntersect = o1.f1588a;
        Iterator it = set.iterator();
        while (it.hasNext()) {
            Range rangeK = ((D1) it.next()).K(rangeIntersect);
            Objects.requireNonNull(rangeK);
            if (o1.f1588a.equals(rangeIntersect)) {
                rangeIntersect = rangeK;
            } else {
                try {
                    rangeIntersect = rangeIntersect.intersect(rangeK);
                } catch (IllegalArgumentException unused) {
                    AbstractC3583h0.a("VirtualCameraAdapter", "No intersected frame rate can be found from the target frame rate settings of the UseCases! Resolved: " + rangeIntersect + " <<>> " + rangeK);
                    return rangeIntersect.extend(rangeK);
                }
            }
        }
        return rangeIntersect;
    }

    static void Q(B b10, k1 k1Var, int i10) {
        Iterator it = k1Var.j().iterator();
        while (it.hasNext()) {
            ((r) it.next()).b(i10, new l(k1Var.k().j(), b10));
        }
    }

    private static Map S(M m10, Set set, E1 e12) {
        HashMap map = new HashMap();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            J0 j02 = (J0) it.next();
            map.put(j02, j02.I(m10.r(), null, j02.m(true, e12)));
        }
        return map;
    }

    private void U(J0 j02) {
        int iY = y(j02, this.f10370l);
        j jVar = (j) this.f10367i.get(j02);
        Objects.requireNonNull(jVar);
        jVar.t(iY);
    }

    private R.f u(J0 j02, c cVar, M m10, L l10, int i10, boolean z10, boolean z11) {
        int iP = m10.d().p(i10);
        boolean zL = z.l(l10.r());
        D1 d12 = (D1) this.f10374p.get(j02);
        Objects.requireNonNull(d12);
        b bVarQ = cVar.q(d12, l10.n(), z.g(l10.r()), z10);
        Rect rectB = bVarQ.b();
        Size sizeA = bVarQ.a();
        int iV = z.v((l10.q() + y(j02, m10)) - iP);
        return R.f.h(B(j02), x(j02), rectB, z.p(sizeA, iV), iV, z11 ? false : j02.H(m10) ^ zL);
    }

    private static void w(L l10, AbstractC0504q0 abstractC0504q0, k1 k1Var) {
        l10.v();
        try {
            l10.y(abstractC0504q0);
        } catch (AbstractC0504q0.a unused) {
            if (k1Var.d() != null) {
                k1Var.d().a(k1Var, k1.g.SESSION_ERROR_SURFACE_NEEDS_RESET);
            }
        }
    }

    private static int x(J0 j02) {
        return j02 instanceof V ? 256 : 34;
    }

    private int y(J0 j02, M m10) {
        return m10.d().p(((E0) j02.l()).c0(0));
    }

    private static o1 z(J0 j02, o1 o1Var, Map map) {
        o1.a aVarI = o1Var.i();
        Size size = (Size) map.get(j02);
        if (size != null) {
            aVarI.e(size);
        }
        return aVarI.a();
    }

    Set C() {
        return this.f10365g;
    }

    Map D(L l10, int i10, boolean z10, boolean z11) {
        HashMap map = new HashMap();
        for (J0 j02 : this.f10365g) {
            L l11 = l10;
            R.f fVarU = u(j02, this.f10375q, this.f10370l, l11, i10, z10, z11);
            U(j02);
            map.put(j02, fVarU);
            l10 = l11;
        }
        return map;
    }

    Map E(L l10, L l11, int i10, boolean z10) {
        HashMap map = new HashMap();
        for (J0 j02 : this.f10365g) {
            L l12 = l10;
            int i11 = i10;
            boolean z11 = z10;
            R.f fVarU = u(j02, this.f10375q, this.f10370l, l12, i11, z11, false);
            c cVar = this.f10376r;
            Objects.requireNonNull(cVar);
            M m10 = this.f10371m;
            Objects.requireNonNull(m10);
            L l13 = l11;
            R.f fVarU2 = u(j02, cVar, m10, l13, i11, z11, false);
            U(j02);
            map.put(j02, Q.d.c(fVarU, fVarU2));
            l10 = l12;
            l11 = l13;
            i10 = i11;
            z10 = z11;
        }
        return map;
    }

    r G() {
        return this.f10372n;
    }

    Map H(L l10, boolean z10) {
        HashMap map = new HashMap();
        for (J0 j02 : this.f10365g) {
            c cVar = this.f10375q;
            D1 d12 = (D1) this.f10374p.get(j02);
            Objects.requireNonNull(d12);
            b bVarQ = cVar.q(d12, l10.n(), z.g(l10.r()), z10);
            map.put(j02, bVarQ.c());
            AbstractC3583h0.a("VirtualCameraAdapter", "Selected child size: " + bVarQ.c() + ", useCase: " + j02);
        }
        return map;
    }

    void K(R0 r02) {
        r02.X(E0.f1331v, this.f10375q.o(r02));
        r02.X(D1.f1297A, Integer.valueOf(F(this.f10373o)));
        C3563H c3563hD = T.a.d(this.f10373o);
        if (c3563hD == null) {
            throw new IllegalArgumentException("Failed to merge child dynamic ranges, can not find a dynamic range that satisfies all children.");
        }
        r02.X(D0.f1296l, c3563hD);
        r02.X(D1.f1299C, P(this.f10373o));
        Iterator it = this.f10365g.iterator();
        while (it.hasNext()) {
            D1 d12 = (D1) this.f10374p.get((J0) it.next());
            Objects.requireNonNull(d12);
            D1 d13 = d12;
            if (d13.H() != 0) {
                r02.X(D1.f1305I, Integer.valueOf(d13.H()));
            }
            if (d13.Q() != 0) {
                r02.X(D1.f1304H, Integer.valueOf(d13.Q()));
            }
        }
    }

    void L() {
        Iterator it = this.f10365g.iterator();
        while (it.hasNext()) {
            ((J0) it.next()).P();
        }
    }

    void M() {
        Iterator it = this.f10365g.iterator();
        while (it.hasNext()) {
            ((J0) it.next()).R();
        }
    }

    void N() {
        Iterator it = this.f10365g.iterator();
        while (it.hasNext()) {
            ((J0) it.next()).S();
        }
    }

    void O() {
        y.b();
        Iterator it = this.f10365g.iterator();
        while (it.hasNext()) {
            g((J0) it.next());
        }
    }

    void R(Map map, Map map2) {
        this.f10366h.clear();
        this.f10366h.putAll(map);
        for (Map.Entry entry : this.f10366h.entrySet()) {
            J0 j02 = (J0) entry.getKey();
            L l10 = (L) entry.getValue();
            j02.b0(l10.n());
            j02.Z(l10.r());
            j02.e0(z(j02, l10.s(), map2), null);
            j02.M();
        }
    }

    void T() {
        for (J0 j02 : this.f10365g) {
            j jVar = (j) this.f10367i.get(j02);
            Objects.requireNonNull(jVar);
            j02.c0(jVar);
        }
    }

    @Override // y.J0.c
    public void e(J0 j02) {
        y.b();
        if (J(j02)) {
            this.f10368j.put(j02, Boolean.FALSE);
            I(j02).m();
        }
    }

    @Override // y.J0.c
    public void g(J0 j02) {
        AbstractC0504q0 abstractC0504q0A;
        y.b();
        L lI = I(j02);
        if (J(j02) && (abstractC0504q0A = A(j02)) != null) {
            w(lI, abstractC0504q0A, j02.z());
        }
    }

    @Override // y.J0.c
    public void k(J0 j02) {
        y.b();
        if (J(j02)) {
            L lI = I(j02);
            AbstractC0504q0 abstractC0504q0A = A(j02);
            if (abstractC0504q0A != null) {
                w(lI, abstractC0504q0A, j02.z());
            } else {
                lI.m();
            }
        }
    }

    @Override // y.J0.c
    public void s(J0 j02) {
        y.b();
        if (J(j02)) {
            return;
        }
        this.f10368j.put(j02, Boolean.TRUE);
        AbstractC0504q0 abstractC0504q0A = A(j02);
        if (abstractC0504q0A != null) {
            w(I(j02), abstractC0504q0A, j02.z());
        }
    }

    void t() {
        for (J0 j02 : this.f10365g) {
            j jVar = (j) this.f10367i.get(j02);
            Objects.requireNonNull(jVar);
            j02.d(jVar, null, null, j02.m(true, this.f10369k));
        }
    }

    r v() {
        return new a(this);
    }
}
