package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;

/* JADX INFO: renamed from: com.google.android.gms.internal.mlkit_vision_barcode_bundled.z1, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
final class C2220z1 extends AbstractC2106b0 implements RandomAccess {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final C2220z1 f22447j = new C2220z1(new Object[0], 0, false);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private Object[] f22448h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f22449i;

    private C2220z1(Object[] objArr, int i10, boolean z10) {
        super(z10);
        this.f22448h = objArr;
        this.f22449i = i10;
    }

    public static C2220z1 o() {
        return f22447j;
    }

    private final String p(int i10) {
        return "Index:" + i10 + ", Size:" + this.f22449i;
    }

    private final void q(int i10) {
        if (i10 < 0 || i10 >= this.f22449i) {
            throw new IndexOutOfBoundsException(p(i10));
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i10, Object obj) {
        int i11;
        d();
        if (i10 < 0 || i10 > (i11 = this.f22449i)) {
            throw new IndexOutOfBoundsException(p(i10));
        }
        int i12 = i10 + 1;
        Object[] objArr = this.f22448h;
        if (i11 < objArr.length) {
            System.arraycopy(objArr, i10, objArr, i12, i11 - i10);
        } else {
            Object[] objArr2 = new Object[((i11 * 3) / 2) + 1];
            System.arraycopy(objArr, 0, objArr2, 0, i10);
            System.arraycopy(this.f22448h, i10, objArr2, i12, this.f22449i - i10);
            this.f22448h = objArr2;
        }
        this.f22448h[i10] = obj;
        this.f22449i++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.W0
    public final /* bridge */ /* synthetic */ W0 c(int i10) {
        if (i10 >= this.f22449i) {
            return new C2220z1(Arrays.copyOf(this.f22448h, i10), this.f22449i, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i10) {
        q(i10);
        return this.f22448h[i10];
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.AbstractC2106b0, java.util.AbstractList, java.util.List
    public final Object remove(int i10) {
        d();
        q(i10);
        Object[] objArr = this.f22448h;
        Object obj = objArr[i10];
        if (i10 < this.f22449i - 1) {
            System.arraycopy(objArr, i10 + 1, objArr, i10, (r2 - i10) - 1);
        }
        this.f22449i--;
        ((AbstractList) this).modCount++;
        return obj;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i10, Object obj) {
        d();
        q(i10);
        Object[] objArr = this.f22448h;
        Object obj2 = objArr[i10];
        objArr[i10] = obj;
        ((AbstractList) this).modCount++;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f22449i;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        d();
        int i10 = this.f22449i;
        Object[] objArr = this.f22448h;
        if (i10 == objArr.length) {
            this.f22448h = Arrays.copyOf(objArr, ((i10 * 3) / 2) + 1);
        }
        Object[] objArr2 = this.f22448h;
        int i11 = this.f22449i;
        this.f22449i = i11 + 1;
        objArr2[i11] = obj;
        ((AbstractList) this).modCount++;
        return true;
    }
}
