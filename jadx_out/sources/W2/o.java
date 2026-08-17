package W2;

import android.app.ActivityManager;
import com.facebook.react.uimanager.ViewDefaults;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public class o implements c2.n {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final long f12005b = TimeUnit.MINUTES.toMillis(5);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ActivityManager f12006a;

    public o(ActivityManager activityManager) {
        this.f12006a = activityManager;
    }

    private int b() {
        int iMin = Math.min(this.f12006a.getMemoryClass() * 1048576, ViewDefaults.NUMBER_OF_LINES);
        if (iMin < 33554432) {
            return 4194304;
        }
        if (iMin < 67108864) {
            return 6291456;
        }
        return iMin / 4;
    }

    @Override // c2.n
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public y get() {
        return new y(b(), 256, ViewDefaults.NUMBER_OF_LINES, ViewDefaults.NUMBER_OF_LINES, ViewDefaults.NUMBER_OF_LINES, f12005b);
    }
}
