package P4;

import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
final class D implements I {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Executor f8797a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Object f8798b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private InterfaceC1373g f8799c;

    public D(Executor executor, InterfaceC1373g interfaceC1373g) {
        this.f8797a = executor;
        this.f8799c = interfaceC1373g;
    }

    @Override // P4.I
    public final void a(AbstractC1378l abstractC1378l) {
        if (abstractC1378l.p() || abstractC1378l.n()) {
            return;
        }
        synchronized (this.f8798b) {
            try {
                if (this.f8799c == null) {
                    return;
                }
                this.f8797a.execute(new C(this, abstractC1378l));
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
