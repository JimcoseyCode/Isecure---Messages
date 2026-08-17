package R8;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class a1 extends J {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final a1 f10170i = new a1();

    private a1() {
    }

    @Override // R8.J
    public void J0(n7.j jVar, Runnable runnable) {
        e1 e1Var = (e1) jVar.e(e1.f10187i);
        if (e1Var == null) {
            throw new UnsupportedOperationException("Dispatchers.Unconfined.dispatch function can only be used by the yield function. If you wrap Unconfined dispatcher in your code, make sure you properly delegate isDispatchNeeded and dispatch calls.");
        }
        e1Var.f10188h = true;
    }

    @Override // R8.J
    public boolean L0(n7.j jVar) {
        return false;
    }

    @Override // R8.J
    public J M0(int i10, String str) {
        throw new UnsupportedOperationException("limitedParallelism is not supported for Dispatchers.Unconfined");
    }

    @Override // R8.J
    public String toString() {
        return "Dispatchers.Unconfined";
    }
}
