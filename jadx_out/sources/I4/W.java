package I4;

import java.util.AbstractCollection;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
final class W extends AbstractCollection {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final /* synthetic */ X f4623g;

    W(X x10) {
        this.f4623g = x10;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        this.f4623g.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        X x10 = this.f4623g;
        Map mapO = x10.o();
        return mapO != null ? mapO.values().iterator() : new P(x10);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        return this.f4623g.size();
    }
}
