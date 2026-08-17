package I4;

import java.util.Iterator;

/* JADX INFO: renamed from: I4.y0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
final class C1071y0 extends AbstractC0918k0 {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final transient AbstractC0907j0 f4973i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final transient AbstractC0885h0 f4974j;

    C1071y0(AbstractC0907j0 abstractC0907j0, AbstractC0885h0 abstractC0885h0) {
        this.f4973i = abstractC0907j0;
        this.f4974j = abstractC0885h0;
    }

    @Override // I4.AbstractC0830c0, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return this.f4973i.get(obj) != null;
    }

    @Override // I4.AbstractC0830c0
    final int d(Object[] objArr, int i10) {
        return this.f4974j.d(objArr, i10);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return this.f4974j.listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return 1;
    }
}
