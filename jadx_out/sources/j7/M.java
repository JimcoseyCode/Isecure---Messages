package j7;

import com.facebook.react.uimanager.ViewDefaults;
import java.util.Collections;
import java.util.Comparator;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;
import k7.C2836d;
import kotlin.Pair;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class M extends L {
    public static Map b(Map builder) {
        AbstractC2855l.g(builder, "builder");
        return ((C2836d) builder).m();
    }

    public static Map c() {
        return new C2836d();
    }

    public static Map d(int i10) {
        return new C2836d(i10);
    }

    public static int e(int i10) {
        return i10 < 0 ? i10 : i10 < 3 ? i10 + 1 : i10 < 1073741824 ? (int) ((i10 / 0.75f) + 1.0f) : ViewDefaults.NUMBER_OF_LINES;
    }

    public static Map f(Pair pair) {
        AbstractC2855l.g(pair, "pair");
        Map mapSingletonMap = Collections.singletonMap(pair.c(), pair.d());
        AbstractC2855l.f(mapSingletonMap, "singletonMap(...)");
        return mapSingletonMap;
    }

    public static final Map g(Map map) {
        AbstractC2855l.g(map, "<this>");
        Map.Entry entry = (Map.Entry) map.entrySet().iterator().next();
        Map mapSingletonMap = Collections.singletonMap(entry.getKey(), entry.getValue());
        AbstractC2855l.f(mapSingletonMap, "with(...)");
        return mapSingletonMap;
    }

    public static SortedMap h(Map map, Comparator comparator) {
        AbstractC2855l.g(map, "<this>");
        AbstractC2855l.g(comparator, "comparator");
        TreeMap treeMap = new TreeMap(comparator);
        treeMap.putAll(map);
        return treeMap;
    }
}
