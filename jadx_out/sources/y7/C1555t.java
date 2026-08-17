package Y7;

import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: Y7.t, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
class C1555t implements Function1 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final C1561z f13079g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final X7.k f13080h;

    public C1555t(C1561z c1561z, X7.k kVar) {
        this.f13079g = c1561z;
        this.f13080h = kVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public Object invoke(Object obj) {
        return C1561z.i1(this.f13079g, this.f13080h, (k8.f) obj);
    }
}
