package Z3;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final b f13572b = new a().a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final e f13573a;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private e f13574a = null;

        a() {
        }

        public b a() {
            return new b(this.f13574a);
        }

        public a b(e eVar) {
            this.f13574a = eVar;
            return this;
        }
    }

    b(e eVar) {
        this.f13573a = eVar;
    }

    public static a b() {
        return new a();
    }

    public e a() {
        return this.f13573a;
    }
}
