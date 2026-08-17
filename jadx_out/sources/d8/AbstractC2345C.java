package d8;

import C8.S;
import I7.o;
import L7.InterfaceC1276a;
import L7.InterfaceC1277b;
import L7.InterfaceC1280e;
import L7.InterfaceC1287l;
import L7.InterfaceC1288m;
import L7.InterfaceC1300z;
import L7.c0;
import L7.g0;
import L7.t0;
import U7.C1481i;
import U7.T;
import d8.AbstractC2371s;
import j7.AbstractC2800q;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC2855l;
import o8.AbstractC3027i;
import s8.AbstractC3340e;
import t8.C3381d;
import t8.EnumC3382e;

/* JADX INFO: renamed from: d8.C, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC2345C {
    private static final void a(StringBuilder sb, S s10) {
        sb.append(g(s10));
    }

    public static final String b(InterfaceC1300z interfaceC1300z, boolean z10, boolean z11) {
        String strJ;
        AbstractC2855l.g(interfaceC1300z, "<this>");
        StringBuilder sb = new StringBuilder();
        if (z11) {
            if (interfaceC1300z instanceof InterfaceC1287l) {
                strJ = "<init>";
            } else {
                strJ = interfaceC1300z.getName().j();
                AbstractC2855l.f(strJ, "asString(...)");
            }
            sb.append(strJ);
        }
        sb.append("(");
        c0 c0VarH0 = interfaceC1300z.h0();
        if (c0VarH0 != null) {
            S type = c0VarH0.getType();
            AbstractC2855l.f(type, "getType(...)");
            a(sb, type);
        }
        Iterator it = interfaceC1300z.i().iterator();
        while (it.hasNext()) {
            S type2 = ((t0) it.next()).getType();
            AbstractC2855l.f(type2, "getType(...)");
            a(sb, type2);
        }
        sb.append(")");
        if (z10) {
            if (AbstractC2362j.c(interfaceC1300z)) {
                sb.append("V");
            } else {
                S returnType = interfaceC1300z.getReturnType();
                AbstractC2855l.d(returnType);
                a(sb, returnType);
            }
        }
        String string = sb.toString();
        AbstractC2855l.f(string, "toString(...)");
        return string;
    }

    public static /* synthetic */ String c(InterfaceC1300z interfaceC1300z, boolean z10, boolean z11, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = true;
        }
        if ((i10 & 2) != 0) {
            z11 = true;
        }
        return b(interfaceC1300z, z10, z11);
    }

    public static final String d(InterfaceC1276a interfaceC1276a) {
        AbstractC2855l.g(interfaceC1276a, "<this>");
        C2348F c2348f = C2348F.f25682a;
        if (AbstractC3027i.E(interfaceC1276a)) {
            return null;
        }
        InterfaceC1288m interfaceC1288mB = interfaceC1276a.b();
        InterfaceC1280e interfaceC1280e = interfaceC1288mB instanceof InterfaceC1280e ? (InterfaceC1280e) interfaceC1288mB : null;
        if (interfaceC1280e == null || interfaceC1280e.getName().r()) {
            return null;
        }
        InterfaceC1276a interfaceC1276aA = interfaceC1276a.a();
        g0 g0Var = interfaceC1276aA instanceof g0 ? (g0) interfaceC1276aA : null;
        if (g0Var == null) {
            return null;
        }
        return AbstractC2344B.a(c2348f, interfaceC1280e, c(g0Var, false, false, 3, null));
    }

    public static final boolean e(InterfaceC1276a f10) {
        InterfaceC1300z interfaceC1300zL;
        AbstractC2855l.g(f10, "f");
        if (!(f10 instanceof InterfaceC1300z)) {
            return false;
        }
        InterfaceC1300z interfaceC1300z = (InterfaceC1300z) f10;
        if (AbstractC2855l.b(interfaceC1300z.getName().j(), "remove") && interfaceC1300z.i().size() == 1 && !T.n((InterfaceC1277b) f10)) {
            List listI = interfaceC1300z.a().i();
            AbstractC2855l.f(listI, "getValueParameters(...)");
            S type = ((t0) AbstractC2800q.C0(listI)).getType();
            AbstractC2855l.f(type, "getType(...)");
            AbstractC2371s abstractC2371sG = g(type);
            AbstractC2371s.d dVar = abstractC2371sG instanceof AbstractC2371s.d ? (AbstractC2371s.d) abstractC2371sG : null;
            if ((dVar != null ? dVar.i() : null) != EnumC3382e.INT || (interfaceC1300zL = C1481i.l(interfaceC1300z)) == null) {
                return false;
            }
            List listI2 = interfaceC1300zL.a().i();
            AbstractC2855l.f(listI2, "getValueParameters(...)");
            S type2 = ((t0) AbstractC2800q.C0(listI2)).getType();
            AbstractC2855l.f(type2, "getType(...)");
            AbstractC2371s abstractC2371sG2 = g(type2);
            InterfaceC1288m interfaceC1288mB = interfaceC1300zL.b();
            AbstractC2855l.f(interfaceC1288mB, "getContainingDeclaration(...)");
            if (AbstractC2855l.b(AbstractC3340e.p(interfaceC1288mB), o.a.f5194f0.j()) && (abstractC2371sG2 instanceof AbstractC2371s.c) && AbstractC2855l.b(((AbstractC2371s.c) abstractC2371sG2).i(), "java/lang/Object")) {
                return true;
            }
        }
        return false;
    }

    public static final String f(InterfaceC1280e interfaceC1280e) {
        AbstractC2855l.g(interfaceC1280e, "<this>");
        K7.c cVar = K7.c.f7110a;
        k8.d dVarJ = AbstractC3340e.o(interfaceC1280e).j();
        AbstractC2855l.f(dVarJ, "toUnsafe(...)");
        k8.b bVarN = cVar.n(dVarJ);
        if (bVarN == null) {
            return AbstractC2362j.b(interfaceC1280e, null, 2, null);
        }
        String strH = C3381d.h(bVarN);
        AbstractC2855l.f(strH, "internalNameByClassId(...)");
        return strH;
    }

    public static final AbstractC2371s g(S s10) {
        AbstractC2855l.g(s10, "<this>");
        return (AbstractC2371s) AbstractC2362j.e(s10, C2373u.f25789a, C2351I.f25688o, C2350H.f25683a, null, null, 32, null);
    }
}
