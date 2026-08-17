package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
final class J0 implements InterfaceC2177p1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final J0 f21738a = new J0();

    private J0() {
    }

    public static J0 c() {
        return f21738a;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.InterfaceC2177p1
    public final InterfaceC2172o1 a(Class cls) {
        if (!P0.class.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Unsupported message type: ".concat(cls.getName()));
        }
        try {
            return (InterfaceC2172o1) P0.m(cls.asSubclass(P0.class)).E(3, null, null);
        } catch (Exception e10) {
            throw new RuntimeException("Unable to get message info for ".concat(cls.getName()), e10);
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.InterfaceC2177p1
    public final boolean b(Class cls) {
        return P0.class.isAssignableFrom(cls);
    }
}
