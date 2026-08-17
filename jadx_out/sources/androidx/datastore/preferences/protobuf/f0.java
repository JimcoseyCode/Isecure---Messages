package androidx.datastore.preferences.protobuf;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
abstract class f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static volatile int f16836a = 100;

    f0() {
    }

    private final void l(Object obj, X x10, int i10) {
        while (x10.z() != Integer.MAX_VALUE && m(obj, x10, i10)) {
        }
    }

    abstract void a(Object obj, int i10, int i11);

    abstract void b(Object obj, int i10, long j10);

    abstract void c(Object obj, int i10, Object obj2);

    abstract void d(Object obj, int i10, AbstractC1713f abstractC1713f);

    abstract void e(Object obj, int i10, long j10);

    abstract Object f(Object obj);

    abstract Object g(Object obj);

    abstract int h(Object obj);

    abstract int i(Object obj);

    abstract void j(Object obj);

    abstract Object k(Object obj, Object obj2);

    final boolean m(Object obj, X x10, int i10) throws C1728v {
        int iA = x10.a();
        int iA2 = k0.a(iA);
        int iB = k0.b(iA);
        if (iB == 0) {
            e(obj, iA2, x10.L());
            return true;
        }
        if (iB == 1) {
            b(obj, iA2, x10.d());
            return true;
        }
        if (iB == 2) {
            d(obj, iA2, x10.C());
            return true;
        }
        if (iB != 3) {
            if (iB == 4) {
                return false;
            }
            if (iB != 5) {
                throw C1728v.e();
            }
            a(obj, iA2, x10.h());
            return true;
        }
        Object objN = n();
        int iC = k0.c(iA2, 4);
        int i11 = i10 + 1;
        if (i11 >= f16836a) {
            throw C1728v.i();
        }
        l(objN, x10, i11);
        if (iC != x10.a()) {
            throw C1728v.b();
        }
        c(obj, iA2, r(objN));
        return true;
    }

    abstract Object n();

    abstract void o(Object obj, Object obj2);

    abstract void p(Object obj, Object obj2);

    abstract boolean q(X x10);

    abstract Object r(Object obj);

    abstract void s(Object obj, l0 l0Var);

    abstract void t(Object obj, l0 l0Var);
}
