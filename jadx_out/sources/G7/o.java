package G7;

import C8.AbstractC0407d0;
import C8.F0;
import C8.J0;
import C8.S;
import F7.Y0;
import F7.j1;
import L7.I;
import L7.InterfaceC1277b;
import L7.InterfaceC1280e;
import L7.InterfaceC1283h;
import L7.InterfaceC1287l;
import L7.InterfaceC1288m;
import L7.Z;
import L7.c0;
import L7.t0;
import L7.u0;
import j7.AbstractC2800q;
import j8.C2807b;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC2855l;
import o8.AbstractC3029k;
import s8.AbstractC3340e;
import v7.AbstractC3430a;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class o {
    private static final boolean a(Member member) {
        if (member.getDeclaringClass() == null) {
            return false;
        }
        return !AbstractC3430a.e(r0).l();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g(h hVar, int i10, InterfaceC1277b interfaceC1277b, boolean z10) {
        if (j.a(hVar) == i10) {
            return;
        }
        throw new Y0("Inconsistent number of parameters in the descriptor and Java reflection object: " + j.a(hVar) + " != " + i10 + "\nCalling: " + interfaceC1277b + "\nParameter types: " + hVar.a() + ")\nDefault: " + z10);
    }

    public static final Object h(Object obj, InterfaceC1277b descriptor) {
        S sL;
        Class clsS;
        Method methodM;
        AbstractC2855l.g(descriptor, "descriptor");
        return (((descriptor instanceof Z) && AbstractC3029k.e((u0) descriptor)) || (sL = l(descriptor)) == null || (clsS = s(sL)) == null || (methodM = m(clsS, descriptor)) == null) ? obj : methodM.invoke(obj, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0080  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final h i(h hVar, InterfaceC1277b descriptor, boolean z10) {
        List listI;
        Iterator it;
        S returnType;
        AbstractC2855l.g(hVar, "<this>");
        AbstractC2855l.g(descriptor, "descriptor");
        if (!AbstractC3029k.a(descriptor)) {
            List listM0 = descriptor.m0();
            AbstractC2855l.f(listM0, "getContextReceiverParameters(...)");
            if (listM0 == null || !listM0.isEmpty()) {
                Iterator it2 = listM0.iterator();
                while (it2.hasNext()) {
                    S type = ((c0) it2.next()).getType();
                    AbstractC2855l.f(type, "getType(...)");
                    if (AbstractC3029k.h(type)) {
                        break;
                    }
                }
                listI = descriptor.i();
                AbstractC2855l.f(listI, "getValueParameters(...)");
                if (listI == null && listI.isEmpty()) {
                    returnType = descriptor.getReturnType();
                    return returnType == null ? hVar : hVar;
                }
                it = listI.iterator();
                while (it.hasNext()) {
                    S type2 = ((t0) it.next()).getType();
                    AbstractC2855l.f(type2, "getType(...)");
                    if (AbstractC3029k.h(type2)) {
                        break;
                    }
                }
                returnType = descriptor.getReturnType();
                if ((returnType == null || !AbstractC3029k.c(returnType)) && !q(descriptor)) {
                }
            } else {
                listI = descriptor.i();
                AbstractC2855l.f(listI, "getValueParameters(...)");
                if (listI == null) {
                    it = listI.iterator();
                    while (it.hasNext()) {
                    }
                    returnType = descriptor.getReturnType();
                    if (returnType == null) {
                    }
                }
            }
        }
        return new n(descriptor, hVar, z10);
    }

    public static /* synthetic */ h j(h hVar, InterfaceC1277b interfaceC1277b, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return i(hVar, interfaceC1277b, z10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Method k(Class cls, InterfaceC1277b interfaceC1277b) {
        try {
            return cls.getDeclaredMethod("box-impl", m(cls, interfaceC1277b).getReturnType());
        } catch (NoSuchMethodException unused) {
            throw new Y0("No box method found in inline class: " + cls + " (calling " + interfaceC1277b + ')');
        }
    }

    private static final S l(InterfaceC1277b interfaceC1277b) {
        c0 c0VarH0 = interfaceC1277b.h0();
        c0 c0VarA0 = interfaceC1277b.a0();
        if (c0VarH0 != null) {
            return c0VarH0.getType();
        }
        if (c0VarA0 == null) {
            return null;
        }
        if (interfaceC1277b instanceof InterfaceC1287l) {
            return c0VarA0.getType();
        }
        InterfaceC1288m interfaceC1288mB = interfaceC1277b.b();
        InterfaceC1280e interfaceC1280e = interfaceC1288mB instanceof InterfaceC1280e ? (InterfaceC1280e) interfaceC1288mB : null;
        if (interfaceC1280e != null) {
            return interfaceC1280e.r();
        }
        return null;
    }

    public static final Method m(Class cls, InterfaceC1277b descriptor) {
        AbstractC2855l.g(cls, "<this>");
        AbstractC2855l.g(descriptor, "descriptor");
        try {
            return cls.getDeclaredMethod("unbox-impl", null);
        } catch (NoSuchMethodException unused) {
            throw new Y0("No unbox method found in inline class: " + cls + " (calling " + descriptor + ')');
        }
    }

    public static final List n(AbstractC0407d0 type) {
        AbstractC2855l.g(type, "type");
        List listO = o(F0.a(type));
        if (listO == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(AbstractC2800q.u(listO, 10));
        Iterator it = listO.iterator();
        while (it.hasNext()) {
            arrayList.add("unbox-impl-" + ((String) it.next()));
        }
        InterfaceC1283h interfaceC1283hP = type.K0().p();
        AbstractC2855l.e(interfaceC1283hP, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
        Class clsQ = j1.q((InterfaceC1280e) interfaceC1283hP);
        AbstractC2855l.d(clsQ);
        ArrayList arrayList2 = new ArrayList(AbstractC2800q.u(arrayList, 10));
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            arrayList2.add(clsQ.getDeclaredMethod((String) it2.next(), null));
        }
        return arrayList2;
    }

    private static final List o(AbstractC0407d0 abstractC0407d0) {
        Collection collectionE;
        if (!AbstractC3029k.i(abstractC0407d0)) {
            return null;
        }
        InterfaceC1283h interfaceC1283hP = abstractC0407d0.K0().p();
        AbstractC2855l.e(interfaceC1283hP, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
        I iT = AbstractC3340e.t((InterfaceC1280e) interfaceC1283hP);
        AbstractC2855l.d(iT);
        List<Pair> listC = iT.c();
        ArrayList arrayList = new ArrayList();
        for (Pair pair : listC) {
            k8.f fVar = (k8.f) pair.getFirst();
            List listO = o((AbstractC0407d0) pair.getSecond());
            if (listO != null) {
                collectionE = new ArrayList(AbstractC2800q.u(listO, 10));
                Iterator it = listO.iterator();
                while (it.hasNext()) {
                    collectionE.add(fVar.m() + '-' + ((String) it.next()));
                }
            } else {
                collectionE = AbstractC2800q.e(fVar.m());
            }
            AbstractC2800q.A(arrayList, collectionE);
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List p(AbstractC0407d0 abstractC0407d0, InterfaceC1277b interfaceC1277b) {
        Method methodM;
        List listN = n(abstractC0407d0);
        if (listN != null) {
            return listN;
        }
        Class clsS = s(abstractC0407d0);
        if (clsS == null || (methodM = m(clsS, interfaceC1277b)) == null) {
            return null;
        }
        return AbstractC2800q.e(methodM);
    }

    private static final boolean q(InterfaceC1277b interfaceC1277b) {
        S sL = l(interfaceC1277b);
        return sL != null && AbstractC3029k.h(sL);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List r(InterfaceC1277b interfaceC1277b, Member member, Function1 function1) {
        ArrayList arrayList = new ArrayList();
        c0 c0VarH0 = interfaceC1277b.h0();
        S type = c0VarH0 != null ? c0VarH0.getType() : null;
        if (type != null) {
            arrayList.add(type);
        } else if (interfaceC1277b instanceof InterfaceC1287l) {
            InterfaceC1280e interfaceC1280eB = ((InterfaceC1287l) interfaceC1277b).B();
            AbstractC2855l.f(interfaceC1280eB, "getConstructedClass(...)");
            if (interfaceC1280eB.K()) {
                InterfaceC1288m interfaceC1288mB = interfaceC1280eB.b();
                AbstractC2855l.e(interfaceC1288mB, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
                arrayList.add(((InterfaceC1280e) interfaceC1288mB).r());
            }
        } else {
            InterfaceC1288m interfaceC1288mB2 = interfaceC1277b.b();
            AbstractC2855l.f(interfaceC1288mB2, "getContainingDeclaration(...)");
            if ((interfaceC1288mB2 instanceof InterfaceC1280e) && ((Boolean) function1.invoke(interfaceC1288mB2)).booleanValue()) {
                if (member == null || !a(member)) {
                    arrayList.add(((InterfaceC1280e) interfaceC1288mB2).r());
                } else {
                    AbstractC0407d0 abstractC0407d0R = ((InterfaceC1280e) interfaceC1288mB2).r();
                    AbstractC2855l.f(abstractC0407d0R, "getDefaultType(...)");
                    arrayList.add(H8.d.B(abstractC0407d0R));
                }
            }
        }
        List listI = interfaceC1277b.i();
        AbstractC2855l.f(listI, "getValueParameters(...)");
        Iterator it = listI.iterator();
        while (it.hasNext()) {
            arrayList.add(((t0) it.next()).getType());
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Class s(S s10) {
        S sK;
        Class clsT = t(s10.K0().p());
        if (clsT == null) {
            return null;
        }
        if (J0.l(s10) && ((sK = AbstractC3029k.k(s10)) == null || J0.l(sK) || I7.i.s0(sK))) {
            return null;
        }
        return clsT;
    }

    public static final Class t(InterfaceC1288m interfaceC1288m) {
        if (!(interfaceC1288m instanceof InterfaceC1280e) || !AbstractC3029k.b(interfaceC1288m)) {
            return null;
        }
        InterfaceC1280e interfaceC1280e = (InterfaceC1280e) interfaceC1288m;
        Class clsQ = j1.q(interfaceC1280e);
        if (clsQ != null) {
            return clsQ;
        }
        throw new Y0("Class object for the class " + interfaceC1280e.getName() + " cannot be found (classId=" + AbstractC3340e.n((InterfaceC1283h) interfaceC1288m) + ')');
    }

    public static final String u(InterfaceC1283h interfaceC1283h) {
        AbstractC2855l.g(interfaceC1283h, "<this>");
        k8.b bVarN = AbstractC3340e.n(interfaceC1283h);
        AbstractC2855l.d(bVarN);
        return C2807b.b(bVarN.b());
    }
}
