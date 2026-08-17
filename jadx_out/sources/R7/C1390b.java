package R7;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: renamed from: R7.b, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
final class C1390b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C1390b f10065a = new C1390b();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static a f10066b;

    /* JADX INFO: renamed from: R7.b$a */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Method f10067a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Method f10068b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Method f10069c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final Method f10070d;

        public a(Method method, Method method2, Method method3, Method method4) {
            this.f10067a = method;
            this.f10068b = method2;
            this.f10069c = method3;
            this.f10070d = method4;
        }

        public final Method a() {
            return this.f10068b;
        }

        public final Method b() {
            return this.f10070d;
        }

        public final Method c() {
            return this.f10069c;
        }

        public final Method d() {
            return this.f10067a;
        }
    }

    private C1390b() {
    }

    private final a a() {
        try {
            return new a(Class.class.getMethod("isSealed", null), Class.class.getMethod("getPermittedSubclasses", null), Class.class.getMethod("isRecord", null), Class.class.getMethod("getRecordComponents", null));
        } catch (NoSuchMethodException unused) {
            return new a(null, null, null, null);
        }
    }

    private final a b() {
        a aVar = f10066b;
        if (aVar != null) {
            return aVar;
        }
        a aVarA = a();
        f10066b = aVarA;
        return aVarA;
    }

    public final Class[] c(Class clazz) throws IllegalAccessException, InvocationTargetException {
        AbstractC2855l.g(clazz, "clazz");
        Method methodA = b().a();
        if (methodA == null) {
            return null;
        }
        Object objInvoke = methodA.invoke(clazz, null);
        AbstractC2855l.e(objInvoke, "null cannot be cast to non-null type kotlin.Array<java.lang.Class<*>>");
        return (Class[]) objInvoke;
    }

    public final Object[] d(Class clazz) {
        AbstractC2855l.g(clazz, "clazz");
        Method methodB = b().b();
        if (methodB == null) {
            return null;
        }
        return (Object[]) methodB.invoke(clazz, null);
    }

    public final Boolean e(Class clazz) throws IllegalAccessException, InvocationTargetException {
        AbstractC2855l.g(clazz, "clazz");
        Method methodC = b().c();
        if (methodC == null) {
            return null;
        }
        Object objInvoke = methodC.invoke(clazz, null);
        AbstractC2855l.e(objInvoke, "null cannot be cast to non-null type kotlin.Boolean");
        return (Boolean) objInvoke;
    }

    public final Boolean f(Class clazz) throws IllegalAccessException, InvocationTargetException {
        AbstractC2855l.g(clazz, "clazz");
        Method methodD = b().d();
        if (methodD == null) {
            return null;
        }
        Object objInvoke = methodD.invoke(clazz, null);
        AbstractC2855l.e(objInvoke, "null cannot be cast to non-null type kotlin.Boolean");
        return (Boolean) objInvoke;
    }
}
