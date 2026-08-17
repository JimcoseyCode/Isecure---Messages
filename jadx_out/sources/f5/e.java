package F5;

import com.google.firebase.installations.i;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
class e {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final long f1900d = TimeUnit.HOURS.toMillis(24);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final long f1901e = TimeUnit.MINUTES.toMillis(30);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final i f1902a = i.c();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f1903b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f1904c;

    e() {
    }

    private synchronized long a(int i10) {
        if (c(i10)) {
            return (long) Math.min(Math.pow(2.0d, this.f1904c) + this.f1902a.e(), f1901e);
        }
        return f1900d;
    }

    private static boolean c(int i10) {
        if (i10 != 429) {
            return i10 >= 500 && i10 < 600;
        }
        return true;
    }

    private static boolean d(int i10) {
        return (i10 >= 200 && i10 < 300) || i10 == 401 || i10 == 404;
    }

    private synchronized void e() {
        this.f1904c = 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public synchronized boolean b() {
        boolean z10;
        if (this.f1904c != 0) {
            z10 = this.f1902a.a() > this.f1903b;
        }
        return z10;
    }

    public synchronized void f(int i10) {
        if (d(i10)) {
            e();
            return;
        }
        this.f1904c++;
        this.f1903b = this.f1902a.a() + a(i10);
    }
}
