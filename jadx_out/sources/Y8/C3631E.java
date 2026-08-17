package y8;

import w7.InterfaceC3487a;

/* JADX INFO: renamed from: y8.E, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
class C3631E implements InterfaceC3487a {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final C3637K f34010g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final m8.p f34011h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final EnumC3642d f34012i;

    public C3631E(C3637K c3637k, m8.p pVar, EnumC3642d enumC3642d) {
        this.f34010g = c3637k;
        this.f34011h = pVar;
        this.f34012i = enumC3642d;
    }

    @Override // w7.InterfaceC3487a
    public Object invoke() {
        return C3637K.k(this.f34010g, this.f34011h, this.f34012i);
    }
}
