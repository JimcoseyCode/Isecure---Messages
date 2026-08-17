package s;

import android.content.Context;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraDevice;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
class U extends T {
    U(Context context) {
        super(context);
    }

    @Override // s.T, s.W, s.S.b
    public CameraCharacteristics d(String str) throws C3294h {
        try {
            return this.f32021a.getCameraCharacteristics(str);
        } catch (CameraAccessException e10) {
            throw C3294h.e(e10);
        }
    }

    @Override // s.T, s.W, s.S.b
    public void g(String str, Executor executor, CameraDevice.StateCallback stateCallback) throws C3294h {
        try {
            this.f32021a.openCamera(str, executor, stateCallback);
        } catch (CameraAccessException e10) {
            throw C3294h.e(e10);
        }
    }
}
