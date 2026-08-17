package q5;

import com.google.firebase.components.ComponentRegistrar;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import q5.n;
import u5.InterfaceC3403a;
import z5.InterfaceC3678c;
import z5.InterfaceC3679d;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public class n implements InterfaceC3120d, InterfaceC3403a {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final C5.b f30794i = new C5.b() { // from class: q5.j
        @Override // C5.b
        public final Object get() {
            return Collections.EMPTY_SET;
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map f30795a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map f30796b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Map f30797c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final List f30798d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Set f30799e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final u f30800f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final AtomicReference f30801g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final i f30802h;

    public static /* synthetic */ Object h(n nVar, C3119c c3119c) {
        nVar.getClass();
        return c3119c.h().a(new E(c3119c, nVar));
    }

    public static b k(Executor executor) {
        return new b(executor);
    }

    private void l(List list) {
        ArrayList arrayList = new ArrayList();
        synchronized (this) {
            Iterator it = this.f30798d.iterator();
            while (it.hasNext()) {
                try {
                    ComponentRegistrar componentRegistrar = (ComponentRegistrar) ((C5.b) it.next()).get();
                    if (componentRegistrar != null) {
                        list.addAll(this.f30802h.a(componentRegistrar));
                        it.remove();
                    }
                } catch (v unused) {
                    it.remove();
                }
            }
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                Object[] array = ((C3119c) it2.next()).j().toArray();
                int length = array.length;
                int i10 = 0;
                while (true) {
                    if (i10 < length) {
                        Object obj = array[i10];
                        if (obj.toString().contains("kotlinx.coroutines.CoroutineDispatcher")) {
                            if (this.f30799e.contains(obj.toString())) {
                                it2.remove();
                                break;
                            }
                            this.f30799e.add(obj.toString());
                        }
                        i10++;
                    }
                }
            }
            if (this.f30795a.isEmpty()) {
                p.a(list);
            } else {
                ArrayList arrayList2 = new ArrayList(this.f30795a.keySet());
                arrayList2.addAll(list);
                p.a(arrayList2);
            }
            Iterator it3 = list.iterator();
            while (it3.hasNext()) {
                final C3119c c3119c = (C3119c) it3.next();
                this.f30795a.put(c3119c, new w(new C5.b() { // from class: q5.k
                    @Override // C5.b
                    public final Object get() {
                        return n.h(this.f30788a, c3119c);
                    }
                }));
            }
            arrayList.addAll(r(list));
            arrayList.addAll(s());
            q();
        }
        Iterator it4 = arrayList.iterator();
        while (it4.hasNext()) {
            ((Runnable) it4.next()).run();
        }
        p();
    }

    private void m(Map map, boolean z10) {
        for (Map.Entry entry : map.entrySet()) {
            C3119c c3119c = (C3119c) entry.getKey();
            C5.b bVar = (C5.b) entry.getValue();
            if (c3119c.n() || (c3119c.o() && z10)) {
                bVar.get();
            }
        }
        this.f30800f.c();
    }

    private static List o(Iterable iterable) {
        ArrayList arrayList = new ArrayList();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        return arrayList;
    }

    private void p() {
        Boolean bool = (Boolean) this.f30801g.get();
        if (bool != null) {
            m(this.f30795a, bool.booleanValue());
        }
    }

    private void q() {
        for (C3119c c3119c : this.f30795a.keySet()) {
            for (q qVar : c3119c.g()) {
                if (qVar.f() && !this.f30797c.containsKey(qVar.b())) {
                    this.f30797c.put(qVar.b(), x.b(Collections.EMPTY_SET));
                } else if (this.f30796b.containsKey(qVar.b())) {
                    continue;
                } else {
                    if (qVar.e()) {
                        throw new y(String.format("Unsatisfied dependency for component %s: %s", c3119c, qVar.b()));
                    }
                    if (!qVar.f()) {
                        this.f30796b.put(qVar.b(), C3115B.c());
                    }
                }
            }
        }
    }

    private List r(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C3119c c3119c = (C3119c) it.next();
            if (c3119c.p()) {
                final C5.b bVar = (C5.b) this.f30795a.get(c3119c);
                for (D d10 : c3119c.j()) {
                    if (this.f30796b.containsKey(d10)) {
                        final C3115B c3115b = (C3115B) ((C5.b) this.f30796b.get(d10));
                        arrayList.add(new Runnable() { // from class: q5.l
                            @Override // java.lang.Runnable
                            public final void run() {
                                c3115b.d(bVar);
                            }
                        });
                    } else {
                        this.f30796b.put(d10, bVar);
                    }
                }
            }
        }
        return arrayList;
    }

    private List s() {
        ArrayList arrayList = new ArrayList();
        HashMap map = new HashMap();
        for (Map.Entry entry : this.f30795a.entrySet()) {
            C3119c c3119c = (C3119c) entry.getKey();
            if (!c3119c.p()) {
                C5.b bVar = (C5.b) entry.getValue();
                for (D d10 : c3119c.j()) {
                    if (!map.containsKey(d10)) {
                        map.put(d10, new HashSet());
                    }
                    ((Set) map.get(d10)).add(bVar);
                }
            }
        }
        for (Map.Entry entry2 : map.entrySet()) {
            if (this.f30797c.containsKey(entry2.getKey())) {
                final x xVar = (x) this.f30797c.get(entry2.getKey());
                for (final C5.b bVar2 : (Set) entry2.getValue()) {
                    arrayList.add(new Runnable() { // from class: q5.m
                        @Override // java.lang.Runnable
                        public final void run() {
                            xVar.a(bVar2);
                        }
                    });
                }
            } else {
                this.f30797c.put((D) entry2.getKey(), x.b((Collection) entry2.getValue()));
            }
        }
        return arrayList;
    }

    @Override // q5.InterfaceC3120d
    public synchronized C5.b d(D d10) {
        x xVar = (x) this.f30797c.get(d10);
        if (xVar != null) {
            return xVar;
        }
        return f30794i;
    }

    @Override // q5.InterfaceC3120d
    public synchronized C5.b f(D d10) {
        AbstractC3116C.c(d10, "Null interface requested.");
        return (C5.b) this.f30796b.get(d10);
    }

    public void n(boolean z10) {
        HashMap map;
        if (androidx.camera.view.i.a(this.f30801g, null, Boolean.valueOf(z10))) {
            synchronized (this) {
                map = new HashMap(this.f30795a);
            }
            m(map, z10);
        }
    }

    private n(Executor executor, Iterable iterable, Collection collection, i iVar) {
        this.f30795a = new HashMap();
        this.f30796b = new HashMap();
        this.f30797c = new HashMap();
        this.f30799e = new HashSet();
        this.f30801g = new AtomicReference();
        u uVar = new u(executor);
        this.f30800f = uVar;
        this.f30802h = iVar;
        ArrayList arrayList = new ArrayList();
        arrayList.add(C3119c.q(uVar, u.class, InterfaceC3679d.class, InterfaceC3678c.class));
        arrayList.add(C3119c.q(this, InterfaceC3403a.class, new Class[0]));
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            C3119c c3119c = (C3119c) it.next();
            if (c3119c != null) {
                arrayList.add(c3119c);
            }
        }
        this.f30798d = o(iterable);
        l(arrayList);
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Executor f30803a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final List f30804b = new ArrayList();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final List f30805c = new ArrayList();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private i f30806d = i.f30787a;

        b(Executor executor) {
            this.f30803a = executor;
        }

        public b b(C3119c c3119c) {
            this.f30805c.add(c3119c);
            return this;
        }

        public b c(final ComponentRegistrar componentRegistrar) {
            this.f30804b.add(new C5.b() { // from class: q5.o
                @Override // C5.b
                public final Object get() {
                    return n.b.a(componentRegistrar);
                }
            });
            return this;
        }

        public b d(Collection collection) {
            this.f30804b.addAll(collection);
            return this;
        }

        public n e() {
            return new n(this.f30803a, this.f30804b, this.f30805c, this.f30806d);
        }

        public b f(i iVar) {
            this.f30806d = iVar;
            return this;
        }

        public static /* synthetic */ ComponentRegistrar a(ComponentRegistrar componentRegistrar) {
            return componentRegistrar;
        }
    }
}
