package i7;

import java.io.Serializable;
import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: i7.o, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class C2752o implements Serializable {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final a f28721h = new a(null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Object f28722g;

    /* JADX INFO: renamed from: i7.o$a */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* JADX INFO: renamed from: i7.o$b */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class b implements Serializable {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final Throwable f28723g;

        public b(Throwable exception) {
            AbstractC2855l.g(exception, "exception");
            this.f28723g = exception;
        }

        public boolean equals(Object obj) {
            return (obj instanceof b) && AbstractC2855l.b(this.f28723g, ((b) obj).f28723g);
        }

        public int hashCode() {
            return this.f28723g.hashCode();
        }

        public String toString() {
            return "Failure(" + this.f28723g + ')';
        }
    }

    private /* synthetic */ C2752o(Object obj) {
        this.f28722g = obj;
    }

    public static final /* synthetic */ C2752o a(Object obj) {
        return new C2752o(obj);
    }

    public static boolean c(Object obj, Object obj2) {
        return (obj2 instanceof C2752o) && AbstractC2855l.b(obj, ((C2752o) obj2).i());
    }

    public static final Throwable d(Object obj) {
        if (obj instanceof b) {
            return ((b) obj).f28723g;
        }
        return null;
    }

    public static int e(Object obj) {
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public static final boolean f(Object obj) {
        return obj instanceof b;
    }

    public static final boolean g(Object obj) {
        return !(obj instanceof b);
    }

    public static String h(Object obj) {
        if (obj instanceof b) {
            return ((b) obj).toString();
        }
        return "Success(" + obj + ')';
    }

    public boolean equals(Object obj) {
        return c(this.f28722g, obj);
    }

    public int hashCode() {
        return e(this.f28722g);
    }

    public final /* synthetic */ Object i() {
        return this.f28722g;
    }

    public String toString() {
        return h(this.f28722g);
    }

    public static Object b(Object obj) {
        return obj;
    }
}
