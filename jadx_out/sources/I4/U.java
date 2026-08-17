package I4;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
final class U extends AbstractSet {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final /* synthetic */ X f4601g;

    U(X x10) {
        this.f4601g = x10;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.f4601g.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.f4601g.containsKey(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        X x10 = this.f4601g;
        Map mapO = x10.o();
        return mapO != null ? mapO.keySet().iterator() : new M(x10);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        Map mapO = this.f4601g.o();
        return mapO != null ? mapO.keySet().remove(obj) : this.f4601g.B(obj) != X.f4628p;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f4601g.size();
    }
}
