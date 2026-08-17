package P4;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
final class y implements Runnable {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final /* synthetic */ z f8840g;

    y(z zVar) {
        this.f8840g = zVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f8840g.f8842b) {
            try {
                z zVar = this.f8840g;
                if (zVar.f8843c != null) {
                    zVar.f8843c.onCanceled();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
