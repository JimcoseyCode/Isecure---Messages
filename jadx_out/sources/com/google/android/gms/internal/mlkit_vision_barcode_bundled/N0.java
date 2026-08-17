package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
final class N0 implements E0 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final int f22288g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    final EnumC2153k2 f22289h;

    N0(S0 s02, int i10, EnumC2153k2 enumC2153k2, boolean z10, boolean z11) {
        this.f22288g = i10;
        this.f22289h = enumC2153k2;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.E0
    public final EnumC2153k2 b() {
        return this.f22289h;
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(Object obj) {
        return this.f22288g - ((N0) obj).f22288g;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.E0
    public final boolean e() {
        return false;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.E0
    public final EnumC2158l2 f() {
        return this.f22289h.h();
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.E0
    public final boolean l() {
        return false;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.E0
    public final InterfaceC2182q1 n(InterfaceC2182q1 interfaceC2182q1, InterfaceC2186r1 interfaceC2186r1) {
        K0 k02 = (K0) interfaceC2182q1;
        k02.j((P0) interfaceC2186r1);
        return k02;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.E0
    public final int zza() {
        return this.f22288g;
    }
}
