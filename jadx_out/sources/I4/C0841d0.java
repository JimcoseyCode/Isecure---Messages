package I4;

import java.io.Serializable;

/* JADX INFO: renamed from: I4.d0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
final class C0841d0 extends H implements Serializable {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final Object f4725g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    final Object f4726h;

    C0841d0(Object obj, Object obj2) {
        this.f4725g = obj;
        this.f4726h = obj2;
    }

    @Override // I4.H, java.util.Map.Entry
    public final Object getKey() {
        return this.f4725g;
    }

    @Override // I4.H, java.util.Map.Entry
    public final Object getValue() {
        return this.f4726h;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException();
    }
}
