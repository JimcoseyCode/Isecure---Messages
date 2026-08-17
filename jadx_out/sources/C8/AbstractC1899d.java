package c8;

import U7.AbstractC1474b;
import U7.EnumC1475c;
import j7.AbstractC2800q;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: renamed from: c8.d, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC1899d {

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c8.d$a */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final G8.i f18962a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final U7.E f18963b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final G8.n f18964c;

        public a(G8.i iVar, U7.E e10, G8.n nVar) {
            this.f18962a = iVar;
            this.f18963b = e10;
            this.f18964c = nVar;
        }

        public final U7.E a() {
            return this.f18963b;
        }

        public final G8.i b() {
            return this.f18962a;
        }

        public final G8.n c() {
            return this.f18964c;
        }
    }

    private final C1915l G(C1915l c1915l, C1915l c1915l2) {
        return c1915l == null ? c1915l2 : (c1915l2 != null && ((c1915l.d() && !c1915l2.d()) || ((c1915l.d() || !c1915l2.d()) && (c1915l.c().compareTo(c1915l2.c()) < 0 || c1915l.c().compareTo(c1915l2.c()) <= 0)))) ? c1915l2 : c1915l;
    }

    private final List H(G8.i iVar) {
        return j(new a(iVar, f(iVar, r()), null), new C1897c(this, A()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Iterable I(AbstractC1899d abstractC1899d, G8.o oVar, a it) {
        G8.i iVarB;
        G8.m mVarD0;
        List listQ0;
        a aVar;
        G8.i iVarB2;
        AbstractC2855l.g(it, "it");
        if ((abstractC1899d.z() && (iVarB2 = it.b()) != null && oVar.i(iVarB2)) || (iVarB = it.b()) == null || (mVarD0 = oVar.D0(iVarB)) == null || (listQ0 = oVar.q0(mVarD0)) == null) {
            return null;
        }
        List listG = oVar.G(it.b());
        Iterator it2 = listQ0.iterator();
        Iterator it3 = listG.iterator();
        ArrayList arrayList = new ArrayList(Math.min(AbstractC2800q.u(listQ0, 10), AbstractC2800q.u(listG, 10)));
        while (it2.hasNext() && it3.hasNext()) {
            Object next = it2.next();
            G8.l lVar = (G8.l) it3.next();
            G8.n nVar = (G8.n) next;
            if (oVar.l(lVar)) {
                aVar = new a(null, it.a(), nVar);
            } else {
                G8.i iVarH = oVar.h(lVar);
                aVar = new a(iVarH, abstractC1899d.f(iVarH, it.a()), nVar);
            }
            arrayList.add(aVar);
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C1907h e(C1912j0 c1912j0, C1907h[] c1907hArr, int i10) {
        Map mapB;
        C1907h c1907h;
        return (c1912j0 == null || (mapB = c1912j0.b()) == null || (c1907h = (C1907h) mapB.get(Integer.valueOf(i10))) == null) ? (i10 < 0 || i10 >= c1907hArr.length) ? C1907h.f18988e.a() : c1907hArr[i10] : c1907h;
    }

    private final U7.E f(G8.i iVar, U7.E e10) {
        return m().d(e10, n(iVar));
    }

    private final C1907h g(G8.i iVar) {
        EnumC1913k enumC1913kY;
        EnumC1913k enumC1913kY2 = y(iVar);
        EnumC1909i enumC1909i = null;
        if (enumC1913kY2 == null) {
            G8.i iVarV = v(iVar);
            enumC1913kY = iVarV != null ? y(iVarV) : null;
        } else {
            enumC1913kY = enumC1913kY2;
        }
        G8.o oVarA = A();
        K7.c cVar = K7.c.f7110a;
        if (cVar.l(x(oVarA.K(iVar)))) {
            enumC1909i = EnumC1909i.f18999g;
        } else if (cVar.k(x(oVarA.m0(iVar)))) {
            enumC1909i = EnumC1909i.f19000h;
        }
        return new C1907h(enumC1913kY, enumC1909i, A().f0(iVar) || F(iVar), enumC1913kY != enumC1913kY2);
    }

    private final C1907h h(a aVar) {
        Iterable iterableJ;
        C1915l c1915lO;
        G8.i iVarB;
        G8.m mVarD0;
        if (aVar.b() == null) {
            G8.o oVarA = A();
            G8.n nVarC = aVar.c();
            if ((nVarC != null ? oVarA.y(nVarC) : null) == G8.s.f3547h) {
                return C1907h.f18988e.a();
            }
        }
        boolean z10 = false;
        boolean z11 = aVar.c() == null;
        G8.i iVarB2 = aVar.b();
        if (iVarB2 == null || (iterableJ = n(iVarB2)) == null) {
            iterableJ = AbstractC2800q.j();
        }
        G8.o oVarA2 = A();
        G8.i iVarB3 = aVar.b();
        G8.n nVarN = (iVarB3 == null || (mVarD0 = oVarA2.D0(iVarB3)) == null) ? null : oVarA2.n(mVarD0);
        boolean z12 = q() == EnumC1475c.f11503l;
        if (z11) {
            if (z12 || !u() || (iVarB = aVar.b()) == null || !B(iVarB)) {
                iterableJ = AbstractC2800q.x0(p(), iterableJ);
            } else {
                Iterable iterableP = p();
                ArrayList arrayList = new ArrayList();
                for (Object obj : iterableP) {
                    if (!m().p(obj)) {
                        arrayList.add(obj);
                    }
                }
                iterableJ = AbstractC2800q.z0(arrayList, iterableJ);
            }
        }
        EnumC1909i enumC1909iG = m().g(iterableJ);
        C1915l c1915lH = m().h(iterableJ, new C1893a(this, aVar));
        if (c1915lH != null) {
            EnumC1913k enumC1913kC = c1915lH.c();
            if (c1915lH.c() == EnumC1913k.f19007i && nVarN != null) {
                z10 = true;
            }
            return new C1907h(enumC1913kC, enumC1909iG, z10, c1915lH.d());
        }
        EnumC1475c enumC1475cQ = (z11 || z12) ? q() : EnumC1475c.f11502k;
        U7.E eA = aVar.a();
        U7.w wVarA = eA != null ? eA.a(enumC1475cQ) : null;
        C1915l c1915lO2 = nVarN != null ? o(nVarN) : null;
        C1915l c1915lT = t(c1915lO2, wVarA);
        boolean z13 = (c1915lO2 != null ? c1915lO2.c() : null) == EnumC1913k.f19007i || !(nVarN == null || wVarA == null || !wVarA.c());
        G8.n nVarC2 = aVar.c();
        if (nVarC2 == null || (c1915lO = o(nVarC2)) == null) {
            c1915lO = null;
        } else if (c1915lO.c() == EnumC1913k.f19006h) {
            c1915lO = C1915l.b(c1915lO, EnumC1913k.f19005g, false, 2, null);
        }
        C1915l c1915lG = G(c1915lO, c1915lT);
        EnumC1913k enumC1913kC2 = c1915lG != null ? c1915lG.c() : null;
        if (c1915lG != null && c1915lG.d()) {
            z10 = true;
        }
        return new C1907h(enumC1913kC2, enumC1909iG, z13, z10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean i(AbstractC1899d abstractC1899d, a aVar, Object extractNullability) {
        AbstractC2855l.g(extractNullability, "$this$extractNullability");
        return abstractC1899d.l(extractNullability, aVar.b());
    }

    private final List j(Object obj, Function1 function1) {
        ArrayList arrayList = new ArrayList(1);
        k(obj, arrayList, function1);
        return arrayList;
    }

    private final void k(Object obj, List list, Function1 function1) {
        list.add(obj);
        Iterable iterable = (Iterable) function1.invoke(obj);
        if (iterable != null) {
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                k(it.next(), list, function1);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00b9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final C1915l o(G8.n nVar) {
        List arrayList;
        EnumC1913k enumC1913k;
        Iterator it;
        G8.o oVarA = A();
        C1915l c1915l = null;
        if (!E(nVar)) {
            return null;
        }
        List listO = oVarA.o(nVar);
        if (listO == null || !listO.isEmpty()) {
            Iterator it2 = listO.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                if (!oVarA.E0((G8.i) it2.next())) {
                    if (listO == null || !listO.isEmpty()) {
                        Iterator it3 = listO.iterator();
                        while (it3.hasNext()) {
                            if (y((G8.i) it3.next()) != null) {
                                arrayList = listO;
                                break;
                            }
                        }
                        if (listO != null || !listO.isEmpty()) {
                            it = listO.iterator();
                            while (it.hasNext()) {
                                if (v((G8.i) it.next()) != null) {
                                    arrayList = new ArrayList();
                                    Iterator it4 = listO.iterator();
                                    while (it4.hasNext()) {
                                        G8.i iVarV = v((G8.i) it4.next());
                                        if (iVarV != null) {
                                            arrayList.add(iVarV);
                                        }
                                    }
                                    if (arrayList == null || !arrayList.isEmpty()) {
                                        Iterator it5 = arrayList.iterator();
                                        while (it5.hasNext()) {
                                            if (!oVarA.u0((G8.i) it5.next())) {
                                                enumC1913k = EnumC1913k.f19007i;
                                                break;
                                            }
                                        }
                                        enumC1913k = EnumC1913k.f19006h;
                                        c1915l = new C1915l(enumC1913k, arrayList == listO);
                                    } else {
                                        enumC1913k = EnumC1913k.f19006h;
                                        c1915l = new C1915l(enumC1913k, arrayList == listO);
                                    }
                                }
                            }
                        }
                    } else if (listO != null) {
                        it = listO.iterator();
                        while (it.hasNext()) {
                        }
                    }
                }
            }
        }
        return c1915l;
    }

    private final EnumC1913k y(G8.i iVar) {
        G8.o oVarA = A();
        if (oVarA.W(oVarA.K(iVar))) {
            return EnumC1913k.f19006h;
        }
        if (oVarA.W(oVarA.m0(iVar))) {
            return null;
        }
        return EnumC1913k.f19007i;
    }

    public abstract G8.o A();

    public abstract boolean B(G8.i iVar);

    public abstract boolean C();

    public abstract boolean D(G8.i iVar, G8.i iVar2);

    public abstract boolean E(G8.n nVar);

    public abstract boolean F(G8.i iVar);

    public final Function1 d(G8.i iVar, Iterable overrides, C1912j0 c1912j0, boolean z10) {
        int size;
        G8.i iVarB;
        AbstractC2855l.g(iVar, "<this>");
        AbstractC2855l.g(overrides, "overrides");
        List listH = H(iVar);
        ArrayList arrayList = new ArrayList(AbstractC2800q.u(overrides, 10));
        Iterator it = overrides.iterator();
        while (it.hasNext()) {
            arrayList.add(H((G8.i) it.next()));
        }
        if (w()) {
            size = 1;
            break;
        }
        if (C() && (!(overrides instanceof Collection) || !((Collection) overrides).isEmpty())) {
            Iterator it2 = overrides.iterator();
            while (it2.hasNext()) {
                if (!D(iVar, (G8.i) it2.next())) {
                    size = 1;
                    break;
                }
            }
        }
        size = listH.size();
        C1907h[] c1907hArr = new C1907h[size];
        int i10 = 0;
        while (i10 < size) {
            C1907h c1907hH = h((a) listH.get(i10));
            ArrayList arrayList2 = new ArrayList();
            Iterator it3 = arrayList.iterator();
            while (it3.hasNext()) {
                a aVar = (a) AbstractC2800q.h0((List) it3.next(), i10);
                C1907h c1907hG = (aVar == null || (iVarB = aVar.b()) == null) ? null : g(iVarB);
                if (c1907hG != null) {
                    arrayList2.add(c1907hG);
                }
            }
            c1907hArr[i10] = AbstractC1916l0.a(c1907hH, arrayList2, i10 == 0 && C(), i10 == 0 && s(), z10);
            i10++;
        }
        return new C1895b(c1912j0, c1907hArr);
    }

    public abstract boolean l(Object obj, G8.i iVar);

    public abstract AbstractC1474b m();

    public abstract Iterable n(G8.i iVar);

    public abstract Iterable p();

    public abstract EnumC1475c q();

    public abstract U7.E r();

    public abstract boolean s();

    protected abstract C1915l t(C1915l c1915l, U7.w wVar);

    public abstract boolean u();

    public abstract G8.i v(G8.i iVar);

    public boolean w() {
        return false;
    }

    public abstract k8.d x(G8.i iVar);

    public abstract boolean z();
}
