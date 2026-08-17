package m;

import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public class b implements Iterable {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    c f29492g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private c f29493h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final WeakHashMap f29494i = new WeakHashMap();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f29495j = 0;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    static class a extends e {
        a(c cVar, c cVar2) {
            super(cVar, cVar2);
        }

        @Override // m.b.e
        c c(c cVar) {
            return cVar.f29499j;
        }

        @Override // m.b.e
        c d(c cVar) {
            return cVar.f29498i;
        }
    }

    /* JADX INFO: renamed from: m.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    private static class C0312b extends e {
        C0312b(c cVar, c cVar2) {
            super(cVar, cVar2);
        }

        @Override // m.b.e
        c c(c cVar) {
            return cVar.f29498i;
        }

        @Override // m.b.e
        c d(c cVar) {
            return cVar.f29499j;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    static class c implements Map.Entry {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final Object f29496g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final Object f29497h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        c f29498i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        c f29499j;

        c(Object obj, Object obj2) {
            this.f29496g = obj;
            this.f29497h = obj2;
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.f29496g.equals(cVar.f29496g) && this.f29497h.equals(cVar.f29497h);
        }

        @Override // java.util.Map.Entry
        public Object getKey() {
            return this.f29496g;
        }

        @Override // java.util.Map.Entry
        public Object getValue() {
            return this.f29497h;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            return this.f29496g.hashCode() ^ this.f29497h.hashCode();
        }

        @Override // java.util.Map.Entry
        public Object setValue(Object obj) {
            throw new UnsupportedOperationException("An entry modification is not supported");
        }

        public String toString() {
            return this.f29496g + "=" + this.f29497h;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public class d extends f implements Iterator {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private c f29500g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private boolean f29501h = true;

        d() {
        }

        @Override // m.b.f
        void b(c cVar) {
            c cVar2 = this.f29500g;
            if (cVar == cVar2) {
                c cVar3 = cVar2.f29499j;
                this.f29500g = cVar3;
                this.f29501h = cVar3 == null;
            }
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public Map.Entry next() {
            if (this.f29501h) {
                this.f29501h = false;
                this.f29500g = b.this.f29492g;
            } else {
                c cVar = this.f29500g;
                this.f29500g = cVar != null ? cVar.f29498i : null;
            }
            return this.f29500g;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f29501h) {
                return b.this.f29492g != null;
            }
            c cVar = this.f29500g;
            return (cVar == null || cVar.f29498i == null) ? false : true;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    private static abstract class e extends f implements Iterator {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        c f29503g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        c f29504h;

        e(c cVar, c cVar2) {
            this.f29503g = cVar2;
            this.f29504h = cVar;
        }

        private c f() {
            c cVar = this.f29504h;
            c cVar2 = this.f29503g;
            if (cVar == cVar2 || cVar2 == null) {
                return null;
            }
            return d(cVar);
        }

        @Override // m.b.f
        public void b(c cVar) {
            if (this.f29503g == cVar && cVar == this.f29504h) {
                this.f29504h = null;
                this.f29503g = null;
            }
            c cVar2 = this.f29503g;
            if (cVar2 == cVar) {
                this.f29503g = c(cVar2);
            }
            if (this.f29504h == cVar) {
                this.f29504h = f();
            }
        }

        abstract c c(c cVar);

        abstract c d(c cVar);

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public Map.Entry next() {
            c cVar = this.f29504h;
            this.f29504h = f();
            return cVar;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f29504h != null;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static abstract class f {
        abstract void b(c cVar);
    }

    public Map.Entry d() {
        return this.f29492g;
    }

    public Iterator descendingIterator() {
        C0312b c0312b = new C0312b(this.f29493h, this.f29492g);
        this.f29494i.put(c0312b, Boolean.FALSE);
        return c0312b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (size() != bVar.size()) {
            return false;
        }
        Iterator it = iterator();
        Iterator it2 = bVar.iterator();
        while (it.hasNext() && it2.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            Object next = it2.next();
            if ((entry == null && next != null) || (entry != null && !entry.equals(next))) {
                return false;
            }
        }
        return (it.hasNext() || it2.hasNext()) ? false : true;
    }

    public int hashCode() {
        Iterator it = iterator();
        int iHashCode = 0;
        while (it.hasNext()) {
            iHashCode += ((Map.Entry) it.next()).hashCode();
        }
        return iHashCode;
    }

    @Override // java.lang.Iterable
    public Iterator iterator() {
        a aVar = new a(this.f29492g, this.f29493h);
        this.f29494i.put(aVar, Boolean.FALSE);
        return aVar;
    }

    protected c o(Object obj) {
        c cVar = this.f29492g;
        while (cVar != null && !cVar.f29496g.equals(obj)) {
            cVar = cVar.f29498i;
        }
        return cVar;
    }

    public d p() {
        d dVar = new d();
        this.f29494i.put(dVar, Boolean.FALSE);
        return dVar;
    }

    public Map.Entry q() {
        return this.f29493h;
    }

    c r(Object obj, Object obj2) {
        c cVar = new c(obj, obj2);
        this.f29495j++;
        c cVar2 = this.f29493h;
        if (cVar2 == null) {
            this.f29492g = cVar;
            this.f29493h = cVar;
            return cVar;
        }
        cVar2.f29498i = cVar;
        cVar.f29499j = cVar2;
        this.f29493h = cVar;
        return cVar;
    }

    public Object s(Object obj, Object obj2) {
        c cVarO = o(obj);
        if (cVarO != null) {
            return cVarO.f29497h;
        }
        r(obj, obj2);
        return null;
    }

    public int size() {
        return this.f29495j;
    }

    public Object t(Object obj) {
        c cVarO = o(obj);
        if (cVarO == null) {
            return null;
        }
        this.f29495j--;
        if (!this.f29494i.isEmpty()) {
            Iterator it = this.f29494i.keySet().iterator();
            while (it.hasNext()) {
                ((f) it.next()).b(cVarO);
            }
        }
        c cVar = cVarO.f29499j;
        if (cVar != null) {
            cVar.f29498i = cVarO.f29498i;
        } else {
            this.f29492g = cVarO.f29498i;
        }
        c cVar2 = cVarO.f29498i;
        if (cVar2 != null) {
            cVar2.f29499j = cVar;
        } else {
            this.f29493h = cVar;
        }
        cVarO.f29498i = null;
        cVarO.f29499j = null;
        return cVarO.f29497h;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        Iterator it = iterator();
        while (it.hasNext()) {
            sb.append(((Map.Entry) it.next()).toString());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}
