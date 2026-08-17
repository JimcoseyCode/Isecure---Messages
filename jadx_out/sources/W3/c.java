package W3;

import W3.n;
import com.facebook.react.uimanager.events.PointerEventHelper;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
final class c extends n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final o f12069a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f12070b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final U3.d f12071c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final U3.g f12072d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final U3.c f12073e;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    static final class b extends n.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private o f12074a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f12075b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private U3.d f12076c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private U3.g f12077d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private U3.c f12078e;

        b() {
        }

        @Override // W3.n.a
        public n a() {
            o oVar = this.f12074a;
            String str = PointerEventHelper.POINTER_TYPE_UNKNOWN;
            if (oVar == null) {
                str = PointerEventHelper.POINTER_TYPE_UNKNOWN + " transportContext";
            }
            if (this.f12075b == null) {
                str = str + " transportName";
            }
            if (this.f12076c == null) {
                str = str + " event";
            }
            if (this.f12077d == null) {
                str = str + " transformer";
            }
            if (this.f12078e == null) {
                str = str + " encoding";
            }
            if (str.isEmpty()) {
                return new c(this.f12074a, this.f12075b, this.f12076c, this.f12077d, this.f12078e);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // W3.n.a
        n.a b(U3.c cVar) {
            if (cVar == null) {
                throw new NullPointerException("Null encoding");
            }
            this.f12078e = cVar;
            return this;
        }

        @Override // W3.n.a
        n.a c(U3.d dVar) {
            if (dVar == null) {
                throw new NullPointerException("Null event");
            }
            this.f12076c = dVar;
            return this;
        }

        @Override // W3.n.a
        n.a d(U3.g gVar) {
            if (gVar == null) {
                throw new NullPointerException("Null transformer");
            }
            this.f12077d = gVar;
            return this;
        }

        @Override // W3.n.a
        public n.a e(o oVar) {
            if (oVar == null) {
                throw new NullPointerException("Null transportContext");
            }
            this.f12074a = oVar;
            return this;
        }

        @Override // W3.n.a
        public n.a f(String str) {
            if (str == null) {
                throw new NullPointerException("Null transportName");
            }
            this.f12075b = str;
            return this;
        }
    }

    @Override // W3.n
    public U3.c b() {
        return this.f12073e;
    }

    @Override // W3.n
    U3.d c() {
        return this.f12071c;
    }

    @Override // W3.n
    U3.g e() {
        return this.f12072d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof n) {
            n nVar = (n) obj;
            if (this.f12069a.equals(nVar.f()) && this.f12070b.equals(nVar.g()) && this.f12071c.equals(nVar.c()) && this.f12072d.equals(nVar.e()) && this.f12073e.equals(nVar.b())) {
                return true;
            }
        }
        return false;
    }

    @Override // W3.n
    public o f() {
        return this.f12069a;
    }

    @Override // W3.n
    public String g() {
        return this.f12070b;
    }

    public int hashCode() {
        return ((((((((this.f12069a.hashCode() ^ 1000003) * 1000003) ^ this.f12070b.hashCode()) * 1000003) ^ this.f12071c.hashCode()) * 1000003) ^ this.f12072d.hashCode()) * 1000003) ^ this.f12073e.hashCode();
    }

    public String toString() {
        return "SendRequest{transportContext=" + this.f12069a + ", transportName=" + this.f12070b + ", event=" + this.f12071c + ", transformer=" + this.f12072d + ", encoding=" + this.f12073e + "}";
    }

    private c(o oVar, String str, U3.d dVar, U3.g gVar, U3.c cVar) {
        this.f12069a = oVar;
        this.f12070b = str;
        this.f12071c = dVar;
        this.f12072d = gVar;
        this.f12073e = cVar;
    }
}
