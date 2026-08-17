package androidx.camera.core.internal.compat.quirk;

import F.C0474c1;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public abstract class b {
    static List a(C0474c1 c0474c1) {
        ArrayList arrayList = new ArrayList();
        if (c0474c1.a(ImageCaptureRotationOptionQuirk.class, ImageCaptureRotationOptionQuirk.l())) {
            arrayList.add(new ImageCaptureRotationOptionQuirk());
        }
        if (c0474c1.a(SurfaceOrderQuirk.class, SurfaceOrderQuirk.g())) {
            arrayList.add(new SurfaceOrderQuirk());
        }
        if (c0474c1.a(CaptureFailedRetryQuirk.class, CaptureFailedRetryQuirk.h())) {
            arrayList.add(new CaptureFailedRetryQuirk());
        }
        if (c0474c1.a(LowMemoryQuirk.class, LowMemoryQuirk.g())) {
            arrayList.add(new LowMemoryQuirk());
        }
        if (c0474c1.a(LargeJpegImageQuirk.class, LargeJpegImageQuirk.j())) {
            arrayList.add(new LargeJpegImageQuirk());
        }
        if (c0474c1.a(IncorrectJpegMetadataQuirk.class, IncorrectJpegMetadataQuirk.k())) {
            arrayList.add(new IncorrectJpegMetadataQuirk());
        }
        if (c0474c1.a(ImageCaptureFailedForSpecificCombinationQuirk.class, ImageCaptureFailedForSpecificCombinationQuirk.j())) {
            arrayList.add(new ImageCaptureFailedForSpecificCombinationQuirk());
        }
        if (c0474c1.a(PreviewGreenTintQuirk.class, PreviewGreenTintQuirk.h())) {
            arrayList.add(PreviewGreenTintQuirk.f15203a);
        }
        return arrayList;
    }
}
