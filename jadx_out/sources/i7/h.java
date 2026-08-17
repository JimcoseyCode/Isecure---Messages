package I7;

import C8.AbstractC0407d0;
import C8.B0;
import C8.S;
import C8.V;
import C8.s0;
import I7.o;
import J7.f;
import L7.InterfaceC1280e;
import L7.InterfaceC1283h;
import L7.InterfaceC1288m;
import i7.t;
import j7.AbstractC2800q;
import j7.K;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AbstractC2855l;
import q8.x;
import s8.AbstractC3340e;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class h {
    public static final int a(S s10) {
        AbstractC2855l.g(s10, "<this>");
        M7.c cVarB = s10.getAnnotations().b(o.a.f5148D);
        if (cVarB == null) {
            return 0;
        }
        q8.g gVar = (q8.g) K.j(cVarB.a(), o.f5132q);
        AbstractC2855l.e(gVar, "null cannot be cast to non-null type org.jetbrains.kotlin.resolve.constants.IntValue");
        return ((Number) ((q8.n) gVar).b()).intValue();
    }

    public static final AbstractC0407d0 b(i builtIns, M7.h annotations, S s10, List contextReceiverTypes, List parameterTypes, List list, S returnType, boolean z10) {
        AbstractC2855l.g(builtIns, "builtIns");
        AbstractC2855l.g(annotations, "annotations");
        AbstractC2855l.g(contextReceiverTypes, "contextReceiverTypes");
        AbstractC2855l.g(parameterTypes, "parameterTypes");
        AbstractC2855l.g(returnType, "returnType");
        List listG = g(s10, contextReceiverTypes, parameterTypes, list, returnType, builtIns);
        InterfaceC1280e interfaceC1280eF = f(builtIns, parameterTypes.size() + contextReceiverTypes.size() + (s10 == null ? 0 : 1), z10);
        if (s10 != null) {
            annotations = u(annotations, builtIns);
        }
        if (!contextReceiverTypes.isEmpty()) {
            annotations = t(annotations, builtIns, contextReceiverTypes.size());
        }
        return V.h(s0.b(annotations), interfaceC1280eF, listG);
    }

    public static final k8.f d(S s10) {
        String str;
        AbstractC2855l.g(s10, "<this>");
        M7.c cVarB = s10.getAnnotations().b(o.a.f5150E);
        if (cVarB == null) {
            return null;
        }
        Object objD0 = AbstractC2800q.D0(cVarB.a().values());
        x xVar = objD0 instanceof x ? (x) objD0 : null;
        if (xVar != null && (str = (String) xVar.b()) != null) {
            if (!k8.f.s(str)) {
                str = null;
            }
            if (str != null) {
                return k8.f.q(str);
            }
        }
        return null;
    }

    public static final List e(S s10) {
        AbstractC2855l.g(s10, "<this>");
        p(s10);
        int iA = a(s10);
        if (iA == 0) {
            return AbstractC2800q.j();
        }
        List listSubList = s10.I0().subList(0, iA);
        ArrayList arrayList = new ArrayList(AbstractC2800q.u(listSubList, 10));
        Iterator it = listSubList.iterator();
        while (it.hasNext()) {
            arrayList.add(((B0) it.next()).getType());
        }
        return arrayList;
    }

    public static final InterfaceC1280e f(i builtIns, int i10, boolean z10) {
        AbstractC2855l.g(builtIns, "builtIns");
        InterfaceC1280e interfaceC1280eX = z10 ? builtIns.X(i10) : builtIns.C(i10);
        AbstractC2855l.d(interfaceC1280eX);
        return interfaceC1280eX;
    }

    public static final List g(S s10, List contextReceiverTypes, List parameterTypes, List list, S returnType, i builtIns) {
        k8.f fVar;
        i iVar;
        AbstractC2855l.g(contextReceiverTypes, "contextReceiverTypes");
        AbstractC2855l.g(parameterTypes, "parameterTypes");
        AbstractC2855l.g(returnType, "returnType");
        AbstractC2855l.g(builtIns, "builtIns");
        int i10 = 0;
        ArrayList arrayList = new ArrayList(parameterTypes.size() + contextReceiverTypes.size() + (s10 != null ? 1 : 0) + 1);
        ArrayList arrayList2 = new ArrayList(AbstractC2800q.u(contextReceiverTypes, 10));
        Iterator it = contextReceiverTypes.iterator();
        while (it.hasNext()) {
            arrayList2.add(H8.d.d((S) it.next()));
        }
        arrayList.addAll(arrayList2);
        M8.a.a(arrayList, s10 != null ? H8.d.d(s10) : null);
        for (Object obj : parameterTypes) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                AbstractC2800q.t();
            }
            S sC = (S) obj;
            if (list == null || (fVar = (k8.f) list.get(i10)) == null || fVar.r()) {
                fVar = null;
            }
            if (fVar != null) {
                k8.c cVar = o.a.f5150E;
                k8.f fVar2 = o.f5128m;
                String strJ = fVar.j();
                AbstractC2855l.f(strJ, "asString(...)");
                Map mapF = K.f(t.a(fVar2, new x(strJ)));
                iVar = builtIns;
                sC = H8.d.C(sC, M7.h.f7570a.a(AbstractC2800q.y0(sC.getAnnotations(), new M7.l(iVar, cVar, mapF, false, 8, null))));
            } else {
                iVar = builtIns;
            }
            arrayList.add(H8.d.d(sC));
            i10 = i11;
            builtIns = iVar;
        }
        arrayList.add(H8.d.d(returnType));
        return arrayList;
    }

    public static final J7.f h(S s10) {
        AbstractC2855l.g(s10, "<this>");
        InterfaceC1283h interfaceC1283hP = s10.K0().p();
        if (interfaceC1283hP != null) {
            return i(interfaceC1283hP);
        }
        return null;
    }

    public static final J7.f i(InterfaceC1288m interfaceC1288m) {
        AbstractC2855l.g(interfaceC1288m, "<this>");
        if ((interfaceC1288m instanceof InterfaceC1280e) && i.B0(interfaceC1288m)) {
            return j(AbstractC3340e.p(interfaceC1288m));
        }
        return null;
    }

    private static final J7.f j(k8.d dVar) {
        if (!dVar.f() || dVar.e()) {
            return null;
        }
        J7.g gVarA = J7.g.f6832c.a();
        k8.c cVarE = dVar.l().e();
        AbstractC2855l.f(cVarE, "parent(...)");
        String strJ = dVar.i().j();
        AbstractC2855l.f(strJ, "asString(...)");
        return gVarA.b(cVarE, strJ);
    }

    public static final S k(S s10) {
        AbstractC2855l.g(s10, "<this>");
        p(s10);
        if (!s(s10)) {
            return null;
        }
        return ((B0) s10.I0().get(a(s10))).getType();
    }

    public static final S l(S s10) {
        AbstractC2855l.g(s10, "<this>");
        p(s10);
        S type = ((B0) AbstractC2800q.q0(s10.I0())).getType();
        AbstractC2855l.f(type, "getType(...)");
        return type;
    }

    public static final List m(S s10) {
        AbstractC2855l.g(s10, "<this>");
        p(s10);
        return s10.I0().subList(a(s10) + (n(s10) ? 1 : 0), r0.size() - 1);
    }

    public static final boolean n(S s10) {
        AbstractC2855l.g(s10, "<this>");
        return p(s10) && s(s10);
    }

    public static final boolean o(InterfaceC1288m interfaceC1288m) {
        AbstractC2855l.g(interfaceC1288m, "<this>");
        J7.f fVarI = i(interfaceC1288m);
        return AbstractC2855l.b(fVarI, f.a.f6828e) || AbstractC2855l.b(fVarI, f.d.f6831e);
    }

    public static final boolean p(S s10) {
        AbstractC2855l.g(s10, "<this>");
        InterfaceC1283h interfaceC1283hP = s10.K0().p();
        return interfaceC1283hP != null && o(interfaceC1283hP);
    }

    public static final boolean q(S s10) {
        AbstractC2855l.g(s10, "<this>");
        return AbstractC2855l.b(h(s10), f.a.f6828e);
    }

    public static final boolean r(S s10) {
        AbstractC2855l.g(s10, "<this>");
        return AbstractC2855l.b(h(s10), f.d.f6831e);
    }

    private static final boolean s(S s10) {
        return s10.getAnnotations().b(o.a.f5146C) != null;
    }

    public static final M7.h t(M7.h hVar, i builtIns, int i10) {
        AbstractC2855l.g(hVar, "<this>");
        AbstractC2855l.g(builtIns, "builtIns");
        k8.c cVar = o.a.f5148D;
        return hVar.h(cVar) ? hVar : M7.h.f7570a.a(AbstractC2800q.y0(hVar, new M7.l(builtIns, cVar, K.f(t.a(o.f5132q, new q8.n(i10))), false, 8, null)));
    }

    public static final M7.h u(M7.h hVar, i builtIns) {
        AbstractC2855l.g(hVar, "<this>");
        AbstractC2855l.g(builtIns, "builtIns");
        k8.c cVar = o.a.f5146C;
        return hVar.h(cVar) ? hVar : M7.h.f7570a.a(AbstractC2800q.y0(hVar, new M7.l(builtIns, cVar, K.i(), false, 8, null)));
    }
}
