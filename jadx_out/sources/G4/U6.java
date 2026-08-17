package G4;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
final class U6 extends R6 {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final transient Q6 f2615i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final transient Object[] f2616j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final transient int f2617k;

    U6(Q6 q62, Object[] objArr, int i10, int i11) {
        this.f2615i = q62;
        this.f2616j = objArr;
        this.f2617k = i11;
    }

    @Override // G4.M4, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value != null && value.equals(this.f2615i.get(key))) {
                return true;
            }
        }
        return false;
    }

    @Override // G4.M4
    final int d(Object[] objArr, int i10) {
        return r().d(objArr, 0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return r().listIterator(0);
    }

    @Override // G4.R6
    final C6 s() {
        return new T6(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f2617k;
    }
}
