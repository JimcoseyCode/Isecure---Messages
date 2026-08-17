package D8;

import java.util.Set;
import w7.InterfaceC3487a;

/* JADX INFO: loaded from: classes2.dex */
class y implements InterfaceC3487a {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Set f850g;

    public y(Set set) {
        this.f850g = set;
    }

    @Override // w7.InterfaceC3487a
    public Object invoke() {
        return z.f(this.f850g);
    }
}
