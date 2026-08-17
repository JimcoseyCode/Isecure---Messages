package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import java.util.NoSuchElementException;

/* JADX INFO: renamed from: com.google.android.gms.internal.mlkit_vision_barcode_bundled.g0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
final class C2131g0 extends AbstractC2136h0 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f22359g = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final int f22360h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    final /* synthetic */ AbstractC2171o0 f22361i;

    C2131g0(AbstractC2171o0 abstractC2171o0) {
        this.f22361i = abstractC2171o0;
        this.f22360h = abstractC2171o0.q();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f22359g < this.f22360h;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.InterfaceC2151k0
    public final byte zza() {
        int i10 = this.f22359g;
        if (i10 >= this.f22360h) {
            throw new NoSuchElementException();
        }
        this.f22359g = i10 + 1;
        return this.f22361i.o(i10);
    }
}
