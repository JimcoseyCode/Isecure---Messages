package e4;

/* JADX INFO: renamed from: e4.b, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
final class C2403b extends AbstractC2412k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f25875a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final W3.o f25876b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final W3.i f25877c;

    C2403b(long j10, W3.o oVar, W3.i iVar) {
        this.f25875a = j10;
        if (oVar == null) {
            throw new NullPointerException("Null transportContext");
        }
        this.f25876b = oVar;
        if (iVar == null) {
            throw new NullPointerException("Null event");
        }
        this.f25877c = iVar;
    }

    @Override // e4.AbstractC2412k
    public W3.i b() {
        return this.f25877c;
    }

    @Override // e4.AbstractC2412k
    public long c() {
        return this.f25875a;
    }

    @Override // e4.AbstractC2412k
    public W3.o d() {
        return this.f25876b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC2412k) {
            AbstractC2412k abstractC2412k = (AbstractC2412k) obj;
            if (this.f25875a == abstractC2412k.c() && this.f25876b.equals(abstractC2412k.d()) && this.f25877c.equals(abstractC2412k.b())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        long j10 = this.f25875a;
        return ((((((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003) ^ this.f25876b.hashCode()) * 1000003) ^ this.f25877c.hashCode();
    }

    public String toString() {
        return "PersistedEvent{id=" + this.f25875a + ", transportContext=" + this.f25876b + ", event=" + this.f25877c + "}";
    }
}
