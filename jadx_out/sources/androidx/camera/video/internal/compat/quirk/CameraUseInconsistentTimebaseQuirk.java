package androidx.camera.video.internal.compat.quirk;

import F.InterfaceC0471b1;
import android.os.Build;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public class CameraUseInconsistentTimebaseQuirk implements InterfaceC0471b1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Set f15297a = new HashSet(Arrays.asList("samsungexynos7570", "samsungexynos7870", "qcom"));

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Set f15298b = new HashSet(Arrays.asList("sm4350", "sm6375", "sm7325"));

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Set f15299c = new HashSet(Arrays.asList("m2007j20cg", "m2007j20ct"));

    private static boolean g() {
        return f15299c.contains(Build.MODEL.toLowerCase());
    }

    private static boolean h() {
        return "SAMSUNG".equalsIgnoreCase(Build.BRAND) && f15297a.contains(Build.HARDWARE.toLowerCase());
    }

    static boolean i() {
        return j() || h() || g();
    }

    private static boolean j() {
        return Build.VERSION.SDK_INT >= 31 && f15298b.contains(Build.SOC_MODEL.toLowerCase());
    }
}
