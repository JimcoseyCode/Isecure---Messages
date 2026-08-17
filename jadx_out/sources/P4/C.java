package P4;

import r4.AbstractC3268i;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
final class C implements Runnable {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final /* synthetic */ AbstractC1378l f8795g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    final /* synthetic */ D f8796h;

    C(D d10, AbstractC1378l abstractC1378l) {
        this.f8796h = d10;
        this.f8795g = abstractC1378l;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f8796h.f8798b) {
            try {
                D d10 = this.f8796h;
                if (d10.f8799c != null) {
                    d10.f8799c.onFailure((Exception) AbstractC3268i.k(this.f8795g.k()));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
