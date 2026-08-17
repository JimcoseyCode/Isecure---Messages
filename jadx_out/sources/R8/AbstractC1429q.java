package R8;

import W8.C1506i;

/* JADX INFO: renamed from: R8.q, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC1429q {
    public static final void a(InterfaceC1421m interfaceC1421m, InterfaceC1408f0 interfaceC1408f0) {
        c(interfaceC1421m, new C1410g0(interfaceC1408f0));
    }

    public static final C1425o b(n7.f fVar) {
        if (!(fVar instanceof C1506i)) {
            return new C1425o(fVar, 1);
        }
        C1425o c1425oM = ((C1506i) fVar).m();
        if (c1425oM != null) {
            if (!c1425oM.O()) {
                c1425oM = null;
            }
            if (c1425oM != null) {
                return c1425oM;
            }
        }
        return new C1425o(fVar, 2);
    }

    public static final void c(InterfaceC1421m interfaceC1421m, InterfaceC1419l interfaceC1419l) {
        if (!(interfaceC1421m instanceof C1425o)) {
            throw new UnsupportedOperationException("third-party implementation of CancellableContinuation is not supported");
        }
        ((C1425o) interfaceC1421m).I(interfaceC1419l);
    }
}
