package H4;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: H4.n, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
final class C0792n extends AbstractC0788j {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final transient AbstractC0787i f3780i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final transient Object[] f3781j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final transient int f3782k;

    C0792n(AbstractC0787i abstractC0787i, Object[] objArr, int i10, int i11) {
        this.f3780i = abstractC0787i;
        this.f3781j = objArr;
        this.f3782k = i11;
    }

    @Override // H4.AbstractC0781c, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value != null && value.equals(this.f3780i.get(key))) {
                return true;
            }
        }
        return false;
    }

    @Override // H4.AbstractC0781c
    final int d(Object[] objArr, int i10) {
        return r().d(objArr, 0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return r().listIterator(0);
    }

    @Override // H4.AbstractC0788j
    final AbstractC0784f s() {
        return new C0791m(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f3782k;
    }
}
