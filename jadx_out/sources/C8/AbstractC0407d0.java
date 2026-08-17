package C8;

import j7.AbstractC2800q;
import java.util.Iterator;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: renamed from: C8.d0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC0407d0 extends M0 implements G8.j, G8.k {
    public AbstractC0407d0() {
        super(null);
    }

    public abstract AbstractC0407d0 R0(boolean z10);

    public abstract AbstractC0407d0 S0(r0 r0Var);

    public String toString() {
        StringBuilder sb = new StringBuilder();
        Iterator it = getAnnotations().iterator();
        while (it.hasNext()) {
            P8.q.m(sb, "[", n8.n.Q(n8.n.f30125k, (M7.c) it.next(), null, 2, null), "] ");
        }
        sb.append(K0());
        if (!I0().isEmpty()) {
            AbstractC2800q.m0(I0(), sb, ", ", "<", ">", 0, null, null, 112, null);
        }
        if (L0()) {
            sb.append("?");
        }
        String string = sb.toString();
        AbstractC2855l.f(string, "toString(...)");
        return string;
    }
}
