package j7;

import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.jvm.internal.AbstractC2855l;
import x7.InterfaceC3550a;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
final class Q extends AbstractC2789f {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final List f28903g;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class a implements ListIterator, InterfaceC3550a {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final ListIterator f28904g;

        a(int i10) {
            this.f28904g = Q.this.f28903g.listIterator(y.R(Q.this, i10));
        }

        @Override // java.util.ListIterator
        public void add(Object obj) {
            this.f28904g.add(obj);
            this.f28904g.previous();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public boolean hasNext() {
            return this.f28904g.hasPrevious();
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
            return this.f28904g.hasNext();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public Object next() {
            return this.f28904g.previous();
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
            return y.Q(Q.this, this.f28904g.previousIndex());
        }

        @Override // java.util.ListIterator
        public Object previous() {
            return this.f28904g.next();
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
            return y.Q(Q.this, this.f28904g.nextIndex());
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public void remove() {
            this.f28904g.remove();
        }

        @Override // java.util.ListIterator
        public void set(Object obj) {
            this.f28904g.set(obj);
        }
    }

    public Q(List delegate) {
        AbstractC2855l.g(delegate, "delegate");
        this.f28903g = delegate;
    }

    @Override // java.util.AbstractList, java.util.List
    public void add(int i10, Object obj) {
        this.f28903g.add(y.R(this, i10), obj);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        this.f28903g.clear();
    }

    @Override // j7.AbstractC2789f
    public int d() {
        return this.f28903g.size();
    }

    @Override // java.util.AbstractList, java.util.List
    public Object get(int i10) {
        return this.f28903g.get(y.P(this, i10));
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator iterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractList, java.util.List
    public ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // j7.AbstractC2789f
    public Object o(int i10) {
        return this.f28903g.remove(y.P(this, i10));
    }

    @Override // java.util.AbstractList, java.util.List
    public Object set(int i10, Object obj) {
        return this.f28903g.set(y.P(this, i10), obj);
    }

    @Override // java.util.AbstractList, java.util.List
    public ListIterator listIterator(int i10) {
        return new a(i10);
    }
}
