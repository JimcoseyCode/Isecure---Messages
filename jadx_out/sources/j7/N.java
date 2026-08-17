package j7;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class N extends M {
    public static Map i() {
        C2781E c2781e = C2781E.f28896g;
        AbstractC2855l.e(c2781e, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.MapsKt__MapsKt.emptyMap, V of kotlin.collections.MapsKt__MapsKt.emptyMap>");
        return c2781e;
    }

    public static Object j(Map map, Object obj) {
        AbstractC2855l.g(map, "<this>");
        return L.a(map, obj);
    }

    public static HashMap k(Pair... pairs) {
        AbstractC2855l.g(pairs, "pairs");
        HashMap map = new HashMap(M.e(pairs.length));
        q(map, pairs);
        return map;
    }

    public static Map l(Pair... pairs) {
        AbstractC2855l.g(pairs, "pairs");
        return pairs.length > 0 ? v(pairs, new LinkedHashMap(M.e(pairs.length))) : i();
    }

    public static Map m(Pair... pairs) {
        AbstractC2855l.g(pairs, "pairs");
        LinkedHashMap linkedHashMap = new LinkedHashMap(M.e(pairs.length));
        q(linkedHashMap, pairs);
        return linkedHashMap;
    }

    public static final Map n(Map map) {
        AbstractC2855l.g(map, "<this>");
        int size = map.size();
        return size != 0 ? size != 1 ? map : M.g(map) : i();
    }

    public static Map o(Map map, Map map2) {
        AbstractC2855l.g(map, "<this>");
        AbstractC2855l.g(map2, "map");
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        linkedHashMap.putAll(map2);
        return linkedHashMap;
    }

    public static final void p(Map map, Iterable pairs) {
        AbstractC2855l.g(map, "<this>");
        AbstractC2855l.g(pairs, "pairs");
        Iterator it = pairs.iterator();
        while (it.hasNext()) {
            Pair pair = (Pair) it.next();
            map.put(pair.getFirst(), pair.getSecond());
        }
    }

    public static final void q(Map map, Pair[] pairs) {
        AbstractC2855l.g(map, "<this>");
        AbstractC2855l.g(pairs, "pairs");
        for (Pair pair : pairs) {
            map.put(pair.getFirst(), pair.getSecond());
        }
    }

    public static Map r(Iterable iterable) {
        AbstractC2855l.g(iterable, "<this>");
        if (!(iterable instanceof Collection)) {
            return n(s(iterable, new LinkedHashMap()));
        }
        Collection collection = (Collection) iterable;
        int size = collection.size();
        if (size == 0) {
            return i();
        }
        if (size != 1) {
            return s(iterable, new LinkedHashMap(M.e(collection.size())));
        }
        return M.f((Pair) (iterable instanceof List ? ((List) iterable).get(0) : collection.iterator().next()));
    }

    public static final Map s(Iterable iterable, Map destination) {
        AbstractC2855l.g(iterable, "<this>");
        AbstractC2855l.g(destination, "destination");
        p(destination, iterable);
        return destination;
    }

    public static Map t(Map map) {
        AbstractC2855l.g(map, "<this>");
        int size = map.size();
        return size != 0 ? size != 1 ? w(map) : M.g(map) : i();
    }

    public static Map u(Pair[] pairArr) {
        AbstractC2855l.g(pairArr, "<this>");
        int length = pairArr.length;
        return length != 0 ? length != 1 ? v(pairArr, new LinkedHashMap(M.e(pairArr.length))) : M.f(pairArr[0]) : i();
    }

    public static final Map v(Pair[] pairArr, Map destination) {
        AbstractC2855l.g(pairArr, "<this>");
        AbstractC2855l.g(destination, "destination");
        q(destination, pairArr);
        return destination;
    }

    public static Map w(Map map) {
        AbstractC2855l.g(map, "<this>");
        return new LinkedHashMap(map);
    }
}
