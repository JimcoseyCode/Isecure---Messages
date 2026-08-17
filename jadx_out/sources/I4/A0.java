package I4;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
final class A0 extends AbstractC0907j0 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    final transient Object[] f3930j;

    private A0(Object obj, Object[] objArr, int i10) {
        this.f3930j = objArr;
    }

    static A0 g(int i10, Object[] objArr, AbstractC0896i0 abstractC0896i0) {
        Object obj = objArr[0];
        Objects.requireNonNull(obj);
        Object obj2 = objArr[1];
        Objects.requireNonNull(obj2);
        L.b(obj, obj2);
        return new A0(null, objArr, 1);
    }

    @Override // I4.AbstractC0907j0
    final AbstractC0830c0 a() {
        return new C1082z0(this.f3930j, 1, 1);
    }

    @Override // I4.AbstractC0907j0
    final AbstractC0918k0 d() {
        return new C1060x0(this, this.f3930j, 0, 1);
    }

    @Override // I4.AbstractC0907j0
    final AbstractC0918k0 e() {
        return new C1071y0(this, new C1082z0(this.f3930j, 0, 1));
    }

    /* JADX WARN: Removed duplicated region for block: B:4:0x0003  */
    @Override // I4.AbstractC0907j0, java.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object get(Object obj) {
        Object obj2;
        if (obj == null) {
            obj2 = null;
        } else {
            Object[] objArr = this.f3930j;
            Object obj3 = objArr[0];
            Objects.requireNonNull(obj3);
            if (obj3.equals(obj)) {
                obj2 = objArr[1];
                Objects.requireNonNull(obj2);
            }
        }
        if (obj2 == null) {
            return null;
        }
        return obj2;
    }

    @Override // java.util.Map
    public final int size() {
        return 1;
    }
}
