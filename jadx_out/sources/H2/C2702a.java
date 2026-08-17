package h2;

import android.os.Environment;
import android.os.StatFs;
import android.os.SystemClock;
import c2.p;
import java.io.File;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: renamed from: h2.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public class C2702a {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static C2702a f28267h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final long f28268i = TimeUnit.MINUTES.toMillis(2);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private volatile File f28270b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private volatile File f28272d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private long f28273e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private volatile StatFs f28269a = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private volatile StatFs f28271c = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private volatile boolean f28275g = false;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Lock f28274f = new ReentrantLock();

    /* JADX INFO: renamed from: h2.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public enum EnumC0285a {
        INTERNAL,
        EXTERNAL
    }

    protected C2702a() {
    }

    protected static StatFs a(String str) {
        return new StatFs(str);
    }

    private void b() {
        if (this.f28275g) {
            return;
        }
        this.f28274f.lock();
        try {
            if (!this.f28275g) {
                this.f28270b = Environment.getDataDirectory();
                this.f28272d = Environment.getExternalStorageDirectory();
                g();
                this.f28275g = true;
            }
        } finally {
            this.f28274f.unlock();
        }
    }

    public static synchronized C2702a d() {
        try {
            if (f28267h == null) {
                f28267h = new C2702a();
            }
        } catch (Throwable th) {
            throw th;
        }
        return f28267h;
    }

    private void e() {
        if (this.f28274f.tryLock()) {
            try {
                if (SystemClock.uptimeMillis() - this.f28273e > f28268i) {
                    g();
                }
            } finally {
                this.f28274f.unlock();
            }
        }
    }

    private void g() {
        this.f28269a = h(this.f28269a, this.f28270b);
        this.f28271c = h(this.f28271c, this.f28272d);
        this.f28273e = SystemClock.uptimeMillis();
    }

    private StatFs h(StatFs statFs, File file) {
        if (file != null && file.exists()) {
            try {
                if (statFs == null) {
                    return a(file.getAbsolutePath());
                }
                statFs.restat(file.getAbsolutePath());
                return statFs;
            } catch (IllegalArgumentException unused) {
            } catch (Throwable th) {
                throw p.a(th);
            }
        }
        return null;
    }

    public long c(EnumC0285a enumC0285a) {
        b();
        e();
        StatFs statFs = enumC0285a == EnumC0285a.INTERNAL ? this.f28269a : this.f28271c;
        if (statFs != null) {
            return statFs.getBlockSizeLong() * statFs.getAvailableBlocksLong();
        }
        return 0L;
    }

    public boolean f(EnumC0285a enumC0285a, long j10) {
        b();
        long jC = c(enumC0285a);
        return jC <= 0 || jC < j10;
    }
}
