package y8;

import w7.InterfaceC3487a;

/* JADX INFO: renamed from: y8.G, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
class C3633G implements InterfaceC3487a {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final C3637K f34016g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final m8.p f34017h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final EnumC3642d f34018i;

    public C3633G(C3637K c3637k, m8.p pVar, EnumC3642d enumC3642d) {
        this.f34016g = c3637k;
        this.f34017h = pVar;
        this.f34018i = enumC3642d;
    }

    @Override // w7.InterfaceC3487a
    public Object invoke() {
        return C3637K.p(this.f34016g, this.f34017h, this.f34018i);
    }
}
