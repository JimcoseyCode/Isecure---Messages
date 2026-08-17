package x1;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
class p implements v {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final boolean f33445g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final boolean f33446h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final v f33447i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final a f33448j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final v1.f f33449k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f33450l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f33451m;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    interface a {
        void a(v1.f fVar, p pVar);
    }

    p(v vVar, boolean z10, boolean z11, v1.f fVar, a aVar) {
        this.f33447i = (v) Q1.k.e(vVar);
        this.f33445g = z10;
        this.f33446h = z11;
        this.f33449k = fVar;
        this.f33448j = (a) Q1.k.e(aVar);
    }

    @Override // x1.v
    public Class a() {
        return this.f33447i.a();
    }

    @Override // x1.v
    public int b() {
        return this.f33447i.b();
    }

    synchronized void c() {
        if (this.f33451m) {
            throw new IllegalStateException("Cannot acquire a recycled resource");
        }
        this.f33450l++;
    }

    v d() {
        return this.f33447i;
    }

    boolean e() {
        return this.f33445g;
    }

    void f() {
        boolean z10;
        synchronized (this) {
            int i10 = this.f33450l;
            if (i10 <= 0) {
                throw new IllegalStateException("Cannot release a recycled or not yet acquired resource");
            }
            z10 = true;
            int i11 = i10 - 1;
            this.f33450l = i11;
            if (i11 != 0) {
                z10 = false;
            }
        }
        if (z10) {
            this.f33448j.a(this.f33449k, this);
        }
    }

    @Override // x1.v
    public Object get() {
        return this.f33447i.get();
    }

    @Override // x1.v
    public synchronized void recycle() {
        if (this.f33450l > 0) {
            throw new IllegalStateException("Cannot recycle a resource while it is still acquired");
        }
        if (this.f33451m) {
            throw new IllegalStateException("Cannot recycle a resource that has already been recycled");
        }
        this.f33451m = true;
        if (this.f33446h) {
            this.f33447i.recycle();
        }
    }

    public synchronized String toString() {
        return "EngineResource{isMemoryCacheable=" + this.f33445g + ", listener=" + this.f33448j + ", key=" + this.f33449k + ", acquired=" + this.f33450l + ", isRecycled=" + this.f33451m + ", resource=" + this.f33447i + '}';
    }
}
