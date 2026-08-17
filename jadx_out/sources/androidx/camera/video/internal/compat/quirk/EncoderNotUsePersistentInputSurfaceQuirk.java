package androidx.camera.video.internal.compat.quirk;

import F.InterfaceC0471b1;
import android.os.Build;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public class EncoderNotUsePersistentInputSurfaceQuirk implements InterfaceC0471b1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final List f15300a = Arrays.asList("SM-N9208", "SM-G920V");

    static boolean g() {
        return f15300a.contains(Build.MODEL.toUpperCase());
    }
}
