package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

/* JADX INFO: renamed from: com.google.android.gms.internal.mlkit_vision_barcode_bundled.k1, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
final class C2152k1 implements K1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final InterfaceC2177p1 f22369b = new C2142i1();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC2177p1 f22370a;

    public C2152k1() {
        J0 j0C = J0.c();
        int i10 = C2216y1.f22442d;
        C2147j1 c2147j1 = new C2147j1(j0C, f22369b);
        byte[] bArr = X0.f22317b;
        this.f22370a = c2147j1;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.K1
    public final J1 a(Class cls) {
        int i10 = L1.f22285b;
        if (!P0.class.isAssignableFrom(cls)) {
            int i11 = C2216y1.f22442d;
        }
        InterfaceC2172o1 interfaceC2172o1A = this.f22370a.a(cls);
        if (interfaceC2172o1A.zzb()) {
            int i12 = C2216y1.f22442d;
            return C2204v1.j(L1.r(), D0.a(), interfaceC2172o1A.zza());
        }
        int i13 = C2216y1.f22442d;
        return C2200u1.A(cls, interfaceC2172o1A, AbstractC2212x1.a(), AbstractC2137h1.a(), L1.r(), interfaceC2172o1A.a() + (-1) != 1 ? D0.a() : null, AbstractC2167n1.a());
    }
}
