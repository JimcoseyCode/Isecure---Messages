package Y;

import Y.h;
import y.C3596p;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
final class a extends h.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f12554a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C3596p f12555b;

    a(int i10, C3596p c3596p) {
        this.f12554a = i10;
        if (c3596p == null) {
            throw new NullPointerException("Null cameraIdentifier");
        }
        this.f12555b = c3596p;
    }

    @Override // Y.h.a
    public C3596p b() {
        return this.f12555b;
    }

    @Override // Y.h.a
    public int c() {
        return this.f12554a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof h.a) {
            h.a aVar = (h.a) obj;
            if (this.f12554a == aVar.c() && this.f12555b.equals(aVar.b())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((this.f12554a ^ 1000003) * 1000003) ^ this.f12555b.hashCode();
    }

    public String toString() {
        return "Key{lifecycleOwnerHash=" + this.f12554a + ", cameraIdentifier=" + this.f12555b + "}";
    }
}
