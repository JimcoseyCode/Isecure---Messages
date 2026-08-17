package X7;

import L7.InterfaceC1282g;
import w7.InterfaceC3487a;

/* JADX INFO: loaded from: classes2.dex */
class a implements InterfaceC3487a {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final k f12503g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final InterfaceC1282g f12504h;

    public a(k kVar, InterfaceC1282g interfaceC1282g) {
        this.f12503g = kVar;
        this.f12504h = interfaceC1282g;
    }

    @Override // w7.InterfaceC3487a
    public Object invoke() {
        return c.g(this.f12503g, this.f12504h);
    }
}
