package B1;

import B1.n;
import com.bumptech.glide.h;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public class r {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final c f315e = new c();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final n f316f = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f317a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final c f318b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Set f319c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final H0.e f320d;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    private static class a implements n {
        a() {
        }

        @Override // B1.n
        public n.a buildLoadData(Object obj, int i10, int i11, v1.h hVar) {
            return null;
        }

        @Override // B1.n
        public boolean handles(Object obj) {
            return false;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    private static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Class f321a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final Class f322b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final o f323c;

        public b(Class cls, Class cls2, o oVar) {
            this.f321a = cls;
            this.f322b = cls2;
            this.f323c = oVar;
        }

        public boolean a(Class cls) {
            return this.f321a.isAssignableFrom(cls);
        }

        public boolean b(Class cls, Class cls2) {
            return a(cls) && this.f322b.isAssignableFrom(cls2);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    static class c {
        c() {
        }

        public q a(List list, H0.e eVar) {
            return new q(list, eVar);
        }
    }

    public r(H0.e eVar) {
        this(eVar, f315e);
    }

    private void a(Class cls, Class cls2, o oVar, boolean z10) {
        b bVar = new b(cls, cls2, oVar);
        List list = this.f317a;
        list.add(z10 ? list.size() : 0, bVar);
    }

    private n c(b bVar) {
        return (n) Q1.k.e(bVar.f323c.build(this));
    }

    private static n f() {
        return f316f;
    }

    private o h(b bVar) {
        return bVar.f323c;
    }

    synchronized void b(Class cls, Class cls2, o oVar) {
        a(cls, cls2, oVar, true);
    }

    public synchronized n d(Class cls, Class cls2) {
        try {
            ArrayList arrayList = new ArrayList();
            boolean z10 = false;
            for (b bVar : this.f317a) {
                if (this.f319c.contains(bVar)) {
                    z10 = true;
                } else if (bVar.b(cls, cls2)) {
                    this.f319c.add(bVar);
                    arrayList.add(c(bVar));
                    this.f319c.remove(bVar);
                }
            }
            if (arrayList.size() > 1) {
                return this.f318b.a(arrayList, this.f320d);
            }
            if (arrayList.size() == 1) {
                return (n) arrayList.get(0);
            }
            if (!z10) {
                throw new h.c(cls, cls2);
            }
            return f();
        } catch (Throwable th) {
            this.f319c.clear();
            throw th;
        }
    }

    synchronized List e(Class cls) {
        ArrayList arrayList;
        try {
            arrayList = new ArrayList();
            for (b bVar : this.f317a) {
                if (!this.f319c.contains(bVar) && bVar.a(cls)) {
                    this.f319c.add(bVar);
                    arrayList.add(c(bVar));
                    this.f319c.remove(bVar);
                }
            }
        } finally {
        }
        return arrayList;
    }

    synchronized List g(Class cls) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        for (b bVar : this.f317a) {
            if (!arrayList.contains(bVar.f322b) && bVar.a(cls)) {
                arrayList.add(bVar.f322b);
            }
        }
        return arrayList;
    }

    synchronized void i(Class cls, Class cls2, o oVar) {
        a(cls, cls2, oVar, false);
    }

    synchronized List j(Class cls, Class cls2) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        Iterator it = this.f317a.iterator();
        while (it.hasNext()) {
            b bVar = (b) it.next();
            if (bVar.b(cls, cls2)) {
                it.remove();
                arrayList.add(h(bVar));
            }
        }
        return arrayList;
    }

    synchronized List k(Class cls, Class cls2, o oVar) {
        List listJ;
        listJ = j(cls, cls2);
        b(cls, cls2, oVar);
        return listJ;
    }

    r(H0.e eVar, c cVar) {
        this.f317a = new ArrayList();
        this.f319c = new HashSet();
        this.f320d = eVar;
        this.f318b = cVar;
    }
}
