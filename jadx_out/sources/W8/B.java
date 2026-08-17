package W8;

import R8.O0;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class B extends AbstractC1500c implements O0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f12153d = AtomicIntegerFieldUpdater.newUpdater(B.class, "cleanedAndPointers$volatile");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f12154c;
    private volatile /* synthetic */ int cleanedAndPointers$volatile;

    public B(long j10, B b10, int i10) {
        super(b10);
        this.f12154c = j10;
        this.cleanedAndPointers$volatile = i10 << 16;
    }

    @Override // W8.AbstractC1500c
    public boolean k() {
        return f12153d.get(this) == r() && !l();
    }

    public final boolean p() {
        return f12153d.addAndGet(this, -65536) == r() && !l();
    }

    public abstract int r();

    public abstract void s(int i10, Throwable th, n7.j jVar);

    public final void t() {
        if (f12153d.incrementAndGet(this) == r()) {
            n();
        }
    }

    public final boolean u() {
        int i10;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f12153d;
        do {
            i10 = atomicIntegerFieldUpdater.get(this);
            if (i10 == r() && !l()) {
                return false;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i10, 65536 + i10));
        return true;
    }
}
