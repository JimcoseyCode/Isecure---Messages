package j7;

import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.jvm.internal.AbstractC2855l;
import x7.InterfaceC3550a;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
class S extends AbstractC2787d {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final List f28906h;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class a implements ListIterator, InterfaceC3550a {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final ListIterator f28907g;

        a(int i10) {
            this.f28907g = S.this.f28906h.listIterator(y.R(S.this, i10));
        }

        @Override // java.util.ListIterator
        public void add(Object obj) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public boolean hasNext() {
            return this.f28907g.hasPrevious();
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
            return this.f28907g.hasNext();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public Object next() {
            return this.f28907g.previous();
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
            return y.Q(S.this, this.f28907g.previousIndex());
        }

        @Override // java.util.ListIterator
        public Object previous() {
            return this.f28907g.next();
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
            return y.Q(S.this, this.f28907g.nextIndex());
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.ListIterator
        public void set(Object obj) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public S(List delegate) {
        AbstractC2855l.g(delegate, "delegate");
        this.f28906h = delegate;
    }

    @Override // j7.AbstractC2787d, java.util.List
    public Object get(int i10) {
        return this.f28906h.get(y.P(this, i10));
    }

    @Override // j7.AbstractC2787d, java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator iterator() {
        return listIterator(0);
    }

    @Override // j7.AbstractC2787d, java.util.List
    public ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // j7.AbstractC2785b
    public int o() {
        return this.f28906h.size();
    }

    @Override // j7.AbstractC2787d, java.util.List
    public ListIterator listIterator(int i10) {
        return new a(i10);
    }
}
