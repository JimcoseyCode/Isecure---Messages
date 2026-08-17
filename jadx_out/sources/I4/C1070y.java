package I4;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: I4.y, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
final class C1070y extends AbstractC0994r0 {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    final transient Map f4971i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    final /* synthetic */ G f4972j;

    C1070y(G g10, Map map) {
        this.f4972j = g10;
        this.f4971i = map;
    }

    @Override // I4.AbstractC0994r0
    protected final Set a() {
        return new C1048w(this);
    }

    @Override // java.util.AbstractMap, java.util.Map
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final Collection get(Object obj) {
        Collection collection = (Collection) AbstractC1005s0.a(this.f4971i, obj);
        if (collection == null) {
            return null;
        }
        return this.f4972j.h(obj, collection);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        G g10 = this.f4972j;
        if (this.f4971i == g10.f4107i) {
            g10.o();
        } else {
            AbstractC0929l0.a(new C1059x(this));
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        return AbstractC1005s0.b(this.f4971i, obj);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        return this == obj || this.f4971i.equals(obj);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        return this.f4971i.hashCode();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set keySet() {
        return this.f4972j.c();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final /* bridge */ /* synthetic */ Object remove(Object obj) {
        Collection collection = (Collection) this.f4971i.remove(obj);
        if (collection == null) {
            return null;
        }
        Collection collectionG = this.f4972j.g();
        collectionG.addAll(collection);
        this.f4972j.f4108j -= collection.size();
        collection.clear();
        return collectionG;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.f4971i.size();
    }

    @Override // java.util.AbstractMap
    public final String toString() {
        return this.f4971i.toString();
    }
}
