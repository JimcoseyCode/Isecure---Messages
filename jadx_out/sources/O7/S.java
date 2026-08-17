package O7;

import L7.InterfaceC1279d;
import w7.InterfaceC3487a;

/* JADX INFO: loaded from: classes2.dex */
class S implements InterfaceC3487a {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final T f8409g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final InterfaceC1279d f8410h;

    public S(T t10, InterfaceC1279d interfaceC1279d) {
        this.f8409g = t10;
        this.f8410h = interfaceC1279d;
    }

    @Override // w7.InterfaceC3487a
    public Object invoke() {
        return T.o1(this.f8409g, this.f8410h);
    }
}
