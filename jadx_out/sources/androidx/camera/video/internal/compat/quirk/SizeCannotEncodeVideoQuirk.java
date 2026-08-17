package androidx.camera.video.internal.compat.quirk;

import F.InterfaceC0471b1;
import H.z;
import android.graphics.Rect;
import android.os.Build;
import android.util.Size;
import g0.s0;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public class SizeCannotEncodeVideoQuirk implements InterfaceC0471b1 {
    private static Set h() {
        return i() ? new HashSet(Collections.singletonList(new Size(720, 1280))) : Collections.EMPTY_SET;
    }

    private static boolean i() {
        return "motorola".equalsIgnoreCase(Build.BRAND) && "moto c".equalsIgnoreCase(Build.MODEL);
    }

    static boolean k() {
        return i();
    }

    public Rect g(Rect rect, int i10, s0 s0Var) {
        Size sizeP = z.p(z.m(rect), i10);
        if (!j(sizeP)) {
            return rect;
        }
        int iG = s0Var != null ? s0Var.g() / 2 : 8;
        Rect rect2 = new Rect(rect);
        if (rect.width() == sizeP.getHeight()) {
            rect2.left += iG;
            rect2.right -= iG;
            return rect2;
        }
        rect2.top += iG;
        rect2.bottom -= iG;
        return rect2;
    }

    public boolean j(Size size) {
        return h().contains(size);
    }
}
