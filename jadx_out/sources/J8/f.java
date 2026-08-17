package J8;

import L7.InterfaceC1300z;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public interface f {

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class a {
        public static String a(f fVar, InterfaceC1300z functionDescriptor) {
            AbstractC2855l.g(functionDescriptor, "functionDescriptor");
            if (fVar.c(functionDescriptor)) {
                return null;
            }
            return fVar.a();
        }
    }

    String a();

    String b(InterfaceC1300z interfaceC1300z);

    boolean c(InterfaceC1300z interfaceC1300z);
}
