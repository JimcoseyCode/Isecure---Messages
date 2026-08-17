package androidx.camera.camera2.internal.compat.quirk;

import F.C0474c1;
import F.C0477d1;
import F.g1;
import java.util.ArrayList;
import s.E;
import y.AbstractC3583h0;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public abstract class a {
    public static g1 a(String str, E e10) {
        C0474c1 c0474c1A = C0477d1.b().a();
        ArrayList arrayList = new ArrayList();
        if (c0474c1A.a(AeFpsRangeLegacyQuirk.class, AeFpsRangeLegacyQuirk.h(e10))) {
            arrayList.add(new AeFpsRangeLegacyQuirk(e10));
        }
        if (c0474c1A.a(AspectRatioLegacyApi21Quirk.class, AspectRatioLegacyApi21Quirk.h(e10))) {
            arrayList.add(new AspectRatioLegacyApi21Quirk());
        }
        if (c0474c1A.a(JpegHalCorruptImageQuirk.class, JpegHalCorruptImageQuirk.g(e10))) {
            arrayList.add(new JpegHalCorruptImageQuirk());
        }
        if (c0474c1A.a(JpegCaptureDownsizingQuirk.class, JpegCaptureDownsizingQuirk.g(e10))) {
            arrayList.add(new JpegCaptureDownsizingQuirk());
        }
        if (c0474c1A.a(CamcorderProfileResolutionQuirk.class, CamcorderProfileResolutionQuirk.h(e10))) {
            arrayList.add(new CamcorderProfileResolutionQuirk(e10));
        }
        if (c0474c1A.a(CaptureNoResponseQuirk.class, CaptureNoResponseQuirk.g(e10))) {
            arrayList.add(new CaptureNoResponseQuirk());
        }
        if (c0474c1A.a(LegacyCameraOutputConfigNullPointerQuirk.class, LegacyCameraOutputConfigNullPointerQuirk.g(e10))) {
            arrayList.add(new LegacyCameraOutputConfigNullPointerQuirk());
        }
        if (c0474c1A.a(LegacyCameraSurfaceCleanupQuirk.class, LegacyCameraSurfaceCleanupQuirk.h(e10))) {
            arrayList.add(new LegacyCameraSurfaceCleanupQuirk());
        }
        if (c0474c1A.a(ImageCaptureWashedOutImageQuirk.class, ImageCaptureWashedOutImageQuirk.g(e10))) {
            arrayList.add(new ImageCaptureWashedOutImageQuirk());
        }
        if (c0474c1A.a(CameraNoResponseWhenEnablingFlashQuirk.class, CameraNoResponseWhenEnablingFlashQuirk.g(e10))) {
            arrayList.add(new CameraNoResponseWhenEnablingFlashQuirk());
        }
        if (c0474c1A.a(YuvImageOnePixelShiftQuirk.class, YuvImageOnePixelShiftQuirk.m(e10))) {
            arrayList.add(new YuvImageOnePixelShiftQuirk());
        }
        if (c0474c1A.a(FlashTooSlowQuirk.class, FlashTooSlowQuirk.h(e10))) {
            arrayList.add(new FlashTooSlowQuirk());
        }
        if (c0474c1A.a(AfRegionFlipHorizontallyQuirk.class, AfRegionFlipHorizontallyQuirk.g(e10))) {
            arrayList.add(new AfRegionFlipHorizontallyQuirk());
        }
        if (c0474c1A.a(ConfigureSurfaceToSecondarySessionFailQuirk.class, ConfigureSurfaceToSecondarySessionFailQuirk.g(e10))) {
            arrayList.add(new ConfigureSurfaceToSecondarySessionFailQuirk());
        }
        if (c0474c1A.a(PreviewOrientationIncorrectQuirk.class, PreviewOrientationIncorrectQuirk.g(e10))) {
            arrayList.add(new PreviewOrientationIncorrectQuirk());
        }
        if (c0474c1A.a(CaptureSessionStuckQuirk.class, CaptureSessionStuckQuirk.g(e10))) {
            arrayList.add(new CaptureSessionStuckQuirk());
        }
        if (c0474c1A.a(ImageCaptureFlashNotFireQuirk.class, ImageCaptureFlashNotFireQuirk.g(e10))) {
            arrayList.add(new ImageCaptureFlashNotFireQuirk());
        }
        if (c0474c1A.a(ImageCaptureWithFlashUnderexposureQuirk.class, ImageCaptureWithFlashUnderexposureQuirk.g(e10))) {
            arrayList.add(new ImageCaptureWithFlashUnderexposureQuirk());
        }
        if (c0474c1A.a(ImageCaptureFailWithAutoFlashQuirk.class, ImageCaptureFailWithAutoFlashQuirk.g(e10))) {
            arrayList.add(new ImageCaptureFailWithAutoFlashQuirk());
        }
        if (c0474c1A.a(IncorrectCaptureStateQuirk.class, IncorrectCaptureStateQuirk.g(e10))) {
            arrayList.add(new IncorrectCaptureStateQuirk());
        }
        if (c0474c1A.a(TorchFlashRequiredFor3aUpdateQuirk.class, TorchFlashRequiredFor3aUpdateQuirk.l(e10))) {
            arrayList.add(new TorchFlashRequiredFor3aUpdateQuirk(e10));
        }
        if (c0474c1A.a(PreviewStretchWhenVideoCaptureIsBoundQuirk.class, PreviewStretchWhenVideoCaptureIsBoundQuirk.m())) {
            arrayList.add(new PreviewStretchWhenVideoCaptureIsBoundQuirk());
        }
        if (c0474c1A.a(PreviewDelayWhenVideoCaptureIsBoundQuirk.class, PreviewDelayWhenVideoCaptureIsBoundQuirk.g())) {
            arrayList.add(new PreviewDelayWhenVideoCaptureIsBoundQuirk());
        }
        if (c0474c1A.a(ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.class, ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.n())) {
            arrayList.add(new ImageCaptureFailedWhenVideoCaptureIsBoundQuirk());
        }
        if (c0474c1A.a(TemporalNoiseQuirk.class, TemporalNoiseQuirk.h(e10))) {
            arrayList.add(new TemporalNoiseQuirk());
        }
        if (c0474c1A.a(ImageCaptureFailedForVideoSnapshotQuirk.class, ImageCaptureFailedForVideoSnapshotQuirk.i())) {
            arrayList.add(new ImageCaptureFailedForVideoSnapshotQuirk());
        }
        if (c0474c1A.a(CaptureSessionStuckWhenCreatingBeforeClosingCameraQuirk.class, CaptureSessionStuckWhenCreatingBeforeClosingCameraQuirk.g(e10))) {
            arrayList.add(new CaptureSessionStuckWhenCreatingBeforeClosingCameraQuirk());
        }
        if (c0474c1A.a(AbnormalStreamWhenImageAnalysisBindWithTemplateRecordQuirk.class, AbnormalStreamWhenImageAnalysisBindWithTemplateRecordQuirk.h())) {
            arrayList.add(new AbnormalStreamWhenImageAnalysisBindWithTemplateRecordQuirk());
        }
        g1 g1Var = new g1(arrayList);
        AbstractC3583h0.a("CameraQuirks", "camera2 CameraQuirks = " + g1.d(g1Var));
        return g1Var;
    }
}
