package Z;

import Z.AbstractC1577p;

/* JADX INFO: renamed from: Z.e, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
final class C1566e extends AbstractC1577p.b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AbstractC1582v f13359b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f13360c;

    C1566e(AbstractC1582v abstractC1582v, int i10) {
        if (abstractC1582v == null) {
            throw new NullPointerException("Null fallbackQuality");
        }
        this.f13359b = abstractC1582v;
        this.f13360c = i10;
    }

    @Override // Z.AbstractC1577p.b
    AbstractC1582v b() {
        return this.f13359b;
    }

    @Override // Z.AbstractC1577p.b
    int c() {
        return this.f13360c;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC1577p.b) {
            AbstractC1577p.b bVar = (AbstractC1577p.b) obj;
            if (this.f13359b.equals(bVar.b()) && this.f13360c == bVar.c()) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((this.f13359b.hashCode() ^ 1000003) * 1000003) ^ this.f13360c;
    }

    public String toString() {
        return "RuleStrategy{fallbackQuality=" + this.f13359b + ", fallbackRule=" + this.f13360c + "}";
    }
}
