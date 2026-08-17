package W2;

import com.facebook.react.uimanager.ViewDefaults;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public class q implements c2.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final long f12009a = TimeUnit.MINUTES.toMillis(5);

    private int b() {
        int iMin = (int) Math.min(Runtime.getRuntime().maxMemory(), 2147483647L);
        if (iMin < 16777216) {
            return 1048576;
        }
        return iMin < 33554432 ? 2097152 : 4194304;
    }

    @Override // c2.n
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public y get() {
        int iB = b();
        return new y(iB, ViewDefaults.NUMBER_OF_LINES, iB, ViewDefaults.NUMBER_OF_LINES, iB / 8, f12009a);
    }
}
