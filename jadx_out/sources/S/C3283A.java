package s;

import android.hardware.camera2.CameraCharacteristics;
import s.E;

/* JADX INFO: renamed from: s.A, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
class C3283A implements E.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final CameraCharacteristics f31990a;

    C3283A(CameraCharacteristics cameraCharacteristics) {
        this.f31990a = cameraCharacteristics;
    }

    @Override // s.E.a
    public CameraCharacteristics a() {
        return this.f31990a;
    }

    @Override // s.E.a
    public Object b(CameraCharacteristics.Key key) {
        return this.f31990a.get(key);
    }
}
