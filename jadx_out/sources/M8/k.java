package M8;

import java.lang.reflect.Array;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public class k extends AbstractList implements RandomAccess {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f7670g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private Object f7671h;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    private static class b implements Iterator {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private static final b f7672g = new b();

        private b() {
        }

        public static b b() {
            return f7672g;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return false;
        }

        @Override // java.util.Iterator
        public Object next() {
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new IllegalStateException();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    private class c extends d {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private final int f7673h;

        public c() {
            super();
            this.f7673h = ((AbstractList) k.this).modCount;
        }

        @Override // M8.k.d
        protected void b() {
            if (((AbstractList) k.this).modCount == this.f7673h) {
                return;
            }
            throw new ConcurrentModificationException("ModCount: " + ((AbstractList) k.this).modCount + "; expected: " + this.f7673h);
        }

        @Override // M8.k.d
        protected Object c() {
            return k.this.f7671h;
        }

        @Override // java.util.Iterator
        public void remove() {
            b();
            k.this.clear();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    private static abstract class d implements Iterator {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private boolean f7675g;

        private d() {
        }

        protected abstract void b();

        protected abstract Object c();

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return !this.f7675g;
        }

        @Override // java.util.Iterator
        public final Object next() {
            if (this.f7675g) {
                throw new NoSuchElementException();
            }
            this.f7675g = true;
            b();
            return c();
        }
    }

    private static /* synthetic */ void d(int i10) {
        String str = (i10 == 2 || i10 == 3 || i10 == 5 || i10 == 6 || i10 == 7) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i10 == 2 || i10 == 3 || i10 == 5 || i10 == 6 || i10 == 7) ? 2 : 3];
        switch (i10) {
            case 2:
            case 3:
            case 5:
            case 6:
            case 7:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/utils/SmartList";
                break;
            case 4:
                objArr[0] = "a";
                break;
            default:
                objArr[0] = "elements";
                break;
        }
        if (i10 == 2 || i10 == 3) {
            objArr[1] = "iterator";
        } else if (i10 == 5 || i10 == 6 || i10 == 7) {
            objArr[1] = "toArray";
        } else {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/utils/SmartList";
        }
        switch (i10) {
            case 2:
            case 3:
            case 5:
            case 6:
            case 7:
                break;
            case 4:
                objArr[2] = "toArray";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i10 != 2 && i10 != 3 && i10 != 5 && i10 != 6 && i10 != 7) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(Object obj) {
        int i10 = this.f7670g;
        if (i10 == 0) {
            this.f7671h = obj;
        } else if (i10 == 1) {
            this.f7671h = new Object[]{this.f7671h, obj};
        } else {
            Object[] objArr = (Object[]) this.f7671h;
            int length = objArr.length;
            if (i10 >= length) {
                int i11 = ((length * 3) / 2) + 1;
                int i12 = i10 + 1;
                if (i11 < i12) {
                    i11 = i12;
                }
                Object[] objArr2 = new Object[i11];
                this.f7671h = objArr2;
                System.arraycopy(objArr, 0, objArr2, 0, length);
                objArr = objArr2;
            }
            objArr[this.f7670g] = obj;
        }
        this.f7670g++;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        this.f7671h = null;
        this.f7670g = 0;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public Object get(int i10) {
        int i11;
        if (i10 >= 0 && i10 < (i11 = this.f7670g)) {
            return i11 == 1 ? this.f7671h : ((Object[]) this.f7671h)[i10];
        }
        throw new IndexOutOfBoundsException("Index: " + i10 + ", Size: " + this.f7670g);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator iterator() {
        int i10 = this.f7670g;
        if (i10 == 0) {
            b bVarB = b.b();
            if (bVarB == null) {
                d(2);
            }
            return bVarB;
        }
        if (i10 == 1) {
            return new c();
        }
        Iterator it = super.iterator();
        if (it == null) {
            d(3);
        }
        return it;
    }

    @Override // java.util.AbstractList, java.util.List
    public Object remove(int i10) {
        int i11;
        Object obj;
        if (i10 < 0 || i10 >= (i11 = this.f7670g)) {
            throw new IndexOutOfBoundsException("Index: " + i10 + ", Size: " + this.f7670g);
        }
        if (i11 == 1) {
            obj = this.f7671h;
            this.f7671h = null;
        } else {
            Object[] objArr = (Object[]) this.f7671h;
            Object obj2 = objArr[i10];
            if (i11 == 2) {
                this.f7671h = objArr[1 - i10];
            } else {
                int i12 = (i11 - i10) - 1;
                if (i12 > 0) {
                    System.arraycopy(objArr, i10 + 1, objArr, i10, i12);
                }
                objArr[this.f7670g - 1] = null;
            }
            obj = obj2;
        }
        this.f7670g--;
        ((AbstractList) this).modCount++;
        return obj;
    }

    @Override // java.util.AbstractList, java.util.List
    public Object set(int i10, Object obj) {
        int i11;
        if (i10 < 0 || i10 >= (i11 = this.f7670g)) {
            throw new IndexOutOfBoundsException("Index: " + i10 + ", Size: " + this.f7670g);
        }
        if (i11 == 1) {
            Object obj2 = this.f7671h;
            this.f7671h = obj;
            return obj2;
        }
        Object[] objArr = (Object[]) this.f7671h;
        Object obj3 = objArr[i10];
        objArr[i10] = obj;
        return obj3;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f7670g;
    }

    @Override // java.util.List
    public void sort(Comparator comparator) {
        int i10 = this.f7670g;
        if (i10 >= 2) {
            Arrays.sort((Object[]) this.f7671h, 0, i10, comparator);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public Object[] toArray(Object[] objArr) {
        if (objArr == null) {
            d(4);
        }
        int length = objArr.length;
        int i10 = this.f7670g;
        if (i10 == 1) {
            if (length == 0) {
                Object[] objArr2 = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), 1);
                objArr2[0] = this.f7671h;
                return objArr2;
            }
            objArr[0] = this.f7671h;
        } else {
            if (length < i10) {
                Object[] objArrCopyOf = Arrays.copyOf((Object[]) this.f7671h, i10, objArr.getClass());
                if (objArrCopyOf == null) {
                    d(6);
                }
                return objArrCopyOf;
            }
            if (i10 != 0) {
                System.arraycopy(this.f7671h, 0, objArr, 0, i10);
            }
        }
        int i11 = this.f7670g;
        if (length > i11) {
            objArr[i11] = null;
        }
        return objArr;
    }

    @Override // java.util.AbstractList, java.util.List
    public void add(int i10, Object obj) {
        int i11;
        if (i10 >= 0 && i10 <= (i11 = this.f7670g)) {
            if (i11 == 0) {
                this.f7671h = obj;
            } else if (i11 == 1 && i10 == 0) {
                this.f7671h = new Object[]{obj, this.f7671h};
            } else {
                Object[] objArr = new Object[i11 + 1];
                if (i11 == 1) {
                    objArr[0] = this.f7671h;
                } else {
                    Object[] objArr2 = (Object[]) this.f7671h;
                    System.arraycopy(objArr2, 0, objArr, 0, i10);
                    System.arraycopy(objArr2, i10, objArr, i10 + 1, this.f7670g - i10);
                }
                objArr[i10] = obj;
                this.f7671h = objArr;
            }
            this.f7670g++;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("Index: " + i10 + ", Size: " + this.f7670g);
    }
}
