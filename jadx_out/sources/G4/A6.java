package G4;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public final class A6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static A6 f2205a;

    private A6() {
    }

    public static synchronized A6 a() {
        try {
            if (f2205a == null) {
                f2205a = new A6();
            }
        } catch (Throwable th) {
            throw th;
        }
        return f2205a;
    }
}
