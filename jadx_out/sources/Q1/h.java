package Q1;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map f9030a = new LinkedHashMap(100, 0.75f, true);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f9031b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f9032c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f9033d;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Object f9034a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final int f9035b;

        a(Object obj, int i10) {
            this.f9034a = obj;
            this.f9035b = i10;
        }
    }

    public h(long j10) {
        this.f9031b = j10;
        this.f9032c = j10;
    }

    private void f() {
        m(this.f9032c);
    }

    public void b() {
        m(0L);
    }

    public synchronized Object g(Object obj) {
        a aVar;
        aVar = (a) this.f9030a.get(obj);
        return aVar != null ? aVar.f9034a : null;
    }

    public synchronized long h() {
        return this.f9032c;
    }

    protected int i(Object obj) {
        return 1;
    }

    public synchronized Object k(Object obj, Object obj2) {
        int i10 = i(obj2);
        long j10 = i10;
        if (j10 >= this.f9032c) {
            j(obj, obj2);
            return null;
        }
        if (obj2 != null) {
            this.f9033d += j10;
        }
        a aVar = (a) this.f9030a.put(obj, obj2 == null ? null : new a(obj2, i10));
        if (aVar != null) {
            this.f9033d -= (long) aVar.f9035b;
            if (!aVar.f9034a.equals(obj2)) {
                j(obj, aVar.f9034a);
            }
        }
        f();
        return aVar != null ? aVar.f9034a : null;
    }

    public synchronized Object l(Object obj) {
        a aVar = (a) this.f9030a.remove(obj);
        if (aVar == null) {
            return null;
        }
        this.f9033d -= (long) aVar.f9035b;
        return aVar.f9034a;
    }

    protected synchronized void m(long j10) {
        while (this.f9033d > j10) {
            Iterator it = this.f9030a.entrySet().iterator();
            Map.Entry entry = (Map.Entry) it.next();
            a aVar = (a) entry.getValue();
            this.f9033d -= (long) aVar.f9035b;
            Object key = entry.getKey();
            it.remove();
            j(key, aVar.f9034a);
        }
    }

    protected void j(Object obj, Object obj2) {
    }
}
