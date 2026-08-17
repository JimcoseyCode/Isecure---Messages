package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import java.util.AbstractMap;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
abstract class T1 extends AbstractMap {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Object[] f22307g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f22308h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private Map f22309i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f22310j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private volatile R1 f22311k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private Map f22312l;

    /* synthetic */ T1(S1 s12) {
        Map map = Collections.EMPTY_MAP;
        this.f22309i = map;
        this.f22312l = map;
    }

    private final int l(Comparable comparable) {
        int i10 = this.f22308h;
        int i11 = i10 - 1;
        int i12 = 0;
        if (i11 >= 0) {
            int iCompareTo = comparable.compareTo(((N1) this.f22307g[i11]).h());
            if (iCompareTo > 0) {
                return -(i10 + 1);
            }
            if (iCompareTo == 0) {
                return i11;
            }
        }
        while (i12 <= i11) {
            int i13 = (i12 + i11) / 2;
            int iCompareTo2 = comparable.compareTo(((N1) this.f22307g[i13]).h());
            if (iCompareTo2 < 0) {
                i11 = i13 - 1;
            } else {
                if (iCompareTo2 <= 0) {
                    return i13;
                }
                i12 = i13 + 1;
            }
        }
        return -(i12 + 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object m(int i10) {
        o();
        Object value = ((N1) this.f22307g[i10]).getValue();
        Object[] objArr = this.f22307g;
        System.arraycopy(objArr, i10 + 1, objArr, i10, (this.f22308h - i10) - 1);
        this.f22308h--;
        if (!this.f22309i.isEmpty()) {
            Iterator it = n().entrySet().iterator();
            Object[] objArr2 = this.f22307g;
            int i11 = this.f22308h;
            Map.Entry entry = (Map.Entry) it.next();
            objArr2[i11] = new N1(this, (Comparable) entry.getKey(), entry.getValue());
            this.f22308h++;
            it.remove();
        }
        return value;
    }

    private final SortedMap n() {
        o();
        if (this.f22309i.isEmpty() && !(this.f22309i instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.f22309i = treeMap;
            this.f22312l = treeMap.descendingMap();
        }
        return (SortedMap) this.f22309i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void o() {
        if (this.f22310j) {
            throw new UnsupportedOperationException();
        }
    }

    public void a() {
        if (this.f22310j) {
            return;
        }
        this.f22309i = this.f22309i.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(this.f22309i);
        this.f22312l = this.f22312l.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(this.f22312l);
        this.f22310j = true;
    }

    public final int c() {
        return this.f22308h;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        o();
        if (this.f22308h != 0) {
            this.f22307g = null;
            this.f22308h = 0;
        }
        if (this.f22309i.isEmpty()) {
            return;
        }
        this.f22309i.clear();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return l(comparable) >= 0 || this.f22309i.containsKey(comparable);
    }

    public final Iterable d() {
        return this.f22309i.isEmpty() ? Collections.EMPTY_SET : this.f22309i.entrySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        if (this.f22311k == null) {
            this.f22311k = new R1(this, null);
        }
        return this.f22311k;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof T1)) {
            return super.equals(obj);
        }
        T1 t12 = (T1) obj;
        int size = size();
        if (size != t12.size()) {
            return false;
        }
        int i10 = this.f22308h;
        if (i10 != t12.f22308h) {
            return entrySet().equals(t12.entrySet());
        }
        for (int i11 = 0; i11 < i10; i11++) {
            if (!g(i11).equals(t12.g(i11))) {
                return false;
            }
        }
        if (i10 != size) {
            return this.f22309i.equals(t12.f22309i);
        }
        return true;
    }

    @Override // java.util.AbstractMap, java.util.Map
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public final Object put(Comparable comparable, Object obj) {
        o();
        int iL = l(comparable);
        if (iL >= 0) {
            return ((N1) this.f22307g[iL]).setValue(obj);
        }
        o();
        if (this.f22307g == null) {
            this.f22307g = new Object[16];
        }
        int i10 = -(iL + 1);
        if (i10 >= 16) {
            return n().put(comparable, obj);
        }
        if (this.f22308h == 16) {
            N1 n12 = (N1) this.f22307g[15];
            this.f22308h = 15;
            n().put(n12.h(), n12.getValue());
        }
        Object[] objArr = this.f22307g;
        int length = objArr.length;
        System.arraycopy(objArr, i10, objArr, i10 + 1, 15 - i10);
        this.f22307g[i10] = new N1(this, comparable, obj);
        this.f22308h++;
        return null;
    }

    public final Map.Entry g(int i10) {
        if (i10 < this.f22308h) {
            return (N1) this.f22307g[i10];
        }
        throw new ArrayIndexOutOfBoundsException(i10);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int iL = l(comparable);
        return iL >= 0 ? ((N1) this.f22307g[iL]).getValue() : this.f22309i.get(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        int i10 = this.f22308h;
        int iHashCode = 0;
        for (int i11 = 0; i11 < i10; i11++) {
            iHashCode += this.f22307g[i11].hashCode();
        }
        return this.f22309i.size() > 0 ? iHashCode + this.f22309i.hashCode() : iHashCode;
    }

    public final boolean j() {
        return this.f22310j;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        o();
        Comparable comparable = (Comparable) obj;
        int iL = l(comparable);
        if (iL >= 0) {
            return m(iL);
        }
        if (this.f22309i.isEmpty()) {
            return null;
        }
        return this.f22309i.remove(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.f22308h + this.f22309i.size();
    }
}
