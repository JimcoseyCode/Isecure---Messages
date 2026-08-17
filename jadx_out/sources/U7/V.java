package U7;

import L7.AbstractC1295u;
import L7.InterfaceC1277b;
import L7.InterfaceC1300z;
import L7.x0;
import b8.InterfaceC1815C;
import java.util.Iterator;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class V {
    public static final M7.c a(X7.k c10, InterfaceC1815C wildcardType) {
        Object next;
        AbstractC2855l.g(c10, "c");
        AbstractC2855l.g(wildcardType, "wildcardType");
        if (wildcardType.y() == null) {
            throw new IllegalArgumentException("Nullability annotations on unbounded wildcards aren't supported");
        }
        Iterator it = new X7.g(c10, wildcardType, false, 4, null).iterator();
        loop0: while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            M7.c cVar = (M7.c) next;
            for (k8.c cVar2 : B.f()) {
                if (AbstractC2855l.b(cVar.d(), cVar2)) {
                    break loop0;
                }
            }
        }
        return (M7.c) next;
    }

    public static final boolean b(InterfaceC1277b memberDescriptor) {
        AbstractC2855l.g(memberDescriptor, "memberDescriptor");
        return (memberDescriptor instanceof InterfaceC1300z) && AbstractC2855l.b(memberDescriptor.g0(W7.e.f12139N), Boolean.TRUE);
    }

    public static final boolean c(D javaTypeEnhancementState) {
        AbstractC2855l.g(javaTypeEnhancementState, "javaTypeEnhancementState");
        return javaTypeEnhancementState.c().invoke(B.e()) == O.f11454k;
    }

    public static final AbstractC1295u d(x0 x0Var) {
        AbstractC2855l.g(x0Var, "<this>");
        AbstractC1295u abstractC1295uG = y.g(x0Var);
        AbstractC2855l.f(abstractC1295uG, "toDescriptorVisibility(...)");
        return abstractC1295uG;
    }
}
