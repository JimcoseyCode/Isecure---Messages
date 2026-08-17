package F4;

import android.os.Handler;
import android.os.Looper;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public class e extends Handler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Looper f1875a;

    public e(Looper looper) {
        super(looper);
        this.f1875a = Looper.getMainLooper();
    }

    public e(Looper looper, Handler.Callback callback) {
        super(looper, callback);
        this.f1875a = Looper.getMainLooper();
    }
}
