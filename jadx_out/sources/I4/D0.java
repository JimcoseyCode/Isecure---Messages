package I4;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
abstract class D0 implements Iterator {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final Iterator f3960g;

    D0(Iterator it) {
        it.getClass();
        this.f3960g = it;
    }

    abstract Object b(Object obj);

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f3960g.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        return b(this.f3960g.next());
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.f3960g.remove();
    }
}
