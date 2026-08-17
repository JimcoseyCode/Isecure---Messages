package t9;

import i7.C2735B;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: t9.f, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public class C3389f extends G {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final a f32579i = new a(null);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final ReentrantLock f32580j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final Condition f32581k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final long f32582l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final long f32583m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static C3389f f32584n;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f32585f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private C3389f f32586g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private long f32587h;

    /* JADX INFO: renamed from: t9.f$a */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean d(C3389f c3389f) {
            ReentrantLock reentrantLockF = C3389f.f32579i.f();
            reentrantLockF.lock();
            try {
                if (!c3389f.f32585f) {
                    return false;
                }
                c3389f.f32585f = false;
                for (C3389f c3389f2 = C3389f.f32584n; c3389f2 != null; c3389f2 = c3389f2.f32586g) {
                    if (c3389f2.f32586g == c3389f) {
                        c3389f2.f32586g = c3389f.f32586g;
                        c3389f.f32586g = null;
                        return false;
                    }
                }
                reentrantLockF.unlock();
                return true;
            } finally {
                reentrantLockF.unlock();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void g(C3389f c3389f, long j10, boolean z10) {
            ReentrantLock reentrantLockF = C3389f.f32579i.f();
            reentrantLockF.lock();
            try {
                if (c3389f.f32585f) {
                    throw new IllegalStateException("Unbalanced enter/exit");
                }
                c3389f.f32585f = true;
                if (C3389f.f32584n == null) {
                    C3389f.f32584n = new C3389f();
                    new b().start();
                }
                long jNanoTime = System.nanoTime();
                if (j10 != 0 && z10) {
                    c3389f.f32587h = Math.min(j10, c3389f.c() - jNanoTime) + jNanoTime;
                } else if (j10 != 0) {
                    c3389f.f32587h = j10 + jNanoTime;
                } else {
                    if (!z10) {
                        throw new AssertionError();
                    }
                    c3389f.f32587h = c3389f.c();
                }
                long jY = c3389f.y(jNanoTime);
                C3389f c3389f2 = C3389f.f32584n;
                AbstractC2855l.d(c3389f2);
                while (c3389f2.f32586g != null) {
                    C3389f c3389f3 = c3389f2.f32586g;
                    AbstractC2855l.d(c3389f3);
                    if (jY < c3389f3.y(jNanoTime)) {
                        break;
                    }
                    c3389f2 = c3389f2.f32586g;
                    AbstractC2855l.d(c3389f2);
                }
                c3389f.f32586g = c3389f2.f32586g;
                c3389f2.f32586g = c3389f;
                if (c3389f2 == C3389f.f32584n) {
                    C3389f.f32579i.e().signal();
                }
                C2735B c2735b = C2735B.f28704a;
                reentrantLockF.unlock();
            } catch (Throwable th) {
                reentrantLockF.unlock();
                throw th;
            }
        }

        public final C3389f c() throws InterruptedException {
            C3389f c3389f = C3389f.f32584n;
            AbstractC2855l.d(c3389f);
            C3389f c3389f2 = c3389f.f32586g;
            if (c3389f2 == null) {
                long jNanoTime = System.nanoTime();
                e().await(C3389f.f32582l, TimeUnit.MILLISECONDS);
                C3389f c3389f3 = C3389f.f32584n;
                AbstractC2855l.d(c3389f3);
                if (c3389f3.f32586g != null || System.nanoTime() - jNanoTime < C3389f.f32583m) {
                    return null;
                }
                return C3389f.f32584n;
            }
            long jY = c3389f2.y(System.nanoTime());
            if (jY > 0) {
                e().await(jY, TimeUnit.NANOSECONDS);
                return null;
            }
            C3389f c3389f4 = C3389f.f32584n;
            AbstractC2855l.d(c3389f4);
            c3389f4.f32586g = c3389f2.f32586g;
            c3389f2.f32586g = null;
            return c3389f2;
        }

        public final Condition e() {
            return C3389f.f32581k;
        }

        public final ReentrantLock f() {
            return C3389f.f32580j;
        }

        private a() {
        }
    }

    /* JADX INFO: renamed from: t9.f$b */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    private static final class b extends Thread {
        public b() {
            super("Okio Watchdog");
            setDaemon(true);
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            ReentrantLock reentrantLockF;
            C3389f c3389fC;
            while (true) {
                try {
                    a aVar = C3389f.f32579i;
                    reentrantLockF = aVar.f();
                    reentrantLockF.lock();
                    try {
                        c3389fC = aVar.c();
                    } finally {
                        reentrantLockF.unlock();
                    }
                } catch (InterruptedException unused) {
                }
                if (c3389fC == C3389f.f32584n) {
                    C3389f.f32584n = null;
                    return;
                }
                C2735B c2735b = C2735B.f28704a;
                reentrantLockF.unlock();
                if (c3389fC != null) {
                    c3389fC.B();
                }
            }
        }
    }

    /* JADX INFO: renamed from: t9.f$c */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class c implements D {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ D f32589h;

        c(D d10) {
            this.f32589h = d10;
        }

        @Override // t9.D, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            C3389f c3389f = C3389f.this;
            D d10 = this.f32589h;
            c3389f.v();
            try {
                d10.close();
                C2735B c2735b = C2735B.f28704a;
                if (c3389f.w()) {
                    throw c3389f.p(null);
                }
            } catch (IOException e10) {
                if (!c3389f.w()) {
                    throw e10;
                }
                throw c3389f.p(e10);
            } finally {
                c3389f.w();
            }
        }

        @Override // t9.D
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public C3389f timeout() {
            return C3389f.this;
        }

        @Override // t9.D, java.io.Flushable
        public void flush() throws IOException {
            C3389f c3389f = C3389f.this;
            D d10 = this.f32589h;
            c3389f.v();
            try {
                d10.flush();
                C2735B c2735b = C2735B.f28704a;
                if (c3389f.w()) {
                    throw c3389f.p(null);
                }
            } catch (IOException e10) {
                if (!c3389f.w()) {
                    throw e10;
                }
                throw c3389f.p(e10);
            } finally {
                c3389f.w();
            }
        }

        public String toString() {
            return "AsyncTimeout.sink(" + this.f32589h + ')';
        }

        @Override // t9.D
        public void write(C3391h source, long j10) throws IOException {
            AbstractC2855l.g(source, "source");
            AbstractC3388e.b(source.size(), 0L, j10);
            while (true) {
                long j11 = 0;
                if (j10 <= 0) {
                    return;
                }
                A a10 = source.f32592g;
                AbstractC2855l.d(a10);
                while (true) {
                    if (j11 >= 65536) {
                        break;
                    }
                    j11 += (long) (a10.f32553c - a10.f32552b);
                    if (j11 >= j10) {
                        j11 = j10;
                        break;
                    } else {
                        a10 = a10.f32556f;
                        AbstractC2855l.d(a10);
                    }
                }
                C3389f c3389f = C3389f.this;
                D d10 = this.f32589h;
                c3389f.v();
                try {
                    try {
                        d10.write(source, j11);
                        C2735B c2735b = C2735B.f28704a;
                        if (c3389f.w()) {
                            throw c3389f.p(null);
                        }
                        j10 -= j11;
                    } catch (IOException e10) {
                        if (!c3389f.w()) {
                            throw e10;
                        }
                        throw c3389f.p(e10);
                    }
                } catch (Throwable th) {
                    c3389f.w();
                    throw th;
                }
            }
        }
    }

    /* JADX INFO: renamed from: t9.f$d */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class d implements F {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ F f32591h;

        d(F f10) {
            this.f32591h = f10;
        }

        @Override // t9.F, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            C3389f c3389f = C3389f.this;
            F f10 = this.f32591h;
            c3389f.v();
            try {
                f10.close();
                C2735B c2735b = C2735B.f28704a;
                if (c3389f.w()) {
                    throw c3389f.p(null);
                }
            } catch (IOException e10) {
                if (!c3389f.w()) {
                    throw e10;
                }
                throw c3389f.p(e10);
            } finally {
                c3389f.w();
            }
        }

        @Override // t9.F
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public C3389f timeout() {
            return C3389f.this;
        }

        @Override // t9.F
        public long read(C3391h sink, long j10) throws IOException {
            AbstractC2855l.g(sink, "sink");
            C3389f c3389f = C3389f.this;
            F f10 = this.f32591h;
            c3389f.v();
            try {
                long j11 = f10.read(sink, j10);
                if (c3389f.w()) {
                    throw c3389f.p(null);
                }
                return j11;
            } catch (IOException e10) {
                if (c3389f.w()) {
                    throw c3389f.p(e10);
                }
                throw e10;
            } finally {
                c3389f.w();
            }
        }

        public String toString() {
            return "AsyncTimeout.source(" + this.f32591h + ')';
        }
    }

    static {
        ReentrantLock reentrantLock = new ReentrantLock();
        f32580j = reentrantLock;
        Condition conditionNewCondition = reentrantLock.newCondition();
        AbstractC2855l.f(conditionNewCondition, "lock.newCondition()");
        f32581k = conditionNewCondition;
        long millis = TimeUnit.SECONDS.toMillis(60L);
        f32582l = millis;
        f32583m = TimeUnit.MILLISECONDS.toNanos(millis);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long y(long j10) {
        return this.f32587h - j10;
    }

    public final F A(F source) {
        AbstractC2855l.g(source, "source");
        return new d(source);
    }

    public final IOException p(IOException iOException) {
        return x(iOException);
    }

    public final void v() {
        long jH = h();
        boolean zE = e();
        if (jH != 0 || zE) {
            f32579i.g(this, jH, zE);
        }
    }

    public final boolean w() {
        return f32579i.d(this);
    }

    protected IOException x(IOException iOException) {
        InterruptedIOException interruptedIOException = new InterruptedIOException("timeout");
        if (iOException != null) {
            interruptedIOException.initCause(iOException);
        }
        return interruptedIOException;
    }

    public final D z(D sink) {
        AbstractC2855l.g(sink, "sink");
        return new c(sink);
    }

    protected void B() {
    }
}
