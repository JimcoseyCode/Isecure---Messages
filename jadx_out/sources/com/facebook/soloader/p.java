package com.facebook.soloader;

import android.os.Build;
import android.util.Log;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public abstract class p {
    public static void a(String str, String str2) {
        e(str, 3);
    }

    public static void d(String str, String str2) {
        e(str, 4);
    }

    private static boolean e(String str, int i10) {
        return (Build.VERSION.SDK_INT > 25 || str.length() <= 23) ? Log.isLoggable(str, i10) : Log.isLoggable(str.substring(0, 23), i10);
    }

    public static void f(String str, String str2) {
        e(str, 2);
    }

    public static void b(String str, String str2) {
    }

    public static void g(String str, String str2) {
    }

    public static void c(String str, String str2, Throwable th) {
    }

    public static void h(String str, String str2, Throwable th) {
    }
}
