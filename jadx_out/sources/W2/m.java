package W2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final D f11995a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final LinkedHashMap f11996b = new LinkedHashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f11997c = 0;

    public m(D d10) {
        this.f11995a = d10;
    }

    private int g(Object obj) {
        if (obj == null) {
            return 0;
        }
        return this.f11995a.a(obj);
    }

    public synchronized boolean a(Object obj) {
        return this.f11996b.containsKey(obj);
    }

    public synchronized Object b(Object obj) {
        return this.f11996b.get(obj);
    }

    public synchronized int c() {
        return this.f11996b.size();
    }

    public synchronized Object d() {
        return this.f11996b.isEmpty() ? null : this.f11996b.keySet().iterator().next();
    }

    public synchronized ArrayList e(c2.l lVar) {
        ArrayList arrayList;
        try {
            arrayList = new ArrayList(this.f11996b.entrySet().size());
            for (Map.Entry entry : this.f11996b.entrySet()) {
                if (lVar == null || lVar.apply(entry.getKey())) {
                    arrayList.add(entry);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return arrayList;
    }

    public synchronized int f() {
        return this.f11997c;
    }

    public synchronized Object h(Object obj, Object obj2) {
        Object objRemove;
        objRemove = this.f11996b.remove(obj);
        this.f11997c -= g(objRemove);
        this.f11996b.put(obj, obj2);
        this.f11997c += g(obj2);
        return objRemove;
    }

    public synchronized Object i(Object obj) {
        Object objRemove;
        objRemove = this.f11996b.remove(obj);
        this.f11997c -= g(objRemove);
        return objRemove;
    }

    public synchronized ArrayList j(c2.l lVar) {
        ArrayList arrayList;
        try {
            arrayList = new ArrayList();
            Iterator it = this.f11996b.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                if (lVar == null || lVar.apply(entry.getKey())) {
                    arrayList.add(entry.getValue());
                    this.f11997c -= g(entry.getValue());
                    it.remove();
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return arrayList;
    }

    public synchronized void k() {
        if (this.f11996b.isEmpty()) {
            this.f11997c = 0;
        }
    }
}
