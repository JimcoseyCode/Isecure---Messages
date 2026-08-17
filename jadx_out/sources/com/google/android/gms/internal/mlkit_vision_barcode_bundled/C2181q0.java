package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import com.facebook.react.uimanager.ViewDefaults;

/* JADX INFO: renamed from: com.google.android.gms.internal.mlkit_vision_barcode_bundled.q0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
final class C2181q0 extends AbstractC2190s0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f22407b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f22408c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f22409d;

    /* synthetic */ C2181q0(byte[] bArr, int i10, int i11, boolean z10, AbstractC2176p0 abstractC2176p0) {
        super(null);
        this.f22409d = ViewDefaults.NUMBER_OF_LINES;
        this.f22407b = 0;
    }

    public final int c(int i10) {
        int i11 = this.f22409d;
        this.f22409d = 0;
        int i12 = this.f22407b + this.f22408c;
        this.f22407b = i12;
        if (i12 <= 0) {
            this.f22408c = 0;
            return i11;
        }
        this.f22408c = i12;
        this.f22407b = 0;
        return i11;
    }
}
