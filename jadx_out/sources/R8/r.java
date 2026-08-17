package R8;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class r extends B {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f10216c = AtomicIntegerFieldUpdater.newUpdater(r.class, "_resumed$volatile");
    private volatile /* synthetic */ int _resumed$volatile;

    public r(n7.f fVar, Throwable th, boolean z10) {
        if (th == null) {
            th = new CancellationException("Continuation " + fVar + " was cancelled normally");
        }
        super(th, z10);
    }

    public final boolean e() {
        return f10216c.compareAndSet(this, 0, 1);
    }
}
