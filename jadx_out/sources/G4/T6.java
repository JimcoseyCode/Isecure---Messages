package G4;

import java.util.AbstractMap;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
final class T6 extends C6 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    final /* synthetic */ U6 f2596j;

    T6(U6 u62) {
        this.f2596j = u62;
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i10) {
        G1.a(i10, this.f2596j.f2617k, "index");
        U6 u62 = this.f2596j;
        int i11 = i10 + i10;
        Object obj = u62.f2616j[i11];
        obj.getClass();
        Object obj2 = u62.f2616j[i11 + 1];
        obj2.getClass();
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f2596j.f2617k;
    }
}
