package X3;

import X3.g;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
final class b extends g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final g.a f12459a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f12460b;

    b(g.a aVar, long j10) {
        if (aVar == null) {
            throw new NullPointerException("Null status");
        }
        this.f12459a = aVar;
        this.f12460b = j10;
    }

    @Override // X3.g
    public long b() {
        return this.f12460b;
    }

    @Override // X3.g
    public g.a c() {
        return this.f12459a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof g) {
            g gVar = (g) obj;
            if (this.f12459a.equals(gVar.c()) && this.f12460b == gVar.b()) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int iHashCode = (this.f12459a.hashCode() ^ 1000003) * 1000003;
        long j10 = this.f12460b;
        return iHashCode ^ ((int) (j10 ^ (j10 >>> 32)));
    }

    public String toString() {
        return "BackendResponse{status=" + this.f12459a + ", nextRequestWaitMillis=" + this.f12460b + "}";
    }
}
