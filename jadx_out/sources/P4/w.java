package P4;

import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
final class w implements Runnable {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final /* synthetic */ AbstractC1378l f8835g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    final /* synthetic */ x f8836h;

    w(x xVar, AbstractC1378l abstractC1378l) {
        this.f8836h = xVar;
        this.f8835g = abstractC1378l;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            AbstractC1378l abstractC1378l = (AbstractC1378l) this.f8836h.f8838b.a(this.f8835g);
            if (abstractC1378l == null) {
                this.f8836h.onFailure(new NullPointerException("Continuation returned null"));
                return;
            }
            x xVar = this.f8836h;
            Executor executor = AbstractC1380n.f8826b;
            abstractC1378l.h(executor, xVar);
            abstractC1378l.f(executor, this.f8836h);
            abstractC1378l.b(executor, this.f8836h);
        } catch (C1376j e10) {
            if (e10.getCause() instanceof Exception) {
                this.f8836h.f8839c.s((Exception) e10.getCause());
            } else {
                this.f8836h.f8839c.s(e10);
            }
        } catch (Exception e11) {
            this.f8836h.f8839c.s(e11);
        }
    }
}
