package E5;

import E5.c;
import E5.d;
import com.facebook.react.uimanager.events.PointerEventHelper;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
final class a extends d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f1087b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final c.a f1088c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f1089d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f1090e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final long f1091f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final long f1092g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final String f1093h;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    static final class b extends d.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f1094a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private c.a f1095b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private String f1096c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private String f1097d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private Long f1098e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private Long f1099f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private String f1100g;

        @Override // E5.d.a
        public d a() {
            c.a aVar = this.f1095b;
            String str = PointerEventHelper.POINTER_TYPE_UNKNOWN;
            if (aVar == null) {
                str = PointerEventHelper.POINTER_TYPE_UNKNOWN + " registrationStatus";
            }
            if (this.f1098e == null) {
                str = str + " expiresInSecs";
            }
            if (this.f1099f == null) {
                str = str + " tokenCreationEpochInSecs";
            }
            if (str.isEmpty()) {
                return new a(this.f1094a, this.f1095b, this.f1096c, this.f1097d, this.f1098e.longValue(), this.f1099f.longValue(), this.f1100g);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // E5.d.a
        public d.a b(String str) {
            this.f1096c = str;
            return this;
        }

        @Override // E5.d.a
        public d.a c(long j10) {
            this.f1098e = Long.valueOf(j10);
            return this;
        }

        @Override // E5.d.a
        public d.a d(String str) {
            this.f1094a = str;
            return this;
        }

        @Override // E5.d.a
        public d.a e(String str) {
            this.f1100g = str;
            return this;
        }

        @Override // E5.d.a
        public d.a f(String str) {
            this.f1097d = str;
            return this;
        }

        @Override // E5.d.a
        public d.a g(c.a aVar) {
            if (aVar == null) {
                throw new NullPointerException("Null registrationStatus");
            }
            this.f1095b = aVar;
            return this;
        }

        @Override // E5.d.a
        public d.a h(long j10) {
            this.f1099f = Long.valueOf(j10);
            return this;
        }

        b() {
        }

        private b(d dVar) {
            this.f1094a = dVar.d();
            this.f1095b = dVar.g();
            this.f1096c = dVar.b();
            this.f1097d = dVar.f();
            this.f1098e = Long.valueOf(dVar.c());
            this.f1099f = Long.valueOf(dVar.h());
            this.f1100g = dVar.e();
        }
    }

    @Override // E5.d
    public String b() {
        return this.f1089d;
    }

    @Override // E5.d
    public long c() {
        return this.f1091f;
    }

    @Override // E5.d
    public String d() {
        return this.f1087b;
    }

    @Override // E5.d
    public String e() {
        return this.f1093h;
    }

    public boolean equals(Object obj) {
        String str;
        String str2;
        String str3;
        if (obj == this) {
            return true;
        }
        if (obj instanceof d) {
            d dVar = (d) obj;
            String str4 = this.f1087b;
            if (str4 != null ? str4.equals(dVar.d()) : dVar.d() == null) {
                if (this.f1088c.equals(dVar.g()) && ((str = this.f1089d) != null ? str.equals(dVar.b()) : dVar.b() == null) && ((str2 = this.f1090e) != null ? str2.equals(dVar.f()) : dVar.f() == null) && this.f1091f == dVar.c() && this.f1092g == dVar.h() && ((str3 = this.f1093h) != null ? str3.equals(dVar.e()) : dVar.e() == null)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // E5.d
    public String f() {
        return this.f1090e;
    }

    @Override // E5.d
    public c.a g() {
        return this.f1088c;
    }

    @Override // E5.d
    public long h() {
        return this.f1092g;
    }

    public int hashCode() {
        String str = this.f1087b;
        int iHashCode = ((((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003) ^ this.f1088c.hashCode()) * 1000003;
        String str2 = this.f1089d;
        int iHashCode2 = (iHashCode ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.f1090e;
        int iHashCode3 = (iHashCode2 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        long j10 = this.f1091f;
        int i10 = (iHashCode3 ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003;
        long j11 = this.f1092g;
        int i11 = (i10 ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003;
        String str4 = this.f1093h;
        return i11 ^ (str4 != null ? str4.hashCode() : 0);
    }

    @Override // E5.d
    public d.a n() {
        return new b(this);
    }

    public String toString() {
        return "PersistedInstallationEntry{firebaseInstallationId=" + this.f1087b + ", registrationStatus=" + this.f1088c + ", authToken=" + this.f1089d + ", refreshToken=" + this.f1090e + ", expiresInSecs=" + this.f1091f + ", tokenCreationEpochInSecs=" + this.f1092g + ", fisError=" + this.f1093h + "}";
    }

    private a(String str, c.a aVar, String str2, String str3, long j10, long j11, String str4) {
        this.f1087b = str;
        this.f1088c = aVar;
        this.f1089d = str2;
        this.f1090e = str3;
        this.f1091f = j10;
        this.f1092g = j11;
        this.f1093h = str4;
    }
}
