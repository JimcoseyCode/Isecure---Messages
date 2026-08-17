package K7;

import A8.C0393m;
import C8.AbstractC0407d0;
import C8.G0;
import C8.S;
import C8.Y;
import K7.k;
import L7.AbstractC1293s;
import L7.AbstractC1294t;
import L7.AbstractC1299y;
import L7.E;
import L7.EnumC1281f;
import L7.F;
import L7.H;
import L7.InterfaceC1277b;
import L7.InterfaceC1279d;
import L7.InterfaceC1280e;
import L7.InterfaceC1283h;
import L7.InterfaceC1287l;
import L7.InterfaceC1288m;
import L7.InterfaceC1300z;
import L7.M;
import L7.g0;
import L7.h0;
import L7.t0;
import M8.b;
import M8.l;
import O7.C1332k;
import Y7.C1550n;
import Y7.C1561z;
import d8.AbstractC2344B;
import d8.AbstractC2345C;
import d8.C2348F;
import i7.C2735B;
import i7.C2750m;
import j7.AbstractC2800q;
import j7.T;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Pair;
import kotlin.enums.EnumEntries;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.C;
import kotlin.jvm.internal.D;
import o8.C3033o;
import p7.AbstractC3083a;
import s8.AbstractC3340e;
import v8.InterfaceC3442k;
import w7.InterfaceC3487a;
import y8.AbstractC3638L;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class u implements N7.a, N7.c {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    static final /* synthetic */ C7.k[] f7170i = {D.k(new kotlin.jvm.internal.v(D.b(u.class), "settings", "getSettings()Lorg/jetbrains/kotlin/builtins/jvm/JvmBuiltIns$Settings;")), D.k(new kotlin.jvm.internal.v(D.b(u.class), "cloneableType", "getCloneableType()Lorg/jetbrains/kotlin/types/SimpleType;")), D.k(new kotlin.jvm.internal.v(D.b(u.class), "notConsideredDeprecation", "getNotConsideredDeprecation()Lorg/jetbrains/kotlin/descriptors/annotations/Annotations;"))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final H f7171a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final K7.d f7172b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final B8.i f7173c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final S f7174d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final B8.i f7175e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final B8.a f7176f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final B8.i f7177g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final B8.g f7178h;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    private static final class a {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final a f7179g = new a("HIDDEN", 0);

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final a f7180h = new a("VISIBLE", 1);

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static final a f7181i = new a("DEPRECATED_LIST_METHODS", 2);

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public static final a f7182j = new a("NOT_CONSIDERED", 3);

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public static final a f7183k = new a("DROP", 4);

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private static final /* synthetic */ a[] f7184l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private static final /* synthetic */ EnumEntries f7185m;

        static {
            a[] aVarArrH = h();
            f7184l = aVarArrH;
            f7185m = AbstractC3083a.a(aVarArrH);
        }

        private a(String str, int i10) {
        }

        private static final /* synthetic */ a[] h() {
            return new a[]{f7179g, f7180h, f7181i, f7182j, f7183k};
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) f7184l.clone();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f7186a;

        static {
            int[] iArr = new int[a.values().length];
            try {
                iArr[a.f7179g.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[a.f7181i.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[a.f7182j.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[a.f7183k.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[a.f7180h.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f7186a = iArr;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class c extends O7.H {
        c(H h10, k8.c cVar) {
            super(h10, cVar);
        }

        @Override // L7.N
        /* JADX INFO: renamed from: C0, reason: merged with bridge method [inline-methods] */
        public InterfaceC3442k.b o() {
            return InterfaceC3442k.b.f32996b;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class d extends b.AbstractC0071b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f7187a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ C f7188b;

        d(String str, C c10) {
            this.f7187a = str;
            this.f7188b = c10;
        }

        @Override // M8.b.d
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public boolean c(InterfaceC1280e javaClassDescriptor) {
            AbstractC2855l.g(javaClassDescriptor, "javaClassDescriptor");
            String strA = AbstractC2344B.a(C2348F.f25682a, javaClassDescriptor, this.f7187a);
            x xVar = x.f7192a;
            if (xVar.f().contains(strA)) {
                this.f7188b.f29371g = a.f7179g;
            } else if (xVar.i().contains(strA)) {
                this.f7188b.f29371g = a.f7180h;
            } else if (xVar.c().contains(strA)) {
                this.f7188b.f29371g = a.f7181i;
            } else if (xVar.d().contains(strA)) {
                this.f7188b.f29371g = a.f7183k;
            }
            return this.f7188b.f29371g == null;
        }

        @Override // M8.b.d
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public a a() {
            a aVar = (a) this.f7188b.f29371g;
            return aVar == null ? a.f7182j : aVar;
        }
    }

    public u(H moduleDescriptor, B8.n storageManager, InterfaceC3487a settingsComputation) {
        AbstractC2855l.g(moduleDescriptor, "moduleDescriptor");
        AbstractC2855l.g(storageManager, "storageManager");
        AbstractC2855l.g(settingsComputation, "settingsComputation");
        this.f7171a = moduleDescriptor;
        this.f7172b = K7.d.f7130a;
        this.f7173c = storageManager.e(settingsComputation);
        this.f7174d = q(storageManager);
        this.f7175e = storageManager.e(new l(this, storageManager));
        this.f7176f = storageManager.c();
        this.f7177g = storageManager.e(new m(this));
        this.f7178h = storageManager.h(new n(this));
    }

    private final a A(InterfaceC1300z interfaceC1300z) {
        InterfaceC1288m interfaceC1288mB = interfaceC1300z.b();
        AbstractC2855l.e(interfaceC1288mB, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
        Object objB = M8.b.b(AbstractC2800q.e((InterfaceC1280e) interfaceC1288mB), new t(this), new d(AbstractC2345C.c(interfaceC1300z, false, false, 3, null), new C()));
        AbstractC2855l.f(objB, "dfs(...)");
        return (a) objB;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Iterable B(u uVar, InterfaceC1280e interfaceC1280e) {
        Collection collectionG = interfaceC1280e.j().g();
        AbstractC2855l.f(collectionG, "getSupertypes(...)");
        ArrayList arrayList = new ArrayList();
        Iterator it = collectionG.iterator();
        while (it.hasNext()) {
            InterfaceC1283h interfaceC1283hP = ((S) it.next()).K0().p();
            InterfaceC1280e interfaceC1280eZ = null;
            InterfaceC1283h interfaceC1283hA = interfaceC1283hP != null ? interfaceC1283hP.a() : null;
            InterfaceC1280e interfaceC1280e2 = interfaceC1283hA instanceof InterfaceC1280e ? (InterfaceC1280e) interfaceC1283hA : null;
            if (interfaceC1280e2 != null && (interfaceC1280eZ = uVar.z(interfaceC1280e2)) == null) {
                interfaceC1280eZ = interfaceC1280e2;
            }
            if (interfaceC1280eZ != null) {
                arrayList.add(interfaceC1280eZ);
            }
        }
        return arrayList;
    }

    private final M7.h C() {
        return (M7.h) B8.m.a(this.f7177g, this, f7170i[2]);
    }

    private final k.b D() {
        return (k.b) B8.m.a(this.f7173c, this, f7170i[0]);
    }

    private final boolean E(g0 g0Var, boolean z10) {
        InterfaceC1288m interfaceC1288mB = g0Var.b();
        AbstractC2855l.e(interfaceC1288mB, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
        String strC = AbstractC2345C.c(g0Var, false, false, 3, null);
        if (z10 ^ x.f7192a.g().contains(AbstractC2344B.a(C2348F.f25682a, (InterfaceC1280e) interfaceC1288mB, strC))) {
            return true;
        }
        Boolean boolE = M8.b.e(AbstractC2800q.e(g0Var), r.f7167a, new s(this));
        AbstractC2855l.f(boolE, "ifAny(...)");
        return boolE.booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Iterable F(InterfaceC1277b interfaceC1277b) {
        return interfaceC1277b.a().e();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Boolean G(u uVar, InterfaceC1277b interfaceC1277b) {
        boolean z10;
        if (interfaceC1277b.getKind() == InterfaceC1277b.a.DECLARATION) {
            K7.d dVar = uVar.f7172b;
            InterfaceC1288m interfaceC1288mB = interfaceC1277b.b();
            AbstractC2855l.e(interfaceC1288mB, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
            z10 = dVar.c((InterfaceC1280e) interfaceC1288mB);
        }
        return Boolean.valueOf(z10);
    }

    private final boolean H(InterfaceC1287l interfaceC1287l, InterfaceC1280e interfaceC1280e) {
        if (interfaceC1287l.i().size() != 1) {
            return false;
        }
        List listI = interfaceC1287l.i();
        AbstractC2855l.f(listI, "getValueParameters(...)");
        InterfaceC1283h interfaceC1283hP = ((t0) AbstractC2800q.C0(listI)).getType().K0().p();
        return AbstractC2855l.b(interfaceC1283hP != null ? AbstractC3340e.p(interfaceC1283hP) : null, AbstractC3340e.p(interfaceC1280e));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final M7.h I(u uVar) {
        return M7.h.f7570a.a(AbstractC2800q.e(M7.g.c(uVar.f7171a.n(), "This member is not fully supported by Kotlin compiler, so it may be absent or have different signature in next major version", null, null, true, 6, null)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AbstractC0407d0 o(u uVar, B8.n nVar) {
        return AbstractC1299y.d(uVar.D().a(), g.f7134d.a(), new M(nVar, uVar.D().a())).r();
    }

    private final g0 p(C0393m c0393m, g0 g0Var) {
        InterfaceC1300z.a aVarS = g0Var.s();
        aVarS.m(c0393m);
        aVarS.b(AbstractC1294t.f7347e);
        aVarS.f(c0393m.r());
        aVarS.o(c0393m.G0());
        InterfaceC1300z interfaceC1300zBuild = aVarS.build();
        AbstractC2855l.d(interfaceC1300zBuild);
        return (g0) interfaceC1300zBuild;
    }

    private final S q(B8.n nVar) {
        C1332k c1332k = new C1332k(new c(this.f7171a, new k8.c("java.io")), k8.f.q("Serializable"), E.f7286k, EnumC1281f.f7321i, AbstractC2800q.e(new Y(nVar, new o(this))), h0.f7335a, false, nVar);
        c1332k.H0(InterfaceC3442k.b.f32996b, T.e(), null);
        AbstractC0407d0 abstractC0407d0R = c1332k.r();
        AbstractC2855l.f(abstractC0407d0R, "getDefaultType(...)");
        return abstractC0407d0R;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final S r(u uVar) {
        AbstractC0407d0 abstractC0407d0I = uVar.f7171a.n().i();
        AbstractC2855l.f(abstractC0407d0I, "getAnyType(...)");
        return abstractC0407d0I;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final M7.h s(u uVar, Pair pair) {
        AbstractC2855l.g(pair, "<destruct>");
        String str = (String) pair.getFirst();
        String str2 = (String) pair.getSecond();
        return M7.h.f7570a.a(AbstractC2800q.e(M7.g.b(uVar.f7171a.n(), '\'' + str + "()' member of List is redundant in Kotlin and might be removed soon. Please use '" + str2 + "()' stdlib extension instead", str2 + "()", "HIDDEN", false)));
    }

    private final Collection t(InterfaceC1280e interfaceC1280e, Function1 function1) {
        C1550n c1550nZ = z(interfaceC1280e);
        if (c1550nZ == null) {
            return AbstractC2800q.j();
        }
        Collection collectionG = this.f7172b.g(AbstractC3340e.o(c1550nZ), K7.b.f7108h.a());
        InterfaceC1280e interfaceC1280e2 = (InterfaceC1280e) AbstractC2800q.r0(collectionG);
        if (interfaceC1280e2 == null) {
            return AbstractC2800q.j();
        }
        l.b bVar = M8.l.f7676i;
        ArrayList arrayList = new ArrayList(AbstractC2800q.u(collectionG, 10));
        Iterator it = collectionG.iterator();
        while (it.hasNext()) {
            arrayList.add(AbstractC3340e.o((InterfaceC1280e) it.next()));
        }
        M8.l lVarB = bVar.b(arrayList);
        boolean zC = this.f7172b.c(interfaceC1280e);
        InterfaceC3442k interfaceC3442kA0 = ((InterfaceC1280e) this.f7176f.a(AbstractC3340e.o(c1550nZ), new q(c1550nZ, interfaceC1280e2))).A0();
        AbstractC2855l.f(interfaceC3442kA0, "getUnsubstitutedMemberScope(...)");
        Iterable iterable = (Iterable) function1.invoke(interfaceC3442kA0);
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : iterable) {
            g0 g0Var = (g0) obj;
            if (g0Var.getKind() == InterfaceC1277b.a.DECLARATION && g0Var.getVisibility().d() && !I7.i.k0(g0Var)) {
                Collection collectionE = g0Var.e();
                AbstractC2855l.f(collectionE, "getOverriddenDescriptors(...)");
                if (collectionE == null || !collectionE.isEmpty()) {
                    Iterator it2 = collectionE.iterator();
                    while (it2.hasNext()) {
                        InterfaceC1288m interfaceC1288mB = ((InterfaceC1300z) it2.next()).b();
                        AbstractC2855l.f(interfaceC1288mB, "getContainingDeclaration(...)");
                        if (lVarB.contains(AbstractC3340e.o(interfaceC1288mB))) {
                            break;
                        }
                    }
                }
                if (!E(g0Var, zC)) {
                    arrayList2.add(obj);
                }
            }
        }
        return arrayList2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC1280e u(C1550n c1550n, InterfaceC1280e interfaceC1280e) {
        V7.j EMPTY = V7.j.f11830a;
        AbstractC2855l.f(EMPTY, "EMPTY");
        return c1550n.M0(EMPTY, interfaceC1280e);
    }

    private final AbstractC0407d0 v() {
        return (AbstractC0407d0) B8.m.a(this.f7175e, this, f7170i[1]);
    }

    private static final boolean w(InterfaceC1287l interfaceC1287l, G0 g02, InterfaceC1287l interfaceC1287l2) {
        return C3033o.x(interfaceC1287l, interfaceC1287l2.c(g02)) == C3033o.i.a.OVERRIDABLE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Collection x(k8.f fVar, InterfaceC3442k it) {
        AbstractC2855l.g(it, "it");
        return it.b(fVar, T7.d.f10629j);
    }

    private final C1550n z(InterfaceC1280e interfaceC1280e) {
        k8.b bVarN;
        k8.c cVarA;
        if (I7.i.a0(interfaceC1280e) || !I7.i.B0(interfaceC1280e)) {
            return null;
        }
        k8.d dVarP = AbstractC3340e.p(interfaceC1280e);
        if (dVarP.f() && (bVarN = K7.c.f7110a.n(dVarP)) != null && (cVarA = bVarN.a()) != null) {
            InterfaceC1280e interfaceC1280eD = AbstractC1293s.d(D().a(), cVarA, T7.d.f10629j);
            if (interfaceC1280eD instanceof C1550n) {
                return (C1550n) interfaceC1280eD;
            }
        }
        return null;
    }

    @Override // N7.a
    public Collection a(InterfaceC1280e classDescriptor) {
        AbstractC2855l.g(classDescriptor, "classDescriptor");
        k8.d dVarP = AbstractC3340e.p(classDescriptor);
        x xVar = x.f7192a;
        return xVar.j(dVarP) ? AbstractC2800q.m(v(), this.f7174d) : xVar.k(dVarP) ? AbstractC2800q.e(this.f7174d) : AbstractC2800q.j();
    }

    @Override // N7.a
    public Collection b(InterfaceC1280e classDescriptor) {
        AbstractC2855l.g(classDescriptor, "classDescriptor");
        if (classDescriptor.getKind() != EnumC1281f.f7320h || !D().b()) {
            return AbstractC2800q.j();
        }
        C1550n c1550nZ = z(classDescriptor);
        if (c1550nZ == null) {
            return AbstractC2800q.j();
        }
        InterfaceC1280e interfaceC1280eF = K7.d.f(this.f7172b, AbstractC3340e.o(c1550nZ), K7.b.f7108h.a(), null, 4, null);
        if (interfaceC1280eF == null) {
            return AbstractC2800q.j();
        }
        G0 g0C = y.a(interfaceC1280eF, c1550nZ).c();
        List listO0 = c1550nZ.f();
        ArrayList<InterfaceC1279d> arrayList = new ArrayList();
        for (Object obj : listO0) {
            InterfaceC1279d interfaceC1279d = (InterfaceC1279d) obj;
            if (interfaceC1279d.getVisibility().d()) {
                Collection<InterfaceC1279d> collectionF = interfaceC1280eF.f();
                AbstractC2855l.f(collectionF, "getConstructors(...)");
                if (collectionF == null || !collectionF.isEmpty()) {
                    for (InterfaceC1279d interfaceC1279d2 : collectionF) {
                        AbstractC2855l.d(interfaceC1279d2);
                        if (w(interfaceC1279d2, g0C, interfaceC1279d)) {
                            break;
                        }
                    }
                }
                if (!H(interfaceC1279d, classDescriptor) && !I7.i.k0(interfaceC1279d) && !x.f7192a.e().contains(AbstractC2344B.a(C2348F.f25682a, c1550nZ, AbstractC2345C.c(interfaceC1279d, false, false, 3, null)))) {
                    arrayList.add(obj);
                }
            }
        }
        ArrayList arrayList2 = new ArrayList(AbstractC2800q.u(arrayList, 10));
        for (InterfaceC1279d interfaceC1279d3 : arrayList) {
            InterfaceC1300z.a aVarS = interfaceC1279d3.s();
            aVarS.m(classDescriptor);
            aVarS.f(classDescriptor.r());
            aVarS.h();
            aVarS.p(g0C.j());
            if (!x.f7192a.h().contains(AbstractC2344B.a(C2348F.f25682a, c1550nZ, AbstractC2345C.c(interfaceC1279d3, false, false, 3, null)))) {
                aVarS.c(C());
            }
            InterfaceC1300z interfaceC1300zBuild = aVarS.build();
            AbstractC2855l.e(interfaceC1300zBuild, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassConstructorDescriptor");
            arrayList2.add((InterfaceC1279d) interfaceC1300zBuild);
        }
        return arrayList2;
    }

    @Override // N7.c
    public boolean c(InterfaceC1280e classDescriptor, g0 functionDescriptor) {
        AbstractC2855l.g(classDescriptor, "classDescriptor");
        AbstractC2855l.g(functionDescriptor, "functionDescriptor");
        C1550n c1550nZ = z(classDescriptor);
        if (c1550nZ == null || !functionDescriptor.getAnnotations().h(N7.d.a())) {
            return true;
        }
        if (!D().b()) {
            return false;
        }
        String strC = AbstractC2345C.c(functionDescriptor, false, false, 3, null);
        C1561z c1561zR0 = c1550nZ.A0();
        k8.f name = functionDescriptor.getName();
        AbstractC2855l.f(name, "getName(...)");
        Collection collectionB = c1561zR0.b(name, T7.d.f10629j);
        if (collectionB != null && collectionB.isEmpty()) {
            return false;
        }
        Iterator it = collectionB.iterator();
        while (it.hasNext()) {
            if (AbstractC2855l.b(AbstractC2345C.c((g0) it.next(), false, false, 3, null), strC)) {
                return true;
            }
        }
        return false;
    }

    @Override // N7.a
    public Collection e(k8.f name, InterfaceC1280e classDescriptor) {
        M7.h hVar;
        AbstractC2855l.g(name, "name");
        AbstractC2855l.g(classDescriptor, "classDescriptor");
        if (AbstractC2855l.b(name, K7.a.f7106e.a()) && (classDescriptor instanceof C0393m) && I7.i.e0(classDescriptor)) {
            C0393m c0393m = (C0393m) classDescriptor;
            List listH0 = c0393m.b1().H0();
            AbstractC2855l.f(listH0, "getFunctionList(...)");
            if (listH0 == null || !listH0.isEmpty()) {
                Iterator it = listH0.iterator();
                while (it.hasNext()) {
                    if (AbstractC2855l.b(AbstractC3638L.b(c0393m.a1().g(), ((f8.i) it.next()).c0()), K7.a.f7106e.a())) {
                        return AbstractC2800q.j();
                    }
                }
            }
            return AbstractC2800q.e(p(c0393m, (g0) AbstractC2800q.B0(v().o().b(name, T7.d.f10629j))));
        }
        if (!D().b()) {
            return AbstractC2800q.j();
        }
        Collection<g0> collectionT = t(classDescriptor, new p(name));
        ArrayList arrayList = new ArrayList();
        for (g0 g0Var : collectionT) {
            InterfaceC1288m interfaceC1288mB = g0Var.b();
            AbstractC2855l.e(interfaceC1288mB, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
            InterfaceC1300z interfaceC1300zC = g0Var.c(y.a((InterfaceC1280e) interfaceC1288mB, classDescriptor).c());
            AbstractC2855l.e(interfaceC1300zC, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.SimpleFunctionDescriptor");
            InterfaceC1300z.a aVarS = ((g0) interfaceC1300zC).s();
            aVarS.m(classDescriptor);
            aVarS.o(classDescriptor.G0());
            aVarS.h();
            int i10 = b.f7186a[A(g0Var).ordinal()];
            g0 g0Var2 = null;
            if (i10 != 1) {
                if (i10 == 2) {
                    k8.f name2 = g0Var.getName();
                    if (AbstractC2855l.b(name2, v.f7189a)) {
                        hVar = (M7.h) this.f7178h.invoke(i7.t.a(g0Var.getName().j(), "first"));
                    } else {
                        if (!AbstractC2855l.b(name2, v.f7190b)) {
                            throw new IllegalStateException(("Unexpected name: " + g0Var.getName()).toString());
                        }
                        hVar = (M7.h) this.f7178h.invoke(i7.t.a(g0Var.getName().j(), "last"));
                    }
                    aVarS.c(hVar);
                } else if (i10 == 3) {
                    aVarS.c(C());
                } else if (i10 != 4) {
                    if (i10 != 5) {
                        throw new C2750m();
                    }
                    C2735B c2735b = C2735B.f28704a;
                }
                InterfaceC1300z interfaceC1300zBuild = aVarS.build();
                AbstractC2855l.d(interfaceC1300zBuild);
                g0Var2 = (g0) interfaceC1300zBuild;
            } else if (!F.a(classDescriptor)) {
                aVarS.j();
                InterfaceC1300z interfaceC1300zBuild2 = aVarS.build();
                AbstractC2855l.d(interfaceC1300zBuild2);
                g0Var2 = (g0) interfaceC1300zBuild2;
            }
            if (g0Var2 != null) {
                arrayList.add(g0Var2);
            }
        }
        return arrayList;
    }

    @Override // N7.a
    /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
    public Set d(InterfaceC1280e classDescriptor) {
        C1561z c1561zR0;
        Set setA;
        AbstractC2855l.g(classDescriptor, "classDescriptor");
        if (!D().b()) {
            return T.e();
        }
        C1550n c1550nZ = z(classDescriptor);
        return (c1550nZ == null || (c1561zR0 = c1550nZ.A0()) == null || (setA = c1561zR0.a()) == null) ? T.e() : setA;
    }
}
