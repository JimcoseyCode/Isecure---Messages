package y;

import android.os.Process;
import java.util.Locale;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import y.ExecutorC3594n;

/* JADX INFO: renamed from: y.n, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public class ExecutorC3594n implements Executor {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final ThreadFactory f33808i = new a();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Object f33809g = new Object();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private ThreadPoolExecutor f33810h = b();

    /* JADX INFO: renamed from: y.n$a */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    class a implements ThreadFactory {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final AtomicInteger f33811a = new AtomicInteger(0);

        a() {
        }

        public static /* synthetic */ void a(Runnable runnable) {
            Process.setThreadPriority(-3);
            runnable.run();
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(final Runnable runnable) {
            Thread thread = new Thread(new Runnable() { // from class: y.m
                @Override // java.lang.Runnable
                public final void run() {
                    ExecutorC3594n.a.a(runnable);
                }
            });
            thread.setPriority(7);
            thread.setName(String.format(Locale.US, "CameraX-core_camera_%d", Integer.valueOf(this.f33811a.getAndIncrement())));
            return thread;
        }
    }

    private static ThreadPoolExecutor b() {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), f33808i);
        threadPoolExecutor.setRejectedExecutionHandler(new RejectedExecutionHandler() { // from class: y.l
            @Override // java.util.concurrent.RejectedExecutionHandler
            public final void rejectedExecution(Runnable runnable, ThreadPoolExecutor threadPoolExecutor2) {
                AbstractC3583h0.c("CameraExecutor", "A rejected execution occurred in CameraExecutor!");
            }
        });
        return threadPoolExecutor;
    }

    void c() {
        synchronized (this.f33809g) {
            try {
                if (!this.f33810h.isShutdown()) {
                    this.f33810h.shutdown();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    void d(F.K k10) {
        ThreadPoolExecutor threadPoolExecutor;
        H0.g.g(k10);
        synchronized (this.f33809g) {
            try {
                if (this.f33810h.isShutdown()) {
                    this.f33810h = b();
                }
                threadPoolExecutor = this.f33810h;
            } catch (Throwable th) {
                throw th;
            }
        }
        int iMax = Math.max(1, k10.c().size());
        threadPoolExecutor.setMaximumPoolSize(iMax);
        threadPoolExecutor.setCorePoolSize(iMax);
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        H0.g.g(runnable);
        synchronized (this.f33809g) {
            this.f33810h.execute(runnable);
        }
    }
}
