package B1;

import com.bumptech.glide.h;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final r f302a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final a f303b;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    private static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Map f304a = new HashMap();

        /* JADX INFO: renamed from: B1.p$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
        private static class C0013a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final List f305a;

            public C0013a(List list) {
                this.f305a = list;
            }
        }

        a() {
        }

        public void a() {
            this.f304a.clear();
        }

        public List b(Class cls) {
            C0013a c0013a = (C0013a) this.f304a.get(cls);
            if (c0013a == null) {
                return null;
            }
            return c0013a.f305a;
        }

        public void c(Class cls, List list) {
            if (((C0013a) this.f304a.put(cls, new C0013a(list))) == null) {
                return;
            }
            throw new IllegalStateException("Already cached loaders for model: " + cls);
        }
    }

    public p(H0.e eVar) {
        this(new r(eVar));
    }

    private static Class b(Object obj) {
        return obj.getClass();
    }

    private synchronized List e(Class cls) {
        List listB;
        listB = this.f303b.b(cls);
        if (listB == null) {
            listB = Collections.unmodifiableList(this.f302a.e(cls));
            this.f303b.c(cls, listB);
        }
        return listB;
    }

    private void h(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((o) it.next()).teardown();
        }
    }

    public synchronized void a(Class cls, Class cls2, o oVar) {
        this.f302a.b(cls, cls2, oVar);
        this.f303b.a();
    }

    public synchronized List c(Class cls) {
        return this.f302a.g(cls);
    }

    public List d(Object obj) {
        List listE = e(b(obj));
        if (listE.isEmpty()) {
            throw new h.c(obj);
        }
        int size = listE.size();
        List arrayList = Collections.EMPTY_LIST;
        boolean z10 = true;
        for (int i10 = 0; i10 < size; i10++) {
            n nVar = (n) listE.get(i10);
            if (nVar.handles(obj)) {
                if (z10) {
                    arrayList = new ArrayList(size - i10);
                    z10 = false;
                }
                arrayList.add(nVar);
            }
        }
        if (arrayList.isEmpty()) {
            throw new h.c(obj, listE);
        }
        return arrayList;
    }

    public synchronized void f(Class cls, Class cls2, o oVar) {
        this.f302a.i(cls, cls2, oVar);
        this.f303b.a();
    }

    public synchronized void g(Class cls, Class cls2, o oVar) {
        h(this.f302a.k(cls, cls2, oVar));
        this.f303b.a();
    }

    private p(r rVar) {
        this.f303b = new a();
        this.f302a = rVar;
    }
}
