package c6;

import H4.AbstractC0801x;
import P4.AbstractC1367a;
import P4.AbstractC1378l;
import P4.AbstractC1381o;
import P4.C1368b;
import P4.C1379m;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import r4.AbstractC3268i;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class k {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AtomicInteger f18858b = new AtomicInteger(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final AtomicBoolean f18859c = new AtomicBoolean(false);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final n f18857a = new n();

    public AbstractC1378l a(final Executor executor, final Callable callable, final AbstractC1367a abstractC1367a) {
        AbstractC3268i.n(this.f18858b.get() > 0);
        if (abstractC1367a.a()) {
            return AbstractC1381o.d();
        }
        final C1368b c1368b = new C1368b();
        final C1379m c1379m = new C1379m(c1368b.b());
        this.f18857a.a(new Executor() { // from class: c6.y
            @Override // java.util.concurrent.Executor
            public final void execute(Runnable runnable) {
                try {
                    executor.execute(runnable);
                } catch (RuntimeException e10) {
                    if (abstractC1367a.a()) {
                        c1368b.a();
                    } else {
                        c1379m.b(e10);
                    }
                    throw e10;
                }
            }
        }, new Runnable() { // from class: c6.z
            @Override // java.lang.Runnable
            public final void run() {
                this.f18911g.g(abstractC1367a, c1368b, callable, c1379m);
            }
        });
        return c1379m.a();
    }

    public abstract void b();

    public void c() {
        this.f18858b.incrementAndGet();
    }

    protected abstract void d();

    public void e(Executor executor) {
        f(executor);
    }

    public AbstractC1378l f(Executor executor) {
        AbstractC3268i.n(this.f18858b.get() > 0);
        final C1379m c1379m = new C1379m();
        this.f18857a.a(executor, new Runnable() { // from class: c6.x
            @Override // java.lang.Runnable
            public final void run() {
                this.f18905g.h(c1379m);
            }
        });
        return c1379m.a();
    }

    final /* synthetic */ void g(AbstractC1367a abstractC1367a, C1368b c1368b, Callable callable, C1379m c1379m) {
        try {
            if (abstractC1367a.a()) {
                c1368b.a();
                return;
            }
            try {
                if (!this.f18859c.get()) {
                    b();
                    this.f18859c.set(true);
                }
                if (abstractC1367a.a()) {
                    c1368b.a();
                    return;
                }
                Object objCall = callable.call();
                if (abstractC1367a.a()) {
                    c1368b.a();
                } else {
                    c1379m.c(objCall);
                }
            } catch (RuntimeException e10) {
                throw new Y5.a("Internal error has occurred when executing ML Kit tasks", 13, e10);
            }
        } catch (Exception e11) {
            if (abstractC1367a.a()) {
                c1368b.a();
            } else {
                c1379m.b(e11);
            }
        }
    }

    final /* synthetic */ void h(C1379m c1379m) {
        int iDecrementAndGet = this.f18858b.decrementAndGet();
        AbstractC3268i.n(iDecrementAndGet >= 0);
        if (iDecrementAndGet == 0) {
            d();
            this.f18859c.set(false);
        }
        AbstractC0801x.a();
        c1379m.c(null);
    }
}
