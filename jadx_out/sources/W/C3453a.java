package w;

import F.C0479e0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import r.W0;
import s.C3294h;
import s.S;
import x.h;
import y.AbstractC3583h0;
import y.C3579f0;
import y.InterfaceC3597q;
import z.InterfaceC3664a;

/* JADX INFO: renamed from: w.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public class C3453a implements InterfaceC3664a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final S f33024b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f33023a = new Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Map f33026d = new HashMap();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Set f33027e = new HashSet();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private List f33028f = new ArrayList();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f33029g = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final List f33025c = new ArrayList();

    public C3453a(S s10) {
        this.f33024b = s10;
        try {
            d(Arrays.asList(s10.d()));
        } catch (C0479e0 | C3294h e10) {
            AbstractC3583h0.d("Camera2CameraCoordinator", "Failed to get concurrent camera ids", e10);
        }
    }

    private void i(List list, int i10, int i11) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((InterfaceC3664a.InterfaceC0377a) it.next()).a(i10, i11);
        }
    }

    @Override // z.InterfaceC3664a
    public int c() {
        int i10;
        synchronized (this.f33023a) {
            i10 = this.f33029g;
        }
        return i10;
    }

    @Override // F.H0
    public void d(List list) throws C0479e0 {
        HashMap map = new HashMap();
        HashSet hashSet = new HashSet();
        try {
            for (Set set : this.f33024b.e()) {
                if (list.containsAll(set)) {
                    ArrayList arrayList = new ArrayList(set);
                    if (arrayList.size() >= 2) {
                        String str = (String) arrayList.get(0);
                        String str2 = (String) arrayList.get(1);
                        try {
                            if (W0.a(this.f33024b, str) && W0.a(this.f33024b, str2)) {
                                hashSet.add(new HashSet(Arrays.asList(str, str2)));
                                if (!map.containsKey(str)) {
                                    map.put(str, new ArrayList());
                                }
                                ((List) map.get(str)).add(str2);
                                if (!map.containsKey(str2)) {
                                    map.put(str2, new ArrayList());
                                }
                                ((List) map.get(str2)).add(str);
                            }
                        } catch (C3579f0 unused) {
                            AbstractC3583h0.a("Camera2CameraCoordinator", "Concurrent camera id pair: (" + str + ", " + str + ") is not backward compatible");
                        }
                    }
                }
            }
            synchronized (this.f33023a) {
                this.f33026d = map;
                this.f33027e = hashSet;
                AbstractC3583h0.a("Camera2CameraCoordinator", "Updated concurrent camera map: " + this.f33026d);
            }
        } catch (C3294h e10) {
            throw new C0479e0("Failed to retrieve concurrent camera id info.", e10);
        }
    }

    @Override // z.InterfaceC3664a
    public void e(InterfaceC3664a.InterfaceC0377a interfaceC0377a) {
        synchronized (this.f33023a) {
            this.f33025c.add(interfaceC0377a);
        }
    }

    @Override // z.InterfaceC3664a
    public String g(String str) {
        synchronized (this.f33023a) {
            try {
                if (!this.f33026d.containsKey(str)) {
                    return null;
                }
                List<String> list = (List) this.f33026d.get(str);
                if (list == null) {
                    return null;
                }
                for (String str2 : list) {
                    Iterator it = this.f33028f.iterator();
                    while (it.hasNext()) {
                        if (str2.equals(h.a((InterfaceC3597q) it.next()).c())) {
                            return str2;
                        }
                    }
                }
                return null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // z.InterfaceC3664a
    public void h(int i10) {
        synchronized (this.f33023a) {
            try {
                int i11 = this.f33029g;
                if (i10 == i11) {
                    return;
                }
                this.f33029g = i10;
                ArrayList arrayList = new ArrayList(this.f33025c);
                if (i11 == 2 && i10 != 2) {
                    this.f33028f.clear();
                }
                i(arrayList, i11, i10);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // z.InterfaceC3664a
    public void shutdown() {
        synchronized (this.f33023a) {
            this.f33025c.clear();
            this.f33026d.clear();
            this.f33028f.clear();
            this.f33027e.clear();
            this.f33029g = 0;
        }
    }
}
