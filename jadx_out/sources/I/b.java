package I;

import I.b;
import android.os.Process;
import java.util.Locale;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public class b implements Executor {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static volatile Executor f3809h;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final ExecutorService f3810g = Executors.newFixedThreadPool(2, new a());

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    class a implements ThreadFactory {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final AtomicInteger f3811a = new AtomicInteger(0);

        a() {
        }

        public static /* synthetic */ void a(Runnable runnable) {
            Process.setThreadPriority(-16);
            runnable.run();
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(final Runnable runnable) {
            Thread thread = new Thread(new Runnable() { // from class: I.a
                @Override // java.lang.Runnable
                public final void run() {
                    b.a.a(runnable);
                }
            });
            thread.setName(String.format(Locale.US, "CameraX-camerax_audio_%d", Integer.valueOf(this.f3811a.getAndIncrement())));
            return thread;
        }
    }

    static Executor a() {
        if (f3809h != null) {
            return f3809h;
        }
        synchronized (b.class) {
            try {
                if (f3809h == null) {
                    f3809h = new b();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return f3809h;
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        this.f3810g.execute(runnable);
    }
}
