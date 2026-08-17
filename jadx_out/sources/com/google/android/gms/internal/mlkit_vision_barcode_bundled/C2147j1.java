package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

/* JADX INFO: renamed from: com.google.android.gms.internal.mlkit_vision_barcode_bundled.j1, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
final class C2147j1 implements InterfaceC2177p1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC2177p1[] f22366a;

    C2147j1(InterfaceC2177p1... interfaceC2177p1Arr) {
        this.f22366a = interfaceC2177p1Arr;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.InterfaceC2177p1
    public final InterfaceC2172o1 a(Class cls) {
        for (int i10 = 0; i10 < 2; i10++) {
            InterfaceC2177p1 interfaceC2177p1 = this.f22366a[i10];
            if (interfaceC2177p1.b(cls)) {
                return interfaceC2177p1.a(cls);
            }
        }
        throw new UnsupportedOperationException("No factory is available for message type: ".concat(cls.getName()));
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.InterfaceC2177p1
    public final boolean b(Class cls) {
        for (int i10 = 0; i10 < 2; i10++) {
            if (this.f22366a[i10].b(cls)) {
                return true;
            }
        }
        return false;
    }
}
