package I;

import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
final class d implements Executor {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static volatile d f3813g;

    d() {
    }

    static Executor a() {
        if (f3813g != null) {
            return f3813g;
        }
        synchronized (d.class) {
            try {
                if (f3813g == null) {
                    f3813g = new d();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return f3813g;
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        runnable.run();
    }
}
