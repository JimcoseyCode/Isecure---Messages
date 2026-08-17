package P4;

import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
final class z implements I {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Executor f8841a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Object f8842b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private InterfaceC1371e f8843c;

    public z(Executor executor, InterfaceC1371e interfaceC1371e) {
        this.f8841a = executor;
        this.f8843c = interfaceC1371e;
    }

    @Override // P4.I
    public final void a(AbstractC1378l abstractC1378l) {
        if (abstractC1378l.n()) {
            synchronized (this.f8842b) {
                try {
                    if (this.f8843c == null) {
                        return;
                    }
                    this.f8841a.execute(new y(this));
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }
}
