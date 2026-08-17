package m8;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public class w extends AbstractList implements RandomAccess, n {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final n f29735g;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    class a implements ListIterator {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        ListIterator f29736g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ int f29737h;

        a(int i10) {
            this.f29737h = i10;
            this.f29736g = w.this.f29735g.listIterator(i10);
        }

        @Override // java.util.ListIterator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void add(String str) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public String next() {
            return (String) this.f29736g.next();
        }

        @Override // java.util.ListIterator
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public String previous() {
            return (String) this.f29736g.previous();
        }

        @Override // java.util.ListIterator
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public void set(String str) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public boolean hasNext() {
            return this.f29736g.hasNext();
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
            return this.f29736g.hasPrevious();
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
            return this.f29736g.nextIndex();
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
            return this.f29736g.previousIndex();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    class b implements Iterator {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Iterator f29739g;

        b() {
            this.f29739g = w.this.f29735g.iterator();
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public String next() {
            return (String) this.f29739g.next();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f29739g.hasNext();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    public w(n nVar) {
        this.f29735g = nVar;
    }

    @Override // m8.n
    public List g() {
        return this.f29735g.g();
    }

    @Override // m8.n
    public void i(AbstractC2945d abstractC2945d) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator iterator() {
        return new b();
    }

    @Override // m8.n
    public AbstractC2945d j(int i10) {
        return this.f29735g.j(i10);
    }

    @Override // java.util.AbstractList, java.util.List
    public ListIterator listIterator(int i10) {
        return new a(i10);
    }

    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public String get(int i10) {
        return (String) this.f29735g.get(i10);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f29735g.size();
    }

    @Override // m8.n
    public n k() {
        return this;
    }
}
