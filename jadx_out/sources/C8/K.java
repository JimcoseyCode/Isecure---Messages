package C8;

import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class K extends I implements K0 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final I f586j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final S f587k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public K(I origin, S enhancement) {
        super(origin.S0(), origin.T0());
        AbstractC2855l.g(origin, "origin");
        AbstractC2855l.g(enhancement, "enhancement");
        this.f586j = origin;
        this.f587k = enhancement;
    }

    @Override // C8.K0
    public S G() {
        return this.f587k;
    }

    @Override // C8.M0
    public M0 O0(boolean z10) {
        return L0.d(C0().O0(z10), G().N0().O0(z10));
    }

    @Override // C8.M0
    public M0 Q0(r0 newAttributes) {
        AbstractC2855l.g(newAttributes, "newAttributes");
        return L0.d(C0().Q0(newAttributes), G());
    }

    @Override // C8.I
    public AbstractC0407d0 R0() {
        return C0().R0();
    }

    @Override // C8.I
    public String U0(n8.n renderer, n8.w options) {
        AbstractC2855l.g(renderer, "renderer");
        AbstractC2855l.g(options, "options");
        return options.h() ? renderer.U(G()) : C0().U0(renderer, options);
    }

    @Override // C8.K0
    /* JADX INFO: renamed from: V0, reason: merged with bridge method [inline-methods] */
    public I C0() {
        return this.f586j;
    }

    @Override // C8.M0
    /* JADX INFO: renamed from: W0, reason: merged with bridge method [inline-methods] */
    public K U0(D8.g kotlinTypeRefiner) {
        AbstractC2855l.g(kotlinTypeRefiner, "kotlinTypeRefiner");
        S sA = kotlinTypeRefiner.a(C0());
        AbstractC2855l.e(sA, "null cannot be cast to non-null type org.jetbrains.kotlin.types.FlexibleType");
        return new K((I) sA, kotlinTypeRefiner.a(G()));
    }

    @Override // C8.I
    public String toString() {
        return "[@EnhancedForWarnings(" + G() + ")] " + C0();
    }
}
