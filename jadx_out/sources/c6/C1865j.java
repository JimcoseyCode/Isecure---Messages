package c6;

import H4.AbstractExecutorServiceC0798u;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import r4.AbstractC3268i;

/* JADX INFO: renamed from: c6.j, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public class C1865j extends AbstractExecutorServiceC0798u {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final ThreadLocal f18855h = new ThreadLocal();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final ThreadPoolExecutor f18856g;

    public C1865j() {
        final ThreadFactory threadFactoryDefaultThreadFactory = Executors.defaultThreadFactory();
        int iAvailableProcessors = Runtime.getRuntime().availableProcessors();
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(iAvailableProcessors, iAvailableProcessors, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new ThreadFactory() { // from class: c6.v
            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(final Runnable runnable) {
                return threadFactoryDefaultThreadFactory.newThread(new Runnable() { // from class: c6.w
                    @Override // java.lang.Runnable
                    public final void run() {
                        C1865j.r(runnable);
                    }
                });
            }
        });
        this.f18856g = threadPoolExecutor;
        threadPoolExecutor.allowCoreThreadTimeOut(true);
    }

    static /* synthetic */ void r(Runnable runnable) {
        f18855h.set(new ArrayDeque());
        runnable.run();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void s(Deque deque, Runnable runnable) {
        AbstractC3268i.k(deque);
        deque.add(runnable);
        if (deque.size() <= 1) {
            do {
                runnable.run();
                deque.removeFirst();
                runnable = (Runnable) deque.peekFirst();
            } while (runnable != null);
        }
    }

    @Override // H4.Y
    protected final /* synthetic */ Object d() {
        return this.f18856g;
    }

    @Override // H4.AbstractExecutorServiceC0798u
    protected final ExecutorService e() {
        return this.f18856g;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(final Runnable runnable) {
        Deque deque = (Deque) f18855h.get();
        if (deque == null || deque.size() > 1) {
            this.f18856g.execute(new Runnable() { // from class: c6.u
                @Override // java.lang.Runnable
                public final void run() {
                    C1865j.s((Deque) C1865j.f18855h.get(), runnable);
                }
            });
        } else {
            s(deque, runnable);
        }
    }
}
