package F;

import m5.InterfaceFutureC2904a;
import y.C3565J;

/* JADX INFO: renamed from: F.c, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public class C0472c extends AbstractC0519y0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final I f1429c;

    public C0472c(I i10, m1 m1Var) {
        super(i10);
        this.f1429c = i10;
    }

    @Override // F.AbstractC0519y0, y.InterfaceC3586j
    public InterfaceFutureC2904a f() {
        return this.f1429c.f();
    }

    @Override // F.AbstractC0519y0, y.InterfaceC3586j
    public InterfaceFutureC2904a g(float f10) {
        return !H.w.b(null, 0) ? J.n.n(new IllegalStateException("Zoom is not supported")) : this.f1429c.g(f10);
    }

    @Override // F.AbstractC0519y0, y.InterfaceC3586j
    public InterfaceFutureC2904a i(C3565J c3565j) {
        C3565J c3565jA = H.w.a(null, c3565j);
        return c3565jA == null ? J.n.n(new IllegalStateException("FocusMetering is not supported")) : this.f1429c.i(c3565jA);
    }

    @Override // F.AbstractC0519y0, y.InterfaceC3586j
    public InterfaceFutureC2904a k(boolean z10) {
        return !H.w.b(null, 6) ? J.n.n(new IllegalStateException("Torch is not supported")) : this.f1429c.k(z10);
    }
}
