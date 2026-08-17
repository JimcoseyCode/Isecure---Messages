package L1;

import java.util.ArrayList;
import java.util.List;
import v1.k;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f7223a = new ArrayList();

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Class f7224a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final k f7225b;

        a(Class cls, k kVar) {
            this.f7224a = cls;
            this.f7225b = kVar;
        }

        boolean a(Class cls) {
            return this.f7224a.isAssignableFrom(cls);
        }
    }

    public synchronized void a(Class cls, k kVar) {
        this.f7223a.add(new a(cls, kVar));
    }

    public synchronized k b(Class cls) {
        int size = this.f7223a.size();
        for (int i10 = 0; i10 < size; i10++) {
            a aVar = (a) this.f7223a.get(i10);
            if (aVar.a(cls)) {
                return aVar.f7225b;
            }
        }
        return null;
    }
}
