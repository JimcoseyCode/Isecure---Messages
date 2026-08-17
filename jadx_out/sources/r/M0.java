package r;

import F.C0479e0;
import android.content.Context;
import android.media.CamcorderProfile;
import android.os.Build;
import android.util.Size;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import y.C3600u;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public final class M0 implements F.J {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f31031a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map f31032b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final InterfaceC3172g f31033c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final s.S f31034d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Context f31035e;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    class a implements InterfaceC3172g {
        a() {
        }

        @Override // r.InterfaceC3172g
        public CamcorderProfile a(int i10, int i11) {
            return CamcorderProfile.get(i10, i11);
        }

        @Override // r.InterfaceC3172g
        public boolean b(int i10, int i11) {
            return CamcorderProfile.hasProfile(i10, i11);
        }
    }

    public M0(Context context, Object obj, Set set) {
        this(context, new a(), obj, set);
    }

    private C3171f2 i(String str) {
        B.a wVar = B.a.f229b;
        if (Build.VERSION.SDK_INT >= 35) {
            wVar = new q.w(this.f31035e, str, this.f31034d);
        }
        return new C3171f2(this.f31035e, str, this.f31034d, this.f31033c, wVar);
    }

    @Override // F.J
    public F.r1 b(int i10, String str, int i11, Size size, F.p1 p1Var) {
        C3171f2 c3171f2 = (C3171f2) this.f31032b.get(str);
        H0.g.b(c3171f2 != null, "No such camera id in supported combination list: " + str);
        return c3171f2.a0(i10, i11, size, p1Var);
    }

    @Override // F.H0
    public void d(List list) throws C0479e0 {
        HashSet<String> hashSet;
        HashMap map = new HashMap();
        synchronized (this.f31031a) {
            hashSet = new HashSet(list);
            hashSet.removeAll(this.f31032b.keySet());
        }
        try {
            for (String str : hashSet) {
                map.put(str, i(str));
            }
            synchronized (this.f31031a) {
                try {
                    HashMap map2 = new HashMap();
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        String str2 = (String) it.next();
                        if (this.f31032b.containsKey(str2)) {
                            map2.put(str2, (C3171f2) this.f31032b.get(str2));
                        } else {
                            map2.put(str2, (C3171f2) map.get(str2));
                        }
                    }
                    this.f31032b.clear();
                    this.f31032b.putAll(map2);
                } catch (Throwable th) {
                    throw th;
                }
            }
        } catch (RuntimeException | C3600u e10) {
            throw new C0479e0("Failed to create SupportedSurfaceCombination", e10);
        }
    }

    @Override // F.J
    public F.t1 f(int i10, String str, List list, Map map, boolean z10, boolean z11, boolean z12, boolean z13) {
        H0.g.b(!map.isEmpty(), "No new use cases to be bound.");
        C3171f2 c3171f2 = (C3171f2) this.f31032b.get(str);
        H0.g.b(c3171f2 != null, "No such camera id in supported combination list: " + str);
        return c3171f2.K(i10, list, map, z10, z11, z12, z13);
    }

    M0(Context context, InterfaceC3172g interfaceC3172g, Object obj, Set set) throws C3600u {
        this.f31031a = new Object();
        this.f31032b = new HashMap();
        H0.g.g(interfaceC3172g);
        this.f31033c = interfaceC3172g;
        this.f31035e = context;
        if (obj instanceof s.S) {
            this.f31034d = (s.S) obj;
        } else {
            this.f31034d = s.S.a(context);
        }
        try {
            d(new ArrayList(set));
        } catch (C0479e0 e10) {
            if (!(e10.getCause() instanceof C3600u)) {
                throw new C3600u(3, e10);
            }
            throw ((C3600u) e10.getCause());
        }
    }
}
