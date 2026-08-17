package x1;

import R1.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import v1.EnumC3417a;
import x1.RunnableC3524h;
import x1.p;

/* JADX INFO: renamed from: x1.l, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
class C3528l implements RunnableC3524h.b, a.f {

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private static final c f33403F = new c();

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    private boolean f33404A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    p f33405B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private RunnableC3524h f33406C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private volatile boolean f33407D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private boolean f33408E;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final e f33409g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final R1.c f33410h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final p.a f33411i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final H0.e f33412j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final c f33413k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final m f33414l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final A1.a f33415m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final A1.a f33416n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final A1.a f33417o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final A1.a f33418p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final AtomicInteger f33419q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private v1.f f33420r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private boolean f33421s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private boolean f33422t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private boolean f33423u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private boolean f33424v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private v f33425w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    EnumC3417a f33426x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private boolean f33427y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    q f33428z;

    /* JADX INFO: renamed from: x1.l$a */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    private class a implements Runnable {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final M1.g f33429g;

        a(M1.g gVar) {
            this.f33429g = gVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (this.f33429g.d()) {
                synchronized (C3528l.this) {
                    try {
                        if (C3528l.this.f33409g.o(this.f33429g)) {
                            C3528l.this.e(this.f33429g);
                        }
                        C3528l.this.h();
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: x1.l$b */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    private class b implements Runnable {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final M1.g f33431g;

        b(M1.g gVar) {
            this.f33431g = gVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (this.f33431g.d()) {
                synchronized (C3528l.this) {
                    try {
                        if (C3528l.this.f33409g.o(this.f33431g)) {
                            C3528l.this.f33405B.c();
                            C3528l.this.f(this.f33431g);
                            C3528l.this.r(this.f33431g);
                        }
                        C3528l.this.h();
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: x1.l$c */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    static class c {
        c() {
        }

        public p a(v vVar, boolean z10, v1.f fVar, p.a aVar) {
            return new p(vVar, z10, true, fVar, aVar);
        }
    }

    /* JADX INFO: renamed from: x1.l$d */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final M1.g f33433a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final Executor f33434b;

        d(M1.g gVar, Executor executor) {
            this.f33433a = gVar;
            this.f33434b = executor;
        }

        public boolean equals(Object obj) {
            if (obj instanceof d) {
                return this.f33433a.equals(((d) obj).f33433a);
            }
            return false;
        }

        public int hashCode() {
            return this.f33433a.hashCode();
        }
    }

    /* JADX INFO: renamed from: x1.l$e */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    static final class e implements Iterable {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final List f33435g;

        e() {
            this(new ArrayList(2));
        }

        private static d q(M1.g gVar) {
            return new d(gVar, Q1.e.a());
        }

        void clear() {
            this.f33435g.clear();
        }

        void d(M1.g gVar, Executor executor) {
            this.f33435g.add(new d(gVar, executor));
        }

        boolean isEmpty() {
            return this.f33435g.isEmpty();
        }

        @Override // java.lang.Iterable
        public Iterator iterator() {
            return this.f33435g.iterator();
        }

        boolean o(M1.g gVar) {
            return this.f33435g.contains(q(gVar));
        }

        e p() {
            return new e(new ArrayList(this.f33435g));
        }

        void r(M1.g gVar) {
            this.f33435g.remove(q(gVar));
        }

        int size() {
            return this.f33435g.size();
        }

        e(List list) {
            this.f33435g = list;
        }
    }

    C3528l(A1.a aVar, A1.a aVar2, A1.a aVar3, A1.a aVar4, m mVar, p.a aVar5, H0.e eVar) {
        this(aVar, aVar2, aVar3, aVar4, mVar, aVar5, eVar, f33403F);
    }

    private A1.a i() {
        return this.f33422t ? this.f33417o : this.f33423u ? this.f33418p : this.f33416n;
    }

    private boolean l() {
        return this.f33404A || this.f33427y || this.f33407D;
    }

    private synchronized void q() {
        if (this.f33420r == null) {
            throw new IllegalArgumentException();
        }
        this.f33409g.clear();
        this.f33420r = null;
        this.f33405B = null;
        this.f33425w = null;
        this.f33404A = false;
        this.f33407D = false;
        this.f33427y = false;
        this.f33408E = false;
        this.f33406C.H(false);
        this.f33406C = null;
        this.f33428z = null;
        this.f33426x = null;
        this.f33412j.release(this);
    }

    @Override // x1.RunnableC3524h.b
    public void a(q qVar) {
        synchronized (this) {
            this.f33428z = qVar;
        }
        n();
    }

    @Override // x1.RunnableC3524h.b
    public void b(v vVar, EnumC3417a enumC3417a, boolean z10) {
        synchronized (this) {
            this.f33425w = vVar;
            this.f33426x = enumC3417a;
            this.f33408E = z10;
        }
        o();
    }

    @Override // x1.RunnableC3524h.b
    public void c(RunnableC3524h runnableC3524h) {
        i().execute(runnableC3524h);
    }

    synchronized void d(M1.g gVar, Executor executor) {
        try {
            this.f33410h.c();
            this.f33409g.d(gVar, executor);
            if (this.f33427y) {
                j(1);
                executor.execute(new b(gVar));
            } else if (this.f33404A) {
                j(1);
                executor.execute(new a(gVar));
            } else {
                Q1.k.b(!this.f33407D, "Cannot add callbacks to a cancelled EngineJob");
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    void e(M1.g gVar) {
        try {
            gVar.a(this.f33428z);
        } catch (Throwable th) {
            throw new C3518b(th);
        }
    }

    void f(M1.g gVar) {
        try {
            gVar.b(this.f33405B, this.f33426x, this.f33408E);
        } catch (Throwable th) {
            throw new C3518b(th);
        }
    }

    void g() {
        if (l()) {
            return;
        }
        this.f33407D = true;
        this.f33406C.p();
        this.f33414l.d(this, this.f33420r);
    }

    void h() {
        p pVar;
        synchronized (this) {
            try {
                this.f33410h.c();
                Q1.k.b(l(), "Not yet complete!");
                int iDecrementAndGet = this.f33419q.decrementAndGet();
                Q1.k.b(iDecrementAndGet >= 0, "Can't decrement below 0");
                if (iDecrementAndGet == 0) {
                    pVar = this.f33405B;
                    q();
                } else {
                    pVar = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (pVar != null) {
            pVar.f();
        }
    }

    synchronized void j(int i10) {
        p pVar;
        Q1.k.b(l(), "Not yet complete!");
        if (this.f33419q.getAndAdd(i10) == 0 && (pVar = this.f33405B) != null) {
            pVar.c();
        }
    }

    synchronized C3528l k(v1.f fVar, boolean z10, boolean z11, boolean z12, boolean z13) {
        this.f33420r = fVar;
        this.f33421s = z10;
        this.f33422t = z11;
        this.f33423u = z12;
        this.f33424v = z13;
        return this;
    }

    @Override // R1.a.f
    public R1.c m() {
        return this.f33410h;
    }

    void n() {
        synchronized (this) {
            try {
                this.f33410h.c();
                if (this.f33407D) {
                    q();
                    return;
                }
                if (this.f33409g.isEmpty()) {
                    throw new IllegalStateException("Received an exception without any callbacks to notify");
                }
                if (this.f33404A) {
                    throw new IllegalStateException("Already failed once");
                }
                this.f33404A = true;
                v1.f fVar = this.f33420r;
                e<d> eVarP = this.f33409g.p();
                j(eVarP.size() + 1);
                this.f33414l.b(this, fVar, null);
                for (d dVar : eVarP) {
                    dVar.f33434b.execute(new a(dVar.f33433a));
                }
                h();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    void o() {
        synchronized (this) {
            try {
                this.f33410h.c();
                if (this.f33407D) {
                    this.f33425w.recycle();
                    q();
                    return;
                }
                if (this.f33409g.isEmpty()) {
                    throw new IllegalStateException("Received a resource without any callbacks to notify");
                }
                if (this.f33427y) {
                    throw new IllegalStateException("Already have resource");
                }
                this.f33405B = this.f33413k.a(this.f33425w, this.f33421s, this.f33420r, this.f33411i);
                this.f33427y = true;
                e<d> eVarP = this.f33409g.p();
                j(eVarP.size() + 1);
                this.f33414l.b(this, this.f33420r, this.f33405B);
                for (d dVar : eVarP) {
                    dVar.f33434b.execute(new b(dVar.f33433a));
                }
                h();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    boolean p() {
        return this.f33424v;
    }

    synchronized void r(M1.g gVar) {
        try {
            this.f33410h.c();
            this.f33409g.r(gVar);
            if (this.f33409g.isEmpty()) {
                g();
                if (this.f33427y || this.f33404A) {
                    if (this.f33419q.get() == 0) {
                        q();
                    }
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized void s(RunnableC3524h runnableC3524h) {
        try {
            this.f33406C = runnableC3524h;
            (runnableC3524h.P() ? this.f33415m : i()).execute(runnableC3524h);
        } catch (Throwable th) {
            throw th;
        }
    }

    C3528l(A1.a aVar, A1.a aVar2, A1.a aVar3, A1.a aVar4, m mVar, p.a aVar5, H0.e eVar, c cVar) {
        this.f33409g = new e();
        this.f33410h = R1.c.a();
        this.f33419q = new AtomicInteger();
        this.f33415m = aVar;
        this.f33416n = aVar2;
        this.f33417o = aVar3;
        this.f33418p = aVar4;
        this.f33414l = mVar;
        this.f33411i = aVar5;
        this.f33412j = eVar;
        this.f33413k = cVar;
    }
}
