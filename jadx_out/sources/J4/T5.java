package J4;

import java.util.AbstractMap;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
final class T5 extends N5 {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    final /* synthetic */ U5 f5892i;

    T5(U5 u52) {
        this.f5892i = u52;
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i10) {
        G1.a(i10, this.f5892i.f5904k, "index");
        U5 u52 = this.f5892i;
        int i11 = i10 + i10;
        Object obj = u52.f5903j[i11];
        obj.getClass();
        Object obj2 = u52.f5903j[i11 + 1];
        obj2.getClass();
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f5892i.f5904k;
    }
}
