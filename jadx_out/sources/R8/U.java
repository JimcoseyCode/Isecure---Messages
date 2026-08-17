package R8;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class U {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final boolean f10158a = W8.F.f("kotlinx.coroutines.main.delay", false);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final X f10159b = b();

    public static final X a() {
        return f10159b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final X b() {
        if (!f10158a) {
            return T.f10156o;
        }
        K0 k0C = C1404d0.c();
        return (W8.u.c(k0C) || !(k0C instanceof X)) ? T.f10156o : (X) k0C;
    }
}
