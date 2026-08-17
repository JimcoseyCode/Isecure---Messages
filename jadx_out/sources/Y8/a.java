package Y8;

import R8.AbstractC1401c;
import R8.S;
import W8.E;
import W8.z;
import com.facebook.react.uimanager.ViewDefaults;
import i7.C2735B;
import i7.C2750m;
import java.io.Closeable;
import java.lang.Thread;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.C;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p7.AbstractC3083a;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class a implements Executor, Closeable {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final C0135a f13095n = new C0135a(null);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final /* synthetic */ AtomicLongFieldUpdater f13096o = AtomicLongFieldUpdater.newUpdater(a.class, "parkedWorkersStack$volatile");

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final /* synthetic */ AtomicLongFieldUpdater f13097p = AtomicLongFieldUpdater.newUpdater(a.class, "controlState$volatile");

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f13098q = AtomicIntegerFieldUpdater.newUpdater(a.class, "_isTerminated$volatile");

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final E f13099r = new E("NOT_IN_STACK");
    private volatile /* synthetic */ int _isTerminated$volatile;
    private volatile /* synthetic */ long controlState$volatile;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f13100g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f13101h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final long f13102i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final String f13103j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Y8.d f13104k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Y8.d f13105l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final z f13106m;
    private volatile /* synthetic */ long parkedWorkersStack$volatile;

    /* JADX INFO: renamed from: Y8.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class C0135a {
        public /* synthetic */ C0135a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C0135a() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f13107a;

        static {
            int[] iArr = new int[d.values().length];
            try {
                iArr[d.f13119i.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[d.f13118h.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[d.f13117g.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[d.f13120j.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[d.f13121k.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f13107a = iArr;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class d {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final d f13117g = new d("CPU_ACQUIRED", 0);

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final d f13118h = new d("BLOCKING", 1);

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static final d f13119i = new d("PARKING", 2);

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public static final d f13120j = new d("DORMANT", 3);

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public static final d f13121k = new d("TERMINATED", 4);

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private static final /* synthetic */ d[] f13122l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private static final /* synthetic */ EnumEntries f13123m;

        static {
            d[] dVarArrH = h();
            f13122l = dVarArrH;
            f13123m = AbstractC3083a.a(dVarArrH);
        }

        private d(String str, int i10) {
        }

        private static final /* synthetic */ d[] h() {
            return new d[]{f13117g, f13118h, f13119i, f13120j, f13121k};
        }

        public static d valueOf(String str) {
            return (d) Enum.valueOf(d.class, str);
        }

        public static d[] values() {
            return (d[]) f13122l.clone();
        }
    }

    public a(int i10, int i11, long j10, String str) {
        this.f13100g = i10;
        this.f13101h = i11;
        this.f13102i = j10;
        this.f13103j = str;
        if (i10 < 1) {
            throw new IllegalArgumentException(("Core pool size " + i10 + " should be at least 1").toString());
        }
        if (i11 < i10) {
            throw new IllegalArgumentException(("Max pool size " + i11 + " should be greater than or equals to core pool size " + i10).toString());
        }
        if (i11 > 2097150) {
            throw new IllegalArgumentException(("Max pool size " + i11 + " should not exceed maximal supported number of threads 2097150").toString());
        }
        if (j10 > 0) {
            this.f13104k = new Y8.d();
            this.f13105l = new Y8.d();
            this.f13106m = new z((i10 + 1) * 2);
            this.controlState$volatile = ((long) i10) << 42;
            return;
        }
        throw new IllegalArgumentException(("Idle worker keep alive time " + j10 + " must be positive").toString());
    }

    static /* synthetic */ boolean A0(a aVar, long j10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            j10 = f13097p.get(aVar);
        }
        return aVar.y0(j10);
    }

    public static /* synthetic */ void B(a aVar, Runnable runnable, boolean z10, boolean z11, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        if ((i10 & 4) != 0) {
            z11 = false;
        }
        aVar.A(runnable, z10, z11);
    }

    private final boolean D0() {
        c cVarX;
        do {
            cVarX = X();
            if (cVarX == null) {
                return false;
            }
        } while (!c.f13108o.compareAndSet(cVarX, -1, 0));
        LockSupport.unpark(cVarX);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ AtomicLongFieldUpdater I() {
        return f13097p;
    }

    private final int W(c cVar) {
        Object objG = cVar.g();
        while (objG != f13099r) {
            if (objG == null) {
                return 0;
            }
            c cVar2 = (c) objG;
            int iF = cVar2.f();
            if (iF != 0) {
                return iF;
            }
            objG = cVar2.g();
        }
        return -1;
    }

    private final c X() {
        AtomicLongFieldUpdater atomicLongFieldUpdater = f13096o;
        while (true) {
            long j10 = atomicLongFieldUpdater.get(this);
            c cVar = (c) this.f13106m.b((int) (2097151 & j10));
            if (cVar == null) {
                return null;
            }
            long j11 = (2097152 + j10) & (-2097152);
            int iW = W(cVar);
            if (iW >= 0 && f13096o.compareAndSet(this, j10, ((long) iW) | j11)) {
                cVar.o(f13099r);
                return cVar;
            }
        }
    }

    private final boolean e(h hVar) {
        return hVar.f13134h ? this.f13105l.a(hVar) : this.f13104k.a(hVar);
    }

    private final int k() {
        synchronized (this.f13106m) {
            try {
                if (isTerminated()) {
                    return -1;
                }
                long j10 = f13097p.get(this);
                int i10 = (int) (j10 & 2097151);
                int iD = B7.d.d(i10 - ((int) ((j10 & 4398044413952L) >> 21)), 0);
                if (iD >= this.f13100g) {
                    return 0;
                }
                if (i10 >= this.f13101h) {
                    return 0;
                }
                int i11 = ((int) (I().get(this) & 2097151)) + 1;
                if (i11 <= 0 || this.f13106m.b(i11) != null) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
                c cVar = new c(this, i11);
                this.f13106m.c(i11, cVar);
                if (i11 != ((int) (2097151 & f13097p.incrementAndGet(this)))) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
                int i12 = iD + 1;
                cVar.start();
                return i12;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private final c s() {
        Thread threadCurrentThread = Thread.currentThread();
        c cVar = threadCurrentThread instanceof c ? (c) threadCurrentThread : null;
        if (cVar == null || !AbstractC2855l.b(a.this, this)) {
            return null;
        }
        return cVar;
    }

    private final void t0(long j10) {
        if (D0() || y0(j10)) {
            return;
        }
        D0();
    }

    private final h w0(c cVar, h hVar, boolean z10) {
        d dVar;
        if (cVar == null || (dVar = cVar.f13111i) == d.f13121k) {
            return hVar;
        }
        if (!hVar.f13134h && dVar == d.f13118h) {
            return hVar;
        }
        cVar.f13115m = true;
        return cVar.f13109g.a(hVar, z10);
    }

    private final boolean y0(long j10) {
        if (B7.d.d(((int) (2097151 & j10)) - ((int) ((j10 & 4398044413952L) >> 21)), 0) < this.f13100g) {
            int iK = k();
            if (iK == 1 && this.f13100g > 1) {
                k();
            }
            if (iK > 0) {
                return true;
            }
        }
        return false;
    }

    public final void A(Runnable runnable, boolean z10, boolean z11) {
        AbstractC1401c.a();
        h hVarR = r(runnable, z10);
        boolean z12 = hVarR.f13134h;
        long jAddAndGet = z12 ? f13097p.addAndGet(this, 2097152L) : 0L;
        h hVarW0 = w0(s(), hVarR, z11);
        if (hVarW0 != null && !e(hVarW0)) {
            throw new RejectedExecutionException(this.f13103j + " was terminated");
        }
        if (z12) {
            t0(jAddAndGet);
        } else {
            u0();
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws InterruptedException {
        l0(10000L);
    }

    public final boolean d0(c cVar) {
        long j10;
        int iF;
        if (cVar.g() != f13099r) {
            return false;
        }
        AtomicLongFieldUpdater atomicLongFieldUpdater = f13096o;
        do {
            j10 = atomicLongFieldUpdater.get(this);
            iF = cVar.f();
            cVar.o(this.f13106m.b((int) (2097151 & j10)));
        } while (!f13096o.compareAndSet(this, j10, ((2097152 + j10) & (-2097152)) | ((long) iF)));
        return true;
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        B(this, runnable, false, false, 6, null);
    }

    public final void g0(c cVar, int i10, int i11) {
        AtomicLongFieldUpdater atomicLongFieldUpdater = f13096o;
        while (true) {
            long j10 = atomicLongFieldUpdater.get(this);
            int iW = (int) (2097151 & j10);
            long j11 = (2097152 + j10) & (-2097152);
            if (iW == i10) {
                iW = i11 == 0 ? W(cVar) : i11;
            }
            if (iW >= 0) {
                if (f13096o.compareAndSet(this, j10, j11 | ((long) iW))) {
                    return;
                }
            }
        }
    }

    public final boolean isTerminated() {
        return f13098q.get(this) == 1;
    }

    public final void k0(h hVar) {
        try {
            hVar.run();
        } catch (Throwable th) {
            try {
                Thread threadCurrentThread = Thread.currentThread();
                threadCurrentThread.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread, th);
            } finally {
                AbstractC1401c.a();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x005f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void l0(long j10) throws InterruptedException {
        int i10;
        h hVarE;
        if (f13098q.compareAndSet(this, 0, 1)) {
            c cVarS = s();
            synchronized (this.f13106m) {
                i10 = (int) (I().get(this) & 2097151);
            }
            if (1 <= i10) {
                int i11 = 1;
                while (true) {
                    Object objB = this.f13106m.b(i11);
                    AbstractC2855l.d(objB);
                    c cVar = (c) objB;
                    if (cVar != cVarS) {
                        while (cVar.getState() != Thread.State.TERMINATED) {
                            LockSupport.unpark(cVar);
                            cVar.join(j10);
                        }
                        cVar.f13109g.j(this.f13105l);
                    }
                    if (i11 == i10) {
                        break;
                    } else {
                        i11++;
                    }
                }
            }
            this.f13105l.b();
            this.f13104k.b();
            while (true) {
                if (cVarS == null) {
                    hVarE = (h) this.f13104k.e();
                    if (hVarE == null && (hVarE = (h) this.f13105l.e()) == null) {
                        break;
                    }
                } else {
                    hVarE = cVarS.e(true);
                    if (hVarE != null) {
                        continue;
                    }
                }
                k0(hVarE);
            }
            if (cVarS != null) {
                cVarS.r(d.f13121k);
            }
            f13096o.set(this, 0L);
            f13097p.set(this, 0L);
        }
    }

    public final h r(Runnable runnable, boolean z10) {
        long jA = j.f13141f.a();
        if (!(runnable instanceof h)) {
            return j.b(runnable, jA, z10);
        }
        h hVar = (h) runnable;
        hVar.f13133g = jA;
        hVar.f13134h = z10;
        return hVar;
    }

    public String toString() {
        ArrayList arrayList = new ArrayList();
        int iA = this.f13106m.a();
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        for (int i15 = 1; i15 < iA; i15++) {
            c cVar = (c) this.f13106m.b(i15);
            if (cVar != null) {
                int i16 = cVar.f13109g.i();
                int i17 = b.f13107a[cVar.f13111i.ordinal()];
                if (i17 == 1) {
                    i12++;
                } else if (i17 == 2) {
                    i11++;
                    StringBuilder sb = new StringBuilder();
                    sb.append(i16);
                    sb.append('b');
                    arrayList.add(sb.toString());
                } else if (i17 == 3) {
                    i10++;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(i16);
                    sb2.append('c');
                    arrayList.add(sb2.toString());
                } else if (i17 == 4) {
                    i13++;
                    if (i16 > 0) {
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append(i16);
                        sb3.append('d');
                        arrayList.add(sb3.toString());
                    }
                } else {
                    if (i17 != 5) {
                        throw new C2750m();
                    }
                    i14++;
                }
            }
        }
        long j10 = f13097p.get(this);
        return this.f13103j + '@' + S.b(this) + "[Pool Size {core = " + this.f13100g + ", max = " + this.f13101h + "}, Worker States {CPU = " + i10 + ", blocking = " + i11 + ", parked = " + i12 + ", dormant = " + i13 + ", terminated = " + i14 + "}, running workers queues = " + arrayList + ", global CPU queue size = " + this.f13104k.c() + ", global blocking queue size = " + this.f13105l.c() + ", Control State {created workers= " + ((int) (2097151 & j10)) + ", blocking tasks = " + ((int) ((4398044413952L & j10) >> 21)) + ", CPUs acquired = " + (this.f13100g - ((int) ((9223367638808264704L & j10) >> 42))) + "}]";
    }

    public final void u0() {
        if (D0() || A0(this, 0L, 1, null)) {
            return;
        }
        D0();
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public final class c extends Thread {

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private static final /* synthetic */ AtomicIntegerFieldUpdater f13108o = AtomicIntegerFieldUpdater.newUpdater(c.class, "workerCtl$volatile");

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final l f13109g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private final C f13110h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public d f13111i;
        private volatile int indexInArray;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private long f13112j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private long f13113k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private int f13114l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public boolean f13115m;
        private volatile Object nextParkedWorker;
        private volatile /* synthetic */ int workerCtl$volatile;

        private c() {
            setDaemon(true);
            setContextClassLoader(a.this.getClass().getClassLoader());
            this.f13109g = new l();
            this.f13110h = new C();
            this.f13111i = d.f13120j;
            this.nextParkedWorker = a.f13099r;
            int iNanoTime = (int) System.nanoTime();
            this.f13114l = iNanoTime == 0 ? 42 : iNanoTime;
        }

        private final void b(h hVar) {
            this.f13112j = 0L;
            if (this.f13111i == d.f13119i) {
                this.f13111i = d.f13118h;
            }
            if (!hVar.f13134h) {
                a.this.k0(hVar);
                return;
            }
            if (r(d.f13118h)) {
                a.this.u0();
            }
            a.this.k0(hVar);
            a.I().addAndGet(a.this, -2097152L);
            if (this.f13111i != d.f13121k) {
                this.f13111i = d.f13120j;
            }
        }

        private final h c(boolean z10) {
            h hVarL;
            h hVarL2;
            if (z10) {
                boolean z11 = j(a.this.f13100g * 2) == 0;
                if (z11 && (hVarL2 = l()) != null) {
                    return hVarL2;
                }
                h hVarK = this.f13109g.k();
                if (hVarK != null) {
                    return hVarK;
                }
                if (!z11 && (hVarL = l()) != null) {
                    return hVarL;
                }
            } else {
                h hVarL3 = l();
                if (hVarL3 != null) {
                    return hVarL3;
                }
            }
            return s(3);
        }

        private final h d() {
            h hVarL = this.f13109g.l();
            if (hVarL != null) {
                return hVarL;
            }
            h hVar = (h) a.this.f13105l.e();
            return hVar == null ? s(1) : hVar;
        }

        private final boolean i() {
            return this.nextParkedWorker != a.f13099r;
        }

        private final void k() {
            if (this.f13112j == 0) {
                this.f13112j = System.nanoTime() + a.this.f13102i;
            }
            LockSupport.parkNanos(a.this.f13102i);
            if (System.nanoTime() - this.f13112j >= 0) {
                this.f13112j = 0L;
                t();
            }
        }

        private final h l() {
            if (j(2) == 0) {
                h hVar = (h) a.this.f13104k.e();
                return hVar != null ? hVar : (h) a.this.f13105l.e();
            }
            h hVar2 = (h) a.this.f13105l.e();
            return hVar2 != null ? hVar2 : (h) a.this.f13104k.e();
        }

        private final void m() {
            loop0: while (true) {
                boolean z10 = false;
                while (!a.this.isTerminated() && this.f13111i != d.f13121k) {
                    h hVarE = e(this.f13115m);
                    if (hVarE != null) {
                        this.f13113k = 0L;
                        b(hVarE);
                    } else {
                        this.f13115m = false;
                        if (this.f13113k == 0) {
                            q();
                        } else if (z10) {
                            r(d.f13119i);
                            Thread.interrupted();
                            LockSupport.parkNanos(this.f13113k);
                            this.f13113k = 0L;
                        } else {
                            z10 = true;
                        }
                    }
                }
                break loop0;
            }
            r(d.f13121k);
        }

        private final boolean p() {
            long j10;
            if (this.f13111i == d.f13117g) {
                return true;
            }
            a aVar = a.this;
            AtomicLongFieldUpdater atomicLongFieldUpdaterI = a.I();
            do {
                j10 = atomicLongFieldUpdaterI.get(aVar);
                if (((int) ((9223367638808264704L & j10) >> 42)) == 0) {
                    return false;
                }
            } while (!a.I().compareAndSet(aVar, j10, j10 - 4398046511104L));
            this.f13111i = d.f13117g;
            return true;
        }

        private final void q() {
            if (!i()) {
                a.this.d0(this);
                return;
            }
            f13108o.set(this, -1);
            while (i() && f13108o.get(this) == -1 && !a.this.isTerminated() && this.f13111i != d.f13121k) {
                r(d.f13119i);
                Thread.interrupted();
                k();
            }
        }

        private final h s(int i10) {
            int i11 = (int) (a.I().get(a.this) & 2097151);
            if (i11 < 2) {
                return null;
            }
            int iJ = j(i11);
            a aVar = a.this;
            long jMin = Long.MAX_VALUE;
            for (int i12 = 0; i12 < i11; i12++) {
                iJ++;
                if (iJ > i11) {
                    iJ = 1;
                }
                c cVar = (c) aVar.f13106m.b(iJ);
                if (cVar != null && cVar != this) {
                    long jR = cVar.f13109g.r(i10, this.f13110h);
                    if (jR == -1) {
                        C c10 = this.f13110h;
                        h hVar = (h) c10.f29371g;
                        c10.f29371g = null;
                        return hVar;
                    }
                    if (jR > 0) {
                        jMin = Math.min(jMin, jR);
                    }
                }
            }
            if (jMin == Long.MAX_VALUE) {
                jMin = 0;
            }
            this.f13113k = jMin;
            return null;
        }

        private final void t() {
            a aVar = a.this;
            synchronized (aVar.f13106m) {
                try {
                    if (aVar.isTerminated()) {
                        return;
                    }
                    if (((int) (a.I().get(aVar) & 2097151)) <= aVar.f13100g) {
                        return;
                    }
                    if (f13108o.compareAndSet(this, -1, 1)) {
                        int i10 = this.indexInArray;
                        n(0);
                        aVar.g0(this, i10, 0);
                        int andDecrement = (int) (a.I().getAndDecrement(aVar) & 2097151);
                        if (andDecrement != i10) {
                            Object objB = aVar.f13106m.b(andDecrement);
                            AbstractC2855l.d(objB);
                            c cVar = (c) objB;
                            aVar.f13106m.c(i10, cVar);
                            cVar.n(i10);
                            aVar.g0(cVar, andDecrement, i10);
                        }
                        aVar.f13106m.c(andDecrement, null);
                        C2735B c2735b = C2735B.f28704a;
                        this.f13111i = d.f13121k;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        public final h e(boolean z10) {
            return p() ? c(z10) : d();
        }

        public final int f() {
            return this.indexInArray;
        }

        public final Object g() {
            return this.nextParkedWorker;
        }

        public final int j(int i10) {
            int i11 = this.f13114l;
            int i12 = i11 ^ (i11 << 13);
            int i13 = i12 ^ (i12 >> 17);
            int i14 = i13 ^ (i13 << 5);
            this.f13114l = i14;
            int i15 = i10 - 1;
            return (i15 & i10) == 0 ? i14 & i15 : (i14 & ViewDefaults.NUMBER_OF_LINES) % i10;
        }

        public final void n(int i10) {
            StringBuilder sb = new StringBuilder();
            sb.append(a.this.f13103j);
            sb.append("-worker-");
            sb.append(i10 == 0 ? "TERMINATED" : String.valueOf(i10));
            setName(sb.toString());
            this.indexInArray = i10;
        }

        public final void o(Object obj) {
            this.nextParkedWorker = obj;
        }

        public final boolean r(d dVar) {
            d dVar2 = this.f13111i;
            boolean z10 = dVar2 == d.f13117g;
            if (z10) {
                a.I().addAndGet(a.this, 4398046511104L);
            }
            if (dVar2 != dVar) {
                this.f13111i = dVar;
            }
            return z10;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            m();
        }

        public c(a aVar, int i10) {
            this();
            n(i10);
        }
    }
}
