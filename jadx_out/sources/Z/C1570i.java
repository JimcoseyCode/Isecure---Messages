package Z;

import Z.C1584x;

/* JADX INFO: renamed from: Z.i, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
final class C1570i extends C1584x.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AbstractC1582v f13386a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f13387b;

    C1570i(AbstractC1582v abstractC1582v, int i10) {
        if (abstractC1582v == null) {
            throw new NullPointerException("Null quality");
        }
        this.f13386a = abstractC1582v;
        this.f13387b = i10;
    }

    @Override // Z.C1584x.a
    int a() {
        return this.f13387b;
    }

    @Override // Z.C1584x.a
    AbstractC1582v b() {
        return this.f13386a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C1584x.a) {
            C1584x.a aVar = (C1584x.a) obj;
            if (this.f13386a.equals(aVar.b()) && this.f13387b == aVar.a()) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((this.f13386a.hashCode() ^ 1000003) * 1000003) ^ this.f13387b;
    }

    public String toString() {
        return "QualityRatio{quality=" + this.f13386a + ", aspectRatio=" + this.f13387b + "}";
    }
}
