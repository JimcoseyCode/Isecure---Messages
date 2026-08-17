package c8;

import C8.AbstractC0407d0;
import C8.InterfaceC0401a0;
import C8.J0;
import C8.L0;
import C8.M0;
import C8.r0;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: renamed from: c8.j, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class C1911j extends C8.A implements InterfaceC0401a0 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final AbstractC0407d0 f19003h;

    public C1911j(AbstractC0407d0 delegate) {
        AbstractC2855l.g(delegate, "delegate");
        this.f19003h = delegate;
    }

    private final AbstractC0407d0 W0(AbstractC0407d0 abstractC0407d0) {
        AbstractC0407d0 abstractC0407d0O0 = abstractC0407d0.O0(false);
        return !H8.d.y(abstractC0407d0) ? abstractC0407d0O0 : new C1911j(abstractC0407d0O0);
    }

    @Override // C8.InterfaceC0436w
    public C8.S L(C8.S replacement) {
        AbstractC2855l.g(replacement, "replacement");
        M0 m0N0 = replacement.N0();
        if (!H8.d.y(m0N0) && !J0.l(m0N0)) {
            return m0N0;
        }
        if (m0N0 instanceof AbstractC0407d0) {
            return W0((AbstractC0407d0) m0N0);
        }
        if (m0N0 instanceof C8.I) {
            C8.I i10 = (C8.I) m0N0;
            return L0.d(C8.V.e(W0(i10.S0()), W0(i10.T0())), L0.a(m0N0));
        }
        throw new IllegalStateException(("Incorrect type: " + m0N0).toString());
    }

    @Override // C8.A, C8.S
    public boolean L0() {
        return false;
    }

    @Override // C8.M0
    /* JADX INFO: renamed from: R0 */
    public AbstractC0407d0 O0(boolean z10) {
        return z10 ? T0().O0(true) : this;
    }

    @Override // C8.A
    protected AbstractC0407d0 T0() {
        return this.f19003h;
    }

    @Override // C8.AbstractC0407d0
    /* JADX INFO: renamed from: X0, reason: merged with bridge method [inline-methods] */
    public C1911j Q0(r0 newAttributes) {
        AbstractC2855l.g(newAttributes, "newAttributes");
        return new C1911j(T0().Q0(newAttributes));
    }

    @Override // C8.A
    /* JADX INFO: renamed from: Y0, reason: merged with bridge method [inline-methods] */
    public C1911j V0(AbstractC0407d0 delegate) {
        AbstractC2855l.g(delegate, "delegate");
        return new C1911j(delegate);
    }

    @Override // C8.InterfaceC0436w
    public boolean x0() {
        return true;
    }
}
