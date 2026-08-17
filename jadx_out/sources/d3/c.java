package d3;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public class c extends h {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private R2.e f25570j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f25571k;

    public c(R2.e eVar, boolean z10) {
        this.f25570j = eVar;
        this.f25571k = z10;
    }

    @Override // d3.AbstractC2328a, d3.e
    public boolean F0() {
        return this.f25571k;
    }

    @Override // d3.e, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        synchronized (this) {
            try {
                R2.e eVar = this.f25570j;
                if (eVar == null) {
                    return;
                }
                this.f25570j = null;
                eVar.a();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public synchronized R2.c g0() {
        R2.e eVar;
        eVar = this.f25570j;
        return eVar == null ? null : eVar.d();
    }

    @Override // d3.e, d3.m
    public synchronized int getHeight() {
        R2.e eVar;
        eVar = this.f25570j;
        return eVar == null ? 0 : eVar.d().getHeight();
    }

    @Override // d3.e, d3.m
    public synchronized int getWidth() {
        R2.e eVar;
        eVar = this.f25570j;
        return eVar == null ? 0 : eVar.d().getWidth();
    }

    public synchronized R2.e i0() {
        return this.f25570j;
    }

    @Override // d3.e
    public synchronized boolean isClosed() {
        return this.f25570j == null;
    }

    @Override // d3.e
    public synchronized int l() {
        R2.e eVar;
        eVar = this.f25570j;
        return eVar == null ? 0 : eVar.d().l();
    }
}
