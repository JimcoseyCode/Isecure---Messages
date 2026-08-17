package androidx.appcompat.app;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
class y {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static y f14183d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f14184a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f14185b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f14186c;

    y() {
    }

    static y b() {
        if (f14183d == null) {
            f14183d = new y();
        }
        return f14183d;
    }

    public void a(long j10, double d10, double d11) {
        double d12 = (0.01720197f * ((j10 - 946728000000L) / 8.64E7f)) + 6.24006f;
        double dSin = (Math.sin(d12) * 0.03341960161924362d) + d12 + (Math.sin(2.0f * r3) * 3.4906598739326E-4d) + (Math.sin(r3 * 3.0f) * 5.236000106378924E-6d) + 1.796593063d + 3.141592653589793d;
        double dRound = ((double) (Math.round(((double) (r2 - 9.0E-4f)) - r6) + 9.0E-4f)) + ((-d11) / 360.0d) + (Math.sin(d12) * 0.0053d) + (Math.sin(2.0d * dSin) * (-0.0069d));
        double dAsin = Math.asin(Math.sin(dSin) * Math.sin(0.4092797040939331d));
        double d13 = 0.01745329238474369d * d10;
        double dSin2 = (Math.sin(-0.10471975803375244d) - (Math.sin(d13) * Math.sin(dAsin))) / (Math.cos(d13) * Math.cos(dAsin));
        if (dSin2 >= 1.0d) {
            this.f14186c = 1;
            this.f14184a = -1L;
            this.f14185b = -1L;
        } else {
            if (dSin2 <= -1.0d) {
                this.f14186c = 0;
                this.f14184a = -1L;
                this.f14185b = -1L;
                return;
            }
            double dAcos = (float) (Math.acos(dSin2) / 6.283185307179586d);
            this.f14184a = Math.round((dRound + dAcos) * 8.64E7d) + 946728000000L;
            long jRound = Math.round((dRound - dAcos) * 8.64E7d) + 946728000000L;
            this.f14185b = jRound;
            if (jRound >= j10 || this.f14184a <= j10) {
                this.f14186c = 1;
            } else {
                this.f14186c = 0;
            }
        }
    }
}
