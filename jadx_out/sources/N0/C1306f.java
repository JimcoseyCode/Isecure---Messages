package N0;

/* JADX INFO: renamed from: N0.f, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public final class C1306f extends D {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Object f7729b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f7730c;

    public C1306f(Object obj, int i10, int i11) {
        super(i11, null);
        this.f7729b = obj;
        this.f7730c = i10;
    }

    public final void b() {
        Object obj = this.f7729b;
        if ((obj != null ? obj.hashCode() : 0) != this.f7730c) {
            throw new IllegalStateException("Data in DataStore was mutated but DataStore is only compatible with Immutable types.");
        }
    }

    public final Object c() {
        return this.f7729b;
    }
}
