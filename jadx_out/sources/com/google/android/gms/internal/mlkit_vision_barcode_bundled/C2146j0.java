package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

/* JADX INFO: renamed from: com.google.android.gms.internal.mlkit_vision_barcode_bundled.j0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
final class C2146j0 extends C2166n0 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final int f22364j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final int f22365k;

    C2146j0(byte[] bArr, int i10, int i11) {
        super(bArr);
        AbstractC2171o0.A(i10, i10 + i11, bArr.length);
        this.f22364j = i10;
        this.f22365k = i11;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.C2166n0
    protected final int K() {
        return this.f22364j;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.C2166n0, com.google.android.gms.internal.mlkit_vision_barcode_bundled.AbstractC2171o0
    public final byte d(int i10) {
        AbstractC2171o0.G(i10, this.f22365k);
        return this.f22403i[this.f22364j + i10];
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.C2166n0, com.google.android.gms.internal.mlkit_vision_barcode_bundled.AbstractC2171o0
    final byte o(int i10) {
        return this.f22403i[this.f22364j + i10];
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.C2166n0, com.google.android.gms.internal.mlkit_vision_barcode_bundled.AbstractC2171o0
    public final int q() {
        return this.f22365k;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.C2166n0, com.google.android.gms.internal.mlkit_vision_barcode_bundled.AbstractC2171o0
    protected final void r(byte[] bArr, int i10, int i11, int i12) {
        System.arraycopy(this.f22403i, this.f22364j + i10, bArr, i11, i12);
    }
}
