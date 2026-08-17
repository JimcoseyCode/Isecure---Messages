package W3;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
final class r implements U3.h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final o f12108a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f12109b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final U3.c f12110c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final U3.g f12111d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final s f12112e;

    r(o oVar, String str, U3.c cVar, U3.g gVar, s sVar) {
        this.f12108a = oVar;
        this.f12109b = str;
        this.f12110c = cVar;
        this.f12111d = gVar;
        this.f12112e = sVar;
    }

    @Override // U3.h
    public void a(U3.d dVar) {
        c(dVar, new U3.j() { // from class: W3.q
            @Override // U3.j
            public final void a(Exception exc) {
                r.b(exc);
            }
        });
    }

    public void c(U3.d dVar, U3.j jVar) {
        this.f12112e.a(n.a().e(this.f12108a).c(dVar).f(this.f12109b).d(this.f12111d).b(this.f12110c).a(), jVar);
    }

    public static /* synthetic */ void b(Exception exc) {
    }
}
