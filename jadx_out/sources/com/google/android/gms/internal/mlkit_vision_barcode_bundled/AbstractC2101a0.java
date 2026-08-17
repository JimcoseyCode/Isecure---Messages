package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import java.io.IOException;

/* JADX INFO: renamed from: com.google.android.gms.internal.mlkit_vision_barcode_bundled.a0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2101a0 implements InterfaceC2186r1 {
    protected int zza = 0;

    abstract int d(J1 j12);

    public final byte[] h() {
        try {
            int iA = a();
            byte[] bArr = new byte[iA];
            C2195t0 c2195t0 = new C2195t0(bArr, 0, iA);
            b(c2195t0);
            c2195t0.c();
            return bArr;
        } catch (IOException e10) {
            throw new RuntimeException("Serializing " + getClass().getName() + " to a byte array threw an IOException (should never happen).", e10);
        }
    }
}
