package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public final class V1 extends RuntimeException {
    public V1(InterfaceC2186r1 interfaceC2186r1) {
        super("Message was missing required fields.  (Lite runtime could not determine which fields were missing).");
    }

    public final Z0 a() {
        return new Z0(getMessage());
    }
}
