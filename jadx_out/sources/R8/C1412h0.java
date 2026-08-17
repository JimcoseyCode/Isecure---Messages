package R8;

/* JADX INFO: renamed from: R8.h0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
final class C1412h0 extends F0 {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final InterfaceC1408f0 f10193k;

    public C1412h0(InterfaceC1408f0 interfaceC1408f0) {
        this.f10193k = interfaceC1408f0;
    }

    @Override // R8.F0
    public boolean v() {
        return false;
    }

    @Override // R8.F0
    public void w(Throwable th) {
        this.f10193k.dispose();
    }
}
