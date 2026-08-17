package s;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.params.SessionConfiguration;
import t.C3356p;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
class M extends L {
    M(CameraDevice cameraDevice) {
        super((CameraDevice) H0.g.g(cameraDevice), null);
    }

    @Override // s.L, s.F.a
    public void a(C3356p c3356p) throws C3294h {
        SessionConfiguration sessionConfiguration = (SessionConfiguration) c3356p.j();
        H0.g.g(sessionConfiguration);
        try {
            this.f32007a.createCaptureSession(sessionConfiguration);
        } catch (CameraAccessException e10) {
            throw C3294h.e(e10);
        }
    }
}
