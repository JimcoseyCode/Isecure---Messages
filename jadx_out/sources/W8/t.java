package W8;

import R8.K0;
import java.util.Iterator;
import java.util.List;
import java.util.ServiceLoader;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final t f12207a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final K0 f12208b;

    static {
        t tVar = new t();
        f12207a = tVar;
        F.f("kotlinx.coroutines.fast.service.loader", true);
        f12208b = tVar.a();
    }

    private t() {
    }

    private final K0 a() {
        Object next;
        K0 k0E;
        try {
            List listS = O8.l.S(O8.l.g(ServiceLoader.load(s.class, s.class.getClassLoader()).iterator()));
            Iterator it = listS.iterator();
            if (it.hasNext()) {
                next = it.next();
                if (it.hasNext()) {
                    int iC = ((s) next).c();
                    do {
                        Object next2 = it.next();
                        int iC2 = ((s) next2).c();
                        if (iC < iC2) {
                            next = next2;
                            iC = iC2;
                        }
                    } while (it.hasNext());
                }
            } else {
                next = null;
            }
            s sVar = (s) next;
            if (sVar != null && (k0E = u.e(sVar, listS)) != null) {
                return k0E;
            }
            u.b(null, null, 3, null);
            return null;
        } catch (Throwable th) {
            u.b(th, null, 2, null);
            return null;
        }
    }
}
