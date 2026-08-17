package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import com.facebook.react.uimanager.ViewDefaults;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
final class Q0 extends AbstractC2106b0 implements RandomAccess, V0 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final Q0 f22302j = new Q0(new int[0], 0, false);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int[] f22303h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f22304i;

    private Q0(int[] iArr, int i10, boolean z10) {
        super(z10);
        this.f22303h = iArr;
        this.f22304i = i10;
    }

    public static Q0 p() {
        return f22302j;
    }

    private final String r(int i10) {
        return "Index:" + i10 + ", Size:" + this.f22304i;
    }

    private final void s(int i10) {
        if (i10 < 0 || i10 >= this.f22304i) {
            throw new IndexOutOfBoundsException(r(i10));
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i10, Object obj) {
        int i11;
        int iIntValue = ((Integer) obj).intValue();
        d();
        if (i10 < 0 || i10 > (i11 = this.f22304i)) {
            throw new IndexOutOfBoundsException(r(i10));
        }
        int i12 = i10 + 1;
        int[] iArr = this.f22303h;
        if (i11 < iArr.length) {
            System.arraycopy(iArr, i10, iArr, i12, i11 - i10);
        } else {
            int[] iArr2 = new int[((i11 * 3) / 2) + 1];
            System.arraycopy(iArr, 0, iArr2, 0, i10);
            System.arraycopy(this.f22303h, i10, iArr2, i12, this.f22304i - i10);
            this.f22303h = iArr2;
        }
        this.f22303h[i10] = iIntValue;
        this.f22304i++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.AbstractC2106b0, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        d();
        byte[] bArr = X0.f22317b;
        collection.getClass();
        if (!(collection instanceof Q0)) {
            return super.addAll(collection);
        }
        Q0 q02 = (Q0) collection;
        int i10 = q02.f22304i;
        if (i10 == 0) {
            return false;
        }
        int i11 = this.f22304i;
        if (ViewDefaults.NUMBER_OF_LINES - i11 < i10) {
            throw new OutOfMemoryError();
        }
        int i12 = i11 + i10;
        int[] iArr = this.f22303h;
        if (i12 > iArr.length) {
            this.f22303h = Arrays.copyOf(iArr, i12);
        }
        System.arraycopy(q02.f22303h, 0, this.f22303h, this.f22304i, q02.f22304i);
        this.f22304i = i12;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.W0
    public final /* bridge */ /* synthetic */ W0 c(int i10) {
        if (i10 >= this.f22304i) {
            return new Q0(Arrays.copyOf(this.f22303h, i10), this.f22304i, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.AbstractC2106b0, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Q0)) {
            return super.equals(obj);
        }
        Q0 q02 = (Q0) obj;
        if (this.f22304i != q02.f22304i) {
            return false;
        }
        int[] iArr = q02.f22303h;
        for (int i10 = 0; i10 < this.f22304i; i10++) {
            if (this.f22303h[i10] != iArr[i10]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i10) {
        s(i10);
        return Integer.valueOf(this.f22303h[i10]);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.AbstractC2106b0, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i10 = 1;
        for (int i11 = 0; i11 < this.f22304i; i11++) {
            i10 = (i10 * 31) + this.f22303h[i11];
        }
        return i10;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int iIntValue = ((Integer) obj).intValue();
        int i10 = this.f22304i;
        for (int i11 = 0; i11 < i10; i11++) {
            if (this.f22303h[i11] == iIntValue) {
                return i11;
            }
        }
        return -1;
    }

    public final int o(int i10) {
        s(i10);
        return this.f22303h[i10];
    }

    public final void q(int i10) {
        d();
        int i11 = this.f22304i;
        int[] iArr = this.f22303h;
        if (i11 == iArr.length) {
            int[] iArr2 = new int[((i11 * 3) / 2) + 1];
            System.arraycopy(iArr, 0, iArr2, 0, i11);
            this.f22303h = iArr2;
        }
        int[] iArr3 = this.f22303h;
        int i12 = this.f22304i;
        this.f22304i = i12 + 1;
        iArr3[i12] = i10;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.AbstractC2106b0, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i10) {
        d();
        s(i10);
        int[] iArr = this.f22303h;
        int i11 = iArr[i10];
        if (i10 < this.f22304i - 1) {
            System.arraycopy(iArr, i10 + 1, iArr, i10, (r2 - i10) - 1);
        }
        this.f22304i--;
        ((AbstractList) this).modCount++;
        return Integer.valueOf(i11);
    }

    @Override // java.util.AbstractList
    protected final void removeRange(int i10, int i11) {
        d();
        if (i11 < i10) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        int[] iArr = this.f22303h;
        System.arraycopy(iArr, i11, iArr, i10, this.f22304i - i11);
        this.f22304i -= i11 - i10;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i10, Object obj) {
        int iIntValue = ((Integer) obj).intValue();
        d();
        s(i10);
        int[] iArr = this.f22303h;
        int i11 = iArr[i10];
        iArr[i10] = iIntValue;
        return Integer.valueOf(i11);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f22304i;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        q(((Integer) obj).intValue());
        return true;
    }
}
