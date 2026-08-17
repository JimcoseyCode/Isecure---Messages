package C8;

import w7.InterfaceC3487a;

/* JADX INFO: loaded from: classes2.dex */
class X implements InterfaceC3487a {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final D8.g f622g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Y f623h;

    public X(D8.g gVar, Y y10) {
        this.f622g = gVar;
        this.f623h = y10;
    }

    @Override // w7.InterfaceC3487a
    public Object invoke() {
        return Y.S0(this.f622g, this.f623h);
    }
}
