package H4;

import java.util.AbstractMap;
import java.util.Objects;

/* JADX INFO: renamed from: H4.m, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
final class C0791m extends AbstractC0784f {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    final /* synthetic */ C0792n f3779j;

    C0791m(C0792n c0792n) {
        this.f3779j = c0792n;
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i10) {
        U.a(i10, this.f3779j.f3782k, "index");
        int i11 = i10 + i10;
        Object obj = this.f3779j.f3781j[i11];
        Objects.requireNonNull(obj);
        Object obj2 = this.f3779j.f3781j[i11 + 1];
        Objects.requireNonNull(obj2);
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f3779j.f3782k;
    }
}
