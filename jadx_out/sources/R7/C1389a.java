package R7;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: renamed from: R7.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
final class C1389a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C1389a f10061a = new C1389a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static C0106a f10062b;

    /* JADX INFO: renamed from: R7.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class C0106a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Method f10063a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Method f10064b;

        public C0106a(Method method, Method method2) {
            this.f10063a = method;
            this.f10064b = method2;
        }

        public final Method a() {
            return this.f10064b;
        }

        public final Method b() {
            return this.f10063a;
        }
    }

    private C1389a() {
    }

    private final C0106a a(Object obj) {
        Class<?> cls = obj.getClass();
        try {
            return new C0106a(cls.getMethod("getType", null), cls.getMethod("getAccessor", null));
        } catch (NoSuchMethodException unused) {
            return new C0106a(null, null);
        }
    }

    private final C0106a b(Object obj) {
        C0106a c0106a = f10062b;
        if (c0106a != null) {
            return c0106a;
        }
        C0106a c0106aA = a(obj);
        f10062b = c0106aA;
        return c0106aA;
    }

    public final Method c(Object recordComponent) throws IllegalAccessException, InvocationTargetException {
        AbstractC2855l.g(recordComponent, "recordComponent");
        Method methodA = b(recordComponent).a();
        if (methodA == null) {
            return null;
        }
        Object objInvoke = methodA.invoke(recordComponent, null);
        AbstractC2855l.e(objInvoke, "null cannot be cast to non-null type java.lang.reflect.Method");
        return (Method) objInvoke;
    }

    public final Class d(Object recordComponent) throws IllegalAccessException, InvocationTargetException {
        AbstractC2855l.g(recordComponent, "recordComponent");
        Method methodB = b(recordComponent).b();
        if (methodB == null) {
            return null;
        }
        Object objInvoke = methodB.invoke(recordComponent, null);
        AbstractC2855l.e(objInvoke, "null cannot be cast to non-null type java.lang.Class<*>");
        return (Class) objInvoke;
    }
}
