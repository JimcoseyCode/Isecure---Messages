package I4;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
final class L9 extends N9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final float f4223a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final float f4224b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final float f4225c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final float f4226d;

    L9(float f10, float f11, float f12, float f13, float f14) {
        this.f4223a = f10;
        this.f4224b = f11;
        this.f4225c = f12;
        this.f4226d = f13;
    }

    @Override // I4.N9
    final float a() {
        return 0.0f;
    }

    @Override // I4.N9
    final float b() {
        return this.f4225c;
    }

    @Override // I4.N9
    final float c() {
        return this.f4223a;
    }

    @Override // I4.N9
    final float d() {
        return this.f4226d;
    }

    @Override // I4.N9
    final float e() {
        return this.f4224b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof N9) {
            N9 n92 = (N9) obj;
            if (Float.floatToIntBits(this.f4223a) == Float.floatToIntBits(n92.c()) && Float.floatToIntBits(this.f4224b) == Float.floatToIntBits(n92.e()) && Float.floatToIntBits(this.f4225c) == Float.floatToIntBits(n92.b()) && Float.floatToIntBits(this.f4226d) == Float.floatToIntBits(n92.d())) {
                int iFloatToIntBits = Float.floatToIntBits(0.0f);
                n92.a();
                if (iFloatToIntBits == Float.floatToIntBits(0.0f)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((Float.floatToIntBits(this.f4223a) ^ 1000003) * 1000003) ^ Float.floatToIntBits(this.f4224b)) * 1000003) ^ Float.floatToIntBits(this.f4225c)) * 1000003) ^ Float.floatToIntBits(this.f4226d)) * 1000003) ^ Float.floatToIntBits(0.0f);
    }

    public final String toString() {
        return "PredictedArea{xMin=" + this.f4223a + ", yMin=" + this.f4224b + ", xMax=" + this.f4225c + ", yMax=" + this.f4226d + ", confidenceScore=0.0}";
    }
}
