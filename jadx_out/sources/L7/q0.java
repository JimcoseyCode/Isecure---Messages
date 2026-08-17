package L7;

import j7.AbstractC2800q;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC2855l;
import o8.AbstractC3027i;
import s8.AbstractC3340e;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class q0 {
    public static final X d(C8.S s10) {
        AbstractC2855l.g(s10, "<this>");
        InterfaceC1283h interfaceC1283hP = s10.K0().p();
        return e(s10, interfaceC1283hP instanceof InterfaceC1284i ? (InterfaceC1284i) interfaceC1283hP : null, 0);
    }

    private static final X e(C8.S s10, InterfaceC1284i interfaceC1284i, int i10) {
        if (interfaceC1284i == null || E8.l.m(interfaceC1284i)) {
            return null;
        }
        int size = interfaceC1284i.t().size() + i10;
        if (interfaceC1284i.K()) {
            List listSubList = s10.I0().subList(i10, size);
            InterfaceC1288m interfaceC1288mB = interfaceC1284i.b();
            return new X(interfaceC1284i, listSubList, e(s10, interfaceC1288mB instanceof InterfaceC1284i ? (InterfaceC1284i) interfaceC1288mB : null, size));
        }
        if (size != s10.I0().size()) {
            AbstractC3027i.E(interfaceC1284i);
        }
        return new X(interfaceC1284i, s10.I0().subList(i10, s10.I0().size()), null);
    }

    private static final C1278c f(m0 m0Var, InterfaceC1288m interfaceC1288m, int i10) {
        return new C1278c(m0Var, interfaceC1288m, i10);
    }

    public static final List g(InterfaceC1284i interfaceC1284i) {
        List listJ;
        Object next;
        C8.v0 v0VarJ;
        AbstractC2855l.g(interfaceC1284i, "<this>");
        List listT = interfaceC1284i.t();
        AbstractC2855l.f(listT, "getDeclaredTypeParameters(...)");
        if (!interfaceC1284i.K() && !(interfaceC1284i.b() instanceof InterfaceC1276a)) {
            return listT;
        }
        List listS = O8.l.S(O8.l.D(O8.l.y(O8.l.Q(AbstractC3340e.u(interfaceC1284i), n0.f7339g), o0.f7340g), p0.f7341g));
        Iterator it = AbstractC3340e.u(interfaceC1284i).iterator();
        while (true) {
            listJ = null;
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (next instanceof InterfaceC1280e) {
                break;
            }
        }
        InterfaceC1280e interfaceC1280e = (InterfaceC1280e) next;
        if (interfaceC1280e != null && (v0VarJ = interfaceC1280e.j()) != null) {
            listJ = v0VarJ.getParameters();
        }
        if (listJ == null) {
            listJ = AbstractC2800q.j();
        }
        if (listS.isEmpty() && listJ.isEmpty()) {
            List listT2 = interfaceC1284i.t();
            AbstractC2855l.f(listT2, "getDeclaredTypeParameters(...)");
            return listT2;
        }
        List<m0> listZ0 = AbstractC2800q.z0(listS, listJ);
        ArrayList arrayList = new ArrayList(AbstractC2800q.u(listZ0, 10));
        for (m0 m0Var : listZ0) {
            AbstractC2855l.d(m0Var);
            arrayList.add(f(m0Var, interfaceC1284i, listT.size()));
        }
        return AbstractC2800q.z0(listT, arrayList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean h(InterfaceC1288m it) {
        AbstractC2855l.g(it, "it");
        return it instanceof InterfaceC1276a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean i(InterfaceC1288m it) {
        AbstractC2855l.g(it, "it");
        return !(it instanceof InterfaceC1287l);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final O8.i j(InterfaceC1288m it) {
        AbstractC2855l.g(it, "it");
        List typeParameters = ((InterfaceC1276a) it).getTypeParameters();
        AbstractC2855l.f(typeParameters, "getTypeParameters(...)");
        return AbstractC2800q.V(typeParameters);
    }
}
