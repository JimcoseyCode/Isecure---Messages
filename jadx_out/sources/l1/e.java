package L1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import v1.j;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f7218a = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map f7219b = new HashMap();

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    private static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Class f7220a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final Class f7221b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final j f7222c;

        public a(Class cls, Class cls2, j jVar) {
            this.f7220a = cls;
            this.f7221b = cls2;
            this.f7222c = jVar;
        }

        public boolean a(Class cls, Class cls2) {
            return this.f7220a.isAssignableFrom(cls) && cls2.isAssignableFrom(this.f7221b);
        }
    }

    private synchronized List c(String str) {
        List arrayList;
        try {
            if (!this.f7218a.contains(str)) {
                this.f7218a.add(str);
            }
            arrayList = (List) this.f7219b.get(str);
            if (arrayList == null) {
                arrayList = new ArrayList();
                this.f7219b.put(str, arrayList);
            }
        } catch (Throwable th) {
            throw th;
        }
        return arrayList;
    }

    public synchronized void a(String str, j jVar, Class cls, Class cls2) {
        c(str).add(new a(cls, cls2, jVar));
    }

    public synchronized List b(Class cls, Class cls2) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        Iterator it = this.f7218a.iterator();
        while (it.hasNext()) {
            List<a> list = (List) this.f7219b.get((String) it.next());
            if (list != null) {
                for (a aVar : list) {
                    if (aVar.a(cls, cls2)) {
                        arrayList.add(aVar.f7222c);
                    }
                }
            }
        }
        return arrayList;
    }

    public synchronized List d(Class cls, Class cls2) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        Iterator it = this.f7218a.iterator();
        while (it.hasNext()) {
            List<a> list = (List) this.f7219b.get((String) it.next());
            if (list != null) {
                for (a aVar : list) {
                    if (aVar.a(cls, cls2) && !arrayList.contains(aVar.f7221b)) {
                        arrayList.add(aVar.f7221b);
                    }
                }
            }
        }
        return arrayList;
    }

    public synchronized void e(String str, j jVar, Class cls, Class cls2) {
        c(str).add(0, new a(cls, cls2, jVar));
    }

    public synchronized void f(List list) {
        try {
            ArrayList<String> arrayList = new ArrayList(this.f7218a);
            this.f7218a.clear();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                this.f7218a.add((String) it.next());
            }
            for (String str : arrayList) {
                if (!list.contains(str)) {
                    this.f7218a.add(str);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
