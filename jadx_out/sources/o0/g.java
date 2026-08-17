package o0;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
class g implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object[] f30389a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f30390b;

    g(int i10) {
        if (i10 <= 0) {
            throw new IllegalArgumentException("The max pool size must be > 0");
        }
        this.f30389a = new Object[i10];
    }

    @Override // o0.f
    public void a(Object[] objArr, int i10) {
        if (i10 > objArr.length) {
            i10 = objArr.length;
        }
        for (int i11 = 0; i11 < i10; i11++) {
            Object obj = objArr[i11];
            int i12 = this.f30390b;
            Object[] objArr2 = this.f30389a;
            if (i12 < objArr2.length) {
                objArr2[i12] = obj;
                this.f30390b = i12 + 1;
            }
        }
    }

    @Override // o0.f
    public Object acquire() {
        int i10 = this.f30390b;
        if (i10 <= 0) {
            return null;
        }
        int i11 = i10 - 1;
        Object[] objArr = this.f30389a;
        Object obj = objArr[i11];
        objArr[i11] = null;
        this.f30390b = i10 - 1;
        return obj;
    }

    @Override // o0.f
    public boolean release(Object obj) {
        int i10 = this.f30390b;
        Object[] objArr = this.f30389a;
        if (i10 >= objArr.length) {
            return false;
        }
        objArr[i10] = obj;
        this.f30390b = i10 + 1;
        return true;
    }
}
