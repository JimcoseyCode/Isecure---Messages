package x1;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f33491a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Handler f33492b = new Handler(Looper.getMainLooper(), new a());

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    private static final class a implements Handler.Callback {
        a() {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            if (message.what != 1) {
                return false;
            }
            ((v) message.obj).recycle();
            return true;
        }
    }

    y() {
    }

    synchronized void a(v vVar, boolean z10) {
        try {
            if (this.f33491a || z10) {
                this.f33492b.obtainMessage(1, vVar).sendToTarget();
            } else {
                this.f33491a = true;
                vVar.recycle();
                this.f33491a = false;
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
