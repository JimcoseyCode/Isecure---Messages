package v;

import F.g1;
import androidx.camera.camera2.internal.compat.quirk.CrashWhenTakingPhotoWithAutoFlashAEModeQuirk;
import androidx.camera.camera2.internal.compat.quirk.ImageCaptureFailWithAutoFlashQuirk;

/* JADX INFO: renamed from: v.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public class C3410a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f32738a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f32739b;

    public C3410a(g1 g1Var) {
        this.f32738a = g1Var.a(ImageCaptureFailWithAutoFlashQuirk.class);
        this.f32739b = androidx.camera.camera2.internal.compat.quirk.b.b(CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.class) != null;
    }

    public int a(int i10) {
        if ((this.f32738a || this.f32739b) && i10 == 2) {
            return 1;
        }
        return i10;
    }
}
