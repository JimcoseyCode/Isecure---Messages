package P4;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
final class u implements Runnable {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final /* synthetic */ AbstractC1378l f8830g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    final /* synthetic */ v f8831h;

    u(v vVar, AbstractC1378l abstractC1378l) {
        this.f8831h = vVar;
        this.f8830g = abstractC1378l;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f8830g.n()) {
            this.f8831h.f8834c.u();
            return;
        }
        try {
            this.f8831h.f8834c.t(this.f8831h.f8833b.a(this.f8830g));
        } catch (C1376j e10) {
            if (e10.getCause() instanceof Exception) {
                this.f8831h.f8834c.s((Exception) e10.getCause());
            } else {
                this.f8831h.f8834c.s(e10);
            }
        } catch (Exception e11) {
            this.f8831h.f8834c.s(e11);
        }
    }
}
