package s;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureRequest;
import android.os.Handler;
import java.util.List;
import java.util.concurrent.Executor;
import s.C3295i;

/* JADX INFO: renamed from: s.y, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
class C3310y implements C3295i.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final CameraCaptureSession f32084a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final Object f32085b;

    /* JADX INFO: renamed from: s.y$a */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    private static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Handler f32086a;

        a(Handler handler) {
            this.f32086a = handler;
        }
    }

    C3310y(CameraCaptureSession cameraCaptureSession, Object obj) {
        this.f32084a = (CameraCaptureSession) H0.g.g(cameraCaptureSession);
        this.f32085b = obj;
    }

    static C3295i.a e(CameraCaptureSession cameraCaptureSession, Handler handler) {
        return new C3310y(cameraCaptureSession, new a(handler));
    }

    @Override // s.C3295i.a
    public CameraCaptureSession a() {
        return this.f32084a;
    }

    @Override // s.C3295i.a
    public int b(CaptureRequest captureRequest, Executor executor, CameraCaptureSession.CaptureCallback captureCallback) {
        return this.f32084a.setRepeatingRequest(captureRequest, new C3295i.b(executor, captureCallback), ((a) this.f32085b).f32086a);
    }

    @Override // s.C3295i.a
    public int c(List list, Executor executor, CameraCaptureSession.CaptureCallback captureCallback) {
        return this.f32084a.captureBurst(list, new C3295i.b(executor, captureCallback), ((a) this.f32085b).f32086a);
    }

    @Override // s.C3295i.a
    public int d(List list, Executor executor, CameraCaptureSession.CaptureCallback captureCallback) {
        return this.f32084a.setRepeatingBurst(list, new C3295i.b(executor, captureCallback), ((a) this.f32085b).f32086a);
    }
}
