package kotlin.coroutines.jvm.internal;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class j extends a {
    public j(n7.f fVar) {
        super(fVar);
        if (fVar != null && fVar.getContext() != n7.k.f30068g) {
            throw new IllegalArgumentException("Coroutines with restricted suspension must have EmptyCoroutineContext");
        }
    }

    @Override // n7.f
    public n7.j getContext() {
        return n7.k.f30068g;
    }
}
