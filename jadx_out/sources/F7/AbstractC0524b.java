package F7;

import i7.AbstractC2753p;
import i7.C2752o;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: renamed from: F7.b, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC0524b {
    static {
        Object objB;
        try {
            C2752o.a aVar = C2752o.f28721h;
            objB = C2752o.b(Class.forName("java.lang.ClassValue"));
        } catch (Throwable th) {
            C2752o.a aVar2 = C2752o.f28721h;
            objB = C2752o.b(AbstractC2753p.a(th));
        }
        if (C2752o.g(objB)) {
            objB = Boolean.TRUE;
        }
        Object objB2 = C2752o.b(objB);
        Boolean bool = Boolean.FALSE;
        if (C2752o.f(objB2)) {
            objB2 = bool;
        }
        ((Boolean) objB2).getClass();
    }

    public static final AbstractC0522a a(Function1 compute) {
        AbstractC2855l.g(compute, "compute");
        return new C0538i(compute);
    }
}
