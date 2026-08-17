package E;

import E.Q;

/* JADX INFO: renamed from: E.e, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
final class C0445e extends Q.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final S f954a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final androidx.camera.core.o f955b;

    C0445e(S s10, androidx.camera.core.o oVar) {
        if (s10 == null) {
            throw new NullPointerException("Null processingRequest");
        }
        this.f954a = s10;
        if (oVar == null) {
            throw new NullPointerException("Null imageProxy");
        }
        this.f955b = oVar;
    }

    @Override // E.Q.b
    androidx.camera.core.o a() {
        return this.f955b;
    }

    @Override // E.Q.b
    S b() {
        return this.f954a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof Q.b) {
            Q.b bVar = (Q.b) obj;
            if (this.f954a.equals(bVar.b()) && this.f955b.equals(bVar.a())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((this.f954a.hashCode() ^ 1000003) * 1000003) ^ this.f955b.hashCode();
    }

    public String toString() {
        return "InputPacket{processingRequest=" + this.f954a + ", imageProxy=" + this.f955b + "}";
    }
}
