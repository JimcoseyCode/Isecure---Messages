package W8;

import R8.InterfaceC1408f0;
import R8.U;
import R8.X;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* JADX INFO: renamed from: W8.l, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class C1509l extends R8.J implements X {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f12184o = AtomicIntegerFieldUpdater.newUpdater(C1509l.class, "runningWorkers$volatile");

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final /* synthetic */ X f12185i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final R8.J f12186j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final int f12187k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final String f12188l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final C1514q f12189m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Object f12190n;
    private volatile /* synthetic */ int runningWorkers$volatile;

    /* JADX INFO: renamed from: W8.l$a */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    private final class a implements Runnable {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private Runnable f12191g;

        public a(Runnable runnable) {
            this.f12191g = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            int i10 = 0;
            while (true) {
                try {
                    this.f12191g.run();
                } catch (Throwable th) {
                    R8.L.a(n7.k.f30068g, th);
                }
                Runnable runnableT0 = C1509l.this.T0();
                if (runnableT0 == null) {
                    return;
                }
                try {
                    this.f12191g = runnableT0;
                    i10++;
                    if (i10 >= 16 && AbstractC1507j.d(C1509l.this.f12186j, C1509l.this)) {
                        AbstractC1507j.c(C1509l.this.f12186j, C1509l.this, this);
                        return;
                    }
                } catch (Throwable th2) {
                    Object obj = C1509l.this.f12190n;
                    C1509l c1509l = C1509l.this;
                    synchronized (obj) {
                        C1509l.S0().decrementAndGet(c1509l);
                        throw th2;
                    }
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1509l(R8.J j10, int i10, String str) {
        X x10 = j10 instanceof X ? (X) j10 : null;
        this.f12185i = x10 == null ? U.a() : x10;
        this.f12186j = j10;
        this.f12187k = i10;
        this.f12188l = str;
        this.f12189m = new C1514q(false);
        this.f12190n = new Object();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ AtomicIntegerFieldUpdater S0() {
        return f12184o;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Runnable T0() {
        while (true) {
            Runnable runnable = (Runnable) this.f12189m.e();
            if (runnable != null) {
                return runnable;
            }
            synchronized (this.f12190n) {
                f12184o.decrementAndGet(this);
                if (this.f12189m.c() == 0) {
                    return null;
                }
                f12184o.incrementAndGet(this);
            }
        }
    }

    private final boolean U0() {
        synchronized (this.f12190n) {
            if (f12184o.get(this) >= this.f12187k) {
                return false;
            }
            f12184o.incrementAndGet(this);
            return true;
        }
    }

    @Override // R8.X
    public InterfaceC1408f0 D0(long j10, Runnable runnable, n7.j jVar) {
        return this.f12185i.D0(j10, runnable, jVar);
    }

    @Override // R8.J
    public void J0(n7.j jVar, Runnable runnable) {
        Runnable runnableT0;
        this.f12189m.a(runnable);
        if (f12184o.get(this) >= this.f12187k || !U0() || (runnableT0 = T0()) == null) {
            return;
        }
        try {
            AbstractC1507j.c(this.f12186j, this, new a(runnableT0));
        } catch (Throwable th) {
            f12184o.decrementAndGet(this);
            throw th;
        }
    }

    @Override // R8.J
    public void K0(n7.j jVar, Runnable runnable) {
        Runnable runnableT0;
        this.f12189m.a(runnable);
        if (f12184o.get(this) >= this.f12187k || !U0() || (runnableT0 = T0()) == null) {
            return;
        }
        try {
            this.f12186j.K0(this, new a(runnableT0));
        } catch (Throwable th) {
            f12184o.decrementAndGet(this);
            throw th;
        }
    }

    @Override // R8.J
    public R8.J M0(int i10, String str) {
        AbstractC1510m.a(i10);
        return i10 >= this.f12187k ? AbstractC1510m.b(this, str) : super.M0(i10, str);
    }

    @Override // R8.J
    public String toString() {
        String str = this.f12188l;
        if (str != null) {
            return str;
        }
        return this.f12186j + ".limitedParallelism(" + this.f12187k + ')';
    }
}
