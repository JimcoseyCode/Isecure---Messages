package V3;

import V3.m;
import com.facebook.react.uimanager.events.PointerEventHelper;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
final class g extends m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f11715a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f11716b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final k f11717c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Integer f11718d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f11719e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final List f11720f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final p f11721g;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    static final class b extends m.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Long f11722a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Long f11723b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private k f11724c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private Integer f11725d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private String f11726e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private List f11727f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private p f11728g;

        b() {
        }

        @Override // V3.m.a
        public m a() {
            Long l10 = this.f11722a;
            String str = PointerEventHelper.POINTER_TYPE_UNKNOWN;
            if (l10 == null) {
                str = PointerEventHelper.POINTER_TYPE_UNKNOWN + " requestTimeMs";
            }
            if (this.f11723b == null) {
                str = str + " requestUptimeMs";
            }
            if (str.isEmpty()) {
                return new g(this.f11722a.longValue(), this.f11723b.longValue(), this.f11724c, this.f11725d, this.f11726e, this.f11727f, this.f11728g);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // V3.m.a
        public m.a b(k kVar) {
            this.f11724c = kVar;
            return this;
        }

        @Override // V3.m.a
        public m.a c(List list) {
            this.f11727f = list;
            return this;
        }

        @Override // V3.m.a
        m.a d(Integer num) {
            this.f11725d = num;
            return this;
        }

        @Override // V3.m.a
        m.a e(String str) {
            this.f11726e = str;
            return this;
        }

        @Override // V3.m.a
        public m.a f(p pVar) {
            this.f11728g = pVar;
            return this;
        }

        @Override // V3.m.a
        public m.a g(long j10) {
            this.f11722a = Long.valueOf(j10);
            return this;
        }

        @Override // V3.m.a
        public m.a h(long j10) {
            this.f11723b = Long.valueOf(j10);
            return this;
        }
    }

    @Override // V3.m
    public k b() {
        return this.f11717c;
    }

    @Override // V3.m
    public List c() {
        return this.f11720f;
    }

    @Override // V3.m
    public Integer d() {
        return this.f11718d;
    }

    @Override // V3.m
    public String e() {
        return this.f11719e;
    }

    public boolean equals(Object obj) {
        k kVar;
        Integer num;
        String str;
        List list;
        p pVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof m) {
            m mVar = (m) obj;
            if (this.f11715a == mVar.g() && this.f11716b == mVar.h() && ((kVar = this.f11717c) != null ? kVar.equals(mVar.b()) : mVar.b() == null) && ((num = this.f11718d) != null ? num.equals(mVar.d()) : mVar.d() == null) && ((str = this.f11719e) != null ? str.equals(mVar.e()) : mVar.e() == null) && ((list = this.f11720f) != null ? list.equals(mVar.c()) : mVar.c() == null) && ((pVar = this.f11721g) != null ? pVar.equals(mVar.f()) : mVar.f() == null)) {
                return true;
            }
        }
        return false;
    }

    @Override // V3.m
    public p f() {
        return this.f11721g;
    }

    @Override // V3.m
    public long g() {
        return this.f11715a;
    }

    @Override // V3.m
    public long h() {
        return this.f11716b;
    }

    public int hashCode() {
        long j10 = this.f11715a;
        long j11 = this.f11716b;
        int i10 = (((((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003) ^ ((int) ((j11 >>> 32) ^ j11))) * 1000003;
        k kVar = this.f11717c;
        int iHashCode = (i10 ^ (kVar == null ? 0 : kVar.hashCode())) * 1000003;
        Integer num = this.f11718d;
        int iHashCode2 = (iHashCode ^ (num == null ? 0 : num.hashCode())) * 1000003;
        String str = this.f11719e;
        int iHashCode3 = (iHashCode2 ^ (str == null ? 0 : str.hashCode())) * 1000003;
        List list = this.f11720f;
        int iHashCode4 = (iHashCode3 ^ (list == null ? 0 : list.hashCode())) * 1000003;
        p pVar = this.f11721g;
        return iHashCode4 ^ (pVar != null ? pVar.hashCode() : 0);
    }

    public String toString() {
        return "LogRequest{requestTimeMs=" + this.f11715a + ", requestUptimeMs=" + this.f11716b + ", clientInfo=" + this.f11717c + ", logSource=" + this.f11718d + ", logSourceName=" + this.f11719e + ", logEvents=" + this.f11720f + ", qosTier=" + this.f11721g + "}";
    }

    private g(long j10, long j11, k kVar, Integer num, String str, List list, p pVar) {
        this.f11715a = j10;
        this.f11716b = j11;
        this.f11717c = kVar;
        this.f11718d = num;
        this.f11719e = str;
        this.f11720f = list;
        this.f11721g = pVar;
    }
}
