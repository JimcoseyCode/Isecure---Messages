package r;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureFailure;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import android.view.Surface;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public final class Z1 extends CameraCaptureSession.CaptureCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final CaptureRequest f31198a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final CameraCaptureSession.CaptureCallback f31199b;

    public Z1(CaptureRequest forwardedRequest, CameraCaptureSession.CaptureCallback delegate) {
        AbstractC2855l.g(forwardedRequest, "forwardedRequest");
        AbstractC2855l.g(delegate, "delegate");
        this.f31198a = forwardedRequest;
        this.f31199b = delegate;
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public void onCaptureBufferLost(CameraCaptureSession session, CaptureRequest request, Surface target, long j10) {
        AbstractC2855l.g(session, "session");
        AbstractC2855l.g(request, "request");
        AbstractC2855l.g(target, "target");
        this.f31199b.onCaptureBufferLost(session, this.f31198a, target, j10);
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public void onCaptureCompleted(CameraCaptureSession session, CaptureRequest request, TotalCaptureResult result) {
        AbstractC2855l.g(session, "session");
        AbstractC2855l.g(request, "request");
        AbstractC2855l.g(result, "result");
        this.f31199b.onCaptureCompleted(session, this.f31198a, result);
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public void onCaptureFailed(CameraCaptureSession session, CaptureRequest request, CaptureFailure failure) {
        AbstractC2855l.g(session, "session");
        AbstractC2855l.g(request, "request");
        AbstractC2855l.g(failure, "failure");
        this.f31199b.onCaptureFailed(session, this.f31198a, failure);
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public void onCaptureProgressed(CameraCaptureSession session, CaptureRequest request, CaptureResult partialResult) {
        AbstractC2855l.g(session, "session");
        AbstractC2855l.g(request, "request");
        AbstractC2855l.g(partialResult, "partialResult");
        this.f31199b.onCaptureProgressed(session, this.f31198a, partialResult);
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public void onCaptureSequenceAborted(CameraCaptureSession session, int i10) {
        AbstractC2855l.g(session, "session");
        this.f31199b.onCaptureSequenceAborted(session, i10);
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public void onCaptureSequenceCompleted(CameraCaptureSession session, int i10, long j10) {
        AbstractC2855l.g(session, "session");
        this.f31199b.onCaptureSequenceCompleted(session, i10, j10);
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public void onCaptureStarted(CameraCaptureSession session, CaptureRequest request, long j10, long j11) {
        AbstractC2855l.g(session, "session");
        AbstractC2855l.g(request, "request");
        this.f31199b.onCaptureStarted(session, this.f31198a, j10, j11);
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public void onReadoutStarted(CameraCaptureSession session, CaptureRequest request, long j10, long j11) {
        AbstractC2855l.g(session, "session");
        AbstractC2855l.g(request, "request");
        this.f31199b.onReadoutStarted(session, this.f31198a, j10, j11);
    }
}
