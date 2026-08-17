package R8;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class Z extends Exception {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Throwable f10167g;

    public Z(Throwable th, J j10, n7.j jVar) {
        super("Coroutine dispatcher " + j10 + " threw an exception, context = " + jVar, th);
        this.f10167g = th;
    }

    @Override // java.lang.Throwable
    public Throwable getCause() {
        return this.f10167g;
    }
}
