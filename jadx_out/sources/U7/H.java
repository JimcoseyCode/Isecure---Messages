package U7;

import k8.b;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class H {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final H f11391a = new H();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final k8.c f11392b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final k8.b f11393c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final k8.b f11394d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final k8.b f11395e;

    static {
        k8.c cVar = new k8.c("kotlin.jvm.JvmField");
        f11392b = cVar;
        b.a aVar = k8.b.f29200d;
        f11393c = aVar.c(cVar);
        f11394d = aVar.c(new k8.c("kotlin.reflect.jvm.internal.ReflectionFactoryImpl"));
        f11395e = b.a.b(aVar, "kotlin/jvm/internal/RepeatableContainer", false, 2, null);
    }

    private H() {
    }

    public static final String b(String propertyName) {
        AbstractC2855l.g(propertyName, "propertyName");
        if (f(propertyName)) {
            return propertyName;
        }
        return "get" + K8.a.a(propertyName);
    }

    public static final boolean c(String name) {
        AbstractC2855l.g(name, "name");
        return P8.q.K(name, "get", false, 2, null) || P8.q.K(name, "is", false, 2, null);
    }

    public static final boolean d(String name) {
        AbstractC2855l.g(name, "name");
        return P8.q.K(name, "set", false, 2, null);
    }

    public static final String e(String propertyName) {
        String strA;
        AbstractC2855l.g(propertyName, "propertyName");
        StringBuilder sb = new StringBuilder();
        sb.append("set");
        if (f(propertyName)) {
            strA = propertyName.substring(2);
            AbstractC2855l.f(strA, "substring(...)");
        } else {
            strA = K8.a.a(propertyName);
        }
        sb.append(strA);
        return sb.toString();
    }

    public static final boolean f(String name) {
        AbstractC2855l.g(name, "name");
        if (!P8.q.K(name, "is", false, 2, null) || name.length() == 2) {
            return false;
        }
        char cCharAt = name.charAt(2);
        return AbstractC2855l.i(97, cCharAt) > 0 || AbstractC2855l.i(cCharAt, 122) > 0;
    }

    public final k8.b a() {
        return f11395e;
    }
}
