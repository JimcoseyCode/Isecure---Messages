package P4;

import java.util.concurrent.Callable;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
final class O implements Runnable {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final /* synthetic */ N f8821g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    final /* synthetic */ Callable f8822h;

    O(N n10, Callable callable) {
        this.f8821g = n10;
        this.f8822h = callable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.f8821g.t(this.f8822h.call());
        } catch (Exception e10) {
            this.f8821g.s(e10);
        } catch (Throwable th) {
            this.f8821g.s(new RuntimeException(th));
        }
    }
}
