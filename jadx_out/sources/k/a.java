package K;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
final class a extends h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final float f6954a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final float f6955b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final float f6956c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final float f6957d;

    a(float f10, float f11, float f12, float f13) {
        this.f6954a = f10;
        this.f6955b = f11;
        this.f6956c = f12;
        this.f6957d = f13;
    }

    @Override // K.h, y.M0
    public float a() {
        return this.f6955b;
    }

    @Override // K.h, y.M0
    public float b() {
        return this.f6956c;
    }

    @Override // K.h, y.M0
    public float c() {
        return this.f6954a;
    }

    @Override // K.h, y.M0
    public float d() {
        return this.f6957d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof h) {
            h hVar = (h) obj;
            if (Float.floatToIntBits(this.f6954a) == Float.floatToIntBits(hVar.c()) && Float.floatToIntBits(this.f6955b) == Float.floatToIntBits(hVar.a()) && Float.floatToIntBits(this.f6956c) == Float.floatToIntBits(hVar.b()) && Float.floatToIntBits(this.f6957d) == Float.floatToIntBits(hVar.d())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((((Float.floatToIntBits(this.f6954a) ^ 1000003) * 1000003) ^ Float.floatToIntBits(this.f6955b)) * 1000003) ^ Float.floatToIntBits(this.f6956c)) * 1000003) ^ Float.floatToIntBits(this.f6957d);
    }

    public String toString() {
        return "ImmutableZoomState{zoomRatio=" + this.f6954a + ", maxZoomRatio=" + this.f6955b + ", minZoomRatio=" + this.f6956c + ", linearZoom=" + this.f6957d + "}";
    }
}
