package P4;

import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
final class v implements I {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Executor f8832a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InterfaceC1369c f8833b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final N f8834c;

    public v(Executor executor, InterfaceC1369c interfaceC1369c, N n10) {
        this.f8832a = executor;
        this.f8833b = interfaceC1369c;
        this.f8834c = n10;
    }

    @Override // P4.I
    public final void a(AbstractC1378l abstractC1378l) {
        this.f8832a.execute(new u(this, abstractC1378l));
    }
}
