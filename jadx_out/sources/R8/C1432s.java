package R8;

/* JADX INFO: renamed from: R8.s, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
final class C1432s extends F0 {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final C1425o f10218k;

    public C1432s(C1425o c1425o) {
        this.f10218k = c1425o;
    }

    @Override // R8.F0
    public boolean v() {
        return true;
    }

    @Override // R8.F0
    public void w(Throwable th) {
        C1425o c1425o = this.f10218k;
        c1425o.M(c1425o.x(u()));
    }
}
