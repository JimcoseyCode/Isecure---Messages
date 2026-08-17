package C8;

import java.util.List;
import kotlin.jvm.internal.AbstractC2855l;
import v8.InterfaceC3442k;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class I extends M0 implements G8.g {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final AbstractC0407d0 f572h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final AbstractC0407d0 f573i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public I(AbstractC0407d0 lowerBound, AbstractC0407d0 upperBound) {
        super(null);
        AbstractC2855l.g(lowerBound, "lowerBound");
        AbstractC2855l.g(upperBound, "upperBound");
        this.f572h = lowerBound;
        this.f573i = upperBound;
    }

    @Override // C8.S
    public List I0() {
        return R0().I0();
    }

    @Override // C8.S
    public r0 J0() {
        return R0().J0();
    }

    @Override // C8.S
    public v0 K0() {
        return R0().K0();
    }

    @Override // C8.S
    public boolean L0() {
        return R0().L0();
    }

    public abstract AbstractC0407d0 R0();

    public final AbstractC0407d0 S0() {
        return this.f572h;
    }

    public final AbstractC0407d0 T0() {
        return this.f573i;
    }

    public abstract String U0(n8.n nVar, n8.w wVar);

    @Override // C8.S
    public InterfaceC3442k o() {
        return R0().o();
    }

    public String toString() {
        return n8.n.f30125k.U(this);
    }
}
