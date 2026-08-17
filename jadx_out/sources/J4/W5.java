package J4;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
final class W5 extends N5 {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final transient Object[] f5937i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final transient int f5938j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final transient int f5939k;

    W5(Object[] objArr, int i10, int i11) {
        this.f5937i = objArr;
        this.f5938j = i10;
        this.f5939k = i11;
    }

    @Override // java.util.List
    public final Object get(int i10) {
        G1.a(i10, this.f5939k, "index");
        Object obj = this.f5937i[i10 + i10 + this.f5938j];
        obj.getClass();
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f5939k;
    }
}
