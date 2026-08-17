package I4;

import java.util.AbstractMap;
import java.util.Objects;

/* JADX INFO: renamed from: I4.w0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
final class C1049w0 extends AbstractC0885h0 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    final /* synthetic */ C1060x0 f4930j;

    C1049w0(C1060x0 c1060x0) {
        this.f4930j = c1060x0;
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i10) {
        r.a(i10, this.f4930j.f4940k, "index");
        int i11 = i10 + i10;
        Object obj = this.f4930j.f4939j[i11];
        Objects.requireNonNull(obj);
        Object obj2 = this.f4930j.f4939j[i11 + 1];
        Objects.requireNonNull(obj2);
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f4930j.f4940k;
    }
}
