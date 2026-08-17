package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import java.util.NoSuchElementException;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
final class B1 extends AbstractC2136h0 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final G1 f21661g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    InterfaceC2151k0 f21662h = b();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    final /* synthetic */ I1 f21663i;

    B1(I1 i12) {
        this.f21663i = i12;
        this.f21661g = new G1(i12, null);
    }

    private final InterfaceC2151k0 b() {
        G1 g12 = this.f21661g;
        if (g12.hasNext()) {
            return g12.next().iterator();
        }
        return null;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f21662h != null;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.InterfaceC2151k0
    public final byte zza() {
        InterfaceC2151k0 interfaceC2151k0 = this.f21662h;
        if (interfaceC2151k0 == null) {
            throw new NoSuchElementException();
        }
        byte bZza = interfaceC2151k0.zza();
        if (!this.f21662h.hasNext()) {
            this.f21662h = b();
        }
        return bZza;
    }
}
