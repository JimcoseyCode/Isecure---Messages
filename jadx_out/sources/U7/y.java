package U7;

import L7.AbstractC1294t;
import L7.AbstractC1295u;
import L7.InterfaceC1288m;
import L7.InterfaceC1292q;
import L7.x0;
import java.util.HashMap;
import java.util.Map;
import o8.AbstractC3027i;
import w8.InterfaceC3501g;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final AbstractC1295u f11539a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final AbstractC1295u f11540b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final AbstractC1295u f11541c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final Map f11542d;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    static class a extends L7.r {
        a(x0 x0Var) {
            super(x0Var);
        }

        private static /* synthetic */ void g(int i10) {
            Object[] objArr = new Object[3];
            if (i10 == 1) {
                objArr[0] = "from";
            } else if (i10 == 2) {
                objArr[0] = "fromPackage";
            } else if (i10 != 3) {
                objArr[0] = "what";
            } else {
                objArr[0] = "myPackage";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/JavaDescriptorVisibilities$1";
            if (i10 == 2 || i10 == 3) {
                objArr[2] = "visibleFromPackage";
            } else {
                objArr[2] = "isVisible";
            }
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
            return y.d(interfaceC1292q, interfaceC1288m);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    static class b extends L7.r {
        b(x0 x0Var) {
            super(x0Var);
        }

        private static /* synthetic */ void g(int i10) {
            Object[] objArr = new Object[3];
            if (i10 != 1) {
                objArr[0] = "what";
            } else {
                objArr[0] = "from";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/JavaDescriptorVisibilities$2";
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
            return y.e(interfaceC3501g, interfaceC1292q, interfaceC1288m);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    static class c extends L7.r {
        c(x0 x0Var) {
            super(x0Var);
        }

        private static /* synthetic */ void g(int i10) {
            Object[] objArr = new Object[3];
            if (i10 != 1) {
                objArr[0] = "what";
            } else {
                objArr[0] = "from";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/JavaDescriptorVisibilities$3";
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
            return y.e(interfaceC3501g, interfaceC1292q, interfaceC1288m);
        }
    }

    static {
        a aVar = new a(P7.a.f8849c);
        f11539a = aVar;
        b bVar = new b(P7.c.f8851c);
        f11540b = bVar;
        c cVar = new c(P7.b.f8850c);
        f11541c = cVar;
        f11542d = new HashMap();
        f(aVar);
        f(bVar);
        f(cVar);
    }

    private static /* synthetic */ void a(int i10) {
        String str = (i10 == 5 || i10 == 6) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i10 == 5 || i10 == 6) ? 2 : 3];
        switch (i10) {
            case 1:
                objArr[0] = "from";
                break;
            case 2:
                objArr[0] = "first";
                break;
            case 3:
                objArr[0] = "second";
                break;
            case 4:
                objArr[0] = "visibility";
                break;
            case 5:
            case 6:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/load/java/JavaDescriptorVisibilities";
                break;
            default:
                objArr[0] = "what";
                break;
        }
        if (i10 == 5 || i10 == 6) {
            objArr[1] = "toDescriptorVisibility";
        } else {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/JavaDescriptorVisibilities";
        }
        if (i10 == 2 || i10 == 3) {
            objArr[2] = "areInSamePackage";
        } else if (i10 == 4) {
            objArr[2] = "toDescriptorVisibility";
        } else if (i10 != 5 && i10 != 6) {
            objArr[2] = "isVisibleForProtectedAndPackage";
        }
        String str2 = String.format(str, objArr);
        if (i10 != 5 && i10 != 6) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean d(InterfaceC1288m interfaceC1288m, InterfaceC1288m interfaceC1288m2) {
        if (interfaceC1288m == null) {
            a(2);
        }
        if (interfaceC1288m2 == null) {
            a(3);
        }
        L7.N n10 = (L7.N) AbstractC3027i.r(interfaceC1288m, L7.N.class, false);
        L7.N n11 = (L7.N) AbstractC3027i.r(interfaceC1288m2, L7.N.class, false);
        return (n11 == null || n10 == null || !n10.d().equals(n11.d())) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean e(InterfaceC3501g interfaceC3501g, InterfaceC1292q interfaceC1292q, InterfaceC1288m interfaceC1288m) {
        if (interfaceC1292q == null) {
            a(0);
        }
        if (interfaceC1288m == null) {
            a(1);
        }
        if (d(AbstractC3027i.M(interfaceC1292q), interfaceC1288m)) {
            return true;
        }
        return AbstractC1294t.f7345c.e(interfaceC3501g, interfaceC1292q, interfaceC1288m, false);
    }

    private static void f(AbstractC1295u abstractC1295u) {
        f11542d.put(abstractC1295u.b(), abstractC1295u);
    }

    public static AbstractC1295u g(x0 x0Var) {
        if (x0Var == null) {
            a(4);
        }
        AbstractC1295u abstractC1295u = (AbstractC1295u) f11542d.get(x0Var);
        if (abstractC1295u != null) {
            return abstractC1295u;
        }
        AbstractC1295u abstractC1295uJ = AbstractC1294t.j(x0Var);
        if (abstractC1295uJ == null) {
            a(5);
        }
        return abstractC1295uJ;
    }
}
