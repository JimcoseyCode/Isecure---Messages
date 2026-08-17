package C8;

import L7.InterfaceC1288m;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public interface q0 {

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class a {
        public static /* synthetic */ r0 a(q0 q0Var, M7.h hVar, v0 v0Var, InterfaceC1288m interfaceC1288m, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: toAttributes");
            }
            if ((i10 & 2) != 0) {
                v0Var = null;
            }
            if ((i10 & 4) != 0) {
                interfaceC1288m = null;
            }
            return q0Var.a(hVar, v0Var, interfaceC1288m);
        }
    }

    r0 a(M7.h hVar, v0 v0Var, InterfaceC1288m interfaceC1288m);
}
