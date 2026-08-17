package L1;

import I1.g;
import Q1.j;
import java.util.Collections;
import java.util.concurrent.atomic.AtomicReference;
import m0.C2892a;
import x1.C3525i;
import x1.t;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public class c {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final t f7213c = new t(Object.class, Object.class, Object.class, Collections.singletonList(new C3525i(Object.class, Object.class, Object.class, Collections.EMPTY_LIST, new g(), null)), null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C2892a f7214a = new C2892a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AtomicReference f7215b = new AtomicReference();

    private j b(Class cls, Class cls2, Class cls3) {
        j jVar = (j) this.f7215b.getAndSet(null);
        if (jVar == null) {
            jVar = new j();
        }
        jVar.a(cls, cls2, cls3);
        return jVar;
    }

    public t a(Class cls, Class cls2, Class cls3) {
        t tVar;
        j jVarB = b(cls, cls2, cls3);
        synchronized (this.f7214a) {
            tVar = (t) this.f7214a.get(jVarB);
        }
        this.f7215b.set(jVarB);
        return tVar;
    }

    public boolean c(t tVar) {
        return f7213c.equals(tVar);
    }

    public void d(Class cls, Class cls2, Class cls3, t tVar) {
        synchronized (this.f7214a) {
            C2892a c2892a = this.f7214a;
            j jVar = new j(cls, cls2, cls3);
            if (tVar == null) {
                tVar = f7213c;
            }
            c2892a.put(jVar, tVar);
        }
    }
}
