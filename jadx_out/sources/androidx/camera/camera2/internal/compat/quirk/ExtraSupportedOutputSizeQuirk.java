package androidx.camera.camera2.internal.compat.quirk;

import F.InterfaceC0471b1;
import android.os.Build;
import android.util.Size;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public class ExtraSupportedOutputSizeQuirk implements InterfaceC0471b1 {
    private Size[] h() {
        return new Size[]{new Size(1440, 1080), new Size(960, 720)};
    }

    private static boolean i() {
        return "motorola".equalsIgnoreCase(Build.BRAND) && "moto e5 play".equalsIgnoreCase(Build.MODEL);
    }

    static boolean j() {
        return i();
    }

    public Size[] g(int i10) {
        return (i10 == 34 && i()) ? h() : new Size[0];
    }
}
