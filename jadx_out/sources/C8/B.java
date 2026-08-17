package C8;

import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class B extends A {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final AbstractC0407d0 f553h;

    public B(AbstractC0407d0 delegate) {
        AbstractC2855l.g(delegate, "delegate");
        this.f553h = delegate;
    }

    @Override // C8.M0
    /* JADX INFO: renamed from: R0 */
    public AbstractC0407d0 O0(boolean z10) {
        return z10 == L0() ? this : T0().O0(z10).Q0(J0());
    }

    @Override // C8.M0
    /* JADX INFO: renamed from: S0 */
    public AbstractC0407d0 Q0(r0 newAttributes) {
        AbstractC2855l.g(newAttributes, "newAttributes");
        return newAttributes != J0() ? new C0411f0(this, newAttributes) : this;
    }

    @Override // C8.A
    protected AbstractC0407d0 T0() {
        return this.f553h;
    }
}
