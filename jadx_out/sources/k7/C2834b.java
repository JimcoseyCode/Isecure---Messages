package k7;

import j7.AbstractC2787d;
import j7.AbstractC2789f;
import j7.AbstractC2793j;
import j7.AbstractC2800q;
import java.io.NotSerializableException;
import java.io.Serializable;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import x7.InterfaceC3550a;
import x7.InterfaceC3551b;

/* JADX INFO: renamed from: k7.b, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class C2834b extends AbstractC2789f implements List, RandomAccess, Serializable, InterfaceC3551b {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final C0306b f29141j = new C0306b(null);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final C2834b f29142k;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Object[] f29143g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f29144h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f29145i;

    /* JADX INFO: renamed from: k7.b$a */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class a extends AbstractC2789f implements List, RandomAccess, Serializable, InterfaceC3551b {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private Object[] f29146g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private final int f29147h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private int f29148i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private final a f29149j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private final C2834b f29150k;

        /* JADX INFO: renamed from: k7.b$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
        private static final class C0305a implements ListIterator, InterfaceC3550a {

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            private final a f29151g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            private int f29152h;

            /* JADX INFO: renamed from: i, reason: collision with root package name */
            private int f29153i;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            private int f29154j;

            public C0305a(a list, int i10) {
                AbstractC2855l.g(list, "list");
                this.f29151g = list;
                this.f29152h = i10;
                this.f29153i = -1;
                this.f29154j = ((AbstractList) list).modCount;
            }

            private final void c() {
                if (((AbstractList) this.f29151g.f29150k).modCount != this.f29154j) {
                    throw new ConcurrentModificationException();
                }
            }

            @Override // java.util.ListIterator
            public void add(Object obj) {
                c();
                a aVar = this.f29151g;
                int i10 = this.f29152h;
                this.f29152h = i10 + 1;
                aVar.add(i10, obj);
                this.f29153i = -1;
                this.f29154j = ((AbstractList) this.f29151g).modCount;
            }

            @Override // java.util.ListIterator, java.util.Iterator
            public boolean hasNext() {
                return this.f29152h < this.f29151g.f29148i;
            }

            @Override // java.util.ListIterator
            public boolean hasPrevious() {
                return this.f29152h > 0;
            }

            @Override // java.util.ListIterator, java.util.Iterator
            public Object next() {
                c();
                if (this.f29152h >= this.f29151g.f29148i) {
                    throw new NoSuchElementException();
                }
                int i10 = this.f29152h;
                this.f29152h = i10 + 1;
                this.f29153i = i10;
                return this.f29151g.f29146g[this.f29151g.f29147h + this.f29153i];
            }

            @Override // java.util.ListIterator
            public int nextIndex() {
                return this.f29152h;
            }

            @Override // java.util.ListIterator
            public Object previous() {
                c();
                int i10 = this.f29152h;
                if (i10 <= 0) {
                    throw new NoSuchElementException();
                }
                int i11 = i10 - 1;
                this.f29152h = i11;
                this.f29153i = i11;
                return this.f29151g.f29146g[this.f29151g.f29147h + this.f29153i];
            }

            @Override // java.util.ListIterator
            public int previousIndex() {
                return this.f29152h - 1;
            }

            @Override // java.util.ListIterator, java.util.Iterator
            public void remove() {
                c();
                int i10 = this.f29153i;
                if (i10 == -1) {
                    throw new IllegalStateException("Call next() or previous() before removing element from the iterator.");
                }
                this.f29151g.remove(i10);
                this.f29152h = this.f29153i;
                this.f29153i = -1;
                this.f29154j = ((AbstractList) this.f29151g).modCount;
            }

            @Override // java.util.ListIterator
            public void set(Object obj) {
                c();
                int i10 = this.f29153i;
                if (i10 == -1) {
                    throw new IllegalStateException("Call next() or previous() before replacing element from the iterator.");
                }
                this.f29151g.set(i10, obj);
            }
        }

        public a(Object[] backing, int i10, int i11, a aVar, C2834b root) {
            AbstractC2855l.g(backing, "backing");
            AbstractC2855l.g(root, "root");
            this.f29146g = backing;
            this.f29147h = i10;
            this.f29148i = i11;
            this.f29149j = aVar;
            this.f29150k = root;
            ((AbstractList) this).modCount = ((AbstractList) root).modCount;
        }

        private final void A() {
            ((AbstractList) this).modCount++;
        }

        private final Object B(int i10) {
            A();
            a aVar = this.f29149j;
            this.f29148i--;
            return aVar != null ? aVar.B(i10) : this.f29150k.H(i10);
        }

        private final void C(int i10, int i11) {
            if (i11 > 0) {
                A();
            }
            a aVar = this.f29149j;
            if (aVar != null) {
                aVar.C(i10, i11);
            } else {
                this.f29150k.I(i10, i11);
            }
            this.f29148i -= i11;
        }

        private final int D(int i10, int i11, Collection collection, boolean z10) {
            a aVar = this.f29149j;
            int iD = aVar != null ? aVar.D(i10, i11, collection, z10) : this.f29150k.J(i10, i11, collection, z10);
            if (iD > 0) {
                A();
            }
            this.f29148i -= iD;
            return iD;
        }

        private final void u(int i10, Collection collection, int i11) {
            A();
            a aVar = this.f29149j;
            if (aVar != null) {
                aVar.u(i10, collection, i11);
            } else {
                this.f29150k.y(i10, collection, i11);
            }
            this.f29146g = this.f29150k.f29143g;
            this.f29148i += i11;
        }

        private final void v(int i10, Object obj) {
            A();
            a aVar = this.f29149j;
            if (aVar != null) {
                aVar.v(i10, obj);
            } else {
                this.f29150k.z(i10, obj);
            }
            this.f29146g = this.f29150k.f29143g;
            this.f29148i++;
        }

        private final void w() {
            if (((AbstractList) this.f29150k).modCount != ((AbstractList) this).modCount) {
                throw new ConcurrentModificationException();
            }
        }

        private final Object writeReplace() throws NotSerializableException {
            if (z()) {
                return new C2840h(this, 0);
            }
            throw new NotSerializableException("The list cannot be serialized while it is being built.");
        }

        private final void x() {
            if (z()) {
                throw new UnsupportedOperationException();
            }
        }

        private final boolean y(List list) {
            return AbstractC2835c.h(this.f29146g, this.f29147h, this.f29148i, list);
        }

        private final boolean z() {
            return this.f29150k.f29145i;
        }

        @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean add(Object obj) {
            x();
            w();
            v(this.f29147h + this.f29148i, obj);
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean addAll(Collection elements) {
            AbstractC2855l.g(elements, "elements");
            x();
            w();
            int size = elements.size();
            u(this.f29147h + this.f29148i, elements, size);
            return size > 0;
        }

        @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
        public void clear() {
            x();
            w();
            C(this.f29147h, this.f29148i);
        }

        @Override // j7.AbstractC2789f
        public int d() {
            w();
            return this.f29148i;
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public boolean equals(Object obj) {
            w();
            if (obj != this) {
                return (obj instanceof List) && y((List) obj);
            }
            return true;
        }

        @Override // java.util.AbstractList, java.util.List
        public Object get(int i10) {
            w();
            AbstractC2787d.f28912g.b(i10, this.f29148i);
            return this.f29146g[this.f29147h + i10];
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public int hashCode() {
            w();
            return AbstractC2835c.i(this.f29146g, this.f29147h, this.f29148i);
        }

        @Override // java.util.AbstractList, java.util.List
        public int indexOf(Object obj) {
            w();
            for (int i10 = 0; i10 < this.f29148i; i10++) {
                if (AbstractC2855l.b(this.f29146g[this.f29147h + i10], obj)) {
                    return i10;
                }
            }
            return -1;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean isEmpty() {
            w();
            return this.f29148i == 0;
        }

        @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
        public Iterator iterator() {
            return listIterator(0);
        }

        @Override // java.util.AbstractList, java.util.List
        public int lastIndexOf(Object obj) {
            w();
            for (int i10 = this.f29148i - 1; i10 >= 0; i10--) {
                if (AbstractC2855l.b(this.f29146g[this.f29147h + i10], obj)) {
                    return i10;
                }
            }
            return -1;
        }

        @Override // java.util.AbstractList, java.util.List
        public ListIterator listIterator() {
            return listIterator(0);
        }

        @Override // j7.AbstractC2789f
        public Object o(int i10) {
            x();
            w();
            AbstractC2787d.f28912g.b(i10, this.f29148i);
            return B(this.f29147h + i10);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean remove(Object obj) {
            x();
            w();
            int iIndexOf = indexOf(obj);
            if (iIndexOf >= 0) {
                remove(iIndexOf);
            }
            return iIndexOf >= 0;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean removeAll(Collection elements) {
            AbstractC2855l.g(elements, "elements");
            x();
            w();
            return D(this.f29147h, this.f29148i, elements, false) > 0;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean retainAll(Collection elements) {
            AbstractC2855l.g(elements, "elements");
            x();
            w();
            return D(this.f29147h, this.f29148i, elements, true) > 0;
        }

        @Override // java.util.AbstractList, java.util.List
        public Object set(int i10, Object obj) {
            x();
            w();
            AbstractC2787d.f28912g.b(i10, this.f29148i);
            Object[] objArr = this.f29146g;
            int i11 = this.f29147h;
            Object obj2 = objArr[i11 + i10];
            objArr[i11 + i10] = obj;
            return obj2;
        }

        @Override // java.util.AbstractList, java.util.List
        public List subList(int i10, int i11) {
            AbstractC2787d.f28912g.d(i10, i11, this.f29148i);
            return new a(this.f29146g, this.f29147h + i10, i11 - i10, this, this.f29150k);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public Object[] toArray(Object[] array) {
            AbstractC2855l.g(array, "array");
            w();
            int length = array.length;
            int i10 = this.f29148i;
            if (length >= i10) {
                Object[] objArr = this.f29146g;
                int i11 = this.f29147h;
                AbstractC2793j.i(objArr, array, 0, i11, i10 + i11);
                return AbstractC2800q.f(this.f29148i, array);
            }
            Object[] objArr2 = this.f29146g;
            int i12 = this.f29147h;
            Object[] objArrCopyOfRange = Arrays.copyOfRange(objArr2, i12, i10 + i12, array.getClass());
            AbstractC2855l.f(objArrCopyOfRange, "copyOfRange(...)");
            return objArrCopyOfRange;
        }

        @Override // java.util.AbstractCollection
        public String toString() {
            w();
            return AbstractC2835c.j(this.f29146g, this.f29147h, this.f29148i, this);
        }

        @Override // java.util.AbstractList, java.util.List
        public ListIterator listIterator(int i10) {
            w();
            AbstractC2787d.f28912g.c(i10, this.f29148i);
            return new C0305a(this, i10);
        }

        @Override // java.util.AbstractList, java.util.List
        public void add(int i10, Object obj) {
            x();
            w();
            AbstractC2787d.f28912g.c(i10, this.f29148i);
            v(this.f29147h + i10, obj);
        }

        @Override // java.util.AbstractList, java.util.List
        public boolean addAll(int i10, Collection elements) {
            AbstractC2855l.g(elements, "elements");
            x();
            w();
            AbstractC2787d.f28912g.c(i10, this.f29148i);
            int size = elements.size();
            u(this.f29147h + i10, elements, size);
            return size > 0;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public Object[] toArray() {
            w();
            Object[] objArr = this.f29146g;
            int i10 = this.f29147h;
            return AbstractC2793j.n(objArr, i10, this.f29148i + i10);
        }
    }

    /* JADX INFO: renamed from: k7.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    private static final class C0306b {
        public /* synthetic */ C0306b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C0306b() {
        }
    }

    /* JADX INFO: renamed from: k7.b$c */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    private static final class c implements ListIterator, InterfaceC3550a {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final C2834b f29155g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private int f29156h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private int f29157i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private int f29158j;

        public c(C2834b list, int i10) {
            AbstractC2855l.g(list, "list");
            this.f29155g = list;
            this.f29156h = i10;
            this.f29157i = -1;
            this.f29158j = ((AbstractList) list).modCount;
        }

        private final void c() {
            if (((AbstractList) this.f29155g).modCount != this.f29158j) {
                throw new ConcurrentModificationException();
            }
        }

        @Override // java.util.ListIterator
        public void add(Object obj) {
            c();
            C2834b c2834b = this.f29155g;
            int i10 = this.f29156h;
            this.f29156h = i10 + 1;
            c2834b.add(i10, obj);
            this.f29157i = -1;
            this.f29158j = ((AbstractList) this.f29155g).modCount;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public boolean hasNext() {
            return this.f29156h < this.f29155g.f29144h;
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
            return this.f29156h > 0;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public Object next() {
            c();
            if (this.f29156h >= this.f29155g.f29144h) {
                throw new NoSuchElementException();
            }
            int i10 = this.f29156h;
            this.f29156h = i10 + 1;
            this.f29157i = i10;
            return this.f29155g.f29143g[this.f29157i];
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
            return this.f29156h;
        }

        @Override // java.util.ListIterator
        public Object previous() {
            c();
            int i10 = this.f29156h;
            if (i10 <= 0) {
                throw new NoSuchElementException();
            }
            int i11 = i10 - 1;
            this.f29156h = i11;
            this.f29157i = i11;
            return this.f29155g.f29143g[this.f29157i];
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
            return this.f29156h - 1;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public void remove() {
            c();
            int i10 = this.f29157i;
            if (i10 == -1) {
                throw new IllegalStateException("Call next() or previous() before removing element from the iterator.");
            }
            this.f29155g.remove(i10);
            this.f29156h = this.f29157i;
            this.f29157i = -1;
            this.f29158j = ((AbstractList) this.f29155g).modCount;
        }

        @Override // java.util.ListIterator
        public void set(Object obj) {
            c();
            int i10 = this.f29157i;
            if (i10 == -1) {
                throw new IllegalStateException("Call next() or previous() before replacing element from the iterator.");
            }
            this.f29155g.set(i10, obj);
        }
    }

    static {
        C2834b c2834b = new C2834b(0);
        c2834b.f29145i = true;
        f29142k = c2834b;
    }

    public C2834b(int i10) {
        this.f29143g = AbstractC2835c.d(i10);
    }

    private final void B() {
        if (this.f29145i) {
            throw new UnsupportedOperationException();
        }
    }

    private final boolean C(List list) {
        return AbstractC2835c.h(this.f29143g, 0, this.f29144h, list);
    }

    private final void D(int i10) {
        if (i10 < 0) {
            throw new OutOfMemoryError();
        }
        Object[] objArr = this.f29143g;
        if (i10 > objArr.length) {
            this.f29143g = AbstractC2835c.e(this.f29143g, AbstractC2787d.f28912g.e(objArr.length, i10));
        }
    }

    private final void E(int i10) {
        D(this.f29144h + i10);
    }

    private final void F(int i10, int i11) {
        E(i11);
        Object[] objArr = this.f29143g;
        AbstractC2793j.i(objArr, objArr, i10 + i11, i10, this.f29144h);
        this.f29144h += i11;
    }

    private final void G() {
        ((AbstractList) this).modCount++;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object H(int i10) {
        G();
        Object[] objArr = this.f29143g;
        Object obj = objArr[i10];
        AbstractC2793j.i(objArr, objArr, i10, i10 + 1, this.f29144h);
        AbstractC2835c.f(this.f29143g, this.f29144h - 1);
        this.f29144h--;
        return obj;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void I(int i10, int i11) {
        if (i11 > 0) {
            G();
        }
        Object[] objArr = this.f29143g;
        AbstractC2793j.i(objArr, objArr, i10, i10 + i11, this.f29144h);
        Object[] objArr2 = this.f29143g;
        int i12 = this.f29144h;
        AbstractC2835c.g(objArr2, i12 - i11, i12);
        this.f29144h -= i11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int J(int i10, int i11, Collection collection, boolean z10) {
        int i12 = 0;
        int i13 = 0;
        while (i12 < i11) {
            int i14 = i10 + i12;
            if (collection.contains(this.f29143g[i14]) == z10) {
                Object[] objArr = this.f29143g;
                i12++;
                objArr[i13 + i10] = objArr[i14];
                i13++;
            } else {
                i12++;
            }
        }
        int i15 = i11 - i13;
        Object[] objArr2 = this.f29143g;
        AbstractC2793j.i(objArr2, objArr2, i10 + i13, i11 + i10, this.f29144h);
        Object[] objArr3 = this.f29143g;
        int i16 = this.f29144h;
        AbstractC2835c.g(objArr3, i16 - i15, i16);
        if (i15 > 0) {
            G();
        }
        this.f29144h -= i15;
        return i15;
    }

    private final Object writeReplace() throws NotSerializableException {
        if (this.f29145i) {
            return new C2840h(this, 0);
        }
        throw new NotSerializableException("The list cannot be serialized while it is being built.");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void y(int i10, Collection collection, int i11) {
        G();
        F(i10, i11);
        Iterator it = collection.iterator();
        for (int i12 = 0; i12 < i11; i12++) {
            this.f29143g[i10 + i12] = it.next();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void z(int i10, Object obj) {
        G();
        F(i10, 1);
        this.f29143g[i10] = obj;
    }

    public final List A() {
        B();
        this.f29145i = true;
        return this.f29144h > 0 ? this : f29142k;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(Object obj) {
        B();
        z(this.f29144h, obj);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection elements) {
        AbstractC2855l.g(elements, "elements");
        B();
        int size = elements.size();
        y(this.f29144h, elements, size);
        return size > 0;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        B();
        I(0, this.f29144h);
    }

    @Override // j7.AbstractC2789f
    public int d() {
        return this.f29144h;
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public boolean equals(Object obj) {
        if (obj != this) {
            return (obj instanceof List) && C((List) obj);
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public Object get(int i10) {
        AbstractC2787d.f28912g.b(i10, this.f29144h);
        return this.f29143g[i10];
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
        return AbstractC2835c.i(this.f29143g, 0, this.f29144h);
    }

    @Override // java.util.AbstractList, java.util.List
    public int indexOf(Object obj) {
        for (int i10 = 0; i10 < this.f29144h; i10++) {
            if (AbstractC2855l.b(this.f29143g[i10], obj)) {
                return i10;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean isEmpty() {
        return this.f29144h == 0;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator iterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractList, java.util.List
    public int lastIndexOf(Object obj) {
        for (int i10 = this.f29144h - 1; i10 >= 0; i10--) {
            if (AbstractC2855l.b(this.f29143g[i10], obj)) {
                return i10;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // j7.AbstractC2789f
    public Object o(int i10) {
        B();
        AbstractC2787d.f28912g.b(i10, this.f29144h);
        return H(i10);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean remove(Object obj) {
        B();
        int iIndexOf = indexOf(obj);
        if (iIndexOf >= 0) {
            remove(iIndexOf);
        }
        return iIndexOf >= 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean removeAll(Collection elements) {
        AbstractC2855l.g(elements, "elements");
        B();
        return J(0, this.f29144h, elements, false) > 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean retainAll(Collection elements) {
        AbstractC2855l.g(elements, "elements");
        B();
        return J(0, this.f29144h, elements, true) > 0;
    }

    @Override // java.util.AbstractList, java.util.List
    public Object set(int i10, Object obj) {
        B();
        AbstractC2787d.f28912g.b(i10, this.f29144h);
        Object[] objArr = this.f29143g;
        Object obj2 = objArr[i10];
        objArr[i10] = obj;
        return obj2;
    }

    @Override // java.util.AbstractList, java.util.List
    public List subList(int i10, int i11) {
        AbstractC2787d.f28912g.d(i10, i11, this.f29144h);
        return new a(this.f29143g, i10, i11 - i10, null, this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public Object[] toArray(Object[] array) {
        AbstractC2855l.g(array, "array");
        int length = array.length;
        int i10 = this.f29144h;
        if (length >= i10) {
            AbstractC2793j.i(this.f29143g, array, 0, 0, i10);
            return AbstractC2800q.f(this.f29144h, array);
        }
        Object[] objArrCopyOfRange = Arrays.copyOfRange(this.f29143g, 0, i10, array.getClass());
        AbstractC2855l.f(objArrCopyOfRange, "copyOfRange(...)");
        return objArrCopyOfRange;
    }

    @Override // java.util.AbstractCollection
    public String toString() {
        return AbstractC2835c.j(this.f29143g, 0, this.f29144h, this);
    }

    @Override // java.util.AbstractList, java.util.List
    public ListIterator listIterator(int i10) {
        AbstractC2787d.f28912g.c(i10, this.f29144h);
        return new c(this, i10);
    }

    public /* synthetic */ C2834b(int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? 10 : i10);
    }

    @Override // java.util.AbstractList, java.util.List
    public void add(int i10, Object obj) {
        B();
        AbstractC2787d.f28912g.c(i10, this.f29144h);
        z(i10, obj);
    }

    @Override // java.util.AbstractList, java.util.List
    public boolean addAll(int i10, Collection elements) {
        AbstractC2855l.g(elements, "elements");
        B();
        AbstractC2787d.f28912g.c(i10, this.f29144h);
        int size = elements.size();
        y(i10, elements, size);
        return size > 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public Object[] toArray() {
        return AbstractC2793j.n(this.f29143g, 0, this.f29144h);
    }
}
