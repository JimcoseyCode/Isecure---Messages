package W1;

import W1.a;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public class g implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static g f11951a;

    private g() {
    }

    public static synchronized g b() {
        try {
            if (f11951a == null) {
                f11951a = new g();
            }
        } catch (Throwable th) {
            throw th;
        }
        return f11951a;
    }

    @Override // W1.a
    public void a(a.EnumC0127a enumC0127a, Class cls, String str, Throwable th) {
    }
}
