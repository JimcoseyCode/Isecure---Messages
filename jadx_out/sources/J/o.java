package J;

import java.util.concurrent.Delayed;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import m5.InterfaceFutureC2904a;
import y.AbstractC3583h0;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
abstract class o implements InterfaceFutureC2904a {

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    static class a extends o {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final Throwable f5304g;

        a(Throwable th) {
            this.f5304g = th;
        }

        @Override // J.o, java.util.concurrent.Future
        public Object get() throws ExecutionException {
            throw new ExecutionException(this.f5304g);
        }

        public String toString() {
            return super.toString() + "[status=FAILURE, cause=[" + this.f5304g + "]]";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    static final class b extends a implements ScheduledFuture {
        b(Throwable th) {
            super(th);
        }

        @Override // java.util.concurrent.Delayed
        public long getDelay(TimeUnit timeUnit) {
            return 0L;
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public int compareTo(Delayed delayed) {
            return -1;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    static final class c extends o {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        static final o f5305h = new c(null);

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final Object f5306g;

        c(Object obj) {
            this.f5306g = obj;
        }

        @Override // J.o, java.util.concurrent.Future
        public Object get() {
            return this.f5306g;
        }

        public String toString() {
            return super.toString() + "[status=SUCCESS, result=[" + this.f5306g + "]]";
        }
    }

    o() {
    }

    public static InterfaceFutureC2904a j() {
        return c.f5305h;
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z10) {
        return false;
    }

    @Override // java.util.concurrent.Future
    public abstract Object get();

    @Override // java.util.concurrent.Future
    public Object get(long j10, TimeUnit timeUnit) {
        H0.g.g(timeUnit);
        return get();
    }

    @Override // m5.InterfaceFutureC2904a
    public void h(Runnable runnable, Executor executor) {
        H0.g.g(runnable);
        H0.g.g(executor);
        try {
            executor.execute(runnable);
        } catch (RuntimeException e10) {
            AbstractC3583h0.d("ImmediateFuture", "Experienced RuntimeException while attempting to notify " + runnable + " on Executor " + executor, e10);
        }
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        return false;
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        return true;
    }
}
