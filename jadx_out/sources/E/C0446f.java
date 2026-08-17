package E;

import E.Y;

/* JADX INFO: renamed from: E.f, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
final class C0446f extends Y.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f958a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final y.X f959b;

    C0446f(int i10, y.X x10) {
        this.f958a = i10;
        if (x10 == null) {
            throw new NullPointerException("Null imageCaptureException");
        }
        this.f959b = x10;
    }

    @Override // E.Y.a
    y.X a() {
        return this.f959b;
    }

    @Override // E.Y.a
    int b() {
        return this.f958a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof Y.a) {
            Y.a aVar = (Y.a) obj;
            if (this.f958a == aVar.b() && this.f959b.equals(aVar.a())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((this.f958a ^ 1000003) * 1000003) ^ this.f959b.hashCode();
    }

    public String toString() {
        return "CaptureError{requestId=" + this.f958a + ", imageCaptureException=" + this.f959b + "}";
    }
}
