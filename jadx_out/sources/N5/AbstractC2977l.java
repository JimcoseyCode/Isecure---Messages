package n5;

import android.os.SystemClock;

/* JADX INFO: renamed from: n5.l, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC2977l {
    public static AbstractC2977l a(long j10, long j11, long j12) {
        return new C2966a(j10, j11, j12);
    }

    public static AbstractC2977l e() {
        return a(System.currentTimeMillis(), SystemClock.elapsedRealtime(), SystemClock.uptimeMillis());
    }

    public abstract long b();

    public abstract long c();

    public abstract long d();
}
