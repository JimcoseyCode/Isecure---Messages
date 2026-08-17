package Z;

import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public final class b0 implements AutoCloseable {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final AtomicBoolean f13333g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final S f13334h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final long f13335i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final AbstractC1579s f13336j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final boolean f13337k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final H.d f13338l;

    b0(S s10, long j10, AbstractC1579s abstractC1579s, boolean z10, boolean z11) {
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        this.f13333g = atomicBoolean;
        H.d dVarB = H.d.b();
        this.f13338l = dVarB;
        this.f13334h = s10;
        this.f13335i = j10;
        this.f13336j = abstractC1579s;
        this.f13337k = z10;
        if (z11) {
            atomicBoolean.set(true);
        } else {
            dVarB.c("stop");
        }
    }

    private void A(int i10, Throwable th) {
        this.f13338l.a();
        if (this.f13333g.getAndSet(true)) {
            return;
        }
        this.f13334h.C0(this, i10, th);
    }

    static b0 d(C1581u c1581u, long j10) {
        H0.g.h(c1581u, "The given PendingRecording cannot be null.");
        return new b0(c1581u.e(), j10, c1581u.d(), c1581u.h(), true);
    }

    static b0 e(C1581u c1581u, long j10) {
        H0.g.h(c1581u, "The given PendingRecording cannot be null.");
        return new b0(c1581u.e(), j10, c1581u.d(), c1581u.h(), false);
    }

    @Override // java.lang.AutoCloseable
    public void close() {
        A(0, null);
    }

    protected void finalize() throws Throwable {
        try {
            this.f13338l.d();
            A(10, new RuntimeException("Recording stopped due to being garbage collected."));
        } finally {
            super.finalize();
        }
    }

    AbstractC1579s k() {
        return this.f13336j;
    }

    long m() {
        return this.f13335i;
    }

    public void r() {
        if (this.f13333g.get()) {
            throw new IllegalStateException("The recording has been stopped.");
        }
        this.f13334h.e0(this);
    }

    public void s() {
        if (this.f13333g.get()) {
            throw new IllegalStateException("The recording has been stopped.");
        }
        this.f13334h.n0(this);
    }
}
