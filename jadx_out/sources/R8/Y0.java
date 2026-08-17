package R8;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
final class Y0 extends W8.A implements Runnable {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final long f10166k;

    public Y0(long j10, n7.f fVar) {
        super(fVar.getContext(), fVar);
        this.f10166k = j10;
    }

    @Override // R8.AbstractC1397a, R8.G0
    public String m0() {
        return super.m0() + "(timeMillis=" + this.f10166k + ')';
    }

    @Override // java.lang.Runnable
    public void run() {
        x(Z0.a(this.f10166k, Y.a(getContext()), this));
    }
}
