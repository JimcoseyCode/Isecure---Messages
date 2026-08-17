package androidx.camera.camera2.internal.compat.quirk;

import android.hardware.camera2.CameraCharacteristics;
import android.os.Build;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import s.E;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public class ImageCaptureFlashNotFireQuirk implements UseTorchAsFlashQuirk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final List f15113a = Arrays.asList("itel w6004");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final List f15114b = Arrays.asList("sm-j700f", "sm-j710f");

    static boolean g(E e10) {
        List list = f15114b;
        String str = Build.MODEL;
        Locale locale = Locale.US;
        return (list.contains(str.toLowerCase(locale)) && ((Integer) e10.a(CameraCharacteristics.LENS_FACING)).intValue() == 0) || f15113a.contains(str.toLowerCase(locale));
    }
}
