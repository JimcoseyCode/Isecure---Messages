package M7;

import C8.S;
import L7.InterfaceC1280e;
import L7.h0;
import java.util.Map;
import s8.AbstractC3340e;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public interface c {

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class a {
        public static k8.c a(c cVar) {
            InterfaceC1280e interfaceC1280eL = AbstractC3340e.l(cVar);
            if (interfaceC1280eL != null) {
                if (E8.l.m(interfaceC1280eL)) {
                    interfaceC1280eL = null;
                }
                if (interfaceC1280eL != null) {
                    return AbstractC3340e.k(interfaceC1280eL);
                }
            }
            return null;
        }
    }

    Map a();

    k8.c d();

    h0 g();

    S getType();
}
