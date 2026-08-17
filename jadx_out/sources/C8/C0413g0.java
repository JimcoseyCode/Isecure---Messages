package C8;

import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: renamed from: C8.g0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0413g0 extends A implements K0 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final AbstractC0407d0 f649h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final S f650i;

    public C0413g0(AbstractC0407d0 delegate, S enhancement) {
        AbstractC2855l.g(delegate, "delegate");
        AbstractC2855l.g(enhancement, "enhancement");
        this.f649h = delegate;
        this.f650i = enhancement;
    }

    @Override // C8.K0
    public S G() {
        return this.f650i;
    }

    @Override // C8.M0
    /* JADX INFO: renamed from: R0 */
    public AbstractC0407d0 O0(boolean z10) {
        M0 m0D = L0.d(C0().O0(z10), G().N0().O0(z10));
        AbstractC2855l.e(m0D, "null cannot be cast to non-null type org.jetbrains.kotlin.types.SimpleType");
        return (AbstractC0407d0) m0D;
    }

    @Override // C8.M0
    /* JADX INFO: renamed from: S0 */
    public AbstractC0407d0 Q0(r0 newAttributes) {
        AbstractC2855l.g(newAttributes, "newAttributes");
        M0 m0D = L0.d(C0().Q0(newAttributes), G());
        AbstractC2855l.e(m0D, "null cannot be cast to non-null type org.jetbrains.kotlin.types.SimpleType");
        return (AbstractC0407d0) m0D;
    }

    @Override // C8.A
    protected AbstractC0407d0 T0() {
        return this.f649h;
    }

    @Override // C8.K0
    /* JADX INFO: renamed from: W0, reason: merged with bridge method [inline-methods] */
    public AbstractC0407d0 C0() {
        return T0();
    }

    @Override // C8.A
    /* JADX INFO: renamed from: X0, reason: merged with bridge method [inline-methods] */
    public C0413g0 U0(D8.g kotlinTypeRefiner) {
        AbstractC2855l.g(kotlinTypeRefiner, "kotlinTypeRefiner");
        S sA = kotlinTypeRefiner.a(T0());
        AbstractC2855l.e(sA, "null cannot be cast to non-null type org.jetbrains.kotlin.types.SimpleType");
        return new C0413g0((AbstractC0407d0) sA, kotlinTypeRefiner.a(G()));
    }

    @Override // C8.A
    /* JADX INFO: renamed from: Y0, reason: merged with bridge method [inline-methods] */
    public C0413g0 V0(AbstractC0407d0 delegate) {
        AbstractC2855l.g(delegate, "delegate");
        return new C0413g0(delegate, G());
    }

    @Override // C8.AbstractC0407d0
    public String toString() {
        return "[@EnhancedForWarnings(" + G() + ")] " + C0();
    }
}
