package q5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
abstract class p {

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    private static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final C3119c f30808a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Set f30809b = new HashSet();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Set f30810c = new HashSet();

        b(C3119c c3119c) {
            this.f30808a = c3119c;
        }

        void a(b bVar) {
            this.f30809b.add(bVar);
        }

        void b(b bVar) {
            this.f30810c.add(bVar);
        }

        C3119c c() {
            return this.f30808a;
        }

        Set d() {
            return this.f30809b;
        }

        boolean e() {
            return this.f30809b.isEmpty();
        }

        boolean f() {
            return this.f30810c.isEmpty();
        }

        void g(b bVar) {
            this.f30810c.remove(bVar);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    private static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final D f30811a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final boolean f30812b;

        public boolean equals(Object obj) {
            if (obj instanceof c) {
                c cVar = (c) obj;
                if (cVar.f30811a.equals(this.f30811a) && cVar.f30812b == this.f30812b) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return ((this.f30811a.hashCode() ^ 1000003) * 1000003) ^ Boolean.valueOf(this.f30812b).hashCode();
        }

        private c(D d10, boolean z10) {
            this.f30811a = d10;
            this.f30812b = z10;
        }
    }

    static void a(List list) {
        Set<b> setC = c(list);
        Set setB = b(setC);
        int i10 = 0;
        while (!setB.isEmpty()) {
            b bVar = (b) setB.iterator().next();
            setB.remove(bVar);
            i10++;
            for (b bVar2 : bVar.d()) {
                bVar2.g(bVar);
                if (bVar2.f()) {
                    setB.add(bVar2);
                }
            }
        }
        if (i10 == list.size()) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (b bVar3 : setC) {
            if (!bVar3.f() && !bVar3.e()) {
                arrayList.add(bVar3.c());
            }
        }
        throw new r(arrayList);
    }

    private static Set b(Set set) {
        HashSet hashSet = new HashSet();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            b bVar = (b) it.next();
            if (bVar.f()) {
                hashSet.add(bVar);
            }
        }
        return hashSet;
    }

    private static Set c(List list) {
        Set<b> set;
        HashMap map = new HashMap(list.size());
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                Iterator it2 = map.values().iterator();
                while (it2.hasNext()) {
                    for (b bVar : (Set) it2.next()) {
                        for (q qVar : bVar.c().g()) {
                            if (qVar.d() && (set = (Set) map.get(new c(qVar.b(), qVar.f()))) != null) {
                                for (b bVar2 : set) {
                                    bVar.a(bVar2);
                                    bVar2.b(bVar);
                                }
                            }
                        }
                    }
                }
                HashSet hashSet = new HashSet();
                Iterator it3 = map.values().iterator();
                while (it3.hasNext()) {
                    hashSet.addAll((Set) it3.next());
                }
                return hashSet;
            }
            C3119c c3119c = (C3119c) it.next();
            b bVar3 = new b(c3119c);
            for (D d10 : c3119c.j()) {
                c cVar = new c(d10, !c3119c.p());
                if (!map.containsKey(cVar)) {
                    map.put(cVar, new HashSet());
                }
                Set set2 = (Set) map.get(cVar);
                if (!set2.isEmpty() && !cVar.f30812b) {
                    throw new IllegalArgumentException(String.format("Multiple components provide %s.", d10));
                }
                set2.add(bVar3);
            }
        }
    }
}
