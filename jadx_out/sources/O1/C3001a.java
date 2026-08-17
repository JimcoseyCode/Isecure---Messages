package o1;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: o1.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
final class C3001a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final C3001a f30439b = new C3001a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f30440c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    static final int f30441d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    static final int f30442e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Executor f30443a = new b();

    /* JADX INFO: renamed from: o1.a$b */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    private static class b implements Executor {
        private b() {
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            new Handler(Looper.getMainLooper()).post(runnable);
        }
    }

    static {
        int iAvailableProcessors = Runtime.getRuntime().availableProcessors();
        f30440c = iAvailableProcessors;
        f30441d = iAvailableProcessors + 1;
        f30442e = (iAvailableProcessors * 2) + 1;
    }

    private C3001a() {
    }

    public static void a(ThreadPoolExecutor threadPoolExecutor, boolean z10) {
        threadPoolExecutor.allowCoreThreadTimeOut(z10);
    }

    public static ExecutorService b() {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(f30441d, f30442e, 1L, TimeUnit.SECONDS, new LinkedBlockingQueue());
        a(threadPoolExecutor, true);
        return threadPoolExecutor;
    }

    public static Executor c() {
        return f30439b.f30443a;
    }
}
