package androidx.camera.extensions.internal.compat.quirk;

import F.InterfaceC0471b1;
import android.os.Build;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public class ExtensionDisabledQuirk implements InterfaceC0471b1 {
    private static boolean g() {
        return "motorola".equalsIgnoreCase(Build.BRAND);
    }

    private static boolean h() {
        return "google".equalsIgnoreCase(Build.BRAND) && "redfin".equalsIgnoreCase(Build.DEVICE);
    }

    private static boolean i() {
        return "realme".equalsIgnoreCase(Build.BRAND);
    }

    private static boolean j() {
        return "samsung".equalsIgnoreCase(Build.BRAND) && "a52sxq".equalsIgnoreCase(Build.DEVICE);
    }

    static boolean k() {
        return h() || g() || i() || j();
    }
}
