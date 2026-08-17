package l6;

import android.os.SystemClock;
import com.facebook.react.uimanager.events.PointerEventHelper;
import java.util.LinkedList;
import java.util.concurrent.TimeUnit;
import k6.C2831a;
import r4.AbstractC3268i;
import r4.C3263d;

/* JADX INFO: renamed from: l6.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public class C2875a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final C3263d f29444c = new C3263d("StreamingFormatChecker", PointerEventHelper.POINTER_TYPE_UNKNOWN);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final LinkedList f29445a = new LinkedList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f29446b = -1;

    public void a(C2831a c2831a) {
        if (c2831a.f() != -1) {
            return;
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        this.f29445a.add(Long.valueOf(jElapsedRealtime));
        if (this.f29445a.size() > 5) {
            this.f29445a.removeFirst();
        }
        if (this.f29445a.size() != 5 || jElapsedRealtime - ((Long) AbstractC3268i.k((Long) this.f29445a.peekFirst())).longValue() >= 5000) {
            return;
        }
        long j10 = this.f29446b;
        if (j10 == -1 || jElapsedRealtime - j10 >= TimeUnit.SECONDS.toMillis(5L)) {
            this.f29446b = jElapsedRealtime;
            f29444c.f("StreamingFormatChecker", "ML Kit has detected that you seem to pass camera frames to the detector as a Bitmap object. This is inefficient. Please use YUV_420_888 format for camera2 API or NV21 format for (legacy) camera API and directly pass down the byte array to ML Kit.");
        }
    }
}
