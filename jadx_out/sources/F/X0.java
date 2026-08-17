package F;

import F.InterfaceC0490j0;
import android.util.ArrayMap;
import java.util.Collections;
import java.util.Comparator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public class X0 implements InterfaceC0490j0 {

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    protected static final Comparator f1405Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    private static final X0 f1406R;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    protected final TreeMap f1407P;

    static {
        Comparator comparator = new Comparator() { // from class: F.W0
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return ((InterfaceC0490j0.a) obj).c().compareTo(((InterfaceC0490j0.a) obj2).c());
            }
        };
        f1405Q = comparator;
        f1406R = new X0(new TreeMap(comparator));
    }

    X0(TreeMap treeMap) {
        this.f1407P = treeMap;
    }

    public static X0 g0() {
        return f1406R;
    }

    public static X0 h0(InterfaceC0490j0 interfaceC0490j0) {
        if (X0.class.equals(interfaceC0490j0.getClass())) {
            return (X0) interfaceC0490j0;
        }
        TreeMap treeMap = new TreeMap(f1405Q);
        for (InterfaceC0490j0.a aVar : interfaceC0490j0.a()) {
            Set<InterfaceC0490j0.c> setG = interfaceC0490j0.g(aVar);
            ArrayMap arrayMap = new ArrayMap();
            for (InterfaceC0490j0.c cVar : setG) {
                arrayMap.put(cVar, interfaceC0490j0.e(aVar, cVar));
            }
            treeMap.put(aVar, arrayMap);
        }
        return new X0(treeMap);
    }

    @Override // F.InterfaceC0490j0
    public Set a() {
        return Collections.unmodifiableSet(this.f1407P.keySet());
    }

    @Override // F.InterfaceC0490j0
    public boolean b(InterfaceC0490j0.a aVar) {
        return this.f1407P.containsKey(aVar);
    }

    @Override // F.InterfaceC0490j0
    public InterfaceC0490j0.c c(InterfaceC0490j0.a aVar) {
        Map map = (Map) this.f1407P.get(aVar);
        if (map != null) {
            return (InterfaceC0490j0.c) Collections.min(map.keySet());
        }
        throw new IllegalArgumentException("Option does not exist: " + aVar);
    }

    @Override // F.InterfaceC0490j0
    public Object d(InterfaceC0490j0.a aVar) {
        Map map = (Map) this.f1407P.get(aVar);
        if (map != null) {
            return map.get((InterfaceC0490j0.c) Collections.min(map.keySet()));
        }
        throw new IllegalArgumentException("Option does not exist: " + aVar);
    }

    @Override // F.InterfaceC0490j0
    public Object e(InterfaceC0490j0.a aVar, InterfaceC0490j0.c cVar) {
        Map map = (Map) this.f1407P.get(aVar);
        if (map == null) {
            throw new IllegalArgumentException("Option does not exist: " + aVar);
        }
        if (map.containsKey(cVar)) {
            return map.get(cVar);
        }
        throw new IllegalArgumentException("Option does not exist: " + aVar + " with priority=" + cVar);
    }

    @Override // F.InterfaceC0490j0
    public Object f(InterfaceC0490j0.a aVar, Object obj) {
        Map map = (Map) this.f1407P.get(aVar);
        return map == null ? obj : map.get((InterfaceC0490j0.c) Collections.min(map.keySet()));
    }

    @Override // F.InterfaceC0490j0
    public Set g(InterfaceC0490j0.a aVar) {
        Map map = (Map) this.f1407P.get(aVar);
        return map == null ? Collections.EMPTY_SET : Collections.unmodifiableSet(map.keySet());
    }

    @Override // F.InterfaceC0490j0
    public void h(String str, InterfaceC0490j0.b bVar) {
        for (Map.Entry entry : this.f1407P.tailMap(InterfaceC0490j0.a.a(str, Void.class)).entrySet()) {
            if (!((InterfaceC0490j0.a) entry.getKey()).c().startsWith(str) || !bVar.a((InterfaceC0490j0.a) entry.getKey())) {
                return;
            }
        }
    }
}
