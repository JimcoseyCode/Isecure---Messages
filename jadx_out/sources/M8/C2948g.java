package m8;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import m8.AbstractC2950i;

/* JADX INFO: renamed from: m8.g, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public class C2948g {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final C2948g f29664b = new C2948g(true);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map f29665a;

    /* JADX INFO: renamed from: m8.g$a */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Object f29666a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f29667b;

        a(Object obj, int i10) {
            this.f29666a = obj;
            this.f29667b = i10;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f29666a == aVar.f29666a && this.f29667b == aVar.f29667b;
        }

        public int hashCode() {
            return (System.identityHashCode(this.f29666a) * 65535) + this.f29667b;
        }
    }

    C2948g() {
        this.f29665a = new HashMap();
    }

    public static C2948g c() {
        return f29664b;
    }

    public static C2948g d() {
        return new C2948g();
    }

    public final void a(AbstractC2950i.f fVar) {
        this.f29665a.put(new a(fVar.b(), fVar.d()), fVar);
    }

    public AbstractC2950i.f b(p pVar, int i10) {
        return (AbstractC2950i.f) this.f29665a.get(new a(pVar, i10));
    }

    private C2948g(boolean z10) {
        this.f29665a = Collections.EMPTY_MAP;
    }
}
