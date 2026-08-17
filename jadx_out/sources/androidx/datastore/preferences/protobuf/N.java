package androidx.datastore.preferences.protobuf;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
final class N implements Y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final J f16777a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final f0 f16778b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f16779c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final AbstractC1721n f16780d;

    private N(f0 f0Var, AbstractC1721n abstractC1721n, J j10) {
        this.f16778b = f0Var;
        this.f16779c = abstractC1721n.e(j10);
        this.f16780d = abstractC1721n;
        this.f16777a = j10;
    }

    private int i(f0 f0Var, Object obj) {
        return f0Var.i(f0Var.g(obj));
    }

    private void j(f0 f0Var, AbstractC1721n abstractC1721n, Object obj, X x10, C1720m c1720m) throws Throwable {
        f0 f0Var2;
        Object objF = f0Var.f(obj);
        C1724q c1724qD = abstractC1721n.d(obj);
        while (x10.z() != Integer.MAX_VALUE) {
            try {
                f0Var2 = f0Var;
                AbstractC1721n abstractC1721n2 = abstractC1721n;
                X x11 = x10;
                C1720m c1720m2 = c1720m;
                try {
                    if (!l(x11, c1720m2, abstractC1721n2, c1724qD, f0Var2, objF)) {
                        f0Var2.o(obj, objF);
                        return;
                    }
                    x10 = x11;
                    c1720m = c1720m2;
                    abstractC1721n = abstractC1721n2;
                    f0Var = f0Var2;
                } catch (Throwable th) {
                    th = th;
                    Throwable th2 = th;
                    f0Var2.o(obj, objF);
                    throw th2;
                }
            } catch (Throwable th3) {
                th = th3;
                f0Var2 = f0Var;
            }
        }
        f0Var.o(obj, objF);
    }

    static N k(f0 f0Var, AbstractC1721n abstractC1721n, J j10) {
        return new N(f0Var, abstractC1721n, j10);
    }

    private boolean l(X x10, C1720m c1720m, AbstractC1721n abstractC1721n, C1724q c1724q, f0 f0Var, Object obj) throws C1728v {
        int iA = x10.a();
        int iL = 0;
        if (iA != k0.f16907a) {
            if (k0.b(iA) != 2) {
                return x10.G();
            }
            Object objB = abstractC1721n.b(c1720m, this.f16777a, k0.a(iA));
            if (objB == null) {
                return f0Var.m(obj, x10, 0);
            }
            abstractC1721n.h(x10, objB, c1720m, c1724q);
            return true;
        }
        Object objB2 = null;
        AbstractC1713f abstractC1713fC = null;
        while (x10.z() != Integer.MAX_VALUE) {
            int iA2 = x10.a();
            if (iA2 == k0.f16909c) {
                iL = x10.l();
                objB2 = abstractC1721n.b(c1720m, this.f16777a, iL);
            } else if (iA2 == k0.f16910d) {
                if (objB2 != null) {
                    abstractC1721n.h(x10, objB2, c1720m, c1724q);
                } else {
                    abstractC1713fC = x10.C();
                }
            } else if (!x10.G()) {
                break;
            }
        }
        if (x10.a() != k0.f16908b) {
            throw C1728v.b();
        }
        if (abstractC1713fC != null) {
            if (objB2 != null) {
                abstractC1721n.i(abstractC1713fC, objB2, c1720m, c1724q);
            } else {
                f0Var.d(obj, iL, abstractC1713fC);
            }
        }
        return true;
    }

    private void m(f0 f0Var, Object obj, l0 l0Var) {
        f0Var.s(f0Var.g(obj), l0Var);
    }

    @Override // androidx.datastore.preferences.protobuf.Y
    public void a(Object obj, Object obj2) {
        a0.F(this.f16778b, obj, obj2);
        if (this.f16779c) {
            a0.D(this.f16780d, obj, obj2);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.Y
    public void b(Object obj, X x10, C1720m c1720m) throws Throwable {
        j(this.f16778b, this.f16780d, obj, x10, c1720m);
    }

    @Override // androidx.datastore.preferences.protobuf.Y
    public void c(Object obj) {
        this.f16778b.j(obj);
        this.f16780d.f(obj);
    }

    @Override // androidx.datastore.preferences.protobuf.Y
    public final boolean d(Object obj) {
        return this.f16780d.c(obj).k();
    }

    @Override // androidx.datastore.preferences.protobuf.Y
    public void e(Object obj, l0 l0Var) {
        Iterator itN = this.f16780d.c(obj).n();
        if (itN.hasNext()) {
            android.support.v4.media.session.b.a(((Map.Entry) itN.next()).getKey());
            throw null;
        }
        m(this.f16778b, obj, l0Var);
    }

    @Override // androidx.datastore.preferences.protobuf.Y
    public boolean f(Object obj, Object obj2) {
        if (!this.f16778b.g(obj).equals(this.f16778b.g(obj2))) {
            return false;
        }
        if (this.f16779c) {
            return this.f16780d.c(obj).equals(this.f16780d.c(obj2));
        }
        return true;
    }

    @Override // androidx.datastore.preferences.protobuf.Y
    public int g(Object obj) {
        int i10 = i(this.f16778b, obj);
        return this.f16779c ? i10 + this.f16780d.c(obj).f() : i10;
    }

    @Override // androidx.datastore.preferences.protobuf.Y
    public int h(Object obj) {
        int iHashCode = this.f16778b.g(obj).hashCode();
        return this.f16779c ? (iHashCode * 53) + this.f16780d.c(obj).hashCode() : iHashCode;
    }

    @Override // androidx.datastore.preferences.protobuf.Y
    public Object newInstance() {
        J j10 = this.f16777a;
        return j10 instanceof AbstractC1726t ? ((AbstractC1726t) j10).H() : j10.c().X();
    }
}
