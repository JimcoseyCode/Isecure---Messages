package C8;

import java.util.List;
import kotlin.jvm.internal.AbstractC2855l;
import v8.InterfaceC3442k;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class A extends AbstractC0407d0 {
    @Override // C8.S
    public List I0() {
        return T0().I0();
    }

    @Override // C8.S
    public r0 J0() {
        return T0().J0();
    }

    @Override // C8.S
    public v0 K0() {
        return T0().K0();
    }

    @Override // C8.S
    public boolean L0() {
        return T0().L0();
    }

    protected abstract AbstractC0407d0 T0();

    @Override // C8.M0
    public AbstractC0407d0 U0(D8.g kotlinTypeRefiner) {
        AbstractC2855l.g(kotlinTypeRefiner, "kotlinTypeRefiner");
        S sA = kotlinTypeRefiner.a(T0());
        AbstractC2855l.e(sA, "null cannot be cast to non-null type org.jetbrains.kotlin.types.SimpleType");
        return V0((AbstractC0407d0) sA);
    }

    public abstract A V0(AbstractC0407d0 abstractC0407d0);

    @Override // C8.S
    public InterfaceC3442k o() {
        return T0().o();
    }
}
