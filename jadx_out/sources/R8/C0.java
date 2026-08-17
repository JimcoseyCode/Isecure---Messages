package R8;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public class C0 extends G0 implements InterfaceC1446z {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final boolean f10117i;

    public C0(A0 a02) {
        super(true);
        c0(a02);
        this.f10117i = M0();
    }

    private final boolean M0() {
        G0 g0U;
        InterfaceC1434t interfaceC1434tU = U();
        C1436u c1436u = interfaceC1434tU instanceof C1436u ? (C1436u) interfaceC1434tU : null;
        if (c1436u != null && (g0U = c1436u.u()) != null) {
            while (!g0U.Q()) {
                InterfaceC1434t interfaceC1434tU2 = g0U.U();
                C1436u c1436u2 = interfaceC1434tU2 instanceof C1436u ? (C1436u) interfaceC1434tU2 : null;
                if (c1436u2 == null || (g0U = c1436u2.u()) == null) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // R8.G0
    public boolean Q() {
        return this.f10117i;
    }

    @Override // R8.G0
    public boolean R() {
        return true;
    }
}
