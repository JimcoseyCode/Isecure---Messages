package androidx.camera.camera2.internal.compat.quirk;

import android.hardware.camera2.CameraCharacteristics;
import android.os.Build;
import s.E;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public class TemporalNoiseQuirk implements CaptureIntentPreviewQuirk {
    private static boolean g() {
        return "Pixel 8".equalsIgnoreCase(Build.MODEL);
    }

    static boolean h(E e10) {
        return g() && ((Integer) e10.a(CameraCharacteristics.LENS_FACING)).intValue() == 0;
    }
}
