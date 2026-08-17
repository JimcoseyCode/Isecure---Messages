package u6;

/* JADX INFO: renamed from: u6.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class C3404a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final double f32678a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final double f32679b;

    public C3404a(double d10, double d11) {
        this.f32678a = d10;
        this.f32679b = d11;
    }

    public final double a() {
        return this.f32679b;
    }

    public final double b() {
        return this.f32678a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3404a)) {
            return false;
        }
        C3404a c3404a = (C3404a) obj;
        return Double.compare(this.f32678a, c3404a.f32678a) == 0 && Double.compare(this.f32679b, c3404a.f32679b) == 0;
    }

    public int hashCode() {
        return (Double.hashCode(this.f32678a) * 31) + Double.hashCode(this.f32679b);
    }

    public String toString() {
        return "Dimensions(width=" + this.f32678a + ", height=" + this.f32679b + ")";
    }
}
