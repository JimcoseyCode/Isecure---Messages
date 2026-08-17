package P4;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
final class E implements Runnable {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final /* synthetic */ AbstractC1378l f8800g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    final /* synthetic */ F f8801h;

    E(F f10, AbstractC1378l abstractC1378l) {
        this.f8801h = f10;
        this.f8800g = abstractC1378l;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f8801h.f8803b) {
            try {
                F f10 = this.f8801h;
                if (f10.f8804c != null) {
                    f10.f8804c.onSuccess(this.f8800g.l());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
