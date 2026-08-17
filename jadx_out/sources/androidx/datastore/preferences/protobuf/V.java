package androidx.datastore.preferences.protobuf;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
final class V extends AbstractC1710c implements RandomAccess {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final V f16791j = new V(new Object[0], 0, false);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private Object[] f16792h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f16793i;

    private V(Object[] objArr, int i10, boolean z10) {
        super(z10);
        this.f16792h = objArr;
        this.f16793i = i10;
    }

    private static Object[] o(int i10) {
        return new Object[i10];
    }

    public static V p() {
        return f16791j;
    }

    private void q(int i10) {
        if (i10 < 0 || i10 >= this.f16793i) {
            throw new IndexOutOfBoundsException(r(i10));
        }
    }

    private String r(int i10) {
        return "Index:" + i10 + ", Size:" + this.f16793i;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(Object obj) {
        d();
        int i10 = this.f16793i;
        Object[] objArr = this.f16792h;
        if (i10 == objArr.length) {
            this.f16792h = Arrays.copyOf(objArr, ((i10 * 3) / 2) + 1);
        }
        Object[] objArr2 = this.f16792h;
        int i11 = this.f16793i;
        this.f16793i = i11 + 1;
        objArr2[i11] = obj;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public Object get(int i10) {
        q(i10);
        return this.f16792h[i10];
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC1710c, java.util.AbstractList, java.util.List
    public Object remove(int i10) {
        d();
        q(i10);
        Object[] objArr = this.f16792h;
        Object obj = objArr[i10];
        if (i10 < this.f16793i - 1) {
            System.arraycopy(objArr, i10 + 1, objArr, i10, (r2 - i10) - 1);
        }
        this.f16793i--;
        ((AbstractList) this).modCount++;
        return obj;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC1727u.b
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public V f(int i10) {
        if (i10 >= this.f16793i) {
            return new V(Arrays.copyOf(this.f16792h, i10), this.f16793i, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractList, java.util.List
    public Object set(int i10, Object obj) {
        d();
        q(i10);
        Object[] objArr = this.f16792h;
        Object obj2 = objArr[i10];
        objArr[i10] = obj;
        ((AbstractList) this).modCount++;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f16793i;
    }

    @Override // java.util.AbstractList, java.util.List
    public void add(int i10, Object obj) {
        int i11;
        d();
        if (i10 >= 0 && i10 <= (i11 = this.f16793i)) {
            Object[] objArr = this.f16792h;
            if (i11 < objArr.length) {
                System.arraycopy(objArr, i10, objArr, i10 + 1, i11 - i10);
            } else {
                Object[] objArrO = o(((i11 * 3) / 2) + 1);
                System.arraycopy(this.f16792h, 0, objArrO, 0, i10);
                System.arraycopy(this.f16792h, i10, objArrO, i10 + 1, this.f16793i - i10);
                this.f16792h = objArrO;
            }
            this.f16792h[i10] = obj;
            this.f16793i++;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException(r(i10));
    }
}
