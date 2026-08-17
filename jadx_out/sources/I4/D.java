package I4;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
abstract class D extends AbstractCollection {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final Object f3955g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    Collection f3956h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    final D f3957i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    final Collection f3958j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    final /* synthetic */ G f3959k;

    D(G g10, Object obj, Collection collection, D d10) {
        this.f3959k = g10;
        this.f3955g = obj;
        this.f3956h = collection;
        this.f3957i = d10;
        this.f3958j = d10 == null ? null : d10.f3956h;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean add(Object obj) {
        zzb();
        boolean zIsEmpty = this.f3956h.isEmpty();
        boolean zAdd = this.f3956h.add(obj);
        if (zAdd) {
            this.f3959k.f4108j++;
            if (zIsEmpty) {
                d();
                return true;
            }
        }
        return zAdd;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean addAll(Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean zAddAll = this.f3956h.addAll(collection);
        if (!zAddAll) {
            return zAddAll;
        }
        int size2 = this.f3956h.size();
        this.f3959k.f4108j += size2 - size;
        if (size != 0) {
            return zAddAll;
        }
        d();
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        int size = size();
        if (size == 0) {
            return;
        }
        this.f3956h.clear();
        this.f3959k.f4108j -= size;
        o();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        zzb();
        return this.f3956h.contains(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean containsAll(Collection collection) {
        zzb();
        return this.f3956h.containsAll(collection);
    }

    final void d() {
        D d10 = this.f3957i;
        if (d10 != null) {
            d10.d();
            return;
        }
        G g10 = this.f3959k;
        g10.f4107i.put(this.f3955g, this.f3956h);
    }

    @Override // java.util.Collection
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        zzb();
        return this.f3956h.equals(obj);
    }

    @Override // java.util.Collection
    public final int hashCode() {
        zzb();
        return this.f3956h.hashCode();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        zzb();
        return new C(this);
    }

    final void o() {
        D d10 = this.f3957i;
        if (d10 != null) {
            d10.o();
        } else if (this.f3956h.isEmpty()) {
            G g10 = this.f3959k;
            g10.f4107i.remove(this.f3955g);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean remove(Object obj) {
        zzb();
        boolean zRemove = this.f3956h.remove(obj);
        if (zRemove) {
            G g10 = this.f3959k;
            g10.f4108j--;
            o();
        }
        return zRemove;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean removeAll(Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean zRemoveAll = this.f3956h.removeAll(collection);
        if (zRemoveAll) {
            int size2 = this.f3956h.size();
            this.f3959k.f4108j += size2 - size;
            o();
        }
        return zRemoveAll;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean retainAll(Collection collection) {
        collection.getClass();
        int size = size();
        boolean zRetainAll = this.f3956h.retainAll(collection);
        if (zRetainAll) {
            int size2 = this.f3956h.size();
            this.f3959k.f4108j += size2 - size;
            o();
        }
        return zRetainAll;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        zzb();
        return this.f3956h.size();
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        zzb();
        return this.f3956h.toString();
    }

    final void zzb() {
        D d10 = this.f3957i;
        if (d10 != null) {
            d10.zzb();
            D d11 = this.f3957i;
            if (d11.f3956h != this.f3958j) {
                throw new ConcurrentModificationException();
            }
            return;
        }
        if (this.f3956h.isEmpty()) {
            G g10 = this.f3959k;
            Collection collection = (Collection) g10.f4107i.get(this.f3955g);
            if (collection != null) {
                this.f3956h = collection;
            }
        }
    }
}
