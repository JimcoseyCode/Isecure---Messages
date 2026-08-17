package H4;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public final class T {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static T f3756a;

    private T() {
    }

    public static synchronized T a() {
        try {
            if (f3756a == null) {
                f3756a = new T();
            }
        } catch (Throwable th) {
            throw th;
        }
        return f3756a;
    }

    public static void b() {
        S.a();
    }
}
