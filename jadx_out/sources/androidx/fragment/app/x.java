package androidx.fragment.app;

import android.os.Bundle;
import android.view.View;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final CopyOnWriteArrayList f17514a = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final FragmentManager f17515b;

    x(FragmentManager fragmentManager) {
        this.f17515b = fragmentManager;
    }

    void a(Fragment fragment, Bundle bundle, boolean z10) {
        Fragment fragmentZ0 = this.f17515b.z0();
        if (fragmentZ0 != null) {
            fragmentZ0.getParentFragmentManager().y0().a(fragment, bundle, true);
        }
        Iterator it = this.f17514a.iterator();
        if (it.hasNext()) {
            android.support.v4.media.session.b.a(it.next());
            if (!z10) {
                throw null;
            }
            throw null;
        }
    }

    void b(Fragment fragment, boolean z10) {
        this.f17515b.w0().f();
        Fragment fragmentZ0 = this.f17515b.z0();
        if (fragmentZ0 != null) {
            fragmentZ0.getParentFragmentManager().y0().b(fragment, true);
        }
        Iterator it = this.f17514a.iterator();
        if (it.hasNext()) {
            android.support.v4.media.session.b.a(it.next());
            if (!z10) {
                throw null;
            }
            throw null;
        }
    }

    void c(Fragment fragment, Bundle bundle, boolean z10) {
        Fragment fragmentZ0 = this.f17515b.z0();
        if (fragmentZ0 != null) {
            fragmentZ0.getParentFragmentManager().y0().c(fragment, bundle, true);
        }
        Iterator it = this.f17514a.iterator();
        if (it.hasNext()) {
            android.support.v4.media.session.b.a(it.next());
            if (!z10) {
                throw null;
            }
            throw null;
        }
    }

    void d(Fragment fragment, boolean z10) {
        Fragment fragmentZ0 = this.f17515b.z0();
        if (fragmentZ0 != null) {
            fragmentZ0.getParentFragmentManager().y0().d(fragment, true);
        }
        Iterator it = this.f17514a.iterator();
        if (it.hasNext()) {
            android.support.v4.media.session.b.a(it.next());
            if (!z10) {
                throw null;
            }
            throw null;
        }
    }

    void e(Fragment fragment, boolean z10) {
        Fragment fragmentZ0 = this.f17515b.z0();
        if (fragmentZ0 != null) {
            fragmentZ0.getParentFragmentManager().y0().e(fragment, true);
        }
        Iterator it = this.f17514a.iterator();
        if (it.hasNext()) {
            android.support.v4.media.session.b.a(it.next());
            if (!z10) {
                throw null;
            }
            throw null;
        }
    }

    void f(Fragment fragment, boolean z10) {
        Fragment fragmentZ0 = this.f17515b.z0();
        if (fragmentZ0 != null) {
            fragmentZ0.getParentFragmentManager().y0().f(fragment, true);
        }
        Iterator it = this.f17514a.iterator();
        if (it.hasNext()) {
            android.support.v4.media.session.b.a(it.next());
            if (!z10) {
                throw null;
            }
            throw null;
        }
    }

    void g(Fragment fragment, boolean z10) {
        this.f17515b.w0().f();
        Fragment fragmentZ0 = this.f17515b.z0();
        if (fragmentZ0 != null) {
            fragmentZ0.getParentFragmentManager().y0().g(fragment, true);
        }
        Iterator it = this.f17514a.iterator();
        if (it.hasNext()) {
            android.support.v4.media.session.b.a(it.next());
            if (!z10) {
                throw null;
            }
            throw null;
        }
    }

    void h(Fragment fragment, Bundle bundle, boolean z10) {
        Fragment fragmentZ0 = this.f17515b.z0();
        if (fragmentZ0 != null) {
            fragmentZ0.getParentFragmentManager().y0().h(fragment, bundle, true);
        }
        Iterator it = this.f17514a.iterator();
        if (it.hasNext()) {
            android.support.v4.media.session.b.a(it.next());
            if (!z10) {
                throw null;
            }
            throw null;
        }
    }

    void i(Fragment fragment, boolean z10) {
        Fragment fragmentZ0 = this.f17515b.z0();
        if (fragmentZ0 != null) {
            fragmentZ0.getParentFragmentManager().y0().i(fragment, true);
        }
        Iterator it = this.f17514a.iterator();
        if (it.hasNext()) {
            android.support.v4.media.session.b.a(it.next());
            if (!z10) {
                throw null;
            }
            throw null;
        }
    }

    void j(Fragment fragment, Bundle bundle, boolean z10) {
        Fragment fragmentZ0 = this.f17515b.z0();
        if (fragmentZ0 != null) {
            fragmentZ0.getParentFragmentManager().y0().j(fragment, bundle, true);
        }
        Iterator it = this.f17514a.iterator();
        if (it.hasNext()) {
            android.support.v4.media.session.b.a(it.next());
            if (!z10) {
                throw null;
            }
            throw null;
        }
    }

    void k(Fragment fragment, boolean z10) {
        Fragment fragmentZ0 = this.f17515b.z0();
        if (fragmentZ0 != null) {
            fragmentZ0.getParentFragmentManager().y0().k(fragment, true);
        }
        Iterator it = this.f17514a.iterator();
        if (it.hasNext()) {
            android.support.v4.media.session.b.a(it.next());
            if (!z10) {
                throw null;
            }
            throw null;
        }
    }

    void l(Fragment fragment, boolean z10) {
        Fragment fragmentZ0 = this.f17515b.z0();
        if (fragmentZ0 != null) {
            fragmentZ0.getParentFragmentManager().y0().l(fragment, true);
        }
        Iterator it = this.f17514a.iterator();
        if (it.hasNext()) {
            android.support.v4.media.session.b.a(it.next());
            if (!z10) {
                throw null;
            }
            throw null;
        }
    }

    void m(Fragment fragment, View view, Bundle bundle, boolean z10) {
        Fragment fragmentZ0 = this.f17515b.z0();
        if (fragmentZ0 != null) {
            fragmentZ0.getParentFragmentManager().y0().m(fragment, view, bundle, true);
        }
        Iterator it = this.f17514a.iterator();
        if (it.hasNext()) {
            android.support.v4.media.session.b.a(it.next());
            if (!z10) {
                throw null;
            }
            throw null;
        }
    }

    void n(Fragment fragment, boolean z10) {
        Fragment fragmentZ0 = this.f17515b.z0();
        if (fragmentZ0 != null) {
            fragmentZ0.getParentFragmentManager().y0().n(fragment, true);
        }
        Iterator it = this.f17514a.iterator();
        if (it.hasNext()) {
            android.support.v4.media.session.b.a(it.next());
            if (!z10) {
                throw null;
            }
            throw null;
        }
    }
}
