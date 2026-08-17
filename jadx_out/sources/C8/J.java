package C8;

import i7.C2750m;
import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class J extends I implements InterfaceC0436w {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final a f578k = new a(null);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static boolean f579l;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f580j;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public J(AbstractC0407d0 lowerBound, AbstractC0407d0 upperBound) {
        super(lowerBound, upperBound);
        AbstractC2855l.g(lowerBound, "lowerBound");
        AbstractC2855l.g(upperBound, "upperBound");
    }

    private final void W0() {
        if (!f579l || this.f580j) {
            return;
        }
        this.f580j = true;
        L.b(S0());
        L.b(T0());
        AbstractC2855l.b(S0(), T0());
        D8.e.f819a.b(S0(), T0());
    }

    @Override // C8.InterfaceC0436w
    public S L(S replacement) {
        M0 m0E;
        AbstractC2855l.g(replacement, "replacement");
        M0 m0N0 = replacement.N0();
        if (m0N0 instanceof I) {
            m0E = m0N0;
        } else {
            if (!(m0N0 instanceof AbstractC0407d0)) {
                throw new C2750m();
            }
            AbstractC0407d0 abstractC0407d0 = (AbstractC0407d0) m0N0;
            m0E = V.e(abstractC0407d0, abstractC0407d0.O0(true));
        }
        return L0.b(m0E, m0N0);
    }

    @Override // C8.M0
    public M0 O0(boolean z10) {
        return V.e(S0().O0(z10), T0().O0(z10));
    }

    @Override // C8.M0
    public M0 Q0(r0 newAttributes) {
        AbstractC2855l.g(newAttributes, "newAttributes");
        return V.e(S0().Q0(newAttributes), T0().Q0(newAttributes));
    }

    @Override // C8.I
    public AbstractC0407d0 R0() {
        W0();
        return S0();
    }

    @Override // C8.I
    public String U0(n8.n renderer, n8.w options) {
        AbstractC2855l.g(renderer, "renderer");
        AbstractC2855l.g(options, "options");
        if (!options.o()) {
            return renderer.R(renderer.U(S0()), renderer.U(T0()), H8.d.n(this));
        }
        return '(' + renderer.U(S0()) + ".." + renderer.U(T0()) + ')';
    }

    @Override // C8.M0
    /* JADX INFO: renamed from: V0, reason: merged with bridge method [inline-methods] */
    public I U0(D8.g kotlinTypeRefiner) {
        AbstractC2855l.g(kotlinTypeRefiner, "kotlinTypeRefiner");
        S sA = kotlinTypeRefiner.a(S0());
        AbstractC2855l.e(sA, "null cannot be cast to non-null type org.jetbrains.kotlin.types.SimpleType");
        S sA2 = kotlinTypeRefiner.a(T0());
        AbstractC2855l.e(sA2, "null cannot be cast to non-null type org.jetbrains.kotlin.types.SimpleType");
        return new J((AbstractC0407d0) sA, (AbstractC0407d0) sA2);
    }

    @Override // C8.I
    public String toString() {
        return '(' + S0() + ".." + T0() + ')';
    }

    @Override // C8.InterfaceC0436w
    public boolean x0() {
        return (S0().K0().p() instanceof L7.m0) && AbstractC2855l.b(S0().K0(), T0().K0());
    }
}
