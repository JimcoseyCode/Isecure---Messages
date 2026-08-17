package G4;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
final class X6 extends Q6 {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    static final Q6 f2660l = new X6(null, new Object[0], 0);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    final transient Object[] f2661j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final transient int f2662k;

    private X6(Object obj, Object[] objArr, int i10) {
        this.f2661j = objArr;
        this.f2662k = i10;
    }

    static X6 g(int i10, Object[] objArr, P6 p62) {
        Object obj = objArr[0];
        obj.getClass();
        Object obj2 = objArr[1];
        obj2.getClass();
        AbstractC0649j3.a(obj, obj2);
        return new X6(null, objArr, 1);
    }

    @Override // G4.Q6
    final M4 a() {
        return new W6(this.f2661j, 1, this.f2662k);
    }

    @Override // G4.Q6
    final R6 d() {
        return new U6(this, this.f2661j, 0, this.f2662k);
    }

    @Override // G4.Q6
    final R6 e() {
        return new V6(this, new W6(this.f2661j, 0, this.f2662k));
    }

    /* JADX WARN: Removed duplicated region for block: B:4:0x0007  */
    @Override // G4.Q6, java.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object get(Object obj) {
        Object obj2;
        Object[] objArr = this.f2661j;
        int i10 = this.f2662k;
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
        return this.f2662k;
    }
}
