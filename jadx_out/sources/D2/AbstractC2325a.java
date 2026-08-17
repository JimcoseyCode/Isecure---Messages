package d2;

/* JADX INFO: renamed from: d2.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2325a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static InterfaceC2327c f25557a = C2326b.l();

    public static void A(Class cls, String str, Object obj, Object obj2, Object obj3) {
        if (w(2)) {
            x(cls, q(str, obj, obj2, obj3));
        }
    }

    public static void B(Class cls, String str, Object obj, Object obj2, Object obj3, Object obj4) {
        if (f25557a.j(2)) {
            f25557a.e(r(cls), q(str, obj, obj2, obj3, obj4));
        }
    }

    public static void C(Class cls, String str, Object... objArr) {
        if (f25557a.j(2)) {
            f25557a.e(r(cls), q(str, objArr));
        }
    }

    public static void D(String str, String str2, Object... objArr) {
        if (f25557a.j(2)) {
            f25557a.e(str, q(str2, objArr));
        }
    }

    public static void E(Class cls, String str) {
        if (f25557a.j(5)) {
            f25557a.b(r(cls), str);
        }
    }

    public static void F(Class cls, String str, Throwable th) {
        if (f25557a.j(5)) {
            f25557a.c(r(cls), str, th);
        }
    }

    public static void G(Class cls, String str, Object... objArr) {
        if (f25557a.j(5)) {
            f25557a.b(r(cls), q(str, objArr));
        }
    }

    public static void H(Class cls, Throwable th, String str, Object... objArr) {
        if (w(5)) {
            F(cls, q(str, objArr), th);
        }
    }

    public static void I(String str, String str2) {
        if (f25557a.j(5)) {
            f25557a.b(str, str2);
        }
    }

    public static void J(String str, String str2, Throwable th) {
        if (f25557a.j(5)) {
            f25557a.c(str, str2, th);
        }
    }

    public static void K(String str, String str2, Object... objArr) {
        if (f25557a.j(5)) {
            f25557a.b(str, q(str2, objArr));
        }
    }

    public static void L(String str, Throwable th, String str2, Object... objArr) {
        if (f25557a.j(5)) {
            f25557a.c(str, q(str2, objArr), th);
        }
    }

    public static void M(Class cls, String str, Throwable th) {
        if (f25557a.j(6)) {
            f25557a.a(r(cls), str, th);
        }
    }

    public static void N(String str, String str2, Object... objArr) {
        if (f25557a.j(6)) {
            f25557a.f(str, q(str2, objArr));
        }
    }

    public static void a(Class cls, String str, Object obj) {
        if (f25557a.j(3)) {
            f25557a.h(r(cls), q(str, obj));
        }
    }

    public static void b(String str, String str2) {
        if (f25557a.j(3)) {
            f25557a.h(str, str2);
        }
    }

    public static void c(String str, String str2, Object obj) {
        if (f25557a.j(3)) {
            f25557a.h(str, q(str2, obj));
        }
    }

    public static void d(String str, String str2, Object obj, Object obj2) {
        if (f25557a.j(3)) {
            f25557a.h(str, q(str2, obj, obj2));
        }
    }

    public static void e(String str, String str2, Object obj, Object obj2, Object obj3) {
        if (f25557a.j(3)) {
            f25557a.h(str, q(str2, obj, obj2, obj3));
        }
    }

    public static void f(String str, String str2, Object obj, Object obj2, Object obj3, Object obj4) {
        if (f25557a.j(3)) {
            f25557a.h(str, q(str2, obj, obj2, obj3, obj4));
        }
    }

    public static void g(String str, String str2, Throwable th) {
        if (f25557a.j(3)) {
            f25557a.i(str, str2, th);
        }
    }

    public static void h(String str, String str2, Object... objArr) {
        if (f25557a.j(3)) {
            b(str, q(str2, objArr));
        }
    }

    public static void i(Class cls, String str) {
        if (f25557a.j(6)) {
            f25557a.d(r(cls), str);
        }
    }

    public static void j(Class cls, String str, Throwable th) {
        if (f25557a.j(6)) {
            f25557a.g(r(cls), str, th);
        }
    }

    public static void k(Class cls, String str, Object... objArr) {
        if (f25557a.j(6)) {
            f25557a.d(r(cls), q(str, objArr));
        }
    }

    public static void l(Class cls, Throwable th, String str, Object... objArr) {
        if (f25557a.j(6)) {
            f25557a.g(r(cls), q(str, objArr), th);
        }
    }

    public static void m(String str, String str2) {
        if (f25557a.j(6)) {
            f25557a.d(str, str2);
        }
    }

    public static void n(String str, String str2, Throwable th) {
        if (f25557a.j(6)) {
            f25557a.g(str, str2, th);
        }
    }

    public static void o(String str, String str2, Object... objArr) {
        if (f25557a.j(6)) {
            f25557a.d(str, q(str2, objArr));
        }
    }

    public static void p(String str, Throwable th, String str2, Object... objArr) {
        if (f25557a.j(6)) {
            f25557a.g(str, q(str2, objArr), th);
        }
    }

    private static String q(String str, Object... objArr) {
        return String.format(null, str, objArr);
    }

    private static String r(Class cls) {
        return cls.getSimpleName();
    }

    public static void s(String str, String str2) {
        if (f25557a.j(4)) {
            f25557a.k(str, str2);
        }
    }

    public static void t(String str, String str2, Object obj, Object obj2) {
        if (f25557a.j(4)) {
            f25557a.k(str, q(str2, obj, obj2));
        }
    }

    public static void u(String str, String str2, Object obj, Object obj2, Object obj3) {
        if (f25557a.j(4)) {
            f25557a.k(str, q(str2, obj, obj2, obj3));
        }
    }

    public static void v(String str, String str2, Object... objArr) {
        if (f25557a.j(4)) {
            f25557a.k(str, q(str2, objArr));
        }
    }

    public static boolean w(int i10) {
        return f25557a.j(i10);
    }

    public static void x(Class cls, String str) {
        if (f25557a.j(2)) {
            f25557a.e(r(cls), str);
        }
    }

    public static void y(Class cls, String str, Object obj) {
        if (f25557a.j(2)) {
            f25557a.e(r(cls), q(str, obj));
        }
    }

    public static void z(Class cls, String str, Object obj, Object obj2) {
        if (f25557a.j(2)) {
            f25557a.e(r(cls), q(str, obj, obj2));
        }
    }
}
