package W7;

import C8.S;
import L7.InterfaceC1276a;
import L7.InterfaceC1280e;
import L7.h0;
import L7.t0;
import O7.V;
import Y7.a0;
import j7.AbstractC2800q;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.AbstractC2855l;
import s8.AbstractC3340e;
import v8.InterfaceC3442k;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class h {
    public static final List a(Collection newValueParameterTypes, Collection oldValueParameters, InterfaceC1276a newOwner) {
        AbstractC2855l.g(newValueParameterTypes, "newValueParameterTypes");
        AbstractC2855l.g(oldValueParameters, "oldValueParameters");
        AbstractC2855l.g(newOwner, "newOwner");
        newValueParameterTypes.size();
        oldValueParameters.size();
        List<Pair> listX0 = AbstractC2800q.X0(newValueParameterTypes, oldValueParameters);
        ArrayList arrayList = new ArrayList(AbstractC2800q.u(listX0, 10));
        for (Pair pair : listX0) {
            S s10 = (S) pair.getFirst();
            t0 t0Var = (t0) pair.getSecond();
            int index = t0Var.getIndex();
            M7.h annotations = t0Var.getAnnotations();
            k8.f name = t0Var.getName();
            AbstractC2855l.f(name, "getName(...)");
            boolean zQ0 = t0Var.q0();
            boolean zX = t0Var.X();
            boolean zV = t0Var.V();
            S sK = t0Var.f0() != null ? AbstractC3340e.s(newOwner).n().k(s10) : null;
            h0 h0VarG = t0Var.g();
            AbstractC2855l.f(h0VarG, "getSource(...)");
            arrayList.add(new V(newOwner, null, index, annotations, name, s10, zQ0, zX, zV, sK, h0VarG));
        }
        return arrayList;
    }

    public static final a0 b(InterfaceC1280e interfaceC1280e) {
        AbstractC2855l.g(interfaceC1280e, "<this>");
        InterfaceC1280e interfaceC1280eX = AbstractC3340e.x(interfaceC1280e);
        if (interfaceC1280eX == null) {
            return null;
        }
        InterfaceC3442k interfaceC3442kP = interfaceC1280eX.P();
        a0 a0Var = interfaceC3442kP instanceof a0 ? (a0) interfaceC3442kP : null;
        return a0Var == null ? b(interfaceC1280eX) : a0Var;
    }
}
