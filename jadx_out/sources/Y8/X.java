package y8;

import A8.C0381a;
import C8.AbstractC0407d0;
import C8.AbstractC0415h0;
import C8.B0;
import C8.C0417i0;
import C8.C0421k0;
import C8.C0438y;
import C8.D0;
import C8.N0;
import C8.q0;
import C8.r0;
import C8.v0;
import L7.AbstractC1299y;
import L7.InterfaceC1276a;
import L7.InterfaceC1280e;
import L7.InterfaceC1283h;
import L7.InterfaceC1288m;
import L7.l0;
import L7.m0;
import com.facebook.react.uimanager.events.PointerEventHelper;
import f8.q;
import h8.AbstractC2709b;
import j7.AbstractC2800q;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC2855l;
import s8.AbstractC3340e;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class X {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C3654p f34067a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final X f34068b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f34069c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f34070d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Function1 f34071e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Function1 f34072f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Map f34073g;

    public X(C3654p c10, X x10, List typeParameterProtos, String debugName, String containerPresentableName) {
        Map linkedHashMap;
        AbstractC2855l.g(c10, "c");
        AbstractC2855l.g(typeParameterProtos, "typeParameterProtos");
        AbstractC2855l.g(debugName, "debugName");
        AbstractC2855l.g(containerPresentableName, "containerPresentableName");
        this.f34067a = c10;
        this.f34068b = x10;
        this.f34069c = debugName;
        this.f34070d = containerPresentableName;
        this.f34071e = c10.h().i(new S(this));
        this.f34072f = c10.h().i(new T(this));
        if (typeParameterProtos.isEmpty()) {
            linkedHashMap = j7.K.i();
        } else {
            linkedHashMap = new LinkedHashMap();
            Iterator it = typeParameterProtos.iterator();
            int i10 = 0;
            while (it.hasNext()) {
                f8.s sVar = (f8.s) it.next();
                linkedHashMap.put(Integer.valueOf(sVar.L()), new A8.S(this.f34067a, sVar, i10));
                i10++;
            }
        }
        this.f34073g = linkedHashMap;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int A(f8.q it) {
        AbstractC2855l.g(it, "it");
        return it.T();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC1283h f(X x10, int i10) {
        return x10.g(i10);
    }

    private final InterfaceC1283h g(int i10) {
        k8.b bVarA = AbstractC3638L.a(this.f34067a.g(), i10);
        return bVarA.i() ? this.f34067a.c().b(bVarA) : AbstractC1299y.c(this.f34067a.c().q(), bVarA);
    }

    private final AbstractC0407d0 h(int i10) {
        if (AbstractC3638L.a(this.f34067a.g(), i10).i()) {
            return this.f34067a.c().o().a();
        }
        return null;
    }

    private final InterfaceC1283h i(int i10) {
        k8.b bVarA = AbstractC3638L.a(this.f34067a.g(), i10);
        if (bVarA.i()) {
            return null;
        }
        return AbstractC1299y.f(this.f34067a.c().q(), bVarA);
    }

    private final AbstractC0407d0 j(C8.S s10, C8.S s11) {
        I7.i iVarN = H8.d.n(s10);
        M7.h annotations = s10.getAnnotations();
        C8.S sK = I7.h.k(s10);
        List listE = I7.h.e(s10);
        List listA0 = AbstractC2800q.a0(I7.h.m(s10), 1);
        ArrayList arrayList = new ArrayList(AbstractC2800q.u(listA0, 10));
        Iterator it = listA0.iterator();
        while (it.hasNext()) {
            arrayList.add(((B0) it.next()).getType());
        }
        return I7.h.b(iVarN, annotations, sK, listE, arrayList, null, s11, true).O0(s10.L0());
    }

    private final AbstractC0407d0 k(r0 r0Var, v0 v0Var, List list, boolean z10) {
        List list2;
        AbstractC0407d0 abstractC0407d0L;
        int size;
        int size2 = v0Var.getParameters().size() - list.size();
        if (size2 != 0) {
            abstractC0407d0L = null;
            if (size2 == 1 && (size = list.size() - 1) >= 0) {
                v0 v0VarJ = v0Var.n().X(size).j();
                AbstractC2855l.f(v0VarJ, "getTypeConstructor(...)");
                list2 = list;
                abstractC0407d0L = C8.V.k(r0Var, v0VarJ, list2, z10, null, 16, null);
            } else {
                list2 = list;
            }
        } else {
            list2 = list;
            abstractC0407d0L = l(r0Var, v0Var, list2, z10);
        }
        return abstractC0407d0L == null ? E8.l.f1253a.f(E8.k.f1202V, list2, v0Var, new String[0]) : abstractC0407d0L;
    }

    private final AbstractC0407d0 l(r0 r0Var, v0 v0Var, List list, boolean z10) {
        AbstractC0407d0 abstractC0407d0K = C8.V.k(r0Var, v0Var, list, z10, null, 16, null);
        if (I7.h.q(abstractC0407d0K)) {
            return t(abstractC0407d0K);
        }
        return null;
    }

    private final m0 n(int i10) {
        m0 m0Var = (m0) this.f34073g.get(Integer.valueOf(i10));
        if (m0Var != null) {
            return m0Var;
        }
        X x10 = this.f34068b;
        if (x10 != null) {
            return x10.n(i10);
        }
        return null;
    }

    private static final List p(f8.q qVar, X x10) {
        List listU = qVar.U();
        AbstractC2855l.f(listU, "getArgumentList(...)");
        f8.q qVarJ = h8.f.j(qVar, x10.f34067a.j());
        List listP = qVarJ != null ? p(qVarJ, x10) : null;
        if (listP == null) {
            listP = AbstractC2800q.j();
        }
        return AbstractC2800q.z0(listU, listP);
    }

    public static /* synthetic */ AbstractC0407d0 q(X x10, f8.q qVar, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = true;
        }
        return x10.o(qVar, z10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List r(X x10, f8.q qVar) {
        return x10.f34067a.c().d().j(qVar, x10.f34067a.g());
    }

    private final r0 s(List list, M7.h hVar, v0 v0Var, InterfaceC1288m interfaceC1288m) {
        ArrayList arrayList = new ArrayList(AbstractC2800q.u(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((q0) it.next()).a(hVar, v0Var, interfaceC1288m));
        }
        return r0.f682h.i(AbstractC2800q.w(arrayList));
    }

    private final AbstractC0407d0 t(C8.S s10) {
        C8.S type;
        B0 b02 = (B0) AbstractC2800q.s0(I7.h.m(s10));
        if (b02 == null || (type = b02.getType()) == null) {
            return null;
        }
        InterfaceC1283h interfaceC1283hP = type.K0().p();
        k8.c cVarO = interfaceC1283hP != null ? AbstractC3340e.o(interfaceC1283hP) : null;
        if (type.I0().size() != 1 || (!AbstractC2855l.b(cVarO, I7.o.f5137v) && !AbstractC2855l.b(cVarO, Y.f34075a))) {
            return (AbstractC0407d0) s10;
        }
        C8.S type2 = ((B0) AbstractC2800q.C0(type.I0())).getType();
        AbstractC2855l.f(type2, "getType(...)");
        InterfaceC1288m interfaceC1288mE = this.f34067a.e();
        InterfaceC1276a interfaceC1276a = interfaceC1288mE instanceof InterfaceC1276a ? (InterfaceC1276a) interfaceC1288mE : null;
        return AbstractC2855l.b(interfaceC1276a != null ? AbstractC3340e.k(interfaceC1276a) : null, Q.f34059a) ? j(s10, type2) : j(s10, type2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC1283h v(X x10, int i10) {
        return x10.i(i10);
    }

    private final B0 w(m0 m0Var, q.b bVar) {
        if (bVar.w() == q.b.c.STAR) {
            return m0Var == null ? new C0417i0(this.f34067a.c().q().n()) : new C0421k0(m0Var);
        }
        O o10 = O.f34047a;
        q.b.c cVarW = bVar.w();
        AbstractC2855l.f(cVarW, "getProjection(...)");
        N0 n0C = o10.c(cVarW);
        f8.q qVarP = h8.f.p(bVar, this.f34067a.j());
        return qVarP == null ? new D0(E8.l.d(E8.k.f1176F0, bVar.toString())) : new D0(n0C, u(qVarP));
    }

    private final v0 x(f8.q qVar) {
        InterfaceC1283h interfaceC1283hY;
        Object next;
        if (qVar.k0()) {
            interfaceC1283hY = (InterfaceC1283h) this.f34071e.invoke(Integer.valueOf(qVar.V()));
            if (interfaceC1283hY == null) {
                interfaceC1283hY = y(this, qVar, qVar.V());
            }
        } else if (qVar.u0()) {
            interfaceC1283hY = n(qVar.g0());
            if (interfaceC1283hY == null) {
                return E8.l.f1253a.e(E8.k.f1200T, String.valueOf(qVar.g0()), this.f34070d);
            }
        } else if (qVar.v0()) {
            String string = this.f34067a.g().getString(qVar.h0());
            Iterator it = m().iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (AbstractC2855l.b(((m0) next).getName().j(), string)) {
                    break;
                }
            }
            interfaceC1283hY = (m0) next;
            if (interfaceC1283hY == null) {
                return E8.l.f1253a.e(E8.k.f1201U, string, this.f34067a.e().toString());
            }
        } else {
            if (!qVar.t0()) {
                return E8.l.f1253a.e(E8.k.f1204X, new String[0]);
            }
            interfaceC1283hY = (InterfaceC1283h) this.f34072f.invoke(Integer.valueOf(qVar.f0()));
            if (interfaceC1283hY == null) {
                interfaceC1283hY = y(this, qVar, qVar.f0());
            }
        }
        v0 v0VarJ = interfaceC1283hY.j();
        AbstractC2855l.f(v0VarJ, "getTypeConstructor(...)");
        return v0VarJ;
    }

    private static final InterfaceC1280e y(X x10, f8.q qVar, int i10) {
        k8.b bVarA = AbstractC3638L.a(x10.f34067a.g(), i10);
        List listT = O8.l.T(O8.l.J(O8.l.n(qVar, new V(x10)), W.f34066g));
        int iV = O8.l.v(O8.l.n(bVarA, new kotlin.jvm.internal.u() { // from class: y8.X.a
            @Override // C7.m
            public Object get(Object obj) {
                return ((k8.b) obj).e();
            }

            @Override // kotlin.jvm.internal.AbstractC2846c, C7.c
            public String getName() {
                return "outerClassId";
            }

            @Override // kotlin.jvm.internal.AbstractC2846c
            public C7.f getOwner() {
                return kotlin.jvm.internal.D.b(k8.b.class);
            }

            @Override // kotlin.jvm.internal.AbstractC2846c
            public String getSignature() {
                return "getOuterClassId()Lorg/jetbrains/kotlin/name/ClassId;";
            }
        }));
        while (listT.size() < iV) {
            listT.add(0);
        }
        return x10.f34067a.c().r().d(bVarA, listT);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final f8.q z(X x10, f8.q it) {
        AbstractC2855l.g(it, "it");
        return h8.f.j(it, x10.f34067a.j());
    }

    public final List m() {
        return AbstractC2800q.P0(this.f34073g.values());
    }

    public final AbstractC0407d0 o(f8.q proto, boolean z10) {
        AbstractC0407d0 abstractC0407d0C;
        AbstractC0407d0 abstractC0407d0J;
        AbstractC2855l.g(proto, "proto");
        AbstractC0407d0 abstractC0407d0H = proto.k0() ? h(proto.V()) : proto.t0() ? h(proto.f0()) : null;
        if (abstractC0407d0H != null) {
            return abstractC0407d0H;
        }
        v0 v0VarX = x(proto);
        if (E8.l.m(v0VarX.p())) {
            return E8.l.f1253a.c(E8.k.f1166A0, v0VarX, v0VarX.toString());
        }
        C0381a c0381a = new C0381a(this.f34067a.h(), new U(this, proto));
        r0 r0VarS = s(this.f34067a.c().v(), c0381a, v0VarX, this.f34067a.e());
        List listP = p(proto, this);
        ArrayList arrayList = new ArrayList(AbstractC2800q.u(listP, 10));
        int i10 = 0;
        for (Object obj : listP) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                AbstractC2800q.t();
            }
            List parameters = v0VarX.getParameters();
            AbstractC2855l.f(parameters, "getParameters(...)");
            arrayList.add(w((m0) AbstractC2800q.h0(parameters, i10), (q.b) obj));
            i10 = i11;
        }
        List listP0 = AbstractC2800q.P0(arrayList);
        InterfaceC1283h interfaceC1283hP = v0VarX.p();
        if (z10 && (interfaceC1283hP instanceof l0)) {
            AbstractC0407d0 abstractC0407d0C2 = C8.V.c((l0) interfaceC1283hP, listP0);
            abstractC0407d0C = abstractC0407d0C2.O0(C8.W.b(abstractC0407d0C2) || proto.c0()).Q0(s(this.f34067a.c().v(), M7.h.f7570a.a(AbstractC2800q.x0(c0381a, abstractC0407d0C2.getAnnotations())), v0VarX, this.f34067a.e()));
        } else if (AbstractC2709b.f28531a.d(proto.Y()).booleanValue()) {
            abstractC0407d0C = k(r0VarS, v0VarX, listP0, proto.c0());
        } else {
            AbstractC0407d0 abstractC0407d0K = C8.V.k(r0VarS, v0VarX, listP0, proto.c0(), null, 16, null);
            if (AbstractC2709b.f28532b.d(proto.Y()).booleanValue()) {
                abstractC0407d0C = C0438y.a.c(C0438y.f716j, abstractC0407d0K, true, false, 4, null);
                if (abstractC0407d0C == null) {
                    throw new IllegalStateException(("null DefinitelyNotNullType for '" + abstractC0407d0K + '\'').toString());
                }
            } else {
                abstractC0407d0C = abstractC0407d0K;
            }
        }
        f8.q qVarA = h8.f.a(proto, this.f34067a.j());
        return (qVarA == null || (abstractC0407d0J = AbstractC0415h0.j(abstractC0407d0C, o(qVarA, false))) == null) ? abstractC0407d0C : abstractC0407d0J;
    }

    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(this.f34069c);
        if (this.f34068b == null) {
            str = PointerEventHelper.POINTER_TYPE_UNKNOWN;
        } else {
            str = ". Child of " + this.f34068b.f34069c;
        }
        sb.append(str);
        return sb.toString();
    }

    public final C8.S u(f8.q proto) {
        AbstractC2855l.g(proto, "proto");
        if (!proto.n0()) {
            return o(proto, true);
        }
        String string = this.f34067a.g().getString(proto.Z());
        AbstractC0407d0 abstractC0407d0Q = q(this, proto, false, 2, null);
        f8.q qVarF = h8.f.f(proto, this.f34067a.j());
        AbstractC2855l.d(qVarF);
        return this.f34067a.c().m().a(proto, string, abstractC0407d0Q, q(this, qVarF, false, 2, null));
    }
}
