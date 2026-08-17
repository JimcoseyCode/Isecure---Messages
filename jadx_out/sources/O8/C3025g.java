package o8;

import C8.v0;
import D8.g;
import L7.D;
import L7.InterfaceC1276a;
import L7.InterfaceC1277b;
import L7.InterfaceC1280e;
import L7.InterfaceC1283h;
import L7.InterfaceC1288m;
import L7.N;
import L7.h0;
import L7.m0;
import j7.AbstractC2800q;
import java.util.Collection;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC2855l;
import o8.C3033o;

/* JADX INFO: renamed from: o8.g, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class C3025g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C3025g f30519a = new C3025g();

    private C3025g() {
    }

    public static /* synthetic */ boolean f(C3025g c3025g, InterfaceC1276a interfaceC1276a, InterfaceC1276a interfaceC1276a2, boolean z10, boolean z11, boolean z12, D8.g gVar, int i10, Object obj) {
        if ((i10 & 8) != 0) {
            z11 = true;
        }
        boolean z13 = z11;
        if ((i10 & 16) != 0) {
            z12 = false;
        }
        return c3025g.e(interfaceC1276a, interfaceC1276a2, z10, z13, z12, gVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean g(InterfaceC1288m interfaceC1288m, InterfaceC1288m interfaceC1288m2) {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean h(boolean z10, InterfaceC1276a interfaceC1276a, InterfaceC1276a interfaceC1276a2, v0 c12, v0 c22) {
        AbstractC2855l.g(c12, "c1");
        AbstractC2855l.g(c22, "c2");
        if (AbstractC2855l.b(c12, c22)) {
            return true;
        }
        InterfaceC1283h interfaceC1283hP = c12.p();
        InterfaceC1283h interfaceC1283hP2 = c22.p();
        if ((interfaceC1283hP instanceof m0) && (interfaceC1283hP2 instanceof m0)) {
            return f30519a.n((m0) interfaceC1283hP, (m0) interfaceC1283hP2, z10, new C3024f(interfaceC1276a, interfaceC1276a2));
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean i(InterfaceC1276a interfaceC1276a, InterfaceC1276a interfaceC1276a2, InterfaceC1288m interfaceC1288m, InterfaceC1288m interfaceC1288m2) {
        return AbstractC2855l.b(interfaceC1288m, interfaceC1276a) && AbstractC2855l.b(interfaceC1288m2, interfaceC1276a2);
    }

    private final boolean j(InterfaceC1280e interfaceC1280e, InterfaceC1280e interfaceC1280e2) {
        return AbstractC2855l.b(interfaceC1280e.j(), interfaceC1280e2.j());
    }

    public static /* synthetic */ boolean l(C3025g c3025g, InterfaceC1288m interfaceC1288m, InterfaceC1288m interfaceC1288m2, boolean z10, boolean z11, int i10, Object obj) {
        if ((i10 & 8) != 0) {
            z11 = true;
        }
        return c3025g.k(interfaceC1288m, interfaceC1288m2, z10, z11);
    }

    public static /* synthetic */ boolean o(C3025g c3025g, m0 m0Var, m0 m0Var2, boolean z10, Function2 function2, int i10, Object obj) {
        if ((i10 & 8) != 0) {
            function2 = C3021c.f30512g;
        }
        return c3025g.n(m0Var, m0Var2, z10, function2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean p(InterfaceC1288m interfaceC1288m, InterfaceC1288m interfaceC1288m2) {
        return false;
    }

    private final boolean q(InterfaceC1288m interfaceC1288m, InterfaceC1288m interfaceC1288m2, Function2 function2, boolean z10) {
        InterfaceC1288m interfaceC1288mB = interfaceC1288m.b();
        InterfaceC1288m interfaceC1288mB2 = interfaceC1288m2.b();
        return ((interfaceC1288mB instanceof InterfaceC1277b) || (interfaceC1288mB2 instanceof InterfaceC1277b)) ? ((Boolean) function2.invoke(interfaceC1288mB, interfaceC1288mB2)).booleanValue() : l(this, interfaceC1288mB, interfaceC1288mB2, z10, false, 8, null);
    }

    private final h0 r(InterfaceC1276a interfaceC1276a) {
        while (interfaceC1276a instanceof InterfaceC1277b) {
            InterfaceC1277b interfaceC1277b = (InterfaceC1277b) interfaceC1276a;
            if (interfaceC1277b.getKind() != InterfaceC1277b.a.FAKE_OVERRIDE) {
                break;
            }
            Collection collectionE = interfaceC1277b.e();
            AbstractC2855l.f(collectionE, "getOverriddenDescriptors(...)");
            interfaceC1276a = (InterfaceC1277b) AbstractC2800q.D0(collectionE);
            if (interfaceC1276a == null) {
                return null;
            }
        }
        return interfaceC1276a.g();
    }

    public final boolean e(InterfaceC1276a a10, InterfaceC1276a b10, boolean z10, boolean z11, boolean z12, D8.g kotlinTypeRefiner) {
        AbstractC2855l.g(a10, "a");
        AbstractC2855l.g(b10, "b");
        AbstractC2855l.g(kotlinTypeRefiner, "kotlinTypeRefiner");
        if (AbstractC2855l.b(a10, b10)) {
            return true;
        }
        if (!AbstractC2855l.b(a10.getName(), b10.getName())) {
            return false;
        }
        if (z11 && (a10 instanceof D) && (b10 instanceof D) && ((D) a10).J() != ((D) b10).J()) {
            return false;
        }
        if ((AbstractC2855l.b(a10.b(), b10.b()) && (!z10 || !AbstractC2855l.b(r(a10), r(b10)))) || AbstractC3027i.E(a10) || AbstractC3027i.E(b10) || !q(a10, b10, C3022d.f30513g, z10)) {
            return false;
        }
        C3033o c3033oI = C3033o.i(kotlinTypeRefiner, new C3023e(z10, a10, b10));
        AbstractC2855l.f(c3033oI, "create(...)");
        C3033o.i.a aVarC = c3033oI.E(a10, b10, null, !z12).c();
        C3033o.i.a aVar = C3033o.i.a.OVERRIDABLE;
        return aVarC == aVar && c3033oI.E(b10, a10, null, z12 ^ true).c() == aVar;
    }

    public final boolean k(InterfaceC1288m interfaceC1288m, InterfaceC1288m interfaceC1288m2, boolean z10, boolean z11) {
        return ((interfaceC1288m instanceof InterfaceC1280e) && (interfaceC1288m2 instanceof InterfaceC1280e)) ? j((InterfaceC1280e) interfaceC1288m, (InterfaceC1280e) interfaceC1288m2) : ((interfaceC1288m instanceof m0) && (interfaceC1288m2 instanceof m0)) ? o(this, (m0) interfaceC1288m, (m0) interfaceC1288m2, z10, null, 8, null) : ((interfaceC1288m instanceof InterfaceC1276a) && (interfaceC1288m2 instanceof InterfaceC1276a)) ? f(this, (InterfaceC1276a) interfaceC1288m, (InterfaceC1276a) interfaceC1288m2, z10, z11, false, g.a.f821a, 16, null) : ((interfaceC1288m instanceof N) && (interfaceC1288m2 instanceof N)) ? AbstractC2855l.b(((N) interfaceC1288m).d(), ((N) interfaceC1288m2).d()) : AbstractC2855l.b(interfaceC1288m, interfaceC1288m2);
    }

    public final boolean m(m0 a10, m0 b10, boolean z10) {
        AbstractC2855l.g(a10, "a");
        AbstractC2855l.g(b10, "b");
        return o(this, a10, b10, z10, null, 8, null);
    }

    public final boolean n(m0 a10, m0 b10, boolean z10, Function2 equivalentCallables) {
        AbstractC2855l.g(a10, "a");
        AbstractC2855l.g(b10, "b");
        AbstractC2855l.g(equivalentCallables, "equivalentCallables");
        if (AbstractC2855l.b(a10, b10)) {
            return true;
        }
        return !AbstractC2855l.b(a10.b(), b10.b()) && q(a10, b10, equivalentCallables, z10) && a10.getIndex() == b10.getIndex();
    }
}
