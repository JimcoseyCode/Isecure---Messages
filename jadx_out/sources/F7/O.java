package F7;

import F7.X;
import w7.InterfaceC3487a;

/* JADX INFO: loaded from: classes2.dex */
class O implements InterfaceC3487a {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final X f1963g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final X.a f1964h;

    public O(X x10, X.a aVar) {
        this.f1963g = x10;
        this.f1964h = aVar;
    }

    @Override // w7.InterfaceC3487a
    public Object invoke() {
        return X.a.Z(this.f1963g, this.f1964h);
    }
}
