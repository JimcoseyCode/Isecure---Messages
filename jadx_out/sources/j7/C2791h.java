package j7;

import java.util.Collection;
import java.util.Iterator;
import kotlin.jvm.internal.AbstractC2845b;
import kotlin.jvm.internal.AbstractC2849f;
import kotlin.jvm.internal.AbstractC2855l;
import x7.InterfaceC3550a;

/* JADX INFO: renamed from: j7.h, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
final class C2791h implements Collection, InterfaceC3550a {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Object[] f28919g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final boolean f28920h;

    public C2791h(Object[] values, boolean z10) {
        AbstractC2855l.g(values, "values");
        this.f28919g = values;
        this.f28920h = z10;
    }

    @Override // java.util.Collection
    public boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean addAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean contains(Object obj) {
        return AbstractC2798o.B(this.f28919g, obj);
    }

    @Override // java.util.Collection
    public boolean containsAll(Collection elements) {
        AbstractC2855l.g(elements, "elements");
        if (elements.isEmpty()) {
            return true;
        }
        Iterator it = elements.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    public int d() {
        return this.f28919g.length;
    }

    @Override // java.util.Collection
    public boolean isEmpty() {
        return this.f28919g.length == 0;
    }

    @Override // java.util.Collection, java.lang.Iterable
    public Iterator iterator() {
        return AbstractC2845b.a(this.f28919g);
    }

    @Override // java.util.Collection
    public boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final /* bridge */ int size() {
        return d();
    }

    @Override // java.util.Collection
    public Object[] toArray(Object[] array) {
        AbstractC2855l.g(array, "array");
        return AbstractC2849f.b(this, array);
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        return r.b(this.f28919g, this.f28920h);
    }
}
