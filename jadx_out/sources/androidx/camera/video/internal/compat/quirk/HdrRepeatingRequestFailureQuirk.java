package androidx.camera.video.internal.compat.quirk;

import F.InterfaceC0471b1;
import android.os.Build;
import y.C3563H;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public class HdrRepeatingRequestFailureQuirk implements InterfaceC0471b1 {
    private static boolean g() {
        return "samsung".equalsIgnoreCase(Build.BRAND) && "pa3q".equalsIgnoreCase(Build.DEVICE);
    }

    static boolean h() {
        return g();
    }

    public boolean i(C3563H c3563h) {
        return g() && (c3563h != C3563H.f33650d);
    }
}
