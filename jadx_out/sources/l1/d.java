package L1;

import Q1.j;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import m0.C2892a;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AtomicReference f7216a = new AtomicReference();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C2892a f7217b = new C2892a();

    public List a(Class cls, Class cls2, Class cls3) {
        List list;
        j jVar = (j) this.f7216a.getAndSet(null);
        if (jVar == null) {
            jVar = new j(cls, cls2, cls3);
        } else {
            jVar.a(cls, cls2, cls3);
        }
        synchronized (this.f7217b) {
            list = (List) this.f7217b.get(jVar);
        }
        this.f7216a.set(jVar);
        return list;
    }

    public void b(Class cls, Class cls2, Class cls3, List list) {
        synchronized (this.f7217b) {
            this.f7217b.put(new j(cls, cls2, cls3), list);
        }
    }
}
