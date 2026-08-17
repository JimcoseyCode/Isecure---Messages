package J;

import J.o;
import androidx.concurrent.futures.c;
import java.util.ArrayList;
import java.util.Collection;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import m5.InterfaceFutureC2904a;
import n.InterfaceC2955a;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public abstract class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final InterfaceC2955a f5297a = new b();

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    class a implements J.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC2955a f5298a;

        a(InterfaceC2955a interfaceC2955a) {
            this.f5298a = interfaceC2955a;
        }

        @Override // J.a
        public InterfaceFutureC2904a apply(Object obj) {
            return n.p(this.f5298a.apply(obj));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    class c implements J.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ c.a f5299a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ InterfaceC2955a f5300b;

        c(c.a aVar, InterfaceC2955a interfaceC2955a) {
            this.f5299a = aVar;
            this.f5300b = interfaceC2955a;
        }

        @Override // J.c
        public void onFailure(Throwable th) {
            this.f5299a.f(th);
        }

        @Override // J.c
        public void onSuccess(Object obj) {
            try {
                this.f5299a.c(this.f5300b.apply(obj));
            } catch (Throwable th) {
                this.f5299a.f(th);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    class d implements Runnable {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ InterfaceFutureC2904a f5301g;

        d(InterfaceFutureC2904a interfaceFutureC2904a) {
            this.f5301g = interfaceFutureC2904a;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f5301g.cancel(true);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    private static final class e implements Runnable {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final Future f5302g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final J.c f5303h;

        e(Future future, J.c cVar) {
            this.f5302g = future;
            this.f5303h = cVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.f5303h.onSuccess(n.l(this.f5302g));
            } catch (Error e10) {
                e = e10;
                this.f5303h.onFailure(e);
            } catch (RuntimeException e11) {
                e = e11;
                this.f5303h.onFailure(e);
            } catch (ExecutionException e12) {
                Throwable cause = e12.getCause();
                if (cause == null) {
                    this.f5303h.onFailure(e12);
                } else {
                    this.f5303h.onFailure(cause);
                }
            }
        }

        public String toString() {
            return e.class.getSimpleName() + "," + this.f5303h;
        }
    }

    public static /* synthetic */ Object a(final InterfaceFutureC2904a interfaceFutureC2904a, ScheduledExecutorService scheduledExecutorService, final Object obj, final boolean z10, long j10, final c.a aVar) {
        t(interfaceFutureC2904a, aVar);
        if (!interfaceFutureC2904a.isDone()) {
            final ScheduledFuture<?> scheduledFutureSchedule = scheduledExecutorService.schedule(new Runnable() { // from class: J.h
                @Override // java.lang.Runnable
                public final void run() {
                    n.h(aVar, obj, z10, interfaceFutureC2904a);
                }
            }, j10, TimeUnit.MILLISECONDS);
            interfaceFutureC2904a.h(new Runnable() { // from class: J.i
                @Override // java.lang.Runnable
                public final void run() {
                    scheduledFutureSchedule.cancel(true);
                }
            }, I.c.b());
        }
        return "TimeoutFuture[" + interfaceFutureC2904a + "]";
    }

    public static /* synthetic */ Object c(InterfaceFutureC2904a interfaceFutureC2904a, c.a aVar) {
        v(false, interfaceFutureC2904a, f5297a, aVar, I.c.b());
        return "nonCancellationPropagating[" + interfaceFutureC2904a + "]";
    }

    public static /* synthetic */ Object d(final InterfaceFutureC2904a interfaceFutureC2904a, ScheduledExecutorService scheduledExecutorService, final long j10, final c.a aVar) {
        t(interfaceFutureC2904a, aVar);
        if (!interfaceFutureC2904a.isDone()) {
            final ScheduledFuture scheduledFutureSchedule = scheduledExecutorService.schedule(new Callable() { // from class: J.e
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return Boolean.valueOf(aVar.f(new TimeoutException("Future[" + interfaceFutureC2904a + "] is not done within " + j10 + " ms.")));
                }
            }, j10, TimeUnit.MILLISECONDS);
            interfaceFutureC2904a.h(new Runnable() { // from class: J.f
                @Override // java.lang.Runnable
                public final void run() {
                    scheduledFutureSchedule.cancel(true);
                }
            }, I.c.b());
        }
        return "TimeoutFuture[" + interfaceFutureC2904a + "]";
    }

    public static /* synthetic */ Object f(InterfaceFutureC2904a interfaceFutureC2904a, final c.a aVar) {
        interfaceFutureC2904a.h(new Runnable() { // from class: J.l
            @Override // java.lang.Runnable
            public final void run() {
                aVar.c(null);
            }
        }, I.c.b());
        return "transformVoidFuture [" + interfaceFutureC2904a + "]";
    }

    public static /* synthetic */ void h(c.a aVar, Object obj, boolean z10, InterfaceFutureC2904a interfaceFutureC2904a) {
        aVar.c(obj);
        if (z10) {
            interfaceFutureC2904a.cancel(true);
        }
    }

    public static void j(InterfaceFutureC2904a interfaceFutureC2904a, J.c cVar, Executor executor) {
        H0.g.g(cVar);
        interfaceFutureC2904a.h(new e(interfaceFutureC2904a, cVar), executor);
    }

    public static InterfaceFutureC2904a k(Collection collection) {
        return new p(new ArrayList(collection), true, I.c.b());
    }

    public static Object l(Future future) {
        H0.g.j(future.isDone(), "Future was expected to be done, " + future);
        return m(future);
    }

    public static Object m(Future future) {
        Object obj;
        boolean z10 = false;
        while (true) {
            try {
                obj = future.get();
                break;
            } catch (InterruptedException unused) {
                z10 = true;
            } catch (Throwable th) {
                if (z10) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z10) {
            Thread.currentThread().interrupt();
        }
        return obj;
    }

    public static InterfaceFutureC2904a n(Throwable th) {
        return new o.a(th);
    }

    public static ScheduledFuture o(Throwable th) {
        return new o.b(th);
    }

    public static InterfaceFutureC2904a p(Object obj) {
        return obj == null ? o.j() : new o.c(obj);
    }

    public static InterfaceFutureC2904a q(final long j10, final ScheduledExecutorService scheduledExecutorService, final Object obj, final boolean z10, final InterfaceFutureC2904a interfaceFutureC2904a) {
        return androidx.concurrent.futures.c.a(new c.InterfaceC0153c() { // from class: J.g
            @Override // androidx.concurrent.futures.c.InterfaceC0153c
            public final Object a(c.a aVar) {
                return n.a(interfaceFutureC2904a, scheduledExecutorService, obj, z10, j10, aVar);
            }
        });
    }

    public static InterfaceFutureC2904a r(final long j10, final ScheduledExecutorService scheduledExecutorService, final InterfaceFutureC2904a interfaceFutureC2904a) {
        return androidx.concurrent.futures.c.a(new c.InterfaceC0153c() { // from class: J.m
            @Override // androidx.concurrent.futures.c.InterfaceC0153c
            public final Object a(c.a aVar) {
                return n.d(interfaceFutureC2904a, scheduledExecutorService, j10, aVar);
            }
        });
    }

    public static InterfaceFutureC2904a s(final InterfaceFutureC2904a interfaceFutureC2904a) {
        H0.g.g(interfaceFutureC2904a);
        return interfaceFutureC2904a.isDone() ? interfaceFutureC2904a : androidx.concurrent.futures.c.a(new c.InterfaceC0153c() { // from class: J.j
            @Override // androidx.concurrent.futures.c.InterfaceC0153c
            public final Object a(c.a aVar) {
                return n.c(interfaceFutureC2904a, aVar);
            }
        });
    }

    public static void t(InterfaceFutureC2904a interfaceFutureC2904a, c.a aVar) {
        u(interfaceFutureC2904a, f5297a, aVar, I.c.b());
    }

    public static void u(InterfaceFutureC2904a interfaceFutureC2904a, InterfaceC2955a interfaceC2955a, c.a aVar, Executor executor) {
        v(true, interfaceFutureC2904a, interfaceC2955a, aVar, executor);
    }

    private static void v(boolean z10, InterfaceFutureC2904a interfaceFutureC2904a, InterfaceC2955a interfaceC2955a, c.a aVar, Executor executor) {
        H0.g.g(interfaceFutureC2904a);
        H0.g.g(interfaceC2955a);
        H0.g.g(aVar);
        H0.g.g(executor);
        j(interfaceFutureC2904a, new c(aVar, interfaceC2955a), executor);
        if (z10) {
            aVar.a(new d(interfaceFutureC2904a), I.c.b());
        }
    }

    public static InterfaceFutureC2904a w(Collection collection) {
        return new p(new ArrayList(collection), false, I.c.b());
    }

    public static InterfaceFutureC2904a x(InterfaceFutureC2904a interfaceFutureC2904a, InterfaceC2955a interfaceC2955a, Executor executor) {
        H0.g.g(interfaceC2955a);
        return y(interfaceFutureC2904a, new a(interfaceC2955a), executor);
    }

    public static InterfaceFutureC2904a y(InterfaceFutureC2904a interfaceFutureC2904a, J.a aVar, Executor executor) {
        J.b bVar = new J.b(aVar, interfaceFutureC2904a);
        interfaceFutureC2904a.h(bVar, executor);
        return bVar;
    }

    public static InterfaceFutureC2904a z(final InterfaceFutureC2904a interfaceFutureC2904a) {
        return androidx.concurrent.futures.c.a(new c.InterfaceC0153c() { // from class: J.k
            @Override // androidx.concurrent.futures.c.InterfaceC0153c
            public final Object a(c.a aVar) {
                return n.f(interfaceFutureC2904a, aVar);
            }
        });
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    class b implements InterfaceC2955a {
        b() {
        }

        @Override // n.InterfaceC2955a
        public Object apply(Object obj) {
            return obj;
        }
    }
}
