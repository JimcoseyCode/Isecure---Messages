package Y;

import K.f;
import androidx.lifecycle.AbstractC1764k;
import androidx.lifecycle.C;
import androidx.lifecycle.InterfaceC1770q;
import androidx.lifecycle.r;
import java.util.ArrayDeque;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import y.C3596p;
import y.v0;
import z.InterfaceC3664a;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
final class h {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final Object f12582f = new Object();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static h f12583g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f12584a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map f12585b = new HashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Map f12586c = new HashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ArrayDeque f12587d = new ArrayDeque();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    InterfaceC3664a f12588e;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    static abstract class a {
        a() {
        }

        static a a(r rVar, C3596p c3596p) {
            return new Y.a(System.identityHashCode(rVar), c3596p);
        }

        public abstract C3596p b();

        public abstract int c();
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    private static class b implements InterfaceC1770q {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final h f12589g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private final r f12590h;

        b(r rVar, h hVar) {
            this.f12590h = rVar;
            this.f12589g = hVar;
        }

        r a() {
            return this.f12590h;
        }

        @C(AbstractC1764k.a.ON_DESTROY)
        public void onDestroy(r rVar) {
            this.f12589g.o(rVar);
        }

        @C(AbstractC1764k.a.ON_START)
        public void onStart(r rVar) {
            this.f12589g.j(rVar);
        }

        @C(AbstractC1764k.a.ON_STOP)
        public void onStop(r rVar) {
            this.f12589g.k(rVar);
        }
    }

    h() {
    }

    static h c() {
        h hVar;
        synchronized (f12582f) {
            try {
                if (f12583g == null) {
                    f12583g = new h();
                }
                hVar = f12583g;
            } catch (Throwable th) {
                throw th;
            }
        }
        return hVar;
    }

