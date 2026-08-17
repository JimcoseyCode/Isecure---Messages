package v;

import F.AbstractC0504q0;
import F.g1;
import androidx.camera.camera2.internal.compat.quirk.ConfigureSurfaceToSecondarySessionFailQuirk;
import androidx.camera.camera2.internal.compat.quirk.PreviewOrientationIncorrectQuirk;
import androidx.camera.camera2.internal.compat.quirk.TextureViewIsClosedQuirk;
import java.util.Iterator;
import java.util.List;
import y.AbstractC3583h0;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f32744a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f32745b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f32746c;

    public i(g1 g1Var, g1 g1Var2) {
        this.f32744a = g1Var2.a(TextureViewIsClosedQuirk.class);
        this.f32745b = g1Var.a(PreviewOrientationIncorrectQuirk.class);
        this.f32746c = g1Var.a(ConfigureSurfaceToSecondarySessionFailQuirk.class);
    }

    public void a(List list) {
        if (!b() || list == null) {
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((AbstractC0504q0) it.next()).d();
        }
        AbstractC3583h0.a("ForceCloseDeferrableSurface", "deferrableSurface closed");
    }

    public boolean b() {
        return this.f32744a || this.f32745b || this.f32746c;
    }
}
