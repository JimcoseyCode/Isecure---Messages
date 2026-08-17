package R0;

import j7.K;
import java.util.Map;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public abstract class f {

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f9948a;

        public a(String name) {
            AbstractC2855l.g(name, "name");
            this.f9948a = name;
        }

        public final String a() {
            return this.f9948a;
        }

        public boolean equals(Object obj) {
            if (obj instanceof a) {
                return AbstractC2855l.b(this.f9948a, ((a) obj).f9948a);
            }
            return false;
        }

        public int hashCode() {
            return this.f9948a.hashCode();
        }

        public String toString() {
            return this.f9948a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class b {
    }

    public abstract Map a();

    public abstract Object b(a aVar);

    public final c c() {
        return new c(K.w(a()), false);
    }

    public final f d() {
        return new c(K.w(a()), true);
    }
}
