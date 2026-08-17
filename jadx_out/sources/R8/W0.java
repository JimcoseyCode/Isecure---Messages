package R8;

import i7.C2742e;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
final class W0 extends F0 {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f10162m = AtomicIntegerFieldUpdater.newUpdater(W0.class, "_state$volatile");
    private volatile /* synthetic */ int _state$volatile;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final Thread f10163k = Thread.currentThread();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private InterfaceC1408f0 f10164l;

    private final Void A(int i10) {
        throw new IllegalStateException(("Illegal state " + i10).toString());
    }

    public final void B(A0 a02) {
        int i10;
        this.f10164l = E0.j(a02, false, this, 1, null);
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f10162m;
        do {
            i10 = atomicIntegerFieldUpdater.get(this);
            if (i10 != 0) {
                if (i10 == 2 || i10 == 3) {
                    return;
                }
                A(i10);
                throw new C2742e();
            }
        } while (!f10162m.compareAndSet(this, i10, 0));
    }

    @Override // R8.F0
    public boolean v() {
        return true;
    }

    @Override // R8.F0
    public void w(Throwable th) {
        int i10;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f10162m;
        do {
            i10 = atomicIntegerFieldUpdater.get(this);
            if (i10 != 0) {
                if (i10 == 1 || i10 == 2 || i10 == 3) {
                    return;
                }
                A(i10);
                throw new C2742e();
            }
        } while (!f10162m.compareAndSet(this, i10, 2));
        this.f10163k.interrupt();
        f10162m.set(this, 3);
    }

    public final void y() {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f10162m;
        while (true) {
            int i10 = atomicIntegerFieldUpdater.get(this);
            if (i10 != 0) {
                if (i10 != 2) {
                    if (i10 == 3) {
                        Thread.interrupted();
                        return;
                    } else {
                        A(i10);
                        throw new C2742e();
                    }
                }
            } else if (f10162m.compareAndSet(this, i10, 1)) {
                InterfaceC1408f0 interfaceC1408f0 = this.f10164l;
                if (interfaceC1408f0 != null) {
                    interfaceC1408f0.dispose();
                    return;
                }
                return;
            }
        }
    }
}
