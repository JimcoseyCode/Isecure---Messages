package o8;

import C8.AbstractC0407d0;
import C8.G0;
import C8.N0;
import C8.S;
import L7.A;
import L7.I;
import L7.InterfaceC1276a;
import L7.InterfaceC1280e;
import L7.InterfaceC1283h;
import L7.InterfaceC1288m;
import L7.Z;
import L7.a0;
import L7.r0;
import L7.u0;
import kotlin.jvm.internal.AbstractC2855l;
import s8.AbstractC3340e;

/* JADX INFO: renamed from: o8.k, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC3029k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final k8.c f30529a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final k8.b f30530b;

    static {
        k8.c cVar = new k8.c("kotlin.jvm.JvmInline");
        f30529a = cVar;
        f30530b = k8.b.f29200d.c(cVar);
    }

    public static final boolean a(InterfaceC1276a interfaceC1276a) {
        AbstractC2855l.g(interfaceC1276a, "<this>");
        if (!(interfaceC1276a instanceof a0)) {
            return false;
        }
        Z zY0 = ((a0) interfaceC1276a).y0();
        AbstractC2855l.f(zY0, "getCorrespondingProperty(...)");
        return f(zY0);
    }

    public static final boolean b(InterfaceC1288m interfaceC1288m) {
        AbstractC2855l.g(interfaceC1288m, "<this>");
        return (interfaceC1288m instanceof InterfaceC1280e) && (((InterfaceC1280e) interfaceC1288m).w0() instanceof A);
    }

    public static final boolean c(S s10) {
        AbstractC2855l.g(s10, "<this>");
        InterfaceC1283h interfaceC1283hP = s10.K0().p();
        if (interfaceC1283hP != null) {
            return b(interfaceC1283hP);
        }
        return false;
    }

    public static final boolean d(InterfaceC1288m interfaceC1288m) {
        AbstractC2855l.g(interfaceC1288m, "<this>");
        return (interfaceC1288m instanceof InterfaceC1280e) && (((InterfaceC1280e) interfaceC1288m).w0() instanceof I);
    }

    public static final boolean e(u0 u0Var) {
        A aQ;
        AbstractC2855l.g(u0Var, "<this>");
        if (u0Var.h0() != null) {
            return false;
        }
        InterfaceC1288m interfaceC1288mB = u0Var.b();
        k8.f fVarC = null;
        InterfaceC1280e interfaceC1280e = interfaceC1288mB instanceof InterfaceC1280e ? (InterfaceC1280e) interfaceC1288mB : null;
        if (interfaceC1280e != null && (aQ = AbstractC3340e.q(interfaceC1280e)) != null) {
            fVarC = aQ.c();
        }
        return AbstractC2855l.b(fVarC, u0Var.getName());
    }

    public static final boolean f(u0 u0Var) {
        r0 r0VarW0;
        AbstractC2855l.g(u0Var, "<this>");
        if (u0Var.h0() != null) {
            return false;
        }
        InterfaceC1288m interfaceC1288mB = u0Var.b();
        InterfaceC1280e interfaceC1280e = interfaceC1288mB instanceof InterfaceC1280e ? (InterfaceC1280e) interfaceC1288mB : null;
        if (interfaceC1280e == null || (r0VarW0 = interfaceC1280e.w0()) == null) {
            return false;
        }
        k8.f name = u0Var.getName();
        AbstractC2855l.f(name, "getName(...)");
        return r0VarW0.a(name);
    }

    public static final boolean g(InterfaceC1288m interfaceC1288m) {
        AbstractC2855l.g(interfaceC1288m, "<this>");
        return b(interfaceC1288m) || d(interfaceC1288m);
    }

    public static final boolean h(S s10) {
        AbstractC2855l.g(s10, "<this>");
        InterfaceC1283h interfaceC1283hP = s10.K0().p();
        if (interfaceC1283hP != null) {
            return g(interfaceC1283hP);
        }
        return false;
    }

    public static final boolean i(S s10) {
        AbstractC2855l.g(s10, "<this>");
        InterfaceC1283h interfaceC1283hP = s10.K0().p();
        return (interfaceC1283hP == null || !d(interfaceC1283hP) || D8.s.f846a.u0(s10)) ? false : true;
    }

    public static final S j(S s10) {
        AbstractC2855l.g(s10, "<this>");
        S sK = k(s10);
        if (sK != null) {
            return G0.f(s10).p(sK, N0.f592k);
        }
        return null;
    }

    public static final S k(S s10) {
        A aQ;
        AbstractC2855l.g(s10, "<this>");
        InterfaceC1283h interfaceC1283hP = s10.K0().p();
        InterfaceC1280e interfaceC1280e = interfaceC1283hP instanceof InterfaceC1280e ? (InterfaceC1280e) interfaceC1283hP : null;
        if (interfaceC1280e == null || (aQ = AbstractC3340e.q(interfaceC1280e)) == null) {
            return null;
        }
        return (AbstractC0407d0) aQ.d();
    }
}
