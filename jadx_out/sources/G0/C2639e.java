package g0;

/* JADX INFO: renamed from: g0.e, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
final class C2639e extends r0 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f28044f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int f28045g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final int f28046h;

    C2639e(int i10, int i11, int i12) {
        this.f28044f = i10;
        this.f28045g = i11;
        this.f28046h = i12;
    }

    @Override // g0.r0
    public int b() {
        return this.f28046h;
    }

    @Override // g0.r0
    public int c() {
        return this.f28044f;
    }

    @Override // g0.r0
    public int d() {
        return this.f28045g;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof r0) {
            r0 r0Var = (r0) obj;
            if (this.f28044f == r0Var.c() && this.f28045g == r0Var.d() && this.f28046h == r0Var.b()) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((this.f28044f ^ 1000003) * 1000003) ^ this.f28045g) * 1000003) ^ this.f28046h;
    }

    public String toString() {
        return "VideoEncoderDataSpace{standard=" + this.f28044f + ", transfer=" + this.f28045g + ", range=" + this.f28046h + "}";
    }
}
