package androidx.camera.camera2.internal.compat.quirk;

import F.C0474c1;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public abstract class c {
    static List a(C0474c1 c0474c1) {
        ArrayList arrayList = new ArrayList();
        if (c0474c1.a(ImageCapturePixelHDRPlusQuirk.class, ImageCapturePixelHDRPlusQuirk.g())) {
            arrayList.add(new ImageCapturePixelHDRPlusQuirk());
        }
        if (c0474c1.a(ExtraCroppingQuirk.class, ExtraCroppingQuirk.i())) {
            arrayList.add(new ExtraCroppingQuirk());
        }
        if (c0474c1.a(Nexus4AndroidLTargetAspectRatioQuirk.class, Nexus4AndroidLTargetAspectRatioQuirk.h())) {
            arrayList.add(new Nexus4AndroidLTargetAspectRatioQuirk());
        }
        if (c0474c1.a(ExcludedSupportedSizesQuirk.class, ExcludedSupportedSizesQuirk.x())) {
            arrayList.add(new ExcludedSupportedSizesQuirk());
        }
        if (c0474c1.a(CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.class, CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.g())) {
            arrayList.add(new CrashWhenTakingPhotoWithAutoFlashAEModeQuirk());
        }
        if (c0474c1.a(PreviewPixelHDRnetQuirk.class, PreviewPixelHDRnetQuirk.g())) {
            arrayList.add(new PreviewPixelHDRnetQuirk());
        }
        if (c0474c1.a(StillCaptureFlashStopRepeatingQuirk.class, StillCaptureFlashStopRepeatingQuirk.g())) {
            arrayList.add(new StillCaptureFlashStopRepeatingQuirk());
        }
        if (c0474c1.a(ExtraSupportedSurfaceCombinationsQuirk.class, ExtraSupportedSurfaceCombinationsQuirk.l())) {
            arrayList.add(new ExtraSupportedSurfaceCombinationsQuirk());
        }
        if (c0474c1.a(FlashAvailabilityBufferUnderflowQuirk.class, FlashAvailabilityBufferUnderflowQuirk.h())) {
            arrayList.add(new FlashAvailabilityBufferUnderflowQuirk());
        }
        if (c0474c1.a(RepeatingStreamConstraintForVideoRecordingQuirk.class, RepeatingStreamConstraintForVideoRecordingQuirk.h())) {
            arrayList.add(new RepeatingStreamConstraintForVideoRecordingQuirk());
        }
        if (c0474c1.a(TextureViewIsClosedQuirk.class, TextureViewIsClosedQuirk.g())) {
            arrayList.add(new TextureViewIsClosedQuirk());
        }
        if (c0474c1.a(CaptureSessionOnClosedNotCalledQuirk.class, CaptureSessionOnClosedNotCalledQuirk.g())) {
            arrayList.add(new CaptureSessionOnClosedNotCalledQuirk());
        }
        if (c0474c1.a(TorchIsClosedAfterImageCapturingQuirk.class, TorchIsClosedAfterImageCapturingQuirk.g())) {
            arrayList.add(new TorchIsClosedAfterImageCapturingQuirk());
        }
        if (c0474c1.a(ZslDisablerQuirk.class, ZslDisablerQuirk.j())) {
            arrayList.add(new ZslDisablerQuirk());
        }
        if (c0474c1.a(ExtraSupportedOutputSizeQuirk.class, ExtraSupportedOutputSizeQuirk.j())) {
            arrayList.add(new ExtraSupportedOutputSizeQuirk());
        }
        if (c0474c1.a(InvalidVideoProfilesQuirk.class, InvalidVideoProfilesQuirk.t())) {
            arrayList.add(new InvalidVideoProfilesQuirk());
        }
        if (c0474c1.a(Preview3AThreadCrashQuirk.class, Preview3AThreadCrashQuirk.g())) {
            arrayList.add(new Preview3AThreadCrashQuirk());
        }
        if (c0474c1.a(SmallDisplaySizeQuirk.class, SmallDisplaySizeQuirk.h())) {
            arrayList.add(new SmallDisplaySizeQuirk());
        }
        if (c0474c1.a(PreviewUnderExposureQuirk.class, PreviewUnderExposureQuirk.g())) {
            arrayList.add(PreviewUnderExposureQuirk.f15125a);
        }
        if (c0474c1.a(CaptureSessionShouldUseMrirQuirk.class, CaptureSessionShouldUseMrirQuirk.g())) {
            arrayList.add(new CaptureSessionShouldUseMrirQuirk());
        }
        return arrayList;
    }
}
