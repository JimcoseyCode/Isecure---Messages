package H;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f3619a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f3620b;

    m(long j10, long j11) {
        this.f3619a = j10;
        this.f3620b = j11;
    }

    long a() {
        return this.f3620b;
    }

    long b() {
        return this.f3619a;
    }

    public String toString() {
        return this.f3619a + "/" + this.f3620b;
    }

    m(double d10) {
        this((long) (d10 * 10000.0d), 10000L);
    }
}
