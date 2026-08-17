package E;

import E.C0448h;

/* JADX INFO: renamed from: E.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
final class C0441a extends C0448h.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final P.z f926a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f927b;

    C0441a(P.z zVar, int i10) {
        if (zVar == null) {
            throw new NullPointerException("Null packet");
        }
        this.f926a = zVar;
        this.f927b = i10;
    }

    @Override // E.C0448h.b
    int a() {
        return this.f927b;
    }

    @Override // E.C0448h.b
    P.z b() {
        return this.f926a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C0448h.b) {
            C0448h.b bVar = (C0448h.b) obj;
            if (this.f926a.equals(bVar.b()) && this.f927b == bVar.a()) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((this.f926a.hashCode() ^ 1000003) * 1000003) ^ this.f927b;
    }

    public String toString() {
        return "In{packet=" + this.f926a + ", jpegQuality=" + this.f927b + "}";
    }
}
