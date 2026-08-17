package G4;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
final class S6 extends C6 {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    static final C6 f2582l = new S6(new Object[0], 0);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    final transient Object[] f2583j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final transient int f2584k;

    S6(Object[] objArr, int i10) {
        this.f2583j = objArr;
        this.f2584k = i10;
    }

    @Override // G4.C6, G4.M4
    final int d(Object[] objArr, int i10) {
        System.arraycopy(this.f2583j, 0, objArr, 0, this.f2584k);
        return this.f2584k;
    }

    @Override // java.util.List
    public final Object get(int i10) {
        G1.a(i10, this.f2584k, "index");
        Object obj = this.f2583j[i10];
        obj.getClass();
        return obj;
    }

    @Override // G4.M4
    final int o() {
        return this.f2584k;
    }

    @Override // G4.M4
    final int p() {
        return 0;
    }

    @Override // G4.M4
    final Object[] q() {
        return this.f2583j;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f2584k;
    }
}
