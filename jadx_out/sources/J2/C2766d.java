package j2;

/* JADX INFO: renamed from: j2.d, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public class C2766d implements InterfaceC2763a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final C2766d f28874a = new C2766d();

    private C2766d() {
    }

    public static C2766d a() {
        return f28874a;
    }

    @Override // j2.InterfaceC2763a
    public long now() {
        return System.currentTimeMillis();
    }
}
