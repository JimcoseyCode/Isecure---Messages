package S;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final S.a f10233a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final d f10234b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final b f10235c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f10236d;

    c(S.a aVar, d dVar, b bVar, int i10) {
        this.f10233a = aVar;
        this.f10234b = dVar;
        this.f10235c = bVar;
        this.f10236d = i10;
    }

    public int a() {
        return this.f10236d;
    }

    public S.a b() {
        return this.f10233a;
    }

    public b c() {
        return this.f10235c;
    }

    public d d() {
        return this.f10234b;
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private S.a f10237a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private d f10238b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private b f10239c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f10240d;

        public a() {
            this.f10237a = S.a.f10229c;
            this.f10238b = null;
            this.f10239c = null;
            this.f10240d = 0;
        }

        public static a b(c cVar) {
            return new a(cVar);
        }

        public c a() {
            return new c(this.f10237a, this.f10238b, this.f10239c, this.f10240d);
        }

        public a c(int i10) {
            this.f10240d = i10;
            return this;
        }

        public a d(S.a aVar) {
            this.f10237a = aVar;
            return this;
        }

        public a e(b bVar) {
            this.f10239c = bVar;
            return this;
        }

        public a f(d dVar) {
            this.f10238b = dVar;
            return this;
        }

        private a(c cVar) {
            this.f10237a = S.a.f10229c;
            this.f10238b = null;
            this.f10239c = null;
            this.f10240d = 0;
            this.f10237a = cVar.b();
            this.f10238b = cVar.d();
            this.f10239c = cVar.c();
            this.f10240d = cVar.a();
        }
    }
}
