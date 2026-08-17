package H4;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public abstract class Q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static P f3754a;

    public static synchronized I a(E e10) {
        try {
            if (f3754a == null) {
                f3754a = new P(null);
            }
        } catch (Throwable th) {
            throw th;
        }
        return (I) f3754a.b(e10);
    }

    public static synchronized I b(String str) {
        return a(E.d("common").c());
    }
}
