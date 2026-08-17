package r5;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public enum l implements Executor {
    INSTANCE;


    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final Handler f31963h = new Handler(Looper.getMainLooper());

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        f31963h.post(runnable);
    }
}
