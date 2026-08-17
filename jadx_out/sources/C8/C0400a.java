package C8;

import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: renamed from: C8.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0400a extends A {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final AbstractC0407d0 f627h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final AbstractC0407d0 f628i;

    public C0400a(AbstractC0407d0 delegate, AbstractC0407d0 abbreviation) {
        AbstractC2855l.g(delegate, "delegate");
        AbstractC2855l.g(abbreviation, "abbreviation");
        this.f627h = delegate;
        this.f628i = abbreviation;
    }

    @Override // C8.M0
    /* JADX INFO: renamed from: S0 */
    public AbstractC0407d0 Q0(r0 newAttributes) {
        AbstractC2855l.g(newAttributes, "newAttributes");
        return new C0400a(T0().Q0(newAttributes), this.f628i);
    }

    public final AbstractC0407d0 T() {
        return T0();
    }

    @Override // C8.A
    protected AbstractC0407d0 T0() {
        return this.f627h;
    }

    public final AbstractC0407d0 W0() {
        return this.f628i;
    }

    @Override // C8.AbstractC0407d0
    /* JADX INFO: renamed from: X0, reason: merged with bridge method [inline-methods] */
    public C0400a O0(boolean z10) {
        return new C0400a(T0().O0(z10), this.f628i.O0(z10));
    }

    @Override // C8.A
    /* JADX INFO: renamed from: Y0, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public C0400a U0(D8.g kotlinTypeRefiner) {
        AbstractC2855l.g(kotlinTypeRefiner, "kotlinTypeRefiner");
        S sA = kotlinTypeRefiner.a(T0());
        AbstractC2855l.e(sA, "null cannot be cast to non-null type org.jetbrains.kotlin.types.SimpleType");
        S sA2 = kotlinTypeRefiner.a(this.f628i);
        AbstractC2855l.e(sA2, "null cannot be cast to non-null type org.jetbrains.kotlin.types.SimpleType");
        return new C0400a((AbstractC0407d0) sA, (AbstractC0407d0) sA2);
    }

    @Override // C8.A
    /* JADX INFO: renamed from: Z0, reason: merged with bridge method [inline-methods] */
    public C0400a V0(AbstractC0407d0 delegate) {
        AbstractC2855l.g(delegate, "delegate");
        return new C0400a(delegate, this.f628i);
    }
}
