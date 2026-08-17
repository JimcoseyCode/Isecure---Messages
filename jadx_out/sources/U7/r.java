package U7;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import k8.b;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final r f11524a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Map f11525b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Map f11526c;

    static {
        r rVar = new r();
        f11524a = rVar;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        f11525b = linkedHashMap;
        k8.i iVar = k8.i.f29276a;
        rVar.c(iVar.l(), rVar.a("java.util.ArrayList", "java.util.LinkedList"));
        rVar.c(iVar.n(), rVar.a("java.util.HashSet", "java.util.TreeSet", "java.util.LinkedHashSet"));
        rVar.c(iVar.m(), rVar.a("java.util.HashMap", "java.util.TreeMap", "java.util.LinkedHashMap", "java.util.concurrent.ConcurrentHashMap", "java.util.concurrent.ConcurrentSkipListMap"));
        b.a aVar = k8.b.f29200d;
        rVar.c(aVar.c(new k8.c("java.util.function.Function")), rVar.a("java.util.function.UnaryOperator"));
        rVar.c(aVar.c(new k8.c("java.util.function.BiFunction")), rVar.a("java.util.function.BinaryOperator"));
        ArrayList arrayList = new ArrayList(linkedHashMap.size());
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            arrayList.add(i7.t.a(((k8.b) entry.getKey()).a(), ((k8.b) entry.getValue()).a()));
        }
        f11526c = j7.K.r(arrayList);
    }

    private r() {
    }

    private final List a(String... strArr) {
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add(k8.b.f29200d.c(new k8.c(str)));
        }
        return arrayList;
    }

    private final void c(k8.b bVar, List list) {
        Map map = f11525b;
        for (Object obj : list) {
            map.put(obj, bVar);
        }
    }

    public final k8.c b(k8.c classFqName) {
        AbstractC2855l.g(classFqName, "classFqName");
        return (k8.c) f11526c.get(classFqName);
    }
}
