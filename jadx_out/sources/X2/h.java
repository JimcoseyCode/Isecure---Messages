package X2;

import java.util.Arrays;
import k2.AbstractC2824b;
import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.H;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public final class h {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f12449c = new a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final h f12450d = new h(-1, false);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final h f12451e = new h(-2, false);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final h f12452f = new h(-1, true);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f12453a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f12454b;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final h a() {
            return h.f12450d;
        }

        public final h b() {
            return h.f12451e;
        }

        private a() {
        }
    }

    private h(int i10, boolean z10) {
        this.f12453a = i10;
        this.f12454b = z10;
    }

    public static final h c() {
        return f12449c.a();
    }

    public static final h e() {
        return f12449c.b();
    }

    public final boolean d() {
        return this.f12454b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return this.f12453a == hVar.f12453a && this.f12454b == hVar.f12454b;
    }

    public final int f() {
        if (h()) {
            throw new IllegalStateException("Rotation is set to use EXIF");
        }
        return this.f12453a;
    }

    public final boolean g() {
        return this.f12453a != -2;
    }

    public final boolean h() {
        return this.f12453a == -1;
    }

    public int hashCode() {
        return AbstractC2824b.b(Integer.valueOf(this.f12453a), Boolean.valueOf(this.f12454b));
    }

    public String toString() {
        H h10 = H.f29375a;
        String str = String.format(null, "%d defer:%b", Arrays.copyOf(new Object[]{Integer.valueOf(this.f12453a), Boolean.valueOf(this.f12454b)}, 2));
        AbstractC2855l.f(str, "format(...)");
        return str;
    }
}
