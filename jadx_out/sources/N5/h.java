package N5;

import java.io.ObjectStreamException;
import java.io.Serializable;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Comparator;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class h extends AbstractMap implements Serializable {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final Comparator f8120n = new a();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    Comparator f8121g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    e f8122h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    int f8123i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    int f8124j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    final e f8125k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private b f8126l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private c f8127m;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    class a implements Comparator {
        a() {
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(Comparable comparable, Comparable comparable2) {
            return comparable.compareTo(comparable2);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    class b extends AbstractSet {

        /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
        class a extends d {
            a() {
                super();
            }

            @Override // java.util.Iterator
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public Map.Entry next() {
                return b();
            }
        }

        b() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            h.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return (obj instanceof Map.Entry) && h.this.c((Map.Entry) obj) != null;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator iterator() {
            return new a();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            e eVarC;
            if (!(obj instanceof Map.Entry) || (eVarC = h.this.c((Map.Entry) obj)) == null) {
                return false;
            }
            h.this.f(eVarC, true);
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return h.this.f8123i;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    final class c extends AbstractSet {

        /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
        class a extends d {
            a() {
                super();
            }

            @Override // java.util.Iterator
            public Object next() {
                return b().f8141l;
            }
        }

        c() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            h.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return h.this.containsKey(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator iterator() {
            return new a();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            return h.this.g(obj) != null;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return h.this.f8123i;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    private abstract class d implements Iterator {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        e f8132g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        e f8133h = null;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        int f8134i;

        d() {
            this.f8132g = h.this.f8125k.f8139j;
            this.f8134i = h.this.f8124j;
        }

        final e b() {
            e eVar = this.f8132g;
            h hVar = h.this;
            if (eVar == hVar.f8125k) {
                throw new NoSuchElementException();
            }
            if (hVar.f8124j != this.f8134i) {
                throw new ConcurrentModificationException();
            }
            this.f8132g = eVar.f8139j;
            this.f8133h = eVar;
            return eVar;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.f8132g != h.this.f8125k;
        }

        @Override // java.util.Iterator
        public final void remove() {
            e eVar = this.f8133h;
            if (eVar == null) {
                throw new IllegalStateException();
            }
            h.this.f(eVar, true);
            this.f8133h = null;
            this.f8134i = h.this.f8124j;
        }
    }

    public h() {
        this(f8120n);
    }

    private boolean a(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    private void e(e eVar, boolean z10) {
        while (eVar != null) {
            e eVar2 = eVar.f8137h;
            e eVar3 = eVar.f8138i;
            int i10 = eVar2 != null ? eVar2.f8143n : 0;
            int i11 = eVar3 != null ? eVar3.f8143n : 0;
            int i12 = i10 - i11;
            if (i12 == -2) {
                e eVar4 = eVar3.f8137h;
                e eVar5 = eVar3.f8138i;
                int i13 = (eVar4 != null ? eVar4.f8143n : 0) - (eVar5 != null ? eVar5.f8143n : 0);
                if (i13 == -1 || (i13 == 0 && !z10)) {
                    i(eVar);
                } else {
                    j(eVar3);
                    i(eVar);
                }
                if (z10) {
                    return;
                }
            } else if (i12 == 2) {
                e eVar6 = eVar2.f8137h;
                e eVar7 = eVar2.f8138i;
                int i14 = (eVar6 != null ? eVar6.f8143n : 0) - (eVar7 != null ? eVar7.f8143n : 0);
                if (i14 == 1 || (i14 == 0 && !z10)) {
                    j(eVar);
                } else {
                    i(eVar2);
                    j(eVar);
                }
                if (z10) {
                    return;
                }
            } else if (i12 == 0) {
                eVar.f8143n = i10 + 1;
                if (z10) {
                    return;
                }
            } else {
                eVar.f8143n = Math.max(i10, i11) + 1;
                if (!z10) {
                    return;
                }
            }
            eVar = eVar.f8136g;
        }
    }

    private void h(e eVar, e eVar2) {
        e eVar3 = eVar.f8136g;
        eVar.f8136g = null;
        if (eVar2 != null) {
            eVar2.f8136g = eVar3;
        }
        if (eVar3 == null) {
            this.f8122h = eVar2;
        } else if (eVar3.f8137h == eVar) {
            eVar3.f8137h = eVar2;
        } else {
            eVar3.f8138i = eVar2;
        }
    }

    private void i(e eVar) {
        e eVar2 = eVar.f8137h;
        e eVar3 = eVar.f8138i;
        e eVar4 = eVar3.f8137h;
        e eVar5 = eVar3.f8138i;
        eVar.f8138i = eVar4;
        if (eVar4 != null) {
            eVar4.f8136g = eVar;
        }
        h(eVar, eVar3);
        eVar3.f8137h = eVar;
        eVar.f8136g = eVar3;
        int iMax = Math.max(eVar2 != null ? eVar2.f8143n : 0, eVar4 != null ? eVar4.f8143n : 0) + 1;
        eVar.f8143n = iMax;
        eVar3.f8143n = Math.max(iMax, eVar5 != null ? eVar5.f8143n : 0) + 1;
    }

    private void j(e eVar) {
        e eVar2 = eVar.f8137h;
        e eVar3 = eVar.f8138i;
        e eVar4 = eVar2.f8137h;
        e eVar5 = eVar2.f8138i;
        eVar.f8137h = eVar5;
        if (eVar5 != null) {
            eVar5.f8136g = eVar;
        }
        h(eVar, eVar2);
        eVar2.f8138i = eVar;
        eVar.f8136g = eVar2;
        int iMax = Math.max(eVar3 != null ? eVar3.f8143n : 0, eVar5 != null ? eVar5.f8143n : 0) + 1;
        eVar.f8143n = iMax;
        eVar2.f8143n = Math.max(iMax, eVar4 != null ? eVar4.f8143n : 0) + 1;
    }

    private Object writeReplace() throws ObjectStreamException {
        return new LinkedHashMap(this);
    }

    e b(Object obj, boolean z10) {
        int iCompareTo;
        e eVar;
        Comparator comparator = this.f8121g;
        e eVar2 = this.f8122h;
        if (eVar2 != null) {
            Comparable comparable = comparator == f8120n ? (Comparable) obj : null;
            while (true) {
                iCompareTo = comparable != null ? comparable.compareTo(eVar2.f8141l) : comparator.compare(obj, eVar2.f8141l);
                if (iCompareTo == 0) {
                    return eVar2;
                }
                e eVar3 = iCompareTo < 0 ? eVar2.f8137h : eVar2.f8138i;
                if (eVar3 == null) {
                    break;
                }
                eVar2 = eVar3;
            }
        } else {
            iCompareTo = 0;
        }
        if (!z10) {
            return null;
        }
        e eVar4 = this.f8125k;
        if (eVar2 != null) {
            eVar = new e(eVar2, obj, eVar4, eVar4.f8140k);
            if (iCompareTo < 0) {
                eVar2.f8137h = eVar;
            } else {
                eVar2.f8138i = eVar;
            }
            e(eVar2, true);
        } else {
            if (comparator == f8120n && !(obj instanceof Comparable)) {
                throw new ClassCastException(obj.getClass().getName() + " is not Comparable");
            }
            eVar = new e(eVar2, obj, eVar4, eVar4.f8140k);
            this.f8122h = eVar;
        }
        this.f8123i++;
        this.f8124j++;
        return eVar;
    }

    e c(Map.Entry entry) {
        e eVarD = d(entry.getKey());
        if (eVarD == null || !a(eVarD.f8142m, entry.getValue())) {
            return null;
        }
        return eVarD;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        this.f8122h = null;
        this.f8123i = 0;
        this.f8124j++;
        e eVar = this.f8125k;
        eVar.f8140k = eVar;
        eVar.f8139j = eVar;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        return d(obj) != null;
    }

    e d(Object obj) {
        if (obj != null) {
            try {
                return b(obj, false);
            } catch (ClassCastException unused) {
            }
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set entrySet() {
        b bVar = this.f8126l;
        if (bVar != null) {
            return bVar;
        }
        b bVar2 = new b();
        this.f8126l = bVar2;
        return bVar2;
    }

    void f(e eVar, boolean z10) {
        int i10;
        if (z10) {
            e eVar2 = eVar.f8140k;
            eVar2.f8139j = eVar.f8139j;
            eVar.f8139j.f8140k = eVar2;
        }
        e eVar3 = eVar.f8137h;
        e eVar4 = eVar.f8138i;
        e eVar5 = eVar.f8136g;
        int i11 = 0;
        if (eVar3 == null || eVar4 == null) {
            if (eVar3 != null) {
                h(eVar, eVar3);
                eVar.f8137h = null;
            } else if (eVar4 != null) {
                h(eVar, eVar4);
                eVar.f8138i = null;
            } else {
                h(eVar, null);
            }
            e(eVar5, false);
            this.f8123i--;
            this.f8124j++;
            return;
        }
        e eVarB = eVar3.f8143n > eVar4.f8143n ? eVar3.b() : eVar4.a();
        f(eVarB, false);
        e eVar6 = eVar.f8137h;
        if (eVar6 != null) {
            i10 = eVar6.f8143n;
            eVarB.f8137h = eVar6;
            eVar6.f8136g = eVarB;
            eVar.f8137h = null;
        } else {
            i10 = 0;
        }
        e eVar7 = eVar.f8138i;
        if (eVar7 != null) {
            i11 = eVar7.f8143n;
            eVarB.f8138i = eVar7;
            eVar7.f8136g = eVarB;
            eVar.f8138i = null;
        }
        eVarB.f8143n = Math.max(i10, i11) + 1;
        h(eVar, eVarB);
    }

    e g(Object obj) {
        e eVarD = d(obj);
        if (eVarD != null) {
            f(eVarD, true);
        }
        return eVarD;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object get(Object obj) {
        e eVarD = d(obj);
        if (eVarD != null) {
            return eVarD.f8142m;
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set keySet() {
        c cVar = this.f8127m;
        if (cVar != null) {
            return cVar;
        }
        c cVar2 = new c();
        this.f8127m = cVar2;
        return cVar2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object put(Object obj, Object obj2) {
        if (obj == null) {
            throw new NullPointerException("key == null");
        }
        e eVarB = b(obj, true);
        Object obj3 = eVarB.f8142m;
        eVarB.f8142m = obj2;
        return obj3;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object remove(Object obj) {
        e eVarG = g(obj);
        if (eVarG != null) {
            return eVarG.f8142m;
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        return this.f8123i;
    }

    public h(Comparator comparator) {
        this.f8123i = 0;
        this.f8124j = 0;
        this.f8125k = new e();
        this.f8121g = comparator == null ? f8120n : comparator;
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    static final class e implements Map.Entry {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        e f8136g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        e f8137h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        e f8138i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        e f8139j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        e f8140k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        final Object f8141l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        Object f8142m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f8143n;

        e() {
            this.f8141l = null;
            this.f8140k = this;
            this.f8139j = this;
        }

        public e a() {
            e eVar = this;
            for (e eVar2 = this.f8137h; eVar2 != null; eVar2 = eVar2.f8137h) {
                eVar = eVar2;
            }
            return eVar;
        }

        public e b() {
            e eVar = this;
            for (e eVar2 = this.f8138i; eVar2 != null; eVar2 = eVar2.f8138i) {
                eVar = eVar2;
            }
            return eVar;
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                Object obj2 = this.f8141l;
                if (obj2 != null ? obj2.equals(entry.getKey()) : entry.getKey() == null) {
                    Object obj3 = this.f8142m;
                    if (obj3 == null) {
                        if (entry.getValue() == null) {
                            return true;
                        }
                    } else if (obj3.equals(entry.getValue())) {
                        return true;
                    }
                }
            }
            return false;
        }

        @Override // java.util.Map.Entry
        public Object getKey() {
            return this.f8141l;
        }

        @Override // java.util.Map.Entry
        public Object getValue() {
            return this.f8142m;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            Object obj = this.f8141l;
            int iHashCode = obj == null ? 0 : obj.hashCode();
            Object obj2 = this.f8142m;
            return iHashCode ^ (obj2 != null ? obj2.hashCode() : 0);
        }

        @Override // java.util.Map.Entry
        public Object setValue(Object obj) {
            Object obj2 = this.f8142m;
            this.f8142m = obj;
            return obj2;
        }

        public String toString() {
            return this.f8141l + "=" + this.f8142m;
        }

        e(e eVar, Object obj, e eVar2, e eVar3) {
            this.f8136g = eVar;
            this.f8141l = obj;
            this.f8143n = 1;
            this.f8139j = eVar2;
            this.f8140k = eVar3;
            eVar3.f8139j = this;
            eVar2.f8140k = this;
        }
    }
}
