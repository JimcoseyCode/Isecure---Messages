package V3;

import V3.o;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
final class i extends o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final o.c f11730a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final o.b f11731b;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    static final class b extends o.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private o.c f11732a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private o.b f11733b;

        b() {
        }

        @Override // V3.o.a
        public o a() {
            return new i(this.f11732a, this.f11733b);
        }

        @Override // V3.o.a
        public o.a b(o.b bVar) {
            this.f11733b = bVar;
            return this;
        }

        @Override // V3.o.a
        public o.a c(o.c cVar) {
            this.f11732a = cVar;
            return this;
        }
    }

    @Override // V3.o
    public o.b b() {
        return this.f11731b;
    }

    @Override // V3.o
    public o.c c() {
        return this.f11730a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof o) {
            o oVar = (o) obj;
            o.c cVar = this.f11730a;
            if (cVar != null ? cVar.equals(oVar.c()) : oVar.c() == null) {
                o.b bVar = this.f11731b;
                if (bVar != null ? bVar.equals(oVar.b()) : oVar.b() == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public int hashCode() {
        o.c cVar = this.f11730a;
        int iHashCode = ((cVar == null ? 0 : cVar.hashCode()) ^ 1000003) * 1000003;
        o.b bVar = this.f11731b;
        return iHashCode ^ (bVar != null ? bVar.hashCode() : 0);
    }

    public String toString() {
        return "NetworkConnectionInfo{networkType=" + this.f11730a + ", mobileSubtype=" + this.f11731b + "}";
    }

    private i(o.c cVar, o.b bVar) {
        this.f11730a = cVar;
        this.f11731b = bVar;
    }
}
