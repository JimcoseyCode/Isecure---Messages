package Y7;

import L7.g0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: Y7.v, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
class C1557v implements Function1 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final g0 f13082g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final C1561z f13083h;

    public C1557v(g0 g0Var, C1561z c1561z) {
        this.f13082g = g0Var;
        this.f13083h = c1561z;
    }

    @Override // kotlin.jvm.functions.Function1
    public Object invoke(Object obj) {
        return C1561z.g1(this.f13082g, this.f13083h, (k8.f) obj);
    }
}
