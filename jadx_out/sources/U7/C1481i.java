package U7;

import L7.InterfaceC1277b;
import L7.InterfaceC1300z;
import U7.U;
import d8.AbstractC2345C;
import j7.AbstractC2800q;
import kotlin.jvm.internal.AbstractC2855l;
import s8.AbstractC3340e;

/* JADX INFO: renamed from: U7.i, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class C1481i extends U {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final C1481i f11512o = new C1481i();

    private C1481i() {
    }

    private final boolean k(InterfaceC1277b interfaceC1277b) {
        return AbstractC2800q.X(U.f11461a.e(), AbstractC2345C.d(interfaceC1277b));
    }

    public static final InterfaceC1300z l(InterfaceC1300z functionDescriptor) {
        AbstractC2855l.g(functionDescriptor, "functionDescriptor");
        C1481i c1481i = f11512o;
        k8.f name = functionDescriptor.getName();
        AbstractC2855l.f(name, "getName(...)");
        if (c1481i.n(name)) {
            return (InterfaceC1300z) AbstractC3340e.i(functionDescriptor, false, C1479g.f11510g, 1, null);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean m(InterfaceC1277b it) {
        AbstractC2855l.g(it, "it");
        return f11512o.k(it);
    }

    public static final U.b o(InterfaceC1277b interfaceC1277b) {
        InterfaceC1277b interfaceC1277bI;
        String strD;
        AbstractC2855l.g(interfaceC1277b, "<this>");
        U.a aVar = U.f11461a;
        if (!aVar.d().contains(interfaceC1277b.getName()) || (interfaceC1277bI = AbstractC3340e.i(interfaceC1277b, false, C1480h.f11511g, 1, null)) == null || (strD = AbstractC2345C.d(interfaceC1277bI)) == null) {
            return null;
        }
        return aVar.l(strD);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean p(InterfaceC1277b it) {
        AbstractC2855l.g(it, "it");
        return (it instanceof InterfaceC1300z) && f11512o.k(it);
    }

    public final boolean n(k8.f fVar) {
        AbstractC2855l.g(fVar, "<this>");
        return U.f11461a.d().contains(fVar);
    }
}
