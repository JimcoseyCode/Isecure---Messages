package androidx.camera.camera2.internal.compat.quirk;

import F.InterfaceC0471b1;
import android.os.Build;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public class ZslDisablerQuirk implements InterfaceC0471b1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final List f15131a = Arrays.asList("SM-F936", "SM-S901U", "SM-S908U", "SM-S908U1", "SM-F721U1", "SM-S928U1");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final List f15132b = Arrays.asList("MI 8");

    private static boolean g(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (Build.MODEL.toUpperCase(Locale.US).startsWith((String) it.next())) {
                return true;
            }
        }
        return false;
    }

    private static boolean h() {
        return "samsung".equalsIgnoreCase(Build.BRAND) && g(f15131a);
    }

    private static boolean i() {
        return "xiaomi".equalsIgnoreCase(Build.BRAND) && g(f15132b);
    }

    static boolean j() {
        return h() || i();
    }
}
