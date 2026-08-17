package n6;

/* JADX INFO: renamed from: n6.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC2978a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static boolean f30056a = false;

    public static synchronized void a() {
        if (f30056a) {
            return;
        }
        System.loadLibrary("NitroModules");
        f30056a = true;
    }
}
