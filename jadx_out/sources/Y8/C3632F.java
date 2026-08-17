package y8;

import w7.InterfaceC3487a;

/* JADX INFO: renamed from: y8.F, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
class C3632F implements InterfaceC3487a {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final C3637K f34013g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final boolean f34014h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final f8.n f34015i;

    public C3632F(C3637K c3637k, boolean z10, f8.n nVar) {
        this.f34013g = c3637k;
        this.f34014h = z10;
        this.f34015i = nVar;
    }

    @Override // w7.InterfaceC3487a
    public Object invoke() {
        return C3637K.n(this.f34013g, this.f34014h, this.f34015i);
    }
}
