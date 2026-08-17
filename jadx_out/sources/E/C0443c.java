package E;

import E.C0463x;

/* JADX INFO: renamed from: E.c, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
final class C0443c extends C0463x.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final P.z f938a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f939b;

    C0443c(P.z zVar, int i10) {
        if (zVar == null) {
            throw new NullPointerException("Null packet");
        }
        this.f938a = zVar;
        this.f939b = i10;
    }

    @Override // E.C0463x.a
    int a() {
        return this.f939b;
    }

    @Override // E.C0463x.a
    P.z b() {
        return this.f938a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C0463x.a) {
            C0463x.a aVar = (C0463x.a) obj;
            if (this.f938a.equals(aVar.b()) && this.f939b == aVar.a()) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((this.f938a.hashCode() ^ 1000003) * 1000003) ^ this.f939b;
    }

    public String toString() {
        return "In{packet=" + this.f938a + ", jpegQuality=" + this.f939b + "}";
    }
}
