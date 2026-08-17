package v;

import F.g1;
import androidx.camera.camera2.internal.compat.quirk.CaptureSessionStuckWhenCreatingBeforeClosingCameraQuirk;
import androidx.camera.camera2.internal.compat.quirk.LegacyCameraOutputConfigNullPointerQuirk;

/* JADX INFO: renamed from: v.c, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3412c {
    public static boolean a(g1 g1Var) {
        return g1Var.a(LegacyCameraOutputConfigNullPointerQuirk.class) || g1Var.a(CaptureSessionStuckWhenCreatingBeforeClosingCameraQuirk.class);
    }
}
