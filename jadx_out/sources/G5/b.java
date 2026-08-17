package G5;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public class b implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static b f3482a;

    private b() {
    }

    public static b b() {
        if (f3482a == null) {
            f3482a = new b();
        }
        return f3482a;
    }

    @Override // G5.a
    public long a() {
        return System.currentTimeMillis();
    }
}
