package androidx.camera.camera2.internal.compat.quirk;

import F.InterfaceC0471b1;
import android.hardware.camera2.CameraCharacteristics;
import android.os.Build;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import r.C3232y;
import s.E;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public class TorchFlashRequiredFor3aUpdateQuirk implements InterfaceC0471b1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final List f15128b = Arrays.asList("PIXEL 6A", "PIXEL 6 PRO", "PIXEL 7", "PIXEL 7A", "PIXEL 7 PRO", "PIXEL 8", "PIXEL 8 PRO");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final E f15129a;

    public TorchFlashRequiredFor3aUpdateQuirk(E e10) {
        this.f15129a = e10;
    }

    private static boolean g(E e10) {
        return h() && k(e10);
    }

    private static boolean h() {
        Iterator it = f15128b.iterator();
        while (it.hasNext()) {
            if (Build.MODEL.toUpperCase(Locale.US).equals((String) it.next())) {
                return true;
            }
        }
        return false;
    }

    private static boolean i(E e10) {
        return Build.VERSION.SDK_INT >= 28 && C3232y.R(e10, 5) == 5;
    }

    private static boolean k(E e10) {
        return ((Integer) e10.a(CameraCharacteristics.LENS_FACING)).intValue() == 0;
    }

    static boolean l(E e10) {
        return g(e10);
    }

    public boolean j() {
        return !i(this.f15129a);
    }
}
