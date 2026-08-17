package z4;

import android.os.Process;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
final class b implements Runnable {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Runnable f34264g;

    public b(Runnable runnable, int i10) {
        this.f34264g = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Process.setThreadPriority(0);
        this.f34264g.run();
    }
}
