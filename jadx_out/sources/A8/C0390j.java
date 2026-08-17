package A8;

import A8.C0393m;
import java.util.List;
import w7.InterfaceC3487a;

/* JADX INFO: renamed from: A8.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
class C0390j implements InterfaceC3487a {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final List f145g;

    public C0390j(List list) {
        this.f145g = list;
    }

    @Override // w7.InterfaceC3487a
    public Object invoke() {
        return C0393m.a.B(this.f145g);
    }
}
