package F;

import F.V0;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import m5.InterfaceFutureC2904a;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public abstract class n1 implements V0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AtomicReference f1573b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f1572a = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f1574c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f1575d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Map f1576e = new HashMap();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final CopyOnWriteArraySet f1577f = new CopyOnWriteArraySet();

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    static abstract class a {
        a() {
        }

        static a b(Throwable th) {
            return new C0499o(th);
        }

        public abstract Throwable a();
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    private static final class b implements Runnable {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private static final Object f1578n = new Object();

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final Executor f1579g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private final V0.a f1580h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private final AtomicReference f1582j;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private final AtomicBoolean f1581i = new AtomicBoolean(true);

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private Object f1583k = f1578n;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private int f1584l = -1;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private boolean f1585m = false;

        b(AtomicReference atomicReference, Executor executor, V0.a aVar) {
            this.f1582j = atomicReference;
            this.f1579g = executor;
            this.f1580h = aVar;
        }

        void a() {
            this.f1581i.set(false);
        }

        void b(int i10) {
            synchronized (this) {
                try {
                    if (this.f1581i.get()) {
                        if (i10 <= this.f1584l) {
                            return;
                        }
                        this.f1584l = i10;
                        if (this.f1585m) {
                            return;
                        }
                        this.f1585m = true;
                        try {
                            this.f1579g.execute(this);
                        } catch (Throwable unused) {
                            synchronized (this) {
                                this.f1585m = false;
                            }
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (this) {
                try {
                    if (!this.f1581i.get()) {
                        this.f1585m = false;
                        return;
                    }
                    Object obj = this.f1582j.get();
                    int i10 = this.f1584l;
                    while (true) {
                        if (!Objects.equals(this.f1583k, obj)) {
                            this.f1583k = obj;
                            if (obj instanceof a) {
                                this.f1580h.onError(((a) obj).a());
                            } else {
                                this.f1580h.a(obj);
                            }
                        }
                        synchronized (this) {
                            try {
                                if (i10 == this.f1584l || !this.f1581i.get()) {
                                    break;
                                }
                                obj = this.f1582j.get();
                                i10 = this.f1584l;
                            } finally {
                            }
                        }
                    }
                    this.f1585m = false;
                } finally {
                }
            }
        }
    }

    n1(Object obj, boolean z10) {
        if (!z10) {
            this.f1573b = new AtomicReference(obj);
        } else {
            H0.g.b(obj instanceof Throwable, "Initial errors must be Throwable");
            this.f1573b = new AtomicReference(a.b((Throwable) obj));
        }
    }

    private void b(V0.a aVar) {
        b bVar = (b) this.f1576e.remove(aVar);
        if (bVar != null) {
            bVar.a();
            this.f1577f.remove(bVar);
        }
    }

    private void i(Object obj) {
        Iterator it;
        int i10;
        synchronized (this.f1572a) {
            try {
                if (Objects.equals(this.f1573b.getAndSet(obj), obj)) {
                    return;
                }
                int i11 = this.f1574c + 1;
                this.f1574c = i11;
                if (this.f1575d) {
                    return;
                }
                this.f1575d = true;
                Iterator it2 = this.f1577f.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        ((b) it2.next()).b(i11);
                    } else {
                        synchronized (this.f1572a) {
                            try {
                                if (this.f1574c == i11) {
                                    this.f1575d = false;
                                    return;
                                } else {
                                    it = this.f1577f.iterator();
                                    i10 = this.f1574c;
                                }
                            } finally {
                            }
                        }
                        it2 = it;
                        i11 = i10;
                    }
                }
            } finally {
            }
        }
    }

    @Override // F.V0
    public void c(Executor executor, V0.a aVar) {
        b bVar;
        synchronized (this.f1572a) {
            b(aVar);
            bVar = new b(this.f1573b, executor, aVar);
            this.f1576e.put(aVar, bVar);
            this.f1577f.add(bVar);
        }
        bVar.b(0);
    }

    @Override // F.V0
    public InterfaceFutureC2904a d() {
        Object obj = this.f1573b.get();
        return obj instanceof a ? J.n.n(((a) obj).a()) : J.n.p(obj);
    }

    @Override // F.V0
    public void e(V0.a aVar) {
        synchronized (this.f1572a) {
            b(aVar);
        }
    }

    public void f() {
        synchronized (this.f1572a) {
            try {
                Iterator it = new HashSet(this.f1576e.keySet()).iterator();
                while (it.hasNext()) {
                    b((V0.a) it.next());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    void g(Object obj) {
        i(obj);
    }

    void h(Throwable th) {
        i(a.b(th));
    }
}
