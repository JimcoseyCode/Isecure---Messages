package Z;

import Z.C1568g;
import Z.z0;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public abstract class r {

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static abstract class a {
        a() {
        }

        public abstract r a();

        public a b(H0.a aVar) {
            z0.a aVarF = c().f();
            aVar.accept(aVarF);
            f(aVarF.a());
            return this;
        }

        abstract z0 c();

        public abstract a d(AbstractC1562a abstractC1562a);

        public abstract a e(int i10);

        public abstract a f(z0 z0Var);
    }

    r() {
    }

    public static a a() {
        return new C1568g.b().e(-1).d(AbstractC1562a.a().a()).f(z0.a().a());
    }

    public static String e(int i10) {
        return i10 != 1 ? "audio/mp4a-latm" : "audio/vorbis";
    }

    public static int f(int i10) {
        return Objects.equals(e(i10), "audio/mp4a-latm") ? 2 : -1;
    }

    static int g(int i10) {
        return i10 != 1 ? 0 : 1;
    }

    public static String h(int i10) {
        return i10 != 1 ? "video/avc" : "video/x-vnd.on2.vp8";
    }

    public abstract AbstractC1562a b();

    public abstract int c();

    public abstract z0 d();

    public abstract a i();
}
