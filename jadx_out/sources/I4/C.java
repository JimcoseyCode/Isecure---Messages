package I4;

import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
class C implements Iterator {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final Iterator f3947g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    final Collection f3948h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    final /* synthetic */ D f3949i;

    C(D d10, Iterator it) {
        this.f3949i = d10;
        this.f3948h = d10.f3956h;
        this.f3947g = it;
    }

    final void b() {
        this.f3949i.zzb();
        if (this.f3949i.f3956h != this.f3948h) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        b();
        return this.f3947g.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        b();
        return this.f3947g.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.f3947g.remove();
        G g10 = this.f3949i.f3959k;
        g10.f4108j--;
        this.f3949i.o();
    }

    C(D d10) {
        this.f3949i = d10;
        Collection collection = d10.f3956h;
        this.f3948h = collection;
        this.f3947g = collection instanceof List ? ((List) collection).listIterator() : collection.iterator();
    }
}
