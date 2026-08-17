package H8;

import C8.AbstractC0407d0;
import C8.B0;
import C8.C0421k0;
import C8.C0438y;
import C8.D0;
import C8.F0;
import C8.I;
import C8.J0;
import C8.L0;
import C8.M0;
import C8.N0;
import C8.S;
import C8.V;
import C8.s0;
import C8.v0;
import D8.e;
import I7.i;
import L7.EnumC1281f;
import L7.InterfaceC1280e;
import L7.InterfaceC1283h;
import L7.InterfaceC1284i;
import L7.l0;
import L7.m0;
import M7.h;
import i7.C2750m;
import j7.AbstractC2800q;
import j7.C2783G;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class d {
    public static final S A(S s10) {
        AbstractC2855l.g(s10, "<this>");
        S sN = J0.n(s10);
        AbstractC2855l.f(sN, "makeNotNullable(...)");
        return sN;
    }

    public static final S B(S s10) {
        AbstractC2855l.g(s10, "<this>");
        S sO = J0.o(s10);
        AbstractC2855l.f(sO, "makeNullable(...)");
        return sO;
    }

    public static final S C(S s10, h newAnnotations) {
        AbstractC2855l.g(s10, "<this>");
        AbstractC2855l.g(newAnnotations, "newAnnotations");
        return (s10.getAnnotations().isEmpty() && newAnnotations.isEmpty()) ? s10 : s10.N0().Q0(s0.a(s10.J0(), newAnnotations));
    }

    public static final S D(S s10) {
        M0 m0F;
        AbstractC2855l.g(s10, "<this>");
        M0 m0N0 = s10.N0();
        if (m0N0 instanceof I) {
            I i10 = (I) m0N0;
            AbstractC0407d0 abstractC0407d0S0 = i10.S0();
            if (!abstractC0407d0S0.K0().getParameters().isEmpty() && abstractC0407d0S0.K0().p() != null) {
                List parameters = abstractC0407d0S0.K0().getParameters();
                AbstractC2855l.f(parameters, "getParameters(...)");
                ArrayList arrayList = new ArrayList(AbstractC2800q.u(parameters, 10));
                Iterator it = parameters.iterator();
                while (it.hasNext()) {
                    arrayList.add(new C0421k0((m0) it.next()));
                }
                abstractC0407d0S0 = F0.f(abstractC0407d0S0, arrayList, null, 2, null);
            }
            AbstractC0407d0 abstractC0407d0T0 = i10.T0();
            if (!abstractC0407d0T0.K0().getParameters().isEmpty() && abstractC0407d0T0.K0().p() != null) {
                List parameters2 = abstractC0407d0T0.K0().getParameters();
                AbstractC2855l.f(parameters2, "getParameters(...)");
                ArrayList arrayList2 = new ArrayList(AbstractC2800q.u(parameters2, 10));
                Iterator it2 = parameters2.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(new C0421k0((m0) it2.next()));
                }
                abstractC0407d0T0 = F0.f(abstractC0407d0T0, arrayList2, null, 2, null);
            }
            m0F = V.e(abstractC0407d0S0, abstractC0407d0T0);
        } else {
            if (!(m0N0 instanceof AbstractC0407d0)) {
                throw new C2750m();
            }
            AbstractC0407d0 abstractC0407d0 = (AbstractC0407d0) m0N0;
            boolean zIsEmpty = abstractC0407d0.K0().getParameters().isEmpty();
            m0F = abstractC0407d0;
            if (!zIsEmpty) {
                InterfaceC1283h interfaceC1283hP = abstractC0407d0.K0().p();
                m0F = abstractC0407d0;
                if (interfaceC1283hP != null) {
                    List parameters3 = abstractC0407d0.K0().getParameters();
                    AbstractC2855l.f(parameters3, "getParameters(...)");
                    ArrayList arrayList3 = new ArrayList(AbstractC2800q.u(parameters3, 10));
                    Iterator it3 = parameters3.iterator();
                    while (it3.hasNext()) {
                        arrayList3.add(new C0421k0((m0) it3.next()));
                    }
                    m0F = F0.f(abstractC0407d0, arrayList3, null, 2, null);
                }
            }
        }
        return L0.b(m0F, m0N0);
    }

    public static final boolean E(S s10) {
        AbstractC2855l.g(s10, "<this>");
        return e(s10, c.f3807g);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean F(M0 it) {
        AbstractC2855l.g(it, "it");
        InterfaceC1283h interfaceC1283hP = it.K0().p();
        if (interfaceC1283hP != null) {
            return (interfaceC1283hP instanceof l0) || (interfaceC1283hP instanceof m0);
        }
        return false;
    }

    public static final B0 d(S s10) {
        AbstractC2855l.g(s10, "<this>");
        return new D0(s10);
    }

    public static final boolean e(S s10, Function1 predicate) {
        AbstractC2855l.g(s10, "<this>");
        AbstractC2855l.g(predicate, "predicate");
        return J0.c(s10, predicate);
    }

    private static final boolean f(S s10, v0 v0Var, Set set) {
        boolean zF;
        if (AbstractC2855l.b(s10.K0(), v0Var)) {
            return true;
        }
        InterfaceC1283h interfaceC1283hP = s10.K0().p();
        InterfaceC1284i interfaceC1284i = interfaceC1283hP instanceof InterfaceC1284i ? (InterfaceC1284i) interfaceC1283hP : null;
        List listT = interfaceC1284i != null ? interfaceC1284i.t() : null;
        Iterable<C2783G> iterableV0 = AbstractC2800q.V0(s10.I0());
        if ((iterableV0 instanceof Collection) && ((Collection) iterableV0).isEmpty()) {
            return false;
        }
        for (C2783G c2783g : iterableV0) {
            int iA = c2783g.a();
            B0 b02 = (B0) c2783g.b();
            m0 m0Var = listT != null ? (m0) AbstractC2800q.h0(listT, iA) : null;
            if ((m0Var == null || set == null || !set.contains(m0Var)) && !b02.b()) {
                S type = b02.getType();
                AbstractC2855l.f(type, "getType(...)");
                zF = f(type, v0Var, set);
            } else {
                zF = false;
            }
            if (zF) {
                return true;
            }
        }
        return false;
    }

    public static final boolean g(S s10) {
        AbstractC2855l.g(s10, "<this>");
        return e(s10, b.f3806g);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean h(M0 it) {
        AbstractC2855l.g(it, "it");
        InterfaceC1283h interfaceC1283hP = it.K0().p();
        if (interfaceC1283hP != null) {
            return x(interfaceC1283hP);
        }
        return false;
    }

    public static final boolean i(S s10) {
        AbstractC2855l.g(s10, "<this>");
        return J0.c(s10, a.f3805g);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Boolean j(M0 m02) {
        return Boolean.valueOf(J0.m(m02));
    }

    public static final B0 k(S type, N0 projectionKind, m0 m0Var) {
        AbstractC2855l.g(type, "type");
        AbstractC2855l.g(projectionKind, "projectionKind");
        if ((m0Var != null ? m0Var.m() : null) == projectionKind) {
            projectionKind = N0.f592k;
        }
        return new D0(projectionKind, type);
    }

    public static final Set l(S s10, Set set) {
        AbstractC2855l.g(s10, "<this>");
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        m(s10, s10, linkedHashSet, set);
        return linkedHashSet;
    }

    private static final void m(S s10, S s11, Set set, Set set2) {
        InterfaceC1283h interfaceC1283hP = s10.K0().p();
        if (interfaceC1283hP instanceof m0) {
            if (!AbstractC2855l.b(s10.K0(), s11.K0())) {
                set.add(interfaceC1283hP);
                return;
            }
            for (S s12 : ((m0) interfaceC1283hP).getUpperBounds()) {
                AbstractC2855l.d(s12);
                m(s12, s11, set, set2);
            }
            return;
        }
        InterfaceC1283h interfaceC1283hP2 = s10.K0().p();
        InterfaceC1284i interfaceC1284i = interfaceC1283hP2 instanceof InterfaceC1284i ? (InterfaceC1284i) interfaceC1283hP2 : null;
        List listT = interfaceC1284i != null ? interfaceC1284i.t() : null;
        int i10 = 0;
        for (B0 b02 : s10.I0()) {
            int i11 = i10 + 1;
            m0 m0Var = listT != null ? (m0) AbstractC2800q.h0(listT, i10) : null;
            if ((m0Var == null || set2 == null || !set2.contains(m0Var)) && !b02.b() && !AbstractC2800q.X(set, b02.getType().K0().p()) && !AbstractC2855l.b(b02.getType().K0(), s11.K0())) {
                S type = b02.getType();
                AbstractC2855l.f(type, "getType(...)");
                m(type, s11, set, set2);
            }
            i10 = i11;
        }
    }

    public static final i n(S s10) {
        AbstractC2855l.g(s10, "<this>");
        i iVarN = s10.K0().n();
        AbstractC2855l.f(iVarN, "getBuiltIns(...)");
        return iVarN;
    }

    public static final S o(m0 m0Var) {
        Object obj;
        AbstractC2855l.g(m0Var, "<this>");
        List upperBounds = m0Var.getUpperBounds();
        AbstractC2855l.f(upperBounds, "getUpperBounds(...)");
        upperBounds.isEmpty();
        List upperBounds2 = m0Var.getUpperBounds();
        AbstractC2855l.f(upperBounds2, "getUpperBounds(...)");
        Iterator it = upperBounds2.iterator();
        while (true) {
            obj = null;
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            InterfaceC1283h interfaceC1283hP = ((S) next).K0().p();
            InterfaceC1280e interfaceC1280e = interfaceC1283hP instanceof InterfaceC1280e ? (InterfaceC1280e) interfaceC1283hP : null;
            if (interfaceC1280e != null && interfaceC1280e.getKind() != EnumC1281f.f7321i && interfaceC1280e.getKind() != EnumC1281f.f7324l) {
                obj = next;
                break;
            }
        }
        S s10 = (S) obj;
        if (s10 != null) {
            return s10;
        }
        List upperBounds3 = m0Var.getUpperBounds();
        AbstractC2855l.f(upperBounds3, "getUpperBounds(...)");
        Object objE0 = AbstractC2800q.e0(upperBounds3);
        AbstractC2855l.f(objE0, "first(...)");
        return (S) objE0;
    }

    public static final boolean p(m0 typeParameter) {
        AbstractC2855l.g(typeParameter, "typeParameter");
        return r(typeParameter, null, null, 6, null);
    }

    public static final boolean q(m0 typeParameter, v0 v0Var, Set set) {
        AbstractC2855l.g(typeParameter, "typeParameter");
        List<S> upperBounds = typeParameter.getUpperBounds();
        AbstractC2855l.f(upperBounds, "getUpperBounds(...)");
        if (upperBounds != null && upperBounds.isEmpty()) {
            return false;
        }
        for (S s10 : upperBounds) {
            AbstractC2855l.d(s10);
            if (f(s10, typeParameter.r().K0(), set) && (v0Var == null || AbstractC2855l.b(s10.K0(), v0Var))) {
                return true;
            }
        }
        return false;
    }

    public static /* synthetic */ boolean r(m0 m0Var, v0 v0Var, Set set, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            v0Var = null;
        }
        if ((i10 & 4) != 0) {
            set = null;
        }
        return q(m0Var, v0Var, set);
    }

    public static final boolean s(S s10) {
        AbstractC2855l.g(s10, "<this>");
        return i.f0(s10);
    }

    public static final boolean t(S s10) {
        AbstractC2855l.g(s10, "<this>");
        return i.n0(s10);
    }

    public static final boolean u(S s10) {
        AbstractC2855l.g(s10, "<this>");
        if (!(s10 instanceof C0438y)) {
            return false;
        }
        ((C0438y) s10).W0();
        return false;
    }

    public static final boolean v(S s10) {
        AbstractC2855l.g(s10, "<this>");
        if (!(s10 instanceof C0438y)) {
            return false;
        }
        ((C0438y) s10).W0();
        return false;
    }

    public static final boolean w(S s10, S superType) {
        AbstractC2855l.g(s10, "<this>");
        AbstractC2855l.g(superType, "superType");
        return e.f819a.b(s10, superType);
    }

    public static final boolean x(InterfaceC1283h interfaceC1283h) {
        AbstractC2855l.g(interfaceC1283h, "<this>");
        return (interfaceC1283h instanceof m0) && (((m0) interfaceC1283h).b() instanceof l0);
    }

    public static final boolean y(S s10) {
        AbstractC2855l.g(s10, "<this>");
        return J0.m(s10);
    }

    public static final boolean z(S type) {
        AbstractC2855l.g(type, "type");
        return (type instanceof E8.i) && ((E8.i) type).U0().k();
    }
}
