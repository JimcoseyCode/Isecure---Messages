package com.swmansion.rnscreens.utils;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f25393a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f25394b;

    public b(int i10, boolean z10) {
        this.f25393a = i10;
        this.f25394b = z10;
    }

    public final int a() {
        return this.f25393a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f25393a == bVar.f25393a && this.f25394b == bVar.f25394b;
    }

    public int hashCode() {
        return (Integer.hashCode(this.f25393a) * 31) + Boolean.hashCode(this.f25394b);
    }

    public String toString() {
        return "CacheKey(fontSize=" + this.f25393a + ", isTitleEmpty=" + this.f25394b + ")";
    }
}
