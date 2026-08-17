package L7;

import J8.l;
import L7.w0;
import com.facebook.react.views.text.TextAttributeProps;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.ServiceLoader;
import java.util.Set;
import o8.AbstractC3027i;
import w8.InterfaceC3501g;
import w8.InterfaceC3502h;

/* JADX INFO: renamed from: L7.t, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC1294t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final AbstractC1295u f7343a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final AbstractC1295u f7344b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final AbstractC1295u f7345c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final AbstractC1295u f7346d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final AbstractC1295u f7347e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final AbstractC1295u f7348f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final AbstractC1295u f7349g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final AbstractC1295u f7350h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final AbstractC1295u f7351i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final Set f7352j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final Map f7353k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final AbstractC1295u f7354l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final InterfaceC3501g f7355m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final InterfaceC3501g f7356n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final InterfaceC3501g f7357o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final J8.l f7358p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final Map f7359q;

    /* JADX INFO: renamed from: L7.t$a */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    static class a implements InterfaceC3501g {
        a() {
        }

        @Override // w8.InterfaceC3501g
        public C8.S getType() {
            throw new IllegalStateException("This method should not be called");
        }
    }

    /* JADX INFO: renamed from: L7.t$b */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    static class b implements InterfaceC3501g {
        b() {
        }

        @Override // w8.InterfaceC3501g
        public C8.S getType() {
            throw new IllegalStateException("This method should not be called");
        }
    }

    /* JADX INFO: renamed from: L7.t$c */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    static class c implements InterfaceC3501g {
        c() {
        }

        @Override // w8.InterfaceC3501g
        public C8.S getType() {
            throw new IllegalStateException("This method should not be called");
        }
    }

    /* JADX INFO: renamed from: L7.t$d */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    static class d extends r {
        d(x0 x0Var) {
            super(x0Var);
        }

        private static /* synthetic */ void g(int i10) {
            Object[] objArr = new Object[3];
            if (i10 == 1) {
                objArr[0] = "what";
            } else if (i10 != 2) {
                objArr[0] = "descriptor";
            } else {
                objArr[0] = "from";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$1";
            if (i10 == 1 || i10 == 2) {
                objArr[2] = "isVisible";
            } else {
                objArr[2] = "hasContainingSourceFile";
            }
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        private boolean h(InterfaceC1288m interfaceC1288m) {
            if (interfaceC1288m == null) {
                g(0);
            }
            return AbstractC3027i.j(interfaceC1288m) != i0.f7336a;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // L7.AbstractC1295u
        public boolean e(InterfaceC3501g interfaceC3501g, InterfaceC1292q interfaceC1292q, InterfaceC1288m interfaceC1288m, boolean z10) {
            if (interfaceC1292q == 0) {
                g(1);
            }
            if (interfaceC1288m == null) {
                g(2);
            }
            if (AbstractC3027i.J(interfaceC1292q) && h(interfaceC1288m)) {
                return AbstractC1294t.f(interfaceC1292q, interfaceC1288m);
            }
            if (interfaceC1292q instanceof InterfaceC1287l) {
                InterfaceC1284i interfaceC1284iB = ((InterfaceC1287l) interfaceC1292q).b();
                if (z10 && AbstractC3027i.G(interfaceC1284iB) && AbstractC3027i.J(interfaceC1284iB) && (interfaceC1288m instanceof InterfaceC1287l) && AbstractC3027i.J(interfaceC1288m.b()) && AbstractC1294t.f(interfaceC1292q, interfaceC1288m)) {
                    return true;
                }
            }
            while (interfaceC1292q != 0) {
                interfaceC1292q = interfaceC1292q.b();
                if (((interfaceC1292q instanceof InterfaceC1280e) && !AbstractC3027i.x(interfaceC1292q)) || (interfaceC1292q instanceof N)) {
                    break;
                }
            }
            if (interfaceC1292q == 0) {
                return false;
            }
            while (interfaceC1288m != null) {
                if (interfaceC1292q == interfaceC1288m) {
                    return true;
                }
                if (interfaceC1288m instanceof N) {
                    return (interfaceC1292q instanceof N) && ((N) interfaceC1292q).d().equals(((N) interfaceC1288m).d()) && AbstractC3027i.b(interfaceC1288m, interfaceC1292q);
                }
                interfaceC1288m = interfaceC1288m.b();
            }
            return false;
        }
    }

    /* JADX INFO: renamed from: L7.t$e */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    static class e extends r {
        e(x0 x0Var) {
            super(x0Var);
        }

        private static /* synthetic */ void g(int i10) {
            Object[] objArr = new Object[3];
            if (i10 != 1) {
                objArr[0] = "what";
            } else {
                objArr[0] = "from";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$2";
            objArr[2] = "isVisible";
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        @Override // L7.AbstractC1295u
        public boolean e(InterfaceC3501g interfaceC3501g, InterfaceC1292q interfaceC1292q, InterfaceC1288m interfaceC1288m, boolean z10) {
            InterfaceC1288m interfaceC1288mQ;
            if (interfaceC1292q == null) {
                g(0);
            }
            if (interfaceC1288m == null) {
                g(1);
            }
            if (AbstractC1294t.f7343a.e(interfaceC3501g, interfaceC1292q, interfaceC1288m, z10)) {
                if (interfaceC3501g == AbstractC1294t.f7356n) {
                    return true;
                }
                if (interfaceC3501g != AbstractC1294t.f7355m && (interfaceC1288mQ = AbstractC3027i.q(interfaceC1292q, InterfaceC1280e.class)) != null && (interfaceC3501g instanceof InterfaceC3502h)) {
                    return ((InterfaceC3502h) interfaceC3501g).q().a().equals(interfaceC1288mQ.a());
                }
            }
            return false;
        }
    }

    /* JADX INFO: renamed from: L7.t$f */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    static class f extends r {
        f(x0 x0Var) {
            super(x0Var);
        }

        private static /* synthetic */ void g(int i10) {
            Object[] objArr = new Object[3];
            if (i10 == 1) {
                objArr[0] = "from";
            } else if (i10 == 2) {
                objArr[0] = "whatDeclaration";
            } else if (i10 != 3) {
                objArr[0] = "what";
            } else {
                objArr[0] = "fromClass";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$3";
            if (i10 == 2 || i10 == 3) {
                objArr[2] = "doesReceiverFitForProtectedVisibility";
            } else {
                objArr[2] = "isVisible";
            }
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        private boolean h(InterfaceC3501g interfaceC3501g, InterfaceC1292q interfaceC1292q, InterfaceC1280e interfaceC1280e) {
            if (interfaceC1292q == null) {
                g(2);
            }
            if (interfaceC1280e == null) {
                g(3);
            }
            if (interfaceC3501g == AbstractC1294t.f7357o) {
                return false;
            }
            if (!(interfaceC1292q instanceof InterfaceC1277b) || (interfaceC1292q instanceof InterfaceC1287l) || interfaceC3501g == AbstractC1294t.f7356n) {
                return true;
            }
            if (interfaceC3501g == AbstractC1294t.f7355m || interfaceC3501g == null) {
                return false;
            }
            C8.S type = interfaceC3501g.getType();
            return AbstractC3027i.I(type, interfaceC1280e) || C8.E.a(type);
        }

        @Override // L7.AbstractC1295u
        public boolean e(InterfaceC3501g interfaceC3501g, InterfaceC1292q interfaceC1292q, InterfaceC1288m interfaceC1288m, boolean z10) {
            InterfaceC1280e interfaceC1280e;
            if (interfaceC1292q == null) {
                g(0);
            }
            if (interfaceC1288m == null) {
                g(1);
            }
            InterfaceC1280e interfaceC1280e2 = (InterfaceC1280e) AbstractC3027i.q(interfaceC1292q, InterfaceC1280e.class);
            InterfaceC1280e interfaceC1280e3 = (InterfaceC1280e) AbstractC3027i.r(interfaceC1288m, InterfaceC1280e.class, false);
            if (interfaceC1280e3 == null) {
                return false;
            }
            if (interfaceC1280e2 != null && AbstractC3027i.x(interfaceC1280e2) && (interfaceC1280e = (InterfaceC1280e) AbstractC3027i.q(interfaceC1280e2, InterfaceC1280e.class)) != null && AbstractC3027i.H(interfaceC1280e3, interfaceC1280e)) {
                return true;
            }
            InterfaceC1292q interfaceC1292qM = AbstractC3027i.M(interfaceC1292q);
            InterfaceC1280e interfaceC1280e4 = (InterfaceC1280e) AbstractC3027i.q(interfaceC1292qM, InterfaceC1280e.class);
            if (interfaceC1280e4 == null) {
                return false;
            }
            if (AbstractC3027i.H(interfaceC1280e3, interfaceC1280e4) && h(interfaceC3501g, interfaceC1292qM, interfaceC1280e3)) {
                return true;
            }
            return e(interfaceC3501g, interfaceC1292q, interfaceC1280e3.b(), z10);
        }
    }

    /* JADX INFO: renamed from: L7.t$g */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    static class g extends r {
        g(x0 x0Var) {
            super(x0Var);
        }

        private static /* synthetic */ void g(int i10) {
            Object[] objArr = new Object[3];
            if (i10 != 1) {
                objArr[0] = "what";
            } else {
                objArr[0] = "from";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$4";
            objArr[2] = "isVisible";
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        @Override // L7.AbstractC1295u
        public boolean e(InterfaceC3501g interfaceC3501g, InterfaceC1292q interfaceC1292q, InterfaceC1288m interfaceC1288m, boolean z10) {
            if (interfaceC1292q == null) {
                g(0);
            }
            if (interfaceC1288m == null) {
                g(1);
            }
            if (AbstractC3027i.g(interfaceC1288m).w(AbstractC3027i.g(interfaceC1292q))) {
                return AbstractC1294t.f7358p.a(interfaceC1292q, interfaceC1288m);
            }
            return false;
        }
    }

    /* JADX INFO: renamed from: L7.t$h */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    static class h extends r {
        h(x0 x0Var) {
            super(x0Var);
        }

        private static /* synthetic */ void g(int i10) {
            Object[] objArr = new Object[3];
            if (i10 != 1) {
                objArr[0] = "what";
            } else {
                objArr[0] = "from";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$5";
            objArr[2] = "isVisible";
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        @Override // L7.AbstractC1295u
        public boolean e(InterfaceC3501g interfaceC3501g, InterfaceC1292q interfaceC1292q, InterfaceC1288m interfaceC1288m, boolean z10) {
            if (interfaceC1292q == null) {
                g(0);
            }
            if (interfaceC1288m == null) {
                g(1);
            }
            return true;
        }
    }

    /* JADX INFO: renamed from: L7.t$i */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    static class i extends r {
        i(x0 x0Var) {
            super(x0Var);
        }

        private static /* synthetic */ void g(int i10) {
            Object[] objArr = new Object[3];
            if (i10 != 1) {
                objArr[0] = "what";
            } else {
                objArr[0] = "from";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$6";
            objArr[2] = "isVisible";
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        @Override // L7.AbstractC1295u
        public boolean e(InterfaceC3501g interfaceC3501g, InterfaceC1292q interfaceC1292q, InterfaceC1288m interfaceC1288m, boolean z10) {
            if (interfaceC1292q == null) {
                g(0);
            }
            if (interfaceC1288m == null) {
                g(1);
            }
            throw new IllegalStateException("This method shouldn't be invoked for LOCAL visibility");
        }
    }

    /* JADX INFO: renamed from: L7.t$j */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    static class j extends r {
        j(x0 x0Var) {
            super(x0Var);
        }

        private static /* synthetic */ void g(int i10) {
            Object[] objArr = new Object[3];
            if (i10 != 1) {
                objArr[0] = "what";
            } else {
                objArr[0] = "from";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$7";
            objArr[2] = "isVisible";
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        @Override // L7.AbstractC1295u
        public boolean e(InterfaceC3501g interfaceC3501g, InterfaceC1292q interfaceC1292q, InterfaceC1288m interfaceC1288m, boolean z10) {
            if (interfaceC1292q == null) {
                g(0);
            }
            if (interfaceC1288m == null) {
                g(1);
            }
            throw new IllegalStateException("Visibility is unknown yet");
        }
    }

    /* JADX INFO: renamed from: L7.t$k */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    static class k extends r {
        k(x0 x0Var) {
            super(x0Var);
        }

        private static /* synthetic */ void g(int i10) {
            Object[] objArr = new Object[3];
            if (i10 != 1) {
                objArr[0] = "what";
            } else {
                objArr[0] = "from";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$8";
            objArr[2] = "isVisible";
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        @Override // L7.AbstractC1295u
        public boolean e(InterfaceC3501g interfaceC3501g, InterfaceC1292q interfaceC1292q, InterfaceC1288m interfaceC1288m, boolean z10) {
            if (interfaceC1292q == null) {
                g(0);
            }
            if (interfaceC1288m == null) {
                g(1);
            }
            return false;
        }
    }

    /* JADX INFO: renamed from: L7.t$l */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    static class l extends r {
        l(x0 x0Var) {
            super(x0Var);
        }

        private static /* synthetic */ void g(int i10) {
            Object[] objArr = new Object[3];
            if (i10 != 1) {
                objArr[0] = "what";
            } else {
                objArr[0] = "from";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$9";
            objArr[2] = "isVisible";
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        @Override // L7.AbstractC1295u
        public boolean e(InterfaceC3501g interfaceC3501g, InterfaceC1292q interfaceC1292q, InterfaceC1288m interfaceC1288m, boolean z10) {
            if (interfaceC1292q == null) {
                g(0);
            }
            if (interfaceC1288m == null) {
                g(1);
            }
            return false;
        }
    }

    static {
        d dVar = new d(w0.e.f7368c);
        f7343a = dVar;
        e eVar = new e(w0.f.f7369c);
        f7344b = eVar;
        f fVar = new f(w0.g.f7370c);
        f7345c = fVar;
        g gVar = new g(w0.b.f7365c);
        f7346d = gVar;
        h hVar = new h(w0.h.f7371c);
        f7347e = hVar;
        i iVar = new i(w0.d.f7367c);
        f7348f = iVar;
        j jVar = new j(w0.a.f7364c);
        f7349g = jVar;
        k kVar = new k(w0.c.f7366c);
        f7350h = kVar;
        l lVar = new l(w0.i.f7372c);
        f7351i = lVar;
        f7352j = Collections.unmodifiableSet(j7.T.h(dVar, eVar, gVar, iVar));
        HashMap mapE = M8.a.e(4);
        mapE.put(eVar, 0);
        mapE.put(dVar, 0);
        mapE.put(gVar, 1);
        mapE.put(fVar, 1);
        mapE.put(hVar, 2);
        f7353k = Collections.unmodifiableMap(mapE);
        f7354l = hVar;
        f7355m = new a();
        f7356n = new b();
        f7357o = new c();
        Iterator it = ServiceLoader.load(J8.l.class, J8.l.class.getClassLoader()).iterator();
        f7358p = it.hasNext() ? (J8.l) it.next() : l.a.f6868a;
        f7359q = new HashMap();
        i(dVar);
        i(eVar);
        i(fVar);
        i(gVar);
        i(hVar);
        i(iVar);
        i(jVar);
        i(kVar);
        i(lVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x003a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ void a(int i10) {
        String str = i10 != 16 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
        Object[] objArr = new Object[i10 != 16 ? 3 : 2];
        if (i10 != 1 && i10 != 3 && i10 != 5 && i10 != 7) {
            switch (i10) {
                case 9:
                    break;
                case 10:
                case 12:
                    objArr[0] = "first";
                    break;
                case 11:
                case TextAttributeProps.TA_KEY_BEST_WRITING_DIRECTION /* 13 */:
                    objArr[0] = "second";
                    break;
                case TextAttributeProps.TA_KEY_TEXT_DECORATION_COLOR /* 14 */:
                case TextAttributeProps.TA_KEY_TEXT_DECORATION_LINE /* 15 */:
                    objArr[0] = "visibility";
                    break;
                case 16:
                    objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities";
                    break;
                default:
                    objArr[0] = "what";
                    break;
            }
        } else {
            objArr[0] = "from";
        }
        if (i10 != 16) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities";
        } else {
            objArr[1] = "toDescriptorVisibility";
        }
        switch (i10) {
            case 2:
            case 3:
                objArr[2] = "isVisibleIgnoringReceiver";
                break;
            case 4:
            case 5:
                objArr[2] = "isVisibleWithAnyReceiver";
                break;
            case 6:
            case 7:
                objArr[2] = "inSameFile";
                break;
            case 8:
            case 9:
                objArr[2] = "findInvisibleMember";
                break;
            case 10:
            case 11:
                objArr[2] = "compareLocal";
                break;
            case 12:
            case TextAttributeProps.TA_KEY_BEST_WRITING_DIRECTION /* 13 */:
                objArr[2] = "compare";
                break;
            case TextAttributeProps.TA_KEY_TEXT_DECORATION_COLOR /* 14 */:
                objArr[2] = "isPrivate";
                break;
            case TextAttributeProps.TA_KEY_TEXT_DECORATION_LINE /* 15 */:
                objArr[2] = "toDescriptorVisibility";
                break;
            case 16:
                break;
            default:
                objArr[2] = "isVisible";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i10 == 16) {
            throw new IllegalStateException(str2);
        }
    }

    public static Integer d(AbstractC1295u abstractC1295u, AbstractC1295u abstractC1295u2) {
        if (abstractC1295u == null) {
            a(12);
        }
        if (abstractC1295u2 == null) {
            a(13);
        }
        Integer numA = abstractC1295u.a(abstractC1295u2);
        if (numA != null) {
            return numA;
        }
        Integer numA2 = abstractC1295u2.a(abstractC1295u);
        if (numA2 != null) {
            return Integer.valueOf(-numA2.intValue());
        }
        return null;
    }

    public static InterfaceC1292q e(InterfaceC3501g interfaceC3501g, InterfaceC1292q interfaceC1292q, InterfaceC1288m interfaceC1288m, boolean z10) {
        InterfaceC1292q interfaceC1292qE;
        if (interfaceC1292q == null) {
            a(8);
        }
        if (interfaceC1288m == null) {
            a(9);
        }
        for (InterfaceC1292q interfaceC1292q2 = (InterfaceC1292q) interfaceC1292q.a(); interfaceC1292q2 != null && interfaceC1292q2.getVisibility() != f7348f; interfaceC1292q2 = (InterfaceC1292q) AbstractC3027i.q(interfaceC1292q2, InterfaceC1292q.class)) {
            if (!interfaceC1292q2.getVisibility().e(interfaceC3501g, interfaceC1292q2, interfaceC1288m, z10)) {
                return interfaceC1292q2;
            }
        }
        if (!(interfaceC1292q instanceof O7.Q) || (interfaceC1292qE = e(interfaceC3501g, ((O7.Q) interfaceC1292q).k0(), interfaceC1288m, z10)) == null) {
            return null;
        }
        return interfaceC1292qE;
    }

    public static boolean f(InterfaceC1288m interfaceC1288m, InterfaceC1288m interfaceC1288m2) {
        if (interfaceC1288m == null) {
            a(6);
        }
        if (interfaceC1288m2 == null) {
            a(7);
        }
        i0 i0VarJ = AbstractC3027i.j(interfaceC1288m2);
        if (i0VarJ != i0.f7336a) {
            return i0VarJ.equals(AbstractC3027i.j(interfaceC1288m));
        }
        return false;
    }

    public static boolean g(AbstractC1295u abstractC1295u) {
        if (abstractC1295u == null) {
            a(14);
        }
        return abstractC1295u == f7343a || abstractC1295u == f7344b;
    }

    public static boolean h(InterfaceC1292q interfaceC1292q, InterfaceC1288m interfaceC1288m, boolean z10) {
        if (interfaceC1292q == null) {
            a(2);
        }
        if (interfaceC1288m == null) {
            a(3);
        }
        return e(f7356n, interfaceC1292q, interfaceC1288m, z10) == null;
    }

    private static void i(AbstractC1295u abstractC1295u) {
        f7359q.put(abstractC1295u.b(), abstractC1295u);
    }

    public static AbstractC1295u j(x0 x0Var) {
        if (x0Var == null) {
            a(15);
        }
        AbstractC1295u abstractC1295u = (AbstractC1295u) f7359q.get(x0Var);
        if (abstractC1295u != null) {
            return abstractC1295u;
        }
        throw new IllegalArgumentException("Inapplicable visibility: " + x0Var);
    }
}
