package R8;

import R8.AbstractC1418k0;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.LockSupport;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class T extends AbstractC1418k0 implements Runnable {
    private static volatile Thread _thread;
    private static volatile int debugStatus;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final T f10156o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final long f10157p;

    static {
        Long l10;
        T t10 = new T();
        f10156o = t10;
        AbstractC1416j0.U0(t10, false, 1, null);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        try {
            l10 = Long.getLong("kotlinx.coroutines.DefaultExecutor.keepAlive", 1000L);
        } catch (SecurityException unused) {
            l10 = 1000L;
        }
        f10157p = timeUnit.toNanos(l10.longValue());
    }

    private T() {
    }

    private final synchronized void u1() {
        if (x1()) {
            debugStatus = 3;
            o1();
            AbstractC2855l.e(this, "null cannot be cast to non-null type java.lang.Object");
            notifyAll();
        }
    }

    private final synchronized Thread v1() {
        Thread thread;
        thread = _thread;
        if (thread == null) {
            thread = new Thread(this, "kotlinx.coroutines.DefaultExecutor");
            _thread = thread;
            thread.setContextClassLoader(f10156o.getClass().getClassLoader());
            thread.setDaemon(true);
            thread.start();
        }
        return thread;
    }

    private final boolean w1() {
        return debugStatus == 4;
    }

    private final boolean x1() {
        int i10 = debugStatus;
        return i10 == 2 || i10 == 3;
    }

    private final synchronized boolean y1() {
        if (x1()) {
            return false;
        }
        debugStatus = 1;
        AbstractC2855l.e(this, "null cannot be cast to non-null type java.lang.Object");
        notifyAll();
        return true;
    }

    private final void z1() {
        throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
    }

    @Override // R8.AbstractC1418k0, R8.X
    public InterfaceC1408f0 D0(long j10, Runnable runnable, n7.j jVar) {
        return r1(j10, runnable);
    }

    @Override // R8.AbstractC1420l0
    protected Thread a1() {
        Thread thread = _thread;
        return thread == null ? v1() : thread;
    }

    @Override // R8.AbstractC1420l0
    protected void b1(long j10, AbstractC1418k0.b bVar) {
        z1();
    }

    @Override // R8.AbstractC1418k0
    public void g1(Runnable runnable) {
        if (w1()) {
            z1();
        }
        super.g1(runnable);
    }

    @Override // java.lang.Runnable
    public void run() {
        boolean zM1;
        V0.f10160a.d(this);
        AbstractC1401c.a();
        try {
            if (!y1()) {
                if (zM1) {
                    return;
                } else {
                    return;
                }
            }
            long j10 = Long.MAX_VALUE;
            while (true) {
                Thread.interrupted();
                long jX0 = X0();
                if (jX0 == Long.MAX_VALUE) {
                    AbstractC1401c.a();
                    long jNanoTime = System.nanoTime();
                    if (j10 == Long.MAX_VALUE) {
                        j10 = f10157p + jNanoTime;
                    }
                    long j11 = j10 - jNanoTime;
                    if (j11 <= 0) {
                        _thread = null;
                        u1();
                        AbstractC1401c.a();
                        if (m1()) {
                            return;
                        }
                        a1();
                        return;
                    }
                    jX0 = B7.d.i(jX0, j11);
                } else {
                    j10 = Long.MAX_VALUE;
                }
                if (jX0 > 0) {
                    if (x1()) {
                        _thread = null;
                        u1();
                        AbstractC1401c.a();
                        if (m1()) {
                            return;
                        }
                        a1();
                        return;
                    }
                    AbstractC1401c.a();
                    LockSupport.parkNanos(this, jX0);
                }
            }
        } finally {
            _thread = null;
            u1();
            AbstractC1401c.a();
            if (!m1()) {
                a1();
            }
        }
    }

    @Override // R8.AbstractC1418k0, R8.AbstractC1416j0
    public void shutdown() {
        debugStatus = 4;
        super.shutdown();
    }

    @Override // R8.J
    public String toString() {
        return "DefaultExecutor";
    }
}
