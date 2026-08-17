package y4;

import android.content.Context;
import android.content.pm.PackageManager;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public abstract class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static Boolean f33933a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static Boolean f33934b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static Boolean f33935c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static Boolean f33936d;

    public static boolean a(Context context) {
        PackageManager packageManager = context.getPackageManager();
        if (f33936d == null) {
            boolean z10 = false;
            if (l.g() && packageManager.hasSystemFeature("android.hardware.type.automotive")) {
                z10 = true;
            }
            f33936d = Boolean.valueOf(z10);
        }
        return f33936d.booleanValue();
    }

    public static boolean b(Context context) {
        return f(context.getPackageManager());
    }

    public static boolean c(Context context) {
        if (b(context) && !l.f()) {
            return true;
        }
        if (d(context)) {
            return !l.g() || l.j();
        }
        return false;
    }

    public static boolean d(Context context) {
        if (f33934b == null) {
            boolean z10 = false;
            if (l.e() && context.getPackageManager().hasSystemFeature("cn.google")) {
                z10 = true;
            }
            f33934b = Boolean.valueOf(z10);
        }
        return f33934b.booleanValue();
    }

    public static boolean e(Context context) {
        if (f33935c == null) {
            boolean z10 = true;
            if (!context.getPackageManager().hasSystemFeature("android.hardware.type.iot") && !context.getPackageManager().hasSystemFeature("android.hardware.type.embedded")) {
                z10 = false;
            }
            f33935c = Boolean.valueOf(z10);
        }
        return f33935c.booleanValue();
    }

    public static boolean f(PackageManager packageManager) {
        if (f33933a == null) {
            boolean z10 = false;
            if (l.d() && packageManager.hasSystemFeature("android.hardware.type.watch")) {
                z10 = true;
            }
            f33933a = Boolean.valueOf(z10);
        }
        return f33933a.booleanValue();
    }
}
