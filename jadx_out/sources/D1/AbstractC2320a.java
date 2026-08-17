package d1;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: d1.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2320a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C0246a f25549b = new C0246a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map f25550a = new LinkedHashMap();

    /* JADX INFO: renamed from: d1.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class C0246a {
        public /* synthetic */ C0246a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C0246a() {
        }
    }

    /* JADX INFO: renamed from: d1.a$b */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class b extends AbstractC2320a {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final b f25551c = new b();

        private b() {
        }

        @Override // d1.AbstractC2320a
        public Object a(c key) {
            AbstractC2855l.g(key, "key");
            return null;
        }
    }

    /* JADX INFO: renamed from: d1.a$c */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public interface c {
    }

    public abstract Object a(c cVar);

    public final Map b() {
        return this.f25550a;
    }

    public boolean equals(Object obj) {
        return (obj instanceof AbstractC2320a) && AbstractC2855l.b(this.f25550a, ((AbstractC2320a) obj).f25550a);
    }

    public int hashCode() {
        return this.f25550a.hashCode();
    }

    public String toString() {
        return "CreationExtras(extras=" + this.f25550a + ')';
    }
}
