package I4;

import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: renamed from: I4.w, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
final class C1048w extends AbstractC0962o0 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final /* synthetic */ C1070y f4929g;

    C1048w(C1070y c1070y) {
        this.f4929g = c1070y;
    }

    @Override // I4.AbstractC0962o0, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        Set setEntrySet = this.f4929g.f4971i.entrySet();
        setEntrySet.getClass();
        try {
            return setEntrySet.contains(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    @Override // I4.AbstractC0962o0
    final Map d() {
        return this.f4929g;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new C1059x(this.f4929g);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        if (!contains(obj)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        Objects.requireNonNull(entry);
        C1070y c1070y = this.f4929g;
        G.n(c1070y.f4972j, entry.getKey());
        return true;
    }
}
