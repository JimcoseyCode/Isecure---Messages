package A8;

import A8.w;
import w7.InterfaceC3487a;

/* JADX INFO: loaded from: classes2.dex */
class F implements InterfaceC3487a {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final w.b f95g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final w f96h;

    public F(w.b bVar, w wVar) {
        this.f95g = bVar;
        this.f96h = wVar;
    }

    @Override // w7.InterfaceC3487a
    public Object invoke() {
        return w.b.D(this.f95g, this.f96h);
    }
}
