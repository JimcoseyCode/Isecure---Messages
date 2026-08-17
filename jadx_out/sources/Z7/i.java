package Z7;

import C8.A0;
import C8.AbstractC0407d0;
import C8.B0;
import C8.D0;
import C8.E0;
import C8.F;
import C8.I0;
import C8.L;
import C8.N0;
import C8.S;
import C8.V;
import C8.W;
import C8.r0;
import C8.v0;
import E8.l;
import L7.InterfaceC1280e;
import L7.InterfaceC1283h;
import L7.m0;
import i7.t;
import j7.AbstractC2800q;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import s8.AbstractC3340e;
import v8.InterfaceC3442k;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class i extends E0 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f13651e = new a(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final Z7.a f13652f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final Z7.a f13653g;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final g f13654c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final A0 f13655d;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    static {
        I0 i02 = I0.f575h;
        f13652f = b.b(i02, false, true, null, 5, null).l(c.f13633i);
        f13653g = b.b(i02, false, true, null, 5, null).l(c.f13632h);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public i(A0 a02) {
        g gVar = new g();
        this.f13654c = gVar;
        if (a02 == null) {
            a02 = new A0(gVar, null, 2, 0 == true ? 1 : 0);
        }
        this.f13655d = a02;
    }

    private final Pair j(AbstractC0407d0 abstractC0407d0, InterfaceC1280e interfaceC1280e, Z7.a aVar) {
        if (abstractC0407d0.K0().getParameters().isEmpty()) {
            return t.a(abstractC0407d0, Boolean.FALSE);
        }
        if (I7.i.c0(abstractC0407d0)) {
            B0 b02 = (B0) abstractC0407d0.I0().get(0);
            N0 n0A = b02.a();
            S type = b02.getType();
            AbstractC2855l.f(type, "getType(...)");
            return t.a(V.k(abstractC0407d0.J0(), abstractC0407d0.K0(), AbstractC2800q.e(new D0(n0A, l(type, aVar))), abstractC0407d0.L0(), null, 16, null), Boolean.FALSE);
        }
        if (W.a(abstractC0407d0)) {
            return t.a(l.d(E8.k.f1197Q, abstractC0407d0.K0().toString()), Boolean.FALSE);
        }
        InterfaceC3442k interfaceC3442kN0 = interfaceC1280e.n0(this);
        AbstractC2855l.f(interfaceC3442kN0, "getMemberScope(...)");
        r0 r0VarJ0 = abstractC0407d0.J0();
        v0 v0VarJ = interfaceC1280e.j();
        AbstractC2855l.f(v0VarJ, "getTypeConstructor(...)");
        List<m0> parameters = interfaceC1280e.j().getParameters();
        AbstractC2855l.f(parameters, "getParameters(...)");
        ArrayList arrayList = new ArrayList(AbstractC2800q.u(parameters, 10));
        for (m0 m0Var : parameters) {
            g gVar = this.f13654c;
            AbstractC2855l.d(m0Var);
            arrayList.add(F.b(gVar, m0Var, aVar, this.f13655d, null, 8, null));
        }
        return t.a(V.n(r0VarJ0, v0VarJ, arrayList, abstractC0407d0.L0(), interfaceC3442kN0, new h(interfaceC1280e, this, abstractC0407d0, aVar)), Boolean.TRUE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AbstractC0407d0 k(InterfaceC1280e interfaceC1280e, i iVar, AbstractC0407d0 abstractC0407d0, Z7.a aVar, D8.g kotlinTypeRefiner) {
        InterfaceC1280e interfaceC1280eB;
        AbstractC2855l.g(kotlinTypeRefiner, "kotlinTypeRefiner");
        k8.b bVarN = AbstractC3340e.n(interfaceC1280e);
        if (bVarN == null || (interfaceC1280eB = kotlinTypeRefiner.b(bVarN)) == null || AbstractC2855l.b(interfaceC1280eB, interfaceC1280e)) {
            return null;
        }
        return (AbstractC0407d0) iVar.j(abstractC0407d0, interfaceC1280eB, aVar).c();
    }

    private final S l(S s10, Z7.a aVar) {
        InterfaceC1283h interfaceC1283hP = s10.K0().p();
        if (interfaceC1283hP instanceof m0) {
            return l(this.f13655d.e((m0) interfaceC1283hP, aVar.j(true)), aVar);
        }
        if (!(interfaceC1283hP instanceof InterfaceC1280e)) {
            throw new IllegalStateException(("Unexpected declaration kind: " + interfaceC1283hP).toString());
        }
        InterfaceC1283h interfaceC1283hP2 = L.d(s10).K0().p();
        if (interfaceC1283hP2 instanceof InterfaceC1280e) {
            Pair pairJ = j(L.c(s10), (InterfaceC1280e) interfaceC1283hP, f13652f);
            AbstractC0407d0 abstractC0407d0 = (AbstractC0407d0) pairJ.getFirst();
            boolean zBooleanValue = ((Boolean) pairJ.getSecond()).booleanValue();
            Pair pairJ2 = j(L.d(s10), (InterfaceC1280e) interfaceC1283hP2, f13653g);
            AbstractC0407d0 abstractC0407d02 = (AbstractC0407d0) pairJ2.getFirst();
            return (zBooleanValue || ((Boolean) pairJ2.getSecond()).booleanValue()) ? new k(abstractC0407d0, abstractC0407d02) : V.e(abstractC0407d0, abstractC0407d02);
        }
        throw new IllegalStateException(("For some reason declaration for upper bound is not a class but \"" + interfaceC1283hP2 + "\" while for lower it's \"" + interfaceC1283hP + '\"').toString());
    }

    static /* synthetic */ S m(i iVar, S s10, Z7.a aVar, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            aVar = new Z7.a(I0.f575h, null, false, false, null, null, 62, null);
        }
        return iVar.l(s10, aVar);
    }

    @Override // C8.E0
    public boolean f() {
        return false;
    }

    @Override // C8.E0
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public D0 e(S key) {
        AbstractC2855l.g(key, "key");
        return new D0(m(this, key, null, 2, null));
    }

    public /* synthetic */ i(A0 a02, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : a02);
    }
}
