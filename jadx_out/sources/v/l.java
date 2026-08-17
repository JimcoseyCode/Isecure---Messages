package v;

import F.r1;
import android.util.Size;
import androidx.camera.camera2.internal.compat.quirk.ExtraCroppingQuirk;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ExtraCroppingQuirk f32747a;

    public l() {
        this((ExtraCroppingQuirk) androidx.camera.camera2.internal.compat.quirk.b.b(ExtraCroppingQuirk.class));
    }

    public Size a(Size size) {
        Size sizeG;
        ExtraCroppingQuirk extraCroppingQuirk = this.f32747a;
        return (extraCroppingQuirk == null || (sizeG = extraCroppingQuirk.g(r1.d.f1676g)) == null || sizeG.getWidth() * sizeG.getHeight() <= size.getWidth() * size.getHeight()) ? size : sizeG;
    }

    l(ExtraCroppingQuirk extraCroppingQuirk) {
        this.f32747a = extraCroppingQuirk;
    }
}
