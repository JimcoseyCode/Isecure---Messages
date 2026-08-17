package x1;

import R1.a;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
final class u implements v, a.f {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final H0.e f33467k = R1.a.d(20, new a());

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final R1.c f33468g = R1.c.a();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private v f33469h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f33470i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f33471j;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    class a implements a.d {
        a() {
        }

        @Override // R1.a.d
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public u create() {
            return new u();
        }
    }

    u() {
    }

    private void c(v vVar) {
        this.f33471j = false;
        this.f33470i = true;
        this.f33469h = vVar;
    }

    static u d(v vVar) {
        u uVar = (u) Q1.k.e((u) f33467k.acquire());
        uVar.c(vVar);
        return uVar;
    }

    private void e() {
        this.f33469h = null;
        f33467k.release(this);
    }

    @Override // x1.v
    public Class a() {
        return this.f33469h.a();
    }

    @Override // x1.v
    public int b() {
        return this.f33469h.b();
    }

    synchronized void f() {
        this.f33468g.c();
        if (!this.f33470i) {
            throw new IllegalStateException("Already unlocked");
        }
        this.f33470i = false;
        if (this.f33471j) {
            recycle();
        }
    }

    @Override // x1.v
    public Object get() {
        return this.f33469h.get();
    }

    @Override // R1.a.f
    public R1.c m() {
        return this.f33468g;
    }

    @Override // x1.v
    public synchronized void recycle() {
        this.f33468g.c();
        this.f33471j = true;
        if (!this.f33470i) {
            this.f33469h.recycle();
            e();
        }
    }
}
