package androidx.camera.camera2.internal.compat.quirk;

import F.InterfaceC0471b1;
import F.g1;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public interface CaptureIntentPreviewQuirk extends InterfaceC0471b1 {
    static boolean e(g1 g1Var) {
        Iterator it = g1Var.c(CaptureIntentPreviewQuirk.class).iterator();
        while (it.hasNext()) {
            if (((CaptureIntentPreviewQuirk) it.next()).c()) {
                return true;
            }
        }
        return false;
    }

    default boolean c() {
        return true;
    }
}
