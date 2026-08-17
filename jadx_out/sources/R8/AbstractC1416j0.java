package R8;

import W8.AbstractC1510m;
import j7.C2792i;

/* JADX INFO: renamed from: R8.j0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC1416j0 extends J {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private long f10195i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f10196j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private C2792i f10197k;

    public static /* synthetic */ void P0(AbstractC1416j0 abstractC1416j0, boolean z10, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: decrementUseCount");
        }
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        abstractC1416j0.O0(z10);
    }

    private final long Q0(boolean z10) {
        return z10 ? 4294967296L : 1L;
    }

    public static /* synthetic */ void U0(AbstractC1416j0 abstractC1416j0, boolean z10, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: incrementUseCount");
        }
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        abstractC1416j0.T0(z10);
    }

    @Override // R8.J
    public final J M0(int i10, String str) {
        AbstractC1510m.a(i10);
        return AbstractC1510m.b(this, str);
    }

    public final void O0(boolean z10) {
        long jQ0 = this.f10195i - Q0(z10);
        this.f10195i = jQ0;
        if (jQ0 <= 0 && this.f10196j) {
            shutdown();
        }
    }

    public final void R0(AbstractC1400b0 abstractC1400b0) {
        C2792i c2792i = this.f10197k;
        if (c2792i == null) {
            c2792i = new C2792i();
            this.f10197k = c2792i;
        }
        c2792i.addLast(abstractC1400b0);
    }

    protected long S0() {
        C2792i c2792i = this.f10197k;
        return (c2792i == null || c2792i.isEmpty()) ? Long.MAX_VALUE : 0L;
    }

    public final void T0(boolean z10) {
        this.f10195i += Q0(z10);
        if (z10) {
            return;
        }
        this.f10196j = true;
    }

    public final boolean V0() {
        return this.f10195i >= Q0(true);
    }

    public final boolean W0() {
        C2792i c2792i = this.f10197k;
        if (c2792i != null) {
            return c2792i.isEmpty();
        }
        return true;
    }

    public abstract long X0();

    public final boolean Y0() {
        AbstractC1400b0 abstractC1400b0;
        C2792i c2792i = this.f10197k;
        if (c2792i == null || (abstractC1400b0 = (AbstractC1400b0) c2792i.y()) == null) {
            return false;
        }
        abstractC1400b0.run();
        return true;
    }

    public boolean Z0() {
        return false;
    }

    public abstract void shutdown();
}
