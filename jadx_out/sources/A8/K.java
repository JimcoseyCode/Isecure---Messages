package A8;

import A8.w;
import w7.InterfaceC3487a;

/* JADX INFO: loaded from: classes2.dex */
class K implements InterfaceC3487a {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final w.c f102g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final w f103h;

    public K(w.c cVar, w wVar) {
        this.f102g = cVar;
        this.f103h = wVar;
    }

    @Override // w7.InterfaceC3487a
    public Object invoke() {
        return w.c.p(this.f102g, this.f103h);
    }
}
