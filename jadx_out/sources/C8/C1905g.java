package c8;

import C8.AbstractC0407d0;
import C8.AbstractC0415h0;
import C8.B0;
import C8.InterfaceC0405c0;
import C8.J0;
import C8.L0;
import C8.M0;
import C8.N0;
import C8.r0;
import C8.s0;
import C8.v0;
import L7.InterfaceC1283h;
import L7.m0;
import i7.C2750m;
import j7.AbstractC2800q;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: renamed from: c8.g, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class C1905g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final X7.e f18977a;

    /* JADX INFO: renamed from: c8.g$a */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final C8.S f18978a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f18979b;

        public a(C8.S s10, int i10) {
            this.f18978a = s10;
            this.f18979b = i10;
        }

        public final int a() {
            return this.f18979b;
        }

        public final C8.S b() {
            return this.f18978a;
        }
    }

    /* JADX INFO: renamed from: c8.g$b */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    private static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final AbstractC0407d0 f18980a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f18981b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final boolean f18982c;

        public b(AbstractC0407d0 abstractC0407d0, int i10, boolean z10) {
            this.f18980a = abstractC0407d0;
            this.f18981b = i10;
            this.f18982c = z10;
        }

        public final boolean a() {
            return this.f18982c;
        }

        public final int b() {
            return this.f18981b;
        }

        public final AbstractC0407d0 c() {
            return this.f18980a;
        }
    }

    public C1905g(X7.e javaResolverSettings) {
        AbstractC2855l.g(javaResolverSettings, "javaResolverSettings");
        this.f18977a = javaResolverSettings;
    }

    private final b b(AbstractC0407d0 abstractC0407d0, Function1 function1, int i10, EnumC1908h0 enumC1908h0, boolean z10, boolean z11) {
        v0 v0VarK0;
        Boolean bool;
        a aVar;
        B0 b0S;
        Function1 function12 = function1;
        boolean zA = AbstractC1910i0.a(enumC1908h0);
        boolean z12 = (z11 && z10) ? false : true;
        C8.S s10 = null;
        if (!zA && abstractC0407d0.I0().isEmpty()) {
            return new b(null, 1, false);
        }
        InterfaceC1283h interfaceC1283hP = abstractC0407d0.K0().p();
        if (interfaceC1283hP == null) {
            return new b(null, 1, false);
        }
        C1907h c1907h = (C1907h) function12.invoke(Integer.valueOf(i10));
        InterfaceC1283h interfaceC1283hF = AbstractC1914k0.f(interfaceC1283hP, c1907h, enumC1908h0);
        Boolean boolH = AbstractC1914k0.h(c1907h, enumC1908h0);
        if (interfaceC1283hF == null || (v0VarK0 = interfaceC1283hF.j()) == null) {
            v0VarK0 = abstractC0407d0.K0();
        }
        v0 v0Var = v0VarK0;
        int iA = i10 + 1;
        List listI0 = abstractC0407d0.I0();
        List parameters = v0Var.getParameters();
        AbstractC2855l.f(parameters, "getParameters(...)");
        Iterator it = listI0.iterator();
        Iterator it2 = parameters.iterator();
        ArrayList arrayList = new ArrayList(Math.min(AbstractC2800q.u(listI0, 10), AbstractC2800q.u(parameters, 10)));
        while (it.hasNext() && it2.hasNext()) {
            Object next = it.next();
            m0 m0Var = (m0) it2.next();
            B0 b02 = (B0) next;
            if (z12) {
                bool = boolH;
                if (!b02.b()) {
                    aVar = d(b02.getType().N0(), function12, iA, z11);
                } else if (((C1907h) function12.invoke(Integer.valueOf(iA))).f() == EnumC1913k.f19005g) {
                    M0 m0N0 = b02.getType().N0();
                    aVar = new a(C8.V.e(C8.L.c(m0N0).O0(false), C8.L.d(m0N0).O0(true)), 1);
                } else {
                    aVar = new a(null, 1);
                }
            } else {
                bool = boolH;
                aVar = new a(s10, 0);
            }
            iA += aVar.a();
            if (aVar.b() != null) {
                C8.S sB = aVar.b();
                N0 n0A = b02.a();
                AbstractC2855l.f(n0A, "getProjectionKind(...)");
                b0S = H8.d.k(sB, n0A, m0Var);
            } else if (interfaceC1283hF == null || b02.b()) {
                b0S = interfaceC1283hF != null ? J0.s(m0Var) : null;
            } else {
                C8.S type = b02.getType();
                AbstractC2855l.f(type, "getType(...)");
                N0 n0A2 = b02.a();
                AbstractC2855l.f(n0A2, "getProjectionKind(...)");
                b0S = H8.d.k(type, n0A2, m0Var);
            }
            arrayList.add(b0S);
            function12 = function1;
            boolH = bool;
            s10 = null;
        }
        Boolean bool2 = boolH;
        int i11 = iA - i10;
        if (interfaceC1283hF == null && bool2 == null) {
            if (!arrayList.isEmpty()) {
                Iterator it3 = arrayList.iterator();
                while (it3.hasNext()) {
                    if (((B0) it3.next()) == null) {
                    }
                }
            }
            return new b(null, i11, false);
        }
        M7.h annotations = abstractC0407d0.getAnnotations();
        C1903f c1903f = AbstractC1914k0.f19011b;
        if (interfaceC1283hF == null) {
            c1903f = null;
        }
        r0 r0VarB = s0.b(AbstractC1914k0.e(AbstractC2800q.o(annotations, c1903f, bool2 != null ? AbstractC1914k0.g() : null)));
        List listI02 = abstractC0407d0.I0();
        Iterator it4 = arrayList.iterator();
        Iterator it5 = listI02.iterator();
        ArrayList arrayList2 = new ArrayList(Math.min(AbstractC2800q.u(arrayList, 10), AbstractC2800q.u(listI02, 10)));
        while (it4.hasNext() && it5.hasNext()) {
            Object next2 = it4.next();
            B0 b03 = (B0) it5.next();
            B0 b04 = (B0) next2;
            if (b04 != null) {
                b03 = b04;
            }
            arrayList2.add(b03);
        }
        AbstractC0407d0 abstractC0407d0K = C8.V.k(r0VarB, v0Var, arrayList2, bool2 != null ? bool2.booleanValue() : abstractC0407d0.L0(), null, 16, null);
        if (c1907h.d()) {
            abstractC0407d0K = e(abstractC0407d0K);
        }
        return new b(abstractC0407d0K, i11, bool2 != null && c1907h.g());
    }

    static /* synthetic */ b c(C1905g c1905g, AbstractC0407d0 abstractC0407d0, Function1 function1, int i10, EnumC1908h0 enumC1908h0, boolean z10, boolean z11, int i11, Object obj) {
        if ((i11 & 8) != 0) {
            z10 = false;
        }
        if ((i11 & 16) != 0) {
            z11 = false;
        }
        return c1905g.b(abstractC0407d0, function1, i10, enumC1908h0, z10, z11);
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x009d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final a d(M0 m02, Function1 function1, int i10, boolean z10) {
        C8.S sC;
        C8.S sD = null;
        if (C8.W.a(m02)) {
            return new a(null, 1);
        }
        if (!(m02 instanceof C8.I)) {
            if (!(m02 instanceof AbstractC0407d0)) {
                throw new C2750m();
            }
            b bVarC = c(this, (AbstractC0407d0) m02, function1, i10, EnumC1908h0.f18996i, false, z10, 8, null);
            return new a(bVarC.a() ? L0.d(m02, bVarC.c()) : bVarC.c(), bVarC.b());
        }
        boolean z11 = m02 instanceof InterfaceC0405c0;
        C8.I i11 = (C8.I) m02;
        b bVarB = b(i11.S0(), function1, i10, EnumC1908h0.f18994g, z11, z10);
        b bVarB2 = b(i11.T0(), function1, i10, EnumC1908h0.f18995h, z11, z10);
        bVarB.b();
        bVarB2.b();
        if (bVarB.c() != null || bVarB2.c() != null) {
            if (bVarB.a() || bVarB2.a()) {
                AbstractC0407d0 abstractC0407d0C = bVarB2.c();
                if (abstractC0407d0C == null) {
                    sC = bVarB.c();
                    AbstractC2855l.d(sC);
                    sD = L0.d(m02, sC);
                } else {
                    AbstractC0407d0 abstractC0407d0C2 = bVarB.c();
                    if (abstractC0407d0C2 == null) {
                        abstractC0407d0C2 = abstractC0407d0C;
                    }
                    sC = C8.V.e(abstractC0407d0C2, abstractC0407d0C);
                    if (sC == null) {
                    }
                    sD = L0.d(m02, sC);
                }
            } else if (z11) {
                AbstractC0407d0 abstractC0407d0C3 = bVarB.c();
                if (abstractC0407d0C3 == null) {
                    abstractC0407d0C3 = i11.S0();
                }
                AbstractC0407d0 abstractC0407d0C4 = bVarB2.c();
                if (abstractC0407d0C4 == null) {
                    abstractC0407d0C4 = i11.T0();
                }
                sD = new Z7.k(abstractC0407d0C3, abstractC0407d0C4);
            } else {
                AbstractC0407d0 abstractC0407d0C5 = bVarB.c();
                if (abstractC0407d0C5 == null) {
                    abstractC0407d0C5 = i11.S0();
                }
                AbstractC0407d0 abstractC0407d0C6 = bVarB2.c();
                if (abstractC0407d0C6 == null) {
                    abstractC0407d0C6 = i11.T0();
                }
                sD = C8.V.e(abstractC0407d0C5, abstractC0407d0C6);
            }
        }
        return new a(sD, bVarB.b());
    }

    private final AbstractC0407d0 e(AbstractC0407d0 abstractC0407d0) {
        return this.f18977a.a() ? AbstractC0415h0.h(abstractC0407d0, true) : new C1911j(abstractC0407d0);
    }

    public final C8.S a(C8.S s10, Function1 qualifiers, boolean z10) {
        AbstractC2855l.g(s10, "<this>");
        AbstractC2855l.g(qualifiers, "qualifiers");
        return d(s10.N0(), qualifiers, 0, z10).b();
    }
}
