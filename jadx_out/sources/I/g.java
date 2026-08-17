package I;

import java.util.Locale;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
final class g implements Executor {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static volatile Executor f3829h;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final ExecutorService f3830g = Executors.newFixedThreadPool(2, new a());

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    class a implements ThreadFactory {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final AtomicInteger f3831a = new AtomicInteger(0);

        a() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable);
            thread.setName(String.format(Locale.US, "CameraX-camerax_io_%d", Integer.valueOf(this.f3831a.getAndIncrement())));
            return thread;
        }
    }

    g() {
    }

    static Executor a() {
        if (f3829h != null) {
            return f3829h;
        }
        synchronized (g.class) {
            try {
                if (f3829h == null) {
                    f3829h = new g();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return f3829h;
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        this.f3830g.execute(runnable);
    }
}
