package a2;

import d2.AbstractC2325a;
import java.util.List;
import java.util.concurrent.AbstractExecutorService;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import q.AbstractC3106p;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public abstract class b extends AbstractExecutorService implements AutoCloseable {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final Class f13668n = b.class;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final String f13669g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Executor f13670h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private volatile int f13671i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final BlockingQueue f13672j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final a f13673k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final AtomicInteger f13674l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final AtomicInteger f13675m;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    private class a implements Runnable {
        @Override // java.lang.Runnable
        public void run() {
            try {
                Runnable runnable = (Runnable) b.this.f13672j.poll();
                if (runnable != null) {
                    runnable.run();
                } else {
                    AbstractC2325a.y(b.f13668n, "%s: Worker has nothing to run", b.this.f13669g);
                }
                int iDecrementAndGet = b.this.f13674l.decrementAndGet();
                if (b.this.f13672j.isEmpty()) {
                    AbstractC2325a.z(b.f13668n, "%s: worker finished; %d workers left", b.this.f13669g, Integer.valueOf(iDecrementAndGet));
                } else {
                    b.this.A();
                }
            } catch (Throwable th) {
                int iDecrementAndGet2 = b.this.f13674l.decrementAndGet();
                if (b.this.f13672j.isEmpty()) {
                    AbstractC2325a.z(b.f13668n, "%s: worker finished; %d workers left", b.this.f13669g, Integer.valueOf(iDecrementAndGet2));
                } else {
                    b.this.A();
                }
                throw th;
            }
        }

        private a() {
        }
    }

    public b(String str, int i10, Executor executor, BlockingQueue blockingQueue) {
        if (i10 <= 0) {
            throw new IllegalArgumentException("max concurrency must be > 0");
        }
        this.f13669g = str;
        this.f13670h = executor;
        this.f13671i = i10;
        this.f13672j = blockingQueue;
        this.f13673k = new a();
        this.f13674l = new AtomicInteger(0);
        this.f13675m = new AtomicInteger(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A() {
        int i10 = this.f13674l.get();
        while (i10 < this.f13671i) {
            int i11 = i10 + 1;
            if (this.f13674l.compareAndSet(i10, i11)) {
                AbstractC2325a.A(f13668n, "%s: starting worker %d of %d", this.f13669g, Integer.valueOf(i11), Integer.valueOf(this.f13671i));
                this.f13670h.execute(this.f13673k);
                return;
            } else {
                AbstractC2325a.y(f13668n, "%s: race in startWorkerIfNeeded; retrying", this.f13669g);
                i10 = this.f13674l.get();
            }
        }
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean awaitTermination(long j10, TimeUnit timeUnit) {
        throw new UnsupportedOperationException();
    }

    @Override // java.lang.AutoCloseable
    public /* synthetic */ void close() {
        AbstractC3106p.a(this);
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        if (runnable == null) {
            throw new NullPointerException("runnable parameter is null");
        }
        if (!this.f13672j.offer(runnable)) {
            throw new RejectedExecutionException(this.f13669g + " queue is full, size=" + this.f13672j.size());
        }
        int size = this.f13672j.size();
        int i10 = this.f13675m.get();
        if (size > i10 && this.f13675m.compareAndSet(i10, size)) {
            AbstractC2325a.z(f13668n, "%s: max pending work in queue = %d", this.f13669g, Integer.valueOf(size));
        }
        A();
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean isShutdown() {
        return false;
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean isTerminated() {
        return false;
    }

    @Override // java.util.concurrent.ExecutorService
    public void shutdown() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.concurrent.ExecutorService
    public List shutdownNow() {
        throw new UnsupportedOperationException();
    }
}
