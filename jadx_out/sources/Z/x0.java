package Z;

import F.C0494l0;
import F.V0;
import F.v1;
import y.I0;
import y.InterfaceC3597q;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public interface x0 {

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public enum a {
        ACTIVE_STREAMING,
        ACTIVE_NON_STREAMING,
        INACTIVE
    }

    void a(I0 i02);

    default void b(I0 i02, v1 v1Var, boolean z10) {
        a(i02);
    }

    default e0 c(InterfaceC3597q interfaceC3597q, int i10) {
        return e0.f13361a;
    }

    default V0 d() {
        return C0494l0.f(null);
    }

    default V0 e() {
        return d0.f13355c;
    }

    default V0 f() {
        return C0494l0.f(Boolean.FALSE);
    }

    default void g(a aVar) {
    }
}
