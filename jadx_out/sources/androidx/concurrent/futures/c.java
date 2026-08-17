package androidx.concurrent.futures;

import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import m5.InterfaceFutureC2904a;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public abstract class c {

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f15463a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        d f15464b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private f f15465c = f.D();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private boolean f15466d;

        a() {
        }

        private void e() {
            this.f15463a = null;
            this.f15464b = null;
            this.f15465c = null;
        }

        public void a(Runnable runnable, Executor executor) {
            f fVar = this.f15465c;
            if (fVar != null) {
                fVar.h(runnable, executor);
            }
        }

        void b() {
            this.f15463a = null;
            this.f15464b = null;
            this.f15465c.z(null);
        }

        public boolean c(Object obj) {
            this.f15466d = true;
            d dVar = this.f15464b;
            boolean z10 = dVar != null && dVar.b(obj);
            if (z10) {
                e();
            }
            return z10;
        }

        public boolean d() {
            this.f15466d = true;
            d dVar = this.f15464b;
            boolean z10 = dVar != null && dVar.a(true);
            if (z10) {
                e();
            }
            return z10;
        }

        public boolean f(Throwable th) {
            this.f15466d = true;
            d dVar = this.f15464b;
            boolean z10 = dVar != null && dVar.c(th);
            if (z10) {
                e();
            }
            return z10;
        }

        protected void finalize() {
            f fVar;
            d dVar = this.f15464b;
            if (dVar != null && !dVar.isDone()) {
                dVar.c(new b("The completer object was garbage collected - this future would otherwise never complete. The tag was: " + this.f15463a));
            }
            if (this.f15466d || (fVar = this.f15465c) == null) {
                return;
            }
            fVar.z(null);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    static final class b extends Throwable {
        b(String str) {
            super(str);
        }

        @Override // java.lang.Throwable
        public synchronized Throwable fillInStackTrace() {
            return this;
        }
    }

    /* JADX INFO: renamed from: androidx.concurrent.futures.c$c, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public interface InterfaceC0153c {
        Object a(a aVar);
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    private static final class d implements InterfaceFutureC2904a {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final WeakReference f15467g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private final androidx.concurrent.futures.a f15468h = new a();

        /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
        class a extends androidx.concurrent.futures.a {
            a() {
            }

            @Override // androidx.concurrent.futures.a
            protected String w() {
                a aVar = (a) d.this.f15467g.get();
                if (aVar == null) {
                    return "Completer object has been garbage collected, future will fail soon";
                }
                return "tag=[" + aVar.f15463a + "]";
            }
        }

        d(a aVar) {
            this.f15467g = new WeakReference(aVar);
        }

        boolean a(boolean z10) {
            return this.f15468h.cancel(z10);
        }

        boolean b(Object obj) {
            return this.f15468h.z(obj);
        }

        boolean c(Throwable th) {
            return this.f15468h.A(th);
        }

        @Override // java.util.concurrent.Future
        public boolean cancel(boolean z10) {
            a aVar = (a) this.f15467g.get();
            boolean zCancel = this.f15468h.cancel(z10);
            if (zCancel && aVar != null) {
                aVar.b();
            }
            return zCancel;
        }

        @Override // java.util.concurrent.Future
        public Object get() {
            return this.f15468h.get();
        }

        @Override // m5.InterfaceFutureC2904a
        public void h(Runnable runnable, Executor executor) {
            this.f15468h.h(runnable, executor);
        }

        @Override // java.util.concurrent.Future
        public boolean isCancelled() {
            return this.f15468h.isCancelled();
        }

        @Override // java.util.concurrent.Future
        public boolean isDone() {
            return this.f15468h.isDone();
        }

        public String toString() {
            return this.f15468h.toString();
        }

        @Override // java.util.concurrent.Future
        public Object get(long j10, TimeUnit timeUnit) {
            return this.f15468h.get(j10, timeUnit);
        }
    }

    public static InterfaceFutureC2904a a(InterfaceC0153c interfaceC0153c) {
        a aVar = new a();
        d dVar = new d(aVar);
        aVar.f15464b = dVar;
        aVar.f15463a = interfaceC0153c.getClass();
        try {
            Object objA = interfaceC0153c.a(aVar);
            if (objA == null) {
                return dVar;
            }
            aVar.f15463a = objA;
            return dVar;
        } catch (Exception e10) {
            dVar.c(e10);
            return dVar;
        }
    }
}
