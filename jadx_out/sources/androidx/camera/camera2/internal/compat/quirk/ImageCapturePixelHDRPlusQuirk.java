package androidx.camera.camera2.internal.compat.quirk;

import F.InterfaceC0471b1;
import android.os.Build;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public class ImageCapturePixelHDRPlusQuirk implements InterfaceC0471b1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final List f15115a = Arrays.asList("Pixel 2", "Pixel 2 XL", "Pixel 3", "Pixel 3 XL");

    static boolean g() {
        return f15115a.contains(Build.MODEL) && "Google".equals(Build.MANUFACTURER) && Build.VERSION.SDK_INT >= 26;
    }
}
