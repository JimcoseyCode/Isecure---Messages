package I7;

import C8.AbstractC0407d0;
import C8.B0;
import C8.N0;
import C8.S;
import C8.V;
import C8.r0;
import C8.v0;
import L7.AbstractC1294t;
import L7.E;
import L7.EnumC1281f;
import L7.h0;
import O7.C1337p;
import O7.G;
import O7.U;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import j7.AbstractC2800q;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final G f5235a;

    static {
        C1337p c1337p = new C1337p(E8.l.f1253a.i(), o.f5134s);
        EnumC1281f enumC1281f = EnumC1281f.f7321i;
        k8.f fVarG = o.f5137v.g();
        h0 h0Var = h0.f7335a;
        B8.n nVar = B8.f.f411e;
        G g10 = new G(c1337p, enumC1281f, false, false, fVarG, h0Var, nVar);
        g10.J0(E.f7286k);
        g10.L0(AbstractC1294t.f7347e);
        g10.K0(AbstractC2800q.e(U.O0(g10, M7.h.f7570a.b(), false, N0.f593l, k8.f.q("T"), 0, nVar)));
        g10.H0();
        f5235a = g10;
    }

    public static final AbstractC0407d0 a(S suspendFunType) {
        AbstractC2855l.g(suspendFunType, "suspendFunType");
        h.r(suspendFunType);
        i iVarN = H8.d.n(suspendFunType);
        M7.h annotations = suspendFunType.getAnnotations();
        S sK = h.k(suspendFunType);
        List listE = h.e(suspendFunType);
        List listM = h.m(suspendFunType);
        ArrayList arrayList = new ArrayList(AbstractC2800q.u(listM, 10));
        Iterator it = listM.iterator();
        while (it.hasNext()) {
            arrayList.add(((B0) it.next()).getType());
        }
        r0 r0VarJ = r0.f682h.j();
        v0 v0VarJ = f5235a.j();
        AbstractC2855l.f(v0VarJ, "getTypeConstructor(...)");
        List listA0 = AbstractC2800q.A0(arrayList, V.k(r0VarJ, v0VarJ, AbstractC2800q.e(H8.d.d(h.l(suspendFunType))), false, null, 16, null));
        AbstractC0407d0 abstractC0407d0I = H8.d.n(suspendFunType).I();
        AbstractC2855l.f(abstractC0407d0I, "getNullableAnyType(...)");
        return h.b(iVarN, annotations, sK, listE, listA0, null, abstractC0407d0I, (IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT & IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) != 0 ? false : false).O0(suspendFunType.L0());
    }
}
