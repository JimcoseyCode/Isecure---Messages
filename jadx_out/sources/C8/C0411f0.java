package C8;

import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: renamed from: C8.f0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
final class C0411f0 extends B {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final r0 f644i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0411f0(AbstractC0407d0 delegate, r0 attributes) {
        super(delegate);
        AbstractC2855l.g(delegate, "delegate");
        AbstractC2855l.g(attributes, "attributes");
        this.f644i = attributes;
    }

    @Override // C8.A, C8.S
    public r0 J0() {
        return this.f644i;
    }

    @Override // C8.A
    /* JADX INFO: renamed from: W0, reason: merged with bridge method [inline-methods] */
    public C0411f0 V0(AbstractC0407d0 delegate) {
        AbstractC2855l.g(delegate, "delegate");
        return new C0411f0(delegate, J0());
    }
}
