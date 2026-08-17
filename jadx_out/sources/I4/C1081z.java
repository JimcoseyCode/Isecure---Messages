package I4;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: I4.z, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
final class C1081z implements Iterator {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    Map.Entry f4986g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    final /* synthetic */ Iterator f4987h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    final /* synthetic */ A f4988i;

    C1081z(A a10, Iterator it) {
        this.f4987h = it;
        this.f4988i = a10;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f4987h.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        Map.Entry entry = (Map.Entry) this.f4987h.next();
        this.f4986g = entry;
        return entry.getKey();
    }

    @Override // java.util.Iterator
    public final void remove() {
        r.e(this.f4986g != null, "no calls to next() since the last call to remove()");
        Collection collection = (Collection) this.f4986g.getValue();
        this.f4987h.remove();
        this.f4988i.f3929h.f4108j -= collection.size();
        collection.clear();
        this.f4986g = null;
    }
}
