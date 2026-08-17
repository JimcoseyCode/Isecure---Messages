package C8;

import java.util.List;
import kotlin.jvm.internal.AbstractC2855l;
import v8.InterfaceC3442k;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class O0 extends S {
    public O0() {
        super(null);
    }

    @Override // C8.S
    public List I0() {
        return O0().I0();
    }

    @Override // C8.S
    public r0 J0() {
        return O0().J0();
    }

    @Override // C8.S
    public v0 K0() {
        return O0().K0();
    }

    @Override // C8.S
    public boolean L0() {
        return O0().L0();
    }

    @Override // C8.S
    public final M0 N0() {
        S sO0 = O0();
        while (sO0 instanceof O0) {
            sO0 = ((O0) sO0).O0();
        }
        AbstractC2855l.e(sO0, "null cannot be cast to non-null type org.jetbrains.kotlin.types.UnwrappedType");
        return (M0) sO0;
    }

    protected abstract S O0();

    public abstract boolean P0();

    @Override // C8.S
    public InterfaceC3442k o() {
        return O0().o();
    }

    public String toString() {
        return P0() ? O0().toString() : "<Not computed yet>";
    }
}
