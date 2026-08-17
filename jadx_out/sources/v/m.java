package v;

import F.g1;
import android.graphics.PointF;
import androidx.camera.camera2.internal.compat.quirk.AfRegionFlipHorizontallyQuirk;
import y.C3589k0;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final g1 f32748a;

    public m(g1 g1Var) {
        this.f32748a = g1Var;
    }

    public PointF a(C3589k0 c3589k0, int i10) {
        return (i10 == 1 && this.f32748a.a(AfRegionFlipHorizontallyQuirk.class)) ? new PointF(1.0f - c3589k0.c(), c3589k0.d()) : new PointF(c3589k0.c(), c3589k0.d());
    }
}
