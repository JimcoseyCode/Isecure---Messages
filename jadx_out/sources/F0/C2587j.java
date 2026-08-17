package f0;

/* JADX INFO: renamed from: f0.j, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public final class C2587j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f27192a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f27193b;

    public C2587j(int i10, int i11) {
        this.f27192a = i10;
        this.f27193b = i11;
    }

    public final int a() {
        return this.f27192a;
    }

    public final int b() {
        return this.f27193b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2587j)) {
            return false;
        }
        C2587j c2587j = (C2587j) obj;
        return this.f27192a == c2587j.f27192a && this.f27193b == c2587j.f27193b;
    }

    public int hashCode() {
        return (Integer.hashCode(this.f27192a) * 31) + Integer.hashCode(this.f27193b);
    }

    public String toString() {
        return "CaptureEncodeRates(captureRate=" + this.f27192a + ", encodeRate=" + this.f27193b + ')';
    }
}
