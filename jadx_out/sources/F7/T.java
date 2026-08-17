package F7;

import F7.X;
import w7.InterfaceC3487a;

/* JADX INFO: loaded from: classes2.dex */
class T implements InterfaceC3487a {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final X.a f1973g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final X f1974h;

    public T(X.a aVar, X x10) {
        this.f1973g = aVar;
        this.f1974h = x10;
    }

    @Override // w7.InterfaceC3487a
    public Object invoke() {
        return X.a.W(this.f1973g, this.f1974h);
    }
}
