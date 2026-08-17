package R8;

/* JADX INFO: renamed from: R8.g0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
final class C1410g0 implements InterfaceC1419l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC1408f0 f10191a;

    public C1410g0(InterfaceC1408f0 interfaceC1408f0) {
        this.f10191a = interfaceC1408f0;
    }

    @Override // R8.InterfaceC1419l
    public void a(Throwable th) {
        this.f10191a.dispose();
    }

    public String toString() {
        return "DisposeOnCancel[" + this.f10191a + ']';
    }
}
