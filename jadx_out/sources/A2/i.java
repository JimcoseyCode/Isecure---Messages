package a2;

import android.os.Handler;
import android.os.Looper;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public class i extends e {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static i f13681h;

    private i() {
        super(new Handler(Looper.getMainLooper()));
    }

    public static i B() {
        if (f13681h == null) {
            f13681h = new i();
        }
        return f13681h;
    }

    @Override // a2.e, java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        if (d()) {
            runnable.run();
        } else {
            super.execute(runnable);
        }
    }
}
