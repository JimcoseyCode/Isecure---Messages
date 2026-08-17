package q5;

/* JADX INFO: renamed from: q5.B, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
class C3115B implements C5.b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final C5.a f30752c = new C5.a() { // from class: q5.z
        @Override // C5.a
        public final void a(C5.b bVar) {
            C3115B.b(bVar);
        }
    };

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final C5.b f30753d = new C5.b() { // from class: q5.A
        @Override // C5.b
        public final Object get() {
            return C3115B.a();
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private C5.a f30754a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private volatile C5.b f30755b;

    private C3115B(C5.a aVar, C5.b bVar) {
        this.f30754a = aVar;
        this.f30755b = bVar;
    }

    public static /* synthetic */ Object a() {
        return null;
    }

    static C3115B c() {
        return new C3115B(f30752c, f30753d);
    }

    void d(C5.b bVar) {
        C5.a aVar;
        if (this.f30755b != f30753d) {
            throw new IllegalStateException("provide() can be called only once.");
        }
        synchronized (this) {
            aVar = this.f30754a;
            this.f30754a = null;
            this.f30755b = bVar;
        }
        aVar.a(bVar);
    }

    @Override // C5.b
    public Object get() {
        return this.f30755b.get();
    }

    public static /* synthetic */ void b(C5.b bVar) {
    }
}
