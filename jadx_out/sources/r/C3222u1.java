package r;

/* JADX INFO: renamed from: r.u1, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
class C3222u1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f31505a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final s.E f31506b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f31507c;

    C3222u1(s.E e10, int i10) {
        this.f31506b = e10;
        this.f31507c = i10;
    }

    public int a() {
        int i10;
        synchronized (this.f31505a) {
            i10 = this.f31507c;
        }
        return i10;
    }

    void b(int i10) {
        synchronized (this.f31505a) {
            this.f31507c = i10;
        }
    }
}
