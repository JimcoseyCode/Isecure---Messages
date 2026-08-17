package androidx.camera.camera2.internal.compat.quirk;

import F.InterfaceC0471b1;
import android.os.Build;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public class InvalidVideoProfilesQuirk implements InterfaceC0471b1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final List f15118a = Arrays.asList("pixel 4", "pixel 4a", "pixel 4a (5g)", "pixel 4 xl", "pixel 5", "pixel 5a", "pixel 6", "pixel 6a", "pixel 6 pro", "pixel 7", "pixel 7 pro");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final List f15119b = Arrays.asList("cph2417", "cph2451");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final List f15120c = Arrays.asList("cph2437", "cph2525", "pht110");

    private static boolean g() {
        return Build.VERSION.SDK_INT == 33;
    }

    private static boolean h() {
        return i() && g();
    }

    private static boolean i() {
        return f15119b.contains(Build.MODEL.toLowerCase(Locale.ROOT));
    }

    private static boolean j() {
        return k() && g();
    }

    private static boolean k() {
        return f15120c.contains(Build.MODEL.toLowerCase(Locale.ROOT));
    }

    private static boolean l() {
        return s() || q();
    }

    private static boolean m() {
        return n() && l();
    }

    private static boolean n() {
        return f15118a.contains(Build.MODEL.toLowerCase(Locale.ROOT));
    }

    private static boolean o() {
        return "samsung".equalsIgnoreCase(Build.BRAND) && s();
    }

    private static boolean p() {
        String str = Build.BRAND;
        if ("redmi".equalsIgnoreCase(str) || "xiaomi".equalsIgnoreCase(str)) {
            return r() || s();
        }
        return false;
    }

    private static boolean q() {
        return Build.ID.toLowerCase(Locale.ROOT).startsWith("td1a");
    }

    private static boolean r() {
        return Build.ID.toLowerCase(Locale.ROOT).startsWith("tkq1");
    }

    private static boolean s() {
        return Build.ID.toLowerCase(Locale.ROOT).startsWith("tp1a");
    }

    static boolean t() {
        return o() || m() || p() || h() || j();
    }
}
