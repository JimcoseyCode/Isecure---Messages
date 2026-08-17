package I4;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: I4.x, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
final class C1059x implements Iterator {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final Iterator f4935g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    Collection f4936h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    final /* synthetic */ C1070y f4937i;

    C1059x(C1070y c1070y) {
        this.f4937i = c1070y;
        this.f4935g = c1070y.f4971i.entrySet().iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f4935g.hasNext();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        Map.Entry entry = (Map.Entry) this.f4935g.next();
        this.f4936h = (Collection) entry.getValue();
        Object key = entry.getKey();
        return new C0841d0(key, this.f4937i.f4972j.h(key, (Collection) entry.getValue()));
    }

    @Override // java.util.Iterator
    public final void remove() {
        r.e(this.f4936h != null, "no calls to next() since the last call to remove()");
        this.f4935g.remove();
        this.f4937i.f4972j.f4108j -= this.f4936h.size();
        this.f4936h.clear();
        this.f4936h = null;
    }
}
