package Q7;

import R7.AbstractC1394f;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Iterator;
import kotlin.jvm.internal.AbstractC2845b;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final m f9878a = new m();

    private m() {
    }

    public final String a(Constructor constructor) {
        AbstractC2855l.g(constructor, "constructor");
        StringBuilder sb = new StringBuilder();
        sb.append("(");
        Iterator itA = AbstractC2845b.a(constructor.getParameterTypes());
        while (itA.hasNext()) {
            Class cls = (Class) itA.next();
            AbstractC2855l.d(cls);
            sb.append(AbstractC1394f.f(cls));
        }
        sb.append(")V");
        String string = sb.toString();
        AbstractC2855l.f(string, "toString(...)");
        return string;
    }

    public final String b(Field field) {
        AbstractC2855l.g(field, "field");
        Class<?> type = field.getType();
        AbstractC2855l.f(type, "getType(...)");
        return AbstractC1394f.f(type);
    }

    public final String c(Method method) {
        AbstractC2855l.g(method, "method");
        StringBuilder sb = new StringBuilder();
        sb.append("(");
        Iterator itA = AbstractC2845b.a(method.getParameterTypes());
        while (itA.hasNext()) {
            Class cls = (Class) itA.next();
            AbstractC2855l.d(cls);
            sb.append(AbstractC1394f.f(cls));
        }
        sb.append(")");
        Class<?> returnType = method.getReturnType();
        AbstractC2855l.f(returnType, "getReturnType(...)");
        sb.append(AbstractC1394f.f(returnType));
        String string = sb.toString();
        AbstractC2855l.f(string, "toString(...)");
        return string;
    }
}
