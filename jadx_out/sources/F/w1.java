package F;

import y.r0;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public final class w1 implements y.r0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final long f1722d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final y.r0 f1723e;

    public w1(long j10, y.r0 r0Var) {
        H0.g.b(j10 >= 0, "Timeout must be non-negative.");
        this.f1722d = j10;
        this.f1723e = r0Var;
    }

    @Override // y.r0
    public r0.c a(r0.b bVar) {
        r0.c cVarA = this.f1723e.a(bVar);
        return (c() <= 0 || bVar.c() < c() - cVarA.b()) ? cVarA : r0.c.f33838d;
    }

    @Override // y.r0
    public long c() {
        return this.f1722d;
    }
}
