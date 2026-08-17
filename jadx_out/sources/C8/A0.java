package C8;

import C8.w0;
import L7.InterfaceC1280e;
import L7.InterfaceC1283h;
import i7.AbstractC2746i;
import i7.C2750m;
import j7.AbstractC2800q;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import kotlin.Lazy;
import kotlin.Pair;
import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class A0 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final a f545f = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final F f546a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final x0 f547b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final B8.f f548c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Lazy f549d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final B8.g f550e;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Removed duplicated region for block: B:29:0x00a4  */
        /* JADX WARN: Removed duplicated region for block: B:57:0x0136  */
        /* JADX WARN: Removed duplicated region for block: B:88:0x01cf  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final S a(S s10, G0 substitutor, Set set, boolean z10) {
            M0 m0F;
            S type;
            S type2;
            S type3;
            AbstractC2855l.g(s10, "<this>");
            AbstractC2855l.g(substitutor, "substitutor");
            M0 m0N0 = s10.N0();
            if (m0N0 instanceof I) {
                I i10 = (I) m0N0;
                AbstractC0407d0 abstractC0407d0S0 = i10.S0();
                if (!abstractC0407d0S0.K0().getParameters().isEmpty() && abstractC0407d0S0.K0().p() != null) {
                    List<L7.m0> parameters = abstractC0407d0S0.K0().getParameters();
                    AbstractC2855l.f(parameters, "getParameters(...)");
                    ArrayList arrayList = new ArrayList(AbstractC2800q.u(parameters, 10));
                    for (L7.m0 m0Var : parameters) {
                        B0 c0421k0 = (B0) AbstractC2800q.h0(s10.I0(), m0Var.getIndex());
                        if (!z10 || c0421k0 == null || (type3 = c0421k0.getType()) == null || H8.d.i(type3)) {
                            boolean z11 = set != null && set.contains(m0Var);
                            if (c0421k0 == null || z11) {
                                c0421k0 = new C0421k0(m0Var);
                            } else {
                                E0 e0J = substitutor.j();
                                S type4 = c0421k0.getType();
                                AbstractC2855l.f(type4, "getType(...)");
                                if (e0J.e(type4) == null) {
                                }
                            }
                        }
                        arrayList.add(c0421k0);
                    }
                    abstractC0407d0S0 = F0.f(abstractC0407d0S0, arrayList, null, 2, null);
                }
                AbstractC0407d0 abstractC0407d0T0 = i10.T0();
                if (!abstractC0407d0T0.K0().getParameters().isEmpty() && abstractC0407d0T0.K0().p() != null) {
                    List<L7.m0> parameters2 = abstractC0407d0T0.K0().getParameters();
                    AbstractC2855l.f(parameters2, "getParameters(...)");
                    ArrayList arrayList2 = new ArrayList(AbstractC2800q.u(parameters2, 10));
                    for (L7.m0 m0Var2 : parameters2) {
                        B0 c0421k02 = (B0) AbstractC2800q.h0(s10.I0(), m0Var2.getIndex());
                        if (!z10 || c0421k02 == null || (type2 = c0421k02.getType()) == null || H8.d.i(type2)) {
                            boolean z12 = set != null && set.contains(m0Var2);
                            if (c0421k02 == null || z12) {
                                c0421k02 = new C0421k0(m0Var2);
                            } else {
                                E0 e0J2 = substitutor.j();
                                S type5 = c0421k02.getType();
                                AbstractC2855l.f(type5, "getType(...)");
                                if (e0J2.e(type5) == null) {
                                }
                            }
                        }
                        arrayList2.add(c0421k02);
                    }
                    abstractC0407d0T0 = F0.f(abstractC0407d0T0, arrayList2, null, 2, null);
                }
                m0F = V.e(abstractC0407d0S0, abstractC0407d0T0);
            } else {
                if (!(m0N0 instanceof AbstractC0407d0)) {
                    throw new C2750m();
                }
                AbstractC0407d0 abstractC0407d0 = (AbstractC0407d0) m0N0;
                if (abstractC0407d0.K0().getParameters().isEmpty() || abstractC0407d0.K0().p() == null) {
                    m0F = abstractC0407d0;
                } else {
                    List<L7.m0> parameters3 = abstractC0407d0.K0().getParameters();
                    AbstractC2855l.f(parameters3, "getParameters(...)");
                    ArrayList arrayList3 = new ArrayList(AbstractC2800q.u(parameters3, 10));
                    for (L7.m0 m0Var3 : parameters3) {
                        B0 c0421k03 = (B0) AbstractC2800q.h0(s10.I0(), m0Var3.getIndex());
                        if (!z10 || c0421k03 == null || (type = c0421k03.getType()) == null || H8.d.i(type)) {
                            boolean z13 = set != null && set.contains(m0Var3);
                            if (c0421k03 == null || z13) {
                                c0421k03 = new C0421k0(m0Var3);
                            } else {
                                E0 e0J3 = substitutor.j();
                                S type6 = c0421k03.getType();
                                AbstractC2855l.f(type6, "getType(...)");
                                if (e0J3.e(type6) == null) {
                                }
                            }
                        }
                        arrayList3.add(c0421k03);
                    }
                    m0F = F0.f(abstractC0407d0, arrayList3, null, 2, null);
                }
            }
            S sN = substitutor.n(L0.b(m0F, m0N0), N0.f594m);
            AbstractC2855l.f(sN, "safeSubstitute(...)");
            return sN;
        }

        private a() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final L7.m0 f551a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final G f552b;

        public b(L7.m0 typeParameter, G typeAttr) {
            AbstractC2855l.g(typeParameter, "typeParameter");
            AbstractC2855l.g(typeAttr, "typeAttr");
            this.f551a = typeParameter;
            this.f552b = typeAttr;
        }

        public final G a() {
            return this.f552b;
        }

        public final L7.m0 b() {
            return this.f551a;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return AbstractC2855l.b(bVar.f551a, this.f551a) && AbstractC2855l.b(bVar.f552b, this.f552b);
        }

        public int hashCode() {
            int iHashCode = this.f551a.hashCode();
            return iHashCode + (iHashCode * 31) + this.f552b.hashCode();
        }

        public String toString() {
            return "DataToEraseUpperBound(typeParameter=" + this.f551a + ", typeAttr=" + this.f552b + ')';
        }
    }

    public A0(F projectionComputer, x0 options) {
        AbstractC2855l.g(projectionComputer, "projectionComputer");
        AbstractC2855l.g(options, "options");
        this.f546a = projectionComputer;
        this.f547b = options;
        B8.f fVar = new B8.f("Type parameter upper bound erasure results");
        this.f548c = fVar;
        this.f549d = AbstractC2746i.b(new y0(this));
        B8.g gVarH = fVar.h(new z0(this));
        AbstractC2855l.f(gVarH, "createMemoizedFunction(...)");
        this.f550e = gVarH;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final E8.i c(A0 a02) {
        return E8.l.d(E8.k.f1170C0, a02.toString());
    }

    private final S d(G g10) {
        S sD;
        AbstractC0407d0 abstractC0407d0A = g10.a();
        return (abstractC0407d0A == null || (sD = H8.d.D(abstractC0407d0A)) == null) ? h() : sD;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final S f(A0 a02, b bVar) {
        return a02.g(bVar.b(), bVar.a());
    }

    private final S g(L7.m0 m0Var, G g10) {
        B0 b0A;
        Set setC = g10.c();
        if (setC != null && setC.contains(m0Var.a())) {
            return d(g10);
        }
        AbstractC0407d0 abstractC0407d0R = m0Var.r();
        AbstractC2855l.f(abstractC0407d0R, "getDefaultType(...)");
        Set<L7.m0> setL = H8.d.l(abstractC0407d0R, setC);
        LinkedHashMap linkedHashMap = new LinkedHashMap(B7.d.d(j7.K.e(AbstractC2800q.u(setL, 10)), 16));
        for (L7.m0 m0Var2 : setL) {
            if (setC == null || !setC.contains(m0Var2)) {
                b0A = this.f546a.a(m0Var2, g10, this, e(m0Var2, g10.d(m0Var)));
            } else {
                b0A = J0.t(m0Var2, g10);
                AbstractC2855l.f(b0A, "makeStarProjection(...)");
            }
            Pair pairA = i7.t.a(m0Var2.j(), b0A);
            linkedHashMap.put(pairA.c(), pairA.d());
        }
        G0 g0G = G0.g(w0.a.e(w0.f710c, linkedHashMap, false, 2, null));
        AbstractC2855l.f(g0G, "create(...)");
        List upperBounds = m0Var.getUpperBounds();
        AbstractC2855l.f(upperBounds, "getUpperBounds(...)");
        Set setI = i(g0G, upperBounds, g10);
        if (setI.isEmpty()) {
            return d(g10);
        }
        if (!this.f547b.a()) {
            if (setI.size() == 1) {
                return (S) AbstractC2800q.B0(setI);
            }
            throw new IllegalArgumentException("Should only be one computed upper bound if no need to intersect all bounds");
        }
        List listP0 = AbstractC2800q.P0(setI);
        ArrayList arrayList = new ArrayList(AbstractC2800q.u(listP0, 10));
        Iterator it = listP0.iterator();
        while (it.hasNext()) {
            arrayList.add(((S) it.next()).N0());
        }
        return D8.d.a(arrayList);
    }

    private final E8.i h() {
        return (E8.i) this.f549d.getValue();
    }

    private final Set i(G0 g02, List list, G g10) {
        Set setB = j7.T.b();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            S s10 = (S) it.next();
            InterfaceC1283h interfaceC1283hP = s10.K0().p();
            if (interfaceC1283hP instanceof InterfaceC1280e) {
                setB.add(f545f.a(s10, g02, g10.c(), this.f547b.b()));
            } else if (interfaceC1283hP instanceof L7.m0) {
                Set setC = g10.c();
                if (setC == null || !setC.contains(interfaceC1283hP)) {
                    List upperBounds = ((L7.m0) interfaceC1283hP).getUpperBounds();
                    AbstractC2855l.f(upperBounds, "getUpperBounds(...)");
                    setB.addAll(i(g02, upperBounds, g10));
                } else {
                    setB.add(d(g10));
                }
            }
            if (!this.f547b.a()) {
                break;
            }
        }
        return j7.T.a(setB);
    }

    public final S e(L7.m0 typeParameter, G typeAttr) {
        AbstractC2855l.g(typeParameter, "typeParameter");
        AbstractC2855l.g(typeAttr, "typeAttr");
        Object objInvoke = this.f550e.invoke(new b(typeParameter, typeAttr));
        AbstractC2855l.f(objInvoke, "invoke(...)");
        return (S) objInvoke;
    }

    public /* synthetic */ A0(F f10, x0 x0Var, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(f10, (i10 & 2) != 0 ? new x0(false, false) : x0Var);
    }
}
