package F7;

import java.lang.ref.SoftReference;
import w7.InterfaceC3487a;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class a1 {

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static class a extends b implements InterfaceC3487a {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private final InterfaceC3487a f2022h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private volatile SoftReference f2023i;

        public a(Object obj, InterfaceC3487a interfaceC3487a) {
            if (interfaceC3487a == null) {
                f(0);
            }
            this.f2023i = null;
            this.f2022h = interfaceC3487a;
            if (obj != null) {
                this.f2023i = new SoftReference(a(obj));
            }
        }

        private static /* synthetic */ void f(int i10) {
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "initializer", "kotlin/reflect/jvm/internal/ReflectProperties$LazySoftVal", "<init>"));
        }

        @Override // F7.a1.b, w7.InterfaceC3487a
        public Object invoke() {
            Object obj;
            SoftReference softReference = this.f2023i;
            if (softReference != null && (obj = softReference.get()) != null) {
                return d(obj);
            }
            Object objInvoke = this.f2022h.invoke();
            this.f2023i = new SoftReference(a(objInvoke));
            return objInvoke;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static abstract class b {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private static final Object f2024g = new a();

        /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
        static class a {
            a() {
            }
        }

        protected Object a(Object obj) {
            return obj == null ? f2024g : obj;
        }

        public final Object c(Object obj, Object obj2) {
            return invoke();
        }

        protected Object d(Object obj) {
            if (obj == f2024g) {
                return null;
            }
            return obj;
        }

        public abstract Object invoke();
    }

    private static /* synthetic */ void a(int i10) {
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "initializer", "kotlin/reflect/jvm/internal/ReflectProperties", "lazySoft"));
    }

    public static a b(Object obj, InterfaceC3487a interfaceC3487a) {
        if (interfaceC3487a == null) {
            a(0);
        }
        return new a(obj, interfaceC3487a);
    }

    public static a c(InterfaceC3487a interfaceC3487a) {
        if (interfaceC3487a == null) {
            a(1);
        }
        return b(null, interfaceC3487a);
    }
}
