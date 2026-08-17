package Z;

import Z.d0;
import y.I0;

/* JADX INFO: renamed from: Z.m, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
final class C1574m extends d0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f13408d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final d0.a f13409e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final I0.h f13410f;

    C1574m(int i10, d0.a aVar, I0.h hVar) {
        this.f13408d = i10;
        if (aVar == null) {
            throw new NullPointerException("Null streamState");
        }
        this.f13409e = aVar;
        this.f13410f = hVar;
    }

    @Override // Z.d0
    public int a() {
        return this.f13408d;
    }

    @Override // Z.d0
    public I0.h b() {
        return this.f13410f;
    }

    @Override // Z.d0
    public d0.a c() {
        return this.f13409e;
    }

    public boolean equals(Object obj) {
        I0.h hVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof d0) {
            d0 d0Var = (d0) obj;
            if (this.f13408d == d0Var.a() && this.f13409e.equals(d0Var.c()) && ((hVar = this.f13410f) != null ? hVar.equals(d0Var.b()) : d0Var.b() == null)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int iHashCode = (((this.f13408d ^ 1000003) * 1000003) ^ this.f13409e.hashCode()) * 1000003;
        I0.h hVar = this.f13410f;
        return iHashCode ^ (hVar == null ? 0 : hVar.hashCode());
    }

    public String toString() {
        return "StreamInfo{id=" + this.f13408d + ", streamState=" + this.f13409e + ", inProgressTransformationInfo=" + this.f13410f + "}";
    }
}
