package U;

import androidx.camera.extensions.impl.ExtensionVersionImpl;
import y.AbstractC3583h0;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public abstract class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static volatile e f10716a;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    private static class a extends e {
        a() {
        }

        @Override // U.e
        h c() {
            return null;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    private static class b extends e {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static ExtensionVersionImpl f10717c;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private h f10718b;

        b() {
            if (f10717c == null) {
                f10717c = new ExtensionVersionImpl();
            }
            h hVarT = h.t(f10717c.checkApiVersion(d.a().d()));
            if (hVarT != null && d.a().b().q() == hVarT.q()) {
                this.f10718b = hVarT;
            }
            AbstractC3583h0.a("ExtenderVersion", "Selected vendor runtime: " + this.f10718b);
        }

        @Override // U.e
        h c() {
            return this.f10718b;
        }
    }

    private static e a() {
        if (f10716a != null) {
            return f10716a;
        }
        synchronized (e.class) {
            if (f10716a == null) {
                try {
                    f10716a = new b();
                } catch (NoClassDefFoundError unused) {
                    AbstractC3583h0.a("ExtenderVersion", "No versioning extender found. Falling back to default.");
                    f10716a = new a();
                }
            }
        }
        return f10716a;
    }

    public static h b() {
        return a().c();
    }

    public static boolean d(h hVar) {
        return b().h(hVar.q(), hVar.r()) >= 0;
    }

    abstract h c();
}
