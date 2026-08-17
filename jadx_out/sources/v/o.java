package v;

import F.g1;
import androidx.camera.camera2.internal.compat.quirk.AutoFlashUnderExposedQuirk;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f32752a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f32753b = false;

    public o(g1 g1Var) {
        this.f32752a = g1Var.b(AutoFlashUnderExposedQuirk.class) != null;
    }

    public void a() {
        this.f32753b = false;
    }

    public void b() {
        this.f32753b = true;
    }

    public boolean c(int i10) {
        return this.f32753b && i10 == 0 && this.f32752a;
    }
}
