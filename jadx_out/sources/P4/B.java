package P4;

import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
final class B implements I {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Executor f8792a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Object f8793b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private InterfaceC1372f f8794c;

    public B(Executor executor, InterfaceC1372f interfaceC1372f) {
        this.f8792a = executor;
        this.f8794c = interfaceC1372f;
    }

    @Override // P4.I
    public final void a(AbstractC1378l abstractC1378l) {
        synchronized (this.f8793b) {
            try {
                if (this.f8794c == null) {
                    return;
                }
                this.f8792a.execute(new A(this, abstractC1378l));
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
