package Y7;

import C8.AbstractC0402b;
import C8.D0;
import C8.I0;
import C8.N0;
import C8.r0;
import C8.v0;
import L7.AbstractC1294t;
import L7.AbstractC1295u;
import L7.EnumC1281f;
import L7.InterfaceC1279d;
import L7.InterfaceC1280e;
import L7.InterfaceC1283h;
import L7.InterfaceC1288m;
import L7.M;
import L7.f0;
import L7.k0;
import L7.m0;
import L7.q0;
import L7.x0;
import O7.AbstractC1331j;
import b8.InterfaceC1823g;
import b8.InterfaceC1826j;
import i7.AbstractC2746i;
import j7.AbstractC2800q;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Lazy;
import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import l7.AbstractC2884a;
import s8.AbstractC3340e;
import v8.C3438g;
import v8.InterfaceC3442k;
import y8.InterfaceC3660w;

/* JADX INFO: renamed from: Y7.n, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class C1550n extends AbstractC1331j implements W7.c {

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public static final a f13052E = new a(null);

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private static final Set f13053F = j7.T.h("equals", "hashCode", "getClass", "wait", "notify", "notifyAll", "toString");

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    private final C3438g f13054A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    private final a0 f13055B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final M7.h f13056C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private final B8.i f13057D;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final X7.k f13058o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final InterfaceC1823g f13059p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final InterfaceC1280e f13060q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final X7.k f13061r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final Lazy f13062s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final EnumC1281f f13063t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final L7.E f13064u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final x0 f13065v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final boolean f13066w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private final b f13067x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private final C1561z f13068y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private final f0 f13069z;

    /* JADX INFO: renamed from: Y7.n$a */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Y7.n$b */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    final class b extends AbstractC0402b {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final B8.i f13070d;

        public b() {
            super(C1550n.this.f13061r.e());
            this.f13070d = C1550n.this.f13061r.e().e(new C1551o(C1550n.this));
        }

        private final C8.S J() {
            k8.c cVarB;
            ArrayList arrayList;
            k8.c cVarK = K();
            if (cVarK == null || cVarK.d() || !cVarK.i(I7.o.f5141z)) {
                cVarK = null;
            }
            if (cVarK == null) {
                cVarB = U7.r.f11524a.b(AbstractC3340e.o(C1550n.this));
                if (cVarB == null) {
                    return null;
                }
            } else {
                cVarB = cVarK;
            }
            InterfaceC1280e interfaceC1280eB = AbstractC3340e.B(C1550n.this.f13061r.d(), cVarB, T7.d.f10644y);
            if (interfaceC1280eB == null) {
                return null;
            }
            int size = interfaceC1280eB.j().getParameters().size();
            List parameters = C1550n.this.j().getParameters();
            AbstractC2855l.f(parameters, "getParameters(...)");
            int size2 = parameters.size();
            if (size2 == size) {
                arrayList = new ArrayList(AbstractC2800q.u(parameters, 10));
                Iterator it = parameters.iterator();
                while (it.hasNext()) {
                    arrayList.add(new D0(N0.f592k, ((m0) it.next()).r()));
                }
            } else {
                if (size2 != 1 || size <= 1 || cVarK != null) {
                    return null;
                }
                D0 d02 = new D0(N0.f592k, ((m0) AbstractC2800q.C0(parameters)).r());
                B7.c cVar = new B7.c(1, size);
                ArrayList arrayList2 = new ArrayList(AbstractC2800q.u(cVar, 10));
                Iterator it2 = cVar.iterator();
                while (it2.hasNext()) {
                    ((j7.J) it2).nextInt();
                    arrayList2.add(d02);
                }
                arrayList = arrayList2;
            }
            return C8.V.h(r0.f682h.j(), interfaceC1280eB, arrayList);
        }

        private final k8.c K() {
            String str;
            M7.h annotations = C1550n.this.getAnnotations();
            k8.c PURELY_IMPLEMENTS_ANNOTATION = U7.I.f11413r;
            AbstractC2855l.f(PURELY_IMPLEMENTS_ANNOTATION, "PURELY_IMPLEMENTS_ANNOTATION");
            M7.c cVarB = annotations.b(PURELY_IMPLEMENTS_ANNOTATION);
            if (cVarB == null) {
                return null;
            }
            Object objD0 = AbstractC2800q.D0(cVarB.a().values());
            q8.x xVar = objD0 instanceof q8.x ? (q8.x) objD0 : null;
            if (xVar == null || (str = (String) xVar.b()) == null || !k8.e.e(str)) {
                return null;
            }
            return new k8.c(str);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final List L(C1550n c1550n) {
            return q0.g(c1550n);
        }

        @Override // C8.AbstractC0435v, C8.v0
        /* JADX INFO: renamed from: H */
        public InterfaceC1280e p() {
            return C1550n.this;
        }

        @Override // C8.v0
        public List getParameters() {
            return (List) this.f13070d.invoke();
        }

        @Override // C8.AbstractC0430p
        protected Collection m() {
            Collection collectionG = C1550n.this.P0().g();
            ArrayList arrayList = new ArrayList(collectionG.size());
            ArrayList<b8.x> arrayList2 = new ArrayList(0);
            C8.S sJ = J();
            Iterator it = collectionG.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                InterfaceC1826j interfaceC1826j = (InterfaceC1826j) it.next();
                C8.S sQ = C1550n.this.f13061r.a().r().q(C1550n.this.f13061r.g().p(interfaceC1826j, Z7.b.b(I0.f574g, false, false, null, 7, null)), C1550n.this.f13061r);
                if (sQ.K0().p() instanceof M.b) {
                    arrayList2.add(interfaceC1826j);
                }
                if (!AbstractC2855l.b(sQ.K0(), sJ != null ? sJ.K0() : null) && !I7.i.b0(sQ)) {
                    arrayList.add(sQ);
                }
            }
            InterfaceC1280e interfaceC1280e = C1550n.this.f13060q;
            M8.a.a(arrayList, interfaceC1280e != null ? K7.y.a(interfaceC1280e, C1550n.this).c().p(interfaceC1280e.r(), N0.f592k) : null);
            M8.a.a(arrayList, sJ);
            if (!arrayList2.isEmpty()) {
                InterfaceC3660w interfaceC3660wC = C1550n.this.f13061r.a().c();
                InterfaceC1280e interfaceC1280eP = p();
                ArrayList arrayList3 = new ArrayList(AbstractC2800q.u(arrayList2, 10));
                for (b8.x xVar : arrayList2) {
                    AbstractC2855l.e(xVar, "null cannot be cast to non-null type org.jetbrains.kotlin.load.java.structure.JavaClassifierType");
                    arrayList3.add(((InterfaceC1826j) xVar).m());
                }
                interfaceC3660wC.b(interfaceC1280eP, arrayList3);
            }
            return !arrayList.isEmpty() ? AbstractC2800q.P0(arrayList) : AbstractC2800q.e(C1550n.this.f13061r.d().n().i());
        }

        @Override // C8.v0
        public boolean q() {
            return true;
        }

        public String toString() {
            String strJ = C1550n.this.getName().j();
            AbstractC2855l.f(strJ, "asString(...)");
            return strJ;
        }

        @Override // C8.AbstractC0430p
        protected k0 u() {
            return C1550n.this.f13061r.a().v();
        }
    }

    /* JADX INFO: renamed from: Y7.n$c */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class c implements Comparator {
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return AbstractC2884a.a(AbstractC3340e.o((InterfaceC1280e) obj).b(), AbstractC3340e.o((InterfaceC1280e) obj2).b());
        }
    }

    public /* synthetic */ C1550n(X7.k kVar, InterfaceC1288m interfaceC1288m, InterfaceC1823g interfaceC1823g, InterfaceC1280e interfaceC1280e, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(kVar, interfaceC1288m, interfaceC1823g, (i10 & 8) != 0 ? null : interfaceC1280e);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List N0(C1550n c1550n) {
        List<b8.y> typeParameters = c1550n.f13059p.getTypeParameters();
        ArrayList arrayList = new ArrayList(AbstractC2800q.u(typeParameters, 10));
        for (b8.y yVar : typeParameters) {
            m0 m0VarA = c1550n.f13061r.f().a(yVar);
            if (m0VarA == null) {
                throw new AssertionError("Parameter " + yVar + " surely belongs to class " + c1550n.f13059p + ", so it must be resolved");
            }
            arrayList.add(m0VarA);
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List T0(C1550n c1550n) {
        k8.b bVarN = AbstractC3340e.n(c1550n);
        if (bVarN != null) {
            return c1550n.f13058o.a().f().a(bVarN);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C1561z U0(C1550n c1550n, D8.g it) {
        AbstractC2855l.g(it, "it");
        return new C1561z(c1550n.f13061r, c1550n, c1550n.f13059p, c1550n.f13060q != null, c1550n.f13068y);
    }

    @Override // L7.D
    public boolean B0() {
        return false;
    }

    @Override // L7.InterfaceC1280e
    public boolean C() {
        return false;
    }

    @Override // L7.InterfaceC1280e
    public boolean F0() {
        return false;
    }

    @Override // L7.InterfaceC1280e
    public Collection I() {
        if (this.f13064u != L7.E.f7284i) {
            return AbstractC2800q.j();
        }
        Z7.a aVarB = Z7.b.b(I0.f575h, false, false, null, 7, null);
        O8.i iVarJ = this.f13059p.J();
        ArrayList arrayList = new ArrayList();
        Iterator it = iVarJ.iterator();
        while (it.hasNext()) {
            InterfaceC1283h interfaceC1283hP = this.f13061r.g().p((InterfaceC1826j) it.next(), aVarB).K0().p();
            InterfaceC1280e interfaceC1280e = interfaceC1283hP instanceof InterfaceC1280e ? (InterfaceC1280e) interfaceC1283hP : null;
            if (interfaceC1280e != null) {
                arrayList.add(interfaceC1280e);
            }
        }
        return AbstractC2800q.H0(arrayList, new c());
    }

    @Override // L7.D
    public boolean J() {
        return false;
    }

    @Override // L7.InterfaceC1284i
    public boolean K() {
        return this.f13066w;
    }

    public final C1550n M0(V7.j javaResolverCache, InterfaceC1280e interfaceC1280e) {
        AbstractC2855l.g(javaResolverCache, "javaResolverCache");
        X7.k kVar = this.f13061r;
        X7.k kVarM = X7.c.m(kVar, kVar.a().x(javaResolverCache));
        InterfaceC1288m interfaceC1288mB = b();
        AbstractC2855l.f(interfaceC1288mB, "getContainingDeclaration(...)");
        return new C1550n(kVarM, interfaceC1288mB, this.f13059p, interfaceC1280e);
    }

    @Override // L7.InterfaceC1280e
    public InterfaceC1279d O() {
        return null;
    }

    @Override // L7.InterfaceC1280e
    /* JADX INFO: renamed from: O0, reason: merged with bridge method [inline-methods] */
    public List f() {
        return (List) this.f13068y.a1().invoke();
    }

    @Override // L7.InterfaceC1280e
    public InterfaceC3442k P() {
        return this.f13055B;
    }

    public final InterfaceC1823g P0() {
        return this.f13059p;
    }

    public final List Q0() {
        return (List) this.f13062s.getValue();
    }

    @Override // L7.InterfaceC1280e
    public InterfaceC1280e R() {
        return null;
    }

    @Override // O7.AbstractC1322a, L7.InterfaceC1280e
    /* JADX INFO: renamed from: R0, reason: merged with bridge method [inline-methods] */
    public C1561z A0() {
        InterfaceC3442k interfaceC3442kA0 = super.A0();
        AbstractC2855l.e(interfaceC3442kA0, "null cannot be cast to non-null type org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassMemberScope");
        return (C1561z) interfaceC3442kA0;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // O7.z
    /* JADX INFO: renamed from: S0, reason: merged with bridge method [inline-methods] */
    public C1561z L(D8.g kotlinTypeRefiner) {
        AbstractC2855l.g(kotlinTypeRefiner, "kotlinTypeRefiner");
        return (C1561z) this.f13069z.c(kotlinTypeRefiner);
    }

    @Override // M7.a
    public M7.h getAnnotations() {
        return this.f13056C;
    }

    @Override // L7.InterfaceC1280e
    public EnumC1281f getKind() {
        return this.f13063t;
    }

    @Override // L7.InterfaceC1280e, L7.D, L7.InterfaceC1292q
    public AbstractC1295u getVisibility() {
        if (!AbstractC2855l.b(this.f13065v, AbstractC1294t.f7343a) || this.f13059p.h() != null) {
            return U7.V.d(this.f13065v);
        }
        AbstractC1295u abstractC1295u = U7.y.f11539a;
        AbstractC2855l.d(abstractC1295u);
        return abstractC1295u;
    }

    @Override // L7.InterfaceC1280e
    public boolean isInline() {
        return false;
    }

    @Override // L7.InterfaceC1283h
    public v0 j() {
        return this.f13067x;
    }

    @Override // L7.InterfaceC1280e, L7.D
    public L7.E k() {
        return this.f13064u;
    }

    @Override // L7.InterfaceC1280e
    public boolean l() {
        return false;
    }

    @Override // L7.InterfaceC1280e, L7.InterfaceC1284i
    public List t() {
        return (List) this.f13057D.invoke();
    }

    public String toString() {
        return "Lazy Java class " + AbstractC3340e.p(this);
    }

    @Override // O7.AbstractC1322a, L7.InterfaceC1280e
    public InterfaceC3442k v0() {
        return this.f13054A;
    }

    @Override // L7.InterfaceC1280e
    public L7.r0 w0() {
        return null;
    }

    @Override // L7.InterfaceC1280e
    public boolean y() {
        return false;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1550n(X7.k outerContext, InterfaceC1288m containingDeclaration, InterfaceC1823g jClass, InterfaceC1280e interfaceC1280e) {
        L7.E eA;
        super(outerContext.e(), containingDeclaration, jClass.getName(), outerContext.a().t().a(jClass), false);
        AbstractC2855l.g(outerContext, "outerContext");
        AbstractC2855l.g(containingDeclaration, "containingDeclaration");
        AbstractC2855l.g(jClass, "jClass");
        this.f13058o = outerContext;
        this.f13059p = jClass;
        this.f13060q = interfaceC1280e;
        X7.k kVarF = X7.c.f(outerContext, this, jClass, 0, 4, null);
        this.f13061r = kVarF;
        kVarF.a().h().d(jClass, this);
        jClass.E();
        this.f13062s = AbstractC2746i.b(new C1547k(this));
        this.f13063t = jClass.o() ? EnumC1281f.f7324l : jClass.D() ? EnumC1281f.f7321i : jClass.x() ? EnumC1281f.f7322j : EnumC1281f.f7320h;
        if (jClass.o() || jClass.x()) {
            eA = L7.E.f7283h;
        } else {
            eA = L7.E.f7282g.a(jClass.A(), jClass.A() || jClass.isAbstract() || jClass.D(), !jClass.isFinal());
        }
        this.f13064u = eA;
        this.f13065v = jClass.getVisibility();
        this.f13066w = (jClass.h() == null || jClass.M()) ? false : true;
        this.f13067x = new b();
        C1561z c1561z = new C1561z(kVarF, this, jClass, interfaceC1280e != null, null, 16, null);
        this.f13068y = c1561z;
        this.f13069z = f0.f7329e.a(this, kVarF.e(), kVarF.a().k().d(), new C1548l(this));
        this.f13054A = new C3438g(c1561z);
        this.f13055B = new a0(kVarF, jClass, this);
        this.f13056C = X7.h.a(kVarF, jClass);
        this.f13057D = kVarF.e().e(new C1549m(this));
    }
}
