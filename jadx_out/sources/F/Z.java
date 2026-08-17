package F;

import androidx.concurrent.futures.c;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import m5.InterfaceFutureC2904a;
import y.AbstractC3583h0;
import y.C3579f0;
import y.C3600u;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public class Z implements H0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f1410a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map f1411b = new LinkedHashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Set f1412c = new HashSet();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private InterfaceFutureC2904a f1413d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private c.a f1414e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private K f1415f;

    public static /* synthetic */ void i(Z z10, M m10) {
        synchronized (z10.f1410a) {
            try {
                z10.f1412c.remove(m10);
                if (z10.f1412c.isEmpty()) {
                    H0.g.g(z10.f1414e);
                    z10.f1414e.c(null);
                    z10.f1414e = null;
                    z10.f1413d = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static /* synthetic */ Object j(Z z10, c.a aVar) {
        synchronized (z10.f1410a) {
            z10.f1414e = aVar;
        }
        return "CameraRepository-deinit";
    }

    @Override // F.H0
    public void d(List list) throws C0479e0 {
        HashSet<String> hashSet;
        HashMap map = new HashMap();
        synchronized (this.f1410a) {
            hashSet = new HashSet(list);
            hashSet.removeAll(this.f1411b.keySet());
        }
        try {
            for (String str : hashSet) {
                map.put(str, this.f1415f.d(str));
            }
            synchronized (this.f1410a) {
                try {
                    HashSet hashSet2 = new HashSet(this.f1411b.keySet());
                    hashSet2.removeAll(list);
                    ArrayList<M> arrayList = new ArrayList();
                    Iterator it = hashSet2.iterator();
                    while (it.hasNext()) {
                        arrayList.add((M) this.f1411b.get((String) it.next()));
                    }
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    Iterator it2 = list.iterator();
                    while (it2.hasNext()) {
                        String str2 = (String) it2.next();
                        if (this.f1411b.containsKey(str2)) {
                            linkedHashMap.put(str2, (M) this.f1411b.get(str2));
                        } else {
                            linkedHashMap.put(str2, (M) map.get(str2));
                        }
                    }
                    this.f1411b.clear();
                    this.f1411b.putAll(linkedHashMap);
                    for (M m10 : arrayList) {
                        if (m10 != null) {
                            m10.n();
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        } catch (C3600u e10) {
            throw new C0479e0("Failed to create CameraInternal", e10);
        }
    }

    public InterfaceFutureC2904a k() {
        synchronized (this.f1410a) {
            try {
                if (this.f1411b.isEmpty()) {
                    InterfaceFutureC2904a interfaceFutureC2904aP = this.f1413d;
                    if (interfaceFutureC2904aP == null) {
                        interfaceFutureC2904aP = J.n.p(null);
                    }
                    return interfaceFutureC2904aP;
                }
                InterfaceFutureC2904a interfaceFutureC2904aA = this.f1413d;
                if (interfaceFutureC2904aA == null) {
                    interfaceFutureC2904aA = androidx.concurrent.futures.c.a(new c.InterfaceC0153c() { // from class: F.X
                        @Override // androidx.concurrent.futures.c.InterfaceC0153c
                        public final Object a(c.a aVar) {
                            return Z.j(this.f1404a, aVar);
                        }
                    });
                    this.f1413d = interfaceFutureC2904aA;
                }
                this.f1412c.addAll(this.f1411b.values());
                for (final M m10 : this.f1411b.values()) {
                    m10.a().h(new Runnable() { // from class: F.Y
                        @Override // java.lang.Runnable
                        public final void run() {
                            Z.i(this.f1408g, m10);
                        }
                    }, I.c.b());
                }
                this.f1411b.clear();
                return interfaceFutureC2904aA;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public M l(String str) {
        M m10;
        synchronized (this.f1410a) {
            try {
                m10 = (M) this.f1411b.get(str);
                if (m10 == null) {
                    throw new IllegalArgumentException("Invalid camera: " + str);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return m10;
    }

    public LinkedHashSet m() {
        LinkedHashSet linkedHashSet;
        synchronized (this.f1410a) {
            linkedHashSet = new LinkedHashSet(this.f1411b.values());
        }
        return linkedHashSet;
    }

    public void n(K k10) {
        this.f1415f = k10;
        synchronized (this.f1410a) {
            try {
                for (String str : k10.c()) {
                    AbstractC3583h0.a("CameraRepository", "Added camera: " + str);
                    M m10 = (M) this.f1411b.put(str, k10.d(str));
                    if (m10 != null) {
                        m10.a();
                    }
                }
            } catch (C3600u e10) {
                throw new C3579f0(e10);
            }
        }
    }
}
