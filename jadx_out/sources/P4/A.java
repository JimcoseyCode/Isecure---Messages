package P4;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
final class A implements Runnable {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final /* synthetic */ AbstractC1378l f8790g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    final /* synthetic */ B f8791h;

    A(B b10, AbstractC1378l abstractC1378l) {
        this.f8791h = b10;
        this.f8790g = abstractC1378l;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f8791h.f8793b) {
            try {
                B b10 = this.f8791h;
                if (b10.f8794c != null) {
                    b10.f8794c.onComplete(this.f8790g);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
