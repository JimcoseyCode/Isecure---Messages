package I4;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public final class K9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static K9 f4163a;

    private K9() {
    }

    public static synchronized K9 a() {
        try {
            if (f4163a == null) {
                f4163a = new K9();
            }
        } catch (Throwable th) {
            throw th;
        }
        return f4163a;
    }
}
