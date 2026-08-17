package Y7;

import C8.I0;
import C8.J0;
import L7.InterfaceC1276a;
import L7.InterfaceC1280e;
import L7.InterfaceC1288m;
import L7.InterfaceC1300z;
import L7.g0;
import L7.m0;
import L7.u0;
import b8.InterfaceC1814B;
import b8.InterfaceC1822f;
import b8.InterfaceC1830n;
import d8.AbstractC2345C;
import j7.AbstractC2800q;
import j7.C2783G;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o8.AbstractC3026h;
import o8.AbstractC3027i;
import o8.AbstractC3036r;
import v8.AbstractC3434c;
import v8.AbstractC3443l;
import v8.C3435d;
import v8.InterfaceC3442k;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class U extends AbstractC3443l {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    static final /* synthetic */ C7.k[] f12991m = {kotlin.jvm.internal.D.k(new kotlin.jvm.internal.v(kotlin.jvm.internal.D.b(U.class), "functionNamesLazy", "getFunctionNamesLazy()Ljava/util/Set;")), kotlin.jvm.internal.D.k(new kotlin.jvm.internal.v(kotlin.jvm.internal.D.b(U.class), "propertyNamesLazy", "getPropertyNamesLazy()Ljava/util/Set;")), kotlin.jvm.internal.D.k(new kotlin.jvm.internal.v(kotlin.jvm.internal.D.b(U.class), "classNamesLazy", "getClassNamesLazy()Ljava/util/Set;"))};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final X7.k f12992b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final U f12993c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final B8.i f12994d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final B8.i f12995e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final B8.g f12996f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final B8.h f12997g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final B8.g f12998h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final B8.i f12999i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final B8.i f13000j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final B8.i f13001k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final B8.g f13002l;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    protected static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final C8.S f13003a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final C8.S f13004b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final List f13005c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final List f13006d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final boolean f13007e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final List f13008f;

        public a(C8.S returnType, C8.S s10, List valueParameters, List typeParameters, boolean z10, List errors) {
            AbstractC2855l.g(returnType, "returnType");
            AbstractC2855l.g(valueParameters, "valueParameters");
            AbstractC2855l.g(typeParameters, "typeParameters");
            AbstractC2855l.g(errors, "errors");
            this.f13003a = returnType;
            this.f13004b = s10;
            this.f13005c = valueParameters;
            this.f13006d = typeParameters;
            this.f13007e = z10;
            this.f13008f = errors;
        }

        public final List a() {
            return this.f13008f;
        }

        public final boolean b() {
            return this.f13007e;
        }

        public final C8.S c() {
            return this.f13004b;
        }

        public final C8.S d() {
            return this.f13003a;
        }

        public final List e() {
            return this.f13006d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return AbstractC2855l.b(this.f13003a, aVar.f13003a) && AbstractC2855l.b(this.f13004b, aVar.f13004b) && AbstractC2855l.b(this.f13005c, aVar.f13005c) && AbstractC2855l.b(this.f13006d, aVar.f13006d) && this.f13007e == aVar.f13007e && AbstractC2855l.b(this.f13008f, aVar.f13008f);
        }

        public final List f() {
            return this.f13005c;
        }

        public int hashCode() {
            int iHashCode = this.f13003a.hashCode() * 31;
            C8.S s10 = this.f13004b;
            return ((((((((iHashCode + (s10 == null ? 0 : s10.hashCode())) * 31) + this.f13005c.hashCode()) * 31) + this.f13006d.hashCode()) * 31) + Boolean.hashCode(this.f13007e)) * 31) + this.f13008f.hashCode();
        }

        public String toString() {
            return "MethodSignatureData(returnType=" + this.f13003a + ", receiverType=" + this.f13004b + ", valueParameters=" + this.f13005c + ", typeParameters=" + this.f13006d + ", hasStableParameterNames=" + this.f13007e + ", errors=" + this.f13008f + ')';
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    protected static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final List f13009a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final boolean f13010b;

        public b(List descriptors, boolean z10) {
            AbstractC2855l.g(descriptors, "descriptors");
            this.f13009a = descriptors;
            this.f13010b = z10;
        }

        public final List a() {
            return this.f13009a;
        }

        public final boolean b() {
            return this.f13010b;
        }
    }

    public /* synthetic */ U(X7.k kVar, U u10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(kVar, (i10 & 2) != 0 ? null : u10);
    }

    private final O7.K E(InterfaceC1830n interfaceC1830n) {
        W7.f fVarC1 = W7.f.c1(R(), X7.h.a(this.f12992b, interfaceC1830n), L7.E.f7283h, U7.V.d(interfaceC1830n.getVisibility()), !interfaceC1830n.isFinal(), interfaceC1830n.getName(), this.f12992b.a().t().a(interfaceC1830n), U(interfaceC1830n));
        AbstractC2855l.f(fVarC1, "create(...)");
        return fVarC1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final L7.Z F(U u10, k8.f name) {
        AbstractC2855l.g(name, "name");
        U u11 = u10.f12993c;
        if (u11 != null) {
            return (L7.Z) u11.f12997g.invoke(name);
        }
        InterfaceC1830n interfaceC1830nC = ((InterfaceC1539c) u10.f12995e.invoke()).c(name);
        if (interfaceC1830nC == null || interfaceC1830nC.C()) {
            return null;
        }
        return u10.a0(interfaceC1830nC);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Collection G(U u10, k8.f name) {
        AbstractC2855l.g(name, "name");
        U u11 = u10.f12993c;
        if (u11 != null) {
            return (Collection) u11.f12996f.invoke(name);
        }
        ArrayList arrayList = new ArrayList();
        for (b8.r rVar : ((InterfaceC1539c) u10.f12995e.invoke()).f(name)) {
            W7.e eVarZ = u10.Z(rVar);
            if (u10.V(eVarZ)) {
                u10.f12992b.a().h().a(rVar, eVarZ);
                arrayList.add(eVarZ);
            }
        }
        u10.y(arrayList, name);
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC1539c H(U u10) {
        return u10.z();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Set I(U u10) {
        return u10.x(C3435d.f32974v, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Collection J(U u10, k8.f name) {
        AbstractC2855l.g(name, "name");
        LinkedHashSet linkedHashSet = new LinkedHashSet((Collection) u10.f12996f.invoke(name));
        u10.e0(linkedHashSet);
        u10.B(linkedHashSet, name);
        return AbstractC2800q.P0(u10.f12992b.a().r().p(u10.f12992b, linkedHashSet));
    }

    private final Set M() {
        return (Set) B8.m.a(this.f13001k, this, f12991m[2]);
    }

    private final Set P() {
        return (Set) B8.m.a(this.f12999i, this, f12991m[0]);
    }

    private final Set S() {
        return (Set) B8.m.a(this.f13000j, this, f12991m[1]);
    }

    private final C8.S T(InterfaceC1830n interfaceC1830n) {
        C8.S sP = this.f12992b.g().p(interfaceC1830n.getType(), Z7.b.b(I0.f575h, false, false, null, 7, null));
        if ((!I7.i.s0(sP) && !I7.i.v0(sP)) || !U(interfaceC1830n) || !interfaceC1830n.K()) {
            return sP;
        }
        C8.S sN = J0.n(sP);
        AbstractC2855l.f(sN, "makeNotNullable(...)");
        return sN;
    }

    private final boolean U(InterfaceC1830n interfaceC1830n) {
        return interfaceC1830n.isFinal() && interfaceC1830n.M();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List W(U u10, k8.f name) {
        AbstractC2855l.g(name, "name");
        ArrayList arrayList = new ArrayList();
        M8.a.a(arrayList, u10.f12997g.invoke(name));
        u10.C(name, arrayList);
        return AbstractC3027i.t(u10.R()) ? AbstractC2800q.P0(arrayList) : AbstractC2800q.P0(u10.f12992b.a().r().p(u10.f12992b, arrayList));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Set X(U u10) {
        return u10.D(C3435d.f32975w, null);
    }

    private final L7.Z a0(InterfaceC1830n interfaceC1830n) {
        kotlin.jvm.internal.C c10 = new kotlin.jvm.internal.C();
        O7.K kE = E(interfaceC1830n);
        c10.f29371g = kE;
        kE.S0(null, null, null, null);
        ((O7.K) c10.f29371g).Y0(T(interfaceC1830n), AbstractC2800q.j(), O(), null, AbstractC2800q.j());
        InterfaceC1288m interfaceC1288mR = R();
        InterfaceC1280e interfaceC1280e = interfaceC1288mR instanceof InterfaceC1280e ? (InterfaceC1280e) interfaceC1288mR : null;
        if (interfaceC1280e != null) {
            c10.f29371g = this.f12992b.a().w().a(interfaceC1280e, (O7.K) c10.f29371g, this.f12992b);
        }
        Object obj = c10.f29371g;
        if (AbstractC3027i.K((u0) obj, ((O7.K) obj).getType())) {
            ((O7.K) c10.f29371g).I0(new I(this, interfaceC1830n, c10));
        }
        this.f12992b.a().h().b(interfaceC1830n, (L7.Z) c10.f29371g);
        return (L7.Z) c10.f29371g;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final B8.j b0(U u10, InterfaceC1830n interfaceC1830n, kotlin.jvm.internal.C c10) {
        return u10.f12992b.e().g(new J(u10, interfaceC1830n, c10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final q8.g c0(U u10, InterfaceC1830n interfaceC1830n, kotlin.jvm.internal.C c10) {
        return u10.f12992b.a().g().a(interfaceC1830n, (L7.Z) c10.f29371g);
    }

    private final void e0(Set set) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj : set) {
            String strC = AbstractC2345C.c((g0) obj, false, false, 2, null);
            Object arrayList = linkedHashMap.get(strC);
            if (arrayList == null) {
                arrayList = new ArrayList();
                linkedHashMap.put(strC, arrayList);
            }
            ((List) arrayList).add(obj);
        }
        for (List list : linkedHashMap.values()) {
            if (list.size() != 1) {
                Collection collectionB = AbstractC3036r.b(list, T.f12990g);
                set.removeAll(list);
                set.addAll(collectionB);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC1276a f0(g0 selectMostSpecificInEachOverridableGroup) {
        AbstractC2855l.g(selectMostSpecificInEachOverridableGroup, "$this$selectMostSpecificInEachOverridableGroup");
        return selectMostSpecificInEachOverridableGroup;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Collection t(U u10) {
        return u10.w(C3435d.f32967o, InterfaceC3442k.f32993a.c());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Set u(U u10) {
        return u10.v(C3435d.f32972t, null);
    }

    protected final C8.S A(b8.r method, X7.k c10) {
        AbstractC2855l.g(method, "method");
        AbstractC2855l.g(c10, "c");
        return c10.g().p(method.getReturnType(), Z7.b.b(I0.f575h, method.L().o(), false, null, 6, null));
    }

    protected abstract void B(Collection collection, k8.f fVar);

    protected abstract void C(k8.f fVar, Collection collection);

    protected abstract Set D(C3435d c3435d, Function1 function1);

    protected final B8.i K() {
        return this.f12994d;
    }

    protected final X7.k L() {
        return this.f12992b;
    }

    protected final B8.i N() {
        return this.f12995e;
    }

    protected abstract L7.c0 O();

    protected final U Q() {
        return this.f12993c;
    }

    protected abstract InterfaceC1288m R();

    protected boolean V(W7.e eVar) {
        AbstractC2855l.g(eVar, "<this>");
        return true;
    }

    protected abstract a Y(b8.r rVar, List list, C8.S s10, List list2);

    protected final W7.e Z(b8.r method) {
        AbstractC2855l.g(method, "method");
        W7.e eVarM1 = W7.e.m1(R(), X7.h.a(this.f12992b, method), method.getName(), this.f12992b.a().t().a(method), ((InterfaceC1539c) this.f12995e.invoke()).a(method.getName()) != null && method.i().isEmpty());
        AbstractC2855l.f(eVarM1, "createJavaMethod(...)");
        X7.k kVarI = X7.c.i(this.f12992b, eVarM1, method, 0, 4, null);
        List typeParameters = method.getTypeParameters();
        List arrayList = new ArrayList(AbstractC2800q.u(typeParameters, 10));
        Iterator it = typeParameters.iterator();
        while (it.hasNext()) {
            m0 m0VarA = kVarI.f().a((b8.y) it.next());
            AbstractC2855l.d(m0VarA);
            arrayList.add(m0VarA);
        }
        b bVarD0 = d0(kVarI, eVarM1, method.i());
        a aVarY = Y(method, arrayList, A(method, kVarI), bVarD0.a());
        C8.S sC = aVarY.c();
        eVarM1.l1(sC != null ? AbstractC3026h.i(eVarM1, sC, M7.h.f7570a.b()) : null, O(), AbstractC2800q.j(), aVarY.e(), aVarY.f(), aVarY.d(), L7.E.f7282g.a(false, method.isAbstract(), !method.isFinal()), U7.V.d(method.getVisibility()), aVarY.c() != null ? j7.K.f(i7.t.a(W7.e.f12138M, AbstractC2800q.e0(bVarD0.a()))) : j7.K.i());
        eVarM1.p1(aVarY.b(), bVarD0.b());
        if (!aVarY.a().isEmpty()) {
            kVarI.a().s().b(eVarM1, aVarY.a());
        }
        return eVarM1;
    }

    @Override // v8.AbstractC3443l, v8.InterfaceC3442k
    public Set a() {
        return P();
    }

    @Override // v8.AbstractC3443l, v8.InterfaceC3442k
    public Collection b(k8.f name, T7.b location) {
        AbstractC2855l.g(name, "name");
        AbstractC2855l.g(location, "location");
        return !a().contains(name) ? AbstractC2800q.j() : (Collection) this.f12998h.invoke(name);
    }

    @Override // v8.AbstractC3443l, v8.InterfaceC3442k
    public Set c() {
        return S();
    }

    @Override // v8.AbstractC3443l, v8.InterfaceC3442k
    public Collection d(k8.f name, T7.b location) {
        AbstractC2855l.g(name, "name");
        AbstractC2855l.g(location, "location");
        return !c().contains(name) ? AbstractC2800q.j() : (Collection) this.f13002l.invoke(name);
    }

    protected final b d0(X7.k c10, InterfaceC1300z interfaceC1300z, List jValueParameters) {
        Pair pairA;
        k8.f name;
        AbstractC2855l.g(c10, "c");
        InterfaceC1300z function = interfaceC1300z;
        AbstractC2855l.g(function, "function");
        AbstractC2855l.g(jValueParameters, "jValueParameters");
        Iterable<C2783G> iterableV0 = AbstractC2800q.V0(jValueParameters);
        ArrayList arrayList = new ArrayList(AbstractC2800q.u(iterableV0, 10));
        boolean z10 = false;
        for (C2783G c2783g : iterableV0) {
            int iA = c2783g.a();
            InterfaceC1814B interfaceC1814B = (InterfaceC1814B) c2783g.b();
            M7.h hVarA = X7.h.a(c10, interfaceC1814B);
            Z7.a aVarB = Z7.b.b(I0.f575h, false, false, null, 7, null);
            if (interfaceC1814B.a()) {
                b8.x type = interfaceC1814B.getType();
                InterfaceC1822f interfaceC1822f = type instanceof InterfaceC1822f ? (InterfaceC1822f) type : null;
                if (interfaceC1822f == null) {
                    throw new AssertionError("Vararg parameter should be an array: " + interfaceC1814B);
                }
                C8.S sL = c10.g().l(interfaceC1822f, aVarB, true);
                pairA = i7.t.a(sL, c10.d().n().k(sL));
            } else {
                pairA = i7.t.a(c10.g().p(interfaceC1814B.getType(), aVarB), null);
            }
            C8.S s10 = (C8.S) pairA.getFirst();
            C8.S s11 = (C8.S) pairA.getSecond();
            if (AbstractC2855l.b(function.getName().j(), "equals") && jValueParameters.size() == 1 && AbstractC2855l.b(c10.d().n().I(), s10)) {
                name = k8.f.q("other");
            } else {
                name = interfaceC1814B.getName();
                if (name == null) {
                    z10 = true;
                }
                if (name == null) {
                    StringBuilder sb = new StringBuilder();
                    sb.append('p');
                    sb.append(iA);
                    name = k8.f.q(sb.toString());
                    AbstractC2855l.f(name, "identifier(...)");
                }
            }
            boolean z11 = z10;
            AbstractC2855l.d(name);
            arrayList.add(new O7.V(function, null, iA, hVarA, name, s10, false, false, false, s11, c10.a().t().a(interfaceC1814B)));
            function = interfaceC1300z;
            z10 = z11;
        }
        return new b(AbstractC2800q.P0(arrayList), z10);
    }

    @Override // v8.AbstractC3443l, v8.InterfaceC3442k
    public Set e() {
        return M();
    }

    @Override // v8.AbstractC3443l, v8.InterfaceC3445n
    public Collection g(C3435d kindFilter, Function1 nameFilter) {
        AbstractC2855l.g(kindFilter, "kindFilter");
        AbstractC2855l.g(nameFilter, "nameFilter");
        return (Collection) this.f12994d.invoke();
    }

    public String toString() {
        return "Lazy scope for " + R();
    }

    protected abstract Set v(C3435d c3435d, Function1 function1);

    protected final List w(C3435d kindFilter, Function1 nameFilter) {
        AbstractC2855l.g(kindFilter, "kindFilter");
        AbstractC2855l.g(nameFilter, "nameFilter");
        T7.d dVar = T7.d.f10638s;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        if (kindFilter.a(C3435d.f32955c.c())) {
            for (k8.f fVar : v(kindFilter, nameFilter)) {
                if (((Boolean) nameFilter.invoke(fVar)).booleanValue()) {
                    M8.a.a(linkedHashSet, f(fVar, dVar));
                }
            }
        }
        if (kindFilter.a(C3435d.f32955c.d()) && !kindFilter.l().contains(AbstractC3434c.a.f32952a)) {
            for (k8.f fVar2 : x(kindFilter, nameFilter)) {
                if (((Boolean) nameFilter.invoke(fVar2)).booleanValue()) {
                    linkedHashSet.addAll(b(fVar2, dVar));
                }
            }
        }
        if (kindFilter.a(C3435d.f32955c.i()) && !kindFilter.l().contains(AbstractC3434c.a.f32952a)) {
            for (k8.f fVar3 : D(kindFilter, nameFilter)) {
                if (((Boolean) nameFilter.invoke(fVar3)).booleanValue()) {
                    linkedHashSet.addAll(d(fVar3, dVar));
                }
            }
        }
        return AbstractC2800q.P0(linkedHashSet);
    }

    protected abstract Set x(C3435d c3435d, Function1 function1);

    protected void y(Collection result, k8.f name) {
        AbstractC2855l.g(result, "result");
        AbstractC2855l.g(name, "name");
    }

    protected abstract InterfaceC1539c z();

    public U(X7.k c10, U u10) {
        AbstractC2855l.g(c10, "c");
        this.f12992b = c10;
        this.f12993c = u10;
        this.f12994d = c10.e().b(new H(this), AbstractC2800q.j());
        this.f12995e = c10.e().e(new K(this));
        this.f12996f = c10.e().h(new L(this));
        this.f12997g = c10.e().i(new M(this));
        this.f12998h = c10.e().h(new N(this));
        this.f12999i = c10.e().e(new O(this));
        this.f13000j = c10.e().e(new P(this));
        this.f13001k = c10.e().e(new Q(this));
        this.f13002l = c10.e().h(new S(this));
    }
}
