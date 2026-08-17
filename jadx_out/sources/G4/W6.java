package G4;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
final class W6 extends C6 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final transient Object[] f2643j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final transient int f2644k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final transient int f2645l;

    W6(Object[] objArr, int i10, int i11) {
        this.f2643j = objArr;
        this.f2644k = i10;
        this.f2645l = i11;
    }

    @Override // java.util.List
    public final Object get(int i10) {
        G1.a(i10, this.f2645l, "index");
        Object obj = this.f2643j[i10 + i10 + this.f2644k];
        obj.getClass();
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f2645l;
    }
}
