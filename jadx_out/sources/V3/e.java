package V3;

import V3.k;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
final class e extends k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final k.b f11697a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final V3.a f11698b;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    static final class b extends k.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private k.b f11699a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private V3.a f11700b;

        b() {
        }

        @Override // V3.k.a
        public k a() {
            return new e(this.f11699a, this.f11700b);
        }

        @Override // V3.k.a
        public k.a b(V3.a aVar) {
            this.f11700b = aVar;
            return this;
        }

        @Override // V3.k.a
        public k.a c(k.b bVar) {
            this.f11699a = bVar;
            return this;
        }
    }

    @Override // V3.k
    public V3.a b() {
        return this.f11698b;
    }

    @Override // V3.k
    public k.b c() {
        return this.f11697a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof k) {
            k kVar = (k) obj;
            k.b bVar = this.f11697a;
            if (bVar != null ? bVar.equals(kVar.c()) : kVar.c() == null) {
                V3.a aVar = this.f11698b;
                if (aVar != null ? aVar.equals(kVar.b()) : kVar.b() == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public int hashCode() {
        k.b bVar = this.f11697a;
        int iHashCode = ((bVar == null ? 0 : bVar.hashCode()) ^ 1000003) * 1000003;
        V3.a aVar = this.f11698b;
        return iHashCode ^ (aVar != null ? aVar.hashCode() : 0);
    }

    public String toString() {
        return "ClientInfo{clientType=" + this.f11697a + ", androidClientInfo=" + this.f11698b + "}";
    }

    private e(k.b bVar, V3.a aVar) {
        this.f11697a = bVar;
        this.f11698b = aVar;
    }
}
