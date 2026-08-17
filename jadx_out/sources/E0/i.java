package E0;

import android.os.Handler;
import android.os.Process;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
abstract class i {

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    private static class a implements ThreadFactory {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f1059a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f1060b;

        /* JADX INFO: renamed from: E0.i$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
        private static class C0034a extends Thread {

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            private final int f1061g;

            C0034a(Runnable runnable, String str, int i10) {
                super(runnable, str);
                this.f1061g = i10;
            }

            @Override // java.lang.Thread, java.lang.Runnable
            public void run() {
                Process.setThreadPriority(this.f1061g);
                super.run();
            }
        }

        a(String str, int i10) {
            this.f1059a = str;
            this.f1060b = i10;
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            return new C0034a(runnable, this.f1059a, this.f1060b);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    private static class b implements Executor {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final Handler f1062g;

        b(Handler handler) {
            this.f1062g = (Handler) H0.g.g(handler);
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            if (this.f1062g.post((Runnable) H0.g.g(runnable))) {
                return;
            }
            throw new RejectedExecutionException(this.f1062g + " is shutting down");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    private static class c implements Runnable {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private Callable f1063g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private H0.a f1064h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private Handler f1065i;

        /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
        class a implements Runnable {

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            final /* synthetic */ H0.a f1066g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            final /* synthetic */ Object f1067h;

            a(H0.a aVar, Object obj) {
                this.f1066g = aVar;
                this.f1067h = obj;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.f1066g.accept(this.f1067h);
            }
        }

        c(Handler handler, Callable callable, H0.a aVar) {
            this.f1063g = callable;
            this.f1064h = aVar;
            this.f1065i = handler;
        }

        @Override // java.lang.Runnable
        public void run() {
            Object objCall;
            try {
                objCall = this.f1063g.call();
            } catch (Exception unused) {
                objCall = null;
            }
            this.f1065i.post(new a(this.f1064h, objCall));
        }
    }

    static ThreadPoolExecutor a(String str, int i10, int i11) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, i11, TimeUnit.MILLISECONDS, new LinkedBlockingDeque(), new a(str, i10));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        return threadPoolExecutor;
    }

    static Executor b(Handler handler) {
        return new b(handler);
    }

    static void c(Executor executor, Callable callable, H0.a aVar) {
        executor.execute(new c(E0.b.a(), callable, aVar));
    }

    static Object d(ExecutorService executorService, Callable callable, int i10) throws InterruptedException {
        try {
            return executorService.submit(callable).get(i10, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e10) {
            throw e10;
        } catch (ExecutionException e11) {
            throw new RuntimeException(e11);
        } catch (TimeoutException unused) {
            throw new InterruptedException("timeout");
        }
    }
}
