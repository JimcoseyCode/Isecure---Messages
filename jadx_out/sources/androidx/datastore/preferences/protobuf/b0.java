package androidx.datastore.preferences.protobuf;

import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
abstract class b0 extends AbstractMap {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private List f16802g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private Map f16803h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f16804i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private volatile f f16805j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private Map f16806k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private volatile c f16807l;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    class a extends b0 {
        a() {
            super(null);
        }

        @Override // androidx.datastore.preferences.protobuf.b0
        public void p() {
            if (!o()) {
                if (k() > 0) {
                    android.support.v4.media.session.b.a(j(0).getKey());
                    throw null;
                }
                Iterator it = m().iterator();
                if (it.hasNext()) {
                    android.support.v4.media.session.b.a(((Map.Entry) it.next()).getKey());
                    throw null;
                }
            }
            super.p();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public /* bridge */ /* synthetic */ Object put(Object obj, Object obj2) {
            return super.r((Comparable) obj, obj2);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    private class c extends f {
        private c() {
            super(b0.this, null);
        }

        @Override // androidx.datastore.preferences.protobuf.b0.f, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator iterator() {
            return new b(b0.this, null);
        }

        /* synthetic */ c(b0 b0Var, a aVar) {
            this();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    private class d implements Map.Entry, Comparable {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final Comparable f16812g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private Object f16813h;

        d(b0 b0Var, Map.Entry entry) {
            this((Comparable) entry.getKey(), entry.getValue());
        }

        private boolean j(Object obj, Object obj2) {
            return obj == null ? obj2 == null : obj.equals(obj2);
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            return j(this.f16812g, entry.getKey()) && j(this.f16813h, entry.getValue());
        }

        @Override // java.util.Map.Entry
        public Object getValue() {
            return this.f16813h;
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public int compareTo(d dVar) {
            return getKey().compareTo(dVar.getKey());
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            Comparable comparable = this.f16812g;
            int iHashCode = comparable == null ? 0 : comparable.hashCode();
            Object obj = this.f16813h;
            return iHashCode ^ (obj != null ? obj.hashCode() : 0);
        }

        @Override // java.util.Map.Entry
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public Comparable getKey() {
            return this.f16812g;
        }

        @Override // java.util.Map.Entry
        public Object setValue(Object obj) {
            b0.this.g();
            Object obj2 = this.f16813h;
            this.f16813h = obj;
            return obj2;
        }

        public String toString() {
            return this.f16812g + "=" + this.f16813h;
        }

        d(Comparable comparable, Object obj) {
            this.f16812g = comparable;
            this.f16813h = obj;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    private class f extends AbstractSet {
        private f() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            b0.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            Object obj2 = b0.this.get(entry.getKey());
            Object value = entry.getValue();
            if (obj2 != value) {
                return obj2 != null && obj2.equals(value);
            }
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public boolean add(Map.Entry entry) {
            if (contains(entry)) {
                return false;
            }
            b0.this.r((Comparable) entry.getKey(), entry.getValue());
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator iterator() {
            return new e(b0.this, null);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            if (!contains(entry)) {
                return false;
            }
            b0.this.remove(entry.getKey());
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return b0.this.size();
        }

        /* synthetic */ f(b0 b0Var, a aVar) {
            this();
        }
    }

    /* synthetic */ b0(a aVar) {
        this();
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private int f(Comparable comparable) {
        int i10;
        int i11;
        int size = this.f16802g.size();
        int i12 = size - 1;
        if (i12 < 0) {
            i10 = 0;
            while (i10 <= i12) {
                int i13 = (i10 + i12) / 2;
                int iCompareTo = comparable.compareTo(((d) this.f16802g.get(i13)).getKey());
                if (iCompareTo < 0) {
                    i12 = i13 - 1;
                } else {
                    if (iCompareTo <= 0) {
                        return i13;
                    }
                    i10 = i13 + 1;
                }
            }
            i11 = i10 + 1;
        } else {
            int iCompareTo2 = comparable.compareTo(((d) this.f16802g.get(i12)).getKey());
            if (iCompareTo2 > 0) {
                i11 = size + 1;
            } else {
                if (iCompareTo2 == 0) {
                    return i12;
                }
                i10 = 0;
                while (i10 <= i12) {
                }
                i11 = i10 + 1;
            }
        }
        return -i11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g() {
        if (this.f16804i) {
            throw new UnsupportedOperationException();
        }
    }

    private void i() {
        g();
        if (!this.f16802g.isEmpty() || (this.f16802g instanceof ArrayList)) {
            return;
        }
        this.f16802g = new ArrayList(16);
    }

    private SortedMap n() {
        g();
        if (this.f16803h.isEmpty() && !(this.f16803h instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.f16803h = treeMap;
            this.f16806k = treeMap.descendingMap();
        }
        return (SortedMap) this.f16803h;
    }

    static b0 q() {
        return new a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Object s(int i10) {
        g();
        Object value = ((d) this.f16802g.remove(i10)).getValue();
        if (!this.f16803h.isEmpty()) {
            Iterator it = n().entrySet().iterator();
            this.f16802g.add(new d(this, (Map.Entry) it.next()));
            it.remove();
        }
        return value;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        g();
        if (!this.f16802g.isEmpty()) {
            this.f16802g.clear();
        }
        if (this.f16803h.isEmpty()) {
            return;
        }
        this.f16803h.clear();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return f(comparable) >= 0 || this.f16803h.containsKey(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set entrySet() {
        if (this.f16805j == null) {
            this.f16805j = new f(this, null);
        }
        return this.f16805j;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b0)) {
            return super.equals(obj);
        }
        b0 b0Var = (b0) obj;
        int size = size();
        if (size != b0Var.size()) {
            return false;
        }
        int iK = k();
        if (iK != b0Var.k()) {
            return entrySet().equals(b0Var.entrySet());
        }
        for (int i10 = 0; i10 < iK; i10++) {
            if (!j(i10).equals(b0Var.j(i10))) {
                return false;
            }
        }
        if (iK != size) {
            return this.f16803h.equals(b0Var.f16803h);
        }
        return true;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int iF = f(comparable);
        return iF >= 0 ? ((d) this.f16802g.get(iF)).getValue() : this.f16803h.get(comparable);
    }

    Set h() {
        if (this.f16807l == null) {
            this.f16807l = new c(this, null);
        }
        return this.f16807l;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int hashCode() {
        int iK = k();
        int iHashCode = 0;
        for (int i10 = 0; i10 < iK; i10++) {
            iHashCode += ((d) this.f16802g.get(i10)).hashCode();
        }
        return l() > 0 ? iHashCode + this.f16803h.hashCode() : iHashCode;
    }

    public Map.Entry j(int i10) {
        return (Map.Entry) this.f16802g.get(i10);
    }

    public int k() {
        return this.f16802g.size();
    }

    public int l() {
        return this.f16803h.size();
    }

    public Iterable m() {
        return this.f16803h.isEmpty() ? Collections.EMPTY_SET : this.f16803h.entrySet();
    }

    public boolean o() {
        return this.f16804i;
    }

    public void p() {
        if (this.f16804i) {
            return;
        }
        this.f16803h = this.f16803h.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(this.f16803h);
        this.f16806k = this.f16806k.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(this.f16806k);
        this.f16804i = true;
    }

    public Object r(Comparable comparable, Object obj) {
        g();
        int iF = f(comparable);
        if (iF >= 0) {
            return ((d) this.f16802g.get(iF)).setValue(obj);
        }
        i();
        int i10 = -(iF + 1);
        if (i10 >= 16) {
            return n().put(comparable, obj);
        }
        if (this.f16802g.size() == 16) {
            d dVar = (d) this.f16802g.remove(15);
            n().put(dVar.getKey(), dVar.getValue());
        }
        this.f16802g.add(i10, new d(comparable, obj));
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object remove(Object obj) {
        g();
        Comparable comparable = (Comparable) obj;
        int iF = f(comparable);
        if (iF >= 0) {
            return s(iF);
        }
        if (this.f16803h.isEmpty()) {
            return null;
        }
        return this.f16803h.remove(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        return this.f16802g.size() + this.f16803h.size();
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    private class b implements Iterator {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private int f16808g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private Iterator f16809h;

        private b() {
            this.f16808g = b0.this.f16802g.size();
        }

        private Iterator b() {
            if (this.f16809h == null) {
                this.f16809h = b0.this.f16806k.entrySet().iterator();
            }
            return this.f16809h;
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public Map.Entry next() {
            if (b().hasNext()) {
                return (Map.Entry) b().next();
            }
            List list = b0.this.f16802g;
            int i10 = this.f16808g - 1;
            this.f16808g = i10;
            return (Map.Entry) list.get(i10);
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            int i10 = this.f16808g;
            return (i10 > 0 && i10 <= b0.this.f16802g.size()) || b().hasNext();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }

        /* synthetic */ b(b0 b0Var, a aVar) {
            this();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    private class e implements Iterator {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private int f16815g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private boolean f16816h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private Iterator f16817i;

        private e() {
            this.f16815g = -1;
        }

        private Iterator b() {
            if (this.f16817i == null) {
                this.f16817i = b0.this.f16803h.entrySet().iterator();
            }
            return this.f16817i;
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public Map.Entry next() {
            this.f16816h = true;
            int i10 = this.f16815g + 1;
            this.f16815g = i10;
            return i10 < b0.this.f16802g.size() ? (Map.Entry) b0.this.f16802g.get(this.f16815g) : (Map.Entry) b().next();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f16815g + 1 < b0.this.f16802g.size() || (!b0.this.f16803h.isEmpty() && b().hasNext());
        }

        @Override // java.util.Iterator
        public void remove() {
            if (!this.f16816h) {
                throw new IllegalStateException("remove() was called before next()");
            }
            this.f16816h = false;
            b0.this.g();
            if (this.f16815g >= b0.this.f16802g.size()) {
                b().remove();
                return;
            }
            b0 b0Var = b0.this;
            int i10 = this.f16815g;
            this.f16815g = i10 - 1;
            b0Var.s(i10);
        }

        /* synthetic */ e(b0 b0Var, a aVar) {
            this();
        }
    }

    private b0() {
        this.f16802g = Collections.EMPTY_LIST;
        Map map = Collections.EMPTY_MAP;
        this.f16803h = map;
        this.f16806k = map;
    }
}
