package R8;

/* JADX INFO: renamed from: R8.u, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
final class C1436u extends F0 implements InterfaceC1434t {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final InterfaceC1438v f10220k;

    public C1436u(InterfaceC1438v interfaceC1438v) {
        this.f10220k = interfaceC1438v;
    }

    @Override // R8.InterfaceC1434t
    public A0 getParent() {
        return u();
    }

    @Override // R8.InterfaceC1434t
    public boolean j(Throwable th) {
        return u().F(th);
    }

    @Override // R8.F0
    public boolean v() {
        return true;
    }

    @Override // R8.F0
    public void w(Throwable th) {
        this.f10220k.d0(u());
    }
}
