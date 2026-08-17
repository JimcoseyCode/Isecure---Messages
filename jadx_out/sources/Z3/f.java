package Z3;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final f f13599c = new a().a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f13600a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f13601b;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private long f13602a = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private long f13603b = 0;

        a() {
        }

        public f a() {
            return new f(this.f13602a, this.f13603b);
        }

        public a b(long j10) {
            this.f13603b = j10;
            return this;
        }

        public a c(long j10) {
            this.f13602a = j10;
            return this;
        }
    }

    f(long j10, long j11) {
        this.f13600a = j10;
        this.f13601b = j11;
    }

    public static a c() {
        return new a();
    }

    public long a() {
        return this.f13601b;
    }

    public long b() {
        return this.f13600a;
    }
}
