package R8;

import W8.C1506i;
import i7.AbstractC2753p;
import i7.C2752o;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class S {
    public static final String a(Object obj) {
        return obj.getClass().getSimpleName();
    }

    public static final String b(Object obj) {
        return Integer.toHexString(System.identityHashCode(obj));
    }

    public static final String c(n7.f fVar) {
        Object objB;
        if (fVar instanceof C1506i) {
            return ((C1506i) fVar).toString();
        }
        try {
            C2752o.a aVar = C2752o.f28721h;
            objB = C2752o.b(fVar + '@' + b(fVar));
        } catch (Throwable th) {
            C2752o.a aVar2 = C2752o.f28721h;
            objB = C2752o.b(AbstractC2753p.a(th));
        }
        if (C2752o.d(objB) != null) {
            objB = fVar.getClass().getName() + '@' + b(fVar);
        }
        return (String) objB;
    }
}
