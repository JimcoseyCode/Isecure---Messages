package kotlin.jvm.internal;

import i7.C2734A;
import i7.C2743f;
import java.util.Arrays;

/* JADX INFO: renamed from: kotlin.jvm.internal.l, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC2855l {

    /* JADX INFO: renamed from: kotlin.jvm.internal.l$a */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static class a {
    }

    public static boolean a(Float f10, float f11) {
        return f10 != null && f10.floatValue() == f11;
    }

    public static boolean b(Object obj, Object obj2) {
        return obj == null ? obj2 == null : obj.equals(obj2);
    }

    public static void c(Object obj, String str) {
        if (obj != null) {
            return;
        }
        throw ((IllegalStateException) n(new IllegalStateException(str + " must not be null")));
    }

    public static void d(Object obj) {
        if (obj == null) {
            q();
        }
    }

    public static void e(Object obj, String str) {
        if (obj == null) {
            r(str);
        }
    }

    public static void f(Object obj, String str) {
        if (obj != null) {
            return;
        }
        throw ((NullPointerException) n(new NullPointerException(str + " must not be null")));
    }

    public static void g(Object obj, String str) {
        if (obj == null) {
            u(str);
        }
    }

    public static void h(Object obj, String str) {
        if (obj == null) {
            t(str);
        }
    }

    public static int i(int i10, int i11) {
        if (i10 < i11) {
            return -1;
        }
        return i10 == i11 ? 0 : 1;
    }

    public static int j(long j10, long j11) {
        if (j10 < j11) {
            return -1;
        }
        return j10 == j11 ? 0 : 1;
    }

    private static String k(String str) {
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        String name = AbstractC2855l.class.getName();
        int i10 = 0;
        while (!stackTrace[i10].getClassName().equals(name)) {
            i10++;
        }
        while (stackTrace[i10].getClassName().equals(name)) {
            i10++;
        }
        StackTraceElement stackTraceElement = stackTrace[i10];
        return "Parameter specified as non-null is null: method " + stackTraceElement.getClassName() + "." + stackTraceElement.getMethodName() + ", parameter " + str;
    }

    public static void l() {
        v();
    }

    public static void m(int i10, String str) {
        v();
    }

    private static Throwable n(Throwable th) {
        return o(th, AbstractC2855l.class.getName());
    }

    static Throwable o(Throwable th, String str) {
        StackTraceElement[] stackTrace = th.getStackTrace();
        int length = stackTrace.length;
        int i10 = -1;
        for (int i11 = 0; i11 < length; i11++) {
            if (str.equals(stackTrace[i11].getClassName())) {
                i10 = i11;
            }
        }
        th.setStackTrace((StackTraceElement[]) Arrays.copyOfRange(stackTrace, i10 + 1, length));
        return th;
    }

    public static String p(String str, Object obj) {
        return str + obj;
    }

    public static void q() {
        throw ((NullPointerException) n(new NullPointerException()));
    }

    public static void r(String str) {
        throw ((NullPointerException) n(new NullPointerException(str)));
    }

    public static void s() {
        throw ((C2743f) n(new C2743f()));
    }

    private static void t(String str) {
        throw ((IllegalArgumentException) n(new IllegalArgumentException(k(str))));
    }

    private static void u(String str) {
        throw ((NullPointerException) n(new NullPointerException(k(str))));
    }

    public static void v() {
        w("This function has a reified type parameter and thus can only be inlined at compilation time, not called directly.");
    }

    public static void w(String str) {
        throw new UnsupportedOperationException(str);
    }

    public static void x(String str) {
        throw ((C2734A) n(new C2734A(str)));
    }

    public static void y(String str) {
        x("lateinit property " + str + " has not been initialized");
    }
}
