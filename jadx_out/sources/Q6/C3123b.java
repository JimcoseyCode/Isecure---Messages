package q6;

/* JADX INFO: renamed from: q6.b, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class C3123b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final double f30828a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final double f30829b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final double f30830c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final double f30831d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final double f30832e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final double f30833f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int f30834g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final int f30835h;

    public C3123b(double d10, double d11, double d12, double d13, double d14, double d15, int i10, int i11) {
        this.f30828a = d10;
        this.f30829b = d11;
        this.f30830c = d12;
        this.f30831d = d13;
        this.f30832e = d14;
        this.f30833f = d15;
        this.f30834g = i10;
        this.f30835h = i11;
    }

    public final double a() {
        return this.f30832e;
    }

    public final double b() {
        return this.f30833f;
    }

    public final double c() {
        return this.f30831d;
    }

    public final int d() {
        return this.f30835h;
    }

    public final int e() {
        return this.f30834g;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3123b)) {
            return false;
        }
        C3123b c3123b = (C3123b) obj;
        return Double.compare(this.f30828a, c3123b.f30828a) == 0 && Double.compare(this.f30829b, c3123b.f30829b) == 0 && Double.compare(this.f30830c, c3123b.f30830c) == 0 && Double.compare(this.f30831d, c3123b.f30831d) == 0 && Double.compare(this.f30832e, c3123b.f30832e) == 0 && Double.compare(this.f30833f, c3123b.f30833f) == 0 && this.f30834g == c3123b.f30834g && this.f30835h == c3123b.f30835h;
    }

    public final double f() {
        return this.f30830c;
    }

    public final double g() {
        return this.f30828a;
    }

    public final double h() {
        return this.f30829b;
    }

    public int hashCode() {
        return (((((((((((((Double.hashCode(this.f30828a) * 31) + Double.hashCode(this.f30829b)) * 31) + Double.hashCode(this.f30830c)) * 31) + Double.hashCode(this.f30831d)) * 31) + Double.hashCode(this.f30832e)) * 31) + Double.hashCode(this.f30833f)) * 31) + Integer.hashCode(this.f30834g)) * 31) + Integer.hashCode(this.f30835h);
    }

    public String toString() {
        return "FocusedInputLayoutChangedEventData(x=" + this.f30828a + ", y=" + this.f30829b + ", width=" + this.f30830c + ", height=" + this.f30831d + ", absoluteX=" + this.f30832e + ", absoluteY=" + this.f30833f + ", target=" + this.f30834g + ", parentScrollViewTarget=" + this.f30835h + ")";
    }
}
