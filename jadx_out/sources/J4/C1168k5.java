package J4;

import android.os.SystemClock;
import java.io.Closeable;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: renamed from: J4.k5, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public class C1168k5 implements Closeable {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final Map f6136n = new HashMap();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final String f6137g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f6138h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private double f6139i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private long f6140j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private long f6141k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private long f6142l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private long f6143m;

    private C1168k5(String str) {
        this.f6142l = 2147483647L;
        this.f6143m = -2147483648L;
        this.f6137g = str;
    }

    private final void d() {
        this.f6138h = 0;
        this.f6139i = 0.0d;
        this.f6140j = 0L;
        this.f6142l = 2147483647L;
        this.f6143m = -2147483648L;
    }

    public static C1168k5 r(String str) {
        K5.a();
        if (!K5.b()) {
            return C1154i5.f6105o;
        }
        Map map = f6136n;
        if (map.get("detectorTaskWithResource#run") == null) {
            map.put("detectorTaskWithResource#run", new C1168k5("detectorTaskWithResource#run"));
        }
        return (C1168k5) map.get("detectorTaskWithResource#run");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        long j10 = this.f6140j;
        if (j10 == 0) {
            throw new IllegalStateException("Did you forget to call start()?");
        }
        m(j10);
    }

    public C1168k5 e() {
        this.f6140j = SystemClock.elapsedRealtimeNanos() / 1000;
        return this;
    }

    public void k(long j10) {
        long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos() / 1000;
        long j11 = this.f6141k;
        if (j11 != 0 && jElapsedRealtimeNanos - j11 >= 1000000) {
            d();
        }
        this.f6141k = jElapsedRealtimeNanos;
        this.f6138h++;
        this.f6139i += j10;
        this.f6142l = Math.min(this.f6142l, j10);
        this.f6143m = Math.max(this.f6143m, j10);
        if (this.f6138h % 50 == 0) {
            String.format(Locale.US, "[%s] cur=%dus, counts=%d, min=%dus, max=%dus, avg=%dus", this.f6137g, Long.valueOf(j10), Integer.valueOf(this.f6138h), Long.valueOf(this.f6142l), Long.valueOf(this.f6143m), Integer.valueOf((int) (this.f6139i / ((double) this.f6138h))));
            K5.a();
        }
        if (this.f6138h % 500 == 0) {
            d();
        }
    }

    public void m(long j10) {
        k((SystemClock.elapsedRealtimeNanos() / 1000) - j10);
    }
}
