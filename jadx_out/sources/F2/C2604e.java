package f2;

/* JADX INFO: renamed from: f2.e, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public class C2604e implements InterfaceC2603d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static C2604e f27222a;

    public static synchronized C2604e b() {
        try {
            if (f27222a == null) {
                f27222a = new C2604e();
            }
        } catch (Throwable th) {
            throw th;
        }
        return f27222a;
    }

    @Override // f2.InterfaceC2603d
    public void a(InterfaceC2602c interfaceC2602c) {
    }
}
