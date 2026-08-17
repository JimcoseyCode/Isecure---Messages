package y8;

import w7.InterfaceC3487a;

/* JADX INFO: renamed from: y8.C, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
class C3629C implements InterfaceC3487a {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final C3637K f34004g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final f8.n f34005h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final A8.N f34006i;

    public C3629C(C3637K c3637k, f8.n nVar, A8.N n10) {
        this.f34004g = c3637k;
        this.f34005h = nVar;
        this.f34006i = n10;
    }

    @Override // w7.InterfaceC3487a
    public Object invoke() {
        return C3637K.v(this.f34004g, this.f34005h, this.f34006i);
    }
}
