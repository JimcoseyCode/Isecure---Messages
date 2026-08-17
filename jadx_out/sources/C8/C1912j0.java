package c8;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: renamed from: c8.j0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class C1912j0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map f19004a;

    public C1912j0(Map map) {
        AbstractC2855l.g(map, "map");
        this.f19004a = map;
    }

    public final C1912j0 a() {
        Map map = this.f19004a;
        LinkedHashMap linkedHashMap = new LinkedHashMap(j7.K.e(map.size()));
        for (Map.Entry entry : map.entrySet()) {
            linkedHashMap.put(entry.getKey(), C1907h.c((C1907h) entry.getValue(), null, null, false, true, 7, null));
        }
        return new C1912j0(linkedHashMap);
    }

    public final Map b() {
        return this.f19004a;
    }
}
