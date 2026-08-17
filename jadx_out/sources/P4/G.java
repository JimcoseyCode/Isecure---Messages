package P4;

import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
final class G implements Runnable {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final /* synthetic */ AbstractC1378l f8805g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    final /* synthetic */ H f8806h;

    G(H h10, AbstractC1378l abstractC1378l) {
        this.f8806h = h10;
        this.f8805g = abstractC1378l;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            AbstractC1378l abstractC1378lA = this.f8806h.f8808b.a(this.f8805g.l());
            if (abstractC1378lA == null) {
                this.f8806h.onFailure(new NullPointerException("Continuation returned null"));
                return;
            }
            H h10 = this.f8806h;
            Executor executor = AbstractC1380n.f8826b;
            abstractC1378lA.h(executor, h10);
            abstractC1378lA.f(executor, this.f8806h);
            abstractC1378lA.b(executor, this.f8806h);
        } catch (C1376j e10) {
            if (e10.getCause() instanceof Exception) {
                this.f8806h.onFailure((Exception) e10.getCause());
            } else {
                this.f8806h.onFailure(e10);
            }
        } catch (CancellationException unused) {
            this.f8806h.onCanceled();
        } catch (Exception e11) {
            this.f8806h.onFailure(e11);
        }
    }
}
