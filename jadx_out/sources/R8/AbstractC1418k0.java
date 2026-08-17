package R8;

import R8.X;
import i7.C2735B;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: renamed from: R8.k0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC1418k0 extends AbstractC1420l0 implements X {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f10198l = AtomicReferenceFieldUpdater.newUpdater(AbstractC1418k0.class, Object.class, "_queue$volatile");

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f10199m = AtomicReferenceFieldUpdater.newUpdater(AbstractC1418k0.class, Object.class, "_delayed$volatile");

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f10200n = AtomicIntegerFieldUpdater.newUpdater(AbstractC1418k0.class, "_isCompleted$volatile");
    private volatile /* synthetic */ Object _delayed$volatile;
    private volatile /* synthetic */ int _isCompleted$volatile;
    private volatile /* synthetic */ Object _queue$volatile;

    /* JADX INFO: renamed from: R8.k0$a */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    private static final class a extends b {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private final Runnable f10201i;

        public a(long j10, Runnable runnable) {
            super(j10);
            this.f10201i = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f10201i.run();
        }

        @Override // R8.AbstractC1418k0.b
        public String toString() {
            return super.toString() + this.f10201i;
        }
    }

    /* JADX INFO: renamed from: R8.k0$b */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static abstract class b implements Runnable, Comparable, InterfaceC1408f0, W8.O {
        private volatile Object _heap;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public long f10202g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private int f10203h = -1;

        public b(long j10) {
            this.f10202g = j10;
        }

        @Override // R8.InterfaceC1408f0
        public final void dispose() {
            synchronized (this) {
                try {
                    Object obj = this._heap;
                    if (obj == AbstractC1424n0.f10207a) {
                        return;
                    }
                    c cVar = obj instanceof c ? (c) obj : null;
                    if (cVar != null) {
                        cVar.h(this);
                    }
                    this._heap = AbstractC1424n0.f10207a;
                    C2735B c2735b = C2735B.f28704a;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // W8.O
        public int getIndex() {
            return this.f10203h;
        }

        @Override // W8.O
        public void h(W8.N n10) {
            if (this._heap == AbstractC1424n0.f10207a) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            this._heap = n10;
        }

        @Override // W8.O
        public W8.N k() {
            Object obj = this._heap;
            if (obj instanceof W8.N) {
                return (W8.N) obj;
            }
            return null;
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
        public int compareTo(b bVar) {
            long j10 = this.f10202g - bVar.f10202g;
            if (j10 > 0) {
                return 1;
            }
            return j10 < 0 ? -1 : 0;
        }

        public final int p(long j10, c cVar, AbstractC1418k0 abstractC1418k0) {
            synchronized (this) {
                if (this._heap == AbstractC1424n0.f10207a) {
                    return 2;
                }
                synchronized (cVar) {
                    try {
                        b bVar = (b) cVar.b();
                        if (abstractC1418k0.isCompleted()) {
                            return 1;
                        }
                        if (bVar == null) {
                            cVar.f10204c = j10;
                        } else {
                            long j11 = bVar.f10202g;
                            if (j11 - j10 < 0) {
                                j10 = j11;
                            }
                            if (j10 - cVar.f10204c > 0) {
                                cVar.f10204c = j10;
                            }
                        }
                        long j12 = this.f10202g;
                        long j13 = cVar.f10204c;
                        if (j12 - j13 < 0) {
                            this.f10202g = j13;
                        }
                        cVar.a(this);
                        return 0;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        }

        public final boolean q(long j10) {
            return j10 - this.f10202g >= 0;
        }

        @Override // W8.O
        public void setIndex(int i10) {
            this.f10203h = i10;
        }

        public String toString() {
            return "Delayed[nanos=" + this.f10202g + ']';
        }
    }

    /* JADX INFO: renamed from: R8.k0$c */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class c extends W8.N {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public long f10204c;

        public c(long j10) {
            this.f10204c = j10;
        }
    }

    private final void e1() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f10198l;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj == null) {
                if (androidx.concurrent.futures.b.a(f10198l, this, null, AbstractC1424n0.f10208b)) {
                    return;
                }
            } else if (obj instanceof W8.r) {
                ((W8.r) obj).d();
                return;
            } else {
                if (obj == AbstractC1424n0.f10208b) {
                    return;
                }
                W8.r rVar = new W8.r(8, true);
                AbstractC2855l.e(obj, "null cannot be cast to non-null type java.lang.Runnable");
                rVar.a((Runnable) obj);
                if (androidx.concurrent.futures.b.a(f10198l, this, obj, rVar)) {
                    return;
                }
            }
        }
    }

    private final Runnable f1() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f10198l;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj == null) {
                return null;
            }
            if (obj instanceof W8.r) {
                AbstractC2855l.e(obj, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeTaskQueueCore<java.lang.Runnable>");
                W8.r rVar = (W8.r) obj;
                Object objM = rVar.m();
                if (objM != W8.r.f12201h) {
                    return (Runnable) objM;
                }
                androidx.concurrent.futures.b.a(f10198l, this, obj, rVar.l());
            } else {
                if (obj == AbstractC1424n0.f10208b) {
                    return null;
                }
                if (androidx.concurrent.futures.b.a(f10198l, this, obj, null)) {
                    AbstractC2855l.e(obj, "null cannot be cast to non-null type java.lang.Runnable");
                    return (Runnable) obj;
                }
            }
        }
    }

    private final void h1() {
        W8.O oI;
        c cVar = (c) f10199m.get(this);
        if (cVar == null || cVar.e()) {
            return;
        }
        AbstractC1401c.a();
        long jNanoTime = System.nanoTime();
        do {
            synchronized (cVar) {
                try {
                    W8.O oB = cVar.b();
                    if (oB != null) {
                        b bVar = (b) oB;
                        oI = bVar.q(jNanoTime) ? i1(bVar) : false ? cVar.i(0) : null;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        } while (((b) oI) != null);
    }

    private final boolean i1(Runnable runnable) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f10198l;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (isCompleted()) {
                return false;
            }
            if (obj == null) {
                if (androidx.concurrent.futures.b.a(f10198l, this, null, runnable)) {
                    return true;
                }
            } else if (obj instanceof W8.r) {
                AbstractC2855l.e(obj, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeTaskQueueCore<java.lang.Runnable>");
                W8.r rVar = (W8.r) obj;
                int iA = rVar.a(runnable);
                if (iA == 0) {
                    return true;
                }
                if (iA == 1) {
                    androidx.concurrent.futures.b.a(f10198l, this, obj, rVar.l());
                } else if (iA == 2) {
                    return false;
                }
            } else {
                if (obj == AbstractC1424n0.f10208b) {
                    return false;
                }
                W8.r rVar2 = new W8.r(8, true);
                AbstractC2855l.e(obj, "null cannot be cast to non-null type java.lang.Runnable");
                rVar2.a((Runnable) obj);
                rVar2.a(runnable);
                if (androidx.concurrent.futures.b.a(f10198l, this, obj, rVar2)) {
                    return true;
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isCompleted() {
        return f10200n.get(this) == 1;
    }

    private final void n1() {
        b bVar;
        AbstractC1401c.a();
        long jNanoTime = System.nanoTime();
        while (true) {
            c cVar = (c) f10199m.get(this);
            if (cVar == null || (bVar = (b) cVar.j()) == null) {
                return;
            } else {
                b1(jNanoTime, bVar);
            }
        }
    }

    private final int q1(long j10, b bVar) {
        if (isCompleted()) {
            return 1;
        }
        c cVar = (c) f10199m.get(this);
        if (cVar == null) {
            androidx.concurrent.futures.b.a(f10199m, this, null, new c(j10));
            Object obj = f10199m.get(this);
            AbstractC2855l.d(obj);
            cVar = (c) obj;
        }
        return bVar.p(j10, cVar, this);
    }

    private final void s1(boolean z10) {
        f10200n.set(this, z10 ? 1 : 0);
    }

    private final boolean t1(b bVar) {
        c cVar = (c) f10199m.get(this);
        return (cVar != null ? (b) cVar.f() : null) == bVar;
    }

    public InterfaceC1408f0 D0(long j10, Runnable runnable, n7.j jVar) {
        return X.a.a(this, j10, runnable, jVar);
    }

    @Override // R8.J
    public final void J0(n7.j jVar, Runnable runnable) {
        g1(runnable);
    }

    @Override // R8.AbstractC1416j0
    protected long S0() {
        b bVar;
        if (super.S0() == 0) {
            return 0L;
        }
        Object obj = f10198l.get(this);
        if (obj != null) {
            if (!(obj instanceof W8.r)) {
                return obj == AbstractC1424n0.f10208b ? Long.MAX_VALUE : 0L;
            }
            if (!((W8.r) obj).j()) {
                return 0L;
            }
        }
        c cVar = (c) f10199m.get(this);
        if (cVar == null || (bVar = (b) cVar.f()) == null) {
            return Long.MAX_VALUE;
        }
        long j10 = bVar.f10202g;
        AbstractC1401c.a();
        return B7.d.e(j10 - System.nanoTime(), 0L);
    }

    @Override // R8.AbstractC1416j0
    public long X0() {
        if (Y0()) {
            return 0L;
        }
        h1();
        Runnable runnableF1 = f1();
        if (runnableF1 == null) {
            return S0();
        }
        runnableF1.run();
        return 0L;
    }

    public void g1(Runnable runnable) {
        h1();
        if (i1(runnable)) {
            c1();
        } else {
            T.f10156o.g1(runnable);
        }
    }

    protected boolean m1() {
        if (!W0()) {
            return false;
        }
        c cVar = (c) f10199m.get(this);
        if (cVar != null && !cVar.e()) {
            return false;
        }
        Object obj = f10198l.get(this);
        if (obj == null) {
            return true;
        }
        return obj instanceof W8.r ? ((W8.r) obj).j() : obj == AbstractC1424n0.f10208b;
    }

    protected final void o1() {
        f10198l.set(this, null);
        f10199m.set(this, null);
    }

    public final void p1(long j10, b bVar) {
        int iQ1 = q1(j10, bVar);
        if (iQ1 == 0) {
            if (t1(bVar)) {
                c1();
            }
        } else if (iQ1 == 1) {
            b1(j10, bVar);
        } else if (iQ1 != 2) {
            throw new IllegalStateException("unexpected result");
        }
    }

    protected final InterfaceC1408f0 r1(long j10, Runnable runnable) {
        long jC = AbstractC1424n0.c(j10);
        if (jC >= 4611686018427387903L) {
            return N0.f10147g;
        }
        AbstractC1401c.a();
        long jNanoTime = System.nanoTime();
        a aVar = new a(jC + jNanoTime, runnable);
        p1(jNanoTime, aVar);
        return aVar;
    }

    @Override // R8.AbstractC1416j0
    public void shutdown() {
        V0.f10160a.c();
        s1(true);
        e1();
        while (X0() <= 0) {
        }
        n1();
    }
}
