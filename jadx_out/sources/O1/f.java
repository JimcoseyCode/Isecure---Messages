package o1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public class f {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final ExecutorService f30449i = C3002b.a();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final Executor f30450j = C3002b.b();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final Executor f30451k = C3001a.c();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static f f30452l = new f((Object) null);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static f f30453m = new f(Boolean.TRUE);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static f f30454n = new f(Boolean.FALSE);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static f f30455o = new f(true);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f30457b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f30458c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Object f30459d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Exception f30460e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f30461f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private h f30462g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f30456a = new Object();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private List f30463h = new ArrayList();

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    class a implements o1.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ g f30464a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ o1.d f30465b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Executor f30466c;

        a(g gVar, o1.d dVar, Executor executor, AbstractC3003c abstractC3003c) {
            this.f30464a = gVar;
            this.f30465b = dVar;
            this.f30466c = executor;
        }

        @Override // o1.d
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Void a(f fVar) {
            f.d(this.f30464a, this.f30465b, fVar, this.f30466c, null);
            return null;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    static class b implements Runnable {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ g f30468g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ o1.d f30469h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        final /* synthetic */ f f30470i;

        b(AbstractC3003c abstractC3003c, g gVar, o1.d dVar, f fVar) {
            this.f30468g = gVar;
            this.f30469h = dVar;
            this.f30470i = fVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.f30468g.d(this.f30469h.a(this.f30470i));
            } catch (CancellationException unused) {
                this.f30468g.b();
            } catch (Exception e10) {
                this.f30468g.c(e10);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    static class c implements Runnable {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ g f30471g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ Callable f30472h;

        c(AbstractC3003c abstractC3003c, g gVar, Callable callable) {
            this.f30471g = gVar;
            this.f30472h = callable;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.f30471g.d(this.f30472h.call());
            } catch (CancellationException unused) {
                this.f30471g.b();
            } catch (Exception e10) {
                this.f30471g.c(e10);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public interface d {
    }

    f() {
    }

    public static f b(Callable callable, Executor executor) {
        return c(callable, executor, null);
    }

    public static f c(Callable callable, Executor executor, AbstractC3003c abstractC3003c) {
        g gVar = new g();
        try {
            executor.execute(new c(abstractC3003c, gVar, callable));
        } catch (Exception e10) {
            gVar.c(new e(e10));
        }
        return gVar.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void d(g gVar, o1.d dVar, f fVar, Executor executor, AbstractC3003c abstractC3003c) {
        try {
            executor.execute(new b(abstractC3003c, gVar, dVar, fVar));
        } catch (Exception e10) {
            gVar.c(new e(e10));
        }
    }

    public static f g(Exception exc) {
        g gVar = new g();
        gVar.c(exc);
        return gVar.a();
    }

    public static f h(Object obj) {
        if (obj == null) {
            return f30452l;
        }
        if (obj instanceof Boolean) {
            return ((Boolean) obj).booleanValue() ? f30453m : f30454n;
        }
        g gVar = new g();
        gVar.d(obj);
        return gVar.a();
    }

    public static d k() {
        return null;
    }

    private void o() {
        synchronized (this.f30456a) {
            Iterator it = this.f30463h.iterator();
            while (it.hasNext()) {
                try {
                    ((o1.d) it.next()).a(this);
                } catch (RuntimeException e10) {
                    throw e10;
                } catch (Exception e11) {
                    throw new RuntimeException(e11);
                }
            }
            this.f30463h = null;
        }
    }

    public f e(o1.d dVar) {
        return f(dVar, f30450j, null);
    }

    public f f(o1.d dVar, Executor executor, AbstractC3003c abstractC3003c) throws Throwable {
        o1.d dVar2;
        Executor executor2;
        AbstractC3003c abstractC3003c2;
        g gVar = new g();
        synchronized (this.f30456a) {
            try {
                try {
                    boolean zM = m();
                    if (zM) {
                        dVar2 = dVar;
                        executor2 = executor;
                        abstractC3003c2 = abstractC3003c;
                    } else {
                        dVar2 = dVar;
                        executor2 = executor;
                        abstractC3003c2 = abstractC3003c;
                        this.f30463h.add(new a(gVar, dVar2, executor2, abstractC3003c2));
                    }
                    if (zM) {
                        d(gVar, dVar2, this, executor2, abstractC3003c2);
                    }
                    return gVar.a();
                } catch (Throwable th) {
                    th = th;
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        }
    }

    public Exception i() {
        Exception exc;
        synchronized (this.f30456a) {
            try {
                if (this.f30460e != null) {
                    this.f30461f = true;
                }
                exc = this.f30460e;
            } catch (Throwable th) {
                throw th;
            }
        }
        return exc;
    }

    public Object j() {
        Object obj;
        synchronized (this.f30456a) {
            obj = this.f30459d;
        }
        return obj;
    }

    public boolean l() {
        boolean z10;
        synchronized (this.f30456a) {
            z10 = this.f30458c;
        }
        return z10;
    }

    public boolean m() {
        boolean z10;
        synchronized (this.f30456a) {
            z10 = this.f30457b;
        }
        return z10;
    }

    public boolean n() {
        boolean z10;
        synchronized (this.f30456a) {
            z10 = i() != null;
        }
        return z10;
    }

    boolean p() {
        synchronized (this.f30456a) {
            try {
                if (this.f30457b) {
                    return false;
                }
                this.f30457b = true;
                this.f30458c = true;
                this.f30456a.notifyAll();
                o();
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    boolean q(Exception exc) {
        synchronized (this.f30456a) {
            try {
                if (this.f30457b) {
                    return false;
                }
                this.f30457b = true;
                this.f30460e = exc;
                this.f30461f = false;
                this.f30456a.notifyAll();
                o();
                if (!this.f30461f) {
                    k();
                }
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    boolean r(Object obj) {
        synchronized (this.f30456a) {
            try {
                if (this.f30457b) {
                    return false;
                }
                this.f30457b = true;
                this.f30459d = obj;
                this.f30456a.notifyAll();
                o();
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private f(Object obj) {
        r(obj);
    }

    private f(boolean z10) {
        if (z10) {
            p();
        } else {
            r(null);
        }
    }
}
