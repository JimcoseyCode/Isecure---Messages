package kotlin.coroutines.jvm.internal;

import java.lang.reflect.Method;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final i f29363a = new i();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final a f29364b = new a(null, null, null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static a f29365c;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Method f29366a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Method f29367b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Method f29368c;

        public a(Method method, Method method2, Method method3) {
            this.f29366a = method;
            this.f29367b = method2;
            this.f29368c = method3;
        }
    }

    private i() {
    }

    private final a a(kotlin.coroutines.jvm.internal.a aVar) {
        try {
            a aVar2 = new a(Class.class.getDeclaredMethod("getModule", null), aVar.getClass().getClassLoader().loadClass("java.lang.Module").getDeclaredMethod("getDescriptor", null), aVar.getClass().getClassLoader().loadClass("java.lang.module.ModuleDescriptor").getDeclaredMethod("name", null));
            f29365c = aVar2;
            return aVar2;
        } catch (Exception unused) {
            a aVar3 = f29364b;
            f29365c = aVar3;
            return aVar3;
        }
    }

    public final String b(kotlin.coroutines.jvm.internal.a continuation) {
        Method method;
        Object objInvoke;
        Method method2;
        Object objInvoke2;
        AbstractC2855l.g(continuation, "continuation");
        a aVarA = f29365c;
        if (aVarA == null) {
            aVarA = a(continuation);
        }
        if (aVarA != f29364b && (method = aVarA.f29366a) != null && (objInvoke = method.invoke(continuation.getClass(), null)) != null && (method2 = aVarA.f29367b) != null && (objInvoke2 = method2.invoke(objInvoke, null)) != null) {
            Method method3 = aVarA.f29368c;
            Object objInvoke3 = method3 != null ? method3.invoke(objInvoke2, null) : null;
            if (objInvoke3 instanceof String) {
                return (String) objInvoke3;
            }
        }
        return null;
    }
}
