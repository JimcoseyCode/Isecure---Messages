package a2;

import android.os.Handler;
import java.util.concurrent.Callable;
import java.util.concurrent.Delayed;
import java.util.concurrent.FutureTask;
import java.util.concurrent.RunnableFuture;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public class f implements RunnableFuture, ScheduledFuture {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Handler f13678g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final FutureTask f13679h;

    public f(Handler handler, Callable callable) {
        this.f13678g = handler;
        this.f13679h = new FutureTask(callable);
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z10) {
        return this.f13679h.cancel(z10);
    }

    @Override // java.util.concurrent.Future
    public Object get() {
        return this.f13679h.get();
    }

    @Override // java.util.concurrent.Delayed
    public long getDelay(TimeUnit timeUnit) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        return this.f13679h.isCancelled();
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        return this.f13679h.isDone();
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public int compareTo(Delayed delayed) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.concurrent.RunnableFuture, java.lang.Runnable
    public void run() {
        this.f13679h.run();
    }

    @Override // java.util.concurrent.Future
    public Object get(long j10, TimeUnit timeUnit) {
        return this.f13679h.get(j10, timeUnit);
    }

    public f(Handler handler, Runnable runnable, Object obj) {
        this.f13678g = handler;
        this.f13679h = new FutureTask(runnable, obj);
    }
}
