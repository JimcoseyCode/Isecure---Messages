package I4;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.RandomAccess;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
abstract class G extends I implements Serializable {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final transient Map f4107i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private transient int f4108j;

    protected G(Map map) {
        r.c(map.isEmpty());
        this.f4107i = map;
    }

    static /* bridge */ /* synthetic */ void n(G g10, Object obj) {
        Object objRemove;
        try {
            objRemove = g10.f4107i.remove(obj);
        } catch (ClassCastException | NullPointerException unused) {
            objRemove = null;
        }
        Collection collection = (Collection) objRemove;
        if (collection != null) {
            int size = collection.size();
            collection.clear();
            g10.f4108j -= size;
        }
    }

    @Override // I4.InterfaceC1016t0
    public final boolean a(Object obj, Object obj2) {
        Collection collection = (Collection) this.f4107i.get(obj);
        if (collection != null) {
            if (!collection.add(obj2)) {
                return false;
            }
            this.f4108j++;
            return true;
        }
        Collection collectionG = g();
        if (!collectionG.add(obj2)) {
            throw new AssertionError("New Collection violated the Collection spec");
        }
        this.f4108j++;
        this.f4107i.put(obj, collectionG);
        return true;
    }

    @Override // I4.I
    final Map e() {
        return new C1070y(this, this.f4107i);
    }

    @Override // I4.I
    final Set f() {
        return new A(this, this.f4107i);
    }

    abstract Collection g();

    abstract Collection h(Object obj, Collection collection);

    public final Collection j(Object obj) {
        Collection collectionG = (Collection) this.f4107i.get(obj);
        if (collectionG == null) {
            collectionG = g();
        }
        return h(obj, collectionG);
    }

    final List k(Object obj, List list, D d10) {
        return list instanceof RandomAccess ? new B(this, obj, list, d10) : new F(this, obj, list, d10);
    }

    public final void o() {
        Iterator it = this.f4107i.values().iterator();
        while (it.hasNext()) {
            ((Collection) it.next()).clear();
        }
        this.f4107i.clear();
        this.f4108j = 0;
    }
}
