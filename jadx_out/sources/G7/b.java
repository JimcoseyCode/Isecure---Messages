package G7;

import java.util.Map;
import w7.InterfaceC3487a;

/* JADX INFO: loaded from: classes2.dex */
class b implements InterfaceC3487a {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Map f3498g;

    public b(Map map) {
        this.f3498g = map;
    }

    @Override // w7.InterfaceC3487a
    public Object invoke() {
        return Integer.valueOf(f.j(this.f3498g));
    }
}
