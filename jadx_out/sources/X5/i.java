package X5;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class i implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final l f12493a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final f f12494b;

    public i(l lVar, f fVar) {
        this.f12493a = lVar;
        this.f12494b = fVar;
    }

    @Override // X5.k
    public T5.g a(int i10) {
        if (!U5.a.a(i10)) {
            return ((b) this.f12494b.a(this.f12493a.a(Integer.valueOf(i10)))).b(i10);
        }
        throw new IllegalArgumentException(i10 + " calling code belongs to a geo entity");
    }

    @Override // X5.m
    public T5.g b(String str) {
        if (U5.a.b(str)) {
            return ((b) this.f12494b.a(this.f12493a.a(str))).c(str);
        }
        throw new IllegalArgumentException(str + " region code is a non-geo entity");
    }

    public i(l lVar, T5.b bVar, W5.b bVar2) {
        this(lVar, new a(bVar, bVar2, new b()));
    }
}
