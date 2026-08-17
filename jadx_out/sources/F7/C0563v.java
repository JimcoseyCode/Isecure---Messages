package F7;

import w7.InterfaceC3487a;

/* JADX INFO: renamed from: F7.v, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
class C0563v implements InterfaceC3487a {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final A f2121g;

    public C0563v(A a10) {
        this.f2121g = a10;
    }

    @Override // w7.InterfaceC3487a
    public Object invoke() {
        return Boolean.valueOf(A.Y(this.f2121g));
    }
}
