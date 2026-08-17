package q7;

import j7.AbstractC2793j;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import kotlin.jvm.internal.AbstractC2855l;
import z7.AbstractC3691c;
import z7.C3690b;

/* JADX INFO: renamed from: q7.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC3128a {

    /* JADX INFO: renamed from: q7.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    private static final class C0348a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C0348a f30864a = new C0348a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final Method f30865b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final Method f30866c;

        static {
            Method method;
            Method method2;
            Method[] methods = Throwable.class.getMethods();
            AbstractC2855l.d(methods);
            int length = methods.length;
            int i10 = 0;
            int i11 = 0;
            while (true) {
                method = null;
                if (i11 >= length) {
                    method2 = null;
                    break;
                }
                method2 = methods[i11];
                if (AbstractC2855l.b(method2.getName(), "addSuppressed")) {
                    Class<?>[] parameterTypes = method2.getParameterTypes();
                    AbstractC2855l.f(parameterTypes, "getParameterTypes(...)");
                    if (AbstractC2855l.b(AbstractC2793j.j0(parameterTypes), Throwable.class)) {
                        break;
                    }
                }
                i11++;
            }
            f30865b = method2;
            int length2 = methods.length;
            while (true) {
                if (i10 >= length2) {
                    break;
                }
                Method method3 = methods[i10];
                if (AbstractC2855l.b(method3.getName(), "getSuppressed")) {
                    method = method3;
                    break;
                }
                i10++;
            }
            f30866c = method;
        }

        private C0348a() {
        }
    }

    public void a(Throwable cause, Throwable exception) throws IllegalAccessException, InvocationTargetException {
        AbstractC2855l.g(cause, "cause");
        AbstractC2855l.g(exception, "exception");
        Method method = C0348a.f30865b;
        if (method != null) {
            method.invoke(cause, exception);
        }
    }

    public AbstractC3691c b() {
        return new C3690b();
    }
}
