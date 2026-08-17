package com.google.android.libraries.barhopper;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public final class MultiScaleDecodingOptions {
    private float[] extraScales = new float[0];
    private int minimumDetectedDimension = 10;
    private boolean skipProcessingIfBarcodeFound = true;

    public void a(float[] fArr) {
        this.extraScales = fArr;
    }

    public void b(int i10) {
        this.minimumDetectedDimension = i10;
    }

    public void c(boolean z10) {
        this.skipProcessingIfBarcodeFound = z10;
    }
}
