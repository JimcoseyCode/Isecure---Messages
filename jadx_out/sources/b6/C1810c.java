package b6;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: b6.c, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public class C1810c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map f18658a = new HashMap();

    /* JADX INFO: renamed from: b6.c$a */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Class f18659a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final C5.b f18660b;

        public a(Class cls, C5.b bVar) {
            this.f18659a = cls;
            this.f18660b = bVar;
        }

        final C5.b a() {
            return this.f18660b;
        }

        final Class b() {
            return this.f18659a;
        }
    }

    public C1810c(Set set) {
        Iterator it = set.iterator();
        while (it.hasNext()) {
            a aVar = (a) it.next();
            this.f18658a.put(aVar.b(), aVar.a());
        }
    }
}
