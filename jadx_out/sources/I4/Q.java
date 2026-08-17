package I4;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
final class Q extends AbstractSet {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final /* synthetic */ X f4567g;

    Q(X x10) {
        this.f4567g = x10;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.f4567g.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        Map mapO = this.f4567g.o();
        if (mapO != null) {
            return mapO.entrySet().contains(obj);
        }
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            int iZ = this.f4567g.z(entry.getKey());
            if (iZ != -1 && AbstractC0972p.a(X.m(this.f4567g, iZ), entry.getValue())) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        X x10 = this.f4567g;
        Map mapO = x10.o();
        return mapO != null ? mapO.entrySet().iterator() : new O(x10);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        Map mapO = this.f4567g.o();
        if (mapO != null) {
            return mapO.entrySet().remove(obj);
        }
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        X x10 = this.f4567g;
        if (x10.u()) {
            return false;
        }
        int iY = x10.y();
        Object key = entry.getKey();
        Object value = entry.getValue();
        X x11 = this.f4567g;
        int iB = Y.b(key, value, iY, X.l(x11), x11.a(), x11.b(), x11.c());
        if (iB == -1) {
            return false;
        }
        this.f4567g.t(iB, iY);
        X x12 = this.f4567g;
        x12.f4634l--;
        this.f4567g.r();
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f4567g.size();
    }
}
