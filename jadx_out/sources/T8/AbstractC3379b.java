package t8;

import C8.S;
import I7.o;
import L7.AbstractC1294t;
import L7.InterfaceC1277b;
import L7.InterfaceC1279d;
import L7.InterfaceC1280e;
import L7.InterfaceC1283h;
import L7.InterfaceC1288m;
import L7.m0;
import L7.t0;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC2855l;
import o8.AbstractC3027i;
import o8.AbstractC3029k;
import s8.AbstractC3340e;

/* JADX INFO: renamed from: t8.b, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC3379b {
    private static final boolean a(InterfaceC1280e interfaceC1280e) {
        return AbstractC2855l.b(AbstractC3340e.o(interfaceC1280e), o.f5138w);
    }

    private static final boolean b(S s10, boolean z10) {
        InterfaceC1283h interfaceC1283hP = s10.K0().p();
        m0 m0Var = interfaceC1283hP instanceof m0 ? (m0) interfaceC1283hP : null;
        if (m0Var == null) {
            return false;
        }
        return (z10 || !AbstractC3029k.d(m0Var)) && e(H8.d.o(m0Var));
    }

    public static final boolean c(S s10) {
        AbstractC2855l.g(s10, "<this>");
        InterfaceC1283h interfaceC1283hP = s10.K0().p();
        return interfaceC1283hP != null && ((AbstractC3029k.b(interfaceC1283hP) && d(interfaceC1283hP)) || AbstractC3029k.i(s10));
    }

    public static final boolean d(InterfaceC1288m interfaceC1288m) {
        AbstractC2855l.g(interfaceC1288m, "<this>");
        return AbstractC3029k.g(interfaceC1288m) && !a((InterfaceC1280e) interfaceC1288m);
    }

    private static final boolean e(S s10) {
        return c(s10) || b(s10, true);
    }

    public static final boolean f(InterfaceC1277b descriptor) {
        AbstractC2855l.g(descriptor, "descriptor");
        InterfaceC1279d interfaceC1279d = descriptor instanceof InterfaceC1279d ? (InterfaceC1279d) descriptor : null;
        if (interfaceC1279d == null || AbstractC1294t.g(interfaceC1279d.getVisibility())) {
            return false;
        }
        InterfaceC1280e interfaceC1280eB = interfaceC1279d.B();
        AbstractC2855l.f(interfaceC1280eB, "getConstructedClass(...)");
        if (AbstractC3029k.g(interfaceC1280eB) || AbstractC3027i.G(interfaceC1279d.B())) {
            return false;
        }
        List listI = interfaceC1279d.i();
        AbstractC2855l.f(listI, "getValueParameters(...)");
        if (listI != null && listI.isEmpty()) {
            return false;
        }
        Iterator it = listI.iterator();
        while (it.hasNext()) {
            S type = ((t0) it.next()).getType();
            AbstractC2855l.f(type, "getType(...)");
            if (e(type)) {
                return true;
            }
        }
        return false;
    }
}
