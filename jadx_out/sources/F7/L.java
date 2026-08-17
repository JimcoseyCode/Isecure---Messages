package F7;

import F7.X;
import w7.InterfaceC3487a;

/* JADX INFO: loaded from: classes2.dex */
class L implements InterfaceC3487a {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final C8.S f1955g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final X.a f1956h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final X f1957i;

    public L(C8.S s10, X.a aVar, X x10) {
        this.f1955g = s10;
        this.f1956h = aVar;
        this.f1957i = x10;
    }

    @Override // w7.InterfaceC3487a
    public Object invoke() {
        return X.a.b0(this.f1955g, this.f1956h, this.f1957i);
    }
}
