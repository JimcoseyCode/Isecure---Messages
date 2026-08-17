package R8;

import java.util.concurrent.CancellationException;
import kotlin.jvm.functions.Function1;
import n7.AbstractC2981a;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class M0 extends AbstractC2981a implements A0 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final M0 f10146h = new M0();

    private M0() {
        super(A0.f10112c);
    }

    @Override // R8.A0
    public InterfaceC1434t A(InterfaceC1438v interfaceC1438v) {
        return N0.f10147g;
    }

    @Override // R8.A0
    public InterfaceC1408f0 J(boolean z10, boolean z11, Function1 function1) {
        return N0.f10147g;
    }

    @Override // R8.A0
    public CancellationException M() {
        throw new IllegalStateException("This job is always active");
    }

    @Override // R8.A0
    public boolean d() {
        return true;
    }

    @Override // R8.A0
    public InterfaceC1408f0 g0(Function1 function1) {
        return N0.f10147g;
    }

    @Override // R8.A0
    public boolean start() {
        return false;
    }

    public String toString() {
        return "NonCancellable";
    }

    @Override // R8.A0
    public void k(CancellationException cancellationException) {
    }
}
