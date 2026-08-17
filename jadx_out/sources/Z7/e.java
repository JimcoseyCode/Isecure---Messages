package Z7;

import C8.A0;
import C8.AbstractC0407d0;
import C8.B0;
import C8.D0;
import C8.I0;
import C8.J0;
import C8.N0;
import C8.S;
import C8.V;
import C8.Y;
import C8.r0;
import C8.s0;
import C8.v0;
import E8.l;
import L7.InterfaceC1280e;
import L7.InterfaceC1283h;
import L7.m0;
import M7.o;
import X7.p;
import b8.AbstractC1813A;
import b8.InterfaceC1815C;
import b8.InterfaceC1822f;
import b8.InterfaceC1823g;
import b8.InterfaceC1825i;
import b8.InterfaceC1826j;
import b8.v;
import b8.x;
import b8.y;
import j7.AbstractC2800q;
import j7.C2783G;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final X7.k f13641a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final p f13642b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final g f13643c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final A0 f13644d;

    /* JADX WARN: Multi-variable type inference failed */
    public e(X7.k c10, p typeParameterResolver) {
        AbstractC2855l.g(c10, "c");
        AbstractC2855l.g(typeParameterResolver, "typeParameterResolver");
        this.f13641a = c10;
        this.f13642b = typeParameterResolver;
        g gVar = new g();
        this.f13643c = gVar;
        this.f13644d = new A0(gVar, null, 2, 0 == true ? 1 : 0);
    }

    private final boolean b(InterfaceC1826j interfaceC1826j, InterfaceC1280e interfaceC1280e) {
        N0 n0M;
        if (!AbstractC1813A.a((x) AbstractC2800q.s0(interfaceC1826j.B()))) {
            return false;
        }
        List parameters = K7.d.f7130a.b(interfaceC1280e).j().getParameters();
        AbstractC2855l.f(parameters, "getParameters(...)");
        m0 m0Var = (m0) AbstractC2800q.s0(parameters);
        return (m0Var == null || (n0M = m0Var.m()) == null || n0M == N0.f594m) ? false : true;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final List c(InterfaceC1826j interfaceC1826j, a aVar, v0 v0Var) {
        boolean z10;
        if (interfaceC1826j.u()) {
            z10 = true;
        } else {
            if (interfaceC1826j.B().isEmpty()) {
                List parameters = v0Var.getParameters();
                AbstractC2855l.f(parameters, "getParameters(...)");
                if (!parameters.isEmpty()) {
                }
            }
            z10 = false;
        }
        List parameters2 = v0Var.getParameters();
        AbstractC2855l.f(parameters2, "getParameters(...)");
        if (z10) {
            return d(interfaceC1826j, parameters2, v0Var, aVar);
        }
        if (parameters2.size() != interfaceC1826j.B().size()) {
            ArrayList arrayList = new ArrayList(AbstractC2800q.u(parameters2, 10));
            Iterator it = parameters2.iterator();
            while (it.hasNext()) {
                arrayList.add(new D0(l.d(E8.k.f1209c0, ((m0) it.next()).getName().j())));
            }
            return AbstractC2800q.P0(arrayList);
        }
        Iterable<C2783G> iterableV0 = AbstractC2800q.V0(interfaceC1826j.B());
        ArrayList arrayList2 = new ArrayList(AbstractC2800q.u(iterableV0, 10));
        for (C2783G c2783g : iterableV0) {
            int iA = c2783g.a();
            x xVar = (x) c2783g.b();
            parameters2.size();
            m0 m0Var = (m0) parameters2.get(iA);
            a aVarB = b.b(I0.f575h, false, false, null, 7, null);
            AbstractC2855l.d(m0Var);
            arrayList2.add(q(xVar, aVarB, m0Var));
        }
        return AbstractC2800q.P0(arrayList2);
    }

    private final List d(InterfaceC1826j interfaceC1826j, List list, v0 v0Var, a aVar) {
        InterfaceC1826j interfaceC1826j2;
        v0 v0Var2;
        a aVar2;
        B0 b0A;
        ArrayList arrayList = new ArrayList(AbstractC2800q.u(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            m0 m0Var = (m0) it.next();
            if (H8.d.q(m0Var, null, aVar.c())) {
                b0A = J0.t(m0Var, aVar);
                interfaceC1826j2 = interfaceC1826j;
                v0Var2 = v0Var;
                aVar2 = aVar;
            } else {
                interfaceC1826j2 = interfaceC1826j;
                v0Var2 = v0Var;
                aVar2 = aVar;
                b0A = this.f13643c.a(m0Var, aVar2.j(interfaceC1826j2.u()), this.f13644d, new Y(this.f13641a.e(), new d(this, m0Var, aVar2, v0Var2, interfaceC1826j2)));
            }
            arrayList.add(b0A);
            aVar = aVar2;
            v0Var = v0Var2;
            interfaceC1826j = interfaceC1826j2;
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final S e(e eVar, m0 m0Var, a aVar, v0 v0Var, InterfaceC1826j interfaceC1826j) {
        A0 a02 = eVar.f13644d;
        InterfaceC1283h interfaceC1283hP = v0Var.p();
        return a02.e(m0Var, aVar.k(interfaceC1283hP != null ? interfaceC1283hP.r() : null).j(interfaceC1826j.u()));
    }

    private final AbstractC0407d0 f(InterfaceC1826j interfaceC1826j, a aVar, AbstractC0407d0 abstractC0407d0) {
        InterfaceC1826j interfaceC1826j2;
        r0 r0VarB;
        if (abstractC0407d0 == null || (r0VarB = abstractC0407d0.J0()) == null) {
            interfaceC1826j2 = interfaceC1826j;
            r0VarB = s0.b(new X7.g(this.f13641a, interfaceC1826j2, false, 4, null));
        } else {
            interfaceC1826j2 = interfaceC1826j;
        }
        r0 r0Var = r0VarB;
        v0 v0VarG = g(interfaceC1826j2, aVar);
        if (v0VarG == null) {
            return null;
        }
        boolean zJ = j(aVar);
        return (AbstractC2855l.b(abstractC0407d0 != null ? abstractC0407d0.K0() : null, v0VarG) && !interfaceC1826j2.u() && zJ) ? abstractC0407d0.O0(true) : V.k(r0Var, v0VarG, c(interfaceC1826j2, aVar, v0VarG), zJ, null, 16, null);
    }

    private final v0 g(InterfaceC1826j interfaceC1826j, a aVar) {
        v0 v0VarJ;
        InterfaceC1825i classifier = interfaceC1826j.getClassifier();
        if (classifier == null) {
            return h(interfaceC1826j);
        }
        if (!(classifier instanceof InterfaceC1823g)) {
            if (classifier instanceof y) {
                m0 m0VarA = this.f13642b.a((y) classifier);
                if (m0VarA != null) {
                    return m0VarA.j();
                }
                return null;
            }
            throw new IllegalStateException("Unknown classifier kind: " + classifier);
        }
        InterfaceC1823g interfaceC1823g = (InterfaceC1823g) classifier;
        k8.c cVarD = interfaceC1823g.d();
        if (cVarD != null) {
            InterfaceC1280e interfaceC1280eK = k(interfaceC1826j, aVar, cVarD);
            if (interfaceC1280eK == null) {
                interfaceC1280eK = this.f13641a.a().n().a(interfaceC1823g);
            }
            return (interfaceC1280eK == null || (v0VarJ = interfaceC1280eK.j()) == null) ? h(interfaceC1826j) : v0VarJ;
        }
        throw new AssertionError("Class type should have a FQ name: " + classifier);
    }

    private final v0 h(InterfaceC1826j interfaceC1826j) {
        v0 v0VarJ = this.f13641a.a().b().f().r().d(k8.b.f29200d.c(new k8.c(interfaceC1826j.v())), AbstractC2800q.e(0)).j();
        AbstractC2855l.f(v0VarJ, "getTypeConstructor(...)");
        return v0VarJ;
    }

    private final boolean i(N0 n02, m0 m0Var) {
        return (m0Var.m() == N0.f592k || n02 == m0Var.m()) ? false : true;
    }

    private final boolean j(a aVar) {
        return (aVar.g() == c.f13633i || aVar.h() || aVar.b() == I0.f574g) ? false : true;
    }

    private final InterfaceC1280e k(InterfaceC1826j interfaceC1826j, a aVar, k8.c cVar) {
        if (aVar.h() && AbstractC2855l.b(cVar, f.f13645a)) {
            return this.f13641a.a().p().d();
        }
        K7.d dVar = K7.d.f7130a;
        InterfaceC1280e interfaceC1280eF = K7.d.f(dVar, cVar, this.f13641a.d().n(), null, 4, null);
        if (interfaceC1280eF == null) {
            return null;
        }
        return (dVar.d(interfaceC1280eF) && (aVar.g() == c.f13633i || aVar.b() == I0.f574g || b(interfaceC1826j, interfaceC1280eF))) ? dVar.b(interfaceC1280eF) : interfaceC1280eF;
    }

    public static /* synthetic */ S m(e eVar, InterfaceC1822f interfaceC1822f, a aVar, boolean z10, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            z10 = false;
        }
        return eVar.l(interfaceC1822f, aVar, z10);
    }

    private final S n(InterfaceC1826j interfaceC1826j, a aVar) {
        boolean z10 = (aVar.h() || aVar.b() == I0.f574g) ? false : true;
        boolean zU = interfaceC1826j.u();
        if (!zU && !z10) {
            AbstractC0407d0 abstractC0407d0F = f(interfaceC1826j, aVar, null);
            return abstractC0407d0F != null ? abstractC0407d0F : o(interfaceC1826j);
        }
        AbstractC0407d0 abstractC0407d0F2 = f(interfaceC1826j, aVar.l(c.f13633i), null);
        if (abstractC0407d0F2 == null) {
            return o(interfaceC1826j);
        }
        AbstractC0407d0 abstractC0407d0F3 = f(interfaceC1826j, aVar.l(c.f13632h), abstractC0407d0F2);
        return abstractC0407d0F3 == null ? o(interfaceC1826j) : zU ? new k(abstractC0407d0F2, abstractC0407d0F3) : V.e(abstractC0407d0F2, abstractC0407d0F3);
    }

    private static final E8.i o(InterfaceC1826j interfaceC1826j) {
        return l.d(E8.k.f1221l, interfaceC1826j.m());
    }

    private final B0 q(x xVar, a aVar, m0 m0Var) {
        if (!(xVar instanceof InterfaceC1815C)) {
            return new D0(N0.f592k, p(xVar, aVar));
        }
        InterfaceC1815C interfaceC1815C = (InterfaceC1815C) xVar;
        x xVarY = interfaceC1815C.y();
        N0 n02 = interfaceC1815C.F() ? N0.f594m : N0.f593l;
        if (xVarY == null || i(n02, m0Var)) {
            B0 b0T = J0.t(m0Var, aVar);
            AbstractC2855l.f(b0T, "makeStarProjection(...)");
            return b0T;
        }
        M7.c cVarA = U7.V.a(this.f13641a, interfaceC1815C);
        S sP = p(xVarY, b.b(I0.f575h, false, false, null, 7, null));
        if (cVarA != null) {
            sP = H8.d.C(sP, M7.h.f7570a.a(AbstractC2800q.y0(sP.getAnnotations(), cVarA)));
        }
        return H8.d.k(sP, n02, m0Var);
    }

    public final S l(InterfaceC1822f arrayType, a attr, boolean z10) {
        AbstractC2855l.g(arrayType, "arrayType");
        AbstractC2855l.g(attr, "attr");
        x xVarL = arrayType.l();
        v vVar = xVarL instanceof v ? (v) xVarL : null;
        I7.l type = vVar != null ? vVar.getType() : null;
        X7.g gVar = new X7.g(this.f13641a, arrayType, true);
        if (type != null) {
            AbstractC0407d0 abstractC0407d0O = this.f13641a.d().n().O(type);
            AbstractC2855l.d(abstractC0407d0O);
            S sC = H8.d.C(abstractC0407d0O, new o(abstractC0407d0O.getAnnotations(), gVar));
            AbstractC2855l.e(sC, "null cannot be cast to non-null type org.jetbrains.kotlin.types.SimpleType");
            AbstractC0407d0 abstractC0407d0 = (AbstractC0407d0) sC;
            return attr.h() ? abstractC0407d0 : V.e(abstractC0407d0, abstractC0407d0.O0(true));
        }
        S sP = p(xVarL, b.b(I0.f575h, attr.h(), false, null, 6, null));
        if (attr.h()) {
            AbstractC0407d0 abstractC0407d0M = this.f13641a.d().n().m(z10 ? N0.f594m : N0.f592k, sP, gVar);
            AbstractC2855l.f(abstractC0407d0M, "getArrayType(...)");
            return abstractC0407d0M;
        }
        AbstractC0407d0 abstractC0407d0M2 = this.f13641a.d().n().m(N0.f592k, sP, gVar);
        AbstractC2855l.f(abstractC0407d0M2, "getArrayType(...)");
        return V.e(abstractC0407d0M2, this.f13641a.d().n().m(N0.f594m, sP, gVar).O0(true));
    }

    public final S p(x xVar, a attr) {
        S sP;
        AbstractC2855l.g(attr, "attr");
        if (xVar instanceof v) {
            I7.l type = ((v) xVar).getType();
            AbstractC0407d0 abstractC0407d0R = type != null ? this.f13641a.d().n().R(type) : this.f13641a.d().n().Z();
            AbstractC2855l.d(abstractC0407d0R);
            return abstractC0407d0R;
        }
        if (xVar instanceof InterfaceC1826j) {
            return n((InterfaceC1826j) xVar, attr);
        }
        if (xVar instanceof InterfaceC1822f) {
            return m(this, (InterfaceC1822f) xVar, attr, false, 4, null);
        }
        if (xVar instanceof InterfaceC1815C) {
            x xVarY = ((InterfaceC1815C) xVar).y();
            if (xVarY != null && (sP = p(xVarY, attr)) != null) {
                return sP;
            }
            AbstractC0407d0 abstractC0407d0Y = this.f13641a.d().n().y();
            AbstractC2855l.f(abstractC0407d0Y, "getDefaultBound(...)");
            return abstractC0407d0Y;
        }
        if (xVar == null) {
            AbstractC0407d0 abstractC0407d0Y2 = this.f13641a.d().n().y();
            AbstractC2855l.f(abstractC0407d0Y2, "getDefaultBound(...)");
            return abstractC0407d0Y2;
        }
        throw new UnsupportedOperationException("Unsupported type: " + xVar);
    }
}
