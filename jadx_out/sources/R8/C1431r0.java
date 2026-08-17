package R8;

import W8.AbstractC1498a;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: R8.r0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class C1431r0 extends AbstractC1430q0 implements X {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final Executor f10217j;

    public C1431r0(Executor executor) {
        this.f10217j = executor;
        AbstractC1498a.a(P0());
    }

    private final void O0(n7.j jVar, RejectedExecutionException rejectedExecutionException) {
        D0.c(jVar, AbstractC1426o0.a("The task was rejected", rejectedExecutionException));
    }

    private final ScheduledFuture Q0(ScheduledExecutorService scheduledExecutorService, Runnable runnable, n7.j jVar, long j10) {
        try {
            return scheduledExecutorService.schedule(runnable, j10, TimeUnit.MILLISECONDS);
        } catch (RejectedExecutionException e10) {
            O0(jVar, e10);
            return null;
        }
    }

    @Override // R8.X
    public InterfaceC1408f0 D0(long j10, Runnable runnable, n7.j jVar) {
        long j11;
        Runnable runnable2;
        n7.j jVar2;
        Executor executorP0 = P0();
        ScheduledFuture scheduledFutureQ0 = null;
        ScheduledExecutorService scheduledExecutorService = executorP0 instanceof ScheduledExecutorService ? (ScheduledExecutorService) executorP0 : null;
        if (scheduledExecutorService != null) {
            j11 = j10;
            runnable2 = runnable;
            jVar2 = jVar;
            scheduledFutureQ0 = Q0(scheduledExecutorService, runnable2, jVar2, j11);
        } else {
            j11 = j10;
            runnable2 = runnable;
            jVar2 = jVar;
        }
        return scheduledFutureQ0 != null ? new C1406e0(scheduledFutureQ0) : T.f10156o.D0(j11, runnable2, jVar2);
    }

    @Override // R8.J
    public void J0(n7.j jVar, Runnable runnable) {
        try {
            Executor executorP0 = P0();
            AbstractC1401c.a();
            executorP0.execute(runnable);
        } catch (RejectedExecutionException e10) {
            AbstractC1401c.a();
            O0(jVar, e10);
            C1404d0.b().J0(jVar, runnable);
        }
    }

    public Executor P0() {
        return this.f10217j;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        Executor executorP0 = P0();
        ExecutorService executorService = executorP0 instanceof ExecutorService ? (ExecutorService) executorP0 : null;
        if (executorService != null) {
            executorService.shutdown();
        }
    }

    public boolean equals(Object obj) {
        return (obj instanceof C1431r0) && ((C1431r0) obj).P0() == P0();
    }

    public int hashCode() {
        return System.identityHashCode(P0());
    }

    @Override // R8.J
    public String toString() {
        return P0().toString();
    }
}
