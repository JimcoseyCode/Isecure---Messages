package Y7;

import C8.B0;
import C8.I0;
import C8.J0;
import L7.AbstractC1294t;
import L7.AbstractC1295u;
import L7.InterfaceC1276a;
import L7.InterfaceC1279d;
import L7.InterfaceC1280e;
import L7.InterfaceC1283h;
import L7.InterfaceC1287l;
import L7.InterfaceC1300z;
import L7.g0;
import L7.m0;
import L7.t0;
import M8.l;
import O7.C1330i;
import O7.C1338q;
import U7.C1478f;
import U7.C1481i;
import U7.C1485m;
import U7.InterfaceC1492u;
import U7.U;
import V7.o;
import Y7.U;
import b8.InterfaceC1822f;
import b8.InterfaceC1823g;
import b8.InterfaceC1827k;
import b8.InterfaceC1830n;
import c8.C1902e0;
import d8.AbstractC2345C;
import j7.AbstractC2800q;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC2852i;
import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o8.AbstractC3026h;
import o8.AbstractC3027i;
import o8.C3033o;
import s8.AbstractC3340e;
import v8.C3435d;
import y8.InterfaceC3660w;

/* JADX INFO: renamed from: Y7.z, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class C1561z extends U {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final InterfaceC1280e f13087n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final InterfaceC1823g f13088o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final boolean f13089p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final B8.i f13090q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final B8.i f13091r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final B8.i f13092s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final B8.i f13093t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final B8.h f13094u;

    /* JADX INFO: renamed from: Y7.z$a */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    /* synthetic */ class a extends AbstractC2852i implements Function1 {
        a(Object obj) {
            super(1, obj);
        }

        @Override // kotlin.jvm.internal.AbstractC2846c, C7.c
        public final String getName() {
            return "searchMethodsByNameWithoutBuiltinMagic";
        }

        @Override // kotlin.jvm.internal.AbstractC2846c
        public final C7.f getOwner() {
            return kotlin.jvm.internal.D.b(C1561z.class);
        }

        @Override // kotlin.jvm.internal.AbstractC2846c
        public final String getSignature() {
            return "searchMethodsByNameWithoutBuiltinMagic(Lorg/jetbrains/kotlin/name/Name;)Ljava/util/Collection;";
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public final Collection invoke(k8.f p02) {
            AbstractC2855l.g(p02, "p0");
            return ((C1561z) this.receiver).q1(p02);
        }
    }

    /* JADX INFO: renamed from: Y7.z$b */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    /* synthetic */ class b extends AbstractC2852i implements Function1 {
        b(Object obj) {
            super(1, obj);
        }

        @Override // kotlin.jvm.internal.AbstractC2846c, C7.c
        public final String getName() {
            return "searchMethodsInSupertypesWithoutBuiltinMagic";
        }

        @Override // kotlin.jvm.internal.AbstractC2846c
        public final C7.f getOwner() {
            return kotlin.jvm.internal.D.b(C1561z.class);
        }

        @Override // kotlin.jvm.internal.AbstractC2846c
        public final String getSignature() {
            return "searchMethodsInSupertypesWithoutBuiltinMagic(Lorg/jetbrains/kotlin/name/Name;)Ljava/util/Collection;";
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public final Collection invoke(k8.f p02) {
            AbstractC2855l.g(p02, "p0");
            return ((C1561z) this.receiver).r1(p02);
        }
    }

    public /* synthetic */ C1561z(X7.k kVar, InterfaceC1280e interfaceC1280e, InterfaceC1823g interfaceC1823g, boolean z10, C1561z c1561z, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(kVar, interfaceC1280e, interfaceC1823g, z10, (i10 & 16) != 0 ? null : c1561z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Collection A0(C1561z c1561z, k8.f it) {
        AbstractC2855l.g(it, "it");
        return c1561z.q1(it);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Collection B0(C1561z c1561z, k8.f it) {
        AbstractC2855l.g(it, "it");
        return c1561z.r1(it);
    }

    private final Collection C0() {
        if (!this.f13089p) {
            return L().a().k().d().g(R());
        }
        Collection collectionG = R().j().g();
        AbstractC2855l.f(collectionG, "getSupertypes(...)");
        return collectionG;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List D0(C1561z c1561z, X7.k kVar) {
        Collection collectionF = c1561z.f13088o.f();
        ArrayList arrayList = new ArrayList(collectionF.size());
        Iterator it = collectionF.iterator();
        while (it.hasNext()) {
            arrayList.add(c1561z.o1((InterfaceC1827k) it.next()));
        }
        if (c1561z.f13088o.q()) {
            InterfaceC1279d interfaceC1279dG0 = c1561z.G0();
            String strC = AbstractC2345C.c(interfaceC1279dG0, false, false, 2, null);
            if (arrayList.isEmpty()) {
                arrayList.add(interfaceC1279dG0);
                kVar.a().h().c(c1561z.f13088o, interfaceC1279dG0);
            } else {
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    if (AbstractC2855l.b(AbstractC2345C.c((InterfaceC1279d) it2.next(), false, false, 2, null), strC)) {
                        break;
                    }
                }
                arrayList.add(interfaceC1279dG0);
                kVar.a().h().c(c1561z.f13088o, interfaceC1279dG0);
            }
        }
        kVar.a().w().f(c1561z.R(), arrayList, kVar);
        C1902e0 c1902e0R = kVar.a().r();
        boolean zIsEmpty = arrayList.isEmpty();
        List listN = arrayList;
        if (zIsEmpty) {
            listN = AbstractC2800q.n(c1561z.F0());
        }
        return AbstractC2800q.P0(c1902e0R.p(kVar, listN));
    }

    private final List E0(C1330i c1330i) {
        C1330i c1330i2;
        Pair pair;
        Collection collectionI = this.f13088o.I();
        ArrayList arrayList = new ArrayList(collectionI.size());
        Z7.a aVarB = Z7.b.b(I0.f575h, true, false, null, 6, null);
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        for (Object obj : collectionI) {
            if (AbstractC2855l.b(((b8.r) obj).getName(), U7.I.f11398c)) {
                arrayList2.add(obj);
            } else {
                arrayList3.add(obj);
            }
        }
        Pair pair2 = new Pair(arrayList2, arrayList3);
        List list = (List) pair2.getFirst();
        List<b8.r> list2 = (List) pair2.getSecond();
        list.size();
        b8.r rVar = (b8.r) AbstractC2800q.g0(list);
        if (rVar != null) {
            b8.x returnType = rVar.getReturnType();
            if (returnType instanceof InterfaceC1822f) {
                InterfaceC1822f interfaceC1822f = (InterfaceC1822f) returnType;
                pair = new Pair(L().g().l(interfaceC1822f, aVarB, true), L().g().p(interfaceC1822f.l(), aVarB));
            } else {
                pair = new Pair(L().g().p(returnType, aVarB), null);
            }
            C8.S s10 = (C8.S) pair.getFirst();
            C8.S s11 = (C8.S) pair.getSecond();
            c1330i2 = c1330i;
            s0(arrayList, c1330i2, 0, rVar, s10, s11);
        } else {
            c1330i2 = c1330i;
        }
        int i10 = 0;
        int i11 = rVar == null ? 0 : 1;
        for (b8.r rVar2 : list2) {
            s0(arrayList, c1330i2, i10 + i11, rVar2, L().g().p(rVar2.getReturnType(), aVarB), null);
            i10++;
        }
        return arrayList;
    }

    private final InterfaceC1279d F0() {
        boolean zO = this.f13088o.o();
        if ((this.f13088o.D() || !this.f13088o.r()) && !zO) {
            return null;
        }
        InterfaceC1280e interfaceC1280eR = R();
        W7.b bVarQ1 = W7.b.q1(interfaceC1280eR, M7.h.f7570a.b(), true, L().a().t().a(this.f13088o));
        AbstractC2855l.f(bVarQ1, "createJavaConstructor(...)");
        List listE0 = zO ? E0(bVarQ1) : Collections.EMPTY_LIST;
        bVarQ1.W0(false);
        bVarQ1.n1(listE0, Z0(interfaceC1280eR));
        bVarQ1.V0(true);
        bVarQ1.d1(interfaceC1280eR.r());
        L().a().h().c(this.f13088o, bVarQ1);
        return bVarQ1;
    }

    private final InterfaceC1279d G0() {
        InterfaceC1280e interfaceC1280eR = R();
        W7.b bVarQ1 = W7.b.q1(interfaceC1280eR, M7.h.f7570a.b(), true, L().a().t().a(this.f13088o));
        AbstractC2855l.f(bVarQ1, "createJavaConstructor(...)");
        List listM0 = M0(bVarQ1);
        bVarQ1.W0(false);
        bVarQ1.n1(listM0, Z0(interfaceC1280eR));
        bVarQ1.V0(false);
        bVarQ1.d1(interfaceC1280eR.r());
        return bVarQ1;
    }

    private final g0 H0(g0 g0Var, InterfaceC1276a interfaceC1276a, Collection collection) {
        if (collection != null && collection.isEmpty()) {
            return g0Var;
        }
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            g0 g0Var2 = (g0) it.next();
            if (!AbstractC2855l.b(g0Var, g0Var2) && g0Var2.Z() == null && Q0(g0Var2, interfaceC1276a)) {
                InterfaceC1300z interfaceC1300zBuild = g0Var.s().q().build();
                AbstractC2855l.d(interfaceC1300zBuild);
                return (g0) interfaceC1300zBuild;
            }
        }
        return g0Var;
    }

    private final g0 I0(InterfaceC1300z interfaceC1300z, Function1 function1) {
        Object next;
        k8.f name = interfaceC1300z.getName();
        AbstractC2855l.f(name, "getName(...)");
        Iterator it = ((Iterable) function1.invoke(name)).iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (e1((g0) next, interfaceC1300z)) {
                break;
            }
        }
        g0 g0Var = (g0) next;
        if (g0Var == null) {
            return null;
        }
        InterfaceC1300z.a aVarS = g0Var.s();
        List listI = interfaceC1300z.i();
        AbstractC2855l.f(listI, "getValueParameters(...)");
        ArrayList arrayList = new ArrayList(AbstractC2800q.u(listI, 10));
        Iterator it2 = listI.iterator();
        while (it2.hasNext()) {
            arrayList.add(((t0) it2.next()).getType());
        }
        List listI2 = g0Var.i();
        AbstractC2855l.f(listI2, "getValueParameters(...)");
        aVarS.d(W7.h.a(arrayList, listI2, interfaceC1300z));
        aVarS.t();
        aVarS.h();
        aVarS.e(W7.e.f12139N, Boolean.TRUE);
        return (g0) aVarS.build();
    }

    private final W7.f J0(L7.Z z10, Function1 function1) {
        g0 g0VarX0;
        O7.M m10 = null;
        if (!P0(z10, function1)) {
            return null;
        }
        g0 g0VarW0 = W0(z10, function1);
        AbstractC2855l.d(g0VarW0);
        if (z10.d0()) {
            g0VarX0 = X0(z10, function1);
            AbstractC2855l.d(g0VarX0);
        } else {
            g0VarX0 = null;
        }
        if (g0VarX0 != null) {
            g0VarX0.k();
            g0VarW0.k();
        }
        W7.d dVar = new W7.d(R(), g0VarW0, g0VarX0, z10);
        C8.S returnType = g0VarW0.getReturnType();
        AbstractC2855l.d(returnType);
        dVar.Y0(returnType, AbstractC2800q.j(), O(), null, AbstractC2800q.j());
        O7.L lK = AbstractC3026h.k(dVar, g0VarW0.getAnnotations(), false, false, false, g0VarW0.g());
        lK.J0(g0VarW0);
        lK.M0(dVar.getType());
        AbstractC2855l.f(lK, "apply(...)");
        if (g0VarX0 != null) {
            List listI = g0VarX0.i();
            AbstractC2855l.f(listI, "getValueParameters(...)");
            t0 t0Var = (t0) AbstractC2800q.g0(listI);
            if (t0Var == null) {
                throw new AssertionError("No parameter found for " + g0VarX0);
            }
            m10 = AbstractC3026h.m(dVar, g0VarX0.getAnnotations(), t0Var.getAnnotations(), false, false, false, g0VarX0.getVisibility(), g0VarX0.g());
            m10.J0(g0VarX0);
        }
        dVar.R0(lK, m10);
        return dVar;
    }

    private final W7.f K0(b8.r rVar, C8.S s10, L7.E e10) {
        W7.f fVar;
        C1561z c1561z;
        C8.S sA;
        W7.f fVarC1 = W7.f.c1(R(), X7.h.a(L(), rVar), e10, U7.V.d(rVar.getVisibility()), false, rVar.getName(), L().a().t().a(rVar), false);
        AbstractC2855l.f(fVarC1, "create(...)");
        O7.L lD = AbstractC3026h.d(fVarC1, M7.h.f7570a.b());
        AbstractC2855l.f(lD, "createDefaultGetter(...)");
        fVarC1.R0(lD, null);
        if (s10 == null) {
            X7.k kVarI = X7.c.i(L(), fVarC1, rVar, 0, 4, null);
            fVar = fVarC1;
            c1561z = this;
            sA = c1561z.A(rVar, kVarI);
        } else {
            fVar = fVarC1;
            c1561z = this;
            sA = s10;
        }
        fVar.Y0(sA, AbstractC2800q.j(), c1561z.O(), null, AbstractC2800q.j());
        lD.M0(sA);
        return fVar;
    }

    static /* synthetic */ W7.f L0(C1561z c1561z, b8.r rVar, C8.S s10, L7.E e10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            s10 = null;
        }
        return c1561z.K0(rVar, s10, e10);
    }

    private final List M0(C1330i c1330i) {
        Collection collectionJ = this.f13088o.j();
        ArrayList arrayList = new ArrayList(collectionJ.size());
        Z7.a aVarB = Z7.b.b(I0.f575h, false, false, null, 6, null);
        Iterator it = collectionJ.iterator();
        int i10 = 0;
        while (true) {
            int i11 = i10;
            if (!it.hasNext()) {
                return arrayList;
            }
            i10 = i11 + 1;
            b8.w wVar = (b8.w) it.next();
            C8.S sP = L().g().p(wVar.getType(), aVarB);
            arrayList.add(new O7.V(c1330i, null, i11, M7.h.f7570a.b(), wVar.getName(), sP, false, false, false, wVar.a() ? L().a().m().n().k(sP) : null, L().a().t().a(wVar)));
        }
    }

    private final g0 N0(g0 g0Var, k8.f fVar) {
        InterfaceC1300z.a aVarS = g0Var.s();
        aVarS.l(fVar);
        aVarS.t();
        aVarS.h();
        InterfaceC1300z interfaceC1300zBuild = aVarS.build();
        AbstractC2855l.d(interfaceC1300zBuild);
        return (g0) interfaceC1300zBuild;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0043  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final g0 O0(g0 g0Var) {
        k8.c cVarL;
        k8.d dVarP;
        List listI = g0Var.i();
        AbstractC2855l.f(listI, "getValueParameters(...)");
        t0 t0Var = (t0) AbstractC2800q.s0(listI);
        if (t0Var != null) {
            InterfaceC1283h interfaceC1283hP = t0Var.getType().K0().p();
            if (interfaceC1283hP == null || (dVarP = AbstractC3340e.p(interfaceC1283hP)) == null) {
                cVarL = null;
                if (!AbstractC2855l.b(cVarL, I7.o.f5137v)) {
                    t0Var = null;
                }
                if (t0Var != null) {
                    InterfaceC1300z.a aVarS = g0Var.s();
                    List listI2 = g0Var.i();
                    AbstractC2855l.f(listI2, "getValueParameters(...)");
                    g0 g0Var2 = (g0) aVarS.d(AbstractC2800q.a0(listI2, 1)).f(((B0) t0Var.getType().I0().get(0)).getType()).build();
                    O7.O o10 = (O7.O) g0Var2;
                    if (o10 != null) {
                        o10.e1(true);
                    }
                    return g0Var2;
                }
            } else {
                if (!dVarP.f()) {
                    dVarP = null;
                }
                if (dVarP != null) {
                    cVarL = dVarP.l();
                }
                if (!AbstractC2855l.b(cVarL, I7.o.f5137v)) {
                }
                if (t0Var != null) {
                }
            }
        }
        return null;
    }

    private final boolean P0(L7.Z z10, Function1 function1) {
        if (AbstractC1540d.a(z10)) {
            return false;
        }
        g0 g0VarW0 = W0(z10, function1);
        g0 g0VarX0 = X0(z10, function1);
        if (g0VarW0 == null) {
            return false;
        }
        if (z10.d0()) {
            return g0VarX0 != null && g0VarX0.k() == g0VarW0.k();
        }
        return true;
    }

    private final boolean Q0(InterfaceC1276a interfaceC1276a, InterfaceC1276a interfaceC1276a2) {
        C3033o.i.a aVarC = C3033o.f30533f.F(interfaceC1276a2, interfaceC1276a, true).c();
        AbstractC2855l.f(aVarC, "getResult(...)");
        return aVarC == C3033o.i.a.OVERRIDABLE && !U7.z.f11543a.a(interfaceC1276a2, interfaceC1276a);
    }

    private final boolean R0(g0 g0Var) {
        U.a aVar = U7.U.f11461a;
        k8.f name = g0Var.getName();
        AbstractC2855l.f(name, "getName(...)");
        k8.f fVarB = aVar.b(name);
        if (fVarB == null) {
            return false;
        }
        Set setB1 = b1(fVarB);
        ArrayList arrayList = new ArrayList();
        for (Object obj : setB1) {
            if (U7.T.d((g0) obj)) {
                arrayList.add(obj);
            }
        }
        if (arrayList.isEmpty()) {
            return false;
        }
        g0 g0VarN0 = N0(g0Var, fVarB);
        if (arrayList.isEmpty()) {
            return false;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            if (S0((g0) it.next(), g0VarN0)) {
                return true;
            }
        }
        return false;
    }

    private final boolean S0(g0 g0Var, InterfaceC1300z interfaceC1300z) {
        if (C1478f.f11509o.m(g0Var)) {
            interfaceC1300z = interfaceC1300z.a();
        }
        AbstractC2855l.d(interfaceC1300z);
        return Q0(interfaceC1300z, g0Var);
    }

    private final boolean T0(g0 g0Var) {
        g0 g0VarO0 = O0(g0Var);
        if (g0VarO0 == null) {
            return false;
        }
        k8.f name = g0Var.getName();
        AbstractC2855l.f(name, "getName(...)");
        Set<g0> setB1 = b1(name);
        if (setB1 != null && setB1.isEmpty()) {
            return false;
        }
        for (g0 g0Var2 : setB1) {
            if (g0Var2.isSuspend() && Q0(g0VarO0, g0Var2)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Map U0(C1561z c1561z) {
        Collection collectionZ = c1561z.f13088o.z();
        ArrayList arrayList = new ArrayList();
        for (Object obj : collectionZ) {
            if (((InterfaceC1830n) obj).C()) {
                arrayList.add(obj);
            }
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(B7.d.d(j7.K.e(AbstractC2800q.u(arrayList, 10)), 16));
        for (Object obj2 : arrayList) {
            linkedHashMap.put(((InterfaceC1830n) obj2).getName(), obj2);
        }
        return linkedHashMap;
    }

    private final g0 V0(L7.Z z10, String str, Function1 function1) {
        g0 g0Var;
        k8.f fVarQ = k8.f.q(str);
        AbstractC2855l.f(fVarQ, "identifier(...)");
        Iterator it = ((Iterable) function1.invoke(fVarQ)).iterator();
        do {
            g0Var = null;
            if (!it.hasNext()) {
                break;
            }
            g0 g0Var2 = (g0) it.next();
            if (g0Var2.i().size() == 0) {
                D8.e eVar = D8.e.f819a;
                C8.S returnType = g0Var2.getReturnType();
                if (returnType == null ? false : eVar.b(returnType, z10.getType())) {
                    g0Var = g0Var2;
                }
            }
        } while (g0Var == null);
        return g0Var;
    }

    private final g0 W0(L7.Z z10, Function1 function1) {
        L7.a0 getter = z10.getGetter();
        L7.a0 a0Var = getter != null ? (L7.a0) U7.T.g(getter) : null;
        String strB = a0Var != null ? C1485m.f11520a.b(a0Var) : null;
        if (strB != null && !U7.T.l(R(), a0Var)) {
            return V0(z10, strB, function1);
        }
        String strJ = z10.getName().j();
        AbstractC2855l.f(strJ, "asString(...)");
        return V0(z10, U7.H.b(strJ), function1);
    }

    private final g0 X0(L7.Z z10, Function1 function1) {
        g0 g0Var;
        C8.S returnType;
        String strJ = z10.getName().j();
        AbstractC2855l.f(strJ, "asString(...)");
        k8.f fVarQ = k8.f.q(U7.H.e(strJ));
        AbstractC2855l.f(fVarQ, "identifier(...)");
        Iterator it = ((Iterable) function1.invoke(fVarQ)).iterator();
        do {
            g0Var = null;
            if (!it.hasNext()) {
                break;
            }
            g0 g0Var2 = (g0) it.next();
            if (g0Var2.i().size() == 1 && (returnType = g0Var2.getReturnType()) != null && I7.i.C0(returnType)) {
                D8.e eVar = D8.e.f819a;
                List listI = g0Var2.i();
                AbstractC2855l.f(listI, "getValueParameters(...)");
                if (eVar.c(((t0) AbstractC2800q.C0(listI)).getType(), z10.getType())) {
                    g0Var = g0Var2;
                }
            }
        } while (g0Var == null);
        return g0Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Set Y0(X7.k kVar, C1561z c1561z) {
        return AbstractC2800q.T0(kVar.a().w().d(c1561z.R(), kVar));
    }

    private final AbstractC1295u Z0(InterfaceC1280e interfaceC1280e) {
        AbstractC1295u visibility = interfaceC1280e.getVisibility();
        AbstractC2855l.f(visibility, "getVisibility(...)");
        if (!AbstractC2855l.b(visibility, U7.y.f11540b)) {
            return visibility;
        }
        AbstractC1295u PROTECTED_AND_PACKAGE = U7.y.f11541c;
        AbstractC2855l.f(PROTECTED_AND_PACKAGE, "PROTECTED_AND_PACKAGE");
        return PROTECTED_AND_PACKAGE;
    }

    private final Set b1(k8.f fVar) {
        Collection collectionC0 = C0();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it = collectionC0.iterator();
        while (it.hasNext()) {
            AbstractC2800q.A(linkedHashSet, ((C8.S) it.next()).o().b(fVar, T7.d.f10640u));
        }
        return linkedHashSet;
    }

    private final Set d1(k8.f fVar) {
        Collection collectionC0 = C0();
        ArrayList arrayList = new ArrayList();
        Iterator it = collectionC0.iterator();
        while (it.hasNext()) {
            Collection collectionD = ((C8.S) it.next()).o().d(fVar, T7.d.f10640u);
            ArrayList arrayList2 = new ArrayList(AbstractC2800q.u(collectionD, 10));
            Iterator it2 = collectionD.iterator();
            while (it2.hasNext()) {
                arrayList2.add((L7.Z) it2.next());
            }
            AbstractC2800q.A(arrayList, arrayList2);
        }
        return AbstractC2800q.T0(arrayList);
    }

    private final boolean e1(g0 g0Var, InterfaceC1300z interfaceC1300z) {
        String strC = AbstractC2345C.c(g0Var, false, false, 2, null);
        InterfaceC1300z interfaceC1300zA = interfaceC1300z.a();
        AbstractC2855l.f(interfaceC1300zA, "getOriginal(...)");
        return AbstractC2855l.b(strC, AbstractC2345C.c(interfaceC1300zA, false, false, 2, null)) && !Q0(g0Var, interfaceC1300z);
    }

    private final boolean f1(g0 g0Var) {
        k8.f name = g0Var.getName();
        AbstractC2855l.f(name, "getName(...)");
        List listA = U7.N.a(name);
        if (listA == null || !listA.isEmpty()) {
            Iterator it = listA.iterator();
            while (it.hasNext()) {
                Set<L7.Z> setD1 = d1((k8.f) it.next());
                if (setD1 == null || !setD1.isEmpty()) {
                    for (L7.Z z10 : setD1) {
                        if (P0(z10, new C1557v(g0Var, this))) {
                            if (!z10.d0()) {
                                String strJ = g0Var.getName().j();
                                AbstractC2855l.f(strJ, "asString(...)");
                                if (!U7.H.d(strJ)) {
                                }
                            }
                            return false;
                        }
                    }
                }
            }
        }
        return (R0(g0Var) || s1(g0Var) || T0(g0Var)) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Collection g1(g0 g0Var, C1561z c1561z, k8.f accessorName) {
        AbstractC2855l.g(accessorName, "accessorName");
        return AbstractC2855l.b(g0Var.getName(), accessorName) ? AbstractC2800q.e(g0Var) : AbstractC2800q.z0(c1561z.q1(accessorName), c1561z.r1(accessorName));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Set h1(C1561z c1561z) {
        return AbstractC2800q.T0(c1561z.f13088o.G());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC1280e i1(C1561z c1561z, X7.k kVar, k8.f name) {
        AbstractC2855l.g(name, "name");
        if (((Set) c1561z.f13091r.invoke()).contains(name)) {
            InterfaceC1492u interfaceC1492uD = kVar.a().d();
            k8.b bVarN = AbstractC3340e.n(c1561z.R());
            AbstractC2855l.d(bVarN);
            InterfaceC1823g interfaceC1823gC = interfaceC1492uD.c(new InterfaceC1492u.a(bVarN.d(name), null, c1561z.f13088o, 2, null));
            if (interfaceC1823gC == null) {
                return null;
            }
            C1550n c1550n = new C1550n(kVar, c1561z.R(), interfaceC1823gC, null, 8, null);
            kVar.a().e().a(c1550n);
            return c1550n;
        }
        if (!((Set) c1561z.f13092s.invoke()).contains(name)) {
            InterfaceC1830n interfaceC1830n = (InterfaceC1830n) ((Map) c1561z.f13093t.invoke()).get(name);
            if (interfaceC1830n == null) {
                return null;
            }
            return C1338q.I0(kVar.e(), c1561z.R(), name, kVar.e().e(new C1560y(c1561z)), X7.h.a(kVar, interfaceC1830n), kVar.a().t().a(interfaceC1830n));
        }
        List listC = AbstractC2800q.c();
        kVar.a().w().g(c1561z.R(), name, listC, kVar);
        List listA = AbstractC2800q.a(listC);
        int size = listA.size();
        if (size == 0) {
            return null;
        }
        if (size == 1) {
            return (InterfaceC1280e) AbstractC2800q.C0(listA);
        }
        throw new IllegalStateException(("Multiple classes with same name are generated: " + listA).toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Set j1(C1561z c1561z) {
        return j7.T.k(c1561z.a(), c1561z.c());
    }

    private final g0 k1(g0 g0Var, Function1 function1, Collection collection) {
        g0 g0VarI0;
        InterfaceC1300z interfaceC1300zL = C1481i.l(g0Var);
        if (interfaceC1300zL != null && (g0VarI0 = I0(interfaceC1300zL, function1)) != null) {
            if (!f1(g0VarI0)) {
                g0VarI0 = null;
            }
            if (g0VarI0 != null) {
                return H0(g0VarI0, interfaceC1300zL, collection);
            }
        }
        return null;
    }

    private final g0 l1(g0 g0Var, Function1 function1, k8.f fVar, Collection collection) {
        g0 g0Var2 = (g0) U7.T.g(g0Var);
        if (g0Var2 == null) {
            return null;
        }
        String strE = U7.T.e(g0Var2);
        AbstractC2855l.d(strE);
        k8.f fVarQ = k8.f.q(strE);
        AbstractC2855l.f(fVarQ, "identifier(...)");
        Iterator it = ((Collection) function1.invoke(fVarQ)).iterator();
        while (it.hasNext()) {
            g0 g0VarN0 = N0((g0) it.next(), fVar);
            if (S0(g0Var2, g0VarN0)) {
                return H0(g0VarN0, g0Var2, collection);
            }
        }
        return null;
    }

    private final g0 m1(g0 g0Var, Function1 function1) {
        if (!g0Var.isSuspend()) {
            return null;
        }
        k8.f name = g0Var.getName();
        AbstractC2855l.f(name, "getName(...)");
        Iterator it = ((Iterable) function1.invoke(name)).iterator();
        while (it.hasNext()) {
            g0 g0VarO0 = O0((g0) it.next());
            if (g0VarO0 == null || !Q0(g0VarO0, g0Var)) {
                g0VarO0 = null;
            }
            if (g0VarO0 != null) {
                return g0VarO0;
            }
        }
        return null;
    }

    private final W7.b o1(InterfaceC1827k interfaceC1827k) {
        InterfaceC1280e interfaceC1280eR = R();
        W7.b bVarQ1 = W7.b.q1(interfaceC1280eR, X7.h.a(L(), interfaceC1827k), false, L().a().t().a(interfaceC1827k));
        AbstractC2855l.f(bVarQ1, "createJavaConstructor(...)");
        X7.k kVarH = X7.c.h(L(), bVarQ1, interfaceC1827k, interfaceC1280eR.t().size());
        U.b bVarD0 = d0(kVarH, bVarQ1, interfaceC1827k.i());
        List listT = interfaceC1280eR.t();
        AbstractC2855l.f(listT, "getDeclaredTypeParameters(...)");
        List typeParameters = interfaceC1827k.getTypeParameters();
        ArrayList arrayList = new ArrayList(AbstractC2800q.u(typeParameters, 10));
        Iterator it = typeParameters.iterator();
        while (it.hasNext()) {
            m0 m0VarA = kVarH.f().a((b8.y) it.next());
            AbstractC2855l.d(m0VarA);
            arrayList.add(m0VarA);
        }
        bVarQ1.o1(bVarD0.a(), U7.V.d(interfaceC1827k.getVisibility()), AbstractC2800q.z0(listT, arrayList));
        bVarQ1.V0(false);
        bVarQ1.W0(bVarD0.b());
        bVarQ1.d1(interfaceC1280eR.r());
        kVarH.a().h().c(interfaceC1827k, bVarQ1);
        return bVarQ1;
    }

    private final W7.e p1(b8.w wVar) {
        W7.e eVarM1 = W7.e.m1(R(), X7.h.a(L(), wVar), wVar.getName(), L().a().t().a(wVar), true);
        AbstractC2855l.f(eVarM1, "createJavaMethod(...)");
        eVarM1.l1(null, O(), AbstractC2800q.j(), AbstractC2800q.j(), AbstractC2800q.j(), L().g().p(wVar.getType(), Z7.b.b(I0.f575h, false, false, null, 6, null)), L7.E.f7282g.a(false, false, true), AbstractC1294t.f7347e, null);
        eVarM1.p1(false, false);
        L().a().h().a(wVar, eVarM1);
        return eVarM1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Collection q1(k8.f fVar) {
        Collection collectionF = ((InterfaceC1539c) N().invoke()).f(fVar);
        ArrayList arrayList = new ArrayList(AbstractC2800q.u(collectionF, 10));
        Iterator it = collectionF.iterator();
        while (it.hasNext()) {
            arrayList.add(Z((b8.r) it.next()));
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Collection r1(k8.f fVar) {
        Set setB1 = b1(fVar);
        ArrayList arrayList = new ArrayList();
        for (Object obj : setB1) {
            g0 g0Var = (g0) obj;
            if (!U7.T.d(g0Var) && C1481i.l(g0Var) == null) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    private final void s0(List list, InterfaceC1287l interfaceC1287l, int i10, b8.r rVar, C8.S s10, C8.S s11) {
        M7.h hVarB = M7.h.f7570a.b();
        k8.f name = rVar.getName();
        C8.S sN = J0.n(s10);
        AbstractC2855l.f(sN, "makeNotNullable(...)");
        list.add(new O7.V(interfaceC1287l, null, i10, hVarB, name, sN, rVar.H(), false, false, s11 != null ? J0.n(s11) : null, L().a().t().a(rVar)));
    }

    private final boolean s1(g0 g0Var) {
        C1481i c1481i = C1481i.f11512o;
        k8.f name = g0Var.getName();
        AbstractC2855l.f(name, "getName(...)");
        if (!c1481i.n(name)) {
            return false;
        }
        k8.f name2 = g0Var.getName();
        AbstractC2855l.f(name2, "getName(...)");
        Set setB1 = b1(name2);
        ArrayList arrayList = new ArrayList();
        Iterator it = setB1.iterator();
        while (it.hasNext()) {
            InterfaceC1300z interfaceC1300zL = C1481i.l((g0) it.next());
            if (interfaceC1300zL != null) {
                arrayList.add(interfaceC1300zL);
            }
        }
        if (arrayList.isEmpty()) {
            return false;
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            if (e1(g0Var, (InterfaceC1300z) it2.next())) {
                return true;
            }
        }
        return false;
    }

    private final void t0(Collection collection, k8.f fVar, Collection collection2, boolean z10) {
        Collection<g0> collectionD = V7.a.d(fVar, collection2, collection, R(), L().a().c(), L().a().k().a());
        AbstractC2855l.f(collectionD, "resolveOverridesForNonStaticMembers(...)");
        if (!z10) {
            collection.addAll(collectionD);
            return;
        }
        List listZ0 = AbstractC2800q.z0(collection, collectionD);
        ArrayList arrayList = new ArrayList(AbstractC2800q.u(collectionD, 10));
        for (g0 g0VarH0 : collectionD) {
            g0 g0Var = (g0) U7.T.j(g0VarH0);
            if (g0Var == null) {
                AbstractC2855l.d(g0VarH0);
            } else {
                AbstractC2855l.d(g0VarH0);
                g0VarH0 = H0(g0VarH0, g0Var, listZ0);
            }
            arrayList.add(g0VarH0);
        }
        collection.addAll(arrayList);
    }

    private final void u0(k8.f fVar, Collection collection, Collection collection2, Collection collection3, Function1 function1) {
        Iterator it = collection2.iterator();
        while (it.hasNext()) {
            g0 g0Var = (g0) it.next();
            M8.a.a(collection3, l1(g0Var, function1, fVar, collection));
            M8.a.a(collection3, k1(g0Var, function1, collection));
            M8.a.a(collection3, m1(g0Var, function1));
        }
    }

    private final void v0(Set set, Collection collection, Set set2, Function1 function1) {
        Iterator it = set.iterator();
        while (it.hasNext()) {
            L7.Z z10 = (L7.Z) it.next();
            W7.f fVarJ0 = J0(z10, function1);
            if (fVarJ0 != null) {
                collection.add(fVarJ0);
                if (set2 != null) {
                    set2.add(z10);
                    return;
                }
                return;
            }
        }
    }

    private final void w0(k8.f fVar, Collection collection) {
        b8.r rVar = (b8.r) AbstractC2800q.D0(((InterfaceC1539c) N().invoke()).f(fVar));
        if (rVar == null) {
            return;
        }
        collection.add(L0(this, rVar, null, L7.E.f7283h, 2, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean z0(b8.q it) {
        AbstractC2855l.g(it, "it");
        return !it.M();
    }

    @Override // Y7.U
    protected void B(Collection result, k8.f name) {
        AbstractC2855l.g(result, "result");
        AbstractC2855l.g(name, "name");
        Set setB1 = b1(name);
        if (!U7.U.f11461a.k(name) && !C1481i.f11512o.n(name)) {
            if (setB1 == null || !setB1.isEmpty()) {
                Iterator it = setB1.iterator();
                while (it.hasNext()) {
                    if (((InterfaceC1300z) it.next()).isSuspend()) {
                    }
                }
            }
            ArrayList arrayList = new ArrayList();
            for (Object obj : setB1) {
                if (f1((g0) obj)) {
                    arrayList.add(obj);
                }
            }
            t0(result, name, arrayList, false);
            return;
        }
        M8.l lVarA = M8.l.f7676i.a();
        Collection collectionD = V7.a.d(name, setB1, AbstractC2800q.j(), R(), InterfaceC3660w.f34149a, L().a().k().a());
        AbstractC2855l.f(collectionD, "resolveOverridesForNonStaticMembers(...)");
        u0(name, result, collectionD, result, new a(this));
        u0(name, result, collectionD, lVarA, new b(this));
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : setB1) {
            if (f1((g0) obj2)) {
                arrayList2.add(obj2);
            }
        }
        t0(result, name, AbstractC2800q.z0(arrayList2, lVarA), true);
    }

    @Override // Y7.U
    protected void C(k8.f name, Collection result) {
        AbstractC2855l.g(name, "name");
        AbstractC2855l.g(result, "result");
        if (this.f13088o.o()) {
            w0(name, result);
        }
        Set setD1 = d1(name);
        if (setD1.isEmpty()) {
            return;
        }
        l.b bVar = M8.l.f7676i;
        M8.l lVarA = bVar.a();
        M8.l lVarA2 = bVar.a();
        v0(setD1, result, lVarA, new C1558w(this));
        v0(j7.T.i(setD1, lVarA), lVarA2, null, new C1559x(this));
        Collection collectionD = V7.a.d(name, j7.T.k(setD1, lVarA2), result, R(), L().a().c(), L().a().k().a());
        AbstractC2855l.f(collectionD, "resolveOverridesForNonStaticMembers(...)");
        result.addAll(collectionD);
    }

    @Override // Y7.U
    protected Set D(C3435d kindFilter, Function1 function1) {
        AbstractC2855l.g(kindFilter, "kindFilter");
        if (this.f13088o.o()) {
            return a();
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(((InterfaceC1539c) N().invoke()).e());
        Collection collectionG = R().j().g();
        AbstractC2855l.f(collectionG, "getSupertypes(...)");
        Iterator it = collectionG.iterator();
        while (it.hasNext()) {
            AbstractC2800q.A(linkedHashSet, ((C8.S) it.next()).o().c());
        }
        return linkedHashSet;
    }

    @Override // Y7.U
    protected L7.c0 O() {
        return AbstractC3027i.l(R());
    }

    @Override // Y7.U
    protected boolean V(W7.e eVar) {
        AbstractC2855l.g(eVar, "<this>");
        if (this.f13088o.o()) {
            return false;
        }
        return f1(eVar);
    }

    @Override // Y7.U
    protected U.a Y(b8.r method, List methodTypeParameters, C8.S returnType, List valueParameters) {
        AbstractC2855l.g(method, "method");
        AbstractC2855l.g(methodTypeParameters, "methodTypeParameters");
        AbstractC2855l.g(returnType, "returnType");
        AbstractC2855l.g(valueParameters, "valueParameters");
        o.b bVarA = L().a().s().a(method, R(), returnType, null, valueParameters, methodTypeParameters);
        AbstractC2855l.f(bVarA, "resolvePropagatedSignature(...)");
        C8.S sD = bVarA.d();
        AbstractC2855l.f(sD, "getReturnType(...)");
        C8.S sC = bVarA.c();
        List listF = bVarA.f();
        AbstractC2855l.f(listF, "getValueParameters(...)");
        List listE = bVarA.e();
        AbstractC2855l.f(listE, "getTypeParameters(...)");
        boolean zG = bVarA.g();
        List listB = bVarA.b();
        AbstractC2855l.f(listB, "getErrors(...)");
        return new U.a(sD, sC, listF, listE, zG, listB);
    }

    public final B8.i a1() {
        return this.f13090q;
    }

    @Override // Y7.U, v8.AbstractC3443l, v8.InterfaceC3442k
    public Collection b(k8.f name, T7.b location) {
        AbstractC2855l.g(name, "name");
        AbstractC2855l.g(location, "location");
        n1(name, location);
        return super.b(name, location);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // Y7.U
    /* JADX INFO: renamed from: c1, reason: merged with bridge method [inline-methods] */
    public InterfaceC1280e R() {
        return this.f13087n;
    }

    @Override // Y7.U, v8.AbstractC3443l, v8.InterfaceC3442k
    public Collection d(k8.f name, T7.b location) {
        AbstractC2855l.g(name, "name");
        AbstractC2855l.g(location, "location");
        n1(name, location);
        return super.d(name, location);
    }

    @Override // v8.AbstractC3443l, v8.InterfaceC3445n
    public InterfaceC1283h f(k8.f name, T7.b location) {
        B8.h hVar;
        InterfaceC1280e interfaceC1280e;
        AbstractC2855l.g(name, "name");
        AbstractC2855l.g(location, "location");
        n1(name, location);
        C1561z c1561z = (C1561z) Q();
        return (c1561z == null || (hVar = c1561z.f13094u) == null || (interfaceC1280e = (InterfaceC1280e) hVar.invoke(name)) == null) ? (InterfaceC1283h) this.f13094u.invoke(name) : interfaceC1280e;
    }

    public void n1(k8.f name, T7.b location) {
        AbstractC2855l.g(name, "name");
        AbstractC2855l.g(location, "location");
        S7.a.a(L().a().l(), location, R(), name);
    }

    @Override // Y7.U
    public String toString() {
        return "Lazy Java member scope for " + this.f13088o.d();
    }

    @Override // Y7.U
    protected Set v(C3435d kindFilter, Function1 function1) {
        AbstractC2855l.g(kindFilter, "kindFilter");
        return j7.T.k((Set) this.f13091r.invoke(), ((Map) this.f13093t.invoke()).keySet());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // Y7.U
    /* JADX INFO: renamed from: x0, reason: merged with bridge method [inline-methods] */
    public LinkedHashSet x(C3435d kindFilter, Function1 function1) {
        AbstractC2855l.g(kindFilter, "kindFilter");
        Collection collectionG = R().j().g();
        AbstractC2855l.f(collectionG, "getSupertypes(...)");
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it = collectionG.iterator();
        while (it.hasNext()) {
            AbstractC2800q.A(linkedHashSet, ((C8.S) it.next()).o().a());
        }
        linkedHashSet.addAll(((InterfaceC1539c) N().invoke()).b());
        linkedHashSet.addAll(((InterfaceC1539c) N().invoke()).d());
        linkedHashSet.addAll(v(kindFilter, function1));
        linkedHashSet.addAll(L().a().w().e(R(), L()));
        return linkedHashSet;
    }

    @Override // Y7.U
    protected void y(Collection result, k8.f name) {
        AbstractC2855l.g(result, "result");
        AbstractC2855l.g(name, "name");
        if (this.f13088o.q() && ((InterfaceC1539c) N().invoke()).a(name) != null) {
            if (result.isEmpty()) {
                b8.w wVarA = ((InterfaceC1539c) N().invoke()).a(name);
                AbstractC2855l.d(wVarA);
                result.add(p1(wVarA));
            } else {
                Iterator it = result.iterator();
                while (it.hasNext()) {
                    if (((g0) it.next()).i().isEmpty()) {
                        break;
                    }
                }
                b8.w wVarA2 = ((InterfaceC1539c) N().invoke()).a(name);
                AbstractC2855l.d(wVarA2);
                result.add(p1(wVarA2));
            }
        }
        L().a().w().h(R(), name, result, L());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // Y7.U
    /* JADX INFO: renamed from: y0, reason: merged with bridge method [inline-methods] */
    public C1538b z() {
        return new C1538b(this.f13088o, C1556u.f13081g);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1561z(X7.k c10, InterfaceC1280e ownerDescriptor, InterfaceC1823g jClass, boolean z10, C1561z c1561z) {
        super(c10, c1561z);
        AbstractC2855l.g(c10, "c");
        AbstractC2855l.g(ownerDescriptor, "ownerDescriptor");
        AbstractC2855l.g(jClass, "jClass");
        this.f13087n = ownerDescriptor;
        this.f13088o = jClass;
        this.f13089p = z10;
        this.f13090q = c10.e().e(new C1552p(this, c10));
        this.f13091r = c10.e().e(new C1553q(this));
        this.f13092s = c10.e().e(new r(c10, this));
        this.f13093t = c10.e().e(new C1554s(this));
        this.f13094u = c10.e().i(new C1555t(this, c10));
    }
}
