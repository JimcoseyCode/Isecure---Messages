package m8;

import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;
import m8.C2949h;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
abstract class u extends AbstractMap {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int f29719g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private List f29720h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private Map f29721i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f29722j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private volatile e f29723k;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    static class a extends u {
        a(int i10) {
            super(i10, null);
        }

        @Override // m8.u
        public void m() {
            if (!l()) {
                for (int i10 = 0; i10 < i(); i10++) {
                    Map.Entry entryH = h(i10);
                    if (((C2949h.b) entryH.getKey()).c()) {
                        entryH.setValue(Collections.unmodifiableList((List) entryH.getValue()));
                    }
                }
                for (Map.Entry entry : j()) {
                    if (((C2949h.b) entry.getKey()).c()) {
                        entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
                    }
                }
            }
            super.m();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public /* bridge */ /* synthetic */ Object put(Object obj, Object obj2) {
            return super.o((C2949h.b) obj, obj2);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    private static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final Iterator f29724a = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final Iterable f29725b = new C0320b();

        /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
        static class a implements Iterator {
            a() {
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
                throw new UnsupportedOperationException();
            }
        }

        /* JADX INFO: renamed from: m8.u$b$b, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
        static class C0320b implements Iterable {
            C0320b() {
            }

            @Override // java.lang.Iterable
            public Iterator iterator() {
                return b.f29724a;
            }
        }

        static Iterable b() {
            return f29725b;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    private class c implements Comparable, Map.Entry {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final Comparable f29726g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private Object f29727h;

        c(u uVar, Map.Entry entry) {
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
            return j(this.f29726g, entry.getKey()) && j(this.f29727h, entry.getValue());
        }

        @Override // java.util.Map.Entry
        public Object getValue() {
            return this.f29727h;
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public int compareTo(c cVar) {
            return getKey().compareTo(cVar.getKey());
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            Comparable comparable = this.f29726g;
            int iHashCode = comparable == null ? 0 : comparable.hashCode();
            Object obj = this.f29727h;
            return iHashCode ^ (obj != null ? obj.hashCode() : 0);
        }

        @Override // java.util.Map.Entry
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public Comparable getKey() {
            return this.f29726g;
        }

        @Override // java.util.Map.Entry
        public Object setValue(Object obj) {
            u.this.f();
            Object obj2 = this.f29727h;
            this.f29727h = obj;
            return obj2;
        }

        public String toString() {
            String strValueOf = String.valueOf(this.f29726g);
            String strValueOf2 = String.valueOf(this.f29727h);
            StringBuilder sb = new StringBuilder(strValueOf.length() + 1 + strValueOf2.length());
            sb.append(strValueOf);
            sb.append("=");
            sb.append(strValueOf2);
            return sb.toString();
        }

        c(Comparable comparable, Object obj) {
            this.f29726g = comparable;
            this.f29727h = obj;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    private class e extends AbstractSet {
        private e() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            u.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            Object obj2 = u.this.get(entry.getKey());
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
            u.this.o((Comparable) entry.getKey(), entry.getValue());
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator iterator() {
            return new d(u.this, null);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            if (!contains(entry)) {
                return false;
            }
            u.this.remove(entry.getKey());
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return u.this.size();
        }

        /* synthetic */ e(u uVar, a aVar) {
            this();
        }
    }

    /* synthetic */ u(int i10, a aVar) {
        this(i10);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private int e(Comparable comparable) {
        int i10;
        int i11;
        int size = this.f29720h.size();
        int i12 = size - 1;
        if (i12 < 0) {
            i10 = 0;
            while (i10 <= i12) {
                int i13 = (i10 + i12) / 2;
                int iCompareTo = comparable.compareTo(((c) this.f29720h.get(i13)).getKey());
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
            int iCompareTo2 = comparable.compareTo(((c) this.f29720h.get(i12)).getKey());
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
    public void f() {
        if (this.f29722j) {
            throw new UnsupportedOperationException();
        }
    }

    private void g() {
        f();
        if (!this.f29720h.isEmpty() || (this.f29720h instanceof ArrayList)) {
            return;
        }
        this.f29720h = new ArrayList(this.f29719g);
    }

    private SortedMap k() {
        f();
        if (this.f29721i.isEmpty() && !(this.f29721i instanceof TreeMap)) {
            this.f29721i = new TreeMap();
        }
        return (SortedMap) this.f29721i;
    }

    static u n(int i10) {
        return new a(i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Object p(int i10) {
        f();
        Object value = ((c) this.f29720h.remove(i10)).getValue();
        if (!this.f29721i.isEmpty()) {
            Iterator it = k().entrySet().iterator();
            this.f29720h.add(new c(this, (Map.Entry) it.next()));
            it.remove();
        }
        return value;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        f();
        if (!this.f29720h.isEmpty()) {
            this.f29720h.clear();
        }
        if (this.f29721i.isEmpty()) {
            return;
        }
        this.f29721i.clear();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return e(comparable) >= 0 || this.f29721i.containsKey(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set entrySet() {
        if (this.f29723k == null) {
            this.f29723k = new e(this, null);
        }
        return this.f29723k;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int iE = e(comparable);
        return iE >= 0 ? ((c) this.f29720h.get(iE)).getValue() : this.f29721i.get(comparable);
    }

    public Map.Entry h(int i10) {
        return (Map.Entry) this.f29720h.get(i10);
    }

    public int i() {
        return this.f29720h.size();
    }

    public Iterable j() {
        return this.f29721i.isEmpty() ? b.b() : this.f29721i.entrySet();
    }

    public boolean l() {
        return this.f29722j;
    }

    public void m() {
        if (this.f29722j) {
            return;
        }
        this.f29721i = this.f29721i.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(this.f29721i);
        this.f29722j = true;
    }

    public Object o(Comparable comparable, Object obj) {
        f();
        int iE = e(comparable);
        if (iE >= 0) {
            return ((c) this.f29720h.get(iE)).setValue(obj);
        }
        g();
        int i10 = -(iE + 1);
        if (i10 >= this.f29719g) {
            return k().put(comparable, obj);
        }
        int size = this.f29720h.size();
        int i11 = this.f29719g;
        if (size == i11) {
            c cVar = (c) this.f29720h.remove(i11 - 1);
            k().put(cVar.getKey(), cVar.getValue());
        }
        this.f29720h.add(i10, new c(comparable, obj));
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object remove(Object obj) {
        f();
        Comparable comparable = (Comparable) obj;
        int iE = e(comparable);
        if (iE >= 0) {
            return p(iE);
        }
        if (this.f29721i.isEmpty()) {
            return null;
        }
        return this.f29721i.remove(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        return this.f29720h.size() + this.f29721i.size();
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    private class d implements Iterator {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private int f29729g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private boolean f29730h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private Iterator f29731i;

        private d() {
            this.f29729g = -1;
        }

        private Iterator b() {
            if (this.f29731i == null) {
                this.f29731i = u.this.f29721i.entrySet().iterator();
            }
            return this.f29731i;
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public Map.Entry next() {
            this.f29730h = true;
            int i10 = this.f29729g + 1;
            this.f29729g = i10;
            return i10 < u.this.f29720h.size() ? (Map.Entry) u.this.f29720h.get(this.f29729g) : (Map.Entry) b().next();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f29729g + 1 < u.this.f29720h.size() || b().hasNext();
        }

        @Override // java.util.Iterator
        public void remove() {
            if (!this.f29730h) {
                throw new IllegalStateException("remove() was called before next()");
            }
            this.f29730h = false;
            u.this.f();
            if (this.f29729g >= u.this.f29720h.size()) {
                b().remove();
                return;
            }
            u uVar = u.this;
            int i10 = this.f29729g;
            this.f29729g = i10 - 1;
            uVar.p(i10);
        }

        /* synthetic */ d(u uVar, a aVar) {
            this();
        }
    }

    private u(int i10) {
        this.f29719g = i10;
        this.f29720h = Collections.EMPTY_LIST;
        this.f29721i = Collections.EMPTY_MAP;
    }
}
