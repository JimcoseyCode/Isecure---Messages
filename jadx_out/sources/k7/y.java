package K7;

import C8.AbstractC0407d0;
import C8.w0;
import L7.InterfaceC1280e;
import L7.m0;
import j7.AbstractC2800q;
import j7.K;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class y {
    public static final w0 a(InterfaceC1280e from, InterfaceC1280e to) {
        AbstractC2855l.g(from, "from");
        AbstractC2855l.g(to, "to");
        from.t().size();
        to.t().size();
        w0.a aVar = w0.f710c;
        List listT = from.t();
        AbstractC2855l.f(listT, "getDeclaredTypeParameters(...)");
        ArrayList arrayList = new ArrayList(AbstractC2800q.u(listT, 10));
        Iterator it = listT.iterator();
        while (it.hasNext()) {
            arrayList.add(((m0) it.next()).j());
        }
        List listT2 = to.t();
        AbstractC2855l.f(listT2, "getDeclaredTypeParameters(...)");
        ArrayList arrayList2 = new ArrayList(AbstractC2800q.u(listT2, 10));
        Iterator it2 = listT2.iterator();
        while (it2.hasNext()) {
            AbstractC0407d0 abstractC0407d0R = ((m0) it2.next()).r();
            AbstractC2855l.f(abstractC0407d0R, "getDefaultType(...)");
            arrayList2.add(H8.d.d(abstractC0407d0R));
        }
        return w0.a.e(aVar, K.r(AbstractC2800q.X0(arrayList, arrayList2)), false, 2, null);
    }
}
