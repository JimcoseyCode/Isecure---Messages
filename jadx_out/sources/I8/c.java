package I8;

import C8.AbstractC0407d0;
import C8.B0;
import C8.D0;
import C8.F0;
import C8.G0;
import C8.J0;
import C8.L;
import C8.L0;
import C8.M0;
import C8.N0;
import C8.S;
import C8.V;
import C8.v0;
import C8.w0;
import I7.i;
import L7.m0;
import i7.C2750m;
import j7.AbstractC2800q;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.AbstractC2855l;
import p8.AbstractC3090e;
import p8.InterfaceC3087b;
import s8.AbstractC3340e;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class c {

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f5263a;

        static {
            int[] iArr = new int[N0.values().length];
            try {
                iArr[N0.f592k.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[N0.f593l.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[N0.f594m.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f5263a = iArr;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class b extends w0 {
        b() {
        }

        @Override // C8.w0
        public B0 k(v0 key) {
            AbstractC2855l.g(key, "key");
            InterfaceC3087b interfaceC3087b = key instanceof InterfaceC3087b ? (InterfaceC3087b) key : null;
            if (interfaceC3087b == null) {
                return null;
            }
            return interfaceC3087b.getProjection().b() ? new D0(N0.f594m, interfaceC3087b.getProjection().getType()) : interfaceC3087b.getProjection();
        }
    }

    public static final I8.a b(S type) {
        Object objG;
        AbstractC2855l.g(type, "type");
        if (L.b(type)) {
            I8.a aVarB = b(L.c(type));
            I8.a aVarB2 = b(L.d(type));
            return new I8.a(L0.b(V.e(L.c((S) aVarB.c()), L.d((S) aVarB2.c())), type), L0.b(V.e(L.c((S) aVarB.d()), L.d((S) aVarB2.d())), type));
        }
        v0 v0VarK0 = type.K0();
        if (AbstractC3090e.f(type)) {
            AbstractC2855l.e(v0VarK0, "null cannot be cast to non-null type org.jetbrains.kotlin.resolve.calls.inference.CapturedTypeConstructor");
            B0 projection = ((InterfaceC3087b) v0VarK0).getProjection();
            S type2 = projection.getType();
            AbstractC2855l.f(type2, "getType(...)");
            S sC = c(type2, type);
            int i10 = a.f5263a[projection.a().ordinal()];
            if (i10 == 2) {
                return new I8.a(sC, H8.d.n(type).I());
            }
            if (i10 == 3) {
                AbstractC0407d0 abstractC0407d0H = H8.d.n(type).H();
                AbstractC2855l.f(abstractC0407d0H, "getNothingType(...)");
                return new I8.a(c(abstractC0407d0H, type), sC);
            }
            throw new AssertionError("Only nontrivial projections should have been captured, not: " + projection);
        }
        if (type.I0().isEmpty() || type.I0().size() != v0VarK0.getParameters().size()) {
            return new I8.a(type, type);
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        List listI0 = type.I0();
        List parameters = v0VarK0.getParameters();
        AbstractC2855l.f(parameters, "getParameters(...)");
        for (Pair pair : AbstractC2800q.X0(listI0, parameters)) {
            B0 b02 = (B0) pair.getFirst();
            m0 m0Var = (m0) pair.getSecond();
            AbstractC2855l.d(m0Var);
            d dVarI = i(b02, m0Var);
            if (b02.b()) {
                arrayList.add(dVarI);
                arrayList2.add(dVarI);
            } else {
                I8.a aVarF = f(dVarI);
                d dVar = (d) aVarF.a();
                d dVar2 = (d) aVarF.b();
                arrayList.add(dVar);
                arrayList2.add(dVar2);
            }
        }
        boolean z10 = false;
        if (!arrayList.isEmpty()) {
            Iterator it = arrayList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                if (!((d) it.next()).d()) {
                    z10 = true;
                    break;
                }
            }
        }
        if (z10) {
            objG = H8.d.n(type).H();
            AbstractC2855l.f(objG, "getNothingType(...)");
        } else {
            objG = g(type, arrayList);
        }
        return new I8.a(objG, g(type, arrayList2));
    }

    private static final S c(S s10, S s11) {
        S sQ = J0.q(s10, s11.L0());
        AbstractC2855l.f(sQ, "makeNullableIfNeeded(...)");
        return sQ;
    }

    public static final B0 d(B0 b02, boolean z10) {
        if (b02 == null) {
            return null;
        }
        if (!b02.b()) {
            S type = b02.getType();
            AbstractC2855l.f(type, "getType(...)");
            if (J0.c(type, I8.b.f5262g)) {
                N0 n0A = b02.a();
                AbstractC2855l.f(n0A, "getProjectionKind(...)");
                return n0A == N0.f594m ? new D0(n0A, (S) b(type).d()) : z10 ? new D0(n0A, (S) b(type).c()) : h(b02);
            }
        }
        return b02;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Boolean e(M0 m02) {
        AbstractC2855l.d(m02);
        return Boolean.valueOf(AbstractC3090e.f(m02));
    }

    private static final I8.a f(d dVar) {
        I8.a aVarB = b(dVar.a());
        S s10 = (S) aVarB.a();
        S s11 = (S) aVarB.b();
        I8.a aVarB2 = b(dVar.b());
        return new I8.a(new d(dVar.c(), s11, (S) aVarB2.a()), new d(dVar.c(), s10, (S) aVarB2.b()));
    }

    private static final S g(S s10, List list) {
        s10.I0().size();
        list.size();
        ArrayList arrayList = new ArrayList(AbstractC2800q.u(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(j((d) it.next()));
        }
        return F0.e(s10, arrayList, null, null, 6, null);
    }

    private static final B0 h(B0 b02) {
        G0 g0G = G0.g(new b());
        AbstractC2855l.f(g0G, "create(...)");
        return g0G.t(b02);
    }

    private static final d i(B0 b02, m0 m0Var) {
        int i10 = a.f5263a[G0.c(m0Var.m(), b02).ordinal()];
        if (i10 == 1) {
            S type = b02.getType();
            AbstractC2855l.f(type, "getType(...)");
            S type2 = b02.getType();
            AbstractC2855l.f(type2, "getType(...)");
            return new d(m0Var, type, type2);
        }
        if (i10 == 2) {
            S type3 = b02.getType();
            AbstractC2855l.f(type3, "getType(...)");
            AbstractC0407d0 abstractC0407d0I = AbstractC3340e.m(m0Var).I();
            AbstractC2855l.f(abstractC0407d0I, "getNullableAnyType(...)");
            return new d(m0Var, type3, abstractC0407d0I);
        }
        if (i10 != 3) {
            throw new C2750m();
        }
        AbstractC0407d0 abstractC0407d0H = AbstractC3340e.m(m0Var).H();
        AbstractC2855l.f(abstractC0407d0H, "getNothingType(...)");
        S type4 = b02.getType();
        AbstractC2855l.f(type4, "getType(...)");
        return new d(m0Var, abstractC0407d0H, type4);
    }

    private static final B0 j(d dVar) {
        dVar.d();
        if (!AbstractC2855l.b(dVar.a(), dVar.b())) {
            N0 n0M = dVar.c().m();
            N0 n02 = N0.f593l;
            if (n0M != n02) {
                return (!i.n0(dVar.a()) || dVar.c().m() == n02) ? i.p0(dVar.b()) ? new D0(k(dVar, n02), dVar.a()) : new D0(k(dVar, N0.f594m), dVar.b()) : new D0(k(dVar, N0.f594m), dVar.b());
            }
        }
        return new D0(dVar.a());
    }

    private static final N0 k(d dVar, N0 n02) {
        return n02 == dVar.c().m() ? N0.f592k : n02;
    }
}
