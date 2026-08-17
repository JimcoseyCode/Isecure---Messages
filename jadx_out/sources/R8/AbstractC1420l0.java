package R8;

import R8.AbstractC1418k0;
import java.util.concurrent.locks.LockSupport;

/* JADX INFO: renamed from: R8.l0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC1420l0 extends AbstractC1416j0 {
    protected abstract Thread a1();

    protected void b1(long j10, AbstractC1418k0.b bVar) {
        T.f10156o.p1(j10, bVar);
    }

    protected final void c1() {
        Thread threadA1 = a1();
        if (Thread.currentThread() != threadA1) {
            AbstractC1401c.a();
            LockSupport.unpark(threadA1);
        }
    }
}
