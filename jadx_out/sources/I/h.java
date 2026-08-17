package I;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
abstract class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static volatile ScheduledExecutorService f3833a;

    static ScheduledExecutorService a() {
        if (f3833a != null) {
            return f3833a;
        }
        synchronized (h.class) {
            try {
                if (f3833a == null) {
                    f3833a = new e(new Handler(Looper.getMainLooper()));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return f3833a;
    }
}
