package l1;

import android.os.Build;
import android.os.Trace;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: l1.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2861a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static long f29413a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static Method f29414b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static Method f29415c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static Method f29416d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static Method f29417e;

    public static void a(String str, int i10) {
        if (Build.VERSION.SDK_INT >= 29) {
            AbstractC2863c.a(l(str), i10);
        } else {
            b(l(str), i10);
        }
    }

    private static void b(String str, int i10) {
        try {
            if (f29415c == null) {
                f29415c = Trace.class.getMethod("asyncTraceBegin", Long.TYPE, String.class, Integer.TYPE);
            }
            f29415c.invoke(null, Long.valueOf(f29413a), str, Integer.valueOf(i10));
        } catch (Exception e10) {
            g("asyncTraceBegin", e10);
        }
    }

    public static void c(String str) {
        AbstractC2862b.a(l(str));
    }

    public static void d(String str, int i10) {
        if (Build.VERSION.SDK_INT >= 29) {
            AbstractC2863c.b(l(str), i10);
        } else {
            e(l(str), i10);
        }
    }

    private static void e(String str, int i10) {
        try {
            if (f29416d == null) {
                f29416d = Trace.class.getMethod("asyncTraceEnd", Long.TYPE, String.class, Integer.TYPE);
            }
            f29416d.invoke(null, Long.valueOf(f29413a), str, Integer.valueOf(i10));
        } catch (Exception e10) {
            g("asyncTraceEnd", e10);
        }
    }

    public static void f() {
        AbstractC2862b.b();
    }

    private static void g(String str, Exception exc) {
        if (exc instanceof InvocationTargetException) {
            Throwable cause = exc.getCause();
            if (!(cause instanceof RuntimeException)) {
                throw new RuntimeException(cause);
            }
            throw ((RuntimeException) cause);
        }
    }

    public static boolean h() {
        return Build.VERSION.SDK_INT >= 29 ? AbstractC2863c.c() : i();
    }

    private static boolean i() {
        try {
            if (f29414b == null) {
                f29413a = Trace.class.getField("TRACE_TAG_APP").getLong(null);
                f29414b = Trace.class.getMethod("isTagEnabled", Long.TYPE);
            }
            return ((Boolean) f29414b.invoke(null, Long.valueOf(f29413a))).booleanValue();
        } catch (Exception e10) {
            g("isTagEnabled", e10);
            return false;
        }
    }

    public static void j(String str, int i10) {
        if (Build.VERSION.SDK_INT >= 29) {
            AbstractC2863c.d(l(str), i10);
        } else {
            k(l(str), i10);
        }
    }

    private static void k(String str, int i10) {
        try {
            if (f29417e == null) {
                f29417e = Trace.class.getMethod("traceCounter", Long.TYPE, String.class, Integer.TYPE);
            }
            f29417e.invoke(null, Long.valueOf(f29413a), str, Integer.valueOf(i10));
        } catch (Exception e10) {
            g("traceCounter", e10);
        }
    }

    private static String l(String str) {
        return str.length() <= 127 ? str : str.substring(0, 127);
    }
}
