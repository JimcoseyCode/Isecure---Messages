package androidx.camera.camera2.internal.compat.quirk;

import F.InterfaceC0471b1;
import android.os.Build;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public class PreviewPixelHDRnetQuirk implements InterfaceC0471b1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final List f15124a = Arrays.asList("sunfish", "bramble", "redfin", "barbet");

    static boolean g() {
        return "Google".equals(Build.MANUFACTURER) && f15124a.contains(Build.DEVICE.toLowerCase(Locale.getDefault()));
    }
}
