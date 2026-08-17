package R8;

import i7.AbstractC2753p;
import i7.C2752o;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class D {
    public static final Object a(Object obj, n7.f fVar) {
        if (!(obj instanceof B)) {
            return C2752o.b(obj);
        }
        C2752o.a aVar = C2752o.f28721h;
        return C2752o.b(AbstractC2753p.a(((B) obj).f10115a));
    }

    public static final Object b(Object obj) {
        Throwable thD = C2752o.d(obj);
        return thD == null ? obj : new B(thD, false, 2, null);
    }

    public static final Object c(Object obj, InterfaceC1421m interfaceC1421m) {
        Throwable thD = C2752o.d(obj);
        return thD == null ? obj : new B(thD, false, 2, null);
    }
}
