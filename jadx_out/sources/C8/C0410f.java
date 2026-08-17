package C8;

import w7.InterfaceC3487a;

/* JADX INFO: renamed from: C8.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
class C0410f implements InterfaceC3487a {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final u0 f640g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final G8.o f641h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final G8.j f642i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final G8.j f643j;

    public C0410f(u0 u0Var, G8.o oVar, G8.j jVar, G8.j jVar2) {
        this.f640g = u0Var;
        this.f641h = oVar;
        this.f642i = jVar;
        this.f643j = jVar2;
    }

    @Override // w7.InterfaceC3487a
    public Object invoke() {
        return Boolean.valueOf(C0412g.y(this.f640g, this.f641h, this.f642i, this.f643j));
    }
}
