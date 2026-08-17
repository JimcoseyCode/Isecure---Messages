package U7;

import C8.AbstractC0407d0;
import L7.InterfaceC1276a;
import L7.InterfaceC1277b;
import L7.InterfaceC1280e;
import L7.InterfaceC1288m;
import L7.Y;
import L7.Z;
import L7.g0;
import kotlin.jvm.internal.AbstractC2855l;
import o8.AbstractC3027i;
import s8.AbstractC3340e;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class T {
    public static final boolean d(InterfaceC1277b interfaceC1277b) {
        AbstractC2855l.g(interfaceC1277b, "<this>");
        return g(interfaceC1277b) != null;
    }

    public static final String e(InterfaceC1277b callableMemberDescriptor) {
        InterfaceC1277b interfaceC1277bW;
        k8.f fVarJ;
        AbstractC2855l.g(callableMemberDescriptor, "callableMemberDescriptor");
        InterfaceC1277b interfaceC1277bF = f(callableMemberDescriptor);
        if (interfaceC1277bF != null && (interfaceC1277bW = AbstractC3340e.w(interfaceC1277bF)) != null) {
            if (interfaceC1277bW instanceof Z) {
                return C1485m.f11520a.b(interfaceC1277bW);
            }
            if ((interfaceC1277bW instanceof g0) && (fVarJ = C1478f.f11509o.j((g0) interfaceC1277bW)) != null) {
                return fVarJ.j();
            }
        }
        return null;
    }

    private static final InterfaceC1277b f(InterfaceC1277b interfaceC1277b) {
        if (I7.i.g0(interfaceC1277b)) {
            return g(interfaceC1277b);
        }
        return null;
    }

    public static final InterfaceC1277b g(InterfaceC1277b interfaceC1277b) {
        AbstractC2855l.g(interfaceC1277b, "<this>");
        if (!U.f11461a.g().contains(interfaceC1277b.getName()) && !C1482j.f11513a.d().contains(AbstractC3340e.w(interfaceC1277b).getName())) {
            return null;
        }
        if ((interfaceC1277b instanceof Z) || (interfaceC1277b instanceof Y)) {
            return AbstractC3340e.i(interfaceC1277b, false, P.f11458g, 1, null);
        }
        if (interfaceC1277b instanceof g0) {
            return AbstractC3340e.i(interfaceC1277b, false, Q.f11459g, 1, null);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean h(InterfaceC1277b it) {
        AbstractC2855l.g(it, "it");
        return C1485m.f11520a.d(AbstractC3340e.w(it));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean i(InterfaceC1277b it) {
        AbstractC2855l.g(it, "it");
        return C1478f.f11509o.k((g0) it);
    }

    public static final InterfaceC1277b j(InterfaceC1277b interfaceC1277b) {
        AbstractC2855l.g(interfaceC1277b, "<this>");
        InterfaceC1277b interfaceC1277bG = g(interfaceC1277b);
        if (interfaceC1277bG != null) {
            return interfaceC1277bG;
        }
        C1481i c1481i = C1481i.f11512o;
        k8.f name = interfaceC1277b.getName();
        AbstractC2855l.f(name, "getName(...)");
        if (c1481i.n(name)) {
            return AbstractC3340e.i(interfaceC1277b, false, S.f11460g, 1, null);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean k(InterfaceC1277b it) {
        AbstractC2855l.g(it, "it");
        return I7.i.g0(it) && C1481i.o(it) != null;
    }

    public static final boolean l(InterfaceC1280e interfaceC1280e, InterfaceC1276a specialCallableDescriptor) {
        AbstractC2855l.g(interfaceC1280e, "<this>");
        AbstractC2855l.g(specialCallableDescriptor, "specialCallableDescriptor");
        InterfaceC1288m interfaceC1288mB = specialCallableDescriptor.b();
        AbstractC2855l.e(interfaceC1288mB, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
        AbstractC0407d0 abstractC0407d0R = ((InterfaceC1280e) interfaceC1288mB).r();
        AbstractC2855l.f(abstractC0407d0R, "getDefaultType(...)");
        for (InterfaceC1280e interfaceC1280eS = AbstractC3027i.s(interfaceC1280e); interfaceC1280eS != null; interfaceC1280eS = AbstractC3027i.s(interfaceC1280eS)) {
            if (!(interfaceC1280eS instanceof W7.c) && D8.w.b(interfaceC1280eS.r(), abstractC0407d0R) != null) {
                return !I7.i.g0(interfaceC1280eS);
            }
        }
        return false;
    }

    public static final boolean m(InterfaceC1277b interfaceC1277b) {
        AbstractC2855l.g(interfaceC1277b, "<this>");
        return AbstractC3340e.w(interfaceC1277b).b() instanceof W7.c;
    }

    public static final boolean n(InterfaceC1277b interfaceC1277b) {
        AbstractC2855l.g(interfaceC1277b, "<this>");
        return m(interfaceC1277b) || I7.i.g0(interfaceC1277b);
    }
}
