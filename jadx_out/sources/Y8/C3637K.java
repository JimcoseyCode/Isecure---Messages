package y8;

import A8.C0381a;
import A8.C0383c;
import A8.C0393m;
import L7.AbstractC1295u;
import L7.EnumC1281f;
import L7.InterfaceC1276a;
import L7.InterfaceC1277b;
import L7.InterfaceC1279d;
import L7.InterfaceC1280e;
import L7.InterfaceC1288m;
import L7.c0;
import L7.g0;
import L7.h0;
import L7.l0;
import L7.t0;
import M7.h;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import h8.AbstractC2709b;
import j7.AbstractC2800q;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.AbstractC2855l;
import o8.AbstractC3026h;
import s8.AbstractC3340e;
import y8.N;

/* JADX INFO: renamed from: y8.K, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class C3637K {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C3654p f34031a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C3645g f34032b;

    public C3637K(C3654p c10) {
        AbstractC2855l.g(c10, "c");
        this.f34031a = c10;
        this.f34032b = new C3645g(c10.c().q(), c10.c().r());
    }

    private final c0 A(f8.q qVar, C3654p c3654p, InterfaceC1276a interfaceC1276a, int i10) {
        return AbstractC3026h.b(interfaceC1276a, c3654p.i().u(qVar), null, M7.h.f7570a.b(), i10);
    }

    private final List B(List list, m8.p pVar, EnumC3642d enumC3642d) {
        InterfaceC1288m interfaceC1288mE = this.f34031a.e();
        AbstractC2855l.e(interfaceC1288mE, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.CallableDescriptor");
        InterfaceC1276a interfaceC1276a = (InterfaceC1276a) interfaceC1288mE;
        InterfaceC1288m interfaceC1288mB = interfaceC1276a.b();
        AbstractC2855l.f(interfaceC1288mB, "getContainingDeclaration(...)");
        N nI = i(interfaceC1288mB);
        ArrayList arrayList = new ArrayList(AbstractC2800q.u(list, 10));
        int i10 = 0;
        for (Object obj : list) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                AbstractC2800q.t();
            }
            f8.u uVar = (f8.u) obj;
            int iJ = uVar.P() ? uVar.J() : 0;
            M7.h hVarB = (nI == null || !AbstractC2709b.f28533c.d(iJ).booleanValue()) ? M7.h.f7570a.b() : new A8.T(this.f34031a.h(), new C3634H(this, nI, pVar, enumC3642d, i10, uVar));
            k8.f fVarB = AbstractC3638L.b(this.f34031a.g(), uVar.K());
            C8.S sU = this.f34031a.i().u(h8.f.q(uVar, this.f34031a.j()));
            Boolean boolD = AbstractC2709b.f28522H.d(iJ);
            AbstractC2855l.f(boolD, "get(...)");
            boolean zBooleanValue = boolD.booleanValue();
            Boolean boolD2 = AbstractC2709b.f28523I.d(iJ);
            AbstractC2855l.f(boolD2, "get(...)");
            boolean zBooleanValue2 = boolD2.booleanValue();
            Boolean boolD3 = AbstractC2709b.f28524J.d(iJ);
            AbstractC2855l.f(boolD3, "get(...)");
            boolean zBooleanValue3 = boolD3.booleanValue();
            f8.q qVarT = h8.f.t(uVar, this.f34031a.j());
            C8.S sU2 = qVarT != null ? this.f34031a.i().u(qVarT) : null;
            h0 NO_SOURCE = h0.f7335a;
            AbstractC2855l.f(NO_SOURCE, "NO_SOURCE");
            InterfaceC1276a interfaceC1276a2 = interfaceC1276a;
            arrayList.add(new O7.V(interfaceC1276a2, null, i10, hVarB, fVarB, sU, zBooleanValue, zBooleanValue2, zBooleanValue3, sU2, NO_SOURCE));
            interfaceC1276a = interfaceC1276a2;
            i10 = i11;
        }
        return AbstractC2800q.P0(arrayList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List C(C3637K c3637k, N n10, m8.p pVar, EnumC3642d enumC3642d, int i10, f8.u uVar) {
        return AbstractC2800q.P0(c3637k.f34031a.c().d().h(n10, pVar, enumC3642d, i10, uVar));
    }

    private final N i(InterfaceC1288m interfaceC1288m) {
        if (interfaceC1288m instanceof L7.N) {
            return new N.b(((L7.N) interfaceC1288m).d(), this.f34031a.g(), this.f34031a.j(), this.f34031a.d());
        }
        if (interfaceC1288m instanceof C0393m) {
            return ((C0393m) interfaceC1288m).f1();
        }
        return null;
    }

    private final M7.h j(m8.p pVar, int i10, EnumC3642d enumC3642d) {
        return !AbstractC2709b.f28533c.d(i10).booleanValue() ? M7.h.f7570a.b() : new A8.T(this.f34031a.h(), new C3631E(this, pVar, enumC3642d));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List k(C3637K c3637k, m8.p pVar, EnumC3642d enumC3642d) {
        N nI = c3637k.i(c3637k.f34031a.e());
        List listP0 = nI != null ? AbstractC2800q.P0(c3637k.f34031a.c().d().e(nI, pVar, enumC3642d)) : null;
        return listP0 == null ? AbstractC2800q.j() : listP0;
    }

    private final c0 l() {
        InterfaceC1288m interfaceC1288mE = this.f34031a.e();
        InterfaceC1280e interfaceC1280e = interfaceC1288mE instanceof InterfaceC1280e ? (InterfaceC1280e) interfaceC1288mE : null;
        if (interfaceC1280e != null) {
            return interfaceC1280e.G0();
        }
        return null;
    }

    private final M7.h m(f8.n nVar, boolean z10) {
        return !AbstractC2709b.f28533c.d(nVar.Z()).booleanValue() ? M7.h.f7570a.b() : new A8.T(this.f34031a.h(), new C3632F(this, z10, nVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List n(C3637K c3637k, boolean z10, f8.n nVar) {
        N nI = c3637k.i(c3637k.f34031a.e());
        List listP0 = nI != null ? z10 ? AbstractC2800q.P0(c3637k.f34031a.c().d().a(nI, nVar)) : AbstractC2800q.P0(c3637k.f34031a.c().d().b(nI, nVar)) : null;
        return listP0 == null ? AbstractC2800q.j() : listP0;
    }

    private final M7.h o(m8.p pVar, EnumC3642d enumC3642d) {
        return new C0381a(this.f34031a.h(), new C3633G(this, pVar, enumC3642d));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List p(C3637K c3637k, m8.p pVar, EnumC3642d enumC3642d) {
        N nI = c3637k.i(c3637k.f34031a.e());
        List listI = nI != null ? c3637k.f34031a.c().d().i(nI, pVar, enumC3642d) : null;
        return listI == null ? AbstractC2800q.j() : listI;
    }

    private final void q(A8.O o10, c0 c0Var, c0 c0Var2, List list, List list2, List list3, C8.S s10, L7.E e10, AbstractC1295u abstractC1295u, Map map) {
        o10.l1(c0Var, c0Var2, list, list2, list3, s10, e10, abstractC1295u, map);
    }

    private final int t(int i10) {
        return (i10 & 63) + ((i10 >> 8) << 6);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final B8.j v(C3637K c3637k, f8.n nVar, A8.N n10) {
        return c3637k.f34031a.h().g(new C3635I(c3637k, nVar, n10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final q8.g w(C3637K c3637k, f8.n nVar, A8.N n10) {
        N nI = c3637k.i(c3637k.f34031a.e());
        AbstractC2855l.d(nI);
        InterfaceC3643e interfaceC3643eD = c3637k.f34031a.c().d();
        C8.S returnType = n10.getReturnType();
        AbstractC2855l.f(returnType, "getReturnType(...)");
        return (q8.g) interfaceC3643eD.g(nI, nVar, returnType);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final B8.j x(C3637K c3637k, f8.n nVar, A8.N n10) {
        return c3637k.f34031a.h().g(new C3636J(c3637k, nVar, n10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final q8.g y(C3637K c3637k, f8.n nVar, A8.N n10) {
        N nI = c3637k.i(c3637k.f34031a.e());
        AbstractC2855l.d(nI);
        InterfaceC3643e interfaceC3643eD = c3637k.f34031a.c().d();
        C8.S returnType = n10.getReturnType();
        AbstractC2855l.f(returnType, "getReturnType(...)");
        return (q8.g) interfaceC3643eD.l(nI, nVar, returnType);
    }

    public final InterfaceC1279d r(f8.d proto, boolean z10) {
        AbstractC2855l.g(proto, "proto");
        InterfaceC1288m interfaceC1288mE = this.f34031a.e();
        AbstractC2855l.e(interfaceC1288mE, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
        InterfaceC1280e interfaceC1280e = (InterfaceC1280e) interfaceC1288mE;
        int I9 = proto.I();
        EnumC3642d enumC3642d = EnumC3642d.FUNCTION;
        C0383c c0383c = new C0383c(interfaceC1280e, null, j(proto, I9, enumC3642d), z10, InterfaceC1277b.a.DECLARATION, proto, this.f34031a.g(), this.f34031a.j(), this.f34031a.k(), this.f34031a.d(), null, IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET, null);
        C3637K c3637kF = C3654p.b(this.f34031a, c0383c, AbstractC2800q.j(), null, null, null, null, 60, null).f();
        List listL = proto.L();
        AbstractC2855l.f(listL, "getValueParameterList(...)");
        c0383c.n1(c3637kF.B(listL, proto, enumC3642d), P.a(O.f34047a, (f8.x) AbstractC2709b.f28534d.d(proto.I())));
        c0383c.d1(interfaceC1280e.r());
        c0383c.T0(interfaceC1280e.J());
        c0383c.V0(!AbstractC2709b.f28545o.d(proto.I()).booleanValue());
        return c0383c;
    }

    public final g0 s(f8.i proto) {
        C8.S sU;
        AbstractC2855l.g(proto, "proto");
        int iB0 = proto.s0() ? proto.b0() : t(proto.d0());
        EnumC3642d enumC3642d = EnumC3642d.FUNCTION;
        M7.h hVarJ = j(proto, iB0, enumC3642d);
        M7.h hVarO = h8.f.g(proto) ? o(proto, enumC3642d) : M7.h.f7570a.b();
        A8.O o10 = new A8.O(this.f34031a.e(), null, hVarJ, AbstractC3638L.b(this.f34031a.g(), proto.c0()), P.b(O.f34047a, (f8.j) AbstractC2709b.f28546p.d(iB0)), proto, this.f34031a.g(), this.f34031a.j(), AbstractC2855l.b(AbstractC3340e.o(this.f34031a.e()).c(AbstractC3638L.b(this.f34031a.g(), proto.c0())), Q.f34059a) ? h8.h.f28564b.b() : this.f34031a.k(), this.f34031a.d(), null, IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET, null);
        C3654p c3654p = this.f34031a;
        List listK0 = proto.k0();
        AbstractC2855l.f(listK0, "getTypeParameterList(...)");
        C3654p c3654pB = C3654p.b(c3654p, o10, listK0, null, null, null, null, 60, null);
        f8.q qVarK = h8.f.k(proto, this.f34031a.j());
        c0 c0VarI = (qVarK == null || (sU = c3654pB.i().u(qVarK)) == null) ? null : AbstractC3026h.i(o10, sU, hVarO);
        c0 c0VarL = l();
        List listC = h8.f.c(proto, this.f34031a.j());
        ArrayList arrayList = new ArrayList();
        int i10 = 0;
        for (Object obj : listC) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                AbstractC2800q.t();
            }
            c0 c0VarA = A((f8.q) obj, c3654pB, o10, i10);
            if (c0VarA != null) {
                arrayList.add(c0VarA);
            }
            i10 = i11;
        }
        List listM = c3654pB.i().m();
        C3637K c3637kF = c3654pB.f();
        List listP0 = proto.p0();
        AbstractC2855l.f(listP0, "getValueParameterList(...)");
        List listB = c3637kF.B(listP0, proto, EnumC3642d.FUNCTION);
        C8.S sU2 = c3654pB.i().u(h8.f.m(proto, this.f34031a.j()));
        O o11 = O.f34047a;
        q(o10, c0VarI, c0VarL, arrayList, listM, listB, sU2, o11.b((f8.k) AbstractC2709b.f28535e.d(iB0)), P.a(o11, (f8.x) AbstractC2709b.f28534d.d(iB0)), j7.K.i());
        o10.c1(AbstractC2709b.f28547q.d(iB0).booleanValue());
        o10.Z0(AbstractC2709b.f28548r.d(iB0).booleanValue());
        o10.U0(AbstractC2709b.f28551u.d(iB0).booleanValue());
        o10.b1(AbstractC2709b.f28549s.d(iB0).booleanValue());
        o10.f1(AbstractC2709b.f28550t.d(iB0).booleanValue());
        o10.e1(AbstractC2709b.f28552v.d(iB0).booleanValue());
        o10.T0(AbstractC2709b.f28553w.d(iB0).booleanValue());
        o10.V0(!AbstractC2709b.f28554x.d(iB0).booleanValue());
        Pair pairA = this.f34031a.c().h().a(proto, o10, this.f34031a.j(), c3654pB.i());
        if (pairA != null) {
            o10.R0((InterfaceC1276a.InterfaceC0068a) pairA.c(), pairA.d());
        }
        return o10;
    }

    public final L7.Z u(f8.n proto) {
        C3654p c3654p;
        AbstractC2709b.d dVar;
        AbstractC2709b.d dVar2;
        O7.L lD;
        O7.L l10;
        boolean z10;
        O7.M m10;
        C8.S sU;
        AbstractC2855l.g(proto, "proto");
        int iZ = proto.o0() ? proto.Z() : t(proto.c0());
        InterfaceC1288m interfaceC1288mE = this.f34031a.e();
        M7.h hVarJ = j(proto, iZ, EnumC3642d.PROPERTY);
        O o10 = O.f34047a;
        L7.E eB = o10.b((f8.k) AbstractC2709b.f28535e.d(iZ));
        AbstractC1295u abstractC1295uA = P.a(o10, (f8.x) AbstractC2709b.f28534d.d(iZ));
        Boolean boolD = AbstractC2709b.f28555y.d(iZ);
        AbstractC2855l.f(boolD, "get(...)");
        boolean zBooleanValue = boolD.booleanValue();
        k8.f fVarB = AbstractC3638L.b(this.f34031a.g(), proto.b0());
        InterfaceC1277b.a aVarB = P.b(o10, (f8.j) AbstractC2709b.f28546p.d(iZ));
        Boolean boolD2 = AbstractC2709b.f28517C.d(iZ);
        AbstractC2855l.f(boolD2, "get(...)");
        boolean zBooleanValue2 = boolD2.booleanValue();
        Boolean boolD3 = AbstractC2709b.f28516B.d(iZ);
        AbstractC2855l.f(boolD3, "get(...)");
        boolean zBooleanValue3 = boolD3.booleanValue();
        Boolean boolD4 = AbstractC2709b.f28519E.d(iZ);
        AbstractC2855l.f(boolD4, "get(...)");
        boolean zBooleanValue4 = boolD4.booleanValue();
        Boolean boolD5 = AbstractC2709b.f28520F.d(iZ);
        AbstractC2855l.f(boolD5, "get(...)");
        boolean zBooleanValue5 = boolD5.booleanValue();
        Boolean boolD6 = AbstractC2709b.f28521G.d(iZ);
        AbstractC2855l.f(boolD6, "get(...)");
        int i10 = iZ;
        A8.N n10 = new A8.N(interfaceC1288mE, null, hVarJ, eB, abstractC1295uA, zBooleanValue, fVarB, aVarB, zBooleanValue2, zBooleanValue3, zBooleanValue4, zBooleanValue5, boolD6.booleanValue(), proto, this.f34031a.g(), this.f34031a.j(), this.f34031a.k(), this.f34031a.d());
        C3654p c3654p2 = this.f34031a;
        List listM0 = proto.m0();
        AbstractC2855l.f(listM0, "getTypeParameterList(...)");
        C3654p c3654pB = C3654p.b(c3654p2, n10, listM0, null, null, null, null, 60, null);
        Boolean boolD7 = AbstractC2709b.f28556z.d(i10);
        AbstractC2855l.f(boolD7, "get(...)");
        boolean zBooleanValue6 = boolD7.booleanValue();
        M7.h hVarO = (zBooleanValue6 && h8.f.h(proto)) ? o(proto, EnumC3642d.PROPERTY_GETTER) : M7.h.f7570a.b();
        C8.S sU2 = c3654pB.i().u(h8.f.n(proto, this.f34031a.j()));
        List listM = c3654pB.i().m();
        c0 c0VarL = l();
        f8.q qVarL = h8.f.l(proto, this.f34031a.j());
        c0 c0VarI = (qVarL == null || (sU = c3654pB.i().u(qVarL)) == null) ? null : AbstractC3026h.i(n10, sU, hVarO);
        List listD = h8.f.d(proto, this.f34031a.j());
        ArrayList arrayList = new ArrayList(AbstractC2800q.u(listD, 10));
        int i11 = 0;
        for (Object obj : listD) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                AbstractC2800q.t();
            }
            arrayList.add(A((f8.q) obj, c3654pB, n10, i11));
            i11 = i12;
        }
        n10.Y0(sU2, listM, c0VarL, c0VarI, arrayList);
        Boolean boolD8 = AbstractC2709b.f28533c.d(i10);
        AbstractC2855l.f(boolD8, "get(...)");
        boolean zBooleanValue7 = boolD8.booleanValue();
        AbstractC2709b.d dVar3 = AbstractC2709b.f28534d;
        f8.x xVar = (f8.x) dVar3.d(i10);
        AbstractC2709b.d dVar4 = AbstractC2709b.f28535e;
        int iB = AbstractC2709b.b(zBooleanValue7, xVar, (f8.k) dVar4.d(i10), false, false, false);
        if (zBooleanValue6) {
            int iA0 = proto.p0() ? proto.a0() : iB;
            Boolean boolD9 = AbstractC2709b.f28525K.d(iA0);
            AbstractC2855l.f(boolD9, "get(...)");
            boolean zBooleanValue8 = boolD9.booleanValue();
            Boolean boolD10 = AbstractC2709b.f28526L.d(iA0);
            AbstractC2855l.f(boolD10, "get(...)");
            boolean zBooleanValue9 = boolD10.booleanValue();
            Boolean boolD11 = AbstractC2709b.f28527M.d(iA0);
            AbstractC2855l.f(boolD11, "get(...)");
            boolean zBooleanValue10 = boolD11.booleanValue();
            M7.h hVarJ2 = j(proto, iA0, EnumC3642d.PROPERTY_GETTER);
            if (zBooleanValue8) {
                O o11 = O.f34047a;
                dVar = dVar3;
                c3654p = c3654pB;
                dVar2 = dVar4;
                lD = new O7.L(n10, hVarJ2, o11.b((f8.k) dVar4.d(iA0)), P.a(o11, (f8.x) dVar3.d(iA0)), !zBooleanValue8, zBooleanValue9, zBooleanValue10, n10.getKind(), null, h0.f7335a);
            } else {
                c3654p = c3654pB;
                dVar = dVar3;
                dVar2 = dVar4;
                lD = AbstractC3026h.d(n10, hVarJ2);
                AbstractC2855l.d(lD);
            }
            lD.M0(n10.getReturnType());
        } else {
            c3654p = c3654pB;
            dVar = dVar3;
            dVar2 = dVar4;
            lD = null;
        }
        if (AbstractC2709b.f28515A.d(i10).booleanValue()) {
            if (proto.w0()) {
                iB = proto.h0();
            }
            int i13 = iB;
            Boolean boolD12 = AbstractC2709b.f28525K.d(i13);
            AbstractC2855l.f(boolD12, "get(...)");
            boolean zBooleanValue11 = boolD12.booleanValue();
            Boolean boolD13 = AbstractC2709b.f28526L.d(i13);
            AbstractC2855l.f(boolD13, "get(...)");
            boolean zBooleanValue12 = boolD13.booleanValue();
            Boolean boolD14 = AbstractC2709b.f28527M.d(i13);
            AbstractC2855l.f(boolD14, "get(...)");
            boolean zBooleanValue13 = boolD14.booleanValue();
            EnumC3642d enumC3642d = EnumC3642d.PROPERTY_SETTER;
            M7.h hVarJ3 = j(proto, i13, enumC3642d);
            if (zBooleanValue11) {
                O o12 = O.f34047a;
                l10 = lD;
                z10 = true;
                O7.M m11 = new O7.M(n10, hVarJ3, o12.b((f8.k) dVar2.d(i13)), P.a(o12, (f8.x) dVar.d(i13)), !zBooleanValue11, zBooleanValue12, zBooleanValue13, n10.getKind(), null, h0.f7335a);
                m10 = m11;
                m10.N0((t0) AbstractC2800q.C0(C3654p.b(c3654p, m11, AbstractC2800q.j(), null, null, null, null, 60, null).f().B(AbstractC2800q.e(proto.i0()), proto, enumC3642d)));
            } else {
                l10 = lD;
                z10 = true;
                O7.M mE = AbstractC3026h.e(n10, hVarJ3, M7.h.f7570a.b());
                AbstractC2855l.d(mE);
                m10 = mE;
            }
        } else {
            l10 = lD;
            z10 = true;
            m10 = null;
        }
        if (AbstractC2709b.f28518D.d(i10).booleanValue()) {
            n10.I0(new C3629C(this, proto, n10));
        }
        InterfaceC1288m interfaceC1288mE2 = this.f34031a.e();
        InterfaceC1280e interfaceC1280e = interfaceC1288mE2 instanceof InterfaceC1280e ? (InterfaceC1280e) interfaceC1288mE2 : null;
        if ((interfaceC1280e != null ? interfaceC1280e.getKind() : null) == EnumC1281f.f7324l) {
            n10.I0(new C3630D(this, proto, n10));
        }
        n10.S0(l10, m10, new O7.r(m(proto, false), n10), new O7.r(m(proto, z10), n10));
        return n10;
    }

    public final l0 z(f8.r proto) {
        AbstractC2855l.g(proto, "proto");
        h.a aVar = M7.h.f7570a;
        List<f8.b> listP = proto.P();
        AbstractC2855l.f(listP, "getAnnotationList(...)");
        ArrayList arrayList = new ArrayList(AbstractC2800q.u(listP, 10));
        for (f8.b bVar : listP) {
            C3645g c3645g = this.f34032b;
            AbstractC2855l.d(bVar);
            arrayList.add(c3645g.a(bVar, this.f34031a.g()));
        }
        A8.P p10 = new A8.P(this.f34031a.h(), this.f34031a.e(), aVar.a(arrayList), AbstractC3638L.b(this.f34031a.g(), proto.V()), P.a(O.f34047a, (f8.x) AbstractC2709b.f28534d.d(proto.U())), proto, this.f34031a.g(), this.f34031a.j(), this.f34031a.k(), this.f34031a.d());
        C3654p c3654p = this.f34031a;
        List listY = proto.Y();
        AbstractC2855l.f(listY, "getTypeParameterList(...)");
        C3654p c3654pB = C3654p.b(c3654p, p10, listY, null, null, null, null, 60, null);
        p10.T0(c3654pB.i().m(), c3654pB.i().o(h8.f.r(proto, this.f34031a.j()), false), c3654pB.i().o(h8.f.e(proto, this.f34031a.j()), false));
        return p10;
    }
}
