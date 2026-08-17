package R0;

import j7.AbstractC2800q;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public abstract class a {
    public static final Set a(Set set) {
        AbstractC2855l.g(set, "set");
        Set setUnmodifiableSet = Collections.unmodifiableSet(AbstractC2800q.T0(set));
        AbstractC2855l.f(setUnmodifiableSet, "unmodifiableSet(set.toSet())");
        return setUnmodifiableSet;
    }

    public static final Map b(Map map) {
        AbstractC2855l.g(map, "map");
        Map mapUnmodifiableMap = Collections.unmodifiableMap(map);
        AbstractC2855l.f(mapUnmodifiableMap, "unmodifiableMap(map)");
        return mapUnmodifiableMap;
    }
}
