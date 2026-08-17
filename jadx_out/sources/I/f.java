package I;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
final class f implements Executor {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static volatile Executor f3826h;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final ExecutorService f3827g = Executors.newSingleThreadExecutor(new a());

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    class a implements ThreadFactory {
        a() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable);
            thread.setPriority(10);
            thread.setName("CameraX-camerax_high_priority");
            return thread;
        }
    }

    f() {
    }

    static Executor a() {
        if (f3826h != null) {
            return f3826h;
        }
        synchronized (f.class) {
            try {
                if (f3826h == null) {
                    f3826h = new f();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return f3826h;
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        this.f3827g.execute(runnable);
    }
}
