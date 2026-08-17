package A8;

import A8.w;
import w7.InterfaceC3487a;

/* JADX INFO: loaded from: classes2.dex */
class L implements InterfaceC3487a {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final w.c f104g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final w f105h;

    public L(w.c cVar, w wVar) {
        this.f104g = cVar;
        this.f105h = wVar;
    }

    @Override // w7.InterfaceC3487a
    public Object invoke() {
        return w.c.u(this.f104g, this.f105h);
    }
}
