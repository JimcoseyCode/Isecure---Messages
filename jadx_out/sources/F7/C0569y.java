package F7;

import L7.InterfaceC1277b;
import w7.InterfaceC3487a;

/* JADX INFO: renamed from: F7.y, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
class C0569y implements InterfaceC3487a {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final InterfaceC1277b f2136g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final int f2137h;

    public C0569y(InterfaceC1277b interfaceC1277b, int i10) {
        this.f2136g = interfaceC1277b;
        this.f2137h = i10;
    }

    @Override // w7.InterfaceC3487a
    public Object invoke() {
        return A.y(this.f2136g, this.f2137h);
    }
}
