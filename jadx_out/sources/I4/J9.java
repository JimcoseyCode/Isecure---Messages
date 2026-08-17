package I4;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public abstract class J9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static H9 f4141a;

    public static synchronized C1069x9 a(AbstractC0982p9 abstractC0982p9) {
        try {
            if (f4141a == null) {
                f4141a = new H9(null);
            }
        } catch (Throwable th) {
            throw th;
        }
        return (C1069x9) f4141a.b(abstractC0982p9);
    }

    public static synchronized C1069x9 b(String str) {
        return a(AbstractC0982p9.d(str).c());
    }
}
