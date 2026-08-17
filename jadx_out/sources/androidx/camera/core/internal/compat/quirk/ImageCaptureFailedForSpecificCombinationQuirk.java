package androidx.camera.core.internal.compat.quirk;

import F.D1;
import F.E1;
import F.InterfaceC0471b1;
import android.os.Build;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import y.J0;
import y.V;
import y.p0;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public final class ImageCaptureFailedForSpecificCombinationQuirk implements InterfaceC0471b1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Set f15198a = new HashSet(Arrays.asList("pixel 4a", "pixel 4a (5g)", "pixel 5", "pixel 5a"));

    private static boolean g() {
        return "oneplus".equalsIgnoreCase(Build.BRAND) && "cph2583".equalsIgnoreCase(Build.MODEL);
    }

    private static boolean h() {
        return "google".equalsIgnoreCase(Build.BRAND) && f15198a.contains(Build.MODEL.toLowerCase());
    }

    private boolean i(Collection collection) {
        if (collection.size() != 3) {
            return false;
        }
        Iterator it = collection.iterator();
        boolean z10 = false;
        boolean z11 = false;
        boolean z12 = false;
        while (it.hasNext()) {
            J0 j02 = (J0) it.next();
            if (j02 instanceof p0) {
                z10 = true;
            } else if (j02 instanceof V) {
                z12 = true;
            } else if (j02.l().b(D1.f1303G)) {
                z11 = j02.l().G() == E1.b.VIDEO_CAPTURE;
            }
        }
        return z10 && z11 && z12;
    }

    static boolean j() {
        return g() || h();
    }

    private boolean l(String str, Collection collection) {
        return str.equals("1") && i(collection);
    }

    private boolean m(String str, Collection collection) {
        return str.equals("1") && i(collection);
    }

    public boolean k(String str, Collection collection) {
        if (g()) {
            return l(str, collection);
        }
        if (h()) {
            return m(str, collection);
        }
        return false;
    }
}
