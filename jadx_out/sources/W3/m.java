package W3;

import a4.AbstractC1595a;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
class m implements Executor {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Executor f12103g;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    static class a implements Runnable {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final Runnable f12104g;

        a(Runnable runnable) {
            this.f12104g = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.f12104g.run();
            } catch (Exception e10) {
                AbstractC1595a.d("Executor", "Background execution failure.", e10);
            }
        }
    }

    m(Executor executor) {
        this.f12103g = executor;
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        this.f12103g.execute(new a(runnable));
    }
}
