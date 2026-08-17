package U7;

import i7.C2744g;
import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class C {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f11373d = new a(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final C f11374e = new C(O.f11454k, null, null, 6, null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final O f11375a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C2744g f11376b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final O f11377c;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final C a() {
            return C.f11374e;
        }

        private a() {
        }
    }

    public C(O reportLevelBefore, C2744g c2744g, O reportLevelAfter) {
        AbstractC2855l.g(reportLevelBefore, "reportLevelBefore");
        AbstractC2855l.g(reportLevelAfter, "reportLevelAfter");
        this.f11375a = reportLevelBefore;
        this.f11376b = c2744g;
        this.f11377c = reportLevelAfter;
    }

    public final O b() {
        return this.f11377c;
    }

    public final O c() {
        return this.f11375a;
    }

    public final C2744g d() {
        return this.f11376b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C)) {
            return false;
        }
        C c10 = (C) obj;
        return this.f11375a == c10.f11375a && AbstractC2855l.b(this.f11376b, c10.f11376b) && this.f11377c == c10.f11377c;
    }

    public int hashCode() {
        int iHashCode = this.f11375a.hashCode() * 31;
        C2744g c2744g = this.f11376b;
        return ((iHashCode + (c2744g == null ? 0 : c2744g.hashCode())) * 31) + this.f11377c.hashCode();
    }

    public String toString() {
        return "JavaNullabilityAnnotationsStatus(reportLevelBefore=" + this.f11375a + ", sinceVersion=" + this.f11376b + ", reportLevelAfter=" + this.f11377c + ')';
    }

    public /* synthetic */ C(O o10, C2744g c2744g, O o11, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(o10, (i10 & 2) != 0 ? new C2744g(1, 0) : c2744g, (i10 & 4) != 0 ? o10 : o11);
    }
}
