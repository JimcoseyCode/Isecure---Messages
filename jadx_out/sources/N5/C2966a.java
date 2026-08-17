package n5;

/* JADX INFO: renamed from: n5.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
final class C2966a extends AbstractC2977l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f30028a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f30029b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f30030c;

    C2966a(long j10, long j11, long j12) {
        this.f30028a = j10;
        this.f30029b = j11;
        this.f30030c = j12;
    }

    @Override // n5.AbstractC2977l
    public long b() {
        return this.f30029b;
    }

    @Override // n5.AbstractC2977l
    public long c() {
        return this.f30028a;
    }

    @Override // n5.AbstractC2977l
    public long d() {
        return this.f30030c;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC2977l) {
            AbstractC2977l abstractC2977l = (AbstractC2977l) obj;
            if (this.f30028a == abstractC2977l.c() && this.f30029b == abstractC2977l.b() && this.f30030c == abstractC2977l.d()) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        long j10 = this.f30028a;
        long j11 = this.f30029b;
        int i10 = (((((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003) ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003;
        long j12 = this.f30030c;
        return i10 ^ ((int) ((j12 >>> 32) ^ j12));
    }

    public String toString() {
        return "StartupTime{epochMillis=" + this.f30028a + ", elapsedRealtime=" + this.f30029b + ", uptimeMillis=" + this.f30030c + "}";
    }
}
