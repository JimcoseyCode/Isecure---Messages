package androidx.camera.video.internal.compat.quirk;

import F.C0474c1;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public abstract class b {
    static List a(C0474c1 c0474c1) {
        ArrayList arrayList = new ArrayList();
        if (c0474c1.a(MediaFormatMustNotUseFrameRateToFindEncoderQuirk.class, MediaFormatMustNotUseFrameRateToFindEncoderQuirk.g())) {
            arrayList.add(new MediaFormatMustNotUseFrameRateToFindEncoderQuirk());
        }
        if (c0474c1.a(MediaCodecInfoReportIncorrectInfoQuirk.class, MediaCodecInfoReportIncorrectInfoQuirk.p())) {
            arrayList.add(new MediaCodecInfoReportIncorrectInfoQuirk());
        }
        if (c0474c1.a(DeactivateEncoderSurfaceBeforeStopEncoderQuirk.class, DeactivateEncoderSurfaceBeforeStopEncoderQuirk.g())) {
            arrayList.add(new DeactivateEncoderSurfaceBeforeStopEncoderQuirk());
        }
        if (c0474c1.a(CameraUseInconsistentTimebaseQuirk.class, CameraUseInconsistentTimebaseQuirk.i())) {
            arrayList.add(new CameraUseInconsistentTimebaseQuirk());
        }
        if (c0474c1.a(ReportedVideoQualityNotSupportedQuirk.class, ReportedVideoQualityNotSupportedQuirk.l())) {
            arrayList.add(new ReportedVideoQualityNotSupportedQuirk());
        }
        if (c0474c1.a(EncoderNotUsePersistentInputSurfaceQuirk.class, EncoderNotUsePersistentInputSurfaceQuirk.g())) {
            arrayList.add(new EncoderNotUsePersistentInputSurfaceQuirk());
        }
        if (c0474c1.a(VideoEncoderCrashQuirk.class, VideoEncoderCrashQuirk.h())) {
            arrayList.add(new VideoEncoderCrashQuirk());
        }
        if (c0474c1.a(ExcludeStretchedVideoQualityQuirk.class, ExcludeStretchedVideoQualityQuirk.n())) {
            arrayList.add(new ExcludeStretchedVideoQualityQuirk());
        }
        if (c0474c1.a(MediaStoreVideoCannotWrite.class, MediaStoreVideoCannotWrite.i())) {
            arrayList.add(new MediaStoreVideoCannotWrite());
        }
        if (c0474c1.a(AudioEncoderIgnoresInputTimestampQuirk.class, AudioEncoderIgnoresInputTimestampQuirk.h())) {
            arrayList.add(new AudioEncoderIgnoresInputTimestampQuirk());
        }
        if (c0474c1.a(VideoEncoderSuspendDoesNotIncludeSuspendTimeQuirk.class, VideoEncoderSuspendDoesNotIncludeSuspendTimeQuirk.g())) {
            arrayList.add(new VideoEncoderSuspendDoesNotIncludeSuspendTimeQuirk());
        }
        if (c0474c1.a(NegativeLatLongSavesIncorrectlyQuirk.class, NegativeLatLongSavesIncorrectlyQuirk.g())) {
            arrayList.add(new NegativeLatLongSavesIncorrectlyQuirk());
        }
        if (c0474c1.a(AudioTimestampFramePositionIncorrectQuirk.class, AudioTimestampFramePositionIncorrectQuirk.n())) {
            arrayList.add(new AudioTimestampFramePositionIncorrectQuirk());
        }
        if (c0474c1.a(ExtraSupportedResolutionQuirk.class, ExtraSupportedResolutionQuirk.h())) {
            arrayList.add(new ExtraSupportedResolutionQuirk());
        }
        if (c0474c1.a(StretchedVideoResolutionQuirk.class, StretchedVideoResolutionQuirk.i())) {
            arrayList.add(new StretchedVideoResolutionQuirk());
        }
        if (c0474c1.a(CodecStuckOnFlushQuirk.class, CodecStuckOnFlushQuirk.i())) {
            arrayList.add(new CodecStuckOnFlushQuirk());
        }
        if (c0474c1.a(StopCodecAfterSurfaceRemovalCrashMediaServerQuirk.class, StopCodecAfterSurfaceRemovalCrashMediaServerQuirk.h())) {
            arrayList.add(new StopCodecAfterSurfaceRemovalCrashMediaServerQuirk());
        }
        if (c0474c1.a(ExtraSupportedQualityQuirk.class, ExtraSupportedQualityQuirk.k())) {
            arrayList.add(new ExtraSupportedQualityQuirk());
        }
        if (c0474c1.a(SignalEosOutputBufferNotComeQuirk.class, SignalEosOutputBufferNotComeQuirk.h())) {
            arrayList.add(new SignalEosOutputBufferNotComeQuirk());
        }
        if (c0474c1.a(SizeCannotEncodeVideoQuirk.class, SizeCannotEncodeVideoQuirk.k())) {
            arrayList.add(new SizeCannotEncodeVideoQuirk());
        }
        if (c0474c1.a(PreviewBlackScreenQuirk.class, PreviewBlackScreenQuirk.i())) {
            arrayList.add(new PreviewBlackScreenQuirk());
        }
        if (c0474c1.a(PrematureEndOfStreamVideoQuirk.class, PrematureEndOfStreamVideoQuirk.g())) {
            arrayList.add(PrematureEndOfStreamVideoQuirk.f15302a);
        }
        if (c0474c1.a(MediaCodecDefaultDataSpaceQuirk.class, MediaCodecDefaultDataSpaceQuirk.h())) {
            arrayList.add(new MediaCodecDefaultDataSpaceQuirk());
        }
        if (c0474c1.a(HdrRepeatingRequestFailureQuirk.class, HdrRepeatingRequestFailureQuirk.h())) {
            arrayList.add(new HdrRepeatingRequestFailureQuirk());
        }
        if (c0474c1.a(PreviewFreezeAfterHighSpeedRecordingQuirk.class, PreviewFreezeAfterHighSpeedRecordingQuirk.g())) {
            arrayList.add(PreviewFreezeAfterHighSpeedRecordingQuirk.f15307a);
        }
        return arrayList;
    }
}
