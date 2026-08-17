package y4;

import android.os.SystemClock;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public class f implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final f f33932a = new f();

    private f() {
    }

    public static d b() {
        return f33932a;
    }

    @Override // y4.d
    public final long a() {
        return SystemClock.elapsedRealtime();
    }
}
