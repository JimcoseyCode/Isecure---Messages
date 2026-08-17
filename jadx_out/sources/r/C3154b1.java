package r;

import android.hardware.camera2.CameraCaptureSession;

/* JADX INFO: renamed from: r.b1, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
final class C3154b1 extends F.r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final CameraCaptureSession.CaptureCallback f31217a;

    private C3154b1(CameraCaptureSession.CaptureCallback captureCallback) {
        if (captureCallback == null) {
            throw new NullPointerException("captureCallback is null");
        }
        this.f31217a = captureCallback;
    }

    static C3154b1 e(CameraCaptureSession.CaptureCallback captureCallback) {
        return new C3154b1(captureCallback);
    }

    CameraCaptureSession.CaptureCallback f() {
        return this.f31217a;
    }
}
