package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

/* JADX INFO: renamed from: com.google.android.gms.internal.mlkit_vision_barcode_bundled.z0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
final class C2219z0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f22445a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f22446b;

    C2219z0(Object obj, int i10) {
        this.f22445a = obj;
        this.f22446b = i10;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C2219z0)) {
            return false;
        }
        C2219z0 c2219z0 = (C2219z0) obj;
        return this.f22445a == c2219z0.f22445a && this.f22446b == c2219z0.f22446b;
    }

    public final int hashCode() {
        return (System.identityHashCode(this.f22445a) * 65535) + this.f22446b;
    }
}
