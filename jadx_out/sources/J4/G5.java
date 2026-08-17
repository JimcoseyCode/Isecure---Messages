package J4;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public abstract class G5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static F5 f5723a;

    public static synchronized C1258x5 a(AbstractC1223s5 abstractC1223s5) {
        try {
            if (f5723a == null) {
                f5723a = new F5(null);
            }
        } catch (Throwable th) {
            throw th;
        }
        return (C1258x5) f5723a.b(abstractC1223s5);
    }

    public static synchronized C1258x5 b(String str) {
        return a(AbstractC1223s5.d("vision-common").c());
    }
}
