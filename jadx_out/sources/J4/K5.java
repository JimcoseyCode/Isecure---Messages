package J4;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public final class K5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static K5 f5792a;

    private K5() {
    }

    public static synchronized K5 a() {
        try {
            if (f5792a == null) {
                f5792a = new K5();
            }
        } catch (Throwable th) {
            throw th;
        }
        return f5792a;
    }

    public static final boolean b() {
        return J5.a("mlkit-dev-profiling");
    }
}
