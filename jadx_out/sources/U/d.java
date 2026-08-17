package U;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public class d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static d f10714b = new d("1.5.0");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final h f10715a;

    public d(String str) {
        this.f10715a = h.t(str);
    }

    public static d a() {
        return f10714b;
    }

    public static boolean c(h hVar) {
        return a().f10715a.h(hVar.q(), hVar.r()) >= 0;
    }

    public h b() {
        return this.f10715a;
    }

    public String d() {
        return this.f10715a.toString();
    }
}
