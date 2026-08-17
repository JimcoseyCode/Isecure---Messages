package R8;

import i7.AbstractC2753p;
import i7.C2752o;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
final class Q0 extends F0 {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final C1425o f10155k;

    public Q0(C1425o c1425o) {
        this.f10155k = c1425o;
    }

    @Override // R8.F0
    public boolean v() {
        return false;
    }

    @Override // R8.F0
    public void w(Throwable th) {
        Object objV = u().V();
        if (objV instanceof B) {
            C1425o c1425o = this.f10155k;
            C2752o.a aVar = C2752o.f28721h;
            c1425o.resumeWith(C2752o.b(AbstractC2753p.a(((B) objV).f10115a)));
        } else {
            C1425o c1425o2 = this.f10155k;
            C2752o.a aVar2 = C2752o.f28721h;
            c1425o2.resumeWith(C2752o.b(H0.h(objV)));
        }
    }
}
