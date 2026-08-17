package J4;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
final class S5 extends N5 {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    static final N5 f5883k = new S5(new Object[0], 0);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    final transient Object[] f5884i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final transient int f5885j;

    S5(Object[] objArr, int i10) {
        this.f5884i = objArr;
        this.f5885j = i10;
    }

    @Override // J4.N5, J4.M4
    final int d(Object[] objArr, int i10) {
        System.arraycopy(this.f5884i, 0, objArr, 0, this.f5885j);
        return this.f5885j;
    }

    @Override // java.util.List
    public final Object get(int i10) {
        G1.a(i10, this.f5885j, "index");
        Object obj = this.f5884i[i10];
        obj.getClass();
        return obj;
    }

    @Override // J4.M4
    final int o() {
        return this.f5885j;
    }

    @Override // J4.M4
    final int p() {
        return 0;
    }

    @Override // J4.M4
    final Object[] q() {
        return this.f5884i;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f5885j;
    }
}
