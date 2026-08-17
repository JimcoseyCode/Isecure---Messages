package G4;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
final class V6 extends R6 {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final transient Q6 f2631i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final transient C6 f2632j;

    V6(Q6 q62, C6 c62) {
        this.f2631i = q62;
        this.f2632j = c62;
    }

    @Override // G4.M4, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return this.f2631i.get(obj) != null;
    }

    @Override // G4.M4
    final int d(Object[] objArr, int i10) {
        return this.f2632j.d(objArr, 0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return this.f2632j.listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f2631i.size();
    }
}
