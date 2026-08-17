package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
final class N1 implements Map.Entry, Comparable {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Comparable f22290g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private Object f22291h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    final /* synthetic */ T1 f22292i;

    N1(T1 t12, Comparable comparable, Object obj) {
        this.f22292i = t12;
        this.f22290g = comparable;
        this.f22291h = obj;
    }

    private static final boolean j(Object obj, Object obj2) {
        return obj == null ? obj2 == null : obj.equals(obj2);
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return this.f22290g.compareTo(((N1) obj).f22290g);
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        return j(this.f22290g, entry.getKey()) && j(this.f22291h, entry.getValue());
    }

    @Override // java.util.Map.Entry
    public final /* synthetic */ Object getKey() {
        return this.f22290g;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f22291h;
    }

    public final Comparable h() {
        return this.f22290g;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Comparable comparable = this.f22290g;
        int iHashCode = comparable == null ? 0 : comparable.hashCode();
        Object obj = this.f22291h;
        return iHashCode ^ (obj != null ? obj.hashCode() : 0);
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        this.f22292i.o();
        Object obj2 = this.f22291h;
        this.f22291h = obj;
        return obj2;
    }

    public final String toString() {
        return String.valueOf(this.f22290g) + "=" + String.valueOf(this.f22291h);
    }
}
