package X;

import X.e;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CameraManager;
import android.hardware.camera2.params.SessionConfiguration;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
class c implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final CameraDevice.CameraDeviceSetup f12214a;

    c(CameraManager cameraManager, String str) {
        this.f12214a = cameraManager.getCameraDeviceSetup(str);
    }

    public static long b() {
        String property = System.getProperty("ro.build.date.utc");
        if (property == null) {
            return 0L;
        }
        try {
            return Long.parseLong(property) * 1000;
        } catch (NumberFormatException unused) {
            return 0L;
        }
    }

    @Override // X.e
    public e.a a(SessionConfiguration sessionConfiguration) {
        return new e.a(this.f12214a.isSessionConfigurationSupported(sessionConfiguration) ? 1 : 2, 2, b());
    }
}
