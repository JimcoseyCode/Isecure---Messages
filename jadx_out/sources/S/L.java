package s;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.params.InputConfiguration;
import android.os.Handler;
import java.util.List;
import s.C3295i;
import s.N;
import t.C3349i;
import t.C3356p;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
class L extends K {
    L(CameraDevice cameraDevice, Object obj) {
        super(cameraDevice, obj);
    }

    static L e(CameraDevice cameraDevice, Handler handler) {
        return new L(cameraDevice, new N.a(handler));
    }

    @Override // s.F.a
    public void a(C3356p c3356p) throws C3294h {
        N.c(this.f32007a, c3356p);
        C3295i.c cVar = new C3295i.c(c3356p.a(), c3356p.e());
        List listC = c3356p.c();
        Handler handler = ((N.a) H0.g.g((N.a) this.f32008b)).f32009a;
        C3349i c3349iB = c3356p.b();
        try {
            if (c3349iB != null) {
                InputConfiguration inputConfiguration = (InputConfiguration) c3349iB.a();
                H0.g.g(inputConfiguration);
                this.f32007a.createReprocessableCaptureSessionByConfigurations(inputConfiguration, C3356p.h(listC), cVar, handler);
            } else if (c3356p.d() == 1) {
                this.f32007a.createConstrainedHighSpeedCaptureSession(N.d(listC), cVar, handler);
            } else {
                this.f32007a.createCaptureSessionByOutputConfigurations(C3356p.h(listC), cVar, handler);
            }
        } catch (CameraAccessException e10) {
            throw C3294h.e(e10);
        }
    }
}
