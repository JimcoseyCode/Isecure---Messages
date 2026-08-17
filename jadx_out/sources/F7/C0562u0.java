package F7;

import F7.C0564v0;
import w7.InterfaceC3487a;

/* JADX INFO: renamed from: F7.u0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
class C0562u0 implements InterfaceC3487a {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final C0564v0 f2119g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final C0564v0.a f2120h;

    public C0562u0(C0564v0 c0564v0, C0564v0.a aVar) {
        this.f2119g = c0564v0;
        this.f2120h = aVar;
    }

    @Override // w7.InterfaceC3487a
    public Object invoke() {
        return C0564v0.a.n(this.f2119g, this.f2120h);
    }
}
