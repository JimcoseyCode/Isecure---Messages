package c0;

import c0.p;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
final class v extends p.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f18780a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f18781b;

    v(int i10, long j10) {
        this.f18780a = i10;
        this.f18781b = j10;
    }

    @Override // c0.p.c
    public int a() {
        return this.f18780a;
    }

    @Override // c0.p.c
    public long b() {
        return this.f18781b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof p.c) {
            p.c cVar = (p.c) obj;
            if (this.f18780a == cVar.a() && this.f18781b == cVar.b()) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int i10 = (this.f18780a ^ 1000003) * 1000003;
        long j10 = this.f18781b;
        return i10 ^ ((int) (j10 ^ (j10 >>> 32)));
    }

    public String toString() {
        return "PacketInfo{sizeInBytes=" + this.f18780a + ", timestampNs=" + this.f18781b + "}";
    }
}
