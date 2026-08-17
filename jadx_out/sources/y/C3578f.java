package y;

import y.w0;

/* JADX INFO: renamed from: y.f, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
final class C3578f extends w0.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f33786a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final w0 f33787b;

    C3578f(int i10, w0 w0Var) {
        this.f33786a = i10;
        if (w0Var == null) {
            throw new NullPointerException("Null surfaceOutput");
        }
        this.f33787b = w0Var;
    }

    @Override // y.w0.b
    public int a() {
        return this.f33786a;
    }

    @Override // y.w0.b
    public w0 b() {
        return this.f33787b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof w0.b) {
            w0.b bVar = (w0.b) obj;
            if (this.f33786a == bVar.a() && this.f33787b.equals(bVar.b())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((this.f33786a ^ 1000003) * 1000003) ^ this.f33787b.hashCode();
    }

    public String toString() {
        return "Event{eventCode=" + this.f33786a + ", surfaceOutput=" + this.f33787b + "}";
    }
}
