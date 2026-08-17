package I4;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: I4.x0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
final class C1060x0 extends AbstractC0918k0 {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final transient AbstractC0907j0 f4938i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final transient Object[] f4939j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final transient int f4940k = 1;

    C1060x0(AbstractC0907j0 abstractC0907j0, Object[] objArr, int i10, int i11) {
        this.f4938i = abstractC0907j0;
        this.f4939j = objArr;
    }

    @Override // I4.AbstractC0830c0, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value != null && value.equals(this.f4938i.get(key))) {
                return true;
            }
        }
        return false;
    }

    @Override // I4.AbstractC0830c0
    final int d(Object[] objArr, int i10) {
        return r().d(objArr, i10);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return r().listIterator(0);
    }

    @Override // I4.AbstractC0918k0
    final AbstractC0885h0 s() {
        return new C1049w0(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f4940k;
    }
}
