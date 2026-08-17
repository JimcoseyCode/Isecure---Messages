package W8;

/* JADX INFO: renamed from: W8.h, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class C1505h extends RuntimeException {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final transient n7.j f12176g;

    public C1505h(n7.j jVar) {
        this.f12176g = jVar;
    }

    @Override // java.lang.Throwable
    public Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    @Override // java.lang.Throwable
    public String getLocalizedMessage() {
        return String.valueOf(this.f12176g);
    }
}
