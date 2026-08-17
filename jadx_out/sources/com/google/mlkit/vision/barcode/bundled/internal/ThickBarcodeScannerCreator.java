package com.google.mlkit.vision.barcode.bundled.internal;

import B4.b;
import android.content.Context;
import com.google.android.gms.common.util.DynamiteApi;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.B;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.InterfaceC2218z;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzba;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
@DynamiteApi
public class ThickBarcodeScannerCreator extends B {
    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.C
    public InterfaceC2218z newBarcodeScanner(B4.a aVar, zzba zzbaVar) {
        return new a((Context) b.f(aVar), zzbaVar);
    }
}
