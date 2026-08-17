package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import java.nio.charset.Charset;

/* JADX INFO: renamed from: com.google.android.gms.internal.mlkit_vision_barcode_bundled.n0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
class C2166n0 extends AbstractC2161m0 {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    protected final byte[] f22403i;

    C2166n0(byte[] bArr) {
        super(null);
        bArr.getClass();
        this.f22403i = bArr;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.AbstractC2161m0
    final boolean J(AbstractC2171o0 abstractC2171o0, int i10, int i11) {
        if (i11 > abstractC2171o0.q()) {
            throw new IllegalArgumentException("Length too large: " + i11 + q());
        }
        int i12 = i10 + i11;
        if (i12 > abstractC2171o0.q()) {
            throw new IllegalArgumentException("Ran off end of other: " + i10 + ", " + i11 + ", " + abstractC2171o0.q());
        }
        if (!(abstractC2171o0 instanceof C2166n0)) {
            return abstractC2171o0.w(i10, i12).equals(w(0, i11));
        }
        C2166n0 c2166n0 = (C2166n0) abstractC2171o0;
        byte[] bArr = this.f22403i;
        byte[] bArr2 = c2166n0.f22403i;
        int iK = K() + i11;
        int iK2 = K();
        int iK3 = c2166n0.K() + i10;
        while (iK2 < iK) {
            if (bArr[iK2] != bArr2[iK3]) {
                return false;
            }
            iK2++;
            iK3++;
        }
        return true;
    }

    protected int K() {
        return 0;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.AbstractC2171o0
    public byte d(int i10) {
        return this.f22403i[i10];
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.AbstractC2171o0
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC2171o0) || q() != ((AbstractC2171o0) obj).q()) {
            return false;
        }
        if (q() == 0) {
            return true;
        }
        if (!(obj instanceof C2166n0)) {
            return obj.equals(this);
        }
        C2166n0 c2166n0 = (C2166n0) obj;
        int iB = B();
        int iB2 = c2166n0.B();
        if (iB == 0 || iB2 == 0 || iB == iB2) {
            return J(c2166n0, 0, q());
        }
        return false;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.AbstractC2171o0
    byte o(int i10) {
        return this.f22403i[i10];
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.AbstractC2171o0
    public int q() {
        return this.f22403i.length;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.AbstractC2171o0
    protected void r(byte[] bArr, int i10, int i11, int i12) {
        System.arraycopy(this.f22403i, i10, bArr, i11, i12);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.AbstractC2171o0
    protected final int u(int i10, int i11, int i12) {
        return X0.b(i10, this.f22403i, K() + i11, i12);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.AbstractC2171o0
    protected final int v(int i10, int i11, int i12) {
        int iK = K() + i11;
        return AbstractC2148j2.f(i10, this.f22403i, iK, i12 + iK);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.AbstractC2171o0
    public final AbstractC2171o0 w(int i10, int i11) {
        int iA = AbstractC2171o0.A(i10, i11, q());
        return iA == 0 ? AbstractC2171o0.f22405h : new C2146j0(this.f22403i, K() + i10, iA);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.AbstractC2171o0
    protected final String x(Charset charset) {
        return new String(this.f22403i, K(), q(), charset);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.AbstractC2171o0
    final void y(AbstractC2126f0 abstractC2126f0) {
        ((C2195t0) abstractC2126f0).D(this.f22403i, K(), q());
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.AbstractC2171o0
    public final boolean z() {
        int iK = K();
        return AbstractC2148j2.g(this.f22403i, iK, q() + iK);
    }
}
