package L7;

import java.util.Collection;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public interface H extends InterfaceC1288m {

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class a {
        public static Object a(H h10, InterfaceC1290o visitor, Object obj) {
            AbstractC2855l.g(visitor, "visitor");
            return visitor.k(h10, obj);
        }

        public static InterfaceC1288m b(H h10) {
            return null;
        }
    }

    V e0(k8.c cVar);

    I7.i n();

    Collection p(k8.c cVar, Function1 function1);

    List p0();

    Object s0(G g10);

    boolean w(H h10);
}
