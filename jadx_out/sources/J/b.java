package J;

import java.lang.reflect.UndeclaredThrowableException;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import m5.InterfaceFutureC2904a;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
class b extends d implements Runnable {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private J.a f5267i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final BlockingQueue f5268j = new LinkedBlockingQueue(1);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final CountDownLatch f5269k = new CountDownLatch(1);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private InterfaceFutureC2904a f5270l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    volatile InterfaceFutureC2904a f5271m;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    class a implements Runnable {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ InterfaceFutureC2904a f5272g;

        a(InterfaceFutureC2904a interfaceFutureC2904a) {
            this.f5272g = interfaceFutureC2904a;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                try {
                    try {
                        b.this.b(n.m(this.f5272g));
                    } catch (CancellationException unused) {
                        b.this.cancel(false);
                    }
                } catch (ExecutionException e10) {
                    b.this.c(e10.getCause());
                }
            } finally {
                b.this.f5271m = null;
            }
        }
    }

    b(J.a aVar, InterfaceFutureC2904a interfaceFutureC2904a) {
        this.f5267i = (J.a) H0.g.g(aVar);
        this.f5270l = (InterfaceFutureC2904a) H0.g.g(interfaceFutureC2904a);
    }

    private void f(Future future, boolean z10) {
        if (future != null) {
            future.cancel(z10);
        }
    }

    private void g(BlockingQueue blockingQueue, Object obj) {
        boolean z10 = false;
        while (true) {
            try {
                blockingQueue.put(obj);
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
    }

    private Object i(BlockingQueue blockingQueue) {
        Object objTake;
        boolean z10 = false;
        while (true) {
            try {
                objTake = blockingQueue.take();
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
        return objTake;
    }

    @Override // J.d, java.util.concurrent.Future
    public boolean cancel(boolean z10) {
        if (!super.cancel(z10)) {
            return false;
        }
        g(this.f5268j, Boolean.valueOf(z10));
        f(this.f5270l, z10);
        f(this.f5271m, z10);
        return true;
    }

    @Override // J.d, java.util.concurrent.Future
    public Object get() throws ExecutionException, InterruptedException {
        if (!isDone()) {
            InterfaceFutureC2904a interfaceFutureC2904a = this.f5270l;
            if (interfaceFutureC2904a != null) {
                interfaceFutureC2904a.get();
            }
            this.f5269k.await();
            InterfaceFutureC2904a interfaceFutureC2904a2 = this.f5271m;
            if (interfaceFutureC2904a2 != null) {
                interfaceFutureC2904a2.get();
            }
        }
        return super.get();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [J.a, m5.a] */
    /* JADX WARN: Type inference failed for: r0v1, types: [J.a, m5.a] */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4, types: [J.a, m5.a] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.util.concurrent.CountDownLatch] */
    /* JADX WARN: Type inference failed for: r0v9 */
    @Override // java.lang.Runnable
    public void run() {
        ?? r02;
        ?? r03 = 0;
        r03 = 0;
        r03 = 0;
        r03 = 0;
        r03 = 0;
        try {
            try {
                try {
                    try {
                        try {
                            InterfaceFutureC2904a interfaceFutureC2904aApply = this.f5267i.apply(n.m(this.f5270l));
                            this.f5271m = interfaceFutureC2904aApply;
                            if (isCancelled()) {
                                interfaceFutureC2904aApply.cancel(((Boolean) i(this.f5268j)).booleanValue());
                                this.f5271m = null;
                            } else {
                                interfaceFutureC2904aApply.h(new a(interfaceFutureC2904aApply), I.c.b());
                            }
                        } catch (Exception e10) {
                            c(e10);
                            r02 = r03;
                        }
                    } catch (Error e11) {
                        c(e11);
                        r02 = r03;
                    }
                } finally {
                    this.f5267i = r03;
                    this.f5270l = r03;
                    this.f5269k.countDown();
                }
            } catch (CancellationException unused) {
                cancel(false);
            } catch (ExecutionException e12) {
                c(e12.getCause());
            }
        } catch (UndeclaredThrowableException e13) {
            c(e13.getCause());
            r02 = r03;
        }
    }

    @Override // J.d, java.util.concurrent.Future
    public Object get(long j10, TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
        if (!isDone()) {
            TimeUnit timeUnit2 = TimeUnit.NANOSECONDS;
            if (timeUnit != timeUnit2) {
                j10 = timeUnit2.convert(j10, timeUnit);
                timeUnit = timeUnit2;
            }
            InterfaceFutureC2904a interfaceFutureC2904a = this.f5270l;
            if (interfaceFutureC2904a != null) {
                long jNanoTime = System.nanoTime();
                interfaceFutureC2904a.get(j10, timeUnit);
                j10 -= Math.max(0L, System.nanoTime() - jNanoTime);
            }
            long jNanoTime2 = System.nanoTime();
            if (this.f5269k.await(j10, timeUnit)) {
                j10 -= Math.max(0L, System.nanoTime() - jNanoTime2);
                InterfaceFutureC2904a interfaceFutureC2904a2 = this.f5271m;
                if (interfaceFutureC2904a2 != null) {
                    interfaceFutureC2904a2.get(j10, timeUnit);
                }
            } else {
                throw new TimeoutException();
            }
        }
        return super.get(j10, timeUnit);
    }
}
