package G2;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f2187a = new b();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final ThreadFactory f2188b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final ExecutorService f2189c;

    static {
        ThreadFactory threadFactory = new ThreadFactory() { // from class: G2.a
            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(Runnable runnable) {
                return b.c(runnable);
            }
        };
        f2188b = threadFactory;
        f2189c = Executors.newCachedThreadPool(threadFactory);
    }

    private b() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Thread c(Runnable runnable) {
        Thread thread = new Thread(runnable);
        thread.setPriority(1);
        return thread;
    }

    public final void b(Runnable task) {
        AbstractC2855l.g(task, "task");
        f2189c.execute(task);
    }
}
