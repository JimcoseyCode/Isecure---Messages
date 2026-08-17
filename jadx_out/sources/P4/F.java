package P4;

import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
final class F implements I {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Executor f8802a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Object f8803b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private InterfaceC1374h f8804c;

    public F(Executor executor, InterfaceC1374h interfaceC1374h) {
        this.f8802a = executor;
        this.f8804c = interfaceC1374h;
    }

    @Override // P4.I
    public final void a(AbstractC1378l abstractC1378l) {
        if (abstractC1378l.p()) {
            synchronized (this.f8803b) {
                try {
                    if (this.f8804c == null) {
                        return;
                    }
                    this.f8802a.execute(new E(this, abstractC1378l));
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }
}
