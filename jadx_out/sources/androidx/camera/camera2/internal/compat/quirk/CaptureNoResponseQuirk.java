package androidx.camera.camera2.internal.compat.quirk;

import F.InterfaceC0471b1;
import android.hardware.camera2.CameraCharacteristics;
import android.os.Build;
import s.E;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public class CaptureNoResponseQuirk implements InterfaceC0471b1 {
    static boolean g(E e10) {
        String str = Build.HARDWARE;
        return ("samsungexynos7420".equalsIgnoreCase(str) || "universal7420".equalsIgnoreCase(str)) && ((Integer) e10.a(CameraCharacteristics.LENS_FACING)).intValue() == 1;
    }
}
