package y;

import y.AbstractC3599t;

/* JADX INFO: renamed from: y.b, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
final class C3570b extends AbstractC3599t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AbstractC3599t.b f33772a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AbstractC3599t.a f33773b;

    C3570b(AbstractC3599t.b bVar, AbstractC3599t.a aVar) {
        if (bVar == null) {
            throw new NullPointerException("Null type");
        }
        this.f33772a = bVar;
        this.f33773b = aVar;
    }

    @Override // y.AbstractC3599t
    public AbstractC3599t.a c() {
        return this.f33773b;
    }

    @Override // y.AbstractC3599t
    public AbstractC3599t.b d() {
        return this.f33772a;
    }

    public boolean equals(Object obj) {
        AbstractC3599t.a aVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC3599t) {
            AbstractC3599t abstractC3599t = (AbstractC3599t) obj;
            if (this.f33772a.equals(abstractC3599t.d()) && ((aVar = this.f33773b) != null ? aVar.equals(abstractC3599t.c()) : abstractC3599t.c() == null)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int iHashCode = (this.f33772a.hashCode() ^ 1000003) * 1000003;
        AbstractC3599t.a aVar = this.f33773b;
        return iHashCode ^ (aVar == null ? 0 : aVar.hashCode());
    }

    public String toString() {
        return "CameraState{type=" + this.f33772a + ", error=" + this.f33773b + "}";
    }
}
