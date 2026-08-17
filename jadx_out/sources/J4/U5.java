package J4;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
final class U5 extends Q5 {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final transient P5 f5902i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final transient Object[] f5903j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final transient int f5904k;

    U5(P5 p52, Object[] objArr, int i10, int i11) {
        this.f5902i = p52;
        this.f5903j = objArr;
        this.f5904k = i11;
    }

    @Override // J4.M4, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value != null && value.equals(this.f5902i.get(key))) {
                return true;
            }
        }
        return false;
    }

    @Override // J4.M4
    final int d(Object[] objArr, int i10) {
        return r().d(objArr, 0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return r().listIterator(0);
    }

    @Override // J4.Q5
    final N5 s() {
        return new T5(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f5904k;
    }
}
