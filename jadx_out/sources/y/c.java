package Y;

import F.L;
import androidx.lifecycle.AbstractC1764k;
import androidx.lifecycle.C;
import androidx.lifecycle.InterfaceC1770q;
import androidx.lifecycle.r;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import y.C3581g0;
import y.InterfaceC3584i;
import y.InterfaceC3586j;
import y.InterfaceC3597q;
import y.J0;
import y.v0;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public final class c implements InterfaceC1770q, InterfaceC3584i {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final r f12559h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final K.f f12560i;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Object f12558g = new Object();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private volatile boolean f12561j = false;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f12562k = false;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f12563l = false;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private v0 f12564m = null;

    c(r rVar, K.f fVar) {
        this.f12559h = rVar;
        this.f12560i = fVar;
        if (rVar.getLifecycle().b().j(AbstractC1764k.b.f17593j)) {
            fVar.w();
        } else {
            fVar.H();
        }
        rVar.getLifecycle().a(this);
    }

    public static /* synthetic */ void g(B.b bVar, v0 v0Var) {
        HashSet hashSet = new HashSet();
        if (bVar != null) {
            hashSet.addAll(bVar.a());
        }
        v0Var.d().accept(hashSet);
    }

    public void A() {
        synchronized (this.f12558g) {
            try {
                if (this.f12562k) {
                    this.f12562k = false;
                    if (this.f12559h.getLifecycle().b().j(AbstractC1764k.b.f17593j)) {
                        onStart(this.f12559h);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // y.InterfaceC3584i
    public InterfaceC3586j b() {
        return this.f12560i.b();
    }

    @Override // y.InterfaceC3584i
    public InterfaceC3597q d() {
        return this.f12560i.d();
    }

    @C(AbstractC1764k.a.ON_DESTROY)
    public void onDestroy(r rVar) {
        synchronized (this.f12558g) {
            K.f fVar = this.f12560i;
            fVar.f0(fVar.O());
        }
    }

    @C(AbstractC1764k.a.ON_PAUSE)
    public void onPause(r rVar) {
        this.f12560i.j(false);
    }

    @C(AbstractC1764k.a.ON_RESUME)
    public void onResume(r rVar) {
        this.f12560i.j(true);
    }

    @C(AbstractC1764k.a.ON_START)
    public void onStart(r rVar) {
        synchronized (this.f12558g) {
            try {
                if (!this.f12562k && !this.f12563l) {
                    this.f12560i.w();
                    this.f12561j = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @C(AbstractC1764k.a.ON_STOP)
    public void onStop(r rVar) {
        synchronized (this.f12558g) {
            try {
                if (!this.f12562k && !this.f12563l) {
                    this.f12560i.H();
                    this.f12561j = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    void s(final v0 v0Var) {
        synchronized (this.f12558g) {
            try {
                if (this.f12564m == null) {
                    this.f12564m = v0Var;
                } else if (v0Var.m()) {
                    if (!this.f12564m.m()) {
                        throw new IllegalStateException("Cannot bind use cases when a SessionConfig is already bound to this LifecycleOwner. Please unbind first");
                    }
                    ArrayList arrayList = new ArrayList(this.f12564m.k());
                    arrayList.addAll(v0Var.k());
                    this.f12564m = new C3581g0(arrayList, v0Var.l(), v0Var.c());
                } else {
                    if (this.f12564m.m()) {
                        throw new IllegalStateException("Cannot bind the SessionConfig when use cases are bound to this LifecycleOwner already. Please unbind first");
                    }
                    this.f12564m = v0Var;
                    K.f fVar = this.f12560i;
                    fVar.f0(fVar.O());
                }
                this.f12560i.m0(v0Var.l());
                this.f12560i.i0(v0Var.c());
                this.f12560i.l0(v0Var.i());
                this.f12560i.k0(v0Var.f());
                final B.b bVarB = B.b.b(v0Var, (L) d());
                v0Var.e().execute(new Runnable() { // from class: Y.b
                    @Override // java.lang.Runnable
                    public final void run() {
                        c.g(bVarB, v0Var);
                    }
                });
                this.f12560i.k(v0Var.k(), bVarB);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public K.f t() {
        return this.f12560i;
    }

    public r u() {
        r rVar;
        synchronized (this.f12558g) {
            rVar = this.f12559h;
        }
        return rVar;
    }

    public List v() {
        List listUnmodifiableList;
        synchronized (this.f12558g) {
            listUnmodifiableList = Collections.unmodifiableList(this.f12560i.O());
        }
        return listUnmodifiableList;
    }

    public boolean w(J0 j02) {
        boolean zContains;
        synchronized (this.f12558g) {
            zContains = this.f12560i.O().contains(j02);
        }
        return zContains;
    }

    boolean x() {
        boolean zM;
        synchronized (this.f12558g) {
            v0 v0Var = this.f12564m;
            zM = v0Var == null ? false : v0Var.m();
        }
        return zM;
    }

    public void y() {
        synchronized (this.f12558g) {
            try {
                if (this.f12562k) {
                    return;
                }
                onStop(this.f12559h);
                this.f12562k = true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    void z() {
        synchronized (this.f12558g) {
            K.f fVar = this.f12560i;
            fVar.f0(fVar.O());
            this.f12564m = null;
        }
    }
}
