package androidx.fragment.app;

import androidx.lifecycle.U;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
final class E extends androidx.lifecycle.T {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final U.c f17200i = new a();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f17204e;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final HashMap f17201b = new HashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final HashMap f17202c = new HashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final HashMap f17203d = new HashMap();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f17205f = false;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f17206g = false;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f17207h = false;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    class a implements U.c {
        a() {
        }

        @Override // androidx.lifecycle.U.c
        public androidx.lifecycle.T a(Class cls) {
            return new E(true);
        }
    }

    E(boolean z10) {
        this.f17204e = z10;
    }

    private void h(String str) {
        E e10 = (E) this.f17202c.get(str);
        if (e10 != null) {
            e10.d();
            this.f17202c.remove(str);
        }
        androidx.lifecycle.V v10 = (androidx.lifecycle.V) this.f17203d.get(str);
        if (v10 != null) {
            v10.a();
            this.f17203d.remove(str);
        }
    }

    static E k(androidx.lifecycle.V v10) {
        return (E) new androidx.lifecycle.U(v10, f17200i).b(E.class);
    }

    @Override // androidx.lifecycle.T
    protected void d() {
        if (FragmentManager.J0(3)) {
            toString();
        }
        this.f17205f = true;
    }

    void e(Fragment fragment) {
        if (this.f17207h) {
            FragmentManager.J0(2);
        } else {
            if (this.f17201b.containsKey(fragment.mWho)) {
                return;
            }
            this.f17201b.put(fragment.mWho, fragment);
            if (FragmentManager.J0(2)) {
                fragment.toString();
            }
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && E.class == obj.getClass()) {
            E e10 = (E) obj;
            if (this.f17201b.equals(e10.f17201b) && this.f17202c.equals(e10.f17202c) && this.f17203d.equals(e10.f17203d)) {
                return true;
            }
        }
        return false;
    }

    void f(Fragment fragment) {
        if (FragmentManager.J0(3)) {
            Objects.toString(fragment);
        }
        h(fragment.mWho);
    }

    void g(String str) {
        FragmentManager.J0(3);
        h(str);
    }

    public int hashCode() {
        return (((this.f17201b.hashCode() * 31) + this.f17202c.hashCode()) * 31) + this.f17203d.hashCode();
    }

    Fragment i(String str) {
        return (Fragment) this.f17201b.get(str);
    }

    E j(Fragment fragment) {
        E e10 = (E) this.f17202c.get(fragment.mWho);
        if (e10 != null) {
            return e10;
        }
        E e11 = new E(this.f17204e);
        this.f17202c.put(fragment.mWho, e11);
        return e11;
    }

    Collection l() {
        return new ArrayList(this.f17201b.values());
    }

    androidx.lifecycle.V m(Fragment fragment) {
        androidx.lifecycle.V v10 = (androidx.lifecycle.V) this.f17203d.get(fragment.mWho);
        if (v10 != null) {
            return v10;
        }
        androidx.lifecycle.V v11 = new androidx.lifecycle.V();
        this.f17203d.put(fragment.mWho, v11);
        return v11;
    }

    boolean n() {
        return this.f17205f;
    }

    void o(Fragment fragment) {
        if (this.f17207h) {
            FragmentManager.J0(2);
        } else {
            if (this.f17201b.remove(fragment.mWho) == null || !FragmentManager.J0(2)) {
                return;
            }
            fragment.toString();
        }
    }

    void p(boolean z10) {
        this.f17207h = z10;
    }

    boolean q(Fragment fragment) {
        if (this.f17201b.containsKey(fragment.mWho)) {
            return this.f17204e ? this.f17205f : !this.f17206g;
        }
        return true;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("FragmentManagerViewModel{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("} Fragments (");
        Iterator it = this.f17201b.values().iterator();
        while (it.hasNext()) {
            sb.append(it.next());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") Child Non Config (");
        Iterator it2 = this.f17202c.keySet().iterator();
        while (it2.hasNext()) {
            sb.append((String) it2.next());
            if (it2.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") ViewModelStores (");
        Iterator it3 = this.f17203d.keySet().iterator();
        while (it3.hasNext()) {
            sb.append((String) it3.next());
            if (it3.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(')');
        return sb.toString();
    }
}
