package C8;

import C8.AbstractC0430p;
import w7.InterfaceC3487a;

/* JADX INFO: renamed from: C8.o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
class C0428o implements InterfaceC3487a {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final AbstractC0430p.a f672g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final AbstractC0430p f673h;

    public C0428o(AbstractC0430p.a aVar, AbstractC0430p abstractC0430p) {
        this.f672g = aVar;
        this.f673h = abstractC0430p;
    }

    @Override // w7.InterfaceC3487a
    public Object invoke() {
        return AbstractC0430p.a.d(this.f672g, this.f673h);
    }
}
