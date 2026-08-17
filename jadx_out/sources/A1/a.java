package A1;

import android.os.Process;
import android.os.StrictMode;
import android.text.TextUtils;
import com.facebook.react.uimanager.ViewDefaults;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import q.AbstractC3106p;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public final class a implements ExecutorService, AutoCloseable {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final long f8h = TimeUnit.SECONDS.toMillis(10);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static volatile int f9i;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final ExecutorService f10g;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final boolean f11a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f12b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f13c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private ThreadFactory f14d = new c();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private e f15e = e.f29d;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private String f16f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private long f17g;

        b(boolean z10) {
            this.f11a = z10;
        }

        public a a() {
            if (TextUtils.isEmpty(this.f16f)) {
                throw new IllegalArgumentException("Name must be non-null and non-empty, but given: " + this.f16f);
            }
            ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(this.f12b, this.f13c, this.f17g, TimeUnit.MILLISECONDS, new PriorityBlockingQueue(), new d(this.f14d, this.f16f, this.f15e, this.f11a));
            if (this.f17g != 0) {
                threadPoolExecutor.allowCoreThreadTimeOut(true);
            }
            return new a(threadPoolExecutor);
        }

        public b b(String str) {
            this.f16f = str;
            return this;
        }

        public b c(int i10) {
            this.f12b = i10;
            this.f13c = i10;
            return this;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    private static final class c implements ThreadFactory {

        /* JADX INFO: renamed from: A1.a$c$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
        class C0002a extends Thread {
            C0002a(Runnable runnable) {
                super(runnable);
            }

            @Override // java.lang.Thread, java.lang.Runnable
            public void run() {
                Process.setThreadPriority(9);
                super.run();
            }
        }

        private c() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            return new C0002a(runnable);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    private static final class d implements ThreadFactory {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final ThreadFactory f19a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f20b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final e f21c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final boolean f22d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final AtomicInteger f23e = new AtomicInteger();

        /* JADX INFO: renamed from: A1.a$d$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
        class RunnableC0003a implements Runnable {

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            final /* synthetic */ Runnable f24g;

            RunnableC0003a(Runnable runnable) {
                this.f24g = runnable;
            }

            @Override // java.lang.Runnable
            public void run() {
                if (d.this.f22d) {
                    StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder().detectNetwork().penaltyDeath().build());
                }
                try {
                    this.f24g.run();
                } catch (Throwable th) {
                    d.this.f21c.a(th);
                }
            }
        }

        d(ThreadFactory threadFactory, String str, e eVar, boolean z10) {
            this.f19a = threadFactory;
            this.f20b = str;
            this.f21c = eVar;
            this.f22d = z10;
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            Thread threadNewThread = this.f19a.newThread(new RunnableC0003a(runnable));
            threadNewThread.setName("glide-" + this.f20b + "-thread-" + this.f23e.getAndIncrement());
            return threadNewThread;
        }
    }

    a(ExecutorService executorService) {
        this.f10g = executorService;
    }

    public static a A() {
        return s().a();
    }

    public static b B() {
        return new b(false).c(e()).b("source");
    }

    public static a I() {
        return B().a();
    }

    public static a J() {
        return new a(new ThreadPoolExecutor(0, ViewDefaults.NUMBER_OF_LINES, f8h, TimeUnit.MILLISECONDS, new SynchronousQueue(), new d(new c(), "source-unlimited", e.f29d, false)));
    }

    static int d() {
        return e() >= 4 ? 2 : 1;
    }

    public static int e() {
        if (f9i == 0) {
            f9i = Math.min(4, A1.b.a());
        }
        return f9i;
    }

    public static b k() {
        return new b(true).c(d()).b("animation");
    }

    public static a r() {
        return k().a();
    }

    public static b s() {
        return new b(true).c(1).b("disk-cache");
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean awaitTermination(long j10, TimeUnit timeUnit) {
        return this.f10g.awaitTermination(j10, timeUnit);
    }

    @Override // java.lang.AutoCloseable
    public /* synthetic */ void close() {
        AbstractC3106p.a(this);
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        this.f10g.execute(runnable);
    }

    @Override // java.util.concurrent.ExecutorService
    public List invokeAll(Collection collection) {
        return this.f10g.invokeAll(collection);
    }

    @Override // java.util.concurrent.ExecutorService
    public Object invokeAny(Collection collection) {
        return this.f10g.invokeAny(collection);
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean isShutdown() {
        return this.f10g.isShutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean isTerminated() {
        return this.f10g.isTerminated();
    }

    @Override // java.util.concurrent.ExecutorService
    public void shutdown() {
        this.f10g.shutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    public List shutdownNow() {
        return this.f10g.shutdownNow();
    }

    @Override // java.util.concurrent.ExecutorService
    public Future submit(Runnable runnable) {
        return this.f10g.submit(runnable);
    }

    public String toString() {
        return this.f10g.toString();
    }

    @Override // java.util.concurrent.ExecutorService
    public List invokeAll(Collection collection, long j10, TimeUnit timeUnit) {
        return this.f10g.invokeAll(collection, j10, timeUnit);
    }

    @Override // java.util.concurrent.ExecutorService
    public Object invokeAny(Collection collection, long j10, TimeUnit timeUnit) {
        return this.f10g.invokeAny(collection, j10, timeUnit);
    }

    @Override // java.util.concurrent.ExecutorService
    public Future submit(Runnable runnable, Object obj) {
        return this.f10g.submit(runnable, obj);
    }

    @Override // java.util.concurrent.ExecutorService
    public Future submit(Callable callable) {
        return this.f10g.submit(callable);
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public interface e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final e f26a = new C0004a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final e f27b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final e f28c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final e f29d;

        /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
        class c implements e {
            c() {
            }

            @Override // A1.a.e
            public void a(Throwable th) {
                if (th != null) {
                    throw new RuntimeException("Request threw uncaught throwable", th);
                }
            }
        }

        static {
            b bVar = new b();
            f27b = bVar;
            f28c = new c();
            f29d = bVar;
        }

        void a(Throwable th);

        /* JADX INFO: renamed from: A1.a$e$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
        class C0004a implements e {
            C0004a() {
            }

            @Override // A1.a.e
            public void a(Throwable th) {
            }
        }

        /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
        class b implements e {
            b() {
            }

            @Override // A1.a.e
            public void a(Throwable th) {
            }
        }
    }
}
