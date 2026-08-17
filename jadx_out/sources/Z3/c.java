package Z3;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final c f13575c = new a().a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f13576a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final b f13577b;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private long f13578a = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private b f13579b = b.REASON_UNKNOWN;

        a() {
        }

        public c a() {
            return new c(this.f13578a, this.f13579b);
        }

        public a b(long j10) {
            this.f13578a = j10;
            return this;
        }

        public a c(b bVar) {
            this.f13579b = bVar;
            return this;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public enum b implements y5.c {
        REASON_UNKNOWN(0),
        MESSAGE_TOO_OLD(1),
        CACHE_FULL(2),
        PAYLOAD_TOO_BIG(3),
        MAX_RETRIES_REACHED(4),
        INVALID_PAYLOD(5),
        SERVER_ERROR(6);


        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final int f13588g;

        b(int i10) {
            this.f13588g = i10;
        }

        @Override // y5.c
        public int a() {
            return this.f13588g;
        }
    }

    c(long j10, b bVar) {
        this.f13576a = j10;
        this.f13577b = bVar;
    }

    public static a c() {
        return new a();
    }

    public long a() {
        return this.f13576a;
    }

    public b b() {
        return this.f13577b;
    }
}
