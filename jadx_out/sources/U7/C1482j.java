package U7;

import I7.o;
import j7.AbstractC2800q;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: renamed from: U7.j, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class C1482j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C1482j f11513a = new C1482j();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Map f11514b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Map f11515c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final Set f11516d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final Set f11517e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final Set f11518f;

    static {
        k8.d dVar = o.a.f5219s;
        Pair pairA = i7.t.a(AbstractC1483k.d(dVar, "name"), I7.o.f5128m);
        Pair pairA2 = i7.t.a(AbstractC1483k.d(dVar, "ordinal"), k8.f.q("ordinal"));
        Pair pairA3 = i7.t.a(AbstractC1483k.c(o.a.f5180X, "size"), k8.f.q("size"));
        k8.c cVar = o.a.f5186b0;
        Map mapL = j7.K.l(pairA, pairA2, pairA3, i7.t.a(AbstractC1483k.c(cVar, "size"), k8.f.q("size")), i7.t.a(AbstractC1483k.d(o.a.f5195g, "length"), k8.f.q("length")), i7.t.a(AbstractC1483k.c(cVar, "keys"), k8.f.q("keySet")), i7.t.a(AbstractC1483k.c(cVar, "values"), k8.f.q("values")), i7.t.a(AbstractC1483k.c(cVar, "entries"), k8.f.q("entrySet")));
        f11514b = mapL;
        Set<Map.Entry> setEntrySet = mapL.entrySet();
        ArrayList<Pair> arrayList = new ArrayList(AbstractC2800q.u(setEntrySet, 10));
        for (Map.Entry entry : setEntrySet) {
            arrayList.add(new Pair(((k8.c) entry.getKey()).g(), entry.getValue()));
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Pair pair : arrayList) {
            k8.f fVar = (k8.f) pair.d();
            Object arrayList2 = linkedHashMap.get(fVar);
            if (arrayList2 == null) {
                arrayList2 = new ArrayList();
                linkedHashMap.put(fVar, arrayList2);
            }
            ((List) arrayList2).add((k8.f) pair.c());
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(j7.K.e(linkedHashMap.size()));
        for (Map.Entry entry2 : linkedHashMap.entrySet()) {
            linkedHashMap2.put(entry2.getKey(), AbstractC2800q.Y((Iterable) entry2.getValue()));
        }
        f11515c = linkedHashMap2;
        Map map = f11514b;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (Map.Entry entry3 : map.entrySet()) {
            K7.c cVar2 = K7.c.f7110a;
            k8.d dVarJ = ((k8.c) entry3.getKey()).e().j();
            AbstractC2855l.f(dVarJ, "toUnsafe(...)");
            k8.b bVarN = cVar2.n(dVarJ);
            AbstractC2855l.d(bVarN);
            linkedHashSet.add(bVarN.a().c((k8.f) entry3.getValue()));
        }
        f11516d = linkedHashSet;
        Set setKeySet = f11514b.keySet();
        f11517e = setKeySet;
        ArrayList arrayList3 = new ArrayList(AbstractC2800q.u(setKeySet, 10));
        Iterator it = setKeySet.iterator();
        while (it.hasNext()) {
            arrayList3.add(((k8.c) it.next()).g());
        }
        f11518f = AbstractC2800q.T0(arrayList3);
    }

    private C1482j() {
    }

    public final Map a() {
        return f11514b;
    }

    public final List b(k8.f name1) {
        AbstractC2855l.g(name1, "name1");
        List list = (List) f11515c.get(name1);
        return list == null ? AbstractC2800q.j() : list;
    }

    public final Set c() {
        return f11517e;
    }

    public final Set d() {
        return f11518f;
    }
}
