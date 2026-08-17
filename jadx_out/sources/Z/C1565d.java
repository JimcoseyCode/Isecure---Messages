package Z;

/* JADX INFO: renamed from: Z.d, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
final class C1565d extends AbstractC1563b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f13349b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final double f13350c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final long f13351d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Throwable f13352e;

    C1565d(int i10, double d10, long j10, Throwable th) {
        this.f13349b = i10;
        this.f13350c = d10;
        this.f13351d = j10;
        this.f13352e = th;
    }

    @Override // Z.AbstractC1563b
    double a() {
        return this.f13350c;
    }

    @Override // Z.AbstractC1563b
    public long b() {
        return this.f13351d;
    }

    @Override // Z.AbstractC1563b
    public int c() {
        return this.f13349b;
    }

    @Override // Z.AbstractC1563b
    public Throwable d() {
        return this.f13352e;
    }

    public boolean equals(Object obj) {
        Throwable th;
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC1563b) {
            AbstractC1563b abstractC1563b = (AbstractC1563b) obj;
            if (this.f13349b == abstractC1563b.c() && Double.doubleToLongBits(this.f13350c) == Double.doubleToLongBits(abstractC1563b.a()) && this.f13351d == abstractC1563b.b() && ((th = this.f13352e) != null ? th.equals(abstractC1563b.d()) : abstractC1563b.d() == null)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int iDoubleToLongBits = (((this.f13349b ^ 1000003) * 1000003) ^ ((int) ((Double.doubleToLongBits(this.f13350c) >>> 32) ^ Double.doubleToLongBits(this.f13350c)))) * 1000003;
        long j10 = this.f13351d;
        int i10 = (iDoubleToLongBits ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003;
        Throwable th = this.f13352e;
        return i10 ^ (th == null ? 0 : th.hashCode());
    }

    public String toString() {
        return "AudioStats{audioState=" + this.f13349b + ", audioAmplitudeInternal=" + this.f13350c + ", audioBytesRecorded=" + this.f13351d + ", errorCause=" + this.f13352e + "}";
    }
}
