package G4;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public abstract class z6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static C0771y6 f3481a;

    public static synchronized C0684n6 a(AbstractC0644i6 abstractC0644i6) {
        try {
            if (f3481a == null) {
                f3481a = new C0771y6(null);
            }
        } catch (Throwable th) {
            throw th;
        }
        return (C0684n6) f3481a.b(abstractC0644i6);
    }

    public static synchronized C0684n6 b(String str) {
        return a(AbstractC0644i6.d("play-services-code-scanner").c());
    }
}
