package Z3;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final e f13594c = new a().a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f13595a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f13596b;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private long f13597a = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private long f13598b = 0;

        a() {
        }

        public e a() {
            return new e(this.f13597a, this.f13598b);
        }

        public a b(long j10) {
            this.f13597a = j10;
            return this;
        }

        public a c(long j10) {
            this.f13598b = j10;
            return this;
        }
    }

    e(long j10, long j11) {
        this.f13595a = j10;
        this.f13596b = j11;
    }

    public static a c() {
        return new a();
    }

    public long a() {
        return this.f13595a;
    }

    public long b() {
        return this.f13596b;
    }
}
