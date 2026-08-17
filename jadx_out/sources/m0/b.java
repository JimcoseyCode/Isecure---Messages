package m0;

import j7.AbstractC2793j;
import j7.AbstractC2800q;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Set;
import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import n0.AbstractC2956a;
import x7.InterfaceC3551b;
import x7.InterfaceC3554e;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public final class b implements Collection, Set, InterfaceC3551b, InterfaceC3554e {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int[] f29517g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private Object[] f29518h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f29519i;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    private final class a extends e {
        public a() {
            super(b.this.r());
        }

        @Override // m0.e
        protected Object c(int i10) {
            return b.this.w(i10);
        }

        @Override // m0.e
        protected void d(int i10) {
            b.this.s(i10);
        }
    }

    public b() {
        this(0, 1, null);
    }

    @Override // java.util.Collection, java.util.Set
    public boolean add(Object obj) {
        int i10;
        int iC;
        int iR = r();
        if (obj == null) {
            iC = d.d(this);
            i10 = 0;
        } else {
            int iHashCode = obj.hashCode();
            i10 = iHashCode;
            iC = d.c(this, obj, iHashCode);
        }
        if (iC >= 0) {
            return false;
        }
        int i11 = ~iC;
        if (iR >= p().length) {
            int i12 = 8;
            if (iR >= 8) {
                i12 = (iR >> 1) + iR;
            } else if (iR < 4) {
                i12 = 4;
            }
            int[] iArrP = p();
            Object[] objArrO = o();
            d.a(this, i12);
            if (iR != r()) {
                throw new ConcurrentModificationException();
            }
            if (!(p().length == 0)) {
                AbstractC2793j.k(iArrP, p(), 0, 0, iArrP.length, 6, null);
                AbstractC2793j.l(objArrO, o(), 0, 0, objArrO.length, 6, null);
            }
        }
        if (i11 < iR) {
            int i13 = i11 + 1;
            AbstractC2793j.g(p(), p(), i13, i11, iR);
            AbstractC2793j.i(o(), o(), i13, i11, iR);
        }
        if (iR != r() || i11 >= p().length) {
            throw new ConcurrentModificationException();
        }
        p()[i11] = i10;
        o()[i11] = obj;
        v(r() + 1);
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean addAll(Collection elements) {
        AbstractC2855l.g(elements, "elements");
        d(r() + elements.size());
        Iterator it = elements.iterator();
        boolean zAdd = false;
        while (it.hasNext()) {
            zAdd |= add(it.next());
        }
        return zAdd;
    }

    @Override // java.util.Collection, java.util.Set
    public void clear() {
        if (r() != 0) {
            u(AbstractC2956a.f30012a);
            t(AbstractC2956a.f30014c);
            v(0);
        }
        if (r() != 0) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean containsAll(Collection elements) {
        AbstractC2855l.g(elements, "elements");
        Iterator it = elements.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    public final void d(int i10) {
        int iR = r();
        if (p().length < i10) {
            int[] iArrP = p();
            Object[] objArrO = o();
            d.a(this, i10);
            if (r() > 0) {
                AbstractC2793j.k(iArrP, p(), 0, 0, r(), 6, null);
                AbstractC2793j.l(objArrO, o(), 0, 0, r(), 6, null);
            }
        }
        if (r() != iR) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.Collection, java.util.Set
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Set) || size() != ((Set) obj).size()) {
            return false;
        }
        try {
            int iR = r();
            for (int i10 = 0; i10 < iR; i10++) {
                if (!((Set) obj).contains(w(i10))) {
                    return false;
                }
            }
            return true;
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        int[] iArrP = p();
        int iR = r();
        int i10 = 0;
        for (int i11 = 0; i11 < iR; i11++) {
            i10 += iArrP[i11];
        }
        return i10;
    }

    public final int indexOf(Object obj) {
        return obj == null ? d.d(this) : d.c(this, obj, obj.hashCode());
    }

    @Override // java.util.Collection, java.util.Set
    public boolean isEmpty() {
        return r() <= 0;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator iterator() {
        return new a();
    }

    public final Object[] o() {
        return this.f29518h;
    }

    public final int[] p() {
        return this.f29517g;
    }

    public int q() {
        return this.f29519i;
    }

    public final int r() {
        return this.f29519i;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean remove(Object obj) {
        int iIndexOf = indexOf(obj);
        if (iIndexOf < 0) {
            return false;
        }
        s(iIndexOf);
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean removeAll(Collection elements) {
        AbstractC2855l.g(elements, "elements");
        Iterator it = elements.iterator();
        boolean zRemove = false;
        while (it.hasNext()) {
            zRemove |= remove(it.next());
        }
        return zRemove;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean retainAll(Collection elements) {
        AbstractC2855l.g(elements, "elements");
        boolean z10 = false;
        for (int iR = r() - 1; -1 < iR; iR--) {
            if (!AbstractC2800q.X(elements, o()[iR])) {
                s(iR);
                z10 = true;
            }
        }
        return z10;
    }

    public final Object s(int i10) {
        int i11;
        Object[] objArr;
        int iR = r();
        Object obj = o()[i10];
        if (iR <= 1) {
            clear();
            return obj;
        }
        int i12 = iR - 1;
        if (p().length <= 8 || r() >= p().length / 3) {
            if (i10 < i12) {
                int i13 = i10 + 1;
                AbstractC2793j.g(p(), p(), i10, i13, iR);
                AbstractC2793j.i(o(), o(), i10, i13, iR);
            }
            o()[i12] = null;
        } else {
            int iR2 = r() > 8 ? r() + (r() >> 1) : 8;
            int[] iArrP = p();
            Object[] objArrO = o();
            d.a(this, iR2);
            if (i10 > 0) {
                AbstractC2793j.k(iArrP, p(), 0, 0, i10, 6, null);
                objArr = objArrO;
                AbstractC2793j.l(objArr, o(), 0, 0, i10, 6, null);
                i11 = i10;
            } else {
                i11 = i10;
                objArr = objArrO;
            }
            if (i11 < i12) {
                int i14 = i11 + 1;
                AbstractC2793j.g(iArrP, p(), i11, i14, iR);
                AbstractC2793j.i(objArr, o(), i11, i14, iR);
            }
        }
        if (iR != r()) {
            throw new ConcurrentModificationException();
        }
        v(i12);
        return obj;
    }

    @Override // java.util.Collection, java.util.Set
    public final /* bridge */ int size() {
        return q();
    }

    public final void t(Object[] objArr) {
        AbstractC2855l.g(objArr, "<set-?>");
        this.f29518h = objArr;
    }

    @Override // java.util.Collection, java.util.Set
    public final Object[] toArray() {
        return AbstractC2793j.n(this.f29518h, 0, this.f29519i);
    }

    public String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(r() * 14);
        sb.append('{');
        int iR = r();
        for (int i10 = 0; i10 < iR; i10++) {
            if (i10 > 0) {
                sb.append(", ");
            }
            Object objW = w(i10);
            if (objW != this) {
                sb.append(objW);
            } else {
                sb.append("(this Set)");
            }
        }
        sb.append('}');
        String string = sb.toString();
        AbstractC2855l.f(string, "StringBuilder(capacity).…builderAction).toString()");
        return string;
    }

    public final void u(int[] iArr) {
        AbstractC2855l.g(iArr, "<set-?>");
        this.f29517g = iArr;
    }

    public final void v(int i10) {
        this.f29519i = i10;
    }

    public final Object w(int i10) {
        return o()[i10];
    }

    public b(int i10) {
        this.f29517g = AbstractC2956a.f30012a;
        this.f29518h = AbstractC2956a.f30014c;
        if (i10 > 0) {
            d.a(this, i10);
        }
    }

    @Override // java.util.Collection, java.util.Set
    public final Object[] toArray(Object[] array) {
        AbstractC2855l.g(array, "array");
        Object[] result = c.a(array, this.f29519i);
        AbstractC2793j.i(this.f29518h, result, 0, 0, this.f29519i);
        AbstractC2855l.f(result, "result");
        return result;
    }

    public /* synthetic */ b(int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? 0 : i10);
    }
}
