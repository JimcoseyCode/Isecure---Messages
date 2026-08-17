package x1;

import android.os.Process;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import x1.p;

/* JADX INFO: renamed from: x1.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
final class C3517a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f33266a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Executor f33267b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final Map f33268c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ReferenceQueue f33269d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private p.a f33270e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private volatile boolean f33271f;

    /* JADX INFO: renamed from: x1.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    class ThreadFactoryC0369a implements ThreadFactory {

        /* JADX INFO: renamed from: x1.a$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
        class RunnableC0370a implements Runnable {

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            final /* synthetic */ Runnable f33272g;

            RunnableC0370a(Runnable runnable) {
                this.f33272g = runnable;
            }

            @Override // java.lang.Runnable
            public void run() {
                Process.setThreadPriority(10);
                this.f33272g.run();
            }
        }

        ThreadFactoryC0369a() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            return new Thread(new RunnableC0370a(runnable), "glide-active-resources");
        }
    }

    /* JADX INFO: renamed from: x1.a$b */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C3517a.this.b();
        }
    }

    /* JADX INFO: renamed from: x1.a$c */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    static final class c extends WeakReference {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final v1.f f33275a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final boolean f33276b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        v f33277c;

        c(v1.f fVar, p pVar, ReferenceQueue referenceQueue, boolean z10) {
            super(pVar, referenceQueue);
            this.f33275a = (v1.f) Q1.k.e(fVar);
            this.f33277c = (pVar.e() && z10) ? (v) Q1.k.e(pVar.d()) : null;
            this.f33276b = pVar.e();
        }

        void a() {
            this.f33277c = null;
            clear();
        }
    }

    C3517a(boolean z10) {
        this(z10, Executors.newSingleThreadExecutor(new ThreadFactoryC0369a()));
    }

    synchronized void a(v1.f fVar, p pVar) {
        c cVar = (c) this.f33268c.put(fVar, new c(fVar, pVar, this.f33269d, this.f33266a));
        if (cVar != null) {
            cVar.a();
        }
    }

    void b() {
        while (!this.f33271f) {
            try {
                c((c) this.f33269d.remove());
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
        }
    }

    void c(c cVar) {
        v vVar;
        synchronized (this) {
            this.f33268c.remove(cVar.f33275a);
            if (cVar.f33276b && (vVar = cVar.f33277c) != null) {
                this.f33270e.a(cVar.f33275a, new p(vVar, true, false, cVar.f33275a, this.f33270e));
            }
        }
    }

    synchronized void d(v1.f fVar) {
        c cVar = (c) this.f33268c.remove(fVar);
        if (cVar != null) {
            cVar.a();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    synchronized p e(v1.f fVar) {
        c cVar = (c) this.f33268c.get(fVar);
        if (cVar == null) {
            return null;
        }
        p pVar = (p) cVar.get();
        if (pVar == null) {
            c(cVar);
        }
        return pVar;
    }

    void f(p.a aVar) {
        synchronized (aVar) {
            synchronized (this) {
                this.f33270e = aVar;
            }
        }
    }

    C3517a(boolean z10, Executor executor) {
        this.f33268c = new HashMap();
        this.f33269d = new ReferenceQueue();
        this.f33266a = z10;
        this.f33267b = executor;
        executor.execute(new b());
    }
}