    private b e(r rVar) {
        synchronized (this.f12584a) {
            try {
                for (b bVar : this.f12586c.keySet()) {
                    if (rVar.equals(bVar.a())) {
                        return bVar;
                    }
                }
                return null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private boolean g(r rVar) {
        synchronized (this.f12584a) {
            try {
                b bVarE = e(rVar);
                if (bVarE == null) {
                    return false;
                }
                Iterator it = ((Set) this.f12586c.get(bVarE)).iterator();
                while (it.hasNext()) {
                    if (!((c) H0.g.g((c) this.f12585b.get((a) it.next()))).v().isEmpty()) {
                        return true;
                    }
                }
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private void h(c cVar) {
        synchronized (this.f12584a) {
            try {
                r rVarU = cVar.u();
                a aVarA = a.a(rVarU, cVar.t().J());
                b bVarE = e(rVarU);
                Set hashSet = bVarE != null ? (Set) this.f12586c.get(bVarE) : new HashSet();
                hashSet.add(aVarA);
                this.f12585b.put(aVarA, cVar);
                if (bVarE == null) {
                    b bVar = new b(rVarU, this);
                    this.f12586c.put(bVar, hashSet);
                    rVarU.getLifecycle().a(bVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private void l(r rVar) {
        synchronized (this.f12584a) {
            try {
                b bVarE = e(rVar);
                if (bVarE == null) {
                    return;
                }
                Iterator it = ((Set) this.f12586c.get(bVarE)).iterator();
                while (it.hasNext()) {
                    ((c) H0.g.g((c) this.f12585b.get((a) it.next()))).y();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private void n(c cVar) {
        synchronized (this.f12584a) {
            try {
                r rVarU = cVar.u();
                a aVarA = a.a(rVarU, cVar.t().J());
                this.f12585b.remove(aVarA);
                HashSet hashSet = new HashSet();
                for (b bVar : this.f12586c.keySet()) {
                    if (rVarU.equals(bVar.a())) {
                        Set set = (Set) this.f12586c.get(bVar);
                        set.remove(aVarA);
                        if (set.isEmpty()) {
                            hashSet.add(bVar.a());
                        }
                    }
                }
                Iterator it = hashSet.iterator();
                while (it.hasNext()) {
                    o((r) it.next());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private void p(r rVar) {
        synchronized (this.f12584a) {
            try {
                Iterator it = ((Set) this.f12586c.get(e(rVar))).iterator();
                while (it.hasNext()) {
                    c cVar = (c) this.f12585b.get((a) it.next());
                    if (!((c) H0.g.g(cVar)).v().isEmpty()) {
                        cVar.A();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    void a(c cVar, v0 v0Var, InterfaceC3664a interfaceC3664a) {
        synchronized (this.f12584a) {
            try {
                H0.g.a(!v0Var.k().isEmpty());
                this.f12588e = interfaceC3664a;
                r rVarU = cVar.u();
                b bVarE = e(rVarU);
                if (bVarE == null) {
                    return;
                }
                Set set = (Set) this.f12586c.get(bVarE);
                InterfaceC3664a interfaceC3664a2 = this.f12588e;
                if (interfaceC3664a2 == null || interfaceC3664a2.c() != 2) {
                    Iterator it = set.iterator();
                    while (it.hasNext()) {
                        c cVar2 = (c) H0.g.g((c) this.f12585b.get((a) it.next()));
                        if (!cVar2.equals(cVar) && !cVar2.v().isEmpty()) {
                            if (cVar2.x() || v0Var.m()) {
                                throw new IllegalArgumentException("Multiple LifecycleCameras with use cases are registered to the same LifecycleOwner. Please unbind first.");
                            }
                            cVar2.z();
                        }
                    }
                }
                try {
                    cVar.s(v0Var);
                    if (rVarU.getLifecycle().b().j(AbstractC1764k.b.f17593j)) {
                        j(rVarU);
                    }
                } catch (f.a e10) {
                    throw new IllegalArgumentException(e10);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    c b(r rVar, K.f fVar) {
        synchronized (this.f12584a) {
            try {
                H0.g.b(this.f12585b.get(a.a(rVar, fVar.J())) == null, "LifecycleCamera already exists for the given LifecycleOwner and set of cameras");
                c cVar = new c(rVar, fVar);
                if (fVar.O().isEmpty()) {
                    cVar.y();
                }
                if (rVar.getLifecycle().b() == AbstractC1764k.b.f17590g) {
                    return cVar;
                }
                h(cVar);
                return cVar;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    c d(r rVar, C3596p c3596p) {
        c cVar;
        synchronized (this.f12584a) {
            cVar = (c) this.f12585b.get(a.a(rVar, c3596p));
        }
        return cVar;
    }

    Collection f() {
        Collection collectionUnmodifiableCollection;
        synchronized (this.f12584a) {
            collectionUnmodifiableCollection = Collections.unmodifiableCollection(this.f12585b.values());
        }
        return collectionUnmodifiableCollection;
    }

    void i(Set set) {
        synchronized (this.f12584a) {
            if (set == null) {
                try {
                    set = this.f12585b.keySet();
                } catch (Throwable th) {
                    throw th;
                }
            }
            for (a aVar : set) {
                if (this.f12585b.containsKey(aVar)) {
                    n((c) this.f12585b.get(aVar));
                }
            }
        }
    }

    void j(r rVar) {
        synchronized (this.f12584a) {
            try {
                if (g(rVar)) {
                    if (this.f12587d.isEmpty()) {
                        this.f12587d.push(rVar);
                    } else {
                        InterfaceC3664a interfaceC3664a = this.f12588e;
                        if (interfaceC3664a == null || interfaceC3664a.c() != 2) {
                            r rVar2 = (r) this.f12587d.peek();
                            if (!rVar.equals(rVar2)) {
                                l(rVar2);
                                this.f12587d.remove(rVar);
                                this.f12587d.push(rVar);
                            }
                        }
                    }
                    p(rVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    void k(r rVar) {
        synchronized (this.f12584a) {
            try {
                this.f12587d.remove(rVar);
                l(rVar);
                if (!this.f12587d.isEmpty()) {
                    p((r) this.f12587d.peek());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    void m(Set set) {
        synchronized (this.f12584a) {
            if (set == null) {
                try {
                    set = this.f12585b.keySet();
                } catch (Throwable th) {
                    throw th;
                }
            }
            Iterator it = set.iterator();
            while (it.hasNext()) {
                c cVar = (c) this.f12585b.get((a) it.next());
                if (cVar != null) {
                    cVar.z();
                    k(cVar.u());
                }
            }
        }
    }

    void o(r rVar) {
        synchronized (this.f12584a) {
            try {
                b bVarE = e(rVar);
                if (bVarE == null) {
                    return;
                }
                k(rVar);
                Iterator it = ((Set) this.f12586c.get(bVarE)).iterator();
                while (it.hasNext()) {
                    this.f12585b.remove((a) it.next());
                }
                this.f12586c.remove(bVarE);
                bVarE.a().getLifecycle().d(bVarE);
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
