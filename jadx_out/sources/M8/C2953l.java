package m8;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: m8.l, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
class C2953l implements Iterator {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Iterator f29697g;

    public C2953l(Iterator it) {
        this.f29697g = it;
    }

    @Override // java.util.Iterator
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public Map.Entry next() {
        Map.Entry entry = (Map.Entry) this.f29697g.next();
        entry.getValue();
        return entry;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f29697g.hasNext();
    }

    @Override // java.util.Iterator
    public void remove() {
        this.f29697g.remove();
    }
}
