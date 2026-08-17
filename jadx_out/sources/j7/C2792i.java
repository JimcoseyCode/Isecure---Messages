package j7;

import java.util.AbstractList;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: j7.i, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class C2792i extends AbstractC2789f {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final a f28921j = new a(null);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final Object[] f28922k = new Object[0];

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f28923g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private Object[] f28924h = f28922k;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f28925i;

    /* JADX INFO: renamed from: j7.i$a */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    private final void A(int i10, int i11) {
        int iW = w(this.f28923g + i11);
        int iW2 = w(this.f28923g + i10);
        int size = size();
        while (true) {
            size -= i11;
            if (size <= 0) {
                return;
            }
            Object[] objArr = this.f28924h;
            i11 = Math.min(size, Math.min(objArr.length - iW, objArr.length - iW2));
            Object[] objArr2 = this.f28924h;
            int i12 = iW + i11;
            AbstractC2796m.i(objArr2, objArr2, iW2, iW, i12);
            iW = w(i12);
            iW2 = w(iW2 + i11);
        }
    }

    private final void p(int i10, Collection collection) {
        Iterator it = collection.iterator();
        int length = this.f28924h.length;
        while (i10 < length && it.hasNext()) {
            this.f28924h[i10] = it.next();
            i10++;
        }
        int i11 = this.f28923g;
        for (int i12 = 0; i12 < i11 && it.hasNext(); i12++) {
            this.f28924h[i12] = it.next();
        }
        this.f28925i = size() + collection.size();
    }

    private final void q(int i10) {
        Object[] objArr = new Object[i10];
        Object[] objArr2 = this.f28924h;
        AbstractC2796m.i(objArr2, objArr, 0, this.f28923g, objArr2.length);
        Object[] objArr3 = this.f28924h;
        int length = objArr3.length;
        int i11 = this.f28923g;
        AbstractC2796m.i(objArr3, objArr, length - i11, 0, i11);
        this.f28923g = 0;
        this.f28924h = objArr;
    }

    private final int r(int i10) {
        return i10 == 0 ? AbstractC2798o.K(this.f28924h) : i10 - 1;
    }

    private final void s(int i10) {
        if (i10 < 0) {
            throw new IllegalStateException("Deque is too big.");
        }
        Object[] objArr = this.f28924h;
        if (i10 <= objArr.length) {
            return;
        }
        if (objArr == f28922k) {
            this.f28924h = new Object[B7.d.d(i10, 10)];
        } else {
            q(AbstractC2787d.f28912g.e(objArr.length, i10));
        }
    }

    private final int t(int i10) {
        if (i10 == AbstractC2798o.K(this.f28924h)) {
            return 0;
        }
        return i10 + 1;
    }

    private final int u(int i10) {
        return i10 < 0 ? i10 + this.f28924h.length : i10;
    }

    private final void v(int i10, int i11) {
        if (i10 < i11) {
            AbstractC2796m.p(this.f28924h, null, i10, i11);
            return;
        }
        Object[] objArr = this.f28924h;
        AbstractC2796m.p(objArr, null, i10, objArr.length);
        AbstractC2796m.p(this.f28924h, null, 0, i11);
    }

    private final int w(int i10) {
        Object[] objArr = this.f28924h;
        return i10 >= objArr.length ? i10 - objArr.length : i10;
    }

    private final void x() {
        ((AbstractList) this).modCount++;
    }

    private final void z(int i10, int i11) {
        int iW = w(this.f28923g + (i10 - 1));
        int iW2 = w(this.f28923g + (i11 - 1));
        while (i10 > 0) {
            int i12 = iW + 1;
            int iMin = Math.min(i10, Math.min(i12, iW2 + 1));
            Object[] objArr = this.f28924h;
            int i13 = iW2 - iMin;
            int i14 = iW - iMin;
            AbstractC2796m.i(objArr, objArr, i13 + 1, i14 + 1, i12);
            iW = u(i14);
            iW2 = u(i13);
            i10 -= iMin;
        }
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(Object obj) {
        addLast(obj);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection elements) {
        AbstractC2855l.g(elements, "elements");
        if (elements.isEmpty()) {
            return false;
        }
        x();
        s(size() + elements.size());
        p(w(this.f28923g + size()), elements);
        return true;
    }

    public final void addFirst(Object obj) {
        x();
        s(size() + 1);
        int iR = r(this.f28923g);
        this.f28923g = iR;
        this.f28924h[iR] = obj;
        this.f28925i = size() + 1;
    }

    public final void addLast(Object obj) {
        x();
        s(size() + 1);
        this.f28924h[w(this.f28923g + size())] = obj;
        this.f28925i = size() + 1;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        if (!isEmpty()) {
            x();
            v(this.f28923g, w(this.f28923g + size()));
        }
        this.f28923g = 0;
        this.f28925i = 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // j7.AbstractC2789f
    public int d() {
        return this.f28925i;
    }

    @Override // java.util.AbstractList, java.util.List
    public Object get(int i10) {
        AbstractC2787d.f28912g.b(i10, size());
        return this.f28924h[w(this.f28923g + i10)];
    }

    @Override // java.util.AbstractList, java.util.List
    public int indexOf(Object obj) {
        int i10;
        int iW = w(this.f28923g + size());
        int length = this.f28923g;
        if (length < iW) {
            while (length < iW) {
                if (AbstractC2855l.b(obj, this.f28924h[length])) {
                    i10 = this.f28923g;
                } else {
                    length++;
                }
            }
            return -1;
        }
        if (length < iW) {
            return -1;
        }
        int length2 = this.f28924h.length;
        while (true) {
            if (length >= length2) {
                for (int i11 = 0; i11 < iW; i11++) {
                    if (AbstractC2855l.b(obj, this.f28924h[i11])) {
                        length = i11 + this.f28924h.length;
                        i10 = this.f28923g;
                    }
                }
                return -1;
            }
            if (AbstractC2855l.b(obj, this.f28924h[length])) {
                i10 = this.f28923g;
                break;
            }
            length++;
        }
        return length - i10;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.AbstractList, java.util.List
    public int lastIndexOf(Object obj) {
        int iK;
        int i10;
        int iW = w(this.f28923g + size());
        int i11 = this.f28923g;
        if (i11 < iW) {
            iK = iW - 1;
            if (i11 <= iK) {
                while (!AbstractC2855l.b(obj, this.f28924h[iK])) {
                    if (iK != i11) {
                        iK--;
                    }
                }
                i10 = this.f28923g;
                return iK - i10;
            }
            return -1;
        }
        if (i11 > iW) {
            int i12 = iW - 1;
            while (true) {
                if (-1 >= i12) {
                    iK = AbstractC2798o.K(this.f28924h);
                    int i13 = this.f28923g;
                    if (i13 <= iK) {
                        while (!AbstractC2855l.b(obj, this.f28924h[iK])) {
                            if (iK != i13) {
                                iK--;
                            }
                        }
                        i10 = this.f28923g;
                    }
                } else {
                    if (AbstractC2855l.b(obj, this.f28924h[i12])) {
                        iK = i12 + this.f28924h.length;
                        i10 = this.f28923g;
                        break;
                    }
                    i12--;
                }
            }
        }
        return -1;
    }

    @Override // j7.AbstractC2789f
    public Object o(int i10) {
        AbstractC2787d.f28912g.b(i10, size());
        if (i10 == AbstractC2801s.l(this)) {
            return removeLast();
        }
        if (i10 == 0) {
            return removeFirst();
        }
        x();
        int iW = w(this.f28923g + i10);
        Object obj = this.f28924h[iW];
        if (i10 < (size() >> 1)) {
            int i11 = this.f28923g;
            if (iW >= i11) {
                Object[] objArr = this.f28924h;
                AbstractC2796m.i(objArr, objArr, i11 + 1, i11, iW);
            } else {
                Object[] objArr2 = this.f28924h;
                AbstractC2796m.i(objArr2, objArr2, 1, 0, iW);
                Object[] objArr3 = this.f28924h;
                objArr3[0] = objArr3[objArr3.length - 1];
                int i12 = this.f28923g;
                AbstractC2796m.i(objArr3, objArr3, i12 + 1, i12, objArr3.length - 1);
            }
            Object[] objArr4 = this.f28924h;
            int i13 = this.f28923g;
            objArr4[i13] = null;
            this.f28923g = t(i13);
        } else {
            int iW2 = w(this.f28923g + AbstractC2801s.l(this));
            if (iW <= iW2) {
                Object[] objArr5 = this.f28924h;
                AbstractC2796m.i(objArr5, objArr5, iW, iW + 1, iW2 + 1);
            } else {
                Object[] objArr6 = this.f28924h;
                AbstractC2796m.i(objArr6, objArr6, iW, iW + 1, objArr6.length);
                Object[] objArr7 = this.f28924h;
                objArr7[objArr7.length - 1] = objArr7[0];
                AbstractC2796m.i(objArr7, objArr7, 0, 1, iW2 + 1);
            }
            this.f28924h[iW2] = null;
        }
        this.f28925i = size() - 1;
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean remove(Object obj) {
        int iIndexOf = indexOf(obj);
        if (iIndexOf == -1) {
            return false;
        }
        remove(iIndexOf);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean removeAll(Collection elements) {
        int iW;
        AbstractC2855l.g(elements, "elements");
        boolean z10 = false;
        z10 = false;
        z10 = false;
        if (!isEmpty() && this.f28924h.length != 0) {
            int iW2 = w(this.f28923g + size());
            int i10 = this.f28923g;
            if (i10 < iW2) {
                iW = i10;
                while (i10 < iW2) {
                    Object obj = this.f28924h[i10];
                    if (elements.contains(obj)) {
                        z10 = true;
                    } else {
                        this.f28924h[iW] = obj;
                        iW++;
                    }
                    i10++;
                }
                AbstractC2796m.p(this.f28924h, null, iW, iW2);
            } else {
                int length = this.f28924h.length;
                boolean z11 = false;
                int i11 = i10;
                while (i10 < length) {
                    Object[] objArr = this.f28924h;
                    Object obj2 = objArr[i10];
                    objArr[i10] = null;
                    if (elements.contains(obj2)) {
                        z11 = true;
                    } else {
                        this.f28924h[i11] = obj2;
                        i11++;
                    }
                    i10++;
                }
                iW = w(i11);
                for (int i12 = 0; i12 < iW2; i12++) {
                    Object[] objArr2 = this.f28924h;
                    Object obj3 = objArr2[i12];
                    objArr2[i12] = null;
                    if (elements.contains(obj3)) {
                        z11 = true;
                    } else {
                        this.f28924h[iW] = obj3;
                        iW = t(iW);
                    }
                }
                z10 = z11;
            }
            if (z10) {
                x();
                this.f28925i = u(iW - this.f28923g);
            }
        }
        return z10;
    }

    public final Object removeFirst() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        x();
        Object[] objArr = this.f28924h;
        int i10 = this.f28923g;
        Object obj = objArr[i10];
        objArr[i10] = null;
        this.f28923g = t(i10);
        this.f28925i = size() - 1;
        return obj;
    }

    public final Object removeLast() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        x();
        int iW = w(this.f28923g + AbstractC2801s.l(this));
        Object[] objArr = this.f28924h;
        Object obj = objArr[iW];
        objArr[iW] = null;
        this.f28925i = size() - 1;
        return obj;
    }

    @Override // java.util.AbstractList
    protected void removeRange(int i10, int i11) {
        AbstractC2787d.f28912g.d(i10, i11, size());
        int i12 = i11 - i10;
        if (i12 == 0) {
            return;
        }
        if (i12 == size()) {
            clear();
            return;
        }
        if (i12 == 1) {
            remove(i10);
            return;
        }
        x();
        if (i10 < size() - i11) {
            z(i10, i11);
            int iW = w(this.f28923g + i12);
            v(this.f28923g, iW);
            this.f28923g = iW;
        } else {
            A(i10, i11);
            int iW2 = w(this.f28923g + size());
            v(u(iW2 - i12), iW2);
        }
        this.f28925i = size() - i12;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean retainAll(Collection elements) {
        int iW;
        AbstractC2855l.g(elements, "elements");
        boolean z10 = false;
        z10 = false;
        z10 = false;
        if (!isEmpty() && this.f28924h.length != 0) {
            int iW2 = w(this.f28923g + size());
            int i10 = this.f28923g;
            if (i10 < iW2) {
                iW = i10;
                while (i10 < iW2) {
                    Object obj = this.f28924h[i10];
                    if (elements.contains(obj)) {
                        this.f28924h[iW] = obj;
                        iW++;
                    } else {
                        z10 = true;
                    }
                    i10++;
                }
                AbstractC2796m.p(this.f28924h, null, iW, iW2);
            } else {
                int length = this.f28924h.length;
                boolean z11 = false;
                int i11 = i10;
                while (i10 < length) {
                    Object[] objArr = this.f28924h;
                    Object obj2 = objArr[i10];
                    objArr[i10] = null;
                    if (elements.contains(obj2)) {
                        this.f28924h[i11] = obj2;
                        i11++;
                    } else {
                        z11 = true;
                    }
                    i10++;
                }
                iW = w(i11);
                for (int i12 = 0; i12 < iW2; i12++) {
                    Object[] objArr2 = this.f28924h;
                    Object obj3 = objArr2[i12];
                    objArr2[i12] = null;
                    if (elements.contains(obj3)) {
                        this.f28924h[iW] = obj3;
                        iW = t(iW);
                    } else {
                        z11 = true;
                    }
                }
                z10 = z11;
            }
            if (z10) {
                x();
                this.f28925i = u(iW - this.f28923g);
            }
        }
        return z10;
    }

    @Override // java.util.AbstractList, java.util.List
    public Object set(int i10, Object obj) {
        AbstractC2787d.f28912g.b(i10, size());
        int iW = w(this.f28923g + i10);
        Object[] objArr = this.f28924h;
        Object obj2 = objArr[iW];
        objArr[iW] = obj;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public Object[] toArray(Object[] array) {
        AbstractC2855l.g(array, "array");
        if (array.length < size()) {
            array = AbstractC2794k.a(array, size());
        }
        Object[] objArr = array;
        int iW = w(this.f28923g + size());
        int i10 = this.f28923g;
        if (i10 < iW) {
            AbstractC2796m.l(this.f28924h, objArr, 0, i10, iW, 2, null);
        } else if (!isEmpty()) {
            Object[] objArr2 = this.f28924h;
            AbstractC2796m.i(objArr2, objArr, 0, this.f28923g, objArr2.length);
            Object[] objArr3 = this.f28924h;
            AbstractC2796m.i(objArr3, objArr, objArr3.length - this.f28923g, 0, iW);
        }
        return r.f(size(), objArr);
    }

    public final Object y() {
        if (isEmpty()) {
            return null;
        }
        return removeFirst();
    }

    @Override // java.util.AbstractList, java.util.List
    public void add(int i10, Object obj) {
        AbstractC2787d.f28912g.c(i10, size());
        if (i10 == size()) {
            addLast(obj);
            return;
        }
        if (i10 == 0) {
            addFirst(obj);
            return;
        }
        x();
        s(size() + 1);
        int iW = w(this.f28923g + i10);
        if (i10 < ((size() + 1) >> 1)) {
            int iR = r(iW);
            int iR2 = r(this.f28923g);
            int i11 = this.f28923g;
            if (iR >= i11) {
                Object[] objArr = this.f28924h;
                objArr[iR2] = objArr[i11];
                AbstractC2796m.i(objArr, objArr, i11, i11 + 1, iR + 1);
            } else {
                Object[] objArr2 = this.f28924h;
                AbstractC2796m.i(objArr2, objArr2, i11 - 1, i11, objArr2.length);
                Object[] objArr3 = this.f28924h;
                objArr3[objArr3.length - 1] = objArr3[0];
                AbstractC2796m.i(objArr3, objArr3, 0, 1, iR + 1);
            }
            this.f28924h[iR] = obj;
            this.f28923g = iR2;
        } else {
            int iW2 = w(this.f28923g + size());
            if (iW < iW2) {
                Object[] objArr4 = this.f28924h;
                AbstractC2796m.i(objArr4, objArr4, iW + 1, iW, iW2);
            } else {
                Object[] objArr5 = this.f28924h;
                AbstractC2796m.i(objArr5, objArr5, 1, 0, iW2);
                Object[] objArr6 = this.f28924h;
                objArr6[0] = objArr6[objArr6.length - 1];
                AbstractC2796m.i(objArr6, objArr6, iW + 1, iW, objArr6.length - 1);
            }
            this.f28924h[iW] = obj;
        }
        this.f28925i = size() + 1;
    }

    @Override // java.util.AbstractList, java.util.List
    public boolean addAll(int i10, Collection elements) {
        AbstractC2855l.g(elements, "elements");
        AbstractC2787d.f28912g.c(i10, size());
        if (elements.isEmpty()) {
            return false;
        }
        if (i10 == size()) {
            return addAll(elements);
        }
        x();
        s(size() + elements.size());
        int iW = w(this.f28923g + size());
        int iW2 = w(this.f28923g + i10);
        int size = elements.size();
        if (i10 < ((size() + 1) >> 1)) {
            int i11 = this.f28923g;
            int length = i11 - size;
            if (iW2 < i11) {
                Object[] objArr = this.f28924h;
                AbstractC2796m.i(objArr, objArr, length, i11, objArr.length);
                if (size >= iW2) {
                    Object[] objArr2 = this.f28924h;
                    AbstractC2796m.i(objArr2, objArr2, objArr2.length - size, 0, iW2);
                } else {
                    Object[] objArr3 = this.f28924h;
                    AbstractC2796m.i(objArr3, objArr3, objArr3.length - size, 0, size);
                    Object[] objArr4 = this.f28924h;
                    AbstractC2796m.i(objArr4, objArr4, 0, size, iW2);
                }
            } else if (length >= 0) {
                Object[] objArr5 = this.f28924h;
                AbstractC2796m.i(objArr5, objArr5, length, i11, iW2);
            } else {
                Object[] objArr6 = this.f28924h;
                length += objArr6.length;
                int i12 = iW2 - i11;
                int length2 = objArr6.length - length;
                if (length2 >= i12) {
                    AbstractC2796m.i(objArr6, objArr6, length, i11, iW2);
                } else {
                    AbstractC2796m.i(objArr6, objArr6, length, i11, i11 + length2);
                    Object[] objArr7 = this.f28924h;
                    AbstractC2796m.i(objArr7, objArr7, 0, this.f28923g + length2, iW2);
                }
            }
            this.f28923g = length;
            p(u(iW2 - size), elements);
        } else {
            int i13 = iW2 + size;
            if (iW2 < iW) {
                int i14 = size + iW;
                Object[] objArr8 = this.f28924h;
                if (i14 <= objArr8.length) {
                    AbstractC2796m.i(objArr8, objArr8, i13, iW2, iW);
                } else if (i13 >= objArr8.length) {
                    AbstractC2796m.i(objArr8, objArr8, i13 - objArr8.length, iW2, iW);
                } else {
                    int length3 = iW - (i14 - objArr8.length);
                    AbstractC2796m.i(objArr8, objArr8, 0, length3, iW);
                    Object[] objArr9 = this.f28924h;
                    AbstractC2796m.i(objArr9, objArr9, i13, iW2, length3);
                }
            } else {
                Object[] objArr10 = this.f28924h;
                AbstractC2796m.i(objArr10, objArr10, size, 0, iW);
                Object[] objArr11 = this.f28924h;
                if (i13 >= objArr11.length) {
                    AbstractC2796m.i(objArr11, objArr11, i13 - objArr11.length, iW2, objArr11.length);
                } else {
                    AbstractC2796m.i(objArr11, objArr11, 0, objArr11.length - size, objArr11.length);
                    Object[] objArr12 = this.f28924h;
                    AbstractC2796m.i(objArr12, objArr12, i13, iW2, objArr12.length - size);
                }
            }
            p(iW2, elements);
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public Object[] toArray() {
        return toArray(new Object[size()]);
    }
}
