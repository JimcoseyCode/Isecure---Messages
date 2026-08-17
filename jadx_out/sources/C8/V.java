package C8;

import C8.InterfaceC0429o0;
import L7.InterfaceC1280e;
import L7.InterfaceC1283h;
import j7.AbstractC2800q;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC2855l;
import s8.AbstractC3340e;
import v8.InterfaceC3442k;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class V {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final V f617a = new V();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Function1 f618b = a.f619g;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    static final class a implements Function1 {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final a f619g = new a();

        a() {
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Void invoke(D8.g gVar) {
            AbstractC2855l.g(gVar, "<unused var>");
            return null;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    private static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final AbstractC0407d0 f620a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final v0 f621b;

        public b(AbstractC0407d0 abstractC0407d0, v0 v0Var) {
            this.f620a = abstractC0407d0;
            this.f621b = v0Var;
        }

        public final AbstractC0407d0 a() {
            return this.f620a;
        }

        public final v0 b() {
            return this.f621b;
        }
    }

    private V() {
    }

    public static final AbstractC0407d0 c(L7.l0 l0Var, List arguments) {
        AbstractC2855l.g(l0Var, "<this>");
        AbstractC2855l.g(arguments, "arguments");
        return new C0425m0(InterfaceC0429o0.a.f674a, false).h(C0427n0.f667e.a(null, l0Var, arguments), r0.f682h.j());
    }

    private final InterfaceC3442k d(v0 v0Var, List list, D8.g gVar) {
        InterfaceC1283h interfaceC1283hP = v0Var.p();
        if (interfaceC1283hP instanceof L7.m0) {
            return ((L7.m0) interfaceC1283hP).r().o();
        }
        if (interfaceC1283hP instanceof InterfaceC1280e) {
            if (gVar == null) {
                gVar = AbstractC3340e.r(AbstractC3340e.s(interfaceC1283hP));
            }
            return list.isEmpty() ? O7.A.b((InterfaceC1280e) interfaceC1283hP, gVar) : O7.A.a((InterfaceC1280e) interfaceC1283hP, w0.f710c.b(v0Var, list), gVar);
        }
        if (interfaceC1283hP instanceof L7.l0) {
            return E8.l.a(E8.h.f1145k, true, ((L7.l0) interfaceC1283hP).getName().toString());
        }
        if (v0Var instanceof Q) {
            return ((Q) v0Var).d();
        }
        throw new IllegalStateException("Unsupported classifier: " + interfaceC1283hP + " for constructor: " + v0Var);
    }

    public static final M0 e(AbstractC0407d0 lowerBound, AbstractC0407d0 upperBound) {
        AbstractC2855l.g(lowerBound, "lowerBound");
        AbstractC2855l.g(upperBound, "upperBound");
        return AbstractC2855l.b(lowerBound, upperBound) ? lowerBound : new J(lowerBound, upperBound);
    }

    public static final AbstractC0407d0 f(r0 attributes, q8.q constructor, boolean z10) {
        AbstractC2855l.g(attributes, "attributes");
        AbstractC2855l.g(constructor, "constructor");
        return m(attributes, constructor, AbstractC2800q.j(), z10, E8.l.a(E8.h.f1143i, true, "unknown integer literal type"));
    }

    private final b g(v0 v0Var, D8.g gVar, List list) {
        InterfaceC1283h interfaceC1283hF;
        InterfaceC1283h interfaceC1283hP = v0Var.p();
        if (interfaceC1283hP == null || (interfaceC1283hF = gVar.f(interfaceC1283hP)) == null) {
            return null;
        }
        if (interfaceC1283hF instanceof L7.l0) {
            return new b(c((L7.l0) interfaceC1283hF, list), null);
        }
        v0 v0VarO = interfaceC1283hF.j().o(gVar);
        AbstractC2855l.f(v0VarO, "refine(...)");
        return new b(null, v0VarO);
    }

    public static final AbstractC0407d0 h(r0 attributes, InterfaceC1280e descriptor, List arguments) {
        AbstractC2855l.g(attributes, "attributes");
        AbstractC2855l.g(descriptor, "descriptor");
        AbstractC2855l.g(arguments, "arguments");
        v0 v0VarJ = descriptor.j();
        AbstractC2855l.f(v0VarJ, "getTypeConstructor(...)");
        return k(attributes, v0VarJ, arguments, false, null, 16, null);
    }

    public static final AbstractC0407d0 i(r0 attributes, v0 constructor, List arguments, boolean z10) {
        AbstractC2855l.g(attributes, "attributes");
        AbstractC2855l.g(constructor, "constructor");
        AbstractC2855l.g(arguments, "arguments");
        return k(attributes, constructor, arguments, z10, null, 16, null);
    }

    public static final AbstractC0407d0 j(r0 attributes, v0 constructor, List arguments, boolean z10, D8.g gVar) {
        AbstractC2855l.g(attributes, "attributes");
        AbstractC2855l.g(constructor, "constructor");
        AbstractC2855l.g(arguments, "arguments");
        if (!attributes.isEmpty() || !arguments.isEmpty() || z10 || constructor.p() == null) {
            return n(attributes, constructor, arguments, z10, f617a.d(constructor, arguments, gVar), new T(constructor, arguments, attributes, z10));
        }
        InterfaceC1283h interfaceC1283hP = constructor.p();
        AbstractC2855l.d(interfaceC1283hP);
        AbstractC0407d0 abstractC0407d0R = interfaceC1283hP.r();
        AbstractC2855l.f(abstractC0407d0R, "getDefaultType(...)");
        return abstractC0407d0R;
    }

    public static /* synthetic */ AbstractC0407d0 k(r0 r0Var, v0 v0Var, List list, boolean z10, D8.g gVar, int i10, Object obj) {
        if ((i10 & 16) != 0) {
            gVar = null;
        }
        return j(r0Var, v0Var, list, z10, gVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AbstractC0407d0 l(v0 v0Var, List list, r0 r0Var, boolean z10, D8.g refiner) {
        AbstractC2855l.g(refiner, "refiner");
        b bVarG = f617a.g(v0Var, refiner, list);
        if (bVarG == null) {
            return null;
        }
        AbstractC0407d0 abstractC0407d0A = bVarG.a();
        if (abstractC0407d0A != null) {
            return abstractC0407d0A;
        }
        v0 v0VarB = bVarG.b();
        AbstractC2855l.d(v0VarB);
        return j(r0Var, v0VarB, list, z10, refiner);
    }

    public static final AbstractC0407d0 m(r0 attributes, v0 constructor, List arguments, boolean z10, InterfaceC3442k memberScope) {
        AbstractC2855l.g(attributes, "attributes");
        AbstractC2855l.g(constructor, "constructor");
        AbstractC2855l.g(arguments, "arguments");
        AbstractC2855l.g(memberScope, "memberScope");
        C0409e0 c0409e0 = new C0409e0(constructor, arguments, z10, memberScope, new U(constructor, arguments, attributes, z10, memberScope));
        return attributes.isEmpty() ? c0409e0 : new C0411f0(c0409e0, attributes);
    }

    public static final AbstractC0407d0 n(r0 attributes, v0 constructor, List arguments, boolean z10, InterfaceC3442k memberScope, Function1 refinedTypeFactory) {
        AbstractC2855l.g(attributes, "attributes");
        AbstractC2855l.g(constructor, "constructor");
        AbstractC2855l.g(arguments, "arguments");
        AbstractC2855l.g(memberScope, "memberScope");
        AbstractC2855l.g(refinedTypeFactory, "refinedTypeFactory");
        C0409e0 c0409e0 = new C0409e0(constructor, arguments, z10, memberScope, refinedTypeFactory);
        return attributes.isEmpty() ? c0409e0 : new C0411f0(c0409e0, attributes);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AbstractC0407d0 o(v0 v0Var, List list, r0 r0Var, boolean z10, InterfaceC3442k interfaceC3442k, D8.g kotlinTypeRefiner) {
        AbstractC2855l.g(kotlinTypeRefiner, "kotlinTypeRefiner");
        b bVarG = f617a.g(v0Var, kotlinTypeRefiner, list);
        if (bVarG == null) {
            return null;
        }
        AbstractC0407d0 abstractC0407d0A = bVarG.a();
        if (abstractC0407d0A != null) {
            return abstractC0407d0A;
        }
        v0 v0VarB = bVarG.b();
        AbstractC2855l.d(v0VarB);
        return m(r0Var, v0VarB, list, z10, interfaceC3442k);
    }
}
