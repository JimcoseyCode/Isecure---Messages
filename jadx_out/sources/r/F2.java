package r;

import F.C0475d;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
class F2 implements y.M0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private float f30958a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final float f30959b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final float f30960c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private float f30961d;

    F2(float f10, float f11) {
        this.f30959b = f10;
        this.f30960c = f11;
    }

    @Override // y.M0
    public float a() {
        return this.f30959b;
    }

    @Override // y.M0
    public float b() {
        return this.f30960c;
    }

    @Override // y.M0
    public float c() {
        return this.f30958a;
    }

    @Override // y.M0
    public float d() {
        return this.f30961d;
    }

    void e(float f10) {
        float f11 = this.f30959b;
        if (f10 <= f11) {
            float f12 = this.f30960c;
            if (f10 >= f12) {
                this.f30958a = f10;
                this.f30961d = C0475d.C(f10, f12, f11);
                return;
            }
        }
        throw new IllegalArgumentException("Requested zoomRatio " + f10 + " is not within valid range [" + this.f30960c + " , " + this.f30959b + "]");
    }
}
