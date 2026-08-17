package i7;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class x implements Comparable {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final a f28739h = new a(null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final long f28740g;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    private /* synthetic */ x(long j10) {
        this.f28740g = j10;
    }

    public static final /* synthetic */ x h(long j10) {
        return new x(j10);
    }

    public static boolean k(long j10, Object obj) {
        return (obj instanceof x) && j10 == ((x) obj).q();
    }

    public static int m(long j10) {
        return Long.hashCode(j10);
    }

    public static String p(long j10) {
        return AbstractC2737D.c(j10, 10);
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return AbstractC2737D.b(q(), ((x) obj).q());
    }

    public boolean equals(Object obj) {
        return k(this.f28740g, obj);
    }

    public int hashCode() {
        return m(this.f28740g);
    }

    public final /* synthetic */ long q() {
        return this.f28740g;
    }

    public String toString() {
        return p(this.f28740g);
    }

    public static long j(long j10) {
        return j10;
    }
}
