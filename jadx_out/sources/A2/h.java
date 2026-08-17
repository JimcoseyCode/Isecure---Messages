package a2;

import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public abstract class h implements Runnable {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    protected final AtomicInteger f13680g = new AtomicInteger(0);

    public void a() {
        if (this.f13680g.compareAndSet(0, 2)) {
            d();
        }
    }

    protected abstract void b(Object obj);

    protected abstract Object c();

    protected abstract void d();

    protected abstract void e(Exception exc);

    protected abstract void f(Object obj);

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f13680g.compareAndSet(0, 1)) {
            try {
                Object objC = c();
                this.f13680g.set(3);
                try {
                    f(objC);
                } finally {
                    b(objC);
                }
            } catch (Exception e10) {
                this.f13680g.set(4);
                e(e10);
            }
        }
    }
}
