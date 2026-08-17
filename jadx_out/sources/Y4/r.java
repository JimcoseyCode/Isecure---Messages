package y4;

import android.os.Looper;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public abstract class r {
    public static boolean a() {
        return Looper.getMainLooper() == Looper.myLooper();
    }
}
