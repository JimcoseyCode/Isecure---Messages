package y;

import C.e;
import F.AbstractC0504q0;
import F.D1;
import F.E1;
import F.InterfaceC0490j0;
import F.S0;
import F.k1;
import F.o1;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.util.Range;
import android.util.Size;
import androidx.camera.core.internal.compat.quirk.AeFpsRangeQuirk;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public abstract class J0 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private D1 f33703e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private D1 f33704f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Set f33705g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private D1 f33706h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private o1 f33707i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private D1 f33708j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private Rect f33709k;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private F.M f33711m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private F.M f33712n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private String f33713o;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f33699a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Set f33700b = new HashSet();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Object f33701c = new Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private b f33702d = b.INACTIVE;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private Matrix f33710l = new Matrix();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private k1 f33714p = k1.b();

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private k1 f33715q = k1.b();

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f33716a;

        static {
            int[] iArr = new int[e.b.values().length];
            f33716a = iArr;
            try {
                iArr[e.b.f462g.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f33716a[e.b.f463h.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f33716a[e.b.f464i.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    enum b {
        ACTIVE,
        INACTIVE
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public interface c {
        void e(J0 j02);

        void g(J0 j02);

        void k(J0 j02);

        void s(J0 j02);
    }

    protected J0(D1 d12) {
        this.f33704f = d12;
        this.f33706h = d12;
    }

    private void W(c cVar) {
        this.f33700b.remove(cVar);
    }

    private void a(c cVar) {
        this.f33700b.add(cVar);
    }

    private void c(S0 s02) {
        AbstractC3583h0.a("UseCase", "applyFeaturesToConfig: mFeatureGroup = " + this.f33705g + ", this = " + this);
        Set<A.b> set = this.f33705g;
        if (set == null) {
            return;
        }
        C3563H c3563hF = C.a.f441j;
        Range range = o1.f1588a;
        e.b bVarF = C.e.f459j;
        for (A.b bVar : set) {
            if (bVar instanceof C.a) {
                c3563hF = ((C.a) bVar).f();
            } else if (bVar instanceof C.c) {
                C.c cVar = (C.c) bVar;
                range = new Range(Integer.valueOf(cVar.g()), Integer.valueOf(cVar.f()));
            } else if (bVar instanceof C.e) {
                bVarF = ((C.e) bVar).f();
            }
        }
        if ((this instanceof p0) || K.f.e0(this)) {
            s02.X(F.D0.f1296l, c3563hF);
        }
        s02.X(D1.f1299C, range);
        int i10 = a.f33716a[bVarF.ordinal()];
        if (i10 == 1) {
            s02.X(D1.f1304H, 1);
            s02.X(D1.f1305I, 1);
        } else if (i10 == 2) {
            s02.X(D1.f1304H, 0);
            s02.X(D1.f1305I, 2);
        } else {
            if (i10 != 3) {
                return;
            }
            s02.X(D1.f1304H, 2);
            s02.X(D1.f1305I, 0);
        }
    }

    public Set A(F.L l10) {
        return null;
    }

    protected Set B() {
        return Collections.EMPTY_SET;
    }

    protected int C() {
        return ((F.E0) this.f33706h).c0(0);
    }

    public abstract D1.b D(InterfaceC0490j0 interfaceC0490j0);

    public Rect E() {
        return this.f33709k;
    }

    public boolean F(int i10) {
        Iterator it = B().iterator();
        while (it.hasNext()) {
            if (P.V.b(i10, ((Integer) it.next()).intValue())) {
                return true;
            }
        }
        return false;
    }

    public boolean G() {
        return this.f33699a;
    }

    public boolean H(F.M m10) {
        int iQ = q();
        if (iQ == -1 || iQ == 0) {
            return false;
        }
        if (iQ == 1) {
            return true;
        }
        if (iQ == 2) {
            return m10.f();
        }
        throw new AssertionError("Unknown mirrorMode: " + iQ);
    }

    public D1 I(F.L l10, D1 d12, D1 d13) {
        S0 s0I0;
        if (d13 != null) {
            s0I0 = S0.j0(d13);
            s0I0.k0(K.q.f7018M);
        } else {
            s0I0 = S0.i0();
        }
        if (this.f33704f.b(F.E0.f1322m) || this.f33704f.b(F.E0.f1326q)) {
            InterfaceC0490j0.a aVar = F.E0.f1330u;
            if (s0I0.b(aVar)) {
                s0I0.k0(aVar);
            }
        }
        D1 d14 = this.f33704f;
        InterfaceC0490j0.a aVar2 = F.E0.f1330u;
        if (d14.b(aVar2)) {
            InterfaceC0490j0.a aVar3 = F.E0.f1328s;
            if (s0I0.b(aVar3) && ((S.c) this.f33704f.d(aVar2)).d() != null) {
                s0I0.k0(aVar3);
            }
        }
        Iterator it = this.f33704f.a().iterator();
        while (it.hasNext()) {
            InterfaceC0490j0.k(s0I0, s0I0, this.f33704f, (InterfaceC0490j0.a) it.next());
        }
        if (d12 != null) {
            for (InterfaceC0490j0.a aVar4 : d12.a()) {
                if (!aVar4.c().equals(K.q.f7018M.c())) {
                    InterfaceC0490j0.k(s0I0, s0I0, d12, aVar4);
                }
            }
        }
        if (s0I0.b(F.E0.f1326q)) {
            InterfaceC0490j0.a aVar5 = F.E0.f1322m;
            if (s0I0.b(aVar5)) {
                s0I0.k0(aVar5);
            }
        }
        InterfaceC0490j0.a aVar6 = F.E0.f1330u;
        if (s0I0.b(aVar6) && ((S.c) s0I0.d(aVar6)).a() != 0) {
            s0I0.X(D1.f1301E, Boolean.TRUE);
        }
        c(s0I0);
        return Q(l10, D(s0I0));
    }

    protected final void J() {
        this.f33702d = b.ACTIVE;
        M();
    }

    protected final void K() {
        this.f33702d = b.INACTIVE;
        M();
    }

    protected final void L() {
        Iterator it = this.f33700b.iterator();
        while (it.hasNext()) {
            ((c) it.next()).g(this);
        }
    }

    public final void M() {
        int iOrdinal = this.f33702d.ordinal();
        if (iOrdinal == 0) {
            Iterator it = this.f33700b.iterator();
            while (it.hasNext()) {
                ((c) it.next()).s(this);
            }
        } else {
            if (iOrdinal != 1) {
                return;
            }
            Iterator it2 = this.f33700b.iterator();
            while (it2.hasNext()) {
                ((c) it2.next()).e(this);
            }
        }
    }

    protected final void N() {
        Iterator it = this.f33700b.iterator();
        while (it.hasNext()) {
            ((c) it.next()).k(this);
        }
    }

    protected abstract D1 Q(F.L l10, D1.b bVar);

    public void R() {
        this.f33699a = true;
    }

    public void S() {
        this.f33699a = false;
    }

    protected abstract o1 T(InterfaceC0490j0 interfaceC0490j0);

    protected abstract o1 U(o1 o1Var, o1 o1Var2);

    public void X(AbstractC3588k abstractC3588k) {
        H0.g.a(true);
    }

    public void Y(Set set) {
        this.f33705g = set != null ? new HashSet(set) : null;
    }

    public void Z(Matrix matrix) {
        this.f33710l = new Matrix(matrix);
    }

    protected boolean a0(int i10) {
        int iC0 = ((F.E0) l()).c0(-1);
        if (iC0 != -1 && iC0 == i10) {
            return false;
        }
        D1.b bVarD = D(this.f33704f);
        O.e.a(bVarD, i10);
        this.f33704f = bVarD.c();
        F.M mI = i();
        if (mI == null) {
            this.f33706h = this.f33704f;
            return true;
        }
        this.f33706h = I(mI.r(), this.f33703e, this.f33708j);
        return true;
    }

    protected void b(k1.b bVar, o1 o1Var) {
        if (!o1.f1588a.equals(o1Var.c())) {
            bVar.v(o1Var.c());
            return;
        }
        synchronized (this.f33701c) {
            try {
                List listC = ((F.M) H0.g.g(this.f33711m)).r().w().c(AeFpsRangeQuirk.class);
                boolean z10 = true;
                if (listC.size() > 1) {
                    z10 = false;
                }
                H0.g.b(z10, "There should not have more than one AeFpsRangeQuirk.");
                if (!listC.isEmpty()) {
                    bVar.v(((AeFpsRangeQuirk) listC.get(0)).b());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void b0(Rect rect) {
        this.f33709k = rect;
    }

    public final void c0(F.M m10) {
        V();
        synchronized (this.f33701c) {
            try {
                F.M m11 = this.f33711m;
                if (m10 == m11) {
                    W(m11);
                    this.f33711m = null;
                }
                F.M m12 = this.f33712n;
                if (m10 == m12) {
                    W(m12);
                    this.f33712n = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f33707i = null;
        this.f33709k = null;
        this.f33706h = this.f33704f;
        this.f33703e = null;
        this.f33708j = null;
    }

    public final void d(F.M m10, F.M m11, D1 d12, D1 d13) {
        synchronized (this.f33701c) {
            try {
                this.f33711m = m10;
                this.f33712n = m11;
                a(m10);
                if (m11 != null) {
                    a(m11);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f33703e = d12;
        this.f33708j = d13;
        this.f33706h = I(m10.r(), this.f33703e, this.f33708j);
        O();
    }

    protected void d0(List list) {
        if (list.isEmpty()) {
            return;
        }
        this.f33714p = (k1) list.get(0);
        if (list.size() > 1) {
            this.f33715q = (k1) list.get(1);
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            for (AbstractC0504q0 abstractC0504q0 : ((k1) it.next()).o()) {
                if (abstractC0504q0.g() == null) {
                    abstractC0504q0.p(getClass());
                }
            }
        }
    }

    public D1 e() {
        return this.f33704f;
    }

    public void e0(o1 o1Var, o1 o1Var2) {
        this.f33707i = U(o1Var, o1Var2);
    }

    protected int f() {
        return ((F.E0) this.f33706h).B(-1);
    }

    public void f0(InterfaceC0490j0 interfaceC0490j0) {
        this.f33707i = T(interfaceC0490j0);
    }

    public o1 g() {
        return this.f33707i;
    }

    public Size h() {
        o1 o1Var = this.f33707i;
        if (o1Var != null) {
            return o1Var.f();
        }
        return null;
    }

    public F.M i() {
        F.M m10;
        synchronized (this.f33701c) {
            m10 = this.f33711m;
        }
        return m10;
    }

    protected F.I j() {
        synchronized (this.f33701c) {
            try {
                F.M m10 = this.f33711m;
                if (m10 == null) {
                    return F.I.f1344a;
                }
                return m10.h();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    protected String k() {
        return ((F.M) H0.g.h(i(), "No camera attached to use case: " + this)).r().f();
    }

    public D1 l() {
        return this.f33706h;
    }

    public abstract D1 m(boolean z10, E1 e12);

    public AbstractC3588k n() {
        return null;
    }

    public Set o() {
        return this.f33705g;
    }

    public int p() {
        return this.f33706h.r();
    }

    protected int q() {
        return ((F.E0) this.f33706h).d0(-1);
    }

    public String r() {
        String strC = this.f33706h.C("<UnknownUseCase-" + hashCode() + ">");
        Objects.requireNonNull(strC);
        return strC;
    }

    public String s() {
        return this.f33713o;
    }

    protected int t(F.M m10) {
        return u(m10, false);
    }

    protected int u(F.M m10, boolean z10) {
        int iP = m10.r().p(C());
        return (m10.o() || !z10) ? iP : H.z.v(-iP);
    }

    public F.M v() {
        F.M m10;
        synchronized (this.f33701c) {
            m10 = this.f33712n;
        }
        return m10;
    }

    protected String w() {
        if (v() == null) {
            return null;
        }
        return v().r().f();
    }

    public k1 x() {
        return this.f33715q;
    }

    public Matrix y() {
        return this.f33710l;
    }

    public k1 z() {
        return this.f33714p;
    }

    public void O() {
    }

    public void P() {
    }

    public void V() {
    }
}
