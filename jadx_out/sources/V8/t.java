package V8;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
final class t implements n7.f, kotlin.coroutines.jvm.internal.e {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final n7.f f11879g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final n7.j f11880h;

    public t(n7.f fVar, n7.j jVar) {
        this.f11879g = fVar;
        this.f11880h = jVar;
    }

    @Override // kotlin.coroutines.jvm.internal.e
    public kotlin.coroutines.jvm.internal.e getCallerFrame() {
        n7.f fVar = this.f11879g;
        if (fVar instanceof kotlin.coroutines.jvm.internal.e) {
            return (kotlin.coroutines.jvm.internal.e) fVar;
        }
        return null;
    }

    @Override // n7.f
    public n7.j getContext() {
        return this.f11880h;
    }

    @Override // n7.f
    public void resumeWith(Object obj) {
        this.f11879g.resumeWith(obj);
    }
}
