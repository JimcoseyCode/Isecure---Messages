package s;

import android.content.Context;
import android.hardware.camera2.CameraAccessException;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
class V extends U {
    V(Context context) {
        super(context);
    }

    @Override // s.W, s.S.b
    public Set f() throws C3294h {
        try {
            return this.f32021a.getConcurrentCameraIds();
        } catch (CameraAccessException e10) {
            throw C3294h.e(e10);
        }
    }
}
