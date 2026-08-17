package m2;

import android.util.Pair;
import c2.k;
import java.util.Map;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: m2.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2894a implements m2.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Map f29546a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Object f29549d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Throwable f29550e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private float f29551f = 0.0f;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f29548c = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private d f29547b = d.IN_PROGRESS;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final ConcurrentLinkedQueue f29552g = new ConcurrentLinkedQueue();

    /* JADX INFO: renamed from: m2.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    class RunnableC0314a implements Runnable {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ boolean f29553g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ e f29554h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        final /* synthetic */ boolean f29555i;

        RunnableC0314a(boolean z10, e eVar, boolean z11) {
            this.f29553g = z10;
            this.f29554h = eVar;
            this.f29555i = z11;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f29553g) {
                this.f29554h.onFailure(AbstractC2894a.this);
            } else if (this.f29555i) {
                this.f29554h.onCancellation(AbstractC2894a.this);
            } else {
                this.f29554h.onNewResult(AbstractC2894a.this);
            }
        }
    }

    /* JADX INFO: renamed from: m2.a$b */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    class b implements Runnable {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ e f29557g;

        b(e eVar) {
            this.f29557g = eVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f29557g.onProgressUpdate(AbstractC2894a.this);
        }
    }

    /* JADX INFO: renamed from: m2.a$c */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public interface c {
    }

    /* JADX INFO: renamed from: m2.a$d */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    private enum d {
        IN_PROGRESS,
        SUCCESS,
        FAILURE
    }

    protected AbstractC2894a() {
    }

    public static c g() {
        return null;
    }

    private void k() {
        boolean zH = h();
        boolean zU = u();
        for (Pair pair : this.f29552g) {
            j((e) pair.first, (Executor) pair.second, zH, zU);
        }
    }

    private synchronized boolean p(Throwable th, Map map) {
        if (!this.f29548c && this.f29547b == d.IN_PROGRESS) {
            this.f29547b = d.FAILURE;
            this.f29550e = th;
            this.f29546a = map;
            return true;
        }
        return false;
    }

    private synchronized boolean r(float f10) {
        if (!this.f29548c && this.f29547b == d.IN_PROGRESS) {
            if (f10 < this.f29551f) {
                return false;
            }
            this.f29551f = f10;
            return true;
        }
        return false;
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x0019 -> B:32:0x003a). Please report as a decompilation issue!!! */
    private boolean t(Object obj, boolean z10) {
        Object obj2;
        Object obj3 = null;
        try {
            synchronized (this) {
                try {
                    try {
                        if (!this.f29548c && this.f29547b == d.IN_PROGRESS) {
                            if (z10) {
                                this.f29547b = d.SUCCESS;
                                this.f29551f = 1.0f;
                            }
                            Object obj4 = this.f29549d;
                            if (obj4 != obj) {
                                try {
                                    this.f29549d = obj;
                                    obj2 = obj4;
                                } catch (Throwable th) {
                                    th = th;
                                    obj3 = obj4;
                                    throw th;
                                }
                            } else {
                                obj2 = null;
                            }
                            return true;
                        }
                        if (obj != null) {
                            f(obj);
                        }
                        return false;
                    } catch (Throwable th2) {
                        obj3 = obj;
                        th = th2;
                    }
                } catch (Throwable th3) {
                    th = th3;
                }
            }
        } finally {
            if (obj3 != null) {
                f(obj3);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0011  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private synchronized boolean u() {
        boolean z10;
        if (i()) {
            z10 = !isFinished();
        }
        return z10;
    }

    @Override // m2.c
    public synchronized boolean a() {
        return this.f29549d != null;
    }

    @Override // m2.c
    public synchronized Throwable b() {
        return this.f29550e;
    }

    @Override // m2.c
    public void c(e eVar, Executor executor) {
        k.g(eVar);
        k.g(executor);
        synchronized (this) {
            try {
                if (this.f29548c) {
                    return;
                }
                if (this.f29547b == d.IN_PROGRESS) {
                    this.f29552g.add(Pair.create(eVar, executor));
                }
                boolean z10 = a() || isFinished() || u();
                if (z10) {
                    j(eVar, executor, h(), u());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // m2.c
    public boolean close() {
        synchronized (this) {
            try {
                if (this.f29548c) {
                    return false;
                }
                this.f29548c = true;
                Object obj = this.f29549d;
                this.f29549d = null;
                if (obj != null) {
                    f(obj);
                }
                if (!isFinished()) {
                    k();
                }
                synchronized (this) {
                    this.f29552g.clear();
                }
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // m2.c
    public synchronized float d() {
        return this.f29551f;
    }

    @Override // m2.c
    public boolean e() {
        return false;
    }

    @Override // m2.c
    public Map getExtras() {
        return this.f29546a;
    }

    @Override // m2.c
    public synchronized Object getResult() {
        return this.f29549d;
    }

    public synchronized boolean h() {
        return this.f29547b == d.FAILURE;
    }

    public synchronized boolean i() {
        return this.f29548c;
    }

    @Override // m2.c
    public synchronized boolean isFinished() {
        return this.f29547b != d.IN_PROGRESS;
    }

    protected void j(e eVar, Executor executor, boolean z10, boolean z11) {
        RunnableC0314a runnableC0314a = new RunnableC0314a(z10, eVar, z11);
        g();
        executor.execute(runnableC0314a);
    }

    protected void l() {
        for (Pair pair : this.f29552g) {
            ((Executor) pair.second).execute(new b((e) pair.first));
        }
    }

    protected void m(Map map) {
        this.f29546a = map;
    }

    protected boolean n(Throwable th) {
        return o(th, null);
    }

    protected boolean o(Throwable th, Map map) {
        boolean zP = p(th, map);
        if (zP) {
            k();
        }
        return zP;
    }

    protected boolean q(float f10) {
        boolean zR = r(f10);
        if (zR) {
            l();
        }
        return zR;
    }

    protected boolean s(Object obj, boolean z10, Map map) {
        m(map);
        boolean zT = t(obj, z10);
        if (zT) {
            k();
        }
        return zT;
    }

    protected void f(Object obj) {
    }
}
