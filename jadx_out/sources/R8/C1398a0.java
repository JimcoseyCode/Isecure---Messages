package R8;

import W8.AbstractC1507j;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import o7.AbstractC3016b;

/* JADX INFO: renamed from: R8.a0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class C1398a0 extends W8.A {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f10169k = AtomicIntegerFieldUpdater.newUpdater(C1398a0.class, "_decision$volatile");
    private volatile /* synthetic */ int _decision$volatile;

    public C1398a0(n7.j jVar, n7.f fVar) {
        super(jVar, fVar);
    }

    private final boolean T0() {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f10169k;
        do {
            int i10 = atomicIntegerFieldUpdater.get(this);
            if (i10 != 0) {
                if (i10 == 1) {
                    return false;
                }
                throw new IllegalStateException("Already resumed");
            }
        } while (!f10169k.compareAndSet(this, 0, 2));
        return true;
    }

    private final boolean U0() {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f10169k;
        do {
            int i10 = atomicIntegerFieldUpdater.get(this);
            if (i10 != 0) {
                if (i10 == 2) {
                    return false;
                }
                throw new IllegalStateException("Already suspended");
            }
        } while (!f10169k.compareAndSet(this, 0, 1));
        return true;
    }

    @Override // W8.A, R8.AbstractC1397a
    protected void M0(Object obj) {
        if (T0()) {
            return;
        }
        AbstractC1507j.b(AbstractC3016b.c(this.f12152j), D.a(obj, this.f12152j));
    }

    public final Object R0() {
        if (U0()) {
            return AbstractC3016b.e();
        }
        Object objH = H0.h(V());
        if (objH instanceof B) {
            throw ((B) objH).f10115a;
        }
        return objH;
    }

    @Override // W8.A, R8.G0
    protected void u(Object obj) {
        M0(obj);
    }
}
