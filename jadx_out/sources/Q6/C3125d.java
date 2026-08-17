package q6;

/* JADX INFO: renamed from: q6.d, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class C3125d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f30838a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final double f30839b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final double f30840c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final double f30841d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final double f30842e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f30843f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int f30844g;

    public C3125d(int i10, double d10, double d11, double d12, double d13, int i11, int i12) {
        this.f30838a = i10;
        this.f30839b = d10;
        this.f30840c = d11;
        this.f30841d = d12;
        this.f30842e = d13;
        this.f30843f = i11;
        this.f30844g = i12;
    }

    public final int a() {
        return this.f30844g;
    }

    public final double b() {
        return this.f30841d;
    }

    public final double c() {
        return this.f30842e;
    }

    public final int d() {
        return this.f30843f;
    }

    public final double e() {
        return this.f30839b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3125d)) {
            return false;
        }
        C3125d c3125d = (C3125d) obj;
        return this.f30838a == c3125d.f30838a && Double.compare(this.f30839b, c3125d.f30839b) == 0 && Double.compare(this.f30840c, c3125d.f30840c) == 0 && Double.compare(this.f30841d, c3125d.f30841d) == 0 && Double.compare(this.f30842e, c3125d.f30842e) == 0 && this.f30843f == c3125d.f30843f && this.f30844g == c3125d.f30844g;
    }

    public final double f() {
        return this.f30840c;
    }

    public final int g() {
        return this.f30838a;
    }

    public int hashCode() {
        return (((((((((((Integer.hashCode(this.f30838a) * 31) + Double.hashCode(this.f30839b)) * 31) + Double.hashCode(this.f30840c)) * 31) + Double.hashCode(this.f30841d)) * 31) + Double.hashCode(this.f30842e)) * 31) + Integer.hashCode(this.f30843f)) * 31) + Integer.hashCode(this.f30844g);
    }

    public String toString() {
        return "FocusedInputSelectionChangedEventData(target=" + this.f30838a + ", startX=" + this.f30839b + ", startY=" + this.f30840c + ", endX=" + this.f30841d + ", endY=" + this.f30842e + ", start=" + this.f30843f + ", end=" + this.f30844g + ")";
    }
}
