package Z1;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public class c implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static c f13558a;

    private c() {
    }

    public static synchronized c b() {
        try {
            if (f13558a == null) {
                f13558a = new c();
            }
        } catch (Throwable th) {
            throw th;
        }
        return f13558a;
    }

    @Override // Z1.b
    public void a(a aVar) {
    }
}
