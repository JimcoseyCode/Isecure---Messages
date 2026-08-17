package R8;

import java.util.concurrent.locks.LockSupport;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: renamed from: R8.g, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
final class C1409g extends AbstractC1397a {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final Thread f10189j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final AbstractC1416j0 f10190k;

    public C1409g(n7.j jVar, Thread thread, AbstractC1416j0 abstractC1416j0) {
        super(jVar, true, true);
        this.f10189j = thread;
        this.f10190k = abstractC1416j0;
    }

    public final Object Q0() throws Throwable {
        AbstractC1401c.a();
        try {
            AbstractC1416j0 abstractC1416j0 = this.f10190k;
            if (abstractC1416j0 != null) {
                AbstractC1416j0.U0(abstractC1416j0, false, 1, null);
            }
            while (true) {
                try {
                    AbstractC1416j0 abstractC1416j02 = this.f10190k;
                    long jX0 = abstractC1416j02 != null ? abstractC1416j02.X0() : Long.MAX_VALUE;
                    if (isCompleted()) {
                        break;
                    }
                    AbstractC1401c.a();
                    LockSupport.parkNanos(this, jX0);
                    if (Thread.interrupted()) {
                        x(new InterruptedException());
                    }
                } catch (Throwable th) {
                    AbstractC1416j0 abstractC1416j03 = this.f10190k;
                    if (abstractC1416j03 != null) {
                        AbstractC1416j0.P0(abstractC1416j03, false, 1, null);
                    }
                    throw th;
                }
            }
            AbstractC1416j0 abstractC1416j04 = this.f10190k;
            if (abstractC1416j04 != null) {
                AbstractC1416j0.P0(abstractC1416j04, false, 1, null);
            }
            AbstractC1401c.a();
            Object objH = H0.h(V());
            B b10 = objH instanceof B ? (B) objH : null;
            if (b10 == null) {
                return objH;
            }
            throw b10.f10115a;
        } catch (Throwable th2) {
            AbstractC1401c.a();
            throw th2;
        }
    }

    @Override // R8.G0
    protected boolean f0() {
        return true;
    }

    @Override // R8.G0
    protected void u(Object obj) {
        if (AbstractC2855l.b(Thread.currentThread(), this.f10189j)) {
            return;
        }
        Thread thread = this.f10189j;
        AbstractC1401c.a();
        LockSupport.unpark(thread);
    }
}
