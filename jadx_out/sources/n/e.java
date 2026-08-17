package N;

import androidx.camera.core.internal.compat.quirk.ImageCaptureFailedForSpecificCombinationQuirk;
import androidx.camera.core.internal.compat.quirk.PreviewGreenTintQuirk;
import java.util.Collection;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ImageCaptureFailedForSpecificCombinationQuirk f7688a = (ImageCaptureFailedForSpecificCombinationQuirk) androidx.camera.core.internal.compat.quirk.a.b(ImageCaptureFailedForSpecificCombinationQuirk.class);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final PreviewGreenTintQuirk f7689b = (PreviewGreenTintQuirk) androidx.camera.core.internal.compat.quirk.a.b(PreviewGreenTintQuirk.class);

    public boolean a(String str, Collection collection) {
        ImageCaptureFailedForSpecificCombinationQuirk imageCaptureFailedForSpecificCombinationQuirk = this.f7688a;
        if (imageCaptureFailedForSpecificCombinationQuirk != null) {
            return imageCaptureFailedForSpecificCombinationQuirk.k(str, collection);
        }
        if (this.f7689b != null) {
            return PreviewGreenTintQuirk.i(str, collection);
        }
        return false;
    }
}
