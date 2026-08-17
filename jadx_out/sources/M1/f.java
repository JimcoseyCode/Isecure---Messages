package M1;

import x1.AbstractC3526j;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public class f extends a {

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private static f f7414G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private static f f7415H;

    public static f g0(Class cls) {
        return (f) new f().f(cls);
    }

    public static f h0(AbstractC3526j abstractC3526j) {
        return (f) new f().g(abstractC3526j);
    }

    public static f i0(v1.f fVar) {
        return (f) new f().Y(fVar);
    }

    public static f j0(boolean z10) {
        if (z10) {
            if (f7414G == null) {
                f7414G = (f) ((f) new f().a0(true)).b();
            }
            return f7414G;
        }
        if (f7415H == null) {
            f7415H = (f) ((f) new f().a0(false)).b();
        }
        return f7415H;
    }

    @Override // M1.a
    public boolean equals(Object obj) {
        return (obj instanceof f) && super.equals(obj);
    }

    @Override // M1.a
    public int hashCode() {
        return super.hashCode();
    }
}
