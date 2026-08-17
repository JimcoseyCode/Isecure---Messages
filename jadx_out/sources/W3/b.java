package W3;

import W3.i;
import com.facebook.react.uimanager.events.PointerEventHelper;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
final class b extends i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f12057a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Integer f12058b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final h f12059c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final long f12060d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final long f12061e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Map f12062f;

    /* JADX INFO: renamed from: W3.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    static final class C0129b extends i.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f12063a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Integer f12064b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private h f12065c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private Long f12066d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private Long f12067e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private Map f12068f;

        C0129b() {
        }

        @Override // W3.i.a
        public i d() {
            String str = this.f12063a;
            String str2 = PointerEventHelper.POINTER_TYPE_UNKNOWN;
            if (str == null) {
                str2 = PointerEventHelper.POINTER_TYPE_UNKNOWN + " transportName";
            }
            if (this.f12065c == null) {
                str2 = str2 + " encodedPayload";
            }
            if (this.f12066d == null) {
                str2 = str2 + " eventMillis";
            }
            if (this.f12067e == null) {
                str2 = str2 + " uptimeMillis";
            }
            if (this.f12068f == null) {
                str2 = str2 + " autoMetadata";
            }
            if (str2.isEmpty()) {
                return new b(this.f12063a, this.f12064b, this.f12065c, this.f12066d.longValue(), this.f12067e.longValue(), this.f12068f);
            }
            throw new IllegalStateException("Missing required properties:" + str2);
        }

        @Override // W3.i.a
        protected Map e() {
            Map map = this.f12068f;
            if (map != null) {
                return map;
            }
            throw new IllegalStateException("Property \"autoMetadata\" has not been set");
        }

        @Override // W3.i.a
        protected i.a f(Map map) {
            if (map == null) {
                throw new NullPointerException("Null autoMetadata");
            }
            this.f12068f = map;
            return this;
        }

        @Override // W3.i.a
        public i.a g(Integer num) {
            this.f12064b = num;
            return this;
        }

        @Override // W3.i.a
        public i.a h(h hVar) {
            if (hVar == null) {
                throw new NullPointerException("Null encodedPayload");
            }
            this.f12065c = hVar;
            return this;
        }

        @Override // W3.i.a
        public i.a i(long j10) {
            this.f12066d = Long.valueOf(j10);
            return this;
        }

        @Override // W3.i.a
        public i.a j(String str) {
            if (str == null) {
                throw new NullPointerException("Null transportName");
            }
            this.f12063a = str;
            return this;
        }

        @Override // W3.i.a
        public i.a k(long j10) {
            this.f12067e = Long.valueOf(j10);
            return this;
        }
    }

    @Override // W3.i
    protected Map c() {
        return this.f12062f;
    }

    @Override // W3.i
    public Integer d() {
        return this.f12058b;
    }

    @Override // W3.i
    public h e() {
        return this.f12059c;
    }

    public boolean equals(Object obj) {
        Integer num;
        if (obj == this) {
            return true;
        }
        if (obj instanceof i) {
            i iVar = (i) obj;
            if (this.f12057a.equals(iVar.j()) && ((num = this.f12058b) != null ? num.equals(iVar.d()) : iVar.d() == null) && this.f12059c.equals(iVar.e()) && this.f12060d == iVar.f() && this.f12061e == iVar.k() && this.f12062f.equals(iVar.c())) {
                return true;
            }
        }
        return false;
    }

    @Override // W3.i
    public long f() {
        return this.f12060d;
    }

    public int hashCode() {
        int iHashCode = (this.f12057a.hashCode() ^ 1000003) * 1000003;
        Integer num = this.f12058b;
        int iHashCode2 = (((iHashCode ^ (num == null ? 0 : num.hashCode())) * 1000003) ^ this.f12059c.hashCode()) * 1000003;
        long j10 = this.f12060d;
        int i10 = (iHashCode2 ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003;
        long j11 = this.f12061e;
        return ((i10 ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003) ^ this.f12062f.hashCode();
    }

    @Override // W3.i
    public String j() {
        return this.f12057a;
    }

    @Override // W3.i
    public long k() {
        return this.f12061e;
    }

    public String toString() {
        return "EventInternal{transportName=" + this.f12057a + ", code=" + this.f12058b + ", encodedPayload=" + this.f12059c + ", eventMillis=" + this.f12060d + ", uptimeMillis=" + this.f12061e + ", autoMetadata=" + this.f12062f + "}";
    }

    private b(String str, Integer num, h hVar, long j10, long j11, Map map) {
        this.f12057a = str;
        this.f12058b = num;
        this.f12059c = hVar;
        this.f12060d = j10;
        this.f12061e = j11;
        this.f12062f = map;
    }
}
