package B8;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f438a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Thread f439b = Thread.currentThread();

    l(Object obj) {
        this.f438a = obj;
    }

    public Object a() {
        if (b()) {
            return this.f438a;
        }
        throw new IllegalStateException("No value in this thread (hasValue should be checked before)");
    }

    public boolean b() {
        return this.f439b == Thread.currentThread();
    }
}
