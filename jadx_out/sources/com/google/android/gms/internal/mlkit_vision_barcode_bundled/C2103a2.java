package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import sun.misc.Unsafe;

/* JADX INFO: renamed from: com.google.android.gms.internal.mlkit_vision_barcode_bundled.a2, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
final class C2103a2 extends AbstractC2113c2 {
    C2103a2(Unsafe unsafe) {
        super(unsafe);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.AbstractC2113c2
    public final double a(Object obj, long j10) {
        return Double.longBitsToDouble(this.f22343a.getLong(obj, j10));
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.AbstractC2113c2
    public final float b(Object obj, long j10) {
        return Float.intBitsToFloat(this.f22343a.getInt(obj, j10));
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.AbstractC2113c2
    public final void c(Object obj, long j10, boolean z10) {
        if (AbstractC2118d2.f22356h) {
            AbstractC2118d2.d(obj, j10, z10 ? (byte) 1 : (byte) 0);
        } else {
            AbstractC2118d2.e(obj, j10, z10 ? (byte) 1 : (byte) 0);
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.AbstractC2113c2
    public final void d(Object obj, long j10, byte b10) {
        if (AbstractC2118d2.f22356h) {
            AbstractC2118d2.d(obj, j10, b10);
        } else {
            AbstractC2118d2.e(obj, j10, b10);
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.AbstractC2113c2
    public final void e(Object obj, long j10, double d10) {
        this.f22343a.putLong(obj, j10, Double.doubleToLongBits(d10));
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.AbstractC2113c2
    public final void f(Object obj, long j10, float f10) {
        this.f22343a.putInt(obj, j10, Float.floatToIntBits(f10));
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.AbstractC2113c2
    public final boolean g(Object obj, long j10) {
        return AbstractC2118d2.f22356h ? AbstractC2118d2.y(obj, j10) : AbstractC2118d2.z(obj, j10);
    }
}
