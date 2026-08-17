package F5;

import F5.f;
import com.facebook.react.uimanager.events.PointerEventHelper;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
final class b extends f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f1886a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f1887b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final f.b f1888c;

    /* JADX INFO: renamed from: F5.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    static final class C0043b extends f.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f1889a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Long f1890b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private f.b f1891c;

        C0043b() {
        }

        @Override // F5.f.a
        public f a() {
            Long l10 = this.f1890b;
            String str = PointerEventHelper.POINTER_TYPE_UNKNOWN;
            if (l10 == null) {
                str = PointerEventHelper.POINTER_TYPE_UNKNOWN + " tokenExpirationTimestamp";
            }
            if (str.isEmpty()) {
                return new b(this.f1889a, this.f1890b.longValue(), this.f1891c);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // F5.f.a
        public f.a b(f.b bVar) {
            this.f1891c = bVar;
            return this;
        }

        @Override // F5.f.a
        public f.a c(String str) {
            this.f1889a = str;
            return this;
        }

        @Override // F5.f.a
        public f.a d(long j10) {
            this.f1890b = Long.valueOf(j10);
            return this;
        }
    }

    @Override // F5.f
    public f.b b() {
        return this.f1888c;
    }

    @Override // F5.f
    public String c() {
        return this.f1886a;
    }

    @Override // F5.f
    public long d() {
        return this.f1887b;
    }

    public boolean equals(Object obj) {
        f.b bVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof f) {
            f fVar = (f) obj;
            String str = this.f1886a;
            if (str != null ? str.equals(fVar.c()) : fVar.c() == null) {
                if (this.f1887b == fVar.d() && ((bVar = this.f1888c) != null ? bVar.equals(fVar.b()) : fVar.b() == null)) {
                    return true;
                }
            }
        }
        return false;
    }

    public int hashCode() {
        String str = this.f1886a;
        int iHashCode = str == null ? 0 : str.hashCode();
        long j10 = this.f1887b;
        int i10 = (((iHashCode ^ 1000003) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003;
        f.b bVar = this.f1888c;
        return i10 ^ (bVar != null ? bVar.hashCode() : 0);
    }

    public String toString() {
        return "TokenResult{token=" + this.f1886a + ", tokenExpirationTimestamp=" + this.f1887b + ", responseCode=" + this.f1888c + "}";
    }

    private b(String str, long j10, f.b bVar) {
        this.f1886a = str;
        this.f1887b = j10;
        this.f1888c = bVar;
    }
}
