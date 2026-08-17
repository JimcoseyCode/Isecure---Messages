package V7;

import L7.InterfaceC1280e;
import L7.InterfaceC1287l;
import L7.Z;
import L7.g0;
import b8.InterfaceC1823g;
import b8.InterfaceC1828l;
import b8.InterfaceC1830n;
import b8.q;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public interface j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final j f11830a = new a();

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    static class a implements j {
        a() {
        }

        private static /* synthetic */ void f(int i10) {
            Object[] objArr = new Object[3];
            switch (i10) {
                case 1:
                    objArr[0] = "member";
                    break;
                case 2:
                case 4:
                case 6:
                case 8:
                    objArr[0] = "descriptor";
                    break;
                case 3:
                    objArr[0] = "element";
                    break;
                case 5:
                    objArr[0] = "field";
                    break;
                case 7:
                    objArr[0] = "javaClass";
                    break;
                default:
                    objArr[0] = "fqName";
                    break;
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/components/JavaResolverCache$1";
            switch (i10) {
                case 1:
                case 2:
                    objArr[2] = "recordMethod";
                    break;
                case 3:
                case 4:
                    objArr[2] = "recordConstructor";
                    break;
                case 5:
                case 6:
                    objArr[2] = "recordField";
                    break;
                case 7:
                case 8:
                    objArr[2] = "recordClass";
                    break;
                default:
                    objArr[2] = "getClassResolvedFromSource";
                    break;
            }
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        @Override // V7.j
        public void a(q qVar, g0 g0Var) {
            if (qVar == null) {
                f(1);
            }
            if (g0Var == null) {
                f(2);
            }
        }

        @Override // V7.j
        public void b(InterfaceC1830n interfaceC1830n, Z z10) {
            if (interfaceC1830n == null) {
                f(5);
            }
            if (z10 == null) {
                f(6);
            }
        }

        @Override // V7.j
        public void c(InterfaceC1828l interfaceC1828l, InterfaceC1287l interfaceC1287l) {
            if (interfaceC1828l == null) {
                f(3);
            }
            if (interfaceC1287l == null) {
                f(4);
            }
        }

        @Override // V7.j
        public void d(InterfaceC1823g interfaceC1823g, InterfaceC1280e interfaceC1280e) {
            if (interfaceC1823g == null) {
                f(7);
            }
            if (interfaceC1280e == null) {
                f(8);
            }
        }

        @Override // V7.j
        public InterfaceC1280e e(k8.c cVar) {
            if (cVar != null) {
                return null;
            }
            f(0);
            return null;
        }
    }

    void a(q qVar, g0 g0Var);

    void b(InterfaceC1830n interfaceC1830n, Z z10);

    void c(InterfaceC1828l interfaceC1828l, InterfaceC1287l interfaceC1287l);

    void d(InterfaceC1823g interfaceC1823g, InterfaceC1280e interfaceC1280e);

    InterfaceC1280e e(k8.c cVar);
}
