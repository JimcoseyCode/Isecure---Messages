package P4;

import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
final class x implements InterfaceC1374h, InterfaceC1373g, InterfaceC1371e, I {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Executor f8837a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InterfaceC1369c f8838b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final N f8839c;

    public x(Executor executor, InterfaceC1369c interfaceC1369c, N n10) {
        this.f8837a = executor;
        this.f8838b = interfaceC1369c;
        this.f8839c = n10;
    }

    @Override // P4.I
    public final void a(AbstractC1378l abstractC1378l) {
        this.f8837a.execute(new w(this, abstractC1378l));
    }

    @Override // P4.InterfaceC1371e
    public final void onCanceled() {
        this.f8839c.u();
    }

    @Override // P4.InterfaceC1373g
    public final void onFailure(Exception exc) {
        this.f8839c.s(exc);
    }

    @Override // P4.InterfaceC1374h
    public final void onSuccess(Object obj) {
        this.f8839c.t(obj);
    }
}
