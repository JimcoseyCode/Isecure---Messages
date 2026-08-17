package I4;

import java.util.Collection;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
class F extends D implements List {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    final /* synthetic */ G f3971l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    F(G g10, Object obj, List list, D d10) {
        super(g10, obj, list, d10);
        this.f3971l = g10;
    }

    @Override // java.util.List
    public final void add(int i10, Object obj) {
        zzb();
        boolean zIsEmpty = this.f3956h.isEmpty();
        ((List) this.f3956h).add(i10, obj);
        this.f3971l.f4108j++;
        if (zIsEmpty) {
            d();
        }
    }

    @Override // java.util.List
    public final boolean addAll(int i10, Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean zAddAll = ((List) this.f3956h).addAll(i10, collection);
        if (!zAddAll) {
            return zAddAll;
        }
        int size2 = this.f3956h.size();
        this.f3971l.f4108j += size2 - size;
        if (size != 0) {
            return zAddAll;
        }
        d();
        return true;
    }

    @Override // java.util.List
    public final Object get(int i10) {
        zzb();
        return ((List) this.f3956h).get(i10);
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        zzb();
        return ((List) this.f3956h).indexOf(obj);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        zzb();
        return ((List) this.f3956h).lastIndexOf(obj);
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        zzb();
        return new E(this);
    }

    @Override // java.util.List
    public final Object remove(int i10) {
        zzb();
        Object objRemove = ((List) this.f3956h).remove(i10);
        G g10 = this.f3971l;
        g10.f4108j--;
        o();
        return objRemove;
    }

    @Override // java.util.List
    public final Object set(int i10, Object obj) {
        zzb();
        return ((List) this.f3956h).set(i10, obj);
    }

    @Override // java.util.List
    public final List subList(int i10, int i11) {
        zzb();
        List listSubList = ((List) this.f3956h).subList(i10, i11);
        D d10 = this.f3957i;
        if (d10 == null) {
            d10 = this;
        }
        return this.f3971l.k(this.f3955g, listSubList, d10);
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i10) {
        zzb();
        return new E(this, i10);
    }
}
