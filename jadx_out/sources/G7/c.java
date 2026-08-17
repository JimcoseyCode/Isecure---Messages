package G7;

import java.util.Map;
import w7.InterfaceC3487a;

/* JADX INFO: loaded from: classes2.dex */
class c implements InterfaceC3487a {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Class f3499g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Map f3500h;

    public c(Class cls, Map map) {
        this.f3499g = cls;
        this.f3500h = map;
    }

    @Override // w7.InterfaceC3487a
    public Object invoke() {
        return f.l(this.f3499g, this.f3500h);
    }
}
