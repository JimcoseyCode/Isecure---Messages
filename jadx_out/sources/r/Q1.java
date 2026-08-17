package r;

import F.C0486h0;
import q.C3091a;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
final class Q1 extends C3161d0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static final Q1 f31069c = new Q1(new v.k());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final v.k f31070b;

    private Q1(v.k kVar) {
        this.f31070b = kVar;
    }

    @Override // r.C3161d0, F.C0486h0.b
    public void a(F.D1 d12, C0486h0.a aVar) {
        super.a(d12, aVar);
        if (!(d12 instanceof F.C0)) {
            throw new IllegalArgumentException("config is not ImageCaptureConfig");
        }
        F.C0 c02 = (F.C0) d12;
        C3091a.C0345a c0345a = new C3091a.C0345a();
        if (c02.n0()) {
            this.f31070b.a(c02.g0(), c0345a);
        }
        aVar.e(c0345a.a());
    }
}
