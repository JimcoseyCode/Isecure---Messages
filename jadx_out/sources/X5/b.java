package X5;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
final class b implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final e f12487a = e.b();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e f12488b = e.c();

    b() {
    }

    @Override // X5.g
    public void a(T5.g gVar) {
        if (U5.a.b((String) this.f12488b.d().a(gVar))) {
            this.f12488b.a(gVar);
        } else {
            this.f12487a.a(gVar);
        }
    }

    T5.g b(int i10) {
        return this.f12487a.e(Integer.valueOf(i10));
    }

    T5.g c(String str) {
        return this.f12488b.e(str);
    }
}
