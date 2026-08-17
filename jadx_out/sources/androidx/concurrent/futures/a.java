package androidx.concurrent.futures;

import com.facebook.hermes.intl.Constants;
import java.util.Locale;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;
import m5.InterfaceFutureC2904a;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public abstract class a implements InterfaceFutureC2904a {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    static final boolean f15438j = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", Constants.CASEFIRST_FALSE));

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final Logger f15439k = Logger.getLogger(a.class.getName());

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    static final b f15440l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final Object f15441m;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    volatile Object f15442g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    volatile e f15443h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    volatile h f15444i;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    private static abstract class b {
        private b() {
        }

        abstract boolean a(a aVar, e eVar, e eVar2);

        abstract boolean b(a aVar, Object obj, Object obj2);

        abstract boolean c(a aVar, h hVar, h hVar2);

        abstract void d(h hVar, h hVar2);

        abstract void e(h hVar, Thread thread);
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    private static final class c {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        static final c f15445c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        static final c f15446d;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final boolean f15447a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final Throwable f15448b;

        static {
            if (a.f15438j) {
                f15446d = null;
                f15445c = null;
            } else {
                f15446d = new c(false, null);
                f15445c = new c(true, null);
            }
        }

        c(boolean z10, Throwable th) {
            this.f15447a = z10;
            this.f15448b = th;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    private static final class d {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        static final d f15449b = new d(new C0152a("Failure occurred while trying to finish a future."));

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Throwable f15450a;

        /* JADX INFO: renamed from: androidx.concurrent.futures.a$d$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
        class C0152a extends Throwable {
            C0152a(String str) {
                super(str);
            }

            @Override // java.lang.Throwable
            public synchronized Throwable fillInStackTrace() {
                return this;
            }
        }

        d(Throwable th) {
            this.f15450a = (Throwable) a.p(th);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    private static final class e {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        static final e f15451d = new e(null, null);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Runnable f15452a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final Executor f15453b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        e f15454c;

        e(Runnable runnable, Executor executor) {
            this.f15452a = runnable;
            this.f15453b = executor;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    private static final class f extends b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final AtomicReferenceFieldUpdater f15455a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final AtomicReferenceFieldUpdater f15456b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final AtomicReferenceFieldUpdater f15457c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final AtomicReferenceFieldUpdater f15458d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final AtomicReferenceFieldUpdater f15459e;

        f(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
            super();
            this.f15455a = atomicReferenceFieldUpdater;
            this.f15456b = atomicReferenceFieldUpdater2;
            this.f15457c = atomicReferenceFieldUpdater3;
            this.f15458d = atomicReferenceFieldUpdater4;
            this.f15459e = atomicReferenceFieldUpdater5;
        }

        @Override // androidx.concurrent.futures.a.b
        boolean a(a aVar, e eVar, e eVar2) {
            return androidx.concurrent.futures.b.a(this.f15458d, aVar, eVar, eVar2);
        }

        @Override // androidx.concurrent.futures.a.b
        boolean b(a aVar, Object obj, Object obj2) {
            return androidx.concurrent.futures.b.a(this.f15459e, aVar, obj, obj2);
        }

        @Override // androidx.concurrent.futures.a.b
        boolean c(a aVar, h hVar, h hVar2) {
            return androidx.concurrent.futures.b.a(this.f15457c, aVar, hVar, hVar2);
        }

        @Override // androidx.concurrent.futures.a.b
        void d(h hVar, h hVar2) {
            this.f15456b.lazySet(hVar, hVar2);
        }

        @Override // androidx.concurrent.futures.a.b
        void e(h hVar, Thread thread) {
            this.f15455a.lazySet(hVar, thread);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    private static final class g extends b {
        g() {
            super();
        }

        @Override // androidx.concurrent.futures.a.b
        boolean a(a aVar, e eVar, e eVar2) {
            synchronized (aVar) {
                try {
                    if (aVar.f15443h != eVar) {
                        return false;
                    }
                    aVar.f15443h = eVar2;
                    return true;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // androidx.concurrent.futures.a.b
        boolean b(a aVar, Object obj, Object obj2) {
            synchronized (aVar) {
                try {
                    if (aVar.f15442g != obj) {
                        return false;
                    }
                    aVar.f15442g = obj2;
                    return true;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // androidx.concurrent.futures.a.b
        boolean c(a aVar, h hVar, h hVar2) {
            synchronized (aVar) {
                try {
                    if (aVar.f15444i != hVar) {
                        return false;
                    }
                    aVar.f15444i = hVar2;
                    return true;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // androidx.concurrent.futures.a.b
        void d(h hVar, h hVar2) {
            hVar.f15462b = hVar2;
        }

        @Override // androidx.concurrent.futures.a.b
        void e(h hVar, Thread thread) {
            hVar.f15461a = thread;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    private static final class h {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        static final h f15460c = new h(false);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        volatile Thread f15461a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        volatile h f15462b;

        h(boolean z10) {
        }

        void a(h hVar) {
            a.f15440l.d(this, hVar);
        }

        void b() {
            Thread thread = this.f15461a;
            if (thread != null) {
                this.f15461a = null;
                LockSupport.unpark(thread);
            }
        }

        h() {
            a.f15440l.e(this, Thread.currentThread());
        }
    }

    static {
        b gVar;
        try {
            gVar = new f(AtomicReferenceFieldUpdater.newUpdater(h.class, Thread.class, "a"), AtomicReferenceFieldUpdater.newUpdater(h.class, h.class, "b"), AtomicReferenceFieldUpdater.newUpdater(a.class, h.class, "i"), AtomicReferenceFieldUpdater.newUpdater(a.class, e.class, "h"), AtomicReferenceFieldUpdater.newUpdater(a.class, Object.class, "g"));
            th = null;
        } catch (Throwable th) {
            th = th;
            gVar = new g();
        }
        f15440l = gVar;
        if (th != null) {
            f15439k.log(Level.SEVERE, "SafeAtomicHelper is broken!", th);
        }
        f15441m = new Object();
    }

    protected a() {
    }

    private String B(Object obj) {
        return obj == this ? "this future" : String.valueOf(obj);
    }

    private void j(StringBuilder sb) {
        try {
            Object objU = u(this);
            sb.append("SUCCESS, result=[");
            sb.append(B(objU));
            sb.append("]");
        } catch (CancellationException unused) {
            sb.append("CANCELLED");
        } catch (RuntimeException e10) {
            sb.append("UNKNOWN, cause=[");
            sb.append(e10.getClass());
            sb.append(" thrown from get()]");
        } catch (ExecutionException e11) {
            sb.append("FAILURE, cause=[");
            sb.append(e11.getCause());
            sb.append("]");
        }
    }

    private static CancellationException m(String str, Throwable th) {
        CancellationException cancellationException = new CancellationException(str);
        cancellationException.initCause(th);
        return cancellationException;
    }

    static Object p(Object obj) {
        obj.getClass();
        return obj;
    }

    private e q(e eVar) {
        e eVar2;
        do {
            eVar2 = this.f15443h;
        } while (!f15440l.a(this, eVar2, e.f15451d));
        e eVar3 = eVar;
        e eVar4 = eVar2;
        while (eVar4 != null) {
            e eVar5 = eVar4.f15454c;
            eVar4.f15454c = eVar3;
            eVar3 = eVar4;
            eVar4 = eVar5;
        }
        return eVar3;
    }

    static void r(a aVar) {
        aVar.x();
        aVar.k();
        e eVarQ = aVar.q(null);
        while (eVarQ != null) {
            e eVar = eVarQ.f15454c;
            s(eVarQ.f15452a, eVarQ.f15453b);
            eVarQ = eVar;
        }
    }

    private static void s(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e10) {
            f15439k.log(Level.SEVERE, "RuntimeException while executing runnable " + runnable + " with executor " + executor, (Throwable) e10);
        }
    }

    private Object t(Object obj) throws ExecutionException {
        if (obj instanceof c) {
            throw m("Task was cancelled.", ((c) obj).f15448b);
        }
        if (obj instanceof d) {
            throw new ExecutionException(((d) obj).f15450a);
        }
        if (obj == f15441m) {
            return null;
        }
        return obj;
    }

    static Object u(Future future) {
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

    private void x() {
        h hVar;
        do {
            hVar = this.f15444i;
        } while (!f15440l.c(this, hVar, h.f15460c));
        while (hVar != null) {
            hVar.b();
            hVar = hVar.f15462b;
        }
    }

    private void y(h hVar) {
        hVar.f15461a = null;
        while (true) {
            h hVar2 = this.f15444i;
            if (hVar2 == h.f15460c) {
                return;
            }
            h hVar3 = null;
            while (hVar2 != null) {
                h hVar4 = hVar2.f15462b;
                if (hVar2.f15461a != null) {
                    hVar3 = hVar2;
                } else if (hVar3 != null) {
                    hVar3.f15462b = hVar4;
                    if (hVar3.f15461a == null) {
                        break;
                    }
                } else if (!f15440l.c(this, hVar2, hVar4)) {
                    break;
                }
                hVar2 = hVar4;
            }
            return;
        }
    }

    protected boolean A(Throwable th) {
        if (!f15440l.b(this, null, new d((Throwable) p(th)))) {
            return false;
        }
        r(this);
        return true;
    }

    protected final boolean C() {
        Object obj = this.f15442g;
        return (obj instanceof c) && ((c) obj).f15447a;
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z10) {
        Object obj = this.f15442g;
        if (obj == null) {
            if (f15440l.b(this, obj, f15438j ? new c(z10, new CancellationException("Future.cancel() was called.")) : z10 ? c.f15445c : c.f15446d)) {
                if (z10) {
                    v();
                }
                r(this);
                return true;
            }
        }
        return false;
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j10, TimeUnit timeUnit) throws InterruptedException, TimeoutException {
        long nanos = timeUnit.toNanos(j10);
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj = this.f15442g;
        if (obj != null) {
            return t(obj);
        }
        long jNanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
        if (nanos >= 1000) {
            h hVar = this.f15444i;
            if (hVar != h.f15460c) {
                h hVar2 = new h();
                do {
                    hVar2.a(hVar);
                    if (f15440l.c(this, hVar, hVar2)) {
                        do {
                            LockSupport.parkNanos(this, nanos);
                            if (Thread.interrupted()) {
                                y(hVar2);
                                throw new InterruptedException();
                            }
                            Object obj2 = this.f15442g;
                            if (obj2 != null) {
                                return t(obj2);
                            }
                            nanos = jNanoTime - System.nanoTime();
                        } while (nanos >= 1000);
                        y(hVar2);
                    } else {
                        hVar = this.f15444i;
                    }
                } while (hVar != h.f15460c);
            }
            return t(this.f15442g);
        }
        while (nanos > 0) {
            Object obj3 = this.f15442g;
            if (obj3 != null) {
                return t(obj3);
            }
            if (Thread.interrupted()) {
                throw new InterruptedException();
            }
            nanos = jNanoTime - System.nanoTime();
        }
        String string = toString();
        String string2 = timeUnit.toString();
        Locale locale = Locale.ROOT;
        String lowerCase = string2.toLowerCase(locale);
        String str = "Waited " + j10 + " " + timeUnit.toString().toLowerCase(locale);
        if (nanos + 1000 < 0) {
            String str2 = str + " (plus ";
            long j11 = -nanos;
            long jConvert = timeUnit.convert(j11, TimeUnit.NANOSECONDS);
            long nanos2 = j11 - timeUnit.toNanos(jConvert);
            boolean z10 = jConvert == 0 || nanos2 > 1000;
            if (jConvert > 0) {
                String str3 = str2 + jConvert + " " + lowerCase;
                if (z10) {
                    str3 = str3 + ",";
                }
                str2 = str3 + " ";
            }
            if (z10) {
                str2 = str2 + nanos2 + " nanoseconds ";
            }
            str = str2 + "delay)";
        }
        if (isDone()) {
            throw new TimeoutException(str + " but future completed as timeout expired");
        }
        throw new TimeoutException(str + " for " + string);
    }

    @Override // m5.InterfaceFutureC2904a
    public final void h(Runnable runnable, Executor executor) {
        p(runnable);
        p(executor);
        e eVar = this.f15443h;
        if (eVar != e.f15451d) {
            e eVar2 = new e(runnable, executor);
            do {
                eVar2.f15454c = eVar;
                if (f15440l.a(this, eVar, eVar2)) {
                    return;
                } else {
                    eVar = this.f15443h;
                }
            } while (eVar != e.f15451d);
        }
        s(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f15442g instanceof c;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.f15442g != null;
    }

    public String toString() {
        String strW;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("[status=");
        if (isCancelled()) {
            sb.append("CANCELLED");
        } else if (isDone()) {
            j(sb);
        } else {
            try {
                strW = w();
            } catch (RuntimeException e10) {
                strW = "Exception thrown from implementation: " + e10.getClass();
            }
            if (strW != null && !strW.isEmpty()) {
                sb.append("PENDING, info=[");
                sb.append(strW);
                sb.append("]");
            } else if (isDone()) {
                j(sb);
            } else {
                sb.append("PENDING");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected String w() {
        if (!(this instanceof ScheduledFuture)) {
            return null;
        }
        return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
    }

    protected boolean z(Object obj) {
        if (obj == null) {
            obj = f15441m;
        }
        if (!f15440l.b(this, null, obj)) {
            return false;
        }
        r(this);
        return true;
    }

    protected void k() {
    }

    protected void v() {
    }

    @Override // java.util.concurrent.Future
    public final Object get() throws InterruptedException {
        Object obj;
        if (!Thread.interrupted()) {
            Object obj2 = this.f15442g;
            if (obj2 != null) {
                return t(obj2);
            }
            h hVar = this.f15444i;
            if (hVar != h.f15460c) {
                h hVar2 = new h();
                do {
                    hVar2.a(hVar);
                    if (f15440l.c(this, hVar, hVar2)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.f15442g;
                            } else {
                                y(hVar2);
                                throw new InterruptedException();
                            }
                        } while (!(obj != null));
                        return t(obj);
                    }
                    hVar = this.f15444i;
                } while (hVar != h.f15460c);
            }
            return t(this.f15442g);
        }
        throw new InterruptedException();
    }
}
