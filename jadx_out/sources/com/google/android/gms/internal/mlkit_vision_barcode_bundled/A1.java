package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
final class A1 implements InterfaceC2172o1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC2186r1 f21656a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f21657b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Object[] f21658c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f21659d;

    A1(InterfaceC2186r1 interfaceC2186r1, String str, Object[] objArr) {
        this.f21656a = interfaceC2186r1;
        this.f21657b = str;
        this.f21658c = objArr;
        char cCharAt = str.charAt(0);
        if (cCharAt < 55296) {
            this.f21659d = cCharAt;
            return;
        }
        int i10 = cCharAt & 8191;
        int i11 = 1;
        int i12 = 13;
        while (true) {
            int i13 = i11 + 1;
            char cCharAt2 = str.charAt(i11);
            if (cCharAt2 < 55296) {
                this.f21659d = i10 | (cCharAt2 << i12);
                return;
            } else {
                i10 |= (cCharAt2 & 8191) << i12;
                i12 += 13;
                i11 = i13;
            }
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.InterfaceC2172o1
    public final int a() {
        int i10 = this.f21659d;
        if ((i10 & 1) != 0) {
            return 1;
        }
        return (i10 & 4) == 4 ? 3 : 2;
    }

    final String b() {
        return this.f21657b;
    }

    final Object[] c() {
        return this.f21658c;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.InterfaceC2172o1
    public final InterfaceC2186r1 zza() {
        return this.f21656a;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.InterfaceC2172o1
    public final boolean zzb() {
        return (this.f21659d & 2) == 2;
    }
}
