package J4;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
final class X5 extends P5 {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    static final P5 f5951l = new X5(null, new Object[0], 0);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    final transient Object[] f5952j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final transient int f5953k;

    private X5(Object obj, Object[] objArr, int i10) {
        this.f5952j = objArr;
        this.f5953k = i10;
    }

    static X5 g(int i10, Object[] objArr, O5 o52) {
        Object obj = objArr[0];
        obj.getClass();
        Object obj2 = objArr[1];
        obj2.getClass();
        AbstractC1159j3.a(obj, obj2);
        return new X5(null, objArr, 1);
    }

    @Override // J4.P5
    final M4 a() {
        return new W5(this.f5952j, 1, this.f5953k);
    }

    @Override // J4.P5
    final Q5 d() {
        return new U5(this, this.f5952j, 0, this.f5953k);
    }

    @Override // J4.P5
    final Q5 e() {
        return new V5(this, new W5(this.f5952j, 0, this.f5953k));
    }

    /* JADX WARN: Removed duplicated region for block: B:4:0x0007  */
    @Override // J4.P5, java.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object get(Object obj) {
        Object obj2;
        Object[] objArr = this.f5952j;
        int i10 = this.f5953k;
        if (obj != null && i10 == 1) {
            Object obj3 = objArr[0];
            obj3.getClass();
            if (obj3.equals(obj)) {
                obj2 = objArr[1];
                obj2.getClass();
            } else {
                obj2 = null;
            }
        }
        if (obj2 == null) {
            return null;
        }
        return obj2;
    }

    @Override // java.util.Map
    public final int size() {
        return this.f5953k;
    }
}
