package Q;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
final class a extends d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final R.f f8928a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final R.f f8929b;

    a(R.f fVar, R.f fVar2) {
        if (fVar == null) {
            throw new NullPointerException("Null primaryOutConfig");
        }
        this.f8928a = fVar;
        if (fVar2 == null) {
            throw new NullPointerException("Null secondaryOutConfig");
        }
        this.f8929b = fVar2;
    }

    @Override // Q.d
    public R.f a() {
        return this.f8928a;
    }

    @Override // Q.d
    public R.f b() {
        return this.f8929b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof d) {
            d dVar = (d) obj;
            if (this.f8928a.equals(dVar.a()) && this.f8929b.equals(dVar.b())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((this.f8928a.hashCode() ^ 1000003) * 1000003) ^ this.f8929b.hashCode();
    }

    public String toString() {
        return "DualOutConfig{primaryOutConfig=" + this.f8928a + ", secondaryOutConfig=" + this.f8929b + "}";
    }
}
