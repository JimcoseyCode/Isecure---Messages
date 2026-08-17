package F5;

import F5.d;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
final class a extends d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f1876a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f1877b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f1878c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final f f1879d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final d.b f1880e;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    static final class b extends d.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f1881a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f1882b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private String f1883c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private f f1884d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private d.b f1885e;

        b() {
        }

        @Override // F5.d.a
        public d a() {
            return new a(this.f1881a, this.f1882b, this.f1883c, this.f1884d, this.f1885e);
        }

        @Override // F5.d.a
        public d.a b(f fVar) {
            this.f1884d = fVar;
            return this;
        }

        @Override // F5.d.a
        public d.a c(String str) {
            this.f1882b = str;
            return this;
        }

        @Override // F5.d.a
        public d.a d(String str) {
            this.f1883c = str;
            return this;
        }

        @Override // F5.d.a
        public d.a e(d.b bVar) {
            this.f1885e = bVar;
            return this;
        }

        @Override // F5.d.a
        public d.a f(String str) {
            this.f1881a = str;
            return this;
        }
    }

    @Override // F5.d
    public f b() {
        return this.f1879d;
    }

    @Override // F5.d
    public String c() {
        return this.f1877b;
    }

    @Override // F5.d
    public String d() {
        return this.f1878c;
    }

    @Override // F5.d
    public d.b e() {
        return this.f1880e;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof d) {
            d dVar = (d) obj;
            String str = this.f1876a;
            if (str != null ? str.equals(dVar.f()) : dVar.f() == null) {
                String str2 = this.f1877b;
                if (str2 != null ? str2.equals(dVar.c()) : dVar.c() == null) {
                    String str3 = this.f1878c;
                    if (str3 != null ? str3.equals(dVar.d()) : dVar.d() == null) {
                        f fVar = this.f1879d;
                        if (fVar != null ? fVar.equals(dVar.b()) : dVar.b() == null) {
                            d.b bVar = this.f1880e;
                            if (bVar != null ? bVar.equals(dVar.e()) : dVar.e() == null) {
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override // F5.d
    public String f() {
        return this.f1876a;
    }

    public int hashCode() {
        String str = this.f1876a;
        int iHashCode = ((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003;
        String str2 = this.f1877b;
        int iHashCode2 = (iHashCode ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.f1878c;
        int iHashCode3 = (iHashCode2 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        f fVar = this.f1879d;
        int iHashCode4 = (iHashCode3 ^ (fVar == null ? 0 : fVar.hashCode())) * 1000003;
        d.b bVar = this.f1880e;
        return iHashCode4 ^ (bVar != null ? bVar.hashCode() : 0);
    }

    public String toString() {
        return "InstallationResponse{uri=" + this.f1876a + ", fid=" + this.f1877b + ", refreshToken=" + this.f1878c + ", authToken=" + this.f1879d + ", responseCode=" + this.f1880e + "}";
    }

    private a(String str, String str2, String str3, f fVar, d.b bVar) {
        this.f1876a = str;
        this.f1877b = str2;
        this.f1878c = str3;
        this.f1879d = fVar;
        this.f1880e = bVar;
    }
}
