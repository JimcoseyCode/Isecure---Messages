package C8;

import C8.InterfaceC0429o0;
import L7.InterfaceC1283h;
import j7.AbstractC2800q;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import v8.InterfaceC3442k;

/* JADX INFO: renamed from: C8.m0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0425m0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f662c = new a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final C0425m0 f663d = new C0425m0(InterfaceC0429o0.a.f674a, false);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC0429o0 f664a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f665b;

    /* JADX INFO: renamed from: C8.m0$a */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void b(int i10, L7.l0 l0Var) {
            if (i10 <= 100) {
                return;
            }
            throw new AssertionError("Too deep recursion while expanding type alias " + l0Var.getName());
        }

        private a() {
        }
    }

    public C0425m0(InterfaceC0429o0 reportStrategy, boolean z10) {
        AbstractC2855l.g(reportStrategy, "reportStrategy");
        this.f664a = reportStrategy;
        this.f665b = z10;
    }

    private final void a(M7.h hVar, M7.h hVar2) {
        HashSet hashSet = new HashSet();
        Iterator it = hVar.iterator();
        while (it.hasNext()) {
            hashSet.add(((M7.c) it.next()).d());
        }
        Iterator it2 = hVar2.iterator();
        while (it2.hasNext()) {
            M7.c cVar = (M7.c) it2.next();
            if (hashSet.contains(cVar.d())) {
                this.f664a.a(cVar);
            }
        }
    }

    private final void b(S s10, S s11) {
        G0 g0F = G0.f(s11);
        AbstractC2855l.f(g0F, "create(...)");
        int i10 = 0;
        for (Object obj : s11.I0()) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                AbstractC2800q.t();
            }
            B0 b02 = (B0) obj;
            if (!b02.b()) {
                S type = b02.getType();
                AbstractC2855l.f(type, "getType(...)");
                if (!H8.d.g(type)) {
                    B0 b03 = (B0) s10.I0().get(i10);
                    L7.m0 m0Var = (L7.m0) s10.K0().getParameters().get(i10);
                    if (this.f665b) {
                        InterfaceC0429o0 interfaceC0429o0 = this.f664a;
                        S type2 = b03.getType();
                        AbstractC2855l.f(type2, "getType(...)");
                        S type3 = b02.getType();
                        AbstractC2855l.f(type3, "getType(...)");
                        AbstractC2855l.d(m0Var);
                        interfaceC0429o0.d(g0F, type2, type3, m0Var);
                    }
                }
            }
            i10 = i11;
        }
    }

    private final AbstractC0407d0 c(AbstractC0407d0 abstractC0407d0, r0 r0Var) {
        return W.a(abstractC0407d0) ? abstractC0407d0 : F0.f(abstractC0407d0, null, g(abstractC0407d0, r0Var), 1, null);
    }

    private final AbstractC0407d0 d(AbstractC0407d0 abstractC0407d0, S s10) {
        AbstractC0407d0 abstractC0407d0R = J0.r(abstractC0407d0, s10.L0());
        AbstractC2855l.f(abstractC0407d0R, "makeNullableIfNeeded(...)");
        return abstractC0407d0R;
    }

    private final AbstractC0407d0 e(AbstractC0407d0 abstractC0407d0, S s10) {
        return c(d(abstractC0407d0, s10), s10.J0());
    }

    private final AbstractC0407d0 f(C0427n0 c0427n0, r0 r0Var, boolean z10) {
        v0 v0VarJ = c0427n0.b().j();
        AbstractC2855l.f(v0VarJ, "getTypeConstructor(...)");
        return V.m(r0Var, v0VarJ, c0427n0.a(), z10, InterfaceC3442k.b.f32996b);
    }

    private final r0 g(S s10, r0 r0Var) {
        return W.a(s10) ? s10.J0() : r0Var.s(s10.J0());
    }

    private final B0 i(B0 b02, C0427n0 c0427n0, int i10) {
        M0 m0N0 = b02.getType().N0();
        if (!E.a(m0N0)) {
            AbstractC0407d0 abstractC0407d0A = F0.a(m0N0);
            if (!W.a(abstractC0407d0A) && H8.d.E(abstractC0407d0A)) {
                v0 v0VarK0 = abstractC0407d0A.K0();
                InterfaceC1283h interfaceC1283hP = v0VarK0.p();
                v0VarK0.getParameters().size();
                abstractC0407d0A.I0().size();
                if (!(interfaceC1283hP instanceof L7.m0)) {
                    if (!(interfaceC1283hP instanceof L7.l0)) {
                        AbstractC0407d0 abstractC0407d0L = l(abstractC0407d0A, c0427n0, i10);
                        b(abstractC0407d0A, abstractC0407d0L);
                        return new D0(b02.a(), abstractC0407d0L);
                    }
                    L7.l0 l0Var = (L7.l0) interfaceC1283hP;
                    if (c0427n0.d(l0Var)) {
                        this.f664a.c(l0Var);
                        return new D0(N0.f592k, E8.l.d(E8.k.f1247y, l0Var.getName().toString()));
                    }
                    List listI0 = abstractC0407d0A.I0();
                    ArrayList arrayList = new ArrayList(AbstractC2800q.u(listI0, 10));
                    int i11 = 0;
                    for (Object obj : listI0) {
                        int i12 = i11 + 1;
                        if (i11 < 0) {
                            AbstractC2800q.t();
                        }
                        arrayList.add(k((B0) obj, c0427n0, (L7.m0) v0VarK0.getParameters().get(i11), i10 + 1));
                        i11 = i12;
                    }
                    AbstractC0407d0 abstractC0407d0J = j(C0427n0.f667e.a(c0427n0, l0Var, arrayList), abstractC0407d0A.J0(), abstractC0407d0A.L0(), i10 + 1, false);
                    AbstractC0407d0 abstractC0407d0L2 = l(abstractC0407d0A, c0427n0, i10);
                    if (!E.a(abstractC0407d0J)) {
                        abstractC0407d0J = AbstractC0415h0.j(abstractC0407d0J, abstractC0407d0L2);
                    }
                    return new D0(b02.a(), abstractC0407d0J);
                }
            }
        }
        return b02;
    }

    private final AbstractC0407d0 j(C0427n0 c0427n0, r0 r0Var, boolean z10, int i10, boolean z11) {
        B0 b0K = k(new D0(N0.f592k, c0427n0.b().b0()), c0427n0, null, i10);
        S type = b0K.getType();
        AbstractC2855l.f(type, "getType(...)");
        AbstractC0407d0 abstractC0407d0A = F0.a(type);
        if (W.a(abstractC0407d0A)) {
            return abstractC0407d0A;
        }
        b0K.a();
        a(abstractC0407d0A.getAnnotations(), AbstractC0433t.a(r0Var));
        AbstractC0407d0 abstractC0407d0R = J0.r(c(abstractC0407d0A, r0Var), z10);
        AbstractC2855l.f(abstractC0407d0R, "let(...)");
        return z11 ? AbstractC0415h0.j(abstractC0407d0R, f(c0427n0, r0Var, z10)) : abstractC0407d0R;
    }

    private final B0 k(B0 b02, C0427n0 c0427n0, L7.m0 m0Var, int i10) {
        N0 n0M;
        N0 n02;
        N0 n03;
        f662c.b(i10, c0427n0.b());
        if (b02.b()) {
            AbstractC2855l.d(m0Var);
            B0 b0S = J0.s(m0Var);
            AbstractC2855l.f(b0S, "makeStarProjection(...)");
            return b0S;
        }
        S type = b02.getType();
        AbstractC2855l.f(type, "getType(...)");
        B0 b0C = c0427n0.c(type.K0());
        if (b0C == null) {
            return i(b02, c0427n0, i10);
        }
        if (b0C.b()) {
            AbstractC2855l.d(m0Var);
            B0 b0S2 = J0.s(m0Var);
            AbstractC2855l.f(b0S2, "makeStarProjection(...)");
            return b0S2;
        }
        M0 m0N0 = b0C.getType().N0();
        N0 n0A = b0C.a();
        AbstractC2855l.f(n0A, "getProjectionKind(...)");
        N0 n0A2 = b02.a();
        AbstractC2855l.f(n0A2, "getProjectionKind(...)");
        if (n0A2 != n0A && n0A2 != (n03 = N0.f592k)) {
            if (n0A == n03) {
                n0A = n0A2;
            } else {
                this.f664a.b(c0427n0.b(), m0Var, m0N0);
            }
        }
        if (m0Var == null || (n0M = m0Var.m()) == null) {
            n0M = N0.f592k;
        }
        if (n0M != n0A && n0M != (n02 = N0.f592k)) {
            if (n0A == n02) {
                n0A = n02;
            } else {
                this.f664a.b(c0427n0.b(), m0Var, m0N0);
            }
        }
        a(type.getAnnotations(), m0N0.getAnnotations());
        return new D0(n0A, e(F0.a(m0N0), type));
    }

    private final AbstractC0407d0 l(AbstractC0407d0 abstractC0407d0, C0427n0 c0427n0, int i10) {
        v0 v0VarK0 = abstractC0407d0.K0();
        List listI0 = abstractC0407d0.I0();
        ArrayList arrayList = new ArrayList(AbstractC2800q.u(listI0, 10));
        int i11 = 0;
        for (Object obj : listI0) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                AbstractC2800q.t();
            }
            B0 b02 = (B0) obj;
            B0 b0K = k(b02, c0427n0, (L7.m0) v0VarK0.getParameters().get(i11), i10 + 1);
            if (!b0K.b()) {
                b0K = new D0(b0K.a(), J0.q(b0K.getType(), b02.getType().L0()));
            }
            arrayList.add(b0K);
            i11 = i12;
        }
        return F0.f(abstractC0407d0, arrayList, null, 2, null);
    }

    public final AbstractC0407d0 h(C0427n0 typeAliasExpansion, r0 attributes) {
        AbstractC2855l.g(typeAliasExpansion, "typeAliasExpansion");
        AbstractC2855l.g(attributes, "attributes");
        return j(typeAliasExpansion, attributes, false, 0, true);
    }
}
