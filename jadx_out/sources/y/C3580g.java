package y;

import android.view.Surface;
import y.I0;

/* JADX INFO: renamed from: y.g, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
final class C3580g extends I0.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f33788a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Surface f33789b;

    C3580g(int i10, Surface surface) {
        this.f33788a = i10;
        if (surface == null) {
            throw new NullPointerException("Null surface");
        }
        this.f33789b = surface;
    }

    @Override // y.I0.g
    public int a() {
        return this.f33788a;
    }

    @Override // y.I0.g
    public Surface b() {
        return this.f33789b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof I0.g) {
            I0.g gVar = (I0.g) obj;
            if (this.f33788a == gVar.a() && this.f33789b.equals(gVar.b())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((this.f33788a ^ 1000003) * 1000003) ^ this.f33789b.hashCode();
    }

    public String toString() {
        return "Result{resultCode=" + this.f33788a + ", surface=" + this.f33789b + "}";
    }
}
