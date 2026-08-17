package U7;

import L7.InterfaceC1277b;
import L7.g0;
import d8.AbstractC2345C;
import java.util.Map;
import kotlin.jvm.internal.AbstractC2855l;
import s8.AbstractC3340e;

/* JADX INFO: renamed from: U7.f, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class C1478f extends U {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final C1478f f11509o = new C1478f();

    private C1478f() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean l(g0 g0Var, InterfaceC1277b it) {
        AbstractC2855l.g(it, "it");
        return U.f11461a.j().containsKey(AbstractC2345C.d(g0Var));
    }

    public final k8.f j(g0 functionDescriptor) {
        AbstractC2855l.g(functionDescriptor, "functionDescriptor");
        Map mapJ = U.f11461a.j();
        String strD = AbstractC2345C.d(functionDescriptor);
        if (strD == null) {
            return null;
        }
        return (k8.f) mapJ.get(strD);
    }

    public final boolean k(g0 functionDescriptor) {
        AbstractC2855l.g(functionDescriptor, "functionDescriptor");
        return I7.i.g0(functionDescriptor) && AbstractC3340e.i(functionDescriptor, false, new C1477e(functionDescriptor), 1, null) != null;
    }

    public final boolean m(g0 g0Var) {
        AbstractC2855l.g(g0Var, "<this>");
        return AbstractC2855l.b(g0Var.getName().j(), "removeAt") && AbstractC2855l.b(AbstractC2345C.d(g0Var), U.f11461a.h().d());
    }
}
