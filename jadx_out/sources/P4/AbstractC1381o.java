package P4;

import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import r4.AbstractC3268i;

/* JADX INFO: renamed from: P4.o, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1381o {
    public static Object a(AbstractC1378l abstractC1378l) throws InterruptedException {
        AbstractC3268i.i();
        AbstractC3268i.g();
        AbstractC3268i.l(abstractC1378l, "Task must not be null");
        if (abstractC1378l.o()) {
            return g(abstractC1378l);
        }
        r rVar = new r(null);
        h(abstractC1378l, rVar);
        rVar.a();
        return g(abstractC1378l);
    }

    public static Object b(AbstractC1378l abstractC1378l, long j10, TimeUnit timeUnit) throws TimeoutException {
        AbstractC3268i.i();
        AbstractC3268i.g();
        AbstractC3268i.l(abstractC1378l, "Task must not be null");
        AbstractC3268i.l(timeUnit, "TimeUnit must not be null");
        if (abstractC1378l.o()) {
            return g(abstractC1378l);
        }
        r rVar = new r(null);
        h(abstractC1378l, rVar);
        if (rVar.b(j10, timeUnit)) {
            return g(abstractC1378l);
        }
        throw new TimeoutException("Timed out waiting for Task");
    }

    public static AbstractC1378l c(Executor executor, Callable callable) {
        AbstractC3268i.l(executor, "Executor must not be null");
        AbstractC3268i.l(callable, "Callback must not be null");
        N n10 = new N();
        executor.execute(new O(n10, callable));
        return n10;
    }

    public static AbstractC1378l d() {
        N n10 = new N();
        n10.u();
        return n10;
    }

    public static AbstractC1378l e(Exception exc) {
        N n10 = new N();
        n10.s(exc);
        return n10;
    }

    public static AbstractC1378l f(Object obj) {
        N n10 = new N();
        n10.t(obj);
        return n10;
    }

    private static Object g(AbstractC1378l abstractC1378l) throws ExecutionException {
        if (abstractC1378l.p()) {
            return abstractC1378l.l();
        }
        if (abstractC1378l.n()) {
            throw new CancellationException("Task is already canceled");
        }
        throw new ExecutionException(abstractC1378l.k());
    }

    private static void h(AbstractC1378l abstractC1378l, s sVar) {
        Executor executor = AbstractC1380n.f8826b;
        abstractC1378l.h(executor, sVar);
        abstractC1378l.f(executor, sVar);
        abstractC1378l.b(executor, sVar);
    }
}
