package y8;

import w7.InterfaceC3487a;

/* JADX INFO: renamed from: y8.I, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
class C3635I implements InterfaceC3487a {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final C3637K f34025g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final f8.n f34026h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final A8.N f34027i;

    public C3635I(C3637K c3637k, f8.n nVar, A8.N n10) {
        this.f34025g = c3637k;
        this.f34026h = nVar;
        this.f34027i = n10;
    }

    @Override // w7.InterfaceC3487a
    public Object invoke() {
        return C3637K.w(this.f34025g, this.f34026h, this.f34027i);
    }
}
