package Z;

/* JADX INFO: renamed from: Z.l, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
final class C1573l extends c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f13404a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f13405b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final AbstractC1563b f13406c;

    C1573l(long j10, long j11, AbstractC1563b abstractC1563b) {
        this.f13404a = j10;
        this.f13405b = j11;
        if (abstractC1563b == null) {
            throw new NullPointerException("Null audioStats");
        }
        this.f13406c = abstractC1563b;
    }

    @Override // Z.c0
    public AbstractC1563b a() {
        return this.f13406c;
    }

    @Override // Z.c0
    public long b() {
        return this.f13405b;
    }

    @Override // Z.c0
    public long c() {
        return this.f13404a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof c0) {
            c0 c0Var = (c0) obj;
            if (this.f13404a == c0Var.c() && this.f13405b == c0Var.b() && this.f13406c.equals(c0Var.a())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        long j10 = this.f13404a;
        int i10 = (((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003;
        long j11 = this.f13405b;
        return ((i10 ^ ((int) ((j11 >>> 32) ^ j11))) * 1000003) ^ this.f13406c.hashCode();
    }

    public String toString() {
        return "RecordingStats{recordedDurationNanos=" + this.f13404a + ", numBytesRecorded=" + this.f13405b + ", audioStats=" + this.f13406c + "}";
    }
}
