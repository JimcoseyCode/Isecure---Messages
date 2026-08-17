package y;

import android.os.Build;
import android.util.Log;

/* JADX INFO: renamed from: y.h0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3583h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f33797a = 3;

    public static void a(String str, String str2) {
        g(k(str), 3);
    }

    public static void b(String str, String str2, Throwable th) {
        g(k(str), 3);
    }

    public static void c(String str, String str2) {
        g(k(str), 6);
    }

    public static void d(String str, String str2, Throwable th) {
        g(k(str), 6);
    }

    public static void e(String str, String str2) {
        g(k(str), 4);
    }

    public static boolean f(String str) {
        return g(k(str), 3);
    }

    private static boolean g(String str, int i10) {
        return f33797a <= i10 || Log.isLoggable(str, i10);
    }

    public static boolean h(String str) {
        return g(k(str), 2);
    }

    static void i() {
        f33797a = 3;
    }

    static void j(int i10) {
        f33797a = i10;
    }

    private static String k(String str) {
        return (Build.VERSION.SDK_INT > 25 || 23 >= str.length()) ? str : str.substring(0, 23);
    }

    public static void l(String str, String str2) {
        g(k(str), 5);
    }

    public static void m(String str, String str2, Throwable th) {
        g(k(str), 5);
    }
}
