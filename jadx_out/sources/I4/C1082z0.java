package I4;

import java.util.Objects;

/* JADX INFO: renamed from: I4.z0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
final class C1082z0 extends AbstractC0885h0 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final transient Object[] f4989j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final transient int f4990k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final transient int f4991l = 1;

    C1082z0(Object[] objArr, int i10, int i11) {
        this.f4989j = objArr;
        this.f4990k = i10;
    }

    @Override // java.util.List
    public final Object get(int i10) {
        r.a(i10, this.f4991l, "index");
        Object obj = this.f4989j[i10 + i10 + this.f4990k];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f4991l;
    }
}
