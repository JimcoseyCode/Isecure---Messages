package F;

import F.InterfaceC0490j0;
import android.util.ArrayMap;
import java.util.Collections;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.TreeMap;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public final class S0 extends X0 implements R0 {

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    private static final InterfaceC0490j0.c f1379S = InterfaceC0490j0.c.OPTIONAL;

    private S0(TreeMap treeMap) {
        super(treeMap);
    }

    public static S0 i0() {
        return new S0(new TreeMap(X0.f1405Q));
    }

    public static S0 j0(InterfaceC0490j0 interfaceC0490j0) {
        TreeMap treeMap = new TreeMap(X0.f1405Q);
        for (InterfaceC0490j0.a aVar : interfaceC0490j0.a()) {
            Set<InterfaceC0490j0.c> setG = interfaceC0490j0.g(aVar);
            ArrayMap arrayMap = new ArrayMap();
            for (InterfaceC0490j0.c cVar : setG) {
                arrayMap.put(cVar, interfaceC0490j0.e(aVar, cVar));
            }
            treeMap.put(aVar, arrayMap);
        }
        return new S0(treeMap);
    }

    @Override // F.R0
    public void X(InterfaceC0490j0.a aVar, Object obj) {
        t(aVar, f1379S, obj);
    }

    public Object k0(InterfaceC0490j0.a aVar) {
        return this.f1407P.remove(aVar);
    }

    @Override // F.R0
    public void t(InterfaceC0490j0.a aVar, InterfaceC0490j0.c cVar, Object obj) {
        Map map = (Map) this.f1407P.get(aVar);
        if (map == null) {
            ArrayMap arrayMap = new ArrayMap();
            this.f1407P.put(aVar, arrayMap);
            arrayMap.put(cVar, obj);
            return;
        }
        InterfaceC0490j0.c cVar2 = (InterfaceC0490j0.c) Collections.min(map.keySet());
        if (Objects.equals(map.get(cVar2), obj) || !InterfaceC0490j0.Y(cVar2, cVar)) {
            map.put(cVar, obj);
            return;
        }
        throw new IllegalArgumentException("Option values conflicts: " + aVar.c() + ", existing value (" + cVar2 + ")=" + map.get(cVar2) + ", conflicting (" + cVar + ")=" + obj);
    }
}
