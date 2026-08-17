package androidx.camera.core.internal.compat.quirk;

import F.InterfaceC0471b1;
import android.os.Build;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public class LowMemoryQuirk implements InterfaceC0471b1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Set f15202a = new HashSet(Arrays.asList("SM-A520W", "MOTOG3"));

    static boolean g() {
        return f15202a.contains(Build.MODEL.toUpperCase(Locale.US));
    }
}
