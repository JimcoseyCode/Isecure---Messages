package V3;

import V3.l;
import com.facebook.react.uimanager.events.PointerEventHelper;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
final class f extends l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f11701a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Integer f11702b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f11703c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final byte[] f11704d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f11705e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final long f11706f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final o f11707g;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    static final class b extends l.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Long f11708a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Integer f11709b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Long f11710c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private byte[] f11711d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private String f11712e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private Long f11713f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private o f11714g;

        b() {
        }

        @Override // V3.l.a
        public l a() {
            Long l10 = this.f11708a;
            String str = PointerEventHelper.POINTER_TYPE_UNKNOWN;
            if (l10 == null) {
                str = PointerEventHelper.POINTER_TYPE_UNKNOWN + " eventTimeMs";
            }
            if (this.f11710c == null) {
                str = str + " eventUptimeMs";
            }
            if (this.f11713f == null) {
                str = str + " timezoneOffsetSeconds";
            }
            if (str.isEmpty()) {
                return new f(this.f11708a.longValue(), this.f11709b, this.f11710c.longValue(), this.f11711d, this.f11712e, this.f11713f.longValue(), this.f11714g);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // V3.l.a
        public l.a b(Integer num) {
            this.f11709b = num;
            return this;
        }

        @Override // V3.l.a
        public l.a c(long j10) {
            this.f11708a = Long.valueOf(j10);
            return this;
        }

        @Override // V3.l.a
        public l.a d(long j10) {
            this.f11710c = Long.valueOf(j10);
            return this;
        }

        @Override // V3.l.a
        public l.a e(o oVar) {
            this.f11714g = oVar;
            return this;
        }

        @Override // V3.l.a
        l.a f(byte[] bArr) {
            this.f11711d = bArr;
            return this;
        }

        @Override // V3.l.a
        l.a g(String str) {
            this.f11712e = str;
            return this;
        }

        @Override // V3.l.a
        public l.a h(long j10) {
            this.f11713f = Long.valueOf(j10);
            return this;
        }
    }

    @Override // V3.l
    public Integer b() {
        return this.f11702b;
    }

    @Override // V3.l
    public long c() {
        return this.f11701a;
    }

    @Override // V3.l
    public long d() {
        return this.f11703c;
    }

    @Override // V3.l
    public o e() {
        return this.f11707g;
    }

    public boolean equals(Object obj) {
        Integer num;
        String str;
        o oVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof l) {
            l lVar = (l) obj;
            if (this.f11701a == lVar.c() && ((num = this.f11702b) != null ? num.equals(lVar.b()) : lVar.b() == null) && this.f11703c == lVar.d()) {
                if (Arrays.equals(this.f11704d, lVar instanceof f ? ((f) lVar).f11704d : lVar.f()) && ((str = this.f11705e) != null ? str.equals(lVar.g()) : lVar.g() == null) && this.f11706f == lVar.h() && ((oVar = this.f11707g) != null ? oVar.equals(lVar.e()) : lVar.e() == null)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // V3.l
    public byte[] f() {
        return this.f11704d;
    }

    @Override // V3.l
    public String g() {
        return this.f11705e;
    }

    @Override // V3.l
    public long h() {
        return this.f11706f;
    }

    public int hashCode() {
        long j10 = this.f11701a;
        int i10 = (((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003;
        Integer num = this.f11702b;
        int iHashCode = num == null ? 0 : num.hashCode();
        long j11 = this.f11703c;
        int iHashCode2 = (((((i10 ^ iHashCode) * 1000003) ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003) ^ Arrays.hashCode(this.f11704d)) * 1000003;
        String str = this.f11705e;
        int iHashCode3 = str == null ? 0 : str.hashCode();
        long j12 = this.f11706f;
        int i11 = (((iHashCode2 ^ iHashCode3) * 1000003) ^ ((int) ((j12 >>> 32) ^ j12))) * 1000003;
        o oVar = this.f11707g;
        return i11 ^ (oVar != null ? oVar.hashCode() : 0);
    }

    public String toString() {
        return "LogEvent{eventTimeMs=" + this.f11701a + ", eventCode=" + this.f11702b + ", eventUptimeMs=" + this.f11703c + ", sourceExtension=" + Arrays.toString(this.f11704d) + ", sourceExtensionJsonProto3=" + this.f11705e + ", timezoneOffsetSeconds=" + this.f11706f + ", networkConnectionInfo=" + this.f11707g + "}";
    }

    private f(long j10, Integer num, long j11, byte[] bArr, String str, long j12, o oVar) {
        this.f11701a = j10;
        this.f11702b = num;
        this.f11703c = j11;
        this.f11704d = bArr;
        this.f11705e = str;
        this.f11706f = j12;
        this.f11707g = oVar;
    }
}
