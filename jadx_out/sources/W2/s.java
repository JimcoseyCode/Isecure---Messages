package W2;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public abstract class s {

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    class a implements z {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ t f12010a;

        a(t tVar) {
            this.f12010a = tVar;
        }

        @Override // W2.z
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void a(W1.d dVar) {
            this.f12010a.j(dVar);
        }

        @Override // W2.z
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public void b(W1.d dVar) {
            this.f12010a.e(dVar);
        }

        @Override // W2.z
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public void c(W1.d dVar) {
            this.f12010a.g(dVar);
        }
    }

    public static u a(x xVar, t tVar) {
        tVar.b(xVar);
        return new u(xVar, new a(tVar));
    }
}
