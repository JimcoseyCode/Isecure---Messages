package D8;

import C8.AbstractC0407d0;
import C8.E;
import C8.I;
import C8.L;
import C8.M0;
import C8.V;
import C8.W;
import i7.C2750m;
import j7.AbstractC2800q;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class d {
    public static final M0 a(Collection types) {
        AbstractC0407d0 abstractC0407d0S0;
        AbstractC2855l.g(types, "types");
        int size = types.size();
        if (size == 0) {
            throw new IllegalStateException("Expected some types");
        }
        if (size == 1) {
            return (M0) AbstractC2800q.B0(types);
        }
        ArrayList arrayList = new ArrayList(AbstractC2800q.u(types, 10));
        Iterator it = types.iterator();
        boolean z10 = false;
        boolean z11 = false;
        while (it.hasNext()) {
            M0 m02 = (M0) it.next();
            z10 = z10 || W.a(m02);
            if (m02 instanceof AbstractC0407d0) {
                abstractC0407d0S0 = (AbstractC0407d0) m02;
            } else {
                if (!(m02 instanceof I)) {
                    throw new C2750m();
                }
                if (E.a(m02)) {
                    return m02;
                }
                abstractC0407d0S0 = ((I) m02).S0();
                z11 = true;
            }
            arrayList.add(abstractC0407d0S0);
        }
        if (z10) {
            return E8.l.d(E8.k.f1168B0, types.toString());
        }
        if (!z11) {
            return z.f851a.d(arrayList);
        }
        ArrayList arrayList2 = new ArrayList(AbstractC2800q.u(types, 10));
        Iterator it2 = types.iterator();
        while (it2.hasNext()) {
            arrayList2.add(L.d((M0) it2.next()));
        }
        z zVar = z.f851a;
        return V.e(zVar.d(arrayList), zVar.d(arrayList2));
    }
}
