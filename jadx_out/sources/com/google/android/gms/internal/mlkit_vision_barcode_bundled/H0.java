package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import com.facebook.react.uimanager.ViewDefaults;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
final class H0 extends AbstractC2106b0 implements RandomAccess, U0 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final H0 f21729j = new H0(new float[0], 0, false);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private float[] f21730h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f21731i;

    private H0(float[] fArr, int i10, boolean z10) {
        super(z10);
        this.f21730h = fArr;
        this.f21731i = i10;
    }

    public static H0 p() {
        return f21729j;
    }

    private final String q(int i10) {
        return "Index:" + i10 + ", Size:" + this.f21731i;
    }

    private final void r(int i10) {
        if (i10 < 0 || i10 >= this.f21731i) {
            throw new IndexOutOfBoundsException(q(i10));
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i10, Object obj) {
        int i11;
        float fFloatValue = ((Float) obj).floatValue();
        d();
        if (i10 < 0 || i10 > (i11 = this.f21731i)) {
            throw new IndexOutOfBoundsException(q(i10));
        }
        int i12 = i10 + 1;
        float[] fArr = this.f21730h;
        if (i11 < fArr.length) {
            System.arraycopy(fArr, i10, fArr, i12, i11 - i10);
        } else {
            float[] fArr2 = new float[((i11 * 3) / 2) + 1];
            System.arraycopy(fArr, 0, fArr2, 0, i10);
            System.arraycopy(this.f21730h, i10, fArr2, i12, this.f21731i - i10);
            this.f21730h = fArr2;
        }
        this.f21730h[i10] = fFloatValue;
        this.f21731i++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.AbstractC2106b0, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        d();
        byte[] bArr = X0.f22317b;
        collection.getClass();
        if (!(collection instanceof H0)) {
            return super.addAll(collection);
        }
        H0 h02 = (H0) collection;
        int i10 = h02.f21731i;
        if (i10 == 0) {
            return false;
        }
        int i11 = this.f21731i;
        if (ViewDefaults.NUMBER_OF_LINES - i11 < i10) {
            throw new OutOfMemoryError();
        }
        int i12 = i11 + i10;
        float[] fArr = this.f21730h;
        if (i12 > fArr.length) {
            this.f21730h = Arrays.copyOf(fArr, i12);
        }
        System.arraycopy(h02.f21730h, 0, this.f21730h, this.f21731i, h02.f21731i);
        this.f21731i = i12;
        ((AbstractList) this).modCount++;
        return true;
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
        if (!(obj instanceof H0)) {
            return super.equals(obj);
        }
        H0 h02 = (H0) obj;
        if (this.f21731i != h02.f21731i) {
            return false;
        }
        float[] fArr = h02.f21730h;
        for (int i10 = 0; i10 < this.f21731i; i10++) {
            if (Float.floatToIntBits(this.f21730h[i10]) != Float.floatToIntBits(fArr[i10])) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i10) {
        r(i10);
        return Float.valueOf(this.f21730h[i10]);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.AbstractC2106b0, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int iFloatToIntBits = 1;
        for (int i10 = 0; i10 < this.f21731i; i10++) {
            iFloatToIntBits = (iFloatToIntBits * 31) + Float.floatToIntBits(this.f21730h[i10]);
        }
        return iFloatToIntBits;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Float)) {
            return -1;
        }
        float fFloatValue = ((Float) obj).floatValue();
        int i10 = this.f21731i;
        for (int i11 = 0; i11 < i10; i11++) {
            if (this.f21730h[i11] == fFloatValue) {
                return i11;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.W0
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public final U0 c(int i10) {
        if (i10 >= this.f21731i) {
            return new H0(Arrays.copyOf(this.f21730h, i10), this.f21731i, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.U0
    public final void m(float f10) {
        d();
        int i10 = this.f21731i;
        float[] fArr = this.f21730h;
        if (i10 == fArr.length) {
            float[] fArr2 = new float[((i10 * 3) / 2) + 1];
            System.arraycopy(fArr, 0, fArr2, 0, i10);
            this.f21730h = fArr2;
        }
        float[] fArr3 = this.f21730h;
        int i11 = this.f21731i;
        this.f21731i = i11 + 1;
        fArr3[i11] = f10;
    }

    public final float o(int i10) {
        r(i10);
        return this.f21730h[i10];
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.AbstractC2106b0, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i10) {
        d();
        r(i10);
        float[] fArr = this.f21730h;
        float f10 = fArr[i10];
        if (i10 < this.f21731i - 1) {
            System.arraycopy(fArr, i10 + 1, fArr, i10, (r2 - i10) - 1);
        }
        this.f21731i--;
        ((AbstractList) this).modCount++;
        return Float.valueOf(f10);
    }

    @Override // java.util.AbstractList
    protected final void removeRange(int i10, int i11) {
        d();
        if (i11 < i10) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        float[] fArr = this.f21730h;
        System.arraycopy(fArr, i11, fArr, i10, this.f21731i - i11);
        this.f21731i -= i11 - i10;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i10, Object obj) {
        float fFloatValue = ((Float) obj).floatValue();
        d();
        r(i10);
        float[] fArr = this.f21730h;
        float f10 = fArr[i10];
        fArr[i10] = fFloatValue;
        return Float.valueOf(f10);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f21731i;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        m(((Float) obj).floatValue());
        return true;
    }
}
