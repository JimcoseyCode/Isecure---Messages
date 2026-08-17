package s;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureRequest;
import java.util.List;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: s.x, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
class C3309x extends C3310y {
    C3309x(CameraCaptureSession cameraCaptureSession) {
        super(cameraCaptureSession, null);
    }

    @Override // s.C3310y, s.C3295i.a
    public int b(CaptureRequest captureRequest, Executor executor, CameraCaptureSession.CaptureCallback captureCallback) {
        return this.f32084a.setSingleRepeatingRequest(captureRequest, executor, captureCallback);
    }

    @Override // s.C3310y, s.C3295i.a
    public int c(List list, Executor executor, CameraCaptureSession.CaptureCallback captureCallback) {
        return this.f32084a.captureBurstRequests(list, executor, captureCallback);
    }

    @Override // s.C3310y, s.C3295i.a
    public int d(List list, Executor executor, CameraCaptureSession.CaptureCallback captureCallback) {
        return this.f32084a.setRepeatingBurstRequests(list, executor, captureCallback);
    }
}
